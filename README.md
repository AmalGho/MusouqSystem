
# Musouq  (مُسوق)

A brief description of what this project does and who it's for

The idea of the project is a platform that combines the supplier, the marketer, and the shopper in the same place

So the benefit that each of these users will get is :
* Supplier / Through our platform he/she can get many marketers for his products with a marketing percentage, he determines it for each category of his products, whether they are few or many

* Marketer /The marketer can get a supplier where he markets his products and gets the marketing percentage. As a result, the marketer does not take the trouble of buying products or even looking for warehouses to store them!!!. He can sell the products through our platform, by marketing them only.

* Shopper /The shopper through our platform can get many products through many marketers, as he can get the product he wants at different prices and offers, and every marketer offers discount coupons, which is excellent!!!








## 🔗 Authors
[![@AmalGho](https://img.shields.io/badge/@AmalGho-F7A072?style=for-the-badge&logo=ko-fi&logoColor=white)](https://www.github.com/AmalGho)
[![@RehamS21](https://img.shields.io/badge/@RehamS21-F7A072?style=for-the-badge&logo=ko-fi&logoColor=white)](https://www.github.com/RehamS21)
[![@RahafMohammed1](https://img.shields.io/badge/@RahafMohammed1-F7A072?style=for-the-badge&logo=ko-fi&logoColor=white)](https://www.github.com/RahafMohammed1)




## LOGO

![Logo](https://github.com/AmalGho/MusouqSystem/blob/main/musouq-logo.png)


## Class digram 

![class diagram](https://github.com/AmalGho/MusouqSystem/blob/main/musouq-class.drawio.png)




## Usecase Digram

![usecase diagram](https://github.com/AmalGho/MusouqSystem/blob/main/musouq-usecase.drawio.png)





## Project Details

- First the admin will add the categories of products

- The supplier will add his product according to the categories the admin added, and he will determine the marketing percentage for every category.

- The Marketer will select a suppplier To marketing his products.

- The Marketer should send a marketing request to the supplier 

- The supplier can accept or reject the marketer's request

- If the supplier accepts the marketer's request, then the marketer can choose a product from the supplier's products and do marketing for it otherwise the marketer can't do these steps.

- The marketer can add a discount on specific products

- The marketer can add coupons 

- There is two types of coupon general for all his shoppers or special for special shoppers.

- The marketer can activate and deactivate his coupons.

- The shopper can review all the marketers registered on the site and then review the products and offers they offer

- After the shopper selects a marketer he can make orders and add all products he wants to the order 

- The shopper can apply coupons from his marketer on his order 

- The shopper can view shipping company and their shipping prices and select one of them to ship his order

- The supplier ships the order to the shipping company and changes the status of the order form processing to shipped

- If the order reaches the shopper, he confirms its delivery, and then the order status changes from shipped to delivered.




## Tools 

- intellij IDEA
- MySQL
- Springboot
- postman
- DataGrip




## Springboot Dependency

- Spring Web
- Lombok
- Validation
- Spring Secuirty
- Spring Data JPA
- Mysql Driver




##  Project Presentation
[Project Presentation](https://www.canva.com/design/DAFt-RjJPRg/IViq2TcqG7FPyrOiw3kDjQ/edit?utm_content=DAFt-RjJPRg&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)




## API Documentation (postman)
[API Documentation (postman)](https://documenter.getpostman.com/view/28984368/2s9YC1XETh)




## Figma
[Figma](https://www.figma.com/proto/29jAKsedWTK1xrg2r6RjYM/%D9%85%D9%8F%D8%B3%D9%88%D9%82?type=design&node-id=38-240&t=5DlmXUWUksbPqiwl-0&scaling=min-zoom&page-id=0%3A1)







# Individual work

## the non - technical work

- improving exist idea.
- design the logo.  
- select color of logo and website.

   | Color             | Hex                                                                |
   | ----------------- | ------------------------------------------------------------------ |
   | dark blue     | ![#0F4C5C](https://via.placeholder.com/10/0F4C5C?text=+) #0F4C5C |
   | dark orange   | ![#E36414](https://via.placeholder.com/10/E36414?text=+) #E36414 |
   | light orange  | ![#F7A072](https://via.placeholder.com/10/F7A072?text=+) #F7A072 |
   | grey text     | ![#707070](https://via.placeholder.com/10/707070?text=+) #707070 |
   | light grey    | ![#EFEFEF](https://via.placeholder.com/10/EFEFEF?text=+) #EFEFEF |
   | Black Text    | ![#323031](https://via.placeholder.com/10/323031?text=+) #323031 |


- working on figma to design pages, the following pages designed:
  * registration page.
  * all supplier profile pages:
    - supplier profile page / my information -1
    - supplier profile page / add product
    - supplier profile page / add product / select category
    - supplier profile page / view my products
    - supplier profile page / view marketers requests
    - supplier profile page / view my marketers
    - supplier profile page / view orders
    - supplier profile page / view orders -3 (shipping order)
    - supplier profile page / view orders -2 (display message)
- working on class diagram, draw the following classes with its relations:
  * Request class
  * Category class
  * Product class
  * Image class
  * Order class
  * make different relations (m:n) (1:n) (1:1).
- working on Usecase diagram:
  * draw Shopper actor & its functions in the system.
- create GitHub repo with contributes.
- working on GitHub desktop with team.
- postman test & documentation.


## the technical work

- build spring boot project structure with many dependencies & database configuration.
- work on the following classes and its relations:
  * User class
    - class built to manage registration and authentication of different user's role.
  * Supplier class
    - one of the system users, business owner or product owner.
  * Product class
    - Contains all products that suppliers added.
  * Image class
    - Contains images of products, each image assigned to one product. 
  * Category class
    - Contains categories of products. 
- create Model, Repository layer, Service layer, and Controller layer of all class list above.
- add validation on data to maintain the integrity of data. 
- create all type of relations m:n, 1:n, 1:1 with DTO.
- build Auth repo, Auth service, Auth Controller for User class, and set the 1:1 relation with all system's 3 actors.
- make Repository Testing using jUnit test.



## Endpoints worked on 
     

* Users registration  (Auth)

    * Admin register
    * supplier register
    * marketer register
    * shopper register

    - methods above, allowed user to register in the system, encrypt the password, and assign the appropriate role to user between ADMIN , SUPPLIER , SHOPPER , and MARKETER.

* Supplier Class:

    * Marketer get all supplier
        - they can view all registered supplier in the system, to select one.
    * Complete profile
        - suppliers must to complete their profile and personal info to use the system.
    * Update profile
    * Supplier shipping order
        - after supplier view all orders that related to their products, they can shipping the order and update order status to shipped.
    * Delete account
        - supplier can delete his account only when there is no orders or marketing requests related to.

* Category Class: 

    * Supplier get all categories
        - supplier view all categories as list to select appropriate category to a product.
    * Admin Add category
        - admin add all categories to the system, then suppliers can select category of product from list.
    * Admin Update category 
    * Supplier update marketer percent
        - supplier can set a specific marketing percent depent on the category.
    * Admin Delete category
        - can delete a category when there is no products belong to the category.

* Product Class:

    * get all products of supplier 
        - suppliers get their own products.
    * Marketer get all product of supplier 
        - marketers view all products of only a supplier they send request to, and the request accepted.
    * Shopper Get all products of marketer
        - they can view all product of one selected marketer.
    * User Get all products by category
        - filter products by the category.
    * Supplier add product
        - they can add their products.
    * Marketer add product
        - they add their supplier's product to their market, (select and display on the market)
    * Supplier update product 
    * Marketer apply discount
        - have the ability to apply discount on every product that marketers added before to them market from supplier's products.
    * Supplier delete product 
        - supplier can delete any product only when the product does not belong to any marketer.
    * Marketer delete product 
        - marketers delete the product from their market only.

* Image Class: 

    * get all image
    * Supplier Add image to product 
        - supplier can attach image to added product.
    * Supplier Change image
        - supplier can modify the image of a product.
    * Supplier Delete image
     


All endpoints above users can access with authentication  and authorization. 








 
