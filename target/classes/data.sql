
insert into SUPPLIER (name, address, product_group)  values ('Tesco','UK', 1);
insert into SUPPLIER (name, address, product_group)  values ('ASDA','UK', 2);
insert into SUPPLIER (name, address, product_group)  values ('Morrisons','UK', 3);
insert into SUPPLIER (name, address, product_group)  values ('SuplerValue','IE', 4);
insert into SUPPLIER (name, address, product_group)  values ('Lidl','DE', 5);
insert into SUPPLIER (name, address, product_group)  values ('Aldi','DE', 6);
insert into SUPPLIER (name, address, product_group)  values ('Kaufland','DE', 7);
insert into SUPPLIER (name, address, product_group)  values ('Centra','IE', 8);
insert into SUPPLIER (name, address, product_group)  values ('SuperSavers','IE', 9);

insert into PRODUCT (name, price, supplier_group)  values ('Toilet Paper', 2.19, 1);
insert into PRODUCT (name, price, supplier_group)  values ('Vitamin C', 6.99, 2);
insert into PRODUCT (name, price, supplier_group)  values ('Orange Juice', 5.23, 3);
insert into PRODUCT (name, price, supplier_group)  values ('Timeout bars', 2.99, 4);
insert into PRODUCT (name, price, supplier_group)  values ('Hand Soap', 1.59, 5);
insert into PRODUCT (name, price, supplier_group)  values ('Hand Towels', 1.59, 6);
insert into PRODUCT (name, price, supplier_group)  values ('Napkins', 2.99, 7);
insert into PRODUCT (name, price, supplier_group)  values ('Ketchup', 1.79, 8);
insert into PRODUCT (name, price, supplier_group)  values ('Mushy Peas', 0.79, 9);
insert into PRODUCT (name, price, supplier_group)  values ('Soft Toilet Paper', 2.99, 10);
insert into PRODUCT (name, price, supplier_group)  values ('Extra Soft Toilet Paper', 3.99, 11);
insert into PRODUCT (name, price, supplier_group)  values ('Wet Wipes', 1.14, 12);

insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (1,1);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (1,2);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (1,3);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (2,2);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (3,4);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (4,5);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (5,5);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (6,8);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (7,9);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (8,10);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (9,11);
insert into SUPPLIER_PRODUCT (product_group, supplier_group)  values (9,12);
