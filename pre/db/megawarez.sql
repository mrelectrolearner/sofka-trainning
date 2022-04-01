
-- -----------------------------------------------------
-- Schema megaWarez_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS  megaWarez_db DEFAULT CHARACTER SET utf8 ;
USE   megaWarez_db;

-- -----------------------------------------------------
-- Table user
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS user (
  user_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(80) NOT NULL,
  user_password VARCHAR(32) COMMENT 'Hash con md5',
  user_created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  user_updated_at DATETIME NULL,
  PRIMARY KEY (user_id),
  UNIQUE INDEX user_name_UNIQUE (user_name ASC) VISIBLE,
  INDEX user_user_name_user_password_Idx (user_name ASC, user_password ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table session
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS session (
  ses_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  ses_user_id INT UNSIGNED NOT NULL,
  ses_token VARCHAR(32) NOT NULL,
  ses_created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (ses_id, ses_user_id),
  INDEX fk_session_user_idx (ses_user_id ASC) VISIBLE,
  CONSTRAINT fk_session_user
    FOREIGN KEY (ses_user_id)
    REFERENCES user (user_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table category
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS category (
  cat_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  cat_name VARCHAR(80) NOT NULL,
  cat_created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (cat_id),
  UNIQUE INDEX category_cat_nombre_Idx (cat_name ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table subcategory
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS subcategory (
  scat_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  scat_category_id INT UNSIGNED NOT NULL,
  scat_name VARCHAR(80) NOT NULL,
  category_cat_id DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (scat_id, scat_category_id),
  INDEX fk_subcategory_category1_idx (scat_category_id ASC) VISIBLE,
  UNIQUE INDEX subcategory_scat_name_scat_category_id_Idx (scat_name ASC, scat_category_id ASC) VISIBLE,
  CONSTRAINT fk_subcategory_category1
    FOREIGN KEY (scat_category_id)
    REFERENCES category (cat_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table item
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS item (
  itm_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  itm_subcategory_id INT UNSIGNED NOT NULL,
  itm_name VARCHAR(45) NOT NULL,
  itm_created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (itm_id, itm_subcategory_id),
  INDEX fk_item_subcategory1_idx (itm_subcategory_id ASC) VISIBLE,
  UNIQUE INDEX itm_name_UNIQUE (itm_name ASC) VISIBLE,
  CONSTRAINT fk_item_subcategory1
    FOREIGN KEY (itm_subcategory_id)
    REFERENCES subcategory (scat_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table download
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS download (
  dwn_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_user_id INT UNSIGNED NOT NULL,
  dwn_item_id INT UNSIGNED NOT NULL,
  dwn_created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (dwn_id, user_user_id, dwn_item_id),
  INDEX fk_download_item1_idx (dwn_item_id ASC) VISIBLE,
  INDEX fk_download_user1_idx (user_user_id ASC) VISIBLE,
  INDEX download_dwn_user_id_dwn_item_id_Idx (user_user_id ASC, dwn_item_id ASC) VISIBLE,
  CONSTRAINT fk_download_item1
    FOREIGN KEY (dwn_item_id)
    REFERENCES item (itm_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_download_user1
    FOREIGN KEY (user_user_id)
    REFERENCES user (user_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

