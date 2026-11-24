package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tft implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33882a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ tft(l7m0 l7m0Var, byte b) {
        this.f33882a = b;
        this.b = l7m0Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m6m0 m6m0Var = gup0.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 4.0f, 0L, fetVar, 0, 5);
            l7m0 l7m0Var = this.b;
            kkb.m(null, ((uup0) l7m0Var.getValue()).b, null, 0, 0L, 0L, fetVar, 0, 61);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(jm40Var, 48.0f), 1.0f), 16.0f, 0.0f, 2);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarL, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.a(12.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = ((uup0) l7m0Var.getValue()).d;
            long j = qmk.w;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, jm40Var, secondary, null, j, null, null, g1t0.m().f42262a.f, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 261992);
            fetVar.r(true);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
            kkb.m(null, ((uup0) l7m0Var.getValue()).c, null, 5, 0L, 0L, fetVar, 0, 53);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = qvp0.m2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 4.0f, 0L, fetVar, 0, 5);
            kkb.m(null, ((awp0) this.b.getValue()).b, null, 5, 0L, 0L, fetVar, 0, 53);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, 16.0f, 12.0f, 16.0f, 12.0f);
            String str = ((jkq0) this.b.getValue()).g;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarM, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v75 */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i;
        fet fetVar;
        mm40 mm40Var;
        byte b = this.f33882a;
        byte b2 = 13;
        byte b3 = 27;
        cl5 cl5Var = ukd.f35823a;
        Function0 function0 = e7z.u1;
        jm40 jm40Var = jm40.b;
        int i2 = 0;
        final byte b4 = 1;
        final l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                bek bekVar = wft.n2;
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qbc.u(((bgt) l7m0Var.getValue()).f2573a, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                final p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                final pu90 pu90VarS = pj30Var.S(p4eVar.f26347a);
                final byte b5 = 0;
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new Function1() { // from class: a.hwy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b6 = b5;
                        l7m0 l7m0Var2 = l7m0Var;
                        p4e p4eVar2 = p4eVar;
                        pu90 pu90Var = pu90VarS;
                        ou90 ou90Var = (ou90) obj4;
                        switch (b6) {
                            case 0:
                                ou90Var.getClass();
                                int iFloatValue = (int) (((Number) l7m0Var2.getValue()).floatValue() * p4e.i(p4eVar2.f26347a));
                                zcl zclVar = qmk.f28987a;
                                ou90Var.m(pu90Var, iFloatValue, ou90Var.T(8.0f), 0.0f);
                                break;
                            default:
                                ou90Var.getClass();
                                int iFloatValue2 = (int) (((Number) l7m0Var2.getValue()).floatValue() * p4e.i(p4eVar2.f26347a));
                                zcl zclVar2 = qmk.f28987a;
                                ou90Var.m(pu90Var, iFloatValue2, ou90Var.T(8.0f), 0.0f);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 2:
                hh80 hh80Var = (hh80) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(hh80Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    fre0.D(hh80Var, l7m0Var, fetVar3, iIntValue2 & 14);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    ugd ugdVarM = u1c.M(1464843185, new tft(l7m0Var, (byte) 4), fetVar4);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarD);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(function0);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    ua80.p(54, ugdVarM, jr8.f16991a, fetVar4, true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ir8 ir8Var = (ir8) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(ir8Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 180.0f);
                    zx7 zx7Var = gqw0.e;
                    mm40 mm40VarJ = s5x0.J(ir8Var.b(mm40VarN, zx7Var), 48.0f);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(function0);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 80.0f);
                    boolean z = ((iu70) l7m0Var.getValue()).h;
                    mm40VarN2.getClass();
                    long secondary = ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary();
                    if (z) {
                        fetVar5.e0(695981857);
                        boolean z2 = false;
                        z7x z7xVarV = b8k0.V("PulseTransition", fetVar5, 0);
                        fetVar5.e0(1546473183);
                        int i3 = 2;
                        ArrayList arrayList = new ArrayList(2);
                        int i4 = 0;
                        while (true) {
                            int i5 = 4000;
                            if (i4 < i3) {
                                fet fetVar6 = fetVar5;
                                arrayList.add(b8k0.r(z7xVarV, 1.0f, 1.5f, ro4.b0(ro4.m0(4000, z2 ? 1 : 0, null, 6), null, i4 * (-2000), i3), "PulseScale", fetVar6, 28680, 0));
                                i4++;
                                fetVar5 = fetVar6;
                                i3 = 2;
                                z2 = false;
                            } else {
                                fet fetVar7 = fetVar5;
                                fetVar7.r(z2);
                                a4x a4xVarO0 = dyb.o0(arrayList);
                                fetVar7.e0(1546488044);
                                int i6 = 2;
                                ArrayList arrayList2 = new ArrayList(2);
                                int i7 = z2 ? 1 : 0;
                                fet fetVar8 = fetVar7;
                                boolean z3 = z2;
                                while (i7 < i6) {
                                    fet fetVar9 = fetVar8;
                                    arrayList2.add(b8k0.r(z7xVarV, 1.0f, 0.0f, ro4.b0(ro4.m0(4000, z3 ? 1 : 0, null, 6), null, i7 * (-2000), i6), "PulseAlpha", fetVar9, 29112, 0));
                                    i7++;
                                    secondary = secondary;
                                    fetVar8 = fetVar9;
                                    i6 = 2;
                                    z3 = false;
                                }
                                fet fetVar10 = fetVar8;
                                long j = secondary;
                                fetVar10.r(z3);
                                a4x a4xVarO1 = dyb.o0(arrayList2);
                                fetVar10.e0(1546502448);
                                ArrayList arrayList3 = new ArrayList(2);
                                int i8 = z3 ? 1 : 0;
                                fet fetVar11 = fetVar10;
                                ?? r9 = z3;
                                while (i8 < 2) {
                                    fet fetVar12 = fetVar11;
                                    arrayList3.add(b8k0.r(z7xVarV, 1.0f, 1.5f, ro4.b0(ro4.m0(i5, r9, null, 6), null, i8 * (-2000), 2), "Pulse radius", fetVar12, 29112, 0));
                                    i8++;
                                    fetVar11 = fetVar12;
                                    r9 = 0;
                                    i5 = 4000;
                                }
                                fet fetVar13 = fetVar11;
                                fetVar13.r(r9);
                                a4x a4xVarO2 = dyb.o0(arrayList3);
                                boolean zG = fetVar13.g(mm40VarN2);
                                Object objP = fetVar13.P();
                                Object obj4 = objP;
                                if (zG || objP == cl5Var) {
                                    pz40 pz40VarE = androidx.compose.runtime.e.e(new ne60((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
                                    fetVar13.o0(pz40VarE);
                                    obj4 = pz40VarE;
                                }
                                pz40 pz40Var = (pz40) obj4;
                                boolean zG2 = fetVar13.g(pz40Var) | fetVar13.g(a4xVarO0) | fetVar13.g(a4xVarO2) | fetVar13.g(a4xVarO1) | fetVar13.f(j);
                                Object objP2 = fetVar13.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new fj1((byte) 5, j, (Object) pz40Var, (Object) a4xVarO0, (Object) a4xVarO2, (Object) a4xVarO1);
                                    fetVar13.o0(objP2);
                                }
                                mm40 mm40VarK = rq8.K(mm40VarN2, (Function1) objP2);
                                i = 0;
                                fetVar13.r(false);
                                mm40Var = mm40VarK;
                                fetVar = fetVar13;
                            }
                        }
                    } else {
                        fet fetVar14 = fetVar5;
                        i = 0;
                        fetVar14.e0(698027795);
                        fetVar14.r(false);
                        mm40Var = jm40Var;
                        fetVar = fetVar14;
                    }
                    n6x.c(i, fetVar, mm40VarN2.e(mm40Var));
                    fetVar.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar15 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar15.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarD2 = o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), 36.0f), 1.0f);
                    boolean z4 = ((iu70) l7m0Var.getValue()).f;
                    ugd ugdVarM2 = u1c.M(-1032489043, new cw0(l7m0Var, (byte) 12), fetVar15);
                    ugd ugdVarM3 = u1c.M(-2081861044, new cw0(l7m0Var, b2), fetVar15);
                    mm40VarD2.getClass();
                    n7x.a(z4, u1c.M(-34449493, new eyn(mm40VarD2, ugdVarM3, ugdVarM2, b3), fetVar15), fetVar15);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar16 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mi70 mi70Var = ox70.n2;
                ((y5d) obj).getClass();
                if (fetVar16.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    wvb.o(null, 24.0f, 0L, fetVar16, 0, 5);
                    wwb.i(null, ((by70) l7m0Var.getValue()).f3403a, 0L, 0, 0L, fetVar16, 0, 29);
                    wvb.o(null, 8.0f, 0L, fetVar16, 0, 5);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar17 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mi70 mi70Var2 = ox70.n2;
                ((y5d) obj).getClass();
                if (fetVar17.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    wvb.o(null, 4.0f, 0L, fetVar17, 0, 5);
                    kkb.m(null, ((by70) l7m0Var.getValue()).b, null, 5, 0L, 0L, fetVar17, 0, 53);
                    wvb.o(null, 12.0f, 0L, fetVar17, 0, 5);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar18 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar18.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_language, 0, fetVar18), new m78(((ThemeColors) fetVar18.k(zaq0.b)).getSecondary40(), 5), null, 10);
                    zcl zclVar5 = qmk.f28987a;
                    k7x.b((String) l7m0Var.getValue(), null, o7k0.n(jm40Var, 36.0f), oilVarT, oilVarT, oilVarT, null, null, null, null, null, null, fetVar18, 299056, 0, 32704);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar19 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i9 = tha0.m2;
                ((y5d) obj).getClass();
                if (fetVar19.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    for (cia0 cia0Var : ((vha0) l7m0Var.getValue()).f37420a) {
                        jm40 jm40Var2 = jm40.b;
                        mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar6 = qmk.f28987a;
                        mm40 mm40VarK2 = s5x0.K(mm40VarD3, 16.0f, 8.0f);
                        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar19, 0);
                        int iHashCode3 = Long.hashCode(fetVar19.T);
                        bh90 bh90VarM3 = fetVar19.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar19, mm40VarK2);
                        mkd.c0.getClass();
                        fetVar19.i0();
                        if (fetVar19.S) {
                            fetVar19.l(function0);
                        } else {
                            fetVar19.r0();
                        }
                        jpm0.o(fetVar19, thg0VarA, gqw0.x);
                        jpm0.o(fetVar19, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar19, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar19);
                        jpm0.o(fetVar19, mm40VarC2, gqw0.v);
                        mm40 mm40VarS = o7k0.s(jm40Var2, 46.0f);
                        String str = cia0Var.f4402a;
                        y9q0 y9q0VarJ = g1t0.j();
                        pz40 pz40Var2 = s6t0.f31722a;
                        fet fetVar20 = fetVar19;
                        v8q0.a(str, mm40VarS, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, y9q0VarJ, fetVar20, 0, 24960, 109560);
                        v8q0.a(cia0Var.b, dw9.h(1.0f, s5x0.N(jm40Var2, 16.0f, 0.0f, 0.0f, 0.0f, 14), true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.k(), fetVar20, 0, 24960, 109560);
                        fetVar19 = fetVar20;
                        fetVar19.r(true);
                    }
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar21 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                rl70 rl70Var = uia0.n2;
                ((y5d) obj).getClass();
                if (fetVar21.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    for (dja0 dja0Var : ((wia0) l7m0Var.getValue()).f39206a) {
                        jm40 jm40Var3 = jm40.b;
                        mm40 mm40VarD4 = o7k0.d(jm40Var3, 1.0f);
                        zcl zclVar7 = qmk.f28987a;
                        mm40 mm40VarK3 = s5x0.K(mm40VarD4, 16.0f, 8.0f);
                        thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar21, i2);
                        int iHashCode4 = Long.hashCode(fetVar21.T);
                        bh90 bh90VarM4 = fetVar21.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar21, mm40VarK3);
                        mkd.c0.getClass();
                        fetVar21.i0();
                        if (fetVar21.S) {
                            fetVar21.l(function0);
                        } else {
                            fetVar21.r0();
                        }
                        jpm0.o(fetVar21, thg0VarA2, gqw0.x);
                        jpm0.o(fetVar21, bh90VarM4, gqw0.w);
                        jpm0.o(fetVar21, Integer.valueOf(iHashCode4), gqw0.y);
                        jpm0.n(fetVar21);
                        jpm0.o(fetVar21, mm40VarC3, gqw0.v);
                        mm40 mm40VarS2 = o7k0.s(jm40Var3, 46.0f);
                        String str2 = dja0Var.f6175a;
                        y9q0 y9q0VarJ2 = g1t0.j();
                        pz40 pz40Var3 = s6t0.f31722a;
                        fet fetVar22 = fetVar21;
                        v8q0.a(str2, mm40VarS2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, y9q0VarJ2, fetVar22, 0, 24960, 109560);
                        v8q0.a(dja0Var.b, dw9.h(1.0f, s5x0.N(jm40Var3, 16.0f, 0.0f, 0.0f, 0.0f, 14), true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.k(), fetVar22, 0, 24960, 109560);
                        fetVar21 = fetVar22;
                        fetVar21.r(true);
                        i2 = 0;
                    }
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 11:
                fet fetVar23 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i10 = iwa0.m2;
                ((y5d) obj).getClass();
                if (fetVar23.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    zjb.h(i120.Q(jm40Var, s6t0.b().f33626a.getBackgroundLight60(), jd8.n), ((twa0) l7m0Var.getValue()).f34641a, false, 0L, 0L, null, fetVar23, 0, 60);
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
            case 12:
                fet fetVar24 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i11 = iwa0.m2;
                ((y5d) obj).getClass();
                if (fetVar24.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    g8x.m(l7m0Var, fetVar24, 0);
                } else {
                    fetVar24.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar25 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar25.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    Object[] objArr = new Object[0];
                    boolean zG3 = fetVar25.g(l7m0Var);
                    Object objP3 = fetVar25.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new wda0(l7m0Var, (byte) 13);
                        fetVar25.o0(objP3);
                    }
                    t9x.o(6, fetVar25, o7k0.d(jm40Var, 1.0f), v3c.Y(objArr, (Function0) objP3, fetVar25));
                } else {
                    fetVar25.X();
                }
                return Unit.f46060a;
            case 14:
                fet fetVar26 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                zie0 zie0Var = eue0.n2;
                ((y5d) obj).getClass();
                if (fetVar26.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    zcl zclVar8 = qmk.f28987a;
                    wwb.i(s5x0.N(jm40.b, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((qg8) l7m0Var.getValue()).f28669a, 0L, 0, 0L, fetVar26, 0, 28);
                } else {
                    fetVar26.X();
                }
                return Unit.f46060a;
            case 15:
                fet fetVar27 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                gle0 gle0Var = jue0.n2;
                ((y5d) obj).getClass();
                if (fetVar27.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    g1x.k(0, fetVar27, s5x0.N(jm40.b, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((wg8) l7m0Var.getValue()).f39101a, ((wg8) l7m0Var.getValue()).b);
                } else {
                    fetVar27.X();
                }
                return Unit.f46060a;
            case 16:
                fet fetVar28 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                gne0 gne0Var = xkh0.n2;
                ((y5d) obj).getClass();
                if (fetVar28.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    p7x.l(((flh0) l7m0Var.getValue()).f9738a.f1067a, fetVar28, 0);
                } else {
                    fetVar28.X();
                }
                return Unit.f46060a;
            case 17:
                fet fetVar29 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar29.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    m8x.j(0, fetVar29, null, ((c8i0) l7m0Var.getValue()).c);
                } else {
                    fetVar29.X();
                }
                return Unit.f46060a;
            case 18:
                fet fetVar30 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar30.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(jm40.b, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    String str3 = ((c8i0) l7m0Var.getValue()).d;
                    ((g1t0) fetVar30.k(j1t0.e)).getClass();
                    v8q0.a(str3, mm40VarN3, ((ThemeColors) fetVar30.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar30, 0, 0, 131064);
                } else {
                    fetVar30.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar31 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar31.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    nkb.h(s5x0.N(jm40.b, xfn.a(fetVar31).e, 20.0f, xfn.a(fetVar31).e, 0.0f, 8), ((c8i0) l7m0Var.getValue()).e, kjm.b, null, null, null, fetVar31, 384, 56);
                } else {
                    fetVar31.X();
                }
                return Unit.f46060a;
            case 20:
                fet fetVar32 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (!fetVar32.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    fetVar32.X();
                } else if (StringsKt.W(((tli0) l7m0Var.getValue()).e)) {
                    fetVar32.e0(1633465108);
                    zcl zclVar12 = qmk.f28987a;
                    rz4.t(jm40Var, 8.0f, fetVar32, false);
                } else {
                    fetVar32.e0(1632829887);
                    mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar13 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarD5, 16.0f, 12.0f, 16.0f, 12.0f);
                    String str4 = ((tli0) l7m0Var.getValue()).e;
                    pz40 pz40Var5 = s6t0.f31722a;
                    v8q0.a(str4, mm40VarM, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar32, 0, 0, 131064);
                    fetVar32.r(false);
                }
                return Unit.f46060a;
            case 21:
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                final p4e p4eVar2 = (p4e) obj3;
                vj30Var2.getClass();
                pj30Var2.getClass();
                final pu90 pu90VarS2 = pj30Var2.S(p4eVar2.f26347a);
                return vj30.x(vj30Var2, pu90VarS2.f27604a, pu90VarS2.b, new Function1() { // from class: a.hwy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        byte b6 = b4;
                        l7m0 l7m0Var2 = l7m0Var;
                        p4e p4eVar3 = p4eVar2;
                        pu90 pu90Var = pu90VarS2;
                        ou90 ou90Var = (ou90) obj5;
                        switch (b6) {
                            case 0:
                                ou90Var.getClass();
                                int iFloatValue = (int) (((Number) l7m0Var2.getValue()).floatValue() * p4e.i(p4eVar3.f26347a));
                                zcl zclVar14 = qmk.f28987a;
                                ou90Var.m(pu90Var, iFloatValue, ou90Var.T(8.0f), 0.0f);
                                break;
                            default:
                                ou90Var.getClass();
                                int iFloatValue2 = (int) (((Number) l7m0Var2.getValue()).floatValue() * p4e.i(p4eVar3.f26347a));
                                zcl zclVar15 = qmk.f28987a;
                                ou90Var.m(pu90Var, iFloatValue2, ou90Var.T(8.0f), 0.0f);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 22:
                fet fetVar33 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                eke0 eke0Var = tck0.t2;
                ((y5d) obj).getClass();
                if (fetVar33.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x9x.z(0, fetVar33, null, ((ddk0) l7m0Var.getValue()).f5901a);
                } else {
                    fetVar33.X();
                }
                return Unit.f46060a;
            case 23:
                fet fetVar34 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                m6m0 m6m0Var = don0.n2;
                ((y5d) obj).getClass();
                if (fetVar34.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    zcl zclVar14 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar34, 0, 5);
                    wwb.i(null, ((oon0) l7m0Var.getValue()).f25603a, 0L, 0, 0L, fetVar34, 0, 29);
                    wvb.o(null, 16.0f, 0L, fetVar34, 0, 5);
                } else {
                    fetVar34.X();
                }
                return Unit.f46060a;
            case 24:
                fet fetVar35 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                m6m0 m6m0Var2 = gup0.n2;
                ((y5d) obj).getClass();
                if (fetVar35.U(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    zcl zclVar15 = qmk.f28987a;
                    wvb.o(null, 24.0f, 0L, fetVar35, 0, 5);
                    wwb.i(null, ((uup0) l7m0Var.getValue()).f36312a, 0L, 0, 0L, fetVar35, 0, 29);
                } else {
                    fetVar35.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return a(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar36 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                int i12 = qvp0.m2;
                ((y5d) obj).getClass();
                if (fetVar36.U(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    zcl zclVar16 = qmk.f28987a;
                    wvb.o(null, 24.0f, 0L, fetVar36, 0, 5);
                    wwb.i(null, ((awp0) l7m0Var.getValue()).f1586a, 0L, 0, 0L, fetVar36, 0, 29);
                    wvb.o(null, 8.0f, 0L, fetVar36, 0, 5);
                } else {
                    fetVar36.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return b(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return c(obj, obj2, obj3);
            default:
                fet fetVar37 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                String str5 = y9r0.m2;
                ((y5d) obj).getClass();
                if (fetVar37.U(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    iar0 iar0Var = (iar0) l7m0Var.getValue();
                    if (Intrinsics.d(iar0Var, har0.f12738a)) {
                        fetVar37.e0(1414347077);
                        sj3.m(0, 0L, fetVar37, null);
                        fetVar37.r(false);
                    } else {
                        if (!(iar0Var instanceof gar0)) {
                            throw b1j.f(1414345633, fetVar37, false);
                        }
                        fetVar37.e0(895206399);
                        xcz xczVarA = ddz.a(0, 0, fetVar37, 0, 3);
                        mm40 mm40VarV = cjx.V(o7k0.d(jm40Var, 1.0f), a8k0.G(xczVarA, fetVar37), null);
                        zcl zclVar17 = qmk.f28987a;
                        lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                        boolean zG4 = fetVar37.g(iar0Var);
                        Object objP4 = fetVar37.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new nop0((gar0) iar0Var, b3);
                            fetVar37.o0(objP4);
                        }
                        b8k0.e(mm40VarV, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP4, fetVar37, 0, Response.SERVER_TIMEOUT);
                        fetVar37.r(false);
                    }
                } else {
                    fetVar37.X();
                }
                return Unit.f46060a;
        }
    }
}
