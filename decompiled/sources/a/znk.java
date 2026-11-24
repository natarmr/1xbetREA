package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class znk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44679a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ znk(Object obj, Object obj2, Object obj3, byte b) {
        this.f44679a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar;
        byte b = this.f44679a;
        byte b2 = 14;
        byte b3 = 7;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 3;
        boolean z = false;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj5;
                pm80 pm80Var = (pm80) obj4;
                qge qgeVar = (qge) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar2.o0(objP);
                    }
                    pz40 pz40Var = (pz40) objP;
                    mm40 mm40VarE0 = o2e.e0(o7k0.c, "DISCIPLINE_BLOCK_BOX_IMAGE");
                    boolean zG = fetVar2.g(str);
                    Object objP2 = fetVar2.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new ngh(str, pz40Var, b2);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
                    zx7 zx7Var = gqw0.c;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ca6(pz40Var, (byte) 26);
                        fetVar2.o0(objP3);
                    }
                    Function1 function1 = (Function1) objP3;
                    Object objP4 = fetVar2.P();
                    if (objP4 == cl5Var) {
                        objP4 = new ca6(pz40Var, (byte) 25);
                        fetVar2.o0(objP4);
                    }
                    k7x.b(str, null, mm40VarA, pm80Var, pm80Var, null, null, function1, (Function1) objP4, zx7Var, qgeVar, null, fetVar2, 918589488, 6, 30816);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                kwj kwjVar = (kwj) obj5;
                Map map = (Map) obj4;
                nc30 nc30Var = (nc30) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q5x.e(kwjVar, o7k0.c, null, null, 0, 0.0f, null, null, true, null, null, null, null, u1c.M(-1693511898, new ec30(map, nc30Var, z ? (byte) 1 : (byte) 0), fetVar3), fetVar3, 100663344, 24576, 16124);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                nua0 nua0Var = (nua0) obj5;
                zcz zczVar = (zcz) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarR = knm0.r(o7k0.c);
                    zcl zclVar = qmk.f28987a;
                    j120.s(o2e.e0(o050.P(j120.K(j120.K(mm40VarR, s5x0.u(0.0f, 0.0f, 0.0f, 56.0f, 7)), s5x0.u(0.0f, 0.0f, 0.0f, nua0Var.b.f13337a ? 12.0f : 0.0f, 7))), "POLYBET_SCREEN"), nua0Var.f24140a, nua0Var.b, zczVar, function2, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                xcz xczVar = (xcz) obj5;
                x77 x77Var = (x77) obj4;
                Function1 function3 = (Function1) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar5.k(zaq0.b)).getBackground(), jd8.n);
                    zcl zclVar2 = qmk.f28987a;
                    lh80 lh80Var = new lh80(qmk.a(fetVar5).d, 12.0f, qmk.a(fetVar5).d, 24.0f);
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    boolean zG2 = fetVar5.g(x77Var) | fetVar5.g(function3);
                    Object objP5 = fetVar5.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = new itn0(x77Var, function3, (byte) 17);
                        fetVar5.o0(objP5);
                    }
                    b8k0.e(mm40VarQ, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP5, fetVar5, 0, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                l7m0 l7m0Var = (l7m0) obj5;
                i3t0 i3t0Var = (i3t0) obj4;
                l7m0 l7m0Var2 = (l7m0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                j6m0 j6m0Var = v9r0.O1;
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    Object objP6 = fetVar6.P();
                    if (objP6 == cl5Var) {
                        objP6 = new t9r0(z ? (byte) 1 : (byte) 0);
                        fetVar6.o0(objP6);
                    }
                    mm40 mm40VarX = yyw.X(rq8.K(n0qVar, (Function1) objP6), null, fetVar6, 1);
                    boolean zI = fetVar6.i(i3t0Var);
                    Object objP7 = fetVar6.P();
                    if (zI || objP7 == cl5Var) {
                        w6q0 w6q0Var = new w6q0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar6.o0(w6q0Var);
                        objP7 = w6q0Var;
                    }
                    jpm0.f(mm40VarX, l7m0Var, (Function1) ((jhy) objP7), u1c.M(1054769394, new wfc(l7m0Var2, i3t0Var, b4), fetVar6), fetVar6, 3072);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                xcz xczVar2 = (xcz) obj5;
                i3t0 i3t0Var2 = (i3t0) obj4;
                l7m0 l7m0Var3 = (l7m0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gfx.h(6, fetVar7, true);
                    mm40 mm40VarH = phu0.H(o7k0.c, null, 1);
                    Object objP8 = fetVar7.P();
                    if (objP8 == cl5Var) {
                        objP8 = new t9r0(b3);
                        fetVar7.o0(objP8);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarH, (Function1) objP8);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM = fetVar7.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarK);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(e7z.u1);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC0, gqw0.v);
                    wer0 wer0Var = (wer0) l7m0Var3.getValue();
                    if (wer0Var != null) {
                        if (wer0Var instanceof uer0) {
                            fetVar7.e0(-483458259);
                            mm40 mm40VarS = k7x.S(jm40.b, xczVar2);
                            a4x a4xVar = ((uer0) wer0Var).f35543a;
                            boolean zI2 = fetVar7.i(i3t0Var2);
                            Object objP9 = fetVar7.P();
                            if (zI2 || objP9 == cl5Var) {
                                ddr0 ddr0Var = new ddr0(1, i3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                                fetVar7.o0(ddr0Var);
                                objP9 = ddr0Var;
                            }
                            Function1 function4 = (Function1) ((jhy) objP9);
                            fetVar = fetVar7;
                            wdr0.a(mm40VarS, a4xVar, xczVar2, function4, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar7;
                            if (wer0Var instanceof ver0) {
                                fetVar.e0(-483449207);
                                mdm mdmVar = ((ver0) wer0Var).f37298a;
                                boolean zI3 = fetVar.i(i3t0Var2);
                                Object objP10 = fetVar.P();
                                if (zI3 || objP10 == cl5Var) {
                                    objP10 = new ui6(i3t0Var2, (byte) 16);
                                    fetVar.o0(objP10);
                                }
                                ycm0.g(null, mdmVar, (Function0) objP10, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(true);
                    } else {
                        fetVar = fetVar7;
                    }
                    throw b1j.f(-483460167, fetVar, false);
                }
                fetVar7.X();
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                lv00.b((mm40) obj5, (tc) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                lv00.a((mm40) obj5, (gc) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                y860.a((mm40) obj5, (ad) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ju70.a((mm40) obj5, (bd) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                dj8.a(x8x.L(1), (fet) obj, (xcz) obj4, (l7m0) obj5, (Function1) obj3);
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                rq8.a((mm40) obj5, (lt) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                wb.d((rx) obj5, (Function1) obj4, (mm40) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                b34.a((mm40) obj5, (az) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                p8a.a((mm40) obj5, (bol) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                saj.b((mm40) obj5, (lz0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                saj.g((mm40) obj5, (ly0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                String str2 = (String) obj5;
                a01 a01Var = (a01) obj4;
                return hz0.a((hz0) obj2, str2, null, Intrinsics.d(str2, ((hz0) a01Var.D()).c) ? "" : ((hz0) a01Var.D()).c, (List) obj3, str2.length() >= 3, 0, null, 970);
            case 18:
                ((Integer) obj2).getClass();
                y0x0.b((mm40) obj5, (cyq0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                cfx0.a((mm40) obj5, (fyq0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                mm40 mm40Var = (mm40) obj5;
                li1 li1Var = (li1) obj4;
                Function1 function5 = (Function1) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    WeakHashMap weakHashMap = djv0.w;
                    mm40 mm40VarP = o050.P(j120.L(mm40Var, zcm0.i(fetVar8).e));
                    ma80 ma80Var = ma80.b;
                    mtl mtlVar = ((ii1) li1Var).f14807a;
                    boolean zG3 = fetVar8.g(function5);
                    Object objP11 = fetVar8.P();
                    if (zG3 || objP11 == cl5Var) {
                        objP11 = new h61(function5, (byte) 8);
                        fetVar8.o0(objP11);
                    }
                    bkb.f(mm40VarP, mtlVar, ma80Var, false, null, (Function1) objP11, fetVar8, 384, 24);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                i120.n((mm40) obj5, (gn1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                i120.d((mm40) obj5, (fo1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                lv00.f((mm40) obj5, (vw1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                y860.e((mm40) obj5, (jyq0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                wha0.d((mm40) obj5, (m02) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                xia0.d((mm40) obj5, (o02) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                nia0.f((mm40) obj5, (n02) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                jdk0 jdk0Var = t42.p2;
                ((t42) obj5).P0((inh0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                cwr0.f((kf2) obj5, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(3079));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ znk(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f44679a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
