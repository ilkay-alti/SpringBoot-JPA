# 🌱 Spring Data JPA Demo Project

Bu proje, **Spring Boot** ile **Data JPA** kullanılarak oluşturulmuş bir demo uygulamasıdır. PostgreSQL ile veri yönetimi, JPA ile veri erişimi ve Spring Boot'un güçlü web desteğini barındırmaktadır.

## 📖 İçindekiler

- [Özellikler](#özellikler)
- [Gereksinimler](#gereksinimler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)
- [Katkıda Bulunma](#katkıda-bulunma)
- [Lisans](#lisans)

---

## ✨ Özellikler

- **Spring Boot 3.4.0** ile hızlı ve kolay uygulama geliştirme
- **Spring Data JPA** ile ORM (Object-Relational Mapping) desteği
- **PostgreSQL** veritabanı entegrasyonu
- **Lombok** ile daha temiz ve okunabilir kod
- Birlikte gelen Spring Boot test desteği

---

## 🔧 Gereksinimler

Projenin çalıştırılması için aşağıdaki araçlar gereklidir:

- **Java 21** veya daha güncel bir sürüm
- **Maven 3.9+**
- **PostgreSQL** veritabanı

---

## 🚀 Kurulum

1. Projeyi klonlayın:

    ```bash
    git clone https://github.com/kullaniciadi/spring-data-jpa.git
    cd spring-data-jpa
    ```

2. PostgreSQL veritabanınızı ayarlayın ve `application.properties` dosyasındaki veritabanı bağlantı ayarlarını düzenleyin:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/veritabani_adi
    spring.datasource.username=kullanici_adi
    spring.datasource.password=sifre
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Maven bağımlılıklarını yükleyin:

    ```bash
    mvn clean install
    ```

4. Uygulamayı çalıştırın:

    ```bash
    mvn spring-boot:run
    ```

---

## 📖 Kullanım

- Uygulama `http://localhost:8080` adresinde çalışacaktır.
- REST API uç noktalarını kullanarak veri işlemleri gerçekleştirebilirsiniz.
- Swagger veya Postman gibi araçlarla API'yi test edebilirsiniz.

---

## 🤝 Katkıda Bulunma

Katkıda bulunmak isterseniz, lütfen bir **pull request** gönderin. Önerileriniz ve katkılarınız memnuniyetle karşılanır!

---

## 📝 Lisans

Bu proje, [MIT Lisansı](LICENSE) ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasını kontrol edin.
