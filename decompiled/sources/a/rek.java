package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30339a = 0;

    static {
        g950.e("value");
    }

    public static final boolean a(k3u0 k3u0Var) {
        k3u0Var.getClass();
        Boolean boolT = ntb.T(kotlin.collections.a.c(k3u0Var), m2a.k, qek.f28588a);
        boolT.getClass();
        return boolT.booleanValue();
    }

    public static mp9 b(mp9 mp9Var, Function1 function1) {
        mp9Var.getClass();
        return (mp9) ntb.H(kotlin.collections.a.c(mp9Var), new pek(), new ryh(new mie0(), function1));
    }

    public static final swq c(xjj xjjVar) {
        twq twqVarF = oek.f(xjjVar);
        twqVarF.getClass();
        if (!twqVarF.d()) {
            twqVarF = null;
        }
        if (twqVarF != null) {
            return twqVarF.i();
        }
        return null;
    }

    public static final wm40 d(t83 t83Var) {
        t83Var.getClass();
        foc focVarN = t83Var.getType().S().n();
        if (focVarN instanceof wm40) {
            return (wm40) focVarN;
        }
        return null;
    }

    public static final ary e(vjj vjjVar) {
        vjjVar.getClass();
        return i(vjjVar).c();
    }

    public static final qlc f(foc focVar) {
        vjj vjjVarJ;
        qlc qlcVarF;
        if (focVar == null || (vjjVarJ = focVar.j()) == null) {
            return null;
        }
        if (vjjVarJ instanceof mg80) {
            swq swqVar = ((ng80) ((mg80) vjjVarJ)).f;
            g950 name = focVar.getName();
            name.getClass();
            return new qlc(swqVar, name);
        }
        if (!(vjjVarJ instanceof goc) || (qlcVarF = f((foc) vjjVarJ)) == null) {
            return null;
        }
        g950 name2 = focVar.getName();
        name2.getClass();
        return qlcVarF.d(name2);
    }

    public static final swq g(vjj vjjVar) {
        vjjVar.getClass();
        if (vjjVar != null) {
            swq swqVarG = oek.g(vjjVar);
            return swqVarG != null ? swqVarG : oek.h(vjjVar).i();
        }
        oek.a(3);
        throw null;
    }

    public static final void h(ym40 ym40Var) {
        ym40Var.getClass();
        if (ym40Var.h0(dty.f6674a) == null) {
            return;
        }
        hny.b();
    }

    public static final ym40 i(vjj vjjVar) {
        vjjVar.getClass();
        ym40 ym40VarC = oek.c(vjjVar);
        ym40VarC.getClass();
        return ym40VarC;
    }

    public static final mp9 j(mp9 mp9Var) {
        mp9Var.getClass();
        if (!(mp9Var instanceof b0d0)) {
            return mp9Var;
        }
        d0d0 d0d0VarP1 = ((b0d0) mp9Var).p1();
        d0d0VarP1.getClass();
        return d0d0VarP1;
    }
}
