package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class z3l0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43725a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ ngk0 g;
    public final /* synthetic */ pz40 h;

    public /* synthetic */ z3l0(List list, xdr xdrVar, Function1 function1, Function0 function0, Function0 function2, ngk0 ngk0Var, pz40 pz40Var, byte b) {
        this.f43725a = b;
        this.b = list;
        this.c = xdrVar;
        this.d = function1;
        this.e = function0;
        this.f = function2;
        this.g = ngk0Var;
        this.h = pz40Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.f43725a;
        pz40 pz40Var = this.h;
        List list = this.b;
        xdr xdrVar = this.c;
        cl5 cl5Var = ukd.f35823a;
        ngk0 ngk0Var = this.g;
        mm40 mm40VarD0 = jm40.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    dsm dsmVar = (dsm) list.get(iIntValue);
                    fetVar.e0(1280492971);
                    String key = dsmVar.getKey();
                    if (xdrVar != null) {
                        fetVar.e0(1280540772);
                        boolean zG = fetVar.g(key);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new x3l0(ngk0Var, key, (byte) 0);
                            fetVar.o0(objP);
                        }
                        m0x0.o(key, (Function1) objP, fetVar);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1280678195);
                        fetVar.r(false);
                    }
                    if (xdrVar != null) {
                        fetVar.e0(1280766452);
                        boolean zG2 = fetVar.g(key);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new y3l0(pz40Var, ngk0Var, key, (byte) 0);
                            fetVar.o0(objP2);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1280988195);
                        fetVar.r(false);
                    }
                    tke.p(mm40VarD0, dsmVar, this.d, this.e, this.f, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    dsm dsmVar2 = (dsm) list.get(iIntValue3);
                    fetVar2.e0(-1024742986);
                    String key2 = dsmVar2.getKey();
                    if (xdrVar != null) {
                        fetVar2.e0(-1024695185);
                        boolean zG3 = fetVar2.g(key2);
                        Object objP3 = fetVar2.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new x3l0(ngk0Var, key2, (byte) 1);
                            fetVar2.o0(objP3);
                        }
                        m0x0.o(key2, (Function1) objP3, fetVar2);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1024557762);
                        fetVar2.r(false);
                    }
                    if (xdrVar != null) {
                        fetVar2.e0(-1024469505);
                        boolean zG4 = fetVar2.g(key2);
                        Object objP4 = fetVar2.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new y3l0(pz40Var, ngk0Var, key2, (byte) 1);
                            fetVar2.o0(objP4);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1024247762);
                        fetVar2.r(false);
                    }
                    x8f.q(mm40VarD0, dsmVar2, this.d, this.e, this.f, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    dsm dsmVar3 = (dsm) list.get(iIntValue5);
                    fetVar3.e0(-137239305);
                    String key3 = dsmVar3.getKey();
                    if (xdrVar != null) {
                        fetVar3.e0(-137191504);
                        boolean zG5 = fetVar3.g(key3);
                        Object objP5 = fetVar3.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new x3l0(ngk0Var, key3, (byte) 2);
                            fetVar3.o0(objP5);
                        }
                        m0x0.o(key3, (Function1) objP5, fetVar3);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-137054081);
                        fetVar3.r(false);
                    }
                    if (xdrVar != null) {
                        fetVar3.e0(-136965824);
                        boolean zG6 = fetVar3.g(key3);
                        Object objP6 = fetVar3.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new y3l0(pz40Var, ngk0Var, key3, (byte) 2);
                            fetVar3.o0(objP6);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP6);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-136744081);
                        fetVar3.r(false);
                    }
                    saj.h(mm40VarD0, dsmVar3, this.d, this.e, this.f, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    dsm dsmVar4 = (dsm) list.get(iIntValue7);
                    fetVar4.e0(892815485);
                    String key4 = dsmVar4.getKey();
                    if (xdrVar != null) {
                        fetVar4.e0(892863286);
                        boolean zG7 = fetVar4.g(key4);
                        Object objP7 = fetVar4.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new x3l0(ngk0Var, key4, (byte) 3);
                            fetVar4.o0(objP7);
                        }
                        m0x0.o(key4, (Function1) objP7, fetVar4);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(893000709);
                        fetVar4.r(false);
                    }
                    if (xdrVar != null) {
                        fetVar4.e0(893088966);
                        boolean zG8 = fetVar4.g(key4);
                        Object objP8 = fetVar4.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new y3l0(pz40Var, ngk0Var, key4, (byte) 3);
                            fetVar4.o0(objP8);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP8);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(893310709);
                        fetVar4.r(false);
                    }
                    qjj.h(mm40VarD0, dsmVar4, this.d, this.e, this.f, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
