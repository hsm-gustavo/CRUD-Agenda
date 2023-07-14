import java.util.ArrayList;

public class Agenda{
    private ArrayList<Contato> agenda = new ArrayList<>();
    
    void create(String nome, String phone, int age, String addr){
        Contato contato = new Contato(nome, phone, age, addr);
        agenda.add(contato);
    }

    void read(){
        for(Contato i:agenda){
            i.getDesc();
            System.out.println("------------------------------------------");
        }
    }

    void update(int index, String nome, String phone, int age, String addr){
        if(!(nome.isEmpty())){
            agenda.get(index).setNome(nome);
        }
        if(!(phone.isEmpty())){
            agenda.get(index).setPhone(phone);
        }
        if(age>0){
            agenda.get(index).setAge(age);
        }
        if(!(addr.isEmpty())){
            agenda.get(index).setAddr(addr);
        }
    }

    void delete(int index){
        agenda.remove(index);
    }


}