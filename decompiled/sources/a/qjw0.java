package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface qjw0 {
    static jlw0 e(qjw0 qjw0Var, slw0 slw0Var, h0q0 h0q0Var, ArrayList arrayList) {
        String str = slw0Var.f32420a;
        if (qjw0Var.g(str)) {
            jlw0 jlw0VarB = qjw0Var.b(str);
            if (jlw0VarB instanceof giw0) {
                return ((giw0) jlw0VarB).a(h0q0Var, arrayList);
            }
            jf4.o(ohs0.n(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            pvm0.D("hasOwnProperty", arrayList, 1);
            return qjw0Var.g(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc()) ? jlw0.a1 : jlw0.b1;
        }
        jf4.o(kng0.k("Object has no function ", str));
        return null;
    }

    jlw0 b(String str);

    void f(String str, jlw0 jlw0Var);

    boolean g(String str);
}
