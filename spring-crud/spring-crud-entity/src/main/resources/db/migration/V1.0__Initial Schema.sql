CREATE TABLE `products` (
  `id` varchar(225) NOT NULL,
  `sku` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `qty` int NOT NULL,
  `price` decimal(19,2) NOT NULL,
  `updated_at` timestamp,
  `created_at` timestamp,
  `status` int,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`sku`)
) ENGINE=InnoDB ;