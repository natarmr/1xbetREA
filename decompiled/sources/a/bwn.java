package a;

/* JADX INFO: loaded from: classes2.dex */
public interface bwn {
    bwn A(ugi0 ugi0Var);

    void B(int i);

    default void C(jiy jiyVar, Object obj) {
        jiyVar.getClass();
        jiyVar.serialize(this, obj);
    }

    void E(String str);

    cld a(ugi0 ugi0Var);

    qaj b();

    void g(double d);

    void h(byte b);

    void l(long j);

    void q();

    void r(short s);

    void s(boolean z);

    void t(float f);

    void w(char c);

    void y(ugi0 ugi0Var, int i);
}
