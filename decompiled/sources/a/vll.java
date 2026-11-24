package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vll implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37629a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public vll(a4x a4xVar, htr htrVar, Function2 function2, Function1 function1, Function1 function3) {
        this.f37629a = (byte) 1;
        this.d = a4xVar;
        this.e = htrVar;
        this.f = function2;
        this.b = function1;
        this.c = function3;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        int i3;
        pz40 pz40Var;
        int i4;
        int i5;
        byte b = this.f37629a;
        mm40 mm40VarD0 = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        List list = this.d;
        Object obj5 = this.e;
        Object obj6 = this.b;
        Object obj7 = this.c;
        Object obj8 = this.f;
        switch (b) {
            case 0:
                k8z k8zVar = (k8z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar2.g(k8zVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    pe0 pe0Var = (pe0) list.get(iIntValue);
                    fetVar2.e0(-625239924);
                    int iOrdinal = ((pt0) obj5).ordinal();
                    if (iOrdinal == 0) {
                        fetVar = fetVar2;
                        fetVar.e0(-625217264);
                        lt0.a(null, pe0Var, Float.NaN, (Function1) obj6, (Function1) obj7, (Function1) obj8, fetVar, 384);
                        fetVar.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar = fetVar2;
                        fetVar.e0(-624777064);
                        ro4.d(null, pe0Var, Float.NaN, (Function1) obj7, (Function1) obj6, (Function1) obj8, fetVar, 384);
                        fetVar.r(false);
                    } else if (iOrdinal == 2) {
                        fetVar = fetVar2;
                        fetVar.e0(-624382093);
                        o2e.c(null, pe0Var, Float.NaN, (Function1) obj6, (Function1) obj7, (Function1) obj8, fetVar, 384);
                        fetVar.r(false);
                    } else if (iOrdinal == 3) {
                        fetVar = fetVar2;
                        fetVar.e0(-623965329);
                        ohq0.b(null, pe0Var, Float.NaN, (Function1) obj6, (Function1) obj7, (Function1) obj8, fetVar, 384);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 4) {
                            throw b1j.f(949662295, fetVar2, false);
                        }
                        fetVar2.e0(-623535545);
                        tke.d(null, pe0Var, Float.NaN, (Function1) obj6, (Function1) obj7, (Function1) obj8, fetVar2, 384, 1);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                htr htrVar = (htr) obj5;
                k8zVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(k8zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    m9n m9nVar = (m9n) ((a4x) list).get(iIntValue3);
                    fetVar3.e0(-1469658988);
                    ftr ftrVar = (ftr) htrVar;
                    jcb.e(o7k0.d(s5x0.I(mm40VarD0, uzb.e0(ftrVar.f10128a.indexOf(m9nVar), ftrVar.f10128a.size())), 1.0f), m9nVar, (Function2) obj8, (Function1) obj6, (Function1) obj7, fetVar3, 0, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                edg0 edg0Var = (edg0) obj7;
                g9z g9zVar = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj6;
                pz40 pz40Var2 = (pz40) obj5;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar4.g(g9zVar) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar4.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
                    ddg0 ddg0Var = (ddg0) ((a4x) list).get(iIntValue5);
                    fetVar4.e0(-1961039757);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(mm40VarD0, 56.0f);
                    Object objP = fetVar4.P();
                    if (objP == cl5Var) {
                        objP = b180.u;
                        fetVar4.o0(objP);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarN, (Function1) objP);
                    boolean zG = fetVar4.g(pz40Var2) | fetVar4.e(iIntValue5) | fetVar4.g(edg0Var) | fetVar4.g(ddg0Var) | fetVar4.e(((k6z) obj8).ordinal());
                    Object objP2 = fetVar4.P();
                    if (zG || objP2 == cl5Var) {
                        pz40Var = pz40Var2;
                        objP2 = new zcg0(pz40Var, iIntValue5, edg0Var, ddg0Var, (k6z) obj8);
                        fetVar4.o0(objP2);
                    } else {
                        pz40Var = pz40Var2;
                    }
                    mm40 mm40VarK = rq8.K(mm40VarT, (Function1) objP2);
                    boolean zG2 = fetVar4.g(function1) | fetVar4.e(iIntValue5);
                    Object objP3 = fetVar4.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new bp40(function1, iIntValue5, (byte) 2);
                        fetVar4.o0(objP3);
                    }
                    mm40 mm40VarF = phu0.F(mm40VarK, null, null, false, null, (Function0) objP3, fetVar4, 0, 15);
                    if (ddg0Var != null) {
                        if (ddg0Var instanceof cdg0) {
                            fetVar4.e0(-1033036168);
                            vcg0 vcg0Var = ((apm) pz40Var.getValue()).b;
                            ((apm) pz40Var.getValue()).getClass();
                            bdg0.a(mm40VarF, (cdg0) ddg0Var, vcg0Var, fetVar4, 0, 0);
                            fetVar4.r(false);
                        } else if (ddg0Var instanceof gdg0) {
                            fetVar4.e0(-1033026024);
                            vcg0 vcg0Var2 = ((apm) pz40Var.getValue()).b;
                            ((apm) pz40Var.getValue()).getClass();
                            q7x.m(mm40VarF, (gdg0) ddg0Var, vcg0Var2, fetVar4, 0, 0);
                            fetVar4.r(false);
                        }
                        fetVar4.r(false);
                    }
                    throw b1j.f(-1033037910, fetVar4, false);
                }
                fetVar4.X();
                return Unit.f46060a;
            case 3:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                ngk0 ngk0Var = (ngk0) obj7;
                xdr xdrVar = (xdr) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar2) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    usm usmVar = (usm) list.get(iIntValue7);
                    fetVar5.e0(-2097504402);
                    int i6 = usmVar.f36218a;
                    if (xdrVar != null) {
                        fetVar5.e0(-2097452323);
                        Integer numValueOf = Integer.valueOf(i6);
                        boolean zE = fetVar5.e(i6);
                        Object objP4 = fetVar5.P();
                        if (zE || objP4 == cl5Var) {
                            objP4 = new b4l0(ngk0Var, i6, (byte) 0);
                            fetVar5.o0(objP4);
                        }
                        m0x0.o(numValueOf, (Function1) objP4, fetVar5);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2097299524);
                        fetVar5.r(false);
                    }
                    if (xdrVar != null) {
                        fetVar5.e0(-2097202711);
                        boolean zE2 = fetVar5.e(i6);
                        Object objP5 = fetVar5.P();
                        if (zE2 || objP5 == cl5Var) {
                            objP5 = new ufe((pz40) obj8, ngk0Var, i6);
                            fetVar5.o0(objP5);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP5);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2096961500);
                        fetVar5.r(false);
                    }
                    eeq.n(mm40VarD0, usmVar, (Function1) obj6, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                ekf0 ekf0Var = (ekf0) obj5;
                vne vneVar = (vne) obj8;
                pz40 pz40Var3 = (pz40) obj7;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar6.g(g9zVar3) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar6.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar6.U(i5 & 1, (i5 & 147) != 146)) {
                    msl0 msl0Var = (msl0) list.get(iIntValue9);
                    fetVar6.e0(33683537);
                    mm40 mm40VarQ = ydx.Q(g9zVar3, (ekf0) obj5, Long.valueOf(msl0Var.f22327a), ((nsl0) obj6).h, fetVar6, (i5 & 14) | 3072, 0);
                    zrm zrmVar = msl0Var.e;
                    boolean zG3 = fetVar6.g(pz40Var3) | fetVar6.g(msl0Var);
                    Object objP6 = fetVar6.P();
                    if (zG3 || objP6 == cl5Var) {
                        objP6 = new o3l0(msl0Var, pz40Var3, (byte) 17);
                        fetVar6.o0(objP6);
                    }
                    Function1 function2 = (Function1) objP6;
                    boolean zI = fetVar6.i(vneVar) | fetVar6.g(ekf0Var) | fetVar6.g(msl0Var);
                    Object objP7 = fetVar6.P();
                    if (zI || objP7 == cl5Var) {
                        objP7 = new xg(vneVar, ekf0Var, msl0Var, (byte) 12);
                        fetVar6.o0(objP7);
                    }
                    agc.r(mm40VarQ, zrmVar, null, null, null, function2, (Function1) objP7, fetVar6, 0, 28);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }

    public vll(a4x a4xVar, pz40 pz40Var, edg0 edg0Var, k6z k6zVar, Function1 function1) {
        this.f37629a = (byte) 2;
        this.d = a4xVar;
        this.e = pz40Var;
        this.c = edg0Var;
        this.f = k6zVar;
        this.b = function1;
    }

    public /* synthetic */ vll(List list, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f37629a = b;
        this.d = list;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
    }
}
