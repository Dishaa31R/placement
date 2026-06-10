package Day4;

interface FeedRemote{
    String[][] feedbacks=new String[2][3];
    void createFeedBack(int id,String comment);
    void readFeedBack(int id);
    void deleteFeedBack(int id);
}
class FeedBackService implements FeedRemote{
 
    @Override
    public void createFeedBack(int id, String comment) {

        if(id>=0 && id<feedbacks.length){
            for(int index=0;index<3;index++){
                if(feedbacks[id][index]==null||feedbacks[id][index]==""){
                    feedbacks[id][index]=comment;
                    System.out.println(comment + "noted");
                    return;
                }
            }
            System.out.println("Feedback buffer is full");
         }
         else System.out.println("Invalid batch");
        }
     

    @Override
    public void readFeedBack(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readFeedBack'");
    }

    @Override
    public void deleteFeedBack(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFeedBack'");
    }
    

public class DemoInter {
    public static void main(String[] args) {
        FeedBackService service=new FeedBackService();
        service.createFeedBack(1,"Good");
        service.createFeedBack(2,"Average");
        service.createFeedBack(0,"Excellent");
        service.createFeedBack(1,"Good");
        service.createFeedBack(1,"Good");



    }
}
