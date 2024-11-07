Feature: Teknosa uygulamasi test edilir
  @tek
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

