package GUILogic;

import GUI.ContainerPanel;
import GUI.InfoMenu.DepartureTime;
import GUI.InfoMenu.KastelletInformation;
import GUI.InfoMenu.*;
import Logic.FileReader;
//import com.sun.webkit.ContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GuiController {

    private FileReader fileReader;
    private ContainerPanel CP;

    //public ArrayList<String> array = new ArrayList<String>();
    public GuiController() {

        CP = new ContainerPanel();
        initializeListeners();

    }

    // shows welcome panel and sets Jframe to visible 
    public void go() {
        CP.show(ContainerPanel.Welcome);
        CP.setVisible(true);
        TextToGUI();
    }

    public void TextToGUI() {
        fileReader = new FileReader();
        ArrayList<String> array = fileReader.getArray();
        CP.getTLMI().setTextPaneTLMI(array.get(0));
        CP.getOI().setTextPaneOI(array.get(1));
        CP.getTOSEI().setTextPaneTOSEI(array.get(2));
        CP.getTFI().setTextPaneTFI(array.get(3));
        CP.getTBDI().setTextPaneTBDI(array.get(4));
        CP.getCPI().setTextPaneCPI(array.get(5));
        CP.getKI().setTextPaneKI(array.get(6));
        CP.getOSCI().setTextPaneOSCI(array.get(7));
        CP.getAU().setTextPaneAU(array.get(8));

    }

    private class ChangeLanguageDanish implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            FileReader.setFilename("Danish.txt");
            new FileReader().read();
            new FileReader().ReadFromFile();
            TextToGUI();

            setUIDanish();
        }
    }

    public void setUIDanish() {
        //Menu
        CP.getUM().getMenuBtn("Menu");
        CP.getUM().getQuizBtn("Quiz");
        CP.getUM().getInformationBtn("Information");
        CP.getUM().getInformationOnSightBtn("Seværdigheds Information");
        CP.getUM().getLanguageBtn("Skift Sprog");

        //Information
        CP.getInfo().getMenuBtn("Menu");
        CP.getInfo().getTicketInfoBtn("Billet Information");
        CP.getInfo().getRouteInfoBtn("Rute Information");
        CP.getInfo().getDepartureBtn("Afgangstider");
        CP.getInfo().getAboutUsBtn("Om Os");

        //Information on sights
        CP.getIOS().getjButton1("Back"); // this is still in english so far, i'm too damn lazy to fix this 
        CP.getIOS().getTheOperaBtn("Det Konglige Operahus");
        CP.getIOS().getTheLittleMermaidBtn("Den Lille Havfrue");
        CP.getIOS().getTrekronerFortressBtn("Trekroner Søfort");
        CP.getIOS().getTheOldStockExchangeBtn("Børsen");
        CP.getIOS().getTheBlackDiamondBtn("Den Sorte Diamant");
        CP.getIOS().getChristiansborgPalaceBtn("Christiansborg");
        CP.getIOS().getKastelletBtn("Kastellet");
        CP.getIOS().getOurSavioursChurchBtn("Vor Frelsers Krike");

        // the royal operahouse
        CP.getOI().getjLabel1("Det Konglige Operahus");
        CP.getOI().getBackBtn("Back");
        CP.getOI().getShowOnMapBtn("Vis på Kort");

        // the little mermiad
        CP.getTLMI().getjLabel1("Den Lille Havfrue");
        CP.getTLMI().getBackBtn("Back");
        CP.getTLMI().getShowOnMapBtn("Vis på Kort");

        // trekroner fortress
        CP.getTFI().getjLabel1("Trekroner Søfort");
        CP.getTFI().getBackBtn("Back");
        CP.getTFI().getShowOnMapBtn("Vis på Kort");

        //the old stockexchange
        CP.getTOSEI().getjLabel1("Børsen");
        CP.getTOSEI().getBackBtn("Back");
        CP.getTOSEI().getShowOnMapBtn("Vis på Kort");

        //the black diamond
        CP.getTBDI().getjLabel1("Den Sorte Diamant");
        CP.getTBDI().getBackBtn("Back");
        CP.getTBDI().getShowOnMapBtn("Vis på Kort");

        // Christiansborg palace
        CP.getCPI().getjLabel1("Christiansborg");
        CP.getCPI().getBackBtn("Back");
        CP.getCPI().getShowOnMapBtn("Vis på Kort");

        // kastellet
        CP.getKI().getjLabel1("Kastellet");
        CP.getKI().getBackBtn("Back");
        CP.getKI().getShowOnMapBtn("Vis på Kort");

        // our saviors church
        CP.getOSCI().getjLabel1("Vor Frelsers Kirke");
        CP.getOSCI().getBackBtn("Back");
        CP.getOSCI().getShowOnMapBtn("Vis på Kort");

    }

    private class ChangeLanguageEnglish implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            FileReader.setFilename("English.txt");
            new FileReader().read();
            new FileReader().ReadFromFile();
            TextToGUI();

            setUIEnglish();
        }
    }

    public void setUIEnglish() {
        //Menu
        CP.getUM().getMenuBtn("Menu");
        CP.getUM().getQuizBtn("Quiz");
        CP.getUM().getInformationBtn("Information");
        CP.getUM().getInformationOnSightBtn("Information On Sights");
        CP.getUM().getLanguageBtn("Change Language");

        //Information
        CP.getInfo().getMenuBtn("Menu");
        CP.getInfo().getTicketInfoBtn("Ticket Information");
        CP.getInfo().getRouteInfoBtn("Route Information");
        CP.getInfo().getDepartureBtn("Departure Times");
        CP.getInfo().getAboutUsBtn("About Us");

        //Information on sights
        CP.getIOS().getjButton1("Back");
        CP.getIOS().getTheOperaBtn("The Royal Opera House");
        CP.getIOS().getTheLittleMermaidBtn("The Little Mermaid");
        CP.getIOS().getTrekronerFortressBtn("Trekroner Fortress");
        CP.getIOS().getTheOldStockExchangeBtn("The Old Stock Exchange");
        CP.getIOS().getTheBlackDiamondBtn("The Black Diamond");
        CP.getIOS().getChristiansborgPalaceBtn("Christiansborg Palace");
        CP.getIOS().getKastelletBtn("Kastellet");
        CP.getIOS().getOurSavioursChurchBtn("Our Savior's Church");
        
                // the royal operahouse
        CP.getOI().getjLabel1("The Royal Opera House");
        CP.getOI().getBackBtn("Back");
        CP.getOI().getShowOnMapBtn("Show On Map");

        // the little mermiad
        CP.getTLMI().getjLabel1("The Little Mermaid");
        CP.getTLMI().getBackBtn("Back");
        CP.getTLMI().getShowOnMapBtn("Show On Map");

        // trekroner fortress
        CP.getTFI().getjLabel1("Trekroner Fortress");
        CP.getTFI().getBackBtn("Back");
        CP.getTFI().getShowOnMapBtn("Show On Map");

        //the old stockexchange
        CP.getTOSEI().getjLabel1("The Old Stock Exchange");
        CP.getTOSEI().getBackBtn("Back");
        CP.getTOSEI().getShowOnMapBtn("Show On Map");

        //the black diamond
        CP.getTBDI().getjLabel1("The Black Diamond");
        CP.getTBDI().getBackBtn("Back");
        CP.getTBDI().getShowOnMapBtn("Show On Map");

        // Christiansborg palace
        CP.getCPI().getjLabel1("Christiansborg Palace");
        CP.getCPI().getBackBtn("Back");
        CP.getCPI().getShowOnMapBtn("Show On Map");

        // kastellet
        CP.getKI().getjLabel1("Kastellet");
        CP.getKI().getBackBtn("Back");
        CP.getKI().getShowOnMapBtn("Show On Map");

        // our saviors church
        CP.getOSCI().getjLabel1("Our Savior's Church");
        CP.getOSCI().getBackBtn("Back");
        CP.getOSCI().getShowOnMapBtn("Show On Map");
    }

    //Creates a private innerclass, implementing actionlistener
    //Methods checking for button presses
    private class Menu implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Menu);
        }
    }

    private class WelcomeScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Welcome);
        }
    }

    private class Information implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Information);
        }
    }

    private class MapScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Map);
        }
    }

    private class OperaInformationScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.OperaInformation);
        }
    }

    private class LanguageScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Language);
        }
    }

    private class DepartureTime implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Departure);
        }
    }

    private class TicketInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TicketInformation);
        }
    }

    private class RouteInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.RouteInformation);
        }
    }

    private class AboutUs implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.AboutUs);
        }
    }

    private class InformationOnSights implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.InformationOnSights);
        }
    }

    private class TheLittleMermaidInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TheLittleMermaidInformation);
        }
    }

    private class TrekronerFortressInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TrekronerFortressInformation);
        }
    }

    private class ChristiansborgPalaceInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.ChristiansborgPalaceInformation);
        }
    }

    private class KastelletInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.KastelletInformation);
        }
    }

    private class TheBlackDiamondInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TheBlackDiamondInformation);
        }
    }

    private class OurSaviorusChurchInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.OurSavioursChurchInformation);
        }
    }

    private class TheOldStockExchangeInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TheOldStockExchangeInformation);
        }
    }

    public void initializeListeners() {
        // add listeners to screens
        CP.getUM().addActionListenerWelcomeScreen(new WelcomeScreen());
        CP.getUM().addActionListenerInformationScreen(new Information());
        CP.getUM().addActionListenerChangeLanguage(new LanguageScreen());
        CP.getUM().addActionListenerInformationOnSights(new InformationOnSights());

        CP.getWS().addActionListenerMenu(new Menu());
        CP.getWS().ChangeLanguageDanish(new ChangeLanguageDanish());
        CP.getWS().ChangeLanguageEnglish(new ChangeLanguageEnglish());

        CP.getInfo().addActionListenerMenu(new Menu());
        CP.getInfo().addActionListenerDepartureTime(new DepartureTime());
        CP.getInfo().addActionListenerMenu(new TicketInformation());
        CP.getInfo().addActionListenerTicketInformation(new TicketInformation());
        CP.getInfo().addActionListenerRoutInformation(new RouteInformation());
        CP.getInfo().addActionListenerAboutUs(new AboutUs());

        CP.getMap().addActionListenerOperaInformation(new OperaInformationScreen());
        CP.getMap().addActionListenerBack(new InformationOnSights());

        CP.getOI().addActionListenerMenu(new InformationOnSights());
        CP.getOI().addActionListenerShowOnMap(new MapScreen());

        CP.getLan().addActionListenerChangeLanguage(new ChangeLanguageDanish());
        CP.getLan().addActionListenerChangeLanguageEng(new ChangeLanguageEnglish());
        CP.getLan().addActionListenerBackBtn(new Menu());

        CP.getDT().addActionListenerInformation(new Information());

        CP.getTI().addActionListenerInformation(new Information());

        CP.getRI().addActionListenerInformation(new Information());

        CP.getAU().addActionListenerInformation(new Information());

        CP.getIOS().addActionListenerMenu(new Menu());
        CP.getIOS().addActionListenerTheOpera(new OperaInformationScreen());
        CP.getIOS().addActionListenerTheLittleMermaid(new TheLittleMermaidInformation());
        CP.getIOS().addActionListenerTrekronerFortress(new TrekronerFortressInformation());
        CP.getIOS().addActionListenerChristiansborgPalace(new ChristiansborgPalaceInformation());
        CP.getIOS().addActionListenerKastellet(new KastelletInformation());
        CP.getIOS().addActionListenerOurSaviorsChurch(new OurSaviorusChurchInformation());
        CP.getIOS().addActionListenerTheBlackDiamond(new TheBlackDiamondInformation());
        CP.getIOS().addActionListenerTheOldStockExchange(new TheOldStockExchangeInformation());

        CP.getTLMI().addActionListenerMenu(new InformationOnSights());
        CP.getTLMI().addActionListenerShowOnMap(new MapScreen());

        CP.getTFI().addActionListenerMenu(new InformationOnSights());
        CP.getTFI().addActionListenerShowOnMap(new MapScreen());

        CP.getCPI().addActionListenerMenu(new InformationOnSights());
        CP.getCPI().addActionListenerShowOnMap(new MapScreen());

        CP.getTBDI().addActionListenerMenu(new InformationOnSights());
        CP.getTBDI().addActionListenerShowOnMap(new MapScreen());

        CP.getKI().addActionListenerMenu(new InformationOnSights());
        CP.getKI().addActionListenerShowOnMap(new MapScreen());

        CP.getOSCI().addActionListenerMenu(new InformationOnSights());
        CP.getOSCI().addActionListenerShowOnMap(new MapScreen());

        CP.getTOSEI().addActionListenerShowOnMap(new MapScreen());
        CP.getTOSEI().addActionListenerMenu(new InformationOnSights());
    }
}
