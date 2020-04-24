USE catalog;

CREATE TABLE `catalog` (
  `id` int(20) NOT NULL,
  `catalog_name` varchar(255) NOT NULL,
  `catalog_description` varchar(255) DEFAULT NULL,
  `active` char(1) DEFAULT 'Y',
  `created_at` datetime DEFAULT now(),
  `modified_at` datetime DEFAULT now(),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
