package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ezg implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8670a;
    public final /* synthetic */ List b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ ezg(List list, mm40 mm40Var, boolean z, Function1 function1, byte b) {
        this.f8670a = b;
        this.b = list;
        this.c = mm40Var;
        this.d = z;
        this.e = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        fet fetVar2;
        byte b = this.f8670a;
        List list = this.b;
        Function1 function1 = this.e;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    a2n a2nVar = (a2n) list.get(iIntValue);
                    fetVar3.e0(-1422398654);
                    if (a2nVar == null) {
                        fetVar = fetVar3;
                    } else {
                        if (a2nVar instanceof y56) {
                            fetVar3.e0(-1422360742);
                            y56 y56Var = (y56) a2nVar;
                            boolean zG = fetVar3.g(function1);
                            Object objP = fetVar3.P();
                            if (zG || objP == cl5Var) {
                                objP = new qr0(function1, (byte) 27);
                                fetVar3.o0(objP);
                            }
                            vcc.i(this.c, y56Var, this.d, (Function1) objP, null, fetVar3, 0, 16);
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (a2nVar instanceof c2o0) {
                                fetVar.e0(-1421904298);
                                c2o0 c2o0Var = (c2o0) a2nVar;
                                boolean zG2 = fetVar.g(function1);
                                Object objP2 = fetVar.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new qr0(function1, (byte) 28);
                                    fetVar.o0(objP2);
                                }
                                hkb.n(this.c, c2o0Var, this.d, (Function1) objP2, null, fetVar, 0, 16);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(-1421484744);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    a2n a2nVar2 = (a2n) list.get(iIntValue3);
                    fetVar4.e0(-1205962189);
                    if (a2nVar2 == null) {
                        fetVar2 = fetVar4;
                    } else {
                        if (a2nVar2 instanceof y56) {
                            fetVar4.e0(-1205899973);
                            y56 y56Var2 = (y56) a2nVar2;
                            boolean zG3 = fetVar4.g(function1);
                            Object objP3 = fetVar4.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new qr0(function1, (byte) 29);
                                fetVar4.o0(objP3);
                            }
                            vcc.i(this.c, y56Var2, this.d, (Function1) objP3, null, fetVar4, 0, 16);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar4;
                            if (a2nVar2 instanceof c2o0) {
                                fetVar2.e0(-1205468794);
                                c2o0 c2o0Var2 = (c2o0) a2nVar2;
                                boolean zG4 = fetVar2.g(function1);
                                Object objP4 = fetVar2.P();
                                if (zG4 || objP4 == cl5Var) {
                                    objP4 = new fzg(function1, (byte) 0);
                                    fetVar2.o0(objP4);
                                }
                                hkb.n(this.c, c2o0Var2, this.d, (Function1) objP4, null, fetVar2, 0, 16);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(-1205049240);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
