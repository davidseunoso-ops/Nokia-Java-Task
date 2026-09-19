import java.util.Scanner;
public class Nokia {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
String mainMenu = """
========================= MAIN MENU ===========================
                          [Press]
        
                          1.  Phone book
                          2.  Messages
                          3.  Chat
                          4.  Call register
                          5.  Tones
                          6.  Settings
                          7.  Call divert
                          8.  Music
                          9.  Games
                          10. Calculator
                          11. Reminders
                          12. Clock
                          13. Profiles
                          14. Services
                          15. SIM services
===============================================================
        
""";

    System.out.println(mainMenu);
    int menuChoice = input.nextInt();
    
    switch(menuChoice) {
    
      case 1 -> {System.out.println("Phone book");
String phoneBook = """

================== PHONE BOOK ==========================
                Press[Menu] and then [select]
                
                1.  Search
                2.  Service Nos.
                3.  Add name
                4.  Erase
                5.  Edit
                6.  Copy
                7.  Assign tone
                8.  Send b"card
                9.  Options
                10. Speed dials
                11. Voice tags
=========================================================

""";

      System.out.println(phoneBook);
      int pressPhoneBook = input.nextInt();
      
      switch(pressPhoneBook) {
      
      case 1 -> System.out.println("Search: ");
      case 2 -> System.out.println("Service No: ");
      case 3 -> System.out.println("Add Name: ");
      case 4 -> System.out.println("Erase: ");
      case 5 -> System.out.println("Edit: ");
      case 6 -> System.out.println("Copy: ");
      case 7 -> System.out.println("Assign Tone: ");
      case 8 -> System.out.println("Send your Business Card: ");
      case 9 -> {
                      String options = """
============================ OPTIONS ====================================
                            [Select]
                            1.  Memory in use
                            2.  Type of view
                            3.  Memory status
=========================================================================

""";

    System.out.println(options);
    
                System.out.print("Input Number Choice: ");
                int subOptions = input.nextInt();
                
                switch(subOptions) {
                  case 1 -> System.out.println("Memory in use");
                  case 2 -> System.out.println("Type of view");
                  case 3 -> System.out.println("Memory status");
                  default -> System.out.println("Invalid");
          }
      }
      case 10 -> System.out.println("Speed dials: ");
      case 11 -> System.out.println("Voice tags: ");
      default -> System.out.println("Invalid");       
          }
     }
     case 2 -> {System.out.println("Messages");
String messages = """

========================= MESSAGES ================================
                        
                         Press[Menu] and then [select]
                
                         1.  Write messages
                         2.  Inbox
                         3.  Outbox
                         4.  Picture messages
                         5.  Templates
                         6.  Smileys
                         7.  Message settings
                         8.  info service
                         9.  Voice mailbox number
                         10. Service command editor
===================================================================
                
""";
  
      System.out.println(messages);
      int smsMessages = input.nextInt();
      
      switch(smsMessages) {
      
      case 1 -> System.out.println("Write a message");
      case 2 -> System.out.println("Inbox");
      case 3 -> System.out.println("Outbox");
      case 4 -> System.out.println("Picture messages");
      case 5 -> System.out.println("Templates");
      case 6 -> System.out.println("Smileys");
      case 7 -> {
                      String messageSettings = """
============================= MESSAGE SETTINGS =================================
                              Options[Select]
                              1.  Set 1
                              2.  Common
================================================================================
""";

      System.out.println(messageSettings);
      
                          System.out.print("Input Number Choice: ");
                          int subOptions1 = input.nextInt();
                          switch(subOptions1) {
                             case 1 -> {
                                System.out.println("Set");
                            
                        String set = """
================================ SET ================================
                              [Select]
                              1.  Message centre number
                              2.  Message sent as
                              3.  Message validity
=====================================================================

""";

        System.out.println(set);
        
                      System.out.print("Input Number Choice: ");
                      int subOption2 = input.nextInt();
                      switch(subOption2) {
                          case 1 -> System.out.println("Message centre number");
                          case 2 -> System.out.println("Message sent as");
                          case 3 -> System.out.println("Message validity");
                          default -> System.out.println("Invalid");
                                          }
                                     }
                                   
                         case 2 -> {
                             System.out.println("Common");
                        
                        String common = """
================================= COMMON ===================================
                                [Select]
                                1.  Delivery reports
                                2.  Reply via same centre
                                3.  Character support
============================================================================

""";
        System.out.println(common);
        
                        System.out.print("Input Number Choice: ");
                        int subOption3 = input.nextInt();
                        switch(subOption3) {
                            case 1 -> System.out.println("Delivery reports");
                            case 2 -> System.out.println("Reply via same centre");
                            case 3 -> System.out.println("Character via support"); 
                            default -> System.out.println("Invalid");
                                           }
                                      }
                                }
                          }
      case 8 -> System.out.println("Info service"); 
      case 9 -> System.out.println("Voice mailbox number");
      case 10 -> System.out.println("Service command editor");
      default -> System.out.println("Invalid");
              }
        }
      case 3 -> System.out.println("Chat");      
      
      case 4 -> {System.out.println("Call register");
String callRegister = """

============================= CALL REGISTER ================================
    
                            Press[Menu] and then [select]
                            1.  Missed calls
                            2.  Recieved calls
                            3.  Dialled numbers
                            4.  Erase recent call lists
                            5.  Show call duration
                            6.  Show call costs
                            7.  Call cost settings
                            8.  Prepaid credit
============================================================================

""";
      System.out.println(callRegister);
      int register = input.nextInt();
      
      switch(register) {
      
          case 1 -> System.out.println("Missed calls");
          case 2 -> System.out.println("Recieved calls");
          case 3 -> System.out.println("Dialled numbers");
          case 4 -> System.out.println("Erased recent call lists");
          case 5 -> {
                            String callDuration = """
================================== CALL DURATION ===============================
                                  [Select]
                                  1.  Last call duration
                                  2.  All calls' duration
                                  3.  Recieved calls' duration
                                  4.  Dialled calls' duration
                                  5.  Clear timers
================================================================================

""";
      System.out.println(callDuration);
      
                         System.out.print("Input Number Choice: ");
                         int duration = input.nextInt();
                         switch(duration) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Recieved calls' duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                      }
              }
              
          case 6 -> {
                          String callCosts = """
================================ CALL COSTS ===============================
                                [Selects]
                                1.  Last call costs
                                2.  All calls' cost
                                3.  Clear counters
===========================================================================

""";
      System.out.println(callCosts);
      
                            System.out.println("Input Number Choice: ");
                            int costs = input.nextInt();
                            switch(costs) {
                                case 1 -> System.out.println("Last call costs");
                                case 2 -> System.out.println("All calls' cost");
                                case 3 -> System.out.println("Clear counters");
                        }
                 }
           
          case 7 -> {
                                String callCostSettings = """
=================================== CALL COST SETTINGS ==============================
                                  [Select]
                                  1.  Call cost limit
                                  2.  Show costs in
=====================================================================================

""";  
        System.out.println(callCostSettings);
        
                            System.out.println("Input Number Choice: ");
                            int costSettings = input.nextInt();
                            switch(costSettings) {
                                  case 1 -> System.out.println("Call cost limit");
                                  case 2 -> System.out.println("Show cost in");
                        }
                 }
                 
          case 8 -> System.out.println("Prepaid credit");
          default -> System.out.println("Invalid");
                        }
                }
          case 5 -> {System.out.println("Tones");  
String tones = """

============================== TONES ================================
                           Press[Menu] and then [select]
                           1. Ringing tone
                           2. Ringing volume
                           3. Incoming call alert
                           4. Message alert tone
                           5. Keypad tones
                           6. Warning tones
                           7. Vibrating alert
                           8. Screen saver
======================================================================

""";
        System.out.println(tones);
        
                            System.out.println("Input Number Choice: ");
                            int toneList = input.nextInt();
                            switch(toneList) {
                                    case 1 -> System.out.println("Ringing tone");
                                    case 2 -> System.out.println("Ringing volume");
                                    case 3 -> System.out.println("Incoming call alert");
                                    case 4 -> System.out.println("Message alert tone");
                                    case 5 -> System.out.println("Keypad tones");
                                    case 6 -> System.out.println("Warning tones");
                                    case 7 -> System.out.println("Vibrating alert");
                                    case 8 -> System.out.println("Screen saver");
                                    default -> System.out.println("Invalid");
                      }
              }
           case 6 -> {System.out.println("Settings");
String settings = """

============================== SETTINGS =================================
                              Press[Menu] and then [select]
                              1.  Call settings
                              2.  Phone settings
                              3.  Security settings
                              4.  Restore factory settings
=========================================================================

""";
            System.out.println(settings);
            
                             System.out.println("Input Number Choice: ");
                             int settingLists = input.nextInt();
                             switch(settingLists) {
                                      case 1 -> {
                                  String callSettings = """
================================== CALL SETTINGS ===============================
                                  [Select]
                                  1.  Automatic redial
                                  2.  Speed dialling
                                  3.  Call waiting options
                                  4.  Own number sending
                                  5.  Phone line in use
                                  6.  Automatic answer
================================================================================

""";
      System.out.println(callSettings);
      
                         System.out.print("Input Number Choice: ");
                         int call = input.nextInt();
                         switch(call) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialling");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                      }
              }
                                       case 2 -> {
                                  String phoneSettings = """
================================== PHONES SETTINGS ===============================
                                  [Select]
                                  1.  Language
                                  2.  Cell info display
                                  3.  Welcome note
                                  4.  Network selection
                                  5.  Confirm SIM service actions
===================================================================================

""";
      System.out.println(phoneSettings);
      
                         System.out.print("Input Number Choice: ");
                         int phone = input.nextInt();
                         switch(phone) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Confirm SIM service actions");
                      }
              }
                                         case 3 -> {
                                  String securitySettings = """
================================== SECURITY SETTINGS ===============================
                                  [Select]
                                  1.  PIN code request
                                  2.  Call barring service
                                  3.  Fixed dialling
                                  4.  Closed user group
                                  5.  Security level
                                  6.  Change access codes
====================================================================================

""";
      System.out.println(securitySettings);
      
                         System.out.print("Input Number Choice: ");
                         int security = input.nextInt();
                         switch(security) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Security level");
                            case 6 -> System.out.println("Change access codes");
                      }
              }
                                      case 4 -> System.out.println("Restore factory setting");
                                      default -> System.out.println("Invalid");
                      }
              }
        case 7 -> System.out.println("Call divert");
        case 8 -> {System.out.println("Music");
String music = """

============================== MUSIC ================================
                           Press[Menu] and then [select]
                           1. Music player
                           2. Radio
                           3. Recorder
                           4. Track list
======================================================================

""";
        System.out.println(music);
        
                            System.out.println("Input Number Choice: ");
                            int musicMenu = input.nextInt();
                            switch(musicMenu) {
                                    case 1 -> System.out.println("Music player");
                                    case 2 -> System.out.println("Radio");
                                    case 3 -> System.out.println("Recorder");
                                    case 4 -> System.out.println("Track list");
                                    default -> System.out.println("Invalid");
                      }
              }     
        case 9 -> System.out.println("Games");
        
        case 10 -> System.out.println("Calculator");
        
        case 11 -> System.out.println("Reminders");
        
        case 12 -> {System.out.println("Clock"); 
String clock = """

============================== CLOCK ================================
                           Press[Menu] and then [select]
                           1. Alarm clock
                           2. Clock settings
                           3. Date setting
                           4. Stopwatch
                           5. Countdown timer
                           6. Auto update of date and time
======================================================================

""";
        System.out.println(clock);
        
                            System.out.println("Input Number Choice: ");
                            int clockMenu = input.nextInt();
                            switch(clockMenu) {
                                    case 1 -> System.out.println("Alarm clock");
                                    case 2 -> System.out.println("Clock settings");
                                    case 3 -> System.out.println("Date setting");
                                    case 4 -> System.out.println("Stopwatch");
                                    case 5 -> System.out.println("Countdown timer");
                                    case 6 -> System.out.println("Auto update of date and time");
                                    default -> System.out.println("Invalid");
                      }
              }
      case 13 -> System.out.println("Profiles");
      
      case 14 -> System.out.println("Services");
      
      case 15 -> System.out.println("SIM services");
      
      default -> System.out.println("Invalid");
      
                }
          }
  }
      
     
  
