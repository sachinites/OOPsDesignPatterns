class Main{
    public static void main(String args[]){
        Wife Mywife = new Wife("Shivani", "Fair", 54, "Ph.D");
        Mywife.addDecorator(new Bangles  ("Bagnles"      , 1200  ));
        Mywife.addDecorator(new Saree    ( "AkashGanga"  , 2000  ));
        Mywife.addDecorator(new Earrings ( "TanishQ"     , 5000  ));
        Mywife.addDecorator(new MakeupBox( "Lakme"       , 15000 ));
        Wife.printWifeAttributes(Mywife);
    }
}
