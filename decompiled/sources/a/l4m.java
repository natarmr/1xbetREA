package a;

import android.gov.nist.core.Separators;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l4m implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19413a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l4m(t4m t4mVar, rah0 rah0Var, boolean z) {
        this.f19413a = (byte) 0;
        this.c = t4mVar;
        this.d = rah0Var;
        this.b = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Pair pair;
        w4m w4mVar;
        int i;
        a5m a5mVar;
        float fR0;
        float size;
        ArrayList arrayList;
        int iAbs;
        a5m a5mVar2;
        boolean zContains;
        String strI;
        byte b = this.f19413a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b2 = 14;
        boolean z = this.b;
        cl5 cl5Var = ukd.f35823a;
        boolean z2 = true;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i2 = 4;
        byte b3 = 2;
        yje yjeVar = null;
        switch (b) {
            case 0:
                t4m t4mVar = (t4m) obj5;
                rah0 rah0Var = (rah0) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fD = lr8Var.d() - q4m.f28104a;
                    w4m w4mVar2 = t4mVar.f33327a;
                    List list = k4m.f17676a;
                    a5m a5mVar3 = w4mVar2.c;
                    w6k w6kVar = (w6k) fetVar.k(bmd.h);
                    g9q0 g9q0VarN = pym0.n(fetVar);
                    boolean zG = fetVar.g(w4mVar2) | fetVar.d(fD) | fetVar.g(w6kVar) | fetVar.g(g9q0VarN);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        float f = k4m.d;
                        z4m z4mVar = w4mVar2.b;
                        boolean z3 = false;
                        int iOrdinal = a5mVar3.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                pair = new Pair(50, 50);
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        pair = new Pair(0, Integer.valueOf(k4m.b(w4mVar2) * 4));
                        int iIntValue2 = ((Number) pair.f46059a).intValue();
                        int iIntValue3 = ((Number) pair.b).intValue();
                        int i3 = (z4mVar instanceof y4m ? (y4m) z4mVar : null) != null ? 60 : 0;
                        a4x a4xVar = w4mVar2.f38547a;
                        if (i3 > 0) {
                            Iterator<E> it = a4xVar.iterator();
                            if (it.hasNext()) {
                                int i4 = ((v4m) it.next()).f36788a;
                                while (it.hasNext()) {
                                    w4m w4mVar3 = w4mVar2;
                                    int i5 = ((v4m) it.next()).f36788a;
                                    if (i4 < i5) {
                                        i4 = i5;
                                    }
                                    w4mVar2 = w4mVar3;
                                }
                                w4mVar = w4mVar2;
                                float f2 = i4 / i3;
                                int i6 = ((int) f2) + 1;
                                ArrayList arrayList2 = new ArrayList(i6);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    arrayList2.add(Integer.valueOf(i7 * i3));
                                }
                                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(k4m.a(w6kVar, g9q0VarN, u4m.a(((Number) it2.next()).intValue(), z4mVar)));
                                }
                                Iterator it3 = arrayList3.iterator();
                                if (it3.hasNext()) {
                                    int i8 = (int) (((a9q0) it3.next()).c >> 32);
                                    while (it3.hasNext()) {
                                        arrayList3 = arrayList3;
                                        i3 = i3;
                                        int i9 = (int) (((a9q0) it3.next()).c >> 32);
                                        if (i8 < i9) {
                                            i8 = i9;
                                        }
                                    }
                                    ArrayList arrayList4 = arrayList3;
                                    i = i3;
                                    fR0 = w6kVar.r0((int) (i8 * 1.5f)) + f;
                                    if (f2 != 0.0f) {
                                        fR0 = ((ycl) idd.d(new ycl(fR0), new ycl(fD / f2))).f42389a;
                                    }
                                    size = fR0 * f2;
                                    arrayList = arrayList4;
                                    a5mVar = a5mVar3;
                                } else {
                                    itt0.a();
                                }
                            } else {
                                itt0.a();
                            }
                            return null;
                        }
                        w4mVar = w4mVar2;
                        i = i3;
                        ArrayList arrayList5 = new ArrayList(r3d.q(a4xVar, 10));
                        Iterator<E> it4 = a4xVar.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(Integer.valueOf(((v4m) it4.next()).f36788a));
                        }
                        ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                        Iterator it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(k4m.a(w6kVar, g9q0VarN, u4m.a(((Number) it5.next()).intValue(), z4mVar)));
                        }
                        int size2 = arrayList5.size() - 1;
                        Iterator it6 = arrayList6.iterator();
                        if (!it6.hasNext()) {
                            itt0.a();
                            return null;
                        }
                        int i10 = (int) (((a9q0) it6.next()).c >> 32);
                        while (it6.hasNext()) {
                            a5m a5mVar4 = a5mVar3;
                            int i11 = (int) (((a9q0) it6.next()).c >> 32);
                            if (i10 < i11) {
                                i10 = i11;
                            }
                            a5mVar3 = a5mVar4;
                        }
                        a5mVar = a5mVar3;
                        fR0 = ((ycl) idd.d(new ycl(w6kVar.r0((int) (i10 * 1.5f)) + f), new ycl(fD / size2))).f42389a;
                        size = (arrayList5.size() - 1) * fR0;
                        arrayList = arrayList6;
                        float f3 = fR0;
                        float f4 = size;
                        int i12 = 9;
                        ArrayList arrayList7 = new ArrayList(9);
                        int i13 = 0;
                        while (i13 < i12) {
                            int iOrdinal2 = a5mVar.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 == z2) {
                                    iAbs = ((Number) k4m.f17676a.get(i13)).intValue();
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            iAbs = Math.abs(i13 - 4) * k4m.b(w4mVar);
                            boolean z4 = i13 != i2 ? true : z3;
                            int iOrdinal3 = a5mVar.ordinal();
                            if (iOrdinal3 != 0) {
                                a5mVar2 = a5mVar;
                                if (iOrdinal3 == 1) {
                                    zContains = k4m.b.contains(Integer.valueOf(i13));
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            a5mVar2 = a5mVar;
                            zContains = i13 != 4 ? true : z3;
                            n0o0 n0o0Var = u4m.f35057a;
                            int iOrdinal4 = a5mVar2.ordinal();
                            if (iOrdinal4 == 0) {
                                strI = ((DecimalFormat) u4m.f35057a.getValue()).format(Integer.valueOf(iAbs));
                                strI.getClass();
                            } else {
                                if (iOrdinal4 != 1) {
                                    t9f.b();
                                    return null;
                                }
                                strI = f140.i(l1e0.d(iAbs, z3 ? 1 : 0, 100), Separators.PERCENT);
                            }
                            arrayList7.add(new r4m(z4, zContains, k4m.a(w6kVar, g9q0VarN, strI)));
                            i13++;
                            a5mVar = a5mVar2;
                            i12 = 9;
                            i2 = 4;
                            z3 = false;
                            z2 = true;
                        }
                        objP = new j4m(iIntValue2, iIntValue3, arrayList, arrayList7, f3, f4, i);
                        fetVar.o0(objP);
                    }
                    j4m j4mVar = (j4m) objP;
                    boolean z5 = ycl.a(fD, j4mVar.f) < 0;
                    Object objP2 = fetVar.P();
                    Object obj6 = objP2;
                    if (objP2 == cl5Var) {
                        pz40 pz40VarE = androidx.compose.runtime.e.e(Boolean.valueOf(rah0Var.b.l() == 0 || rah0Var.f30133a.l() >= rah0Var.f.l()));
                        fetVar.o0(pz40VarE);
                        obj6 = pz40VarE;
                    }
                    pz40 pz40Var = (pz40) obj6;
                    Object objP3 = fetVar.P();
                    Object obj7 = objP3;
                    if (objP3 == cl5Var) {
                        pz40 pz40VarE2 = androidx.compose.runtime.e.e(Boolean.TRUE);
                        fetVar.o0(pz40VarE2);
                        obj7 = pz40VarE2;
                    }
                    pz40 pz40Var2 = (pz40) obj7;
                    boolean zG2 = fetVar.g(rah0Var);
                    Object objP4 = fetVar.P();
                    Object obj8 = objP4;
                    if (zG2 || objP4 == cl5Var) {
                        ofl oflVar = new ofl((Object) rah0Var, (Object) pz40Var, (yje) null, (byte) 2);
                        fetVar.o0(oflVar);
                        obj8 = oflVar;
                    }
                    m0x0.t(fetVar, rah0Var, (Function2) obj8);
                    w4m w4mVar4 = t4mVar.f33327a;
                    Boolean boolValueOf = Boolean.valueOf(z5);
                    Boolean bool = (Boolean) pz40Var.getValue();
                    bool.getClass();
                    boolean zH = fetVar.h(z5) | fetVar.g(rah0Var);
                    Object objP5 = fetVar.P();
                    if (zH || objP5 == cl5Var) {
                        objP5 = new p4m(z5, rah0Var, pz40Var, pz40Var2, (yje) null);
                        fetVar.o0(objP5);
                    }
                    m0x0.u(w4mVar4, boolValueOf, bool, (Function2) objP5, fetVar);
                    mm40 mm40VarP = wha0.P(s5x0.N(jm40.b, 0.0f, 0.0f, q4m.f28104a, 0.0f, 11).e(o7k0.c), rah0Var, false, 14);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    q4m.a(t4mVar, j4mVar, z, fetVar, 0);
                    fetVar.r(true);
                    q4m.c(j4mVar, z, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                f3d f3dVar = (f3d) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar2.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
                    boolean zH2 = fetVar2.h(z) | fetVar2.g(f3dVar);
                    Object objP6 = fetVar2.P();
                    if (zH2 || objP6 == cl5Var) {
                        objP6 = new x9(z, (Object) f3dVar, (byte) 7);
                        fetVar2.o0(objP6);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarA, (Function1) objP6);
                    boolean zG3 = fetVar2.g(f3dVar);
                    Object objP7 = fetVar2.P();
                    if (zG3 || objP7 == cl5Var) {
                        objP7 = new y1d(f3dVar, b3);
                        fetVar2.o0(objP7);
                    }
                    mm40 mm40VarM = rq8.M(mm40VarT, (Function1) objP7);
                    String str = ((e92) l7m0Var.getValue()).f7400a;
                    pz40 pz40Var3 = s6t0.f31722a;
                    v8q0.a(str, mm40VarM, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar2, 0, 0, 130044);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                e530 e530Var = (e530) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarN);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    fetVar3.e0(1251743583);
                    for (d4n d4nVar : e530Var.c) {
                        zcl zclVar2 = qmk.f28987a;
                        agc.t(s5x0.L(jm40Var, 0.0f, 6.0f, 1), d4nVar, this.b, function1, null, fetVar3, 0, 16);
                    }
                    fetVar3.r(false);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                Function1 function2 = (Function1) obj5;
                a4x a4xVar2 = (a4x) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    d9z d9zVarA = f9z.a(fetVar4);
                    boolean zG4 = fetVar4.g(d9zVarA) | fetVar4.g(function2);
                    Object objP8 = fetVar4.P();
                    Object obj9 = objP8;
                    if (zG4 || objP8 == cl5Var) {
                        pd0 pd0Var = new pd0(d9zVarA, function2, yjeVar, b3);
                        fetVar4.o0(pd0Var);
                        obj9 = pd0Var;
                    }
                    m0x0.t(fetVar4, d9zVarA, (Function2) obj9);
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "LAZY_VERTICAL_GRID_SPORT_RESULT");
                    ngv ngvVar = new ngv(2);
                    zcl zclVar3 = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    ch80 ch80VarF = h97.f(xfn.a(fetVar4).d, 8.0f, xfn.a(fetVar4).d, 24.0f, fetVar4);
                    boolean zG5 = fetVar4.g(a4xVar2) | fetVar4.h(z) | fetVar4.g(function2);
                    Object objP9 = fetVar4.P();
                    Object obj10 = objP9;
                    if (zG5 || objP9 == cl5Var) {
                        uy0 uy0Var = new uy0(a4xVar2, z, function2, (byte) 6);
                        fetVar4.o0(uy0Var);
                        obj10 = uy0Var;
                    }
                    g8x.i(ngvVar, mm40VarE0, d9zVarA, ch80VarF, null, qw3Var, null, false, null, (Function1) obj10, fetVar4, 0, 944);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                d7q0 d7q0Var = (d7q0) obj5;
                pz40 pz40Var4 = d7q0Var.f;
                gy40 gy40Var = (gy40) obj4;
                fet fetVar5 = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar5.e0(-2137546592);
                boolean z6 = ((ma80) ((hgk0) pz40Var4).getValue()) == ma80.f21447a || !(fetVar5.k(bmd.n) == k6z.b);
                boolean zG6 = fetVar5.g(d7q0Var);
                Object objP10 = fetVar5.P();
                Object obj11 = objP10;
                if (zG6 || objP10 == cl5Var) {
                    nop0 nop0Var = new nop0(d7q0Var, b2);
                    fetVar5.o0(nop0Var);
                    obj11 = nop0Var;
                }
                bch0 bch0VarP = piz.P((Function1) obj11, fetVar5);
                boolean zG7 = fetVar5.g(bch0VarP) | fetVar5.g(d7q0Var);
                Object objP11 = fetVar5.P();
                Object obj12 = objP11;
                if (zG7 || objP11 == cl5Var) {
                    c7q0 c7q0Var = new c7q0(bch0VarP, d7q0Var);
                    fetVar5.o0(c7q0Var);
                    obj12 = c7q0Var;
                }
                mm40 mm40VarB = fbh0.b(jm40.b, (c7q0) obj12, (ma80) ((hgk0) pz40Var4).getValue(), z && d7q0Var.b.l() != 0.0f, z6, null, gy40Var, 160);
                fetVar5.r(false);
                return mm40VarB;
            default:
                Function1 function3 = (Function1) obj5;
                xcz xczVar = (xcz) obj4;
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar6.g(p6t0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    if (p6t0Var instanceof l6t0) {
                        fetVar6.e0(-1329641065);
                        l6t0 l6t0Var = (l6t0) p6t0Var;
                        boolean zG8 = fetVar6.g(function3);
                        Object objP12 = fetVar6.P();
                        if (zG8 || objP12 == cl5Var) {
                            objP12 = new ru80(function3, (byte) 20);
                            fetVar6.o0(objP12);
                        }
                        s7n0.g(l6t0Var, (Function2) objP12, fetVar6, (iIntValue7 << 3) & 112);
                        fetVar6.r(false);
                    } else if (p6t0Var instanceof vpv) {
                        fetVar6.e0(-1329301646);
                        vpv vpvVar = (vpv) p6t0Var;
                        boolean zG9 = fetVar6.g(function3);
                        Object objP13 = fetVar6.P();
                        if (zG9 || objP13 == cl5Var) {
                            objP13 = new ru80(function3, (byte) 21);
                            fetVar6.o0(objP13);
                        }
                        Function2 function4 = (Function2) objP13;
                        boolean zG10 = fetVar6.g(function3);
                        Object objP14 = fetVar6.P();
                        if (zG10 || objP14 == cl5Var) {
                            objP14 = new xar0(function3, (byte) 23);
                            fetVar6.o0(objP14);
                        }
                        slb.y(vpvVar, function4, (Function1) objP14, fetVar6, (iIntValue7 << 3) & 112);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-1328853510);
                        fetVar6.r(false);
                    }
                    boolean z7 = this.b;
                    Boolean boolValueOf2 = Boolean.valueOf(z7);
                    boolean zH3 = fetVar6.h(z7) | fetVar6.g(xczVar) | fetVar6.g(function3);
                    Object objP15 = fetVar6.P();
                    if (zH3 || objP15 == cl5Var) {
                        objP15 = new c2p(z7, xczVar, function3, null, (byte) 6);
                        fetVar6.o0(objP15);
                    }
                    m0x0.t(fetVar6, boolValueOf2, (Function2) objP15);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ l4m(a4x a4xVar, Function1 function1, boolean z) {
        this.f19413a = (byte) 3;
        this.c = function1;
        this.d = a4xVar;
        this.b = z;
    }

    public /* synthetic */ l4m(Object obj, boolean z, Object obj2, byte b) {
        this.f19413a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ l4m(boolean z, f3d f3dVar, l7m0 l7m0Var) {
        this.f19413a = (byte) 1;
        this.b = z;
        this.c = f3dVar;
        this.d = l7m0Var;
    }
}
