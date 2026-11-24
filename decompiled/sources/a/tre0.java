package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class tre0 {
    public sgy b(Class cls) {
        return new bmc(cls);
    }

    public ghy c(Class cls) {
        return new wg80(cls);
    }

    public String i(ger gerVar) {
        String string = gerVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(guy guyVar) {
        return i(guyVar);
    }

    public kiy k(sgy sgyVar, List list, boolean z) {
        return new szs0(sgyVar, list, z);
    }

    public jhy a(qer qerVar) {
        return qerVar;
    }

    public rhy d(cz40 cz40Var) {
        return cz40Var;
    }

    public thy e(dz40 dz40Var) {
        return dz40Var;
    }

    public eiy f(h0d0 h0d0Var) {
        return h0d0Var;
    }

    public giy g(i0d0 i0d0Var) {
        return i0d0Var;
    }

    public hiy h(k0d0 k0d0Var) {
        return k0d0Var;
    }
}
