# Shiro Security
Shiro Security for PU Plovdiv

**Youtube Demo** - https://www.youtube.com/watch?v=QmM5eRrDwho

Script so you have some data -

INSERT INTO `shirosecurity`.`role` (`id`, `description`, `name`) VALUES ('1', 'Admin Role - Can view users, cats, everything.', 'admin');
INSERT INTO `shirosecurity`.`role` (`id`, `description`, `name`) VALUES ('2', 'Normal Role - Can view cats.', 'normal');
INSERT INTO `shirosecurity`.`role` (`id`, `description`, `name`) VALUES ('3', 'Restricted Role - Can only log in and out.', 'restricted');

INSERT INTO `shirosecurity`.`permission` (`id`, `description`, `name`) VALUES ('1', 'Can see all users.', 'canSeeAllUsers');
INSERT INTO `shirosecurity`.`permission` (`id`, `description`, `name`) VALUES ('2', 'Can see a user by username.', 'canSeeUserByUsername');
INSERT INTO `shirosecurity`.`permission` (`id`, `description`, `name`) VALUES ('3', 'Can see all cats.', 'canSeeAllCats');
INSERT INTO `shirosecurity`.`permission` (`id`, `description`, `name`) VALUES ('4', 'Can see all cats by color.', 'canSeeAllCatsByColor');
INSERT INTO `shirosecurity`.`permission` (`id`, `description`, `name`) VALUES ('5', 'Can see a cat by name.', 'canSeeCatByName');

INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('1', '1', '1');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('2', '2', '1');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('3', '3', '1');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('4', '4', '1');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('5', '5', '1');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('6', '3', '2');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('7', '4', '2');
INSERT INTO `shirosecurity`.`role_permission` (`id`, `permission_id`, `role_id`) VALUES ('8', '5', '2');

INSERT INTO `shirosecurity`.`users` (`id`, `password`, `username`, `role_id`) VALUES ('1', 'password', 'admin', '1');
INSERT INTO `shirosecurity`.`users` (`id`, `password`, `username`, `role_id`) VALUES ('2', 'password', 'normal', '2');
INSERT INTO `shirosecurity`.`users` (`id`, `password`, `username`, `role_id`) VALUES ('3', 'password', 'restricted', '3');

INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('1', 'black', 'Abby');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('2', 'white', 'Robert');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('3', 'orange', 'Garfield');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('4', 'gray', 'Indiana');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('5', 'black', 'Andy');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('6', 'gray', 'Lily');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('7', 'orange', 'Poppy');
INSERT INTO `shirosecurity`.`cats` (`id`, `color`, `name`) VALUES ('8', 'white', 'Lesly');
