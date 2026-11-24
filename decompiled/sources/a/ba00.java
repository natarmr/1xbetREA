package a;

import android.javax.sip.message.Response;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.betbuilder.api.navigation.BetBuilderMarketsParams;
import org.xplatform.sportgame.markets.categories.api.navigation.CategoryMarketsParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ba00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2235a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ba00(pz40 pz40Var, pz40 pz40Var2, hdp0 hdp0Var, pz40 pz40Var3, Function2 function2) {
        this.f2235a = (byte) 24;
        this.c = pz40Var;
        this.d = pz40Var2;
        this.e = hdp0Var;
        this.f = pz40Var3;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        zfn zfnVar;
        long jM121getTransparent0d7_KjU;
        long jM123getWhite0d7_KjU;
        float f;
        byte b = this.f2235a;
        byte b2 = 21;
        byte b3 = 6;
        cl5 cl5Var = ukd.f35823a;
        final byte b4 = 1;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                kwj kwjVar = (kwj) obj7;
                bb00 bb00Var = (bb00) obj6;
                k6z k6zVar = (k6z) obj5;
                ppj0 ppj0Var = (ppj0) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    boolean zG = fetVar.g(bb00Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ebz(bb00Var, (byte) 24);
                        fetVar.o0(objP);
                    }
                    q5x.e(kwjVar, n0qVar, null, null, 1, 0.0f, null, null, false, (Function1) objP, null, null, null, u1c.M(-1506797922, new g54((Object) k6zVar, (Object) bb00Var, (Object) ppj0Var, (Object) function1, (byte) 11), fetVar), fetVar, 24624, 24576, 15340);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                bye0 bye0Var = (bye0) obj7;
                Function1 function2 = (Function1) obj3;
                iwe0 iwe0Var = (iwe0) obj6;
                Window window = (Window) obj5;
                cqq cqqVar = (cqq) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "REGISTER_APP_BAR_ID");
                    imm immVar = (imm) bye0Var.b.getValue();
                    boolean zG2 = fetVar2.g(function2);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new pme0(function2, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    hlm.c(mm40VarK0, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar2, 6, 0, 4084);
                    if (iwe0Var.f15486a) {
                        fetVar2.e0(1933589442);
                        if (window != null) {
                            ofm0.x(window, R.attr.uikitBackgroundContent, null, 6);
                        }
                        mm40 mm40VarK1 = mrv.k0(jm40Var, "REGISTER_BOTTOM_BAR_ID");
                        mtl mtlVar = iwe0Var.b;
                        boolean zG3 = fetVar2.g(function2);
                        Object objP3 = fetVar2.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new dvd0(function2, b2);
                            fetVar2.o0(objP3);
                        }
                        bkb.f(mm40VarK1, mtlVar, null, false, null, (Function1) objP3, fetVar2, 6, 28);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1933961318);
                        fetVar2.r(false);
                        if (window != null) {
                            ofm0.x(window, R.attr.uikitBackground, null, 6);
                        }
                    }
                    twe0 twe0Var = (twe0) bye0Var.f3413a.getValue();
                    if (Intrinsics.d(twe0Var, swe0.f32920a)) {
                        fetVar2.e0(-907439246);
                        bsr0.w(6, fetVar2, mrv.k0(jm40Var, "REGISTER_LOADER_ID"));
                        z = false;
                        fetVar2.r(false);
                    } else if (twe0Var instanceof rwe0) {
                        fetVar2.e0(-907434467);
                        mm40 mm40VarK2 = mrv.k0(jm40Var, "REGISTER_CONTENT_ID");
                        mdm mdmVar = ((rwe0) twe0Var).f31214a;
                        boolean zG4 = fetVar2.g(function2);
                        Object objP4 = fetVar2.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new pme0(function2, (byte) 2);
                            fetVar2.o0(objP4);
                        }
                        jcb.l(mm40VarK2, mdmVar, false, (Function0) objP4, fetVar2, 6, 4);
                        z = false;
                        fetVar2.r(false);
                    } else {
                        if (!(twe0Var instanceof qwe0)) {
                            throw b1j.f(-907441941, fetVar2, false);
                        }
                        fetVar2.e0(-907425180);
                        m2x.f(i120.Q(mrv.k0(jm40Var, "REGISTER_CONTENT_ID").e(o7k0.c), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), (qwe0) twe0Var, cqqVar, function2, fetVar2, 384);
                        z = false;
                        fetVar2.r(false);
                    }
                    if (bye0Var.d) {
                        fetVar2.e0(1934980071);
                        m0x0.A(6, fetVar2, mrv.k0(jm40Var, "REGISTER_OVERLAY_LOADER_ID"));
                        fetVar2.r(z);
                    } else {
                        fetVar2.e0(1935071366);
                        fetVar2.r(z);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ohq0.a((mm40) obj7, (imm) obj6, (Function0) obj5, (Function1) obj3, (Function0) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                s5x0.a((mm40) obj7, (String) obj6, (String) obj5, (smk0) obj4, (smk0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                xf0.b((mm40) obj7, (gyq0) obj6, (d9z) obj5, (hh80) obj4, (Function1) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                y9a.g((mm40) obj7, (p54) obj6, (Function1) obj3, (ugd) obj5, (ugd) obj4, (fet) obj, x8x.L(27649));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                x4d0.e((xo4) obj7, (Function1) obj3, (Function1) obj6, (Function1) obj5, (mm40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                jar0.e((l7m0) obj7, (Function1) obj3, (Function1) obj6, (Function0) obj5, (Function0) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ntr.h((List) obj7, (Function1) obj3, (Function1) obj6, (Function1) obj5, (mm40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                mrv.m((mm40) obj7, (ua5) obj6, (Function0) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                x4d0.r((mm40) obj7, (r2k0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ((gl5) obj7).f((mm40) obj6, (Fragment) obj5, (BetBuilderMarketsParams) obj4, (Function1) obj3, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                return Unit.f46060a;
            case 12:
                ul80 ul80Var = (ul80) ((am80) obj7);
                return i77.a((i77) obj2, false, false, false, null, null, (ov7) obj6, null, false, null, null, false, ul80Var.b, false, null, ul80Var.f35860a, null, (qgv0) obj5, false, null, ul80Var.c, false, false, null, (List) obj4, (HashMap) obj3, null, null, -23642246, 2044);
            case 13:
                ((Integer) obj2).getClass();
                oja0.e((mm40) obj7, (eq7) obj6, (w2d) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ry7.b((mm40) obj7, (t33) obj6, (t33) obj5, (t33) obj4, (g960) obj3, (fet) obj, x8x.L(4673));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                phu0.e((mm40) obj7, (bee) obj6, (l7m0) obj5, (Function0) obj4, (ugd) obj3, (fet) obj, x8x.L(24961));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                s5x0.k((mm40) obj7, (l7m0) obj6, (d9z) obj5, (nyq0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                x8f.a((mm40) obj7, (String) obj6, (taa) obj5, (taa) obj4, (taa) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                kc5.G((mm40) obj7, (String) obj6, (uaa) obj5, (uaa) obj4, (uaa) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gdp0 gdp0Var = (gdp0) obj7;
                mm40 mm40Var = (mm40) obj6;
                pz40 pz40Var = (pz40) obj5;
                Function2 function3 = (Function2) obj4;
                gdp0 gdp0Var2 = (gdp0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 32.0f);
                    Object[] objArr = new Object[0];
                    boolean zG5 = fetVar3.g(pz40Var);
                    Object objP5 = fetVar3.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new xx(pz40Var, (byte) 20);
                        fetVar3.o0(objP5);
                    }
                    nnw0.z(gdp0Var, mm40VarE, v3c.Y(objArr, (Function0) objP5, fetVar3), function3, fetVar3, 0);
                    mm40 mm40VarE2 = o7k0.e(mm40Var, 32.0f);
                    Object[] objArr2 = new Object[0];
                    boolean zG6 = fetVar3.g(pz40Var);
                    Object objP6 = fetVar3.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new xx(pz40Var, b2);
                        fetVar3.o0(objP6);
                    }
                    nnw0.z(gdp0Var2, mm40VarE2, v3c.Y(objArr2, (Function0) objP6, fetVar3), function3, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 20:
                mm40 mm40Var2 = (mm40) obj7;
                final vka vkaVar = (vka) obj6;
                final Function2 function4 = (Function2) obj5;
                final d9z d9zVar = (d9z) obj4;
                final d9z d9zVar2 = (d9z) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    final byte b5 = 0;
                    ay3.m(o7k0.e(mm40Var2, 100.0f), q3d.j(u1c.M(-1787558093, new xdr() { // from class: a.ska
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            byte b6 = b5;
                            pcy pcyVar = e7z.u1;
                            d9z d9zVar3 = d9zVar;
                            vka vkaVar2 = vkaVar;
                            switch (b6) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj8;
                                    fet fetVar5 = (fet) obj9;
                                    int iIntValue5 = ((Integer) obj10).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        x5d x5dVarA = w5d.a(new qw3(12.0f, false, new gne(gqw0.j, (byte) 11)), gqw0.n, fetVar5, 48);
                                        int iHashCode = Long.hashCode(fetVar5.T);
                                        bh90 bh90VarM = fetVar5.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar5, mm40Var3);
                                        mkd.c0.getClass();
                                        fetVar5.i0();
                                        if (fetVar5.S) {
                                            fetVar5.l(pcyVar);
                                        } else {
                                            fetVar5.r0();
                                        }
                                        jpm0.o(fetVar5, x5dVarA, gqw0.x);
                                        jpm0.o(fetVar5, bh90VarM, gqw0.w);
                                        jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                                        jpm0.n(fetVar5);
                                        jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                                        kcp0.a(null, vkaVar2.b, function4, fetVar5, 0, 1);
                                        kc5.F0(vkaVar2.f, d9zVar3, fetVar5, 0);
                                        fetVar5.r(true);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj8;
                                    fet fetVar6 = (fet) obj9;
                                    int iIntValue6 = ((Integer) obj10).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        pdp0 pdp0Var = vkaVar2.c;
                                        zcl zclVar4 = qmk.f28987a;
                                        qw3 qw3Var = new qw3(12.0f, false, new gne(gqw0.k, (byte) 11));
                                        ugd ugdVarM = u1c.M(-194696803, new n82(function4, vkaVar2, d9zVar3, (byte) 9), fetVar6);
                                        x5d x5dVarA2 = w5d.a(qw3Var, gqw0.n, fetVar6, 0);
                                        int iHashCode2 = Long.hashCode(fetVar6.T);
                                        bh90 bh90VarM2 = fetVar6.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var4);
                                        mkd.c0.getClass();
                                        fetVar6.i0();
                                        if (fetVar6.S) {
                                            fetVar6.l(pcyVar);
                                        } else {
                                            fetVar6.r0();
                                        }
                                        jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                                        jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                        jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                        jpm0.n(fetVar6);
                                        jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                        ugdVarM.j(y5d.f42040a, pdp0Var, fetVar6, 390);
                                        fetVar6.r(true);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar4), u1c.M(1751643380, new sd8(vkaVar, (byte) 8), fetVar4), u1c.M(995877557, new xdr() { // from class: a.ska
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            byte b6 = b4;
                            pcy pcyVar = e7z.u1;
                            d9z d9zVar3 = d9zVar2;
                            vka vkaVar2 = vkaVar;
                            switch (b6) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj8;
                                    fet fetVar5 = (fet) obj9;
                                    int iIntValue5 = ((Integer) obj10).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        x5d x5dVarA = w5d.a(new qw3(12.0f, false, new gne(gqw0.j, (byte) 11)), gqw0.n, fetVar5, 48);
                                        int iHashCode = Long.hashCode(fetVar5.T);
                                        bh90 bh90VarM = fetVar5.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar5, mm40Var3);
                                        mkd.c0.getClass();
                                        fetVar5.i0();
                                        if (fetVar5.S) {
                                            fetVar5.l(pcyVar);
                                        } else {
                                            fetVar5.r0();
                                        }
                                        jpm0.o(fetVar5, x5dVarA, gqw0.x);
                                        jpm0.o(fetVar5, bh90VarM, gqw0.w);
                                        jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                                        jpm0.n(fetVar5);
                                        jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                                        kcp0.a(null, vkaVar2.b, function4, fetVar5, 0, 1);
                                        kc5.F0(vkaVar2.f, d9zVar3, fetVar5, 0);
                                        fetVar5.r(true);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj8;
                                    fet fetVar6 = (fet) obj9;
                                    int iIntValue6 = ((Integer) obj10).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        pdp0 pdp0Var = vkaVar2.c;
                                        zcl zclVar4 = qmk.f28987a;
                                        qw3 qw3Var = new qw3(12.0f, false, new gne(gqw0.k, (byte) 11));
                                        ugd ugdVarM = u1c.M(-194696803, new n82(function4, vkaVar2, d9zVar3, (byte) 9), fetVar6);
                                        x5d x5dVarA2 = w5d.a(qw3Var, gqw0.n, fetVar6, 0);
                                        int iHashCode2 = Long.hashCode(fetVar6.T);
                                        bh90 bh90VarM2 = fetVar6.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var4);
                                        mkd.c0.getClass();
                                        fetVar6.i0();
                                        if (fetVar6.S) {
                                            fetVar6.l(pcyVar);
                                        } else {
                                            fetVar6.r0();
                                        }
                                        jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                                        jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                        jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                        jpm0.n(fetVar6);
                                        jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                        ugdVarM.j(y5d.f42040a, pdp0Var, fetVar6, 390);
                                        fetVar6.r(true);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar4)), fetVar4);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                ((kl5) obj7).a((mm40) obj6, (Fragment) obj5, (CategoryMarketsParams) obj4, (Function1) obj3, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                kpb.b((gy40) obj7, (gk5) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(55));
                return Unit.f46060a;
            case 23:
                mm40 mm40Var3 = (mm40) obj7;
                final pz40 pz40Var2 = (pz40) obj6;
                final pod podVar = (pod) obj5;
                final Function2 function5 = (Function2) obj4;
                final pz40 pz40Var3 = (pz40) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    final byte b6 = 0;
                    y0x0.h(3456, u1c.M(-1267876773, new xdr() { // from class: a.kod
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            byte b7 = b6;
                            cl5 cl5Var2 = ukd.f35823a;
                            final Function2 function6 = function5;
                            final pod podVar2 = podVar;
                            pz40 pz40Var4 = pz40Var2;
                            final byte b8 = 1;
                            final byte b9 = 0;
                            yhg0 yhg0Var = (yhg0) obj8;
                            fet fetVar6 = (fet) obj9;
                            int iIntValue6 = ((Integer) obj10).intValue();
                            switch (b7) {
                                case 0:
                                    yhg0Var.getClass();
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        Object[] objArr3 = new Object[0];
                                        boolean zG7 = fetVar6.g(pz40Var4);
                                        Object objP7 = fetVar6.P();
                                        if (zG7 || objP7 == cl5Var2) {
                                            objP7 = new xx(pz40Var4, (byte) 25);
                                            fetVar6.o0(objP7);
                                        }
                                        obc.d(dgp0.d.a(v3c.Y(objArr3, (Function0) objP7, fetVar6).getValue()), u1c.M(-1097432805, new Function2() { // from class: a.lod
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                byte b10 = b8;
                                                jm40 jm40Var2 = jm40.b;
                                                Function2 function7 = function6;
                                                pod podVar3 = podVar2;
                                                switch (b10) {
                                                    case 0:
                                                        fet fetVar7 = (fet) obj11;
                                                        int iIntValue7 = ((Integer) obj12).intValue();
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                                            mm40 mm40VarD = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var = podVar3.c;
                                                            zcl zclVar4 = qmk.f28987a;
                                                            dwi0.h(mm40VarD, ddp0Var, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(1718634552, new naa(function7, (byte) 4), fetVar7), fetVar7, 24582, 8);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar8 = (fet) obj11;
                                                        int iIntValue8 = ((Integer) obj12).intValue();
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var2 = podVar3.b;
                                                            zcl zclVar5 = qmk.f28987a;
                                                            dwi0.h(mm40VarD2, ddp0Var2, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(2014677337, new naa(function7, (byte) 3), fetVar8), fetVar8, 24582, 8);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar6), fetVar6, 56);
                                        m0x0.i(podVar2.d, pz40Var4, fetVar6);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                                default:
                                    yhg0Var.getClass();
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        Object[] objArr4 = new Object[0];
                                        boolean zG8 = fetVar6.g(pz40Var4);
                                        Object objP8 = fetVar6.P();
                                        if (zG8 || objP8 == cl5Var2) {
                                            objP8 = new xx(pz40Var4, (byte) 24);
                                            fetVar6.o0(objP8);
                                        }
                                        obc.d(dgp0.d.a(v3c.Y(objArr4, (Function0) objP8, fetVar6).getValue()), u1c.M(-1393475590, new Function2() { // from class: a.lod
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                byte b10 = b9;
                                                jm40 jm40Var2 = jm40.b;
                                                Function2 function7 = function6;
                                                pod podVar3 = podVar2;
                                                switch (b10) {
                                                    case 0:
                                                        fet fetVar7 = (fet) obj11;
                                                        int iIntValue7 = ((Integer) obj12).intValue();
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                                            mm40 mm40VarD = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var = podVar3.c;
                                                            zcl zclVar4 = qmk.f28987a;
                                                            dwi0.h(mm40VarD, ddp0Var, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(1718634552, new naa(function7, (byte) 4), fetVar7), fetVar7, 24582, 8);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar8 = (fet) obj11;
                                                        int iIntValue8 = ((Integer) obj12).intValue();
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var2 = podVar3.b;
                                                            zcl zclVar5 = qmk.f28987a;
                                                            dwi0.h(mm40VarD2, ddp0Var2, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(2014677337, new naa(function7, (byte) 3), fetVar8), fetVar8, 24582, 8);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar6), fetVar6, 56);
                                        m0x0.i(podVar2.e, pz40Var4, fetVar6);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar5), u1c.M(-1563919558, new xdr() { // from class: a.kod
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            byte b7 = b4;
                            cl5 cl5Var2 = ukd.f35823a;
                            final Function2 function6 = function5;
                            final pod podVar2 = podVar;
                            pz40 pz40Var4 = pz40Var3;
                            final byte b8 = 1;
                            final byte b9 = 0;
                            yhg0 yhg0Var = (yhg0) obj8;
                            fet fetVar6 = (fet) obj9;
                            int iIntValue6 = ((Integer) obj10).intValue();
                            switch (b7) {
                                case 0:
                                    yhg0Var.getClass();
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        Object[] objArr3 = new Object[0];
                                        boolean zG7 = fetVar6.g(pz40Var4);
                                        Object objP7 = fetVar6.P();
                                        if (zG7 || objP7 == cl5Var2) {
                                            objP7 = new xx(pz40Var4, (byte) 25);
                                            fetVar6.o0(objP7);
                                        }
                                        obc.d(dgp0.d.a(v3c.Y(objArr3, (Function0) objP7, fetVar6).getValue()), u1c.M(-1097432805, new Function2() { // from class: a.lod
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                byte b10 = b8;
                                                jm40 jm40Var2 = jm40.b;
                                                Function2 function7 = function6;
                                                pod podVar3 = podVar2;
                                                switch (b10) {
                                                    case 0:
                                                        fet fetVar7 = (fet) obj11;
                                                        int iIntValue7 = ((Integer) obj12).intValue();
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                                            mm40 mm40VarD = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var = podVar3.c;
                                                            zcl zclVar4 = qmk.f28987a;
                                                            dwi0.h(mm40VarD, ddp0Var, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(1718634552, new naa(function7, (byte) 4), fetVar7), fetVar7, 24582, 8);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar8 = (fet) obj11;
                                                        int iIntValue8 = ((Integer) obj12).intValue();
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var2 = podVar3.b;
                                                            zcl zclVar5 = qmk.f28987a;
                                                            dwi0.h(mm40VarD2, ddp0Var2, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(2014677337, new naa(function7, (byte) 3), fetVar8), fetVar8, 24582, 8);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar6), fetVar6, 56);
                                        m0x0.i(podVar2.d, pz40Var4, fetVar6);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                                default:
                                    yhg0Var.getClass();
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        Object[] objArr4 = new Object[0];
                                        boolean zG8 = fetVar6.g(pz40Var4);
                                        Object objP8 = fetVar6.P();
                                        if (zG8 || objP8 == cl5Var2) {
                                            objP8 = new xx(pz40Var4, (byte) 24);
                                            fetVar6.o0(objP8);
                                        }
                                        obc.d(dgp0.d.a(v3c.Y(objArr4, (Function0) objP8, fetVar6).getValue()), u1c.M(-1393475590, new Function2() { // from class: a.lod
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj11, Object obj12) {
                                                byte b10 = b9;
                                                jm40 jm40Var2 = jm40.b;
                                                Function2 function7 = function6;
                                                pod podVar3 = podVar2;
                                                switch (b10) {
                                                    case 0:
                                                        fet fetVar7 = (fet) obj11;
                                                        int iIntValue7 = ((Integer) obj12).intValue();
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                                            mm40 mm40VarD = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var = podVar3.c;
                                                            zcl zclVar4 = qmk.f28987a;
                                                            dwi0.h(mm40VarD, ddp0Var, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(1718634552, new naa(function7, (byte) 4), fetVar7), fetVar7, 24582, 8);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar8 = (fet) obj11;
                                                        int iIntValue8 = ((Integer) obj12).intValue();
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 0.6f);
                                                            ddp0 ddp0Var2 = podVar3.b;
                                                            zcl zclVar5 = qmk.f28987a;
                                                            dwi0.h(mm40VarD2, ddp0Var2, new qw3(8.0f, true, new jf4((byte) 14)), u1c.M(2014677337, new naa(function7, (byte) 3), fetVar8), fetVar8, 24582, 8);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar6), fetVar6, 56);
                                        m0x0.i(podVar2.e, pz40Var4, fetVar6);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar5), fetVar5, o7k0.e(mm40Var3, 72.0f));
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 24:
                pz40 pz40Var4 = (pz40) obj7;
                pz40 pz40Var5 = (pz40) obj6;
                hdp0 hdp0Var = (hdp0) obj5;
                pz40 pz40Var6 = (pz40) obj4;
                Function2 function6 = (Function2) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (((Boolean) pz40Var4.getValue()).booleanValue()) {
                        fetVar6.e0(-769519590);
                        zfnVar = m8m0.f21378a;
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(zfnVar)).m113getRed0d7_KjU();
                    } else {
                        fetVar6.e0(-769518526);
                        zfnVar = m8m0.f21378a;
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(zfnVar)).m121getTransparent0d7_KjU();
                    }
                    fetVar6.r(false);
                    l7m0 l7m0VarB = m5k0.b(jM121getTransparent0d7_KjU, null, fetVar6, 0, 14);
                    if (((Boolean) pz40Var5.getValue()).booleanValue()) {
                        fetVar6.e0(-769513892);
                        jM123getWhite0d7_KjU = ((StaticColors) fetVar6.k(zfnVar)).m98getGreen0d7_KjU();
                    } else {
                        fetVar6.e0(-769512772);
                        jM123getWhite0d7_KjU = ((StaticColors) fetVar6.k(zfnVar)).m123getWhite0d7_KjU();
                    }
                    fetVar6.r(false);
                    l7m0 l7m0VarB2 = m5k0.b(jM123getWhite0d7_KjU, null, fetVar6, 0, 14);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar6, 48);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar6, jm40Var2);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(e7z.u1);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    h5a0 h5a0Var = hdp0Var.f12880a;
                    if (h5a0Var instanceof y4a0) {
                        zcl zclVar4 = qmk.f28987a;
                        f = 28.0f;
                    } else {
                        if (!(h5a0Var instanceof c5a0)) {
                            t9f.b();
                            return null;
                        }
                        zcl zclVar5 = qmk.f28987a;
                        f = 8.0f;
                    }
                    qsm0.g(dw9.h(1.0f, s5x0.N(jm40Var2, f, 0.0f, 4.0f, 0.0f, 10), true), hdp0Var, u1c.M(2060383587, new naa(function6, b3), fetVar6), fetVar6);
                    wdx.g(0, fetVar6, o7k0.n(jm40Var2, 12.0f), l7m0VarB);
                    mm40 mm40VarN = s5x0.N(o7k0.u(jm40Var2, 0.0f, 144.0f, 1), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    String str = (String) pz40Var6.getValue();
                    ((g1t0) fetVar6.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA = y9q0.a(g1t0.l(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447);
                    boolean zG7 = fetVar6.g(l7m0VarB2);
                    Object objP7 = fetVar6.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new oad(l7m0VarB2, (byte) 3);
                        fetVar6.o0(objP7);
                    }
                    aad.e(str, mm40VarN, y9q0VarA, null, 2, false, 1, 0, (n4d) objP7, new n05(qmk.p, qmk.s, qmk.n), fetVar6, 1597440, 168);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                mrv.Z((mm40) obj7, (d9z) obj6, (l7m0) obj5, (xdr) obj4, (ugd) obj3, (fet) obj, x8x.L(24577));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                v3c.h((mm40) obj7, (o0x) obj6, (m0x) obj5, (y3d) obj4, (String) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                fbc.n((mm40) obj7, (o0x) obj6, (y3d) obj5, (y3d) obj4, (m0x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                jjj.a((mm40) obj7, (kjj) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                xf0.s((msk) obj7, (l7m0) obj6, (l7m0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(385));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ba00(mm40 mm40Var, Object obj, Function0 function0, Function1 function1, wdr wdrVar, int i, byte b) {
        this.f2235a = b;
        this.c = mm40Var;
        this.d = obj;
        this.e = function0;
        this.b = function1;
        this.f = wdrVar;
    }

    public /* synthetic */ ba00(mm40 mm40Var, p54 p54Var, Function1 function1, ugd ugdVar, ugd ugdVar2, int i) {
        this.f2235a = (byte) 5;
        this.c = mm40Var;
        this.d = p54Var;
        this.b = function1;
        this.e = ugdVar;
        this.f = ugdVar2;
    }

    public /* synthetic */ ba00(bye0 bye0Var, Function1 function1, iwe0 iwe0Var, Window window, cqq cqqVar) {
        this.f2235a = (byte) 1;
        this.c = bye0Var;
        this.b = function1;
        this.d = iwe0Var;
        this.e = window;
        this.f = cqqVar;
    }

    public /* synthetic */ ba00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f2235a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ ba00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.f2235a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ ba00(Object obj, Function1 function1, Function1 function2, wdr wdrVar, Object obj2, int i, byte b) {
        this.f2235a = b;
        this.c = obj;
        this.b = function1;
        this.d = function2;
        this.e = wdrVar;
        this.f = obj2;
    }
}
