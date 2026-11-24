package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface bv3 {
    void a(int i, int i2, int i3);

    void b(int i, int i2);

    default void c(Object obj, Function2 function2) {
        function2.invoke(f(), obj);
    }

    void d(int i, Object obj);

    Object f();

    void h(int i, Object obj);

    void i(Object obj);

    default void j() {
        Object objF = f();
        zjd zjdVar = objF instanceof zjd ? (zjd) objF : null;
        if (zjdVar != null) {
            zjdVar.e();
        }
    }

    void l();

    default void e() {
    }
}
