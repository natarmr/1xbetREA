package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class cco implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4x f4121a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cml d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ qdz f;
    public final /* synthetic */ Function1 g;

    public cco(a4x a4xVar, boolean z, boolean z2, cml cmlVar, Function1 function1, qdz qdzVar, Function1 function2) {
        this.f4121a = a4xVar;
        this.b = z;
        this.c = z2;
        this.d = cmlVar;
        this.e = function1;
        this.f = qdzVar;
        this.g = function2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0283  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.f4121a.get(iIntValue);
            fetVar.e0(1026568493);
            if (iIntValue == 1) {
                zcl zclVar = qmk.f28987a;
                f = 8.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 12.0f;
            }
            mm40 mm40VarB = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, f, 0.0f, 0.0f, 13);
            if (p6t0Var == null) {
                fetVar.e0(1031291807);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof uqv;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.e;
                if (z) {
                    fetVar.e0(1026632352);
                    if (!this.b) {
                        mm40VarB = o7k0.b(mm40VarB, 0.0f, 8.0f, 1);
                    }
                    mm40 mm40VarE0 = o2e.e0(mm40VarB, "HEADER_CONTAINER");
                    uqv uqvVar = (uqv) p6t0Var;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new fzg(function1, (byte) 18);
                        fetVar.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new fzg(function1, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    vtb.B(mm40VarE0, uqvVar, this.c, this.d, function2, (Function1) objP2, fetVar, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (p6t0Var instanceof wbo) {
                    fetVar.e0(1027741842);
                    mm40 mm40VarE1 = o2e.e0(mm40VarN, "EVENT_FOCUS_DISCIPLINE_LIST");
                    wbo wboVar = (wbo) p6t0Var;
                    boolean zG3 = fetVar.g(function1);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new cnn(function1, (byte) 2);
                        fetVar.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG4 = fetVar.g(function1);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new fzg(function1, (byte) 22);
                        fetVar.o0(objP4);
                    }
                    pzb.s(mm40VarE1, this.f, wboVar, function0, (Function1) objP4, fetVar, 0);
                    fetVar.r(false);
                } else if (p6t0Var instanceof nco) {
                    fetVar.e0(1028256225);
                    nco ncoVar = (nco) p6t0Var;
                    boolean zG5 = fetVar.g(function1);
                    Object objP5 = fetVar.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new cnn(function1, (byte) 3);
                        fetVar.o0(objP5);
                    }
                    Function0 function3 = (Function0) objP5;
                    boolean zG6 = fetVar.g(function1);
                    Object objP6 = fetVar.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new fzg(function1, (byte) 23);
                        fetVar.o0(objP6);
                    }
                    wzb.w(mm40VarN, ncoVar, this.f, function3, (Function1) objP6, fetVar, 0);
                    fetVar.r(false);
                } else if (p6t0Var instanceof jco) {
                    fetVar.e0(1028758146);
                    jco jcoVar = (jco) p6t0Var;
                    boolean zG7 = fetVar.g(function1);
                    Object objP7 = fetVar.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new cnn(function1, (byte) 4);
                        fetVar.o0(objP7);
                    }
                    Function0 function4 = (Function0) objP7;
                    boolean zG8 = fetVar.g(p6t0Var) | fetVar.g(function1);
                    Object objP8 = fetVar.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new dco(p6t0Var, function1);
                        fetVar.o0(objP8);
                    }
                    vzb.m(mm40VarN, this.f, jcoVar, function4, (Function1) objP8, fetVar, 0);
                    fetVar.r(false);
                } else if (p6t0Var instanceof zbo) {
                    fetVar.e0(1029493280);
                    zbo zboVar = (zbo) p6t0Var;
                    boolean zG9 = fetVar.g(function1);
                    Object objP9 = fetVar.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new cnn(function1, (byte) 5);
                        fetVar.o0(objP9);
                    }
                    Function0 function5 = (Function0) objP9;
                    boolean zG10 = fetVar.g(function1);
                    Object objP10 = fetVar.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new fzg(function1, (byte) 19);
                        fetVar.o0(objP10);
                    }
                    qzb.u(mm40VarN, this.f, zboVar, function5, (Function1) objP10, fetVar, 0);
                    fetVar.r(false);
                } else if (p6t0Var instanceof vkw) {
                    fetVar.e0(1029949817);
                    vkw vkwVar = (vkw) p6t0Var;
                    boolean zG11 = fetVar.g(function1);
                    Object objP11 = fetVar.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new cnn(function1, (byte) 1);
                        fetVar.o0(objP11);
                    }
                    aad.n(mm40VarN, vkwVar, (Function0) objP11, fetVar, 0, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (p6t0Var instanceof hco) {
                    fetVar.e0(1030475174);
                    hco hcoVar = (hco) p6t0Var;
                    boolean zG12 = fetVar.g(function1);
                    Object objP12 = fetVar.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new hrk(function1, (byte) 3);
                        fetVar.o0(objP12);
                    }
                    Function2 function6 = (Function2) objP12;
                    boolean zG13 = fetVar.g(function1);
                    Object objP13 = fetVar.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new fzg(function1, (byte) 20);
                        fetVar.o0(objP13);
                    }
                    cem0.i(mm40VarN, hcoVar, this.f, this.g, function6, (Function1) objP13, fetVar, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else {
                    fetVar.e0(1031291807);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
