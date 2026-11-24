package a;

/* JADX INFO: loaded from: classes2.dex */
public interface rkj {
    boolean A();

    byte D();

    bld a(ugi0 ugi0Var);

    int h();

    long i();

    int k(ugi0 ugi0Var);

    short p();

    float q();

    double s();

    boolean u();

    char v();

    default Object w(jiy jiyVar) {
        jiyVar.getClass();
        return jiyVar.deserialize(this);
    }

    rkj y(ugi0 ugi0Var);

    String z();
}
