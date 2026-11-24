package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class acb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f619a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ acb0(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, int i) {
        this.f619a = (byte) 17;
        this.c = mm40Var;
        this.b = l7m0Var;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function1;
        this.g = function2;
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0556  */
    /* JADX WARN: Code duplicated, block: B:216:0x056a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0571  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xk80 xk80Var;
        boolean z;
        zfn zfnVar;
        long jM121getTransparent0d7_KjU;
        boolean z2;
        long textPrimary;
        lh80 lh80VarT;
        ugg0 ugg0VarA;
        lh80 lh80VarT2;
        lh80 lh80VarT3;
        ?? r9;
        int i;
        lh80 lh80VarT4;
        int iOrdinal;
        long jI;
        float f;
        int i2;
        byte b = this.f619a;
        pcy pcyVar = e7z.u1;
        byte b2 = 14;
        Object obj3 = ukd.f35823a;
        Object obj4 = this.f;
        Object obj5 = this.g;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj7;
                xk80 xk80Var2 = (xk80) obj8;
                pv40 pv40Var = (pv40) obj4;
                l7m0 l7m0Var2 = (l7m0) obj6;
                l7m0 l7m0Var3 = (l7m0) obj9;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                mi70 mi70Var = ccb0.X1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Integer numValueOf = Integer.valueOf(((Number) l7m0Var.getValue()).intValue());
                    boolean zG = fetVar.g(l7m0Var) | fetVar.g(xk80Var2) | fetVar.g(pv40Var) | fetVar.g(l7m0Var2);
                    Object objP = fetVar.P();
                    if (zG || objP == obj3) {
                        wmq wmqVar = new wmq((Object) xk80Var2, (Object) pv40Var, (Object) l7m0Var2, (Object) l7m0Var, (yje) null, (byte) 19);
                        xk80Var = xk80Var2;
                        fetVar.o0(wmqVar);
                        objP = wmqVar;
                    } else {
                        xk80Var = xk80Var2;
                    }
                    m0x0.t(fetVar, numValueOf, (Function2) objP);
                    if (((a4x) l7m0Var3.getValue()).isEmpty()) {
                        fetVar.e0(735119511);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(734168121);
                        q5x.e(xk80Var, o7k0.c, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1007391943, new n82(pv40Var, l7m0Var3, linkedHashMap, (byte) 23), fetVar), fetVar, 100663344, 24576, 16124);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                nz2.a((Class) obj7, (mm40) obj6, (d5r) obj9, (Bundle) obj8, (lkz) obj4, (Function1) obj5, (fet) obj, x8x.L(196657));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                p8a.d((mm40) obj7, (a4x) obj6, (a4d) obj9, (gfm0) obj8, (gfm0) obj4, (qge) obj5, (fet) obj, x8x.L(196609));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                eeq.h((mm40) obj7, (ugd) obj6, (ugd) obj9, (ugd) obj8, (ydr) obj4, (ydr) obj5, (fet) obj, x8x.L(3505));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                x4d0.f((mm40) obj7, (u2k0) obj6, (nyq0) obj9, (Function0) obj8, (Function0) obj4, (Function0) obj5, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                nnw0.b((mm40) obj7, (xy6) obj6, (Function0) obj9, (Function0) obj8, (Function0) obj4, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                m0x0.f((mm40) obj7, (yy6) obj6, (Function0) obj9, (Function0) obj8, (Function0) obj4, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                oja0.g((mm40) obj7, (ugd) obj6, (ugd) obj9, (ugd) obj8, (ugd) obj4, (ugd) obj5, (fet) obj, x8x.L(224695));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                epv0.h((Function2) obj7, (ugd) obj6, (ugd) obj9, (ugd) obj8, (Function0) obj4, (xpj0) obj5, (fet) obj, x8x.L(3505));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                rq8.h((mm40) obj7, (String) obj6, (u5a0) obj9, (j9m0) obj8, (Function0) obj4, (ugd) obj5, (fet) obj, x8x.L(196609));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ozb.g((mm40) obj7, (ow3) obj6, (yx7) obj9, (ugd) obj8, (ugd) obj4, (ugd) obj5, (fet) obj, x8x.L(224257));
                return Unit.f46060a;
            case 11:
                pz40 pz40Var = (pz40) obj7;
                pz40 pz40Var2 = (pz40) obj6;
                mm40 mm40Var = (mm40) obj9;
                jdp0 jdp0Var = (jdp0) obj8;
                pz40 pz40Var3 = (pz40) obj4;
                Function2 function2 = (Function2) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((Boolean) pz40Var.getValue()).booleanValue()) {
                        fetVar2.e0(631660618);
                        zfnVar = m8m0.f21378a;
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m113getRed0d7_KjU();
                        z = false;
                    } else {
                        z = false;
                        fetVar2.e0(631661682);
                        zfnVar = m8m0.f21378a;
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU();
                    }
                    fetVar2.r(z);
                    l7m0 l7m0VarB = m5k0.b(jM121getTransparent0d7_KjU, null, fetVar2, 0, 14);
                    if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                        fetVar2.e0(631666316);
                        textPrimary = ((StaticColors) fetVar2.k(zfnVar)).m98getGreen0d7_KjU();
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar2.e0(631667250);
                        textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                    }
                    fetVar2.r(z2);
                    l7m0 l7m0VarB2 = m5k0.b(textPrimary, null, fetVar2, 0, 14);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    osm0.a(dw9.h(1.0f, s5x0.N(jm40Var, 28.0f, 0.0f, 8.0f, 0.0f, 10), true), jdp0Var, u1c.M(188919690, new naa(function2, (byte) 5), fetVar2), fetVar2);
                    xdx.b(0, fetVar2, o7k0.n(jm40Var, 12.0f), l7m0VarB);
                    mm40 mm40VarN = s5x0.N(o7k0.u(jm40Var, 0.0f, 144.0f, 1), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    String str = (String) pz40Var3.getValue();
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA = y9q0.a(g1t0.l(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447);
                    boolean zG2 = fetVar2.g(l7m0VarB2);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == obj3) {
                        objP2 = new oad(l7m0VarB2, (byte) 2);
                        fetVar2.o0(objP2);
                    }
                    aad.e(str, mm40VarN, y9q0VarA, null, 2, false, 1, 0, (n4d) objP2, new n05(qmk.p, qmk.s, qmk.n), fetVar2, 1597440, 168);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                ulb.e((mm40) obj7, (p2r0) obj6, (xcz) obj9, (hh80) obj8, (qw3) obj4, (Function1) obj5, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                sj3.f((mm40) obj7, (q2r0) obj6, (xcz) obj9, (hh80) obj8, (qw3) obj4, (Function1) obj5, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                tlb.A((hr90) obj7, (SimpleDate) obj6, (SimpleDate) obj9, (Locale) obj8, this.f, (Function1) obj5, (fet) obj, x8x.L(585));
                return Unit.f46060a;
            case 15:
                mm40 mm40Var2 = (mm40) obj7;
                wul wulVar = (wul) obj6;
                Function0 function0 = (Function0) obj9;
                mm40 mm40Var3 = (mm40) obj8;
                sul sulVar = (sul) obj4;
                mm40 mm40Var4 = (mm40) obj5;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarK0 = mrv.k0(mm40Var2, hul.f13686a);
                    oe9 oe9Var = wulVar.b;
                    oe9 oe9Var2 = wulVar.b;
                    boolean z3 = wulVar.d;
                    xe9 xe9Var = wulVar.c;
                    int iOrdinal2 = oe9Var.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                        lh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        if (iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        zcl zclVar2 = qmk.f28987a;
                        lh80VarT = s5x0.t(0.0f, 4.0f, 1);
                    }
                    mm40 mm40VarI = s5x0.I(mm40VarK0, lh80VarT);
                    boolean z4 = wulVar.d;
                    boolean zG3 = fetVar3.g(wulVar) | fetVar3.g(function0);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == obj3) {
                        objP3 = new lrk(wulVar, function0, (byte) 12);
                        fetVar3.o0(objP3);
                    }
                    mm40 mm40VarE = y860.W(mm40VarI, null, null, z4, null, (Function0) objP3, 24).e(mm40Var3);
                    long j = z3 ? ((y3d) sulVar.f32826a.invoke()).f41946a : ((y3d) sulVar.c.invoke()).f41946a;
                    if (xe9Var != null) {
                        boolean z5 = xe9Var instanceof ue9;
                        if (z5 || (xe9Var instanceof ve9) || (xe9Var instanceof we9) || (xe9Var instanceof te9)) {
                            zcl zclVar3 = qmk.f28987a;
                            ugg0VarA = vgg0.a(10.0f);
                        } else if (xe9Var instanceof se9) {
                            ugg0VarA = vgg0.f37379a;
                        }
                        mm40 mm40VarQ = i120.Q(mm40VarE, j, ugg0VarA);
                        if (z5) {
                            int iOrdinal3 = oe9Var.ordinal();
                            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                                f = 0.0f;
                                i2 = 2;
                            } else {
                                i2 = 2;
                                if (iOrdinal3 == 2) {
                                    f = 0.0f;
                                } else {
                                    if (iOrdinal3 != 3) {
                                        t9f.b();
                                        return null;
                                    }
                                    zcl zclVar4 = qmk.f28987a;
                                    lh80VarT2 = s5x0.t(10.0f, 0.0f, 2);
                                }
                            }
                            zcl zclVar5 = qmk.f28987a;
                            lh80VarT3 = s5x0.t(12.0f, f, i2);
                            lh80VarT2 = lh80VarT3;
                        } else if (xe9Var instanceof ve9) {
                            int iOrdinal4 = oe9Var.ordinal();
                            if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                                zcl zclVar6 = qmk.f28987a;
                                lh80VarT3 = s5x0.u(8.0f, 0.0f, 12.0f, 0.0f, 10);
                                lh80VarT2 = lh80VarT3;
                            } else {
                                if (iOrdinal4 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                zcl zclVar7 = qmk.f28987a;
                                lh80VarT2 = s5x0.u(6.0f, 0.0f, 10.0f, 0.0f, 10);
                            }
                        } else if (xe9Var instanceof we9) {
                            int iOrdinal5 = oe9Var.ordinal();
                            if (iOrdinal5 == 0 || iOrdinal5 == 1 || iOrdinal5 == 2) {
                                zcl zclVar8 = qmk.f28987a;
                                lh80VarT3 = s5x0.u(12.0f, 0.0f, 8.0f, 0.0f, 10);
                                lh80VarT2 = lh80VarT3;
                            } else {
                                if (iOrdinal5 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                zcl zclVar9 = qmk.f28987a;
                                lh80VarT2 = s5x0.u(10.0f, 0.0f, 6.0f, 0.0f, 10);
                            }
                        } else {
                            if (!(xe9Var instanceof se9) && !(xe9Var instanceof te9)) {
                                t9f.b();
                                return null;
                            }
                            int iOrdinal6 = oe9Var.ordinal();
                            if (iOrdinal6 == 0 || iOrdinal6 == 1) {
                                zcl zclVar10 = qmk.f28987a;
                                lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
                            } else if (iOrdinal6 == 2) {
                                zcl zclVar11 = qmk.f28987a;
                                lh80VarT2 = s5x0.t(6.0f, 0.0f, 2);
                            } else {
                                if (iOrdinal6 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                zcl zclVar12 = qmk.f28987a;
                                lh80VarT3 = s5x0.t(4.0f, 0.0f, 2);
                                lh80VarT2 = lh80VarT3;
                            }
                        }
                        mm40 mm40VarE0 = o2e.e0(s5x0.I(mm40VarQ, lh80VarT2), "DS_BUTTON_TAG");
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                        int iHashCode2 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM2 = fetVar3.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE0);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                        if (wulVar.e) {
                            fetVar3.e0(2045290736);
                            sul sulVar2 = wulVar.f39796a;
                            long j2 = ((y3d) (z3 ? sulVar2.b : sulVar2.d).invoke()).f41946a;
                            if (xe9Var instanceof ve9) {
                                int iOrdinal7 = oe9Var.ordinal();
                                if (iOrdinal7 != 0 && iOrdinal7 != 1 && iOrdinal7 != 2 && iOrdinal7 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                lh80VarT4 = s5x0.u(4.0f, 0.0f, 0.0f, 0.0f, 14);
                            } else {
                                if (xe9Var instanceof we9) {
                                    int iOrdinal8 = oe9Var.ordinal();
                                    if (iOrdinal8 != 0 && iOrdinal8 != 1 && iOrdinal8 != 2 && iOrdinal8 != 3) {
                                        t9f.b();
                                        return null;
                                    }
                                    lh80VarT4 = s5x0.u(0.0f, 0.0f, 4.0f, 0.0f, 11);
                                } else {
                                    if (!z5 && !(xe9Var instanceof se9) && !(xe9Var instanceof te9)) {
                                        t9f.b();
                                        return null;
                                    }
                                    int iOrdinal9 = oe9Var.ordinal();
                                    if (iOrdinal9 == 0 || iOrdinal9 == 1 || iOrdinal9 == 2) {
                                        i = 3;
                                    } else {
                                        i = 3;
                                        if (iOrdinal9 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                    }
                                    lh80VarT4 = s5x0.t(0.0f, 0.0f, i);
                                }
                                mm40 mm40VarI2 = s5x0.I(jm40.b, lh80VarT4);
                                iOrdinal = oe9Var.ordinal();
                                if (iOrdinal != 0) {
                                    jI = qbc.i(20.0f, 20.0f);
                                } else if (iOrdinal != 1 || iOrdinal == 2) {
                                    jI = qbc.i(16.0f, 16.0f);
                                } else {
                                    if (iOrdinal != i) {
                                        t9f.b();
                                        return null;
                                    }
                                    jI = qbc.i(12.0f, 12.0f);
                                }
                                p3c0.a(o7k0.o(jI, mm40VarI2), j2, 2.0f, 0L, 0, 0.0f, fetVar3, 0, 56);
                                r9 = 0;
                                fetVar3.r(false);
                            }
                            i = 3;
                            mm40 mm40VarI3 = s5x0.I(jm40.b, lh80VarT4);
                            iOrdinal = oe9Var.ordinal();
                            if (iOrdinal != 0) {
                                jI = qbc.i(20.0f, 20.0f);
                            } else if (iOrdinal != 1) {
                                jI = qbc.i(16.0f, 16.0f);
                            } else {
                                jI = qbc.i(16.0f, 16.0f);
                            }
                            p3c0.a(o7k0.o(jI, mm40VarI3), j2, 2.0f, 0L, 0, 0.0f, fetVar3, 0, 56);
                            r9 = 0;
                            fetVar3.r(false);
                        } else {
                            r9 = 0;
                            fetVar3.e0(2045914425);
                            fetVar3.r(false);
                        }
                        if (xe9Var instanceof se9) {
                            fetVar3.e0(2046046826);
                            qzb.z(mm40Var4, ((se9) xe9Var).f32067a, oe9Var2, fetVar3, r9);
                            fetVar3.r(r9);
                        } else if (xe9Var instanceof te9) {
                            fetVar3.e0(2046340551);
                            qzb.A(mm40Var4, ((te9) xe9Var).f33808a, oe9Var2, fetVar3, r9);
                            fetVar3.r(r9);
                        } else if (z5) {
                            fetVar3.e0(2046629781);
                            qzb.B(0, 0, wulVar.b, fetVar3, o2e.e0(mm40Var4, "LABEL_BUTTON_TAG"), ((ue9) xe9Var).f35513a);
                            fetVar3.r(false);
                        } else if (xe9Var instanceof ve9) {
                            fetVar3.e0(2046946446);
                            ve9 ve9Var = (ve9) xe9Var;
                            qzb.C(ve9Var.b, 0, wulVar.b, fetVar3, o2e.e0(mm40Var4, "LABEL_ICON_LEFT_BUTTON_TAG"), ve9Var.f37272a);
                            fetVar3.r(false);
                        } else {
                            if (!(xe9Var instanceof we9)) {
                                throw b1j.f(1728567382, fetVar3, false);
                            }
                            fetVar3.e0(2047332427);
                            we9 we9Var = (we9) xe9Var;
                            qzb.D(we9Var.b, 0, wulVar.b, fetVar3, o2e.e0(mm40Var4, "LABEL_ICON_RIGHT_BUTTON_TAG"), we9Var.f39008a);
                            fetVar3.r(false);
                        }
                        fetVar3.r(true);
                    }
                    t9f.b();
                    return null;
                }
                fetVar3.X();
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ahb.h((vhm) obj7, (Function0) obj6, (Function1) obj9, (Function0) obj8, (Function1) obj4, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                ay3.r((mm40) obj6, (l7m0) obj7, (xcz) obj9, (qdz) obj8, (Function1) obj4, (Function1) obj5, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                unh0.f0((mm40) obj7, (String) obj6, (String) obj9, (nrq) obj8, (String) obj4, (String) obj5, (fet) obj, x8x.L(224257));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                dub.E((mm40) obj7, (o2s) obj6, (ugd) obj9, (ugd) obj8, (ugd) obj4, (ugd) obj5, (fet) obj, x8x.L(224647));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                ibc.y((String) obj7, (String) obj6, (String) obj9, (String) obj8, (String) obj4, (String) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                ucx.o((mm40) obj7, (kb30) obj6, (String) obj9, (String) obj8, (String) obj4, (a4x) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                m8x.n((mm40) obj7, (j43) obj6, (String) obj9, (xdr) obj8, (ugd) obj4, (ugd) obj5, (fet) obj, x8x.L(224257));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                r7x.d(iL, (qw3) obj4, (fet) obj, (a4x) obj6, (xcz) obj8, (mm40) obj7, (lh80) obj9, (Function2) obj5);
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                o050.F((mm40) obj7, (w2d) obj6, (fqj0) obj9, (kr50) obj8, (xdr) obj4, (Function0) obj5, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                l7m0 l7m0Var4 = (l7m0) obj7;
                z3f0 z3f0Var = (z3f0) obj8;
                wpq wpqVar = (wpq) obj4;
                pkk0 pkk0Var = (pkk0) obj5;
                l7m0 l7m0Var5 = (l7m0) obj6;
                l7m0 l7m0Var6 = (l7m0) obj9;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                zie0 zie0Var = z3f0.Y1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int iIntValue5 = ((Number) l7m0Var5.getValue()).intValue();
                    a4x a4xVar = (a4x) l7m0Var6.getValue();
                    aoo0 aoo0Var = ((v4f0) l7m0Var4.getValue()).c;
                    boolean zI = fetVar4.i(z3f0Var) | fetVar4.i(wpqVar) | fetVar4.g(pkk0Var);
                    Object objP4 = fetVar4.P();
                    if (zI || objP4 == obj3) {
                        objP4 = new zlb0(z3f0Var, wpqVar, pkk0Var, b2);
                        fetVar4.o0(objP4);
                    }
                    n7x.k(null, iIntValue5, a4xVar, aoo0Var, (Function1) objP4, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                n7x.l((mm40) obj6, (String) obj9, (String) obj8, (l7m0) obj7, (prm) obj4, (Function1) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                x4d0.N((mm40) obj7, (xx30) obj6, (bmh0) obj9, (x6q0) obj8, (cqq) obj4, (Function1) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                unh0.b0((Function0) obj9, (Function0) obj8, (Function0) obj4, (Function1) obj5, (l7m0) obj7, (l7m0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                pz40 pz40Var4 = (pz40) obj9;
                g960 g960Var = (g960) obj8;
                nrq nrqVar = (nrq) obj4;
                l7m0 l7m0Var7 = (l7m0) obj7;
                l7m0 l7m0Var8 = (l7m0) obj6;
                pz40 pz40Var5 = (pz40) obj5;
                fet fetVar5 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    wke wkeVar = (wke) pz40Var4.getValue();
                    Object objP5 = fetVar5.P();
                    if (objP5 == obj3) {
                        objP5 = new thj0((byte) 18);
                        fetVar5.o0(objP5);
                    }
                    ay3.f(wkeVar, null, (Function1) objP5, null, null, null, u1c.M(453515563, new t39((Object) g960Var, (Object) nrqVar, (Object) l7m0Var7, (Object) l7m0Var8, (Object) pz40Var5, (byte) 3), fetVar5), fetVar5, 1573248, 58);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ acb0(mm40 mm40Var, String str, String str2, l7m0 l7m0Var, prm prmVar, Function1 function1, int i) {
        this.f619a = (byte) 26;
        this.c = mm40Var;
        this.d = str;
        this.e = str2;
        this.b = l7m0Var;
        this.f = prmVar;
        this.g = function1;
    }

    public /* synthetic */ acb0(pz40 pz40Var, g960 g960Var, nrq nrqVar, l7m0 l7m0Var, l7m0 l7m0Var2, pz40 pz40Var2) {
        this.f619a = (byte) 29;
        this.d = pz40Var;
        this.e = g960Var;
        this.f = nrqVar;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.g = pz40Var2;
    }

    public /* synthetic */ acb0(l7m0 l7m0Var, kwj kwjVar, pv40 pv40Var, l7m0 l7m0Var2, l7m0 l7m0Var3, LinkedHashMap linkedHashMap) {
        this.f619a = (byte) 0;
        this.b = l7m0Var;
        this.e = kwjVar;
        this.f = pv40Var;
        this.c = l7m0Var2;
        this.d = l7m0Var3;
        this.g = linkedHashMap;
    }

    public /* synthetic */ acb0(l7m0 l7m0Var, z3f0 z3f0Var, wpq wpqVar, pkk0 pkk0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        this.f619a = (byte) 25;
        this.b = l7m0Var;
        this.e = z3f0Var;
        this.f = wpqVar;
        this.g = pkk0Var;
        this.c = l7m0Var2;
        this.d = l7m0Var3;
    }

    public /* synthetic */ acb0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.f619a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ acb0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, byte b) {
        this.f619a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ acb0(Function0 function0, Function0 function1, Function0 function2, Function1 function3, l7m0 l7m0Var, l7m0 l7m0Var2, int i) {
        this.f619a = (byte) 28;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function3;
        this.b = l7m0Var;
        this.c = l7m0Var2;
    }
}
