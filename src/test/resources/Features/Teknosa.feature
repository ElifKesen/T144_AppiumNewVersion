Feature: Teknosa uygulamasi test edilir

  Scenario: Kisisel Bakim bolumunden Sac Bakim filtrelemesi yapilarak siralandigi dogrulanir
    * Uygulama baslatilir
    * Ilk ekran bolumunden atlaya tiklanir
    * footer bolumunden "Kategoriler" bolumune tiklanir
    * kategoriler bolumunden "Kişisel Bakım" bolumune tiklanir
    * acilan sayfadan "Saç Bakım" secimi yapilir
    * filtrele bolumune tiklanir
    * Marka "Arzum" bolumunden marka secimi yapilir
    * siralama yapilirak "Artan Fiyat" secilir
    * fiyatlarin artan duzende oldugu test edilir

  Scenario: Ev ve Yasam bolumunden aydinlatma filtrelemesi yapilarak siralandigi dogrulanir
    * Uygulama baslatilir
    * Ilk ekran bolumunden atlaya tiklanir
    * footer bolumunden "Kategoriler" bolumune tiklanir
    * kategoriler bolumunden kaydirarak "Ev ve Yaşam" bolumune tiklanir
    * acilan sayfadan "Aydınlatma" secimi yapilir
    * filtrele bolumune tiklanir
    * Marka "Orbus" bolumunden marka secimi yapilir


  Scenario: kullanici ekran fotografi almak icin gorevi yerine getirir
    * Uygulama baslatilir
    * Ilk ekran bolumunden atlaya tiklanir
    * footer bolumunden "Kategoriler" bolumune tiklanir
    * kullanici ekran fotografi cekmek istedigi elementin "Kampanyalar" ekran fotografini ceker

  @tek
  Scenario: Kullanici ilgili testleri yapar
    * Uygulama baslatilir
    * Ilk ekran bolumunden atlaya tiklanir
    * footer bolumunden "Kategoriler" bolumune tiklanir
    * kategoriler bolumunden "Kişisel Bakım" bolumune tiklanir
    * acilan sayfadan "Saç Bakım" secimi yapilir
    * filtrele bolumune tiklanir
    * Marka "Karaca" bolumunden marka secimi yapilir
    * siralama yapilirak "Azalan Fiyat" secilir
    * fiyatlarin azalan duzende oldugu test edilir


