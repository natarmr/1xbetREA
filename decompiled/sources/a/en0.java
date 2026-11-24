package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8070a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ en0(xn0 xn0Var, d9z d9zVar, xcz xczVar, Function1 function1, d9z d9zVar2, xcz xczVar2) {
        this.b = xn0Var;
        this.c = d9zVar;
        this.e = xczVar;
        this.g = function1;
        this.d = d9zVar2;
        this.f = xczVar2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f8070a;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.g;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        boolean z = false;
        final byte b2 = 1;
        switch (b) {
            case 0:
                xn0 xn0Var = (xn0) obj10;
                d9z d9zVar = (d9z) obj9;
                xcz xczVar = (xcz) obj6;
                Function1 function1 = (Function1) obj7;
                d9z d9zVar2 = (d9z) obj8;
                xcz xczVar2 = (xcz) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    yk0 yk0Var = yk0.FAVORITES;
                    if (iIntValue == 0) {
                        fetVar.e0(-1231829653);
                        y9a.c(o7k0.c, ((vn0) xn0Var).f, d9zVar, xczVar, function1, null, fetVar, 6, 32);
                        fetVar.r(false);
                    } else if (iIntValue == 1) {
                        fetVar.e0(-1231300390);
                        n0q n0qVar = o7k0.c;
                        on0 on0Var = ((vn0) xn0Var).g;
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new dn(function1, (byte) 25);
                            fetVar.o0(objP);
                        }
                        y9a.c(n0qVar, on0Var, d9zVar2, xczVar2, function1, (Function0) objP, fetVar, 6, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1230724224);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ujv0 ujv0Var = (ujv0) obj10;
                l7m0 l7m0Var = (l7m0) obj9;
                l7m0 l7m0Var2 = (l7m0) obj8;
                wpq wpqVar = (wpq) obj6;
                pkk0 pkk0Var = (pkk0) obj5;
                cj4 cj4Var = (cj4) obj7;
                mm40 mm40Var = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                gfk0 gfk0Var = cj4.U1;
                ((y5d) obj).getClass();
                mm40Var.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar2.g(mm40Var) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    boolean zI = fetVar2.i(wpqVar) | fetVar2.g(pkk0Var) | fetVar2.i(cj4Var);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new on((Object) wpqVar, (Object) pkk0Var, (Object) cj4Var, (byte) 19);
                        fetVar2.o0(objP2);
                    }
                    nia0.i(mm40Var, ujv0Var, l7m0Var, l7m0Var2, (Function1) objP2, fetVar2, (iIntValue3 >> 3) & 14);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                rll rllVar = (rll) obj10;
                vne vneVar = (vne) obj9;
                xk80 xk80Var = (xk80) obj8;
                final Function1 function2 = (Function1) obj7;
                final Function1 function3 = (Function1) obj6;
                l7m0 l7m0Var3 = (l7m0) obj5;
                int iIntValue4 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar3.e(iIntValue4) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    final hll hllVar = (hll) CollectionsKt.W(iIntValue4, rllVar.b);
                    if (hllVar != null) {
                        mm40 mm40VarN = epv0.N(jm40.b, ((Number) l7m0Var3.getValue()).intValue() == iIntValue4 ? 1.0f : 0.4f);
                        boolean zI2 = fetVar3.i(vneVar) | fetVar3.g(xk80Var) | ((iIntValue5 & 112) == 32);
                        Object objP3 = fetVar3.P();
                        Object obj11 = objP3;
                        if (zI2 || objP3 == cl5Var) {
                            ell ellVar = new ell(vneVar, xk80Var, iIntValue4, b2);
                            fetVar3.o0(ellVar);
                            obj11 = ellVar;
                        }
                        mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) obj11, 28);
                        boolean zG2 = fetVar3.g(function2) | fetVar3.g(hllVar);
                        Object objP4 = fetVar3.P();
                        Object obj12 = objP4;
                        if (zG2 || objP4 == cl5Var) {
                            final boolean z2 = z ? 1 : 0;
                            Function0 function0 = new Function0() { // from class: a.fll
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b3 = z2;
                                    hll hllVar2 = hllVar;
                                    Function1 function4 = function2;
                                    switch (b3) {
                                        case 0:
                                            if (function4 != null) {
                                                function4.invoke(Long.valueOf(hllVar2.f13267a));
                                            }
                                            break;
                                        default:
                                            if (function4 != null) {
                                                function4.invoke(Long.valueOf(hllVar2.f13267a));
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar3.o0(function0);
                            obj12 = function0;
                        }
                        Function0 function4 = (Function0) obj12;
                        boolean zG3 = fetVar3.g(function3) | fetVar3.g(hllVar);
                        Object objP5 = fetVar3.P();
                        Object obj13 = objP5;
                        if (zG3 || objP5 == cl5Var) {
                            Function0 function5 = new Function0() { // from class: a.fll
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b3 = b2;
                                    hll hllVar2 = hllVar;
                                    Function1 function6 = function3;
                                    switch (b3) {
                                        case 0:
                                            if (function6 != null) {
                                                function6.invoke(Long.valueOf(hllVar2.f13267a));
                                            }
                                            break;
                                        default:
                                            if (function6 != null) {
                                                function6.invoke(Long.valueOf(hllVar2.f13267a));
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar3.o0(function5);
                            obj13 = function5;
                        }
                        saj.r(mm40VarW, hllVar, function4, (Function0) obj13, fetVar3, 0, 0);
                    }
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ en0(rll rllVar, vne vneVar, xk80 xk80Var, Function1 function1, Function1 function2, l7m0 l7m0Var) {
        this.b = rllVar;
        this.c = vneVar;
        this.d = xk80Var;
        this.g = function1;
        this.e = function2;
        this.f = l7m0Var;
    }

    public /* synthetic */ en0(ujv0 ujv0Var, l7m0 l7m0Var, l7m0 l7m0Var2, wpq wpqVar, pkk0 pkk0Var, cj4 cj4Var) {
        this.b = ujv0Var;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = wpqVar;
        this.f = pkk0Var;
        this.g = cj4Var;
    }
}
