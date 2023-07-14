public class Contato {
    private String nome;
    private String phone;
    private int age;
    private String addr;

    Contato(String nome, String phone, int age, String addr){
        this.nome = nome;
        this.phone = phone;
        this.age = age;
        this.addr = addr;
    }

    public String getNome(){
        return this.nome;
    }
    public String getPhone(){
        return this.phone;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddr(){
        return this.addr;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddr(String addr){
        this.addr = addr;
    }

    void getDesc(){
        System.out.println("Nome: "+this.nome+" - "+this.age+" anos");
        System.out.println("Telefone: "+this.phone);
        System.out.println("Endereço: "+this.addr);
    }
}
