package app;

public class PC{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

  //  private Case getTheCase(){
  //      return theCase;
  //  }

  //  private Monitor getMonitor(){
  //      return monitor;
  //}

   // private Motherboard getMotherboard(){
    //    return motherboard;
    //}

}