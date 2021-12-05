

-- restaurants

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(1, 'Lermontov str. 13', 'CENTRAL', 'Кофейня · Ресторан соул фуд', 90, 'Butlers Coffee & Kitchen', '0895788089');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(2, 'Aleko Bogoridi str. 27', 'CENTRAL', 'Soul Food & Drinks', 53, 'Cardamon', '0892301180');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(3, 'До Пиргос', 'LAZUR', 'Ресторан быстрого питания', 50, 'Me Gustò', '0882532498');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(4, 'ул.Одрин 7, база Кока-Кола', 'VAZRAZHDANE', 'Ние от гостилница Йорк , НЯМАМЕ ОГРОМНИ ХЛАДИЛНИЦИ ИЛИ СТРАХОТНИ ФРИЗЕРИ... Затова пазарим за Вашият обяд всяка вечер! Не замразяваме продукти по цели седмици.Всичко се пазари пред нощта и сутринта влиза в тенджарата...Затова свършва бързо храната при нас. Защото нямаме излишни запаси във фризера. Искаме пресните продукти днес сготвени и утре нищо от това не се продава. Не че сме чак толкова съвестни ... просто, не остава нищо. Ето на това държим ние! Не вадим супата от замразена торбичка ... НИЕ я сипваме от ТЕНДЖеРАТА . Както бихме направили удома... както и Вие правите това удома .. Всички наши „манджички“ се готвят във фурна не се прави запръжка ... А излизат от фурната.Ето на това държим ние - пресни продукти сготвени както удома би Ви ги сготвила за вас, милата Ви Баба ....', 94, 'Гостилница ЙОРК', '0884683060' );

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(5, 'ж.к Славейков бл.60', 'SLAVEYKOV', 'Перфектна кухня, разнообразен бар, уютна обстановка и добро обслужване са само малка част от това, което сме подготвили за Вас.', 112, 'Maison’s Burgas', '0877100166' );

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(6, 'ж.к. Зорница 57', 'ZORNITSA', 'Домашна храна, приготвена с вкус и любов, Специалитети от Средиземноморската и европейската кухни, Пици приготвени с желание и грижа', 65, 'La Veranda', '056862000');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(7, 'ж.к. Меден рудник Битов Комбинат, до бл 14', 'MEDEN_RUDNIK', 'Ресторант * Доставка', 65, 'Bar & food Merci', '0896771080');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(8, 'ж.к.Изгрев парк Велека', 'IZGREV', 'Бистро', 68, 'Бистро “Бели Нощи”', '0892473768');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(9, 'ж.к.Изгрев парк Велека', 'IZGREV', 'Ресторант * Пицария', 113, 'Пицария Замъка', '056705151');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(10, 'к-с "Лазур", бл.166 Флора Панорама', 'LAZUR', 'При нас можете да се насладите на грижливо приготвени, изкусително вкусни ястия с безплатна доставка до дома и офиса.', 112, 'Flora Bar & Grill', '0893888388');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(11, 'Морска гара', 'CENTRAL', 'CITY RESTAURANT', 104, 'Dock 5 Burgas', '0885122225');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(12, 'Buliair str. 35', 'CENTRAL', 'Healthy cuisine in a magical jazz & soul environment.', 69, '8 mamas', '056847660');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(13, 'Silistra str. 4', 'CENTRAL', 'Ti bar е място с индивидуална атмосфера, уникална кухня и най-богатият избор от вина и уискита в Бургас!', 164, 'Ti Bar & Kitchen', '0877088610');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(14, 'Община Бургас ул. "Александровска" 26', 'CENTRAL', 'Меню за деца от 2 до 7 години в детските градини и ясла', 10, 'Градини и ясла', ' 056841560');

INSERT INTO restaurants(id, address, area, description, likes, name, phone_number)
VALUES(15, 'Община Бургас ул. "Александровска" 26', 'CENTRAL', 'Меню в училища', 20, 'Училища', ' 056841560');

-- pictures
INSERT INTO pictures(title, url, restaurant_id)
VALUES ('buttlers-front', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,r_0,w_250/v1636729643/buttlers_xosjf3.jpg', 1);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('cardamon-view', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1637172633/cardamon_gqpv2t.jpg', 2);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('meGusto-view', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636730110/me-gusto_dtrfxm.jpg', 3);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('york-page', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636730400/york_ce9tmj.jpg', 4);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('maisons', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636730631/maisons_bqoipt.jpg', 5);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('la-veranda', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636730842/la-veranda_of0n8w.jpg', 6);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('merci', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636730957/merci_nqc25l.jpg', 7);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('beli-noshti', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636731113/beli-noshti_htxyjd.jpg', 8);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('zamyka', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636731212/zamyka_dwlcet.jpg', 9);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('flora', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_180,w_250/v1636731396/flora_brcod0.jpg', 10);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('dock-5', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636731718/dock-5_rycrsa.jpg', 11);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('8-mamas', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636731849/8-mamas_sjhdzq.jpg', 12);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('ti-bar', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636731958/ti-bar_xorpw8.jpg', 13);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('kindergarten', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636925158/gradina_axgbmr.jpg', 14);

INSERT INTO pictures(title, url, restaurant_id)
VALUES ('school', 'https://res.cloudinary.com/zhulbars/image/upload/c_scale,h_200,w_250/v1636925146/school_mqltuc.jpg', 15);


-- menus

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пилешка крем супа', 3.50, 300,  1);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пилешки рулад с пълнени смокини със сирене Бри', 7.00, 350, 1);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Грилован свински врат с билково масло и пюре от морков', 7.50, 350, 1);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Лазаня с Филаделфия и гъби', 6.00, 350, 1);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Салата с броколи, царевица, червено зеле, ябълка, краставица и морков', 5.90, 270, 2);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем супа от чедър с броколи', 3.40, 300, 2);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Яйца шакшука', 6.20, 300, 2);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Бавно готвени ребра със свежа салата и печени картофи', 8.60, 300, 2);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Рибена чорба', 4.00, 300, 3);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Шкембе чорба', 3.50, 300, 3);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Свинско с кисело зеле', 6.50, 350, 3);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пиле с ориз', 5.50, 350, 3);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пържени кюфтета', 6.00, 350, 3);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Чизкейк с боровинки', 3.50, 200, 3);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Домашна бисквитена торта', 3.50, 200, 3);

-- 4 йорк

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Картофена крем супа с крутони', 1.80, 400, 4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Таратор', 1.80, 400, 4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пилешка супа', 1.80, 400, 4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Салата табуле с киноа', 4.20, 280,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Цезар', 5.40, 300,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пресен спанак с ориз', 2.80, 350,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Чушки бюрек(2 бр) с пържени картофи', 4.20, 350,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Печено пилешко бътче с картофи', 3.90, 400,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Сирене по шопски на пещ', 5.90, 300,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Мляко с ориз', 1.00, 200,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем карамел', 1.40, 150,  4);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Торта Орео', 2.50, 200,  4);

-- 5 Maisons

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Зелена салата с яйце', 5.39, 300,  5);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Супа топчета', 3.99, 300,  5);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Миш-маш', 5.39, 300,  5);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Мариновани пилешки шъшчета с мачкан картоф', 6.49, 300,  5);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Яхния от свинско с картофи', 6.49, 350,  5);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Телешки кюфтета с гарнитура ориз', 7.99, 300,  5);


-- 6 la veranda

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Леща чорба', 2.90, 300,  6);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Домашна пилешка супа', 2.90, 300,  6);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Картофени кюфтета със шарена салатка и млечен сос', 5.40, 300,  6);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Прясна паста с броколи и сирена', 8.00, 300,  6);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Ризото с тиквички, маслини и чери домати', 6.90, 300,  6);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Шницел от свинско мляно месо с хрупкави картофки', 6.20, 350,  6);

-- 7 Merci
INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем супа от тиквички, сирене фета и песто от босилек', 3.50, 300,  7);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Картофи със зелен боб яхния', 3.80, 350,  7);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Леща яхния', 4.00, 300,  7);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Руло Стефани с картофено пюре', 4.80, 350,  7);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем ванилия', 2.00, 200,  7);


-- 8 beli noshti

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Шопска салата', 2.29, 200,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Зеле с моркови', 2.29, 200,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пилешка супа', 2.99, 400,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Агнешка супа', 3.50, 400,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Шницел с гарнитура', 5.60, 350,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пържени кюфтенца с гарнитура', 5.60, 350,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пилешки медальони с гъбен сос', 5.60, 350,  8);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Домашна бисквитена торта', 2.99, 200,  8);


-- 9 zamyka
INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Супа със свинско месо', 2.80, 300,  9);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Кашкавал пане с пържени картофи', 5.20, 300,  9);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пилешко бутче с грах', 4.80, 350,  9);


-- 10 flora
INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Зеленчуков борщ със заквасена сметана', 2.99, 300,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем супа от нахут със сусамов тахан', 3.29, 300,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Руска салата', 5.99, 300,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Картофена яхния с грах и къри', 4.99, 300,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Шотландски кюфтета с печен сос', 5.89, 350,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Цвински стекчета с пикантен сос', 7.99, 350,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Телешко печено със сос горгонзола', 8.29, 350,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Печена тиква с мед и орехи', 2.99, 150,  10);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Домашен сладкиш с дюли', 3.49, 150,  10);

-- 11 dock 5

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Листна салата с печена тиква, семки, лимец, нап и джинджифил', 6.90, 300,  11);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем супа от тиква със семена и заквасена сметана', 4.00, 300,  11);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Заешко роле с пюре от тиква и сотирани гъби', 14.50, 300,  11);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Крем карамел с тиква', 4.70, 150,  11);


-- 12 8 mamas
INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Шкембе чорба', 3.90, 350,  12);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Агнешка дроб чорба', 3.90, 350,  12);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Телешки дроб по ориенталска рецепта', 6.50, 350,  12);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пикантни непържени булгурени кюфтета със зелена салата', 4.60, 350,  12);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Оригинална грис халва ', 4.30, 200,  12);


-- 13 ti bar
INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Белени домати с печен пипер и краве сирене', 4.50, 300,  13);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Телешка супа', 4.50, 300,  13);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Запеканка от картофи броколи тиквички и сирена', 5.50, 350,  13);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Свинско рагу с басмати ориз', 7.00, 350,  13);

-- 14 градини

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Закуска: Попара със сирене и плод', 0.00, 150,  14);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Обяд: Супа от пиле и спанак', 0.00, 100,  14);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Обяд: Яхния от зрял фасул', 0.00, 130,  14);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Следобедна закуска: Кифла', 0.00, 100,  14);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Следобедна закуска: Айрян', 0.00, 200,  14);

-- 15 училища

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Таратор', 0.00, 150,  15);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Супа пиле', 0.00, 150,  15);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Салата витамина', 0.00, 100,  15);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Кебабчета на скара с гарнитура', 0.00, 150,  15);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Постно зеле на фурха', 0.00, 150,  15);

INSERT INTO menus(meal_name, price, weight, restaurant_id)
VALUES('Пресни плодове', 0.00, 200,  15);

-- recipe
INSERT INTO recipes(id, name, description, restaurant_id)
VALUES(1, 'Ризото със скариди и маскарпоне', 'Обелете и нарежете на ситно лука. Нарежете няколко листа кориандър. Обелете скаридите, след което ги нарежете на 3 части, като оставите 8 цели за украса., 
Загрейте бульона в тенджера с капак. Загрейте маслото в дълбок тиган и запържете скаридите (целите скариди и нарязаните парчета). Извадете ги от тигана.
В същия съд сложете нарязания на ситно лук. Глазирайте, без да го запържвате много. Добавете ориза. Разбъркайте добре и и запържете леко, докато ориза стане прозрачен.
Добавете бялото вино. Разбъркайте приготвените сосове и оставете да поври. Прибавете бульона черпак по черпак, като разбърквате непрекъснато. Когато оризът е готов, добавете маскарпонето (крема сирене), кориандъра и нарязаните скариди.
Разбъркайте. Настържете и поръсете с пармезан. Поставете целите скариди. Покрийте и оставете да престои за около 3 минути преди да поднесете.', 1);

-- ingredients

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Ориз арборио', 100, 'г', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Скариди', 10, 'бр', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Пармезан', 25, 'г', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Маскарпоне', 50, 'г', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Бяло вино', 50, 'мл', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Зехтин', 25, 'мл', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Бульон', 500, 'мл', 1);

INSERT INTO ingredients(name, quantity, measure, recipe_id)
VALUES('Лук', 40, 'г', 1);

































