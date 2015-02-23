package es.marcos.inmobiliariacp;

import android.os.Parcel;
import android.os.Parcelable;


public class Inmueble implements Parcelable,Comparable<Inmueble> {
    private int id;
    private String direccion;
    private String titulo;
    private double precio;
    private int subido;



    public static final Creator<Inmueble> CREATOR = new Creator<Inmueble>() {
        @Override
        public Inmueble createFromParcel(Parcel p) {
            int id=p.readInt();
            String direccion = p.readString();
            String titulo = p.readString();
            Double precio = p.readDouble();
            int subido = p.readInt();
            return new Inmueble(id, direccion, titulo, precio, subido);
        }
        @Override
        public Inmueble[] newArray(int i) {
            return new Inmueble[i];
        }
    };

    public Inmueble() {
    }

    public Inmueble(int id, String direccion, String titulo, double precio, int subido){
        this.id = id;
        this.direccion = direccion;
        this.titulo = titulo;
        this.precio = precio;
        this.subido = subido;
    }
    public Inmueble( String direccion, String titulo, String precio){
        this.direccion = direccion;
        this.titulo = titulo;
        try{
            this.precio = Double.parseDouble(precio);
        }catch (NumberFormatException e){
            this.precio = 0;
        }
        this.subido = 0;
    }




    @Override
    public int hashCode() {
         return (int) (id ^ (id >>> 32));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tipo) {
        this.titulo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int isSubido() {
        return subido;
    }

    public void setSubido(int subido) {
        this.subido = subido;
    }


    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", tipo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        Inmueble i=(Inmueble)o;
        if (this.id==i.getId()) {
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Inmueble another) {
        if (this.direccion.compareToIgnoreCase(another.direccion) >0 ) {
            return 1;
        } else if (this.direccion.compareToIgnoreCase(another.direccion) <0 ) {
            return -1;
        }
        return 0;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(direccion);
        dest.writeString(titulo);
        dest.writeDouble(precio);
    }
}
