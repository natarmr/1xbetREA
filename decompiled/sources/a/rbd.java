package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30179a;
    public final /* synthetic */ w2d b;
    public final /* synthetic */ z77 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ l7m0 e;

    public /* synthetic */ rbd(w2d w2dVar, z77 z77Var, Function1 function1, l7m0 l7m0Var, byte b) {
        this.f30179a = b;
        this.b = w2dVar;
        this.c = z77Var;
        this.d = function1;
        this.e = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30179a;
        final l7m0 l7m0Var = this.e;
        final Function1 function1 = this.d;
        final z77 z77Var = this.c;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    agc.y(null, this.b, u1c.M(864438310, new k57(z77Var, function1, b3), fetVar), u1c.M(-1334693435, new Function2() { // from class: a.tbd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b4 = b2;
                            l7m0 l7m0Var2 = l7m0Var;
                            switch (b4) {
                                case 0:
                                    fet fetVar2 = (fet) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ro4.S(null, z77Var, ((Boolean) l7m0Var2.getValue()).booleanValue(), function1, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    fet fetVar3 = (fet) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
                                        Function1 function2 = function1;
                                        boolean zG = fetVar3.g(function2);
                                        Object objP = fetVar3.P();
                                        if (zG || objP == ukd.f35823a) {
                                            objP = new xv50(function2, (byte) 15);
                                            fetVar3.o0(objP);
                                        }
                                        ay3.h(null, z77Var, zBooleanValue, (Function0) objP, function2, fetVar3, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 3520);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    agc.y(null, this.b, u1c.M(698510731, new k57(z77Var, function1, (byte) 3), fetVar2), u1c.M(-634288470, new Function2() { // from class: a.tbd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b4 = b3;
                            l7m0 l7m0Var2 = l7m0Var;
                            switch (b4) {
                                case 0:
                                    fet fetVar3 = (fet) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        ro4.S(null, z77Var, ((Boolean) l7m0Var2.getValue()).booleanValue(), function1, fetVar3, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    fet fetVar4 = (fet) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
                                        Function1 function2 = function1;
                                        boolean zG = fetVar4.g(function2);
                                        Object objP = fetVar4.P();
                                        if (zG || objP == ukd.f35823a) {
                                            objP = new xv50(function2, (byte) 15);
                                            fetVar4.o0(objP);
                                        }
                                        ay3.h(null, z77Var, zBooleanValue, (Function0) objP, function2, fetVar4, 0);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
