package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class lyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f20876a;

    static {
        i1t0 i1t0Var = cc3.f4091a;
        f20876a = 64.0f;
        int i = ac3.f610a;
        int i2 = zb3.f44095a;
        int i3 = qb3.f28428a;
        int i4 = pb3.f26686a;
    }

    public static zyn a(oyq0 oyq0Var, Function0 function0, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            oyq0Var = ob3.d(0, 7, fetVar);
        }
        int i3 = i2 & 2;
        Object obj = ukd.f35823a;
        if (i3 != 0) {
            Object objP = fetVar.P();
            if (objP == obj) {
                objP = new zxb((byte) 28);
                fetVar.o0(objP);
            }
            function0 = (Function0) objP;
        }
        nul0 nul0VarP = d7x.P(yt40.c, fetVar);
        sjj sjjVarA = wzk0.a(fetVar);
        boolean zG = ((((i & 14) ^ 6) > 4 && fetVar.g(oyq0Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && fetVar.g(function0)) || (i & 48) == 32) | fetVar.g(nul0VarP) | fetVar.g(sjjVarA) | ((((57344 & i) ^ 24576) > 16384 && fetVar.h(false)) || (i & 24576) == 16384);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj) {
            objP2 = new zyn(sjjVarA, nul0VarP, oyq0Var, function0);
            fetVar.o0(objP2);
        }
        return (zyn) objP2;
    }

    public static clo b(oyq0 oyq0Var, fet fetVar, int i) {
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new zxb((byte) 28);
            fetVar.o0(objP);
        }
        Function0 function0 = (Function0) objP;
        nul0 nul0VarP = d7x.P(yt40.c, fetVar);
        sjj sjjVarA = wzk0.a(fetVar);
        boolean zG = ((((i & 14) ^ 6) > 4 && fetVar.g(oyq0Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && fetVar.g(function0)) || (i & 48) == 32) | fetVar.g(nul0VarP) | fetVar.g(sjjVarA);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj) {
            objP2 = new clo(sjjVarA, nul0VarP, oyq0Var, function0);
            fetVar.o0(objP2);
        }
        return (clo) objP2;
    }
}
