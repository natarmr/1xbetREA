package a;

/* JADX INFO: loaded from: classes2.dex */
public interface cld {
    void D(ugi0 ugi0Var, int i, char c);

    void c(ugi0 ugi0Var);

    void e(vvb0 vvb0Var, int i, short s);

    void i(int i, int i2, ugi0 ugi0Var);

    void j(ugi0 ugi0Var, int i, double d);

    void k(vvb0 vvb0Var, int i, byte b);

    void m(ugi0 ugi0Var, int i, jiy jiyVar, Object obj);

    void n(ugi0 ugi0Var, int i, long j);

    void o(ugi0 ugi0Var, int i, float f);

    void p(ugi0 ugi0Var, int i, jiy jiyVar, Object obj);

    default boolean u(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return true;
    }

    bwn v(vvb0 vvb0Var, int i);

    void x(ugi0 ugi0Var, int i, boolean z);

    void z(ugi0 ugi0Var, int i, String str);
}
