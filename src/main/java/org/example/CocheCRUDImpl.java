package org.example;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Aqui estas llamando al método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Aqui estas llamando el metodo findAll()");

    }

    @Override
    public void delete() {
        System.out.println("Aqui estas llamando el metodo delete()");

    }
}
