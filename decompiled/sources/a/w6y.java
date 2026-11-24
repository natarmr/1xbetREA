package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w6y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38646a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ w6y(byte b, pz40 pz40Var, Function0 function0) {
        this.f38646a = b;
        this.b = pz40Var;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm40 x7zVar;
        mm40 x7zVar2;
        byte b = this.f38646a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Function0 function0 = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((mn5) pz40Var.getValue()).c) {
                        fetVar.e0(-2082317762);
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        x7z x7zVar3 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false);
                        boolean zG = fetVar.g(function0);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new dbn(function0, (byte) 27);
                            fetVar.o0(objP);
                        }
                        x7zVar = y860.W(x7zVar3, null, null, false, null, (Function0) objP, 28);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-2082020534);
                        fetVar.r(false);
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false);
                    }
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, x7zVar);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    v8q0.a(((mn5) pz40Var.getValue()).f22072a, dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 110588);
                    v8q0.a(((mn5) pz40Var.getValue()).b, jm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 48, 24576, 114684);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((ln5) pz40Var.getValue()).c) {
                        fetVar2.e0(-1284224356);
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        x7z x7zVar4 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false);
                        boolean zG2 = fetVar2.g(function0);
                        Object objP2 = fetVar2.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new dbn(function0, (byte) 28);
                            fetVar2.o0(objP2);
                        }
                        x7zVar2 = y860.W(x7zVar4, null, null, false, null, (Function0) objP2, 28);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1283927128);
                        fetVar2.r(false);
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        x7zVar2 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false);
                    }
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    v8q0.a(((ln5) pz40Var.getValue()).f20327a, dw9.h(1.0f, s5x0.N(jm40Var2, 0.0f, 0.0f, 2.0f, 0.0f, 11), false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar2, 0, 24960, 110588);
                    v8q0.a(((ln5) pz40Var.getValue()).b, jm40Var2, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar2, 48, 24576, 114684);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
