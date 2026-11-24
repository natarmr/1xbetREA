package a;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.appsflyer.share.attribution.RequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fbc {
    public static final void A(mm40 mm40Var, final meo meoVar, fet fetVar, int i) {
        ugd ugdVarM;
        ugd ugdVarM2;
        fetVar.g0(1825072700);
        final byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(meoVar) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ugd ugdVarM3 = null;
            if (meoVar.b.length() > 0) {
                fetVar.e0(750087428);
                ugdVarM = u1c.M(-836502162, new Function2() { // from class: a.leo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b2;
                        jm40 jm40Var = jm40.b;
                        meo meoVar2 = meoVar;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "MARKET_INFO_ID");
                                    zcl zclVar = qmk.f28987a;
                                    v8q0.a(meoVar2.b, s5x0.N(mm40VarK0, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            case 1:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(meoVar2.c, mrv.k0(jm40Var, "SUB_MARKET_INFO_ID"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar3), fetVar3, 48, 0, 131068);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                fet fetVar4 = (fet) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    aad.e(meoVar2.d, mrv.k0(jm40Var, "COEFFICIENT_INFO_ID"), ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4), null, 2, false, 1, 0, null, new n05(qmk.p, qmk.s, qmk.n), fetVar4, 1597488, 424);
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(750372938);
                fetVar.r(false);
                ugdVarM = null;
            }
            if (meoVar.c.length() > 0) {
                fetVar.e0(750484817);
                ugdVarM2 = u1c.M(1306981999, new Function2() { // from class: a.leo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        jm40 jm40Var = jm40.b;
                        meo meoVar2 = meoVar;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "MARKET_INFO_ID");
                                    zcl zclVar = qmk.f28987a;
                                    v8q0.a(meoVar2.b, s5x0.N(mm40VarK0, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            case 1:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(meoVar2.c, mrv.k0(jm40Var, "SUB_MARKET_INFO_ID"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar3), fetVar3, 48, 0, 131068);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                fet fetVar4 = (fet) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    aad.e(meoVar2.d, mrv.k0(jm40Var, "COEFFICIENT_INFO_ID"), ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4), null, 2, false, 1, 0, null, new n05(qmk.p, qmk.s, qmk.n), fetVar4, 1597488, 424);
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(750757834);
                fetVar.r(false);
                ugdVarM2 = null;
            }
            if (meoVar.d.length() > 0) {
                fetVar.e0(750882640);
                ugdVarM3 = u1c.M(-844501136, new Function2() { // from class: a.leo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b;
                        jm40 jm40Var = jm40.b;
                        meo meoVar2 = meoVar;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "MARKET_INFO_ID");
                                    zcl zclVar = qmk.f28987a;
                                    v8q0.a(meoVar2.b, s5x0.N(mm40VarK0, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            case 1:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(meoVar2.c, mrv.k0(jm40Var, "SUB_MARKET_INFO_ID"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar3), fetVar3, 48, 0, 131068);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                fet fetVar4 = (fet) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    aad.e(meoVar2.d, mrv.k0(jm40Var, "COEFFICIENT_INFO_ID"), ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4), null, 2, false, 1, 0, null, new n05(qmk.p, qmk.s, qmk.n), fetVar4, 1597488, 424);
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(751433386);
                fetVar.r(false);
            }
            r8x.e(mm40Var, null, ugdVarM, ugdVarM2, ugdVarM3, fetVar, (i2 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, meoVar, i, (byte) 17);
        }
    }

    public static final void B(mm40 mm40Var, a4x a4xVar, azp azpVar, fet fetVar, int i) {
        jm40 jm40Var;
        boolean z;
        azp azpVar2 = azpVar;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        mw3 mw3Var = uc9.c;
        xx7 xx7Var = gqw0.n;
        fetVar2.g0(121017187);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.g(azpVar2) ? 256 : 128);
        boolean z2 = true;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -1495078437, a4xVar);
            while (true) {
                boolean zHasNext = itO.hasNext();
                jm40Var = jm40.b;
                if (!zHasNext) {
                    break;
                }
                bzp bzpVar = (bzp) itO.next();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                String str = bzpVar.f3481a;
                tip0 tip0Var = bzpVar.c;
                tip0 tip0Var2 = bzpVar.b;
                boolean zG = fetVar2.g(str);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    String str2 = bzpVar.f3481a;
                    z = true;
                    objP = ttm0.L(1, str2);
                    fetVar2.o0(objP);
                } else {
                    z = true;
                }
                shd shdVar5 = shdVar2;
                shd shdVar6 = shdVar;
                v8q0.a((String) objP, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                tip0 tip0VarY0 = ibc.y0(tip0Var2, tip0Var, fetVar2);
                tip0 tip0VarY1 = ibc.y0(tip0Var, tip0Var2, fetVar2);
                ebc.s(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), Y(tip0VarY0, fetVar2), fetVar2, 0, 0);
                ebc.s(jm40Var, Y(tip0VarY1, fetVar2), fetVar2, 6, 0);
                fetVar2.r(true);
                z2 = true;
                xx7Var = xx7Var;
                shdVar = shdVar6;
                shdVar3 = shdVar3;
                mw3Var = mw3Var;
                shdVar4 = shdVar4;
                shdVar2 = shdVar5;
                pcyVar = pcyVar;
            }
            shd shdVar7 = shdVar;
            shd shdVar8 = shdVar2;
            shd shdVar9 = shdVar3;
            shd shdVar10 = shdVar4;
            pcy pcyVar2 = pcyVar;
            boolean z4 = z2;
            fetVar2.r(false);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarS2 = o7k0.s(jm40Var, 32.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar10);
            jpm0.o(fetVar2, bh90VarM3, shdVar9);
            vqd.u(iHashCode3, fetVar2, shdVar8, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar7);
            azpVar2 = azpVar;
            String str3 = azpVar2.f1729a;
            oip0 oip0Var = azpVar2.c;
            oip0 oip0Var2 = azpVar2.b;
            v8q0.a(str3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            qzb.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), ttm0.L(z4 ? 1 : 0, oip0Var2.f25323a), new y3d(ibc.f0(oip0Var2.b, fetVar2)), fetVar2, 0, 0);
            qzb.p(jm40Var, ttm0.L(z4 ? 1 : 0, oip0Var.f25323a), new y3d(ibc.f0(oip0Var.b, fetVar2)), fetVar2, 6, 0);
            fetVar2.r(z4);
            fetVar2.r(z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwm(mm40Var, a4xVar, azpVar2, i, (byte) 0);
        }
    }

    public static final void C(ywv0 ywv0Var, fet fetVar, int i) {
        int i2;
        ywv0Var.getClass();
        fetVar.g0(772222086);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ywv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ComponentCallbacks2 componentCallbacks2 = (Activity) fetVar.k(cr00.f4820a);
            View view = (View) fetVar.k(dy2.f);
            if (componentCallbacks2 == null || !(componentCallbacks2 instanceof agd)) {
                fetVar.e0(1424145052);
                fetVar.r(false);
            } else {
                fetVar.e0(1423547310);
                kkz kkzVar = kkz.ON_STOP;
                clz clzVar = (clz) componentCallbacks2;
                boolean zI = fetVar.i(view) | ((i2 & 14) == 4);
                Object objP = fetVar.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new gmo(ywv0Var, view, (byte) 16);
                    fetVar.o0(objP);
                }
                s0x.b(kkzVar, clzVar, (Function0) objP, fetVar, 6);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(ywv0Var, i, (byte) 10);
        }
    }

    public static final void D(wnq0 wnq0Var, bav bavVar, fet fetVar, int i) {
        wnq0 wnq0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-80186927);
        int i2 = i | (fetVar2.g(wnq0Var) ? 4 : 2) | (fetVar2.g(bavVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            k7x.a(bavVar.b, null, o2e.e0(o7k0.e(jm40Var, 30.0f), "GOLD_RUSH_GAME_STATE_BOX"), null, null, fetVar2, 48, 2040);
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.e, yx7Var, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(bavVar.f2277a, twn.l(yx7Var, o2e.e0(o7k0.c(jm40Var, 1.0f), "GOLD_RUSH_GAME_STATE_TEXT")), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, qmk.q, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 262120);
            wnq0Var2 = wnq0Var;
            fetVar2 = fetVar;
            if (wnq0Var2.f39460a) {
                fetVar2.e0(-1545880306);
                q5x.f(wnq0Var2, s5x0.L(jm40Var, 8.0f, 0.0f, 2), fetVar2, i2 & 14);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1545714053);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            wnq0Var2 = wnq0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(wnq0Var2, bavVar, i, (byte) 6);
        }
    }

    public static final void E(mm40 mm40Var, vyp vypVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1321633496);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(vypVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(vypVar.f38259a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(qmk.o, g1t0.g().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, vypVar, i, (byte) 7);
        }
    }

    public static final void F(mm40 mm40Var, zyp zypVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(340434911);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(zypVar) ? 32 : 16);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwm(zypVar, b);
                fetVar2.o0(objP);
            }
            kkb.p(0, fetVar2, mm40VarN, (Function0) objP);
            v8q0.a(zypVar.f45216a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywm(mm40Var, zypVar, i, (byte) 0);
        }
    }

    public static final void G(mm40 mm40Var, b1n b1nVar, boolean z, fet fetVar, int i) {
        byte b;
        shd shdVar;
        boolean z2;
        b1n b1nVar2 = b1nVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1025764330);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(b1nVar2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zx7 zx7Var = z ? gqw0.i : gqw0.g;
            zcl zclVar = qmk.f28987a;
            float f = z ? 6.0f : -6.0f;
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.j, (byte) 11)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            d280 d280Var = b1nVar2.c;
            int i3 = b1nVar2.b;
            fetVar2.e0(1587196607);
            boolean zG = fetVar2.g(d280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            float f2 = f;
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar2);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar5);
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                b = 1;
                objP2 = new d1n(u6nVar, b);
                fetVar2.o0(objP2);
            } else {
                b = 1;
            }
            kkb.p(b, fetVar2, null, (Function0) objP2);
            if (i3 != 0) {
                fetVar2.e0(508041653);
                rpe rpeVar = new rpe(i3);
                mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(jm40Var, zx7Var), f2, 2.0f);
                shdVar = shdVar4;
                tdc.e(rpeVar, ipe.f15159a, mm40VarQ, fetVar2, 48, 0);
                z2 = false;
                fetVar2.r(false);
            } else {
                shdVar = shdVar4;
                z2 = false;
                fetVar2.e0(508502933);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(z2);
            mm40 mm40VarG = o7k0.g(jm40Var, 28.0f, 0.0f, 2);
            tj30 tj30VarC2 = zq8.c(gqw0.e, z2);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarG);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar2);
            jpm0.o(fetVar2, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar2, shdVar, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar5);
            b1nVar2 = b1nVar;
            v8q0.a(b1nVar2.f1814a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, 0, 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 26, i, mm40Var, (Object) b1nVar2, z);
        }
    }

    public static final void H(String str, fet fetVar, int i) {
        fetVar.g0(-2114840739);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 & 14) | 48, 24960, 110584);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 9, i, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    public static final long I(float f, float f2, float f3, float f4, y4d y4dVar) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (y4dVar.c()) {
            g2t0 g2t0Var = h2t0.b;
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = y3d.h;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i24) + 1) | (i19 << 15);
                    } else {
                        i2 = i24;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
                                    g2t0 g2t0Var2 = h2t0.b;
                                    int i25 = y3d.h;
                                    return jMax;
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
                                g2t0 g2t0Var3 = h2t0.b;
                                int i26 = y3d.h;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
                        g2t0 g2t0Var4 = h2t0.b;
                        int i27 = y3d.h;
                        return jMax3;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
                    g2t0 g2t0Var5 = h2t0.b;
                    int i28 = y3d.h;
                    return jMax4;
                }
                if (i >= -10) {
                    int i29 = (i21 | 8388608) >> (1 - i);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i2 = i29 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
                        g2t0 g2t0Var6 = h2t0.b;
                        int i210 = y3d.h;
                        return jMax5;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
                    g2t0 g2t0Var7 = h2t0.b;
                    int i211 = y3d.h;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
            g2t0 g2t0Var8 = h2t0.b;
            int i212 = y3d.h;
            return jMax7;
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) y4dVar.c) & 63);
        g2t0 g2t0Var9 = h2t0.b;
        int i213 = y3d.h;
        return jMax8;
    }

    public static final void J(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-1846172017);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public static final zlp0 K(j6l j6lVar, dal dalVar, y9l y9lVar, ctf0 ctf0Var, boolean z) {
        List listJ;
        List listJ2;
        y9lVar.getClass();
        ctf0Var.getClass();
        j6l j6lVar2 = dalVar.e;
        String str = j6lVar == j6lVar2 ? dalVar.f5753a : dalVar.f;
        String str2 = j6lVar == j6lVar2 ? dalVar.b : dalVar.g;
        String strK = kng0.k("TEAM_STATISTIC", j6lVar.name());
        char c = 0;
        char c2 = 1;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        xnp0 xnp0Var = new xnp0(str2, str, j6lVar == j6l.f15993a, false);
        b9b b9bVar = b9b.f2200a;
        if (z) {
            lsm0 lsm0Var = ctf0Var.b;
            w9b w9bVar = new w9b(lsm0Var.a(R.string.dota_level, Arrays.copyOf(new Object[0], 0)), b9bVar);
            String upperCase = lsm0Var.a(R.string.dota_last_hits, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            listJ = q3d.j(w9bVar, new w9b(upperCase, new a9b()), new w9b(lsm0Var.a(R.string.dota_gpm, Arrays.copyOf(new Object[0], 0)), new a9b()), new w9b(lsm0Var.a(R.string.dota_epm, Arrays.copyOf(new Object[0], 0)), new a9b()), new w9b(lsm0Var.a(R.string.dota_kills, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_dead, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_assists, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_ultimate, Arrays.copyOf(new Object[0], 0)), new d9b()));
        } else {
            lsm0 lsm0Var2 = ctf0Var.b;
            listJ = q3d.j(new w9b(lsm0Var2.a(R.string.dota_level, Arrays.copyOf(new Object[0], 0)), b9bVar), new w9b(lsm0Var2.a(R.string.dota_kills, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var2.a(R.string.dota_dead, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var2.a(R.string.dota_assists, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var2.a(R.string.dota_ultimate, Arrays.copyOf(new Object[0], 0)), new d9b()));
        }
        listJ.getClass();
        List list2 = y9lVar.b;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            z4l z4lVar = (z4l) it.next();
            z4lVar.getClass();
            long j = z4lVar.f43775a;
            String str3 = z4lVar.d;
            String str4 = z4lVar.b;
            String str5 = z4lVar.q;
            l1h l1hVar = z4lVar.j;
            char c3 = c;
            int i = l1hVar.c;
            char c4 = c2;
            int i2 = l1hVar.b;
            Iterator it2 = it;
            int i3 = l1hVar.f19252a;
            int i4 = z4lVar.h;
            int i5 = z4lVar.c;
            if (z) {
                w9b w9bVar2 = new w9b(String.valueOf(i5), b9bVar);
                w9b w9bVar3 = new w9b(String.valueOf(l1hVar.d), new a9b());
                w9b w9bVar4 = new w9b(String.valueOf(l1hVar.g), new a9b());
                w9b w9bVar5 = new w9b(String.valueOf(l1hVar.h), new a9b());
                w9b w9bVar6 = new w9b(String.valueOf(i3), new d9b());
                w9b w9bVar7 = new w9b(String.valueOf(i2), new d9b());
                w9b w9bVar8 = new w9b(String.valueOf(i), new d9b());
                u9b u9bVar = new u9b(i4 == 3 ? R.drawable.ic_cybergame_dota_ult_enabled : R.drawable.ic_cybergame_dota_ult_notenabled, new d9b());
                x9b[] x9bVarArr = new x9b[8];
                x9bVarArr[c3] = w9bVar2;
                x9bVarArr[c4] = w9bVar3;
                x9bVarArr[2] = w9bVar4;
                x9bVarArr[3] = w9bVar5;
                x9bVarArr[4] = w9bVar6;
                x9bVarArr[5] = w9bVar7;
                x9bVarArr[6] = w9bVar8;
                x9bVarArr[7] = u9bVar;
                listJ2 = q3d.j(x9bVarArr);
            } else {
                w9b w9bVar9 = new w9b(String.valueOf(i5), b9bVar);
                w9b w9bVar10 = new w9b(String.valueOf(i3), new d9b());
                w9b w9bVar11 = new w9b(String.valueOf(i2), new d9b());
                w9b w9bVar12 = new w9b(String.valueOf(i), new d9b());
                u9b u9bVar2 = new u9b(i4 == 3 ? R.drawable.ic_cybergame_dota_ult_enabled : R.drawable.ic_cybergame_dota_ult_notenabled, new d9b());
                x9b[] x9bVarArr2 = new x9b[5];
                x9bVarArr2[c3] = w9bVar9;
                x9bVarArr2[c4] = w9bVar10;
                x9bVarArr2[r7] = w9bVar11;
                x9bVarArr2[3] = w9bVar12;
                x9bVarArr2[4] = u9bVar2;
                listJ2 = q3d.j(x9bVarArr2);
            }
            List list3 = listJ2;
            list3.getClass();
            arrayList.add(new fba0(j, str3, str4, str5, list3));
            it = it2;
            c = c3;
            c2 = c4;
            b9bVar = b9bVar;
        }
        return new zlp0(strK, xnp0Var, listJ, arrayList);
    }

    public static final long L(long j, long j2) {
        float f;
        float f2;
        long jB = y3d.b(j, y3d.f(j2));
        float fD = y3d.d(j2);
        float fD2 = y3d.d(jB);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = y3d.h(jB);
        float fH2 = y3d.h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = y3d.g(jB);
        float fG2 = y3d.g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = y3d.e(jB);
        float fE2 = y3d.e(j2);
        if (f4 != 0.0f) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return I(f, f2, f5, f4, y3d.f(j2));
    }

    public static int M(String str) {
        if (str == null) {
            return -1;
        }
        String strN = mg40.n(str);
        strN.getClass();
        switch (strN) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int N(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean O(int i, CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        Character chValueOf = null;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (chValueOf == null) {
                if (cCharAt == '*' || cCharAt == '-' || cCharAt == '_') {
                    chValueOf = Character.valueOf(cCharAt);
                } else if (i2 < 3 && cCharAt == ' ') {
                    i2++;
                }
                i++;
            } else {
                if (cCharAt == chValueOf.charValue()) {
                    i3++;
                } else if (cCharAt == ' ' || cCharAt == '\t') {
                }
                i++;
            }
        }
        return i3 >= 3;
    }

    public static final long P(float f, long j, long j2) {
        rf60 rf60Var = a5d.x;
        long jB = y3d.b(j, rf60Var);
        long jB2 = y3d.b(j2, rf60Var);
        float fD = y3d.d(jB);
        float fH = y3d.h(jB);
        float fG = y3d.g(jB);
        float fE = y3d.e(jB);
        float fD2 = y3d.d(jB2);
        float fH2 = y3d.h(jB2);
        float fG2 = y3d.g(jB2);
        float fE2 = y3d.e(jB2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return y3d.b(I(l7x.O(fH, fH2, f), l7x.O(fG, fG2, f), l7x.O(fE, fE2, f), l7x.O(fD, fD2, f), rf60Var), y3d.f(j2));
    }

    public static final void Q(etr etrVar, qtr qtrVar, int i, int i2) {
        u8d u8dVar;
        etrVar.getClass();
        qtrVar.getClass();
        i07 i07Var = (i07) CollectionsKt.W(i, qtrVar.d.d);
        if (i07Var == null || (u8dVar = (u8d) CollectionsKt.W(i2, i07Var.d)) == null) {
            return;
        }
        etrVar.i(new iia(qtrVar.f29310a, qtrVar.b, u8dVar, qtrVar.c, qtrVar.e, qtrVar.f));
    }

    public static final void R(etr etrVar, qtr qtrVar, int i, int i2) {
        u8d u8dVar;
        etrVar.getClass();
        qtrVar.getClass();
        i07 i07Var = (i07) CollectionsKt.W(i, qtrVar.d.d);
        if (i07Var == null || (u8dVar = (u8d) CollectionsKt.W(i2, i07Var.d)) == null) {
            return;
        }
        etrVar.r(new iia(qtrVar.f29310a, qtrVar.b, u8dVar, qtrVar.c, qtrVar.e, qtrVar.f));
    }

    public static final void S(etr etrVar, b0s b0sVar, dur durVar) {
        etrVar.getClass();
        b0sVar.getClass();
        durVar.getClass();
        long jA = b0sVar.a();
        long j = durVar.c;
        long j2 = durVar.d;
        long j3 = durVar.f;
        boolean z = durVar.e;
        etrVar.b(new kia(jA, j, j2, j3, durVar.o, durVar.h.a(), z));
    }

    public static final float T(fet fetVar) {
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        WeakHashMap weakHashMap = djv0.w;
        int i = zcm0.i(fetVar).f.e().b;
        Object[] objArr = new Object[0];
        boolean zE = fetVar.e(i);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zE || objP == obj) {
            objP = new y02(i, (byte) 5);
            fetVar.o0(objP);
        }
        cgk0 cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP, fetVar, 0);
        Integer numValueOf = Integer.valueOf(i);
        boolean zH = fetVar.h(false) | fetVar.e(i) | fetVar.g(cgk0Var);
        Object objP2 = fetVar.P();
        if (zH || objP2 == obj) {
            objP2 = new cna(i, cgk0Var, null, (byte) 1);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, numValueOf, (Function2) objP2);
        return w6kVar.r0(cgk0Var.l());
    }

    public static final int U(long j) {
        float[] fArr = a5d.f266a;
        long jB = y3d.b(j, a5d.e) >>> 32;
        g2t0 g2t0Var = h2t0.b;
        return (int) jB;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    public static final f5m V(m9s m9sVar, boolean z, boolean z2, la30 la30Var, ctf0 ctf0Var) {
        String str;
        String strG;
        String strG2;
        String strA;
        m9sVar.getClass();
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        boolean zH = ctf0Var.h();
        List list = lms.f20313a;
        long j = m9sVar.v;
        long j2 = m9sVar.o;
        String str2 = m9sVar.h.f29180a;
        if (!z) {
            cqg cqgVar = m9sVar.I;
            if (cqgVar instanceof fof) {
                str = ((fof) cqgVar).f9878a.c;
            } else if (cqgVar instanceof bvd0) {
                str = ((bvd0) cqgVar).c.f22599a;
            } else {
                str = cqgVar instanceof d0u0 ? ((d0u0) cqgVar).f5283a.b : "";
            }
            if (str.length() == 0) {
                rdj rdjVar = rdj.f30294a;
                strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
            } else {
                strG = str;
            }
        } else if (z2) {
            strG = la30Var != null ? la30Var.e : "";
            if (j2 != zwg.d.b || strG.length() <= 0) {
                if (msm0.j(strG)) {
                    int i = 0;
                    while (true) {
                        if (i >= strG.length()) {
                            strG = "№".concat(strG);
                            break;
                        }
                        if (Intrinsics.d(String.valueOf(strG.charAt(i)), "№")) {
                            break;
                        }
                        i++;
                    }
                    strG = kng0.l("\u2066", strG, "\u2069");
                } else if (strG.length() <= 0) {
                    if (str2.length() <= 0 || dyb.e0(j) || !(j2 == kvg.d.b || j2 == ptg.d.b)) {
                        strG = "";
                    } else {
                        strG = str2;
                    }
                }
            }
        } else if (la30Var != null) {
            strG = la30Var.e;
        } else {
            strG = "";
        }
        boolean zH2 = ctf0Var.h();
        List list2 = eck.f7570a;
        strG.getClass();
        if (z) {
            strG2 = plc.N(m9sVar, z2, strG);
        } else {
            rdj rdjVar2 = rdj.f30294a;
            strG2 = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH2), false, 56);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        boolean z3 = !z ? strG2.length() <= 0 || (timeUnit.toMillis(j) - System.currentTimeMillis()) / 86400000 <= 0 : strG2.length() <= 0;
        rdj rdjVar3 = rdj.f30294a;
        long time = rdj.k(j).getTime();
        boolean z4 = j > 0 && (timeUnit.toMillis(j) - System.currentTimeMillis()) / 86400000 <= 0 && Calendar.getInstance().getTime().getTime() < znq0.f(j);
        long jF = znq0.f(m9sVar.w);
        String str3 = strG;
        long j3 = jF / 86400000;
        boolean z5 = z3;
        long millis = jF - TimeUnit.DAYS.toMillis(j3);
        long j4 = millis / 3600000;
        long millis2 = (millis - TimeUnit.HOURS.toMillis(j4)) / 60000;
        if (j3 > 0) {
            strA = lsm0Var.a(R.string.time_before_game_with_date, Arrays.copyOf(new Object[]{StringsKt.b0(j3 > 9 ? 2 : 1, String.valueOf(j3)), StringsKt.b0(2, String.valueOf(j4)), StringsKt.b0(2, String.valueOf(millis2))}, 3));
        } else {
            strA = lsm0Var.a(R.string.time_before_game, Arrays.copyOf(new Object[0], 0));
        }
        go8 go8Var = (j <= 0 || eck.f7570a.contains(Long.valueOf(j2)) || Calendar.getInstance().getTime().getTime() >= znq0.f(j)) ? null : new go8(strA, time, z4);
        String str4 = la30Var != null ? la30Var.e : null;
        String strN = plc.N(m9sVar, z2, str4 == null ? "" : str4);
        ka30 ka30Var = m9sVar.g;
        if (z2 && ka30Var.f17945a.length() > 0) {
            str2.length();
        }
        boolean z6 = strN.length() > 0;
        go8 go8Var2 = str2.length() > 0 ? new go8(str2, 0L, false) : null;
        if (lms.b(m9sVar)) {
            return new f5m(go8Var, z5 ? str3 : null);
        }
        return new f5m(go8Var2, z6 ? strN : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    public static final dag W(gag gagVar) {
        List list;
        ?? arrayList;
        List<xag> list2 = gagVar.f10963a;
        if (list2 != null) {
            int i = 10;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (xag xagVar : list2) {
                rdj rdjVar = rdj.f30294a;
                Long l = xagVar.k;
                long time = rdj.k(l != null ? l.longValue() : 0L).getTime();
                Long l2 = xagVar.l;
                long time2 = rdj.k(l2 != null ? l2.longValue() : 0L).getTime();
                Long l3 = xagVar.f40552a;
                long jLongValue = l3 != null ? l3.longValue() : 0L;
                Long l4 = xagVar.b;
                long jLongValue2 = l4 != null ? l4.longValue() : 0L;
                Long l5 = xagVar.c;
                long jLongValue3 = l5 != null ? l5.longValue() : 0L;
                String str = xagVar.d;
                String str2 = str == null ? "" : str;
                String str3 = xagVar.e;
                String str4 = str3 == null ? "" : str3;
                String str5 = xagVar.f;
                String str6 = str5 == null ? "" : str5;
                Long l6 = xagVar.g;
                long jLongValue4 = l6 != null ? l6.longValue() : 0L;
                Integer num = xagVar.h;
                int iIntValue = num != null ? num.intValue() : 0;
                List<kag> list3 = xagVar.i;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, i));
                    for (kag kagVar : list3) {
                        String str7 = kagVar.f17961a;
                        if (str7 == null) {
                            str7 = "";
                        }
                        arrayList.add(new hag(str7, lmc.E(kagVar.b)));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                String strE = lmc.E(xagVar.j);
                Long l7 = xagVar.m;
                arrayList2.add(new uag(jLongValue, jLongValue2, jLongValue3, str2, str4, str6, jLongValue4, iIntValue, arrayList, strE, time, time2, l7 != null ? l7.longValue() : 0L, Intrinsics.d(xagVar.n, Boolean.TRUE)));
                i = 10;
            }
            list = arrayList2;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new dag(list);
    }

    public static final b2o0 X(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        zum yumVar;
        zum yumVar2;
        zum yumVar3;
        zum yumVar4;
        Object objValueOf = Integer.valueOf(R.drawable.ic_card_shirt);
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        opm opmVar = opm.f25648a;
        xum xumVar = xum.f41518a;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            i4i i4iVarU = ibm0.u(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            List listG0 = nia0.g0(ebc.h0(d0tVar, dmr.A));
            String strH0 = ebc.h0(d0tVar, dmr.r);
            String strH1 = ebc.h0(d0tVar, dmr.w);
            String strH2 = ebc.h0(d0tVar, dmr.s);
            String strH3 = ebc.h0(d0tVar, dmr.z);
            String strC0 = qzb.c0(d0tVar);
            List listG1 = nia0.g0(strH0);
            ArrayList arrayList = new ArrayList(r3d.q(listG1, 10));
            Iterator it = listG1.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(jwb.P((vua) it.next()).f19696a));
            }
            int iIntValue = ((Number) (arrayList.size() > 0 ? arrayList.get(0) : objValueOf)).intValue();
            List listG2 = nia0.g0(strH0);
            ArrayList arrayList2 = new ArrayList(r3d.q(listG2, 10));
            Iterator it2 = listG2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(jwb.P((vua) it2.next()).f19696a));
            }
            lvm lvmVar = new lvm(strC0, iIntValue, ((Number) (1 < arrayList2.size() ? arrayList2.get(1) : objValueOf)).intValue(), ebc.f0(strH1));
            String strR0 = qzb.r0(d0tVar);
            List listG3 = nia0.g0(strH2);
            ArrayList arrayList3 = new ArrayList(r3d.q(listG3, 10));
            Iterator it3 = listG3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(jwb.P((vua) it3.next()).f19696a));
            }
            int iIntValue2 = ((Number) (arrayList3.size() > 0 ? arrayList3.get(0) : objValueOf)).intValue();
            List listG4 = nia0.g0(strH2);
            ArrayList arrayList4 = new ArrayList(r3d.q(listG4, 10));
            Iterator it4 = listG4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(jwb.P((vua) it4.next()).f19696a));
            }
            if (1 < arrayList4.size()) {
                objValueOf = arrayList4.get(1);
            }
            lvm lvmVar2 = new lvm(strR0, iIntValue2, ((Number) objValueOf).intValue(), ebc.f0(strH3));
            lpm lpmVar = new lpm(opmVar, new hpm(0L, 3));
            String str3 = rqsVar.m;
            String strH4 = ebc.h0(d0tVar, dmr.u);
            a4x a4xVarG0 = ebc.g0(listG0);
            if (qzb.H0(d0tVar)) {
                long jR0 = kpb.r0(d0tVar);
                fgm fgmVar = fgm.f9498a;
                yumVar = new yum(jR0);
            } else {
                yumVar = xumVar;
            }
            return new w1o0(j, i4iVarU, new z3o0(lvmVar, lvmVar2, lpmVar, str3, strH4, a4xVarG0, yumVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 1) {
            long j2 = d0tVar.f5282a;
            j4i j4iVarY = ibm0.y(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            List listG5 = nia0.g0(ebc.h0(d0tVar, dmr.A));
            String strH5 = ebc.h0(d0tVar, dmr.r);
            String strH6 = ebc.h0(d0tVar, dmr.w);
            String strH7 = ebc.h0(d0tVar, dmr.s);
            String strH8 = ebc.h0(d0tVar, dmr.z);
            String strC1 = qzb.c0(d0tVar);
            List listG6 = nia0.g0(strH5);
            ArrayList arrayList5 = new ArrayList(r3d.q(listG6, 10));
            Iterator it5 = listG6.iterator();
            while (it5.hasNext()) {
                arrayList5.add(Integer.valueOf(jwb.P((vua) it5.next()).f19696a));
            }
            int iIntValue3 = ((Number) (arrayList5.size() > 0 ? arrayList5.get(0) : objValueOf)).intValue();
            List listG7 = nia0.g0(strH5);
            ArrayList arrayList6 = new ArrayList(r3d.q(listG7, 10));
            Iterator it6 = listG7.iterator();
            while (it6.hasNext()) {
                arrayList6.add(Integer.valueOf(jwb.P((vua) it6.next()).f19696a));
            }
            mvm mvmVar = new mvm(strC1, iIntValue3, ((Number) (1 < arrayList6.size() ? arrayList6.get(1) : objValueOf)).intValue(), ebc.f0(strH6));
            String strR1 = qzb.r0(d0tVar);
            List listG8 = nia0.g0(strH7);
            ArrayList arrayList7 = new ArrayList(r3d.q(listG8, 10));
            Iterator it7 = listG8.iterator();
            while (it7.hasNext()) {
                arrayList7.add(Integer.valueOf(jwb.P((vua) it7.next()).f19696a));
            }
            int iIntValue4 = ((Number) (arrayList7.size() > 0 ? arrayList7.get(0) : objValueOf)).intValue();
            List listG9 = nia0.g0(strH7);
            ArrayList arrayList8 = new ArrayList(r3d.q(listG9, 10));
            Iterator it8 = listG9.iterator();
            while (it8.hasNext()) {
                arrayList8.add(Integer.valueOf(jwb.P((vua) it8.next()).f19696a));
            }
            if (1 < arrayList8.size()) {
                objValueOf = arrayList8.get(1);
            }
            mvm mvmVar2 = new mvm(strR1, iIntValue4, ((Number) objValueOf).intValue(), ebc.f0(strH8));
            String str4 = rqsVar.m;
            String strH9 = ebc.h0(d0tVar, dmr.u);
            a4x a4xVarG1 = ebc.g0(listG5);
            if (qzb.H0(d0tVar)) {
                long jR1 = kpb.r0(d0tVar);
                fgm fgmVar2 = fgm.f9498a;
                yumVar2 = new yum(jR1);
            } else {
                yumVar2 = xumVar;
            }
            return new a2o0(j2, j4iVarY, new f5o0(mvmVar, mvmVar2, str4, strH9, a4xVarG1, yumVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 2) {
            long j3 = d0tVar.f5282a;
            k4i k4iVarX = ibm0.x(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            List listG10 = nia0.g0(ebc.h0(d0tVar, dmr.A));
            String strH10 = ebc.h0(d0tVar, dmr.r);
            String strH11 = ebc.h0(d0tVar, dmr.w);
            String strH12 = ebc.h0(d0tVar, dmr.s);
            String strH13 = ebc.h0(d0tVar, dmr.z);
            String strC2 = qzb.c0(d0tVar);
            List listG11 = nia0.g0(strH10);
            ArrayList arrayList9 = new ArrayList(r3d.q(listG11, 10));
            Iterator it9 = listG11.iterator();
            while (it9.hasNext()) {
                arrayList9.add(Integer.valueOf(jwb.P((vua) it9.next()).f19696a));
            }
            int iIntValue5 = ((Number) (arrayList9.size() > 0 ? arrayList9.get(0) : objValueOf)).intValue();
            List listG12 = nia0.g0(strH10);
            ArrayList arrayList10 = new ArrayList(r3d.q(listG12, 10));
            Iterator it10 = listG12.iterator();
            while (it10.hasNext()) {
                arrayList10.add(Integer.valueOf(jwb.P((vua) it10.next()).f19696a));
            }
            nvm nvmVar = new nvm(strC2, iIntValue5, ((Number) (1 < arrayList10.size() ? arrayList10.get(1) : objValueOf)).intValue(), ebc.f0(strH11));
            String strR2 = qzb.r0(d0tVar);
            List listG13 = nia0.g0(strH12);
            ArrayList arrayList11 = new ArrayList(r3d.q(listG13, 10));
            Iterator it11 = listG13.iterator();
            while (it11.hasNext()) {
                arrayList11.add(Integer.valueOf(jwb.P((vua) it11.next()).f19696a));
            }
            int iIntValue6 = ((Number) (arrayList11.size() > 0 ? arrayList11.get(0) : objValueOf)).intValue();
            List listG14 = nia0.g0(strH12);
            ArrayList arrayList12 = new ArrayList(r3d.q(listG14, 10));
            Iterator it12 = listG14.iterator();
            while (it12.hasNext()) {
                arrayList12.add(Integer.valueOf(jwb.P((vua) it12.next()).f19696a));
            }
            if (1 < arrayList12.size()) {
                objValueOf = arrayList12.get(1);
            }
            nvm nvmVar2 = new nvm(strR2, iIntValue6, ((Number) objValueOf).intValue(), ebc.f0(strH13));
            lpm lpmVar2 = new lpm(opmVar, new hpm(0L, 3));
            String str5 = rqsVar.m;
            String strH14 = ebc.h0(d0tVar, dmr.u);
            a4x a4xVarG2 = ebc.g0(listG10);
            if (qzb.H0(d0tVar)) {
                long jR2 = kpb.r0(d0tVar);
                fgm fgmVar3 = fgm.f9498a;
                yumVar3 = new yum(jR2);
            } else {
                yumVar3 = xumVar;
            }
            return new z1o0(j3, k4iVarX, new x4o0(nvmVar, nvmVar2, lpmVar2, str5, strH14, a4xVarG2, yumVar3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        c2m c2mVar = c2m.f3631a;
        if (iOrdinal == 3) {
            String str6 = rqsVar.m;
            if (str6.length() == 0) {
                str6 = "";
            }
            long j4 = d0tVar.f5282a;
            n0x n0xVar = new n0x(dtb.F(str));
            l4i l4iVarW = ibm0.w(d0tVar, str, str6, list, z2, z3, qzb.B0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            List listG15 = nia0.g0(ebc.h0(d0tVar, dmr.A));
            String strH15 = ebc.h0(d0tVar, dmr.r);
            String strH16 = ebc.h0(d0tVar, dmr.w);
            String strH17 = ebc.h0(d0tVar, dmr.s);
            String strH18 = ebc.h0(d0tVar, dmr.z);
            String strC3 = qzb.c0(d0tVar);
            List listG16 = nia0.g0(strH15);
            ArrayList arrayList13 = new ArrayList(r3d.q(listG16, 10));
            Iterator it13 = listG16.iterator();
            while (it13.hasNext()) {
                arrayList13.add(Integer.valueOf(jwb.P((vua) it13.next()).f19696a));
            }
            int iIntValue7 = ((Number) (arrayList13.size() > 0 ? arrayList13.get(0) : objValueOf)).intValue();
            List listG17 = nia0.g0(strH15);
            ArrayList arrayList14 = new ArrayList(r3d.q(listG17, 10));
            Iterator it14 = listG17.iterator();
            while (it14.hasNext()) {
                arrayList14.add(Integer.valueOf(jwb.P((vua) it14.next()).f19696a));
            }
            ovm ovmVar = new ovm(strC3, iIntValue7, ((Number) (1 < arrayList14.size() ? arrayList14.get(1) : objValueOf)).intValue(), ebc.f0(strH16));
            String strR3 = qzb.r0(d0tVar);
            List listG18 = nia0.g0(strH17);
            ArrayList arrayList15 = new ArrayList(r3d.q(listG18, 10));
            Iterator it15 = listG18.iterator();
            while (it15.hasNext()) {
                arrayList15.add(Integer.valueOf(jwb.P((vua) it15.next()).f19696a));
            }
            int iIntValue8 = ((Number) (arrayList15.size() > 0 ? arrayList15.get(0) : objValueOf)).intValue();
            List listG19 = nia0.g0(strH17);
            ArrayList arrayList16 = new ArrayList(r3d.q(listG19, 10));
            Iterator it16 = listG19.iterator();
            while (it16.hasNext()) {
                arrayList16.add(Integer.valueOf(jwb.P((vua) it16.next()).f19696a));
            }
            if (1 < arrayList16.size()) {
                objValueOf = arrayList16.get(1);
            }
            return new y1o0(j4, l4iVarW, new p4o0(ovmVar, new ovm(strR3, iIntValue8, ((Number) objValueOf).intValue(), ebc.f0(strH18)), new z1m(c2mVar), ebc.h0(d0tVar, dmr.u), ebc.g0(listG15)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        long j5 = d0tVar.f5282a;
        k4i k4iVarV = ibm0.v(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
        List listG20 = nia0.g0(ebc.h0(d0tVar, dmr.A));
        String strH19 = ebc.h0(d0tVar, dmr.r);
        String strH20 = ebc.h0(d0tVar, dmr.w);
        String strH21 = ebc.h0(d0tVar, dmr.s);
        String strH22 = ebc.h0(d0tVar, dmr.z);
        String strC4 = qzb.c0(d0tVar);
        List listG21 = nia0.g0(strH19);
        ArrayList arrayList17 = new ArrayList(r3d.q(listG21, 10));
        Iterator it17 = listG21.iterator();
        while (it17.hasNext()) {
            arrayList17.add(Integer.valueOf(jwb.P((vua) it17.next()).f19696a));
        }
        int iIntValue9 = ((Number) (arrayList17.size() > 0 ? arrayList17.get(0) : objValueOf)).intValue();
        List listG22 = nia0.g0(strH19);
        ArrayList arrayList18 = new ArrayList(r3d.q(listG22, 10));
        Iterator it18 = listG22.iterator();
        while (it18.hasNext()) {
            arrayList18.add(Integer.valueOf(jwb.P((vua) it18.next()).f19696a));
        }
        pvm pvmVar = new pvm(strC4, iIntValue9, ((Number) (1 < arrayList18.size() ? arrayList18.get(1) : objValueOf)).intValue(), ebc.f0(strH20));
        String strR4 = qzb.r0(d0tVar);
        List listG23 = nia0.g0(strH21);
        ArrayList arrayList19 = new ArrayList(r3d.q(listG23, 10));
        Iterator it19 = listG23.iterator();
        while (it19.hasNext()) {
            arrayList19.add(Integer.valueOf(jwb.P((vua) it19.next()).f19696a));
        }
        int iIntValue10 = ((Number) (arrayList19.size() > 0 ? arrayList19.get(0) : objValueOf)).intValue();
        List listG24 = nia0.g0(strH21);
        ArrayList arrayList20 = new ArrayList(r3d.q(listG24, 10));
        Iterator it20 = listG24.iterator();
        while (it20.hasNext()) {
            arrayList20.add(Integer.valueOf(jwb.P((vua) it20.next()).f19696a));
        }
        if (1 < arrayList20.size()) {
            objValueOf = arrayList20.get(1);
        }
        pvm pvmVar2 = new pvm(strR4, iIntValue10, ((Number) objValueOf).intValue(), ebc.f0(strH22));
        z1m z1mVar = new z1m(c2mVar);
        String str7 = rqsVar.m;
        String strH23 = ebc.h0(d0tVar, dmr.u);
        a4x a4xVarG3 = ebc.g0(listG20);
        if (qzb.H0(d0tVar)) {
            long jR3 = kpb.r0(d0tVar);
            fgm fgmVar4 = fgm.f9498a;
            yumVar4 = new yum(jR3);
        } else {
            yumVar4 = xumVar;
        }
        return new x1o0(j5, k4iVarV, new h4o0(pvmVar, pvmVar2, z1mVar, strH23, str7, a4xVarG3, yumVar4), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
    }

    public static final eqm Y(tip0 tip0Var, fet fetVar) {
        tip0Var.getClass();
        if (tip0Var.equals(qip0.f28803a)) {
            fetVar.e0(-884403470);
            fetVar.r(false);
            return bqm.f3038a;
        }
        if (tip0Var instanceof rip0) {
            fetVar.e0(-884400083);
            cqm cqmVar = new cqm(ibc.k0(((rip0) tip0Var).f30555a), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
            fetVar.r(false);
            return cqmVar;
        }
        if (!(tip0Var instanceof sip0)) {
            throw b1j.f(-884404560, fetVar, false);
        }
        fetVar.e0(-884393871);
        boolean zG = fetVar.g("0");
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = ttm0.L(1, "0");
            fetVar.o0(objP);
        }
        dqm dqmVar = new dqm((String) objP, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
        fetVar.r(false);
        return dqmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v39, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final men Z(ten tenVar) {
        Pair pair;
        len lenVar;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        tenVar.getClass();
        qen qenVar = tenVar.f33829a;
        String str = qenVar != null ? qenVar.f28592a : null;
        if (Intrinsics.d(str, "1")) {
            String str2 = qenVar.b;
            if (Intrinsics.d(str2, "1")) {
                pair = new Pair(nen.f23393a, nen.b);
            } else if (Intrinsics.d(str2, "2")) {
                pair = new Pair(nen.b, nen.f23393a);
            } else {
                nen nenVar = nen.c;
                pair = new Pair(nenVar, nenVar);
            }
        } else if (Intrinsics.d(str, "2")) {
            String str3 = qenVar.b;
            if (Intrinsics.d(str3, "1")) {
                pair = new Pair(nen.b, nen.f23393a);
            } else if (Intrinsics.d(str3, "2")) {
                pair = new Pair(nen.f23393a, nen.b);
            } else {
                nen nenVar2 = nen.c;
                pair = new Pair(nenVar2, nenVar2);
            }
        } else {
            nen nenVar3 = nen.c;
            pair = new Pair(nenVar3, nenVar3);
        }
        nen nenVar4 = (nen) pair.f46059a;
        nen nenVar5 = (nen) pair.b;
        String str4 = tenVar.c;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = tenVar.k;
        if (str5 == null) {
            str5 = "";
        }
        switch (str4.hashCode()) {
            case 48:
                if (!str4.equals("0")) {
                    lenVar = len.j;
                } else {
                    lenVar = len.f19911a;
                }
                break;
            case 49:
            case 51:
            case 53:
            default:
                lenVar = len.j;
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                if (!str4.equals("2")) {
                    lenVar = len.j;
                } else {
                    lenVar = len.b;
                }
                break;
            case 52:
                if (!str4.equals("4")) {
                    lenVar = len.j;
                } else {
                    lenVar = len.c;
                }
                break;
            case 54:
                if (!str4.equals("6")) {
                    lenVar = len.j;
                } else {
                    lenVar = len.d;
                }
                break;
            case 55:
                if (!str4.equals("7")) {
                    lenVar = len.j;
                } else {
                    lenVar = len.e;
                }
                break;
            case 56:
                if (!str4.equals("8")) {
                    lenVar = len.j;
                } else {
                    lenVar = len.f;
                }
                break;
            case 57:
                if (str4.equals("9")) {
                    switch (str5) {
                        case "1":
                            lenVar = len.g;
                            break;
                        case "2":
                            lenVar = len.h;
                            break;
                        case "3":
                            lenVar = len.i;
                            break;
                        default:
                            lenVar = len.j;
                            break;
                    }
                } else {
                    lenVar = len.j;
                    break;
                }
                break;
        }
        len lenVar2 = lenVar;
        tna0 tna0VarQ = x1x.Q(tenVar.b);
        String str6 = tenVar.d;
        if (str6 == null) {
            str6 = "";
        }
        Integer intOrNull = StringsKt.toIntOrNull(str6);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
        String str7 = tenVar.e;
        if (str7 == null) {
            str7 = "";
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(str7);
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        String str8 = tenVar.f;
        Integer intOrNull3 = StringsKt.toIntOrNull(str8 != null ? str8 : "");
        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
        List list = tenVar.g;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x1x.Q((ooa) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r14 = arrayList;
        List list2 = tenVar.h;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x1x.Q((ooa) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r15 = arrayList2;
        List list3 = tenVar.i;
        if (list3 != null) {
            arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(x1x.Q((ooa) it3.next()));
            }
        } else {
            arrayList3 = iun.f15405a;
        }
        ?? r16 = arrayList3;
        List list4 = tenVar.j;
        if (list4 != null) {
            arrayList4 = new ArrayList(r3d.q(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(x1x.Q((ooa) it4.next()));
            }
        } else {
            arrayList4 = iun.f15405a;
        }
        return new men(lenVar2, tna0VarQ, iIntValue, iIntValue2, iIntValue3, nenVar4, nenVar5, r14, r15, r16, arrayList4);
    }

    public static final void a(mm40 mm40Var, s3i s3iVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1247206370);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(s3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            l7m0 l7m0VarB = d43.b(s3iVar.f31559a == r8.f30001a ? 180.0f : 0.0f, ro4.m0(300, 0, null, 6), "Icon Rotation", null, fetVar2, 3120, 20);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getBackground0(), vgg0.f37379a);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new p2i(function1, s3iVar, (byte) 2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new x1d(l7m0VarB, (byte) 11);
                fetVar2.o0(objP2);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, i4w0.T(jm40Var, (Function1) objP2), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2i(mm40Var2, s3iVar, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0329  */
    /* JADX WARN: Code duplicated, block: B:110:0x0333  */
    /* JADX WARN: Code duplicated, block: B:113:0x0347  */
    /* JADX WARN: Code duplicated, block: B:119:0x0366 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0368  */
    /* JADX WARN: Code duplicated, block: B:122:0x037c  */
    /* JADX WARN: Code duplicated, block: B:123:0x038e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0394  */
    /* JADX WARN: Code duplicated, block: B:127:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:155:0x0479  */
    /* JADX WARN: Code duplicated, block: B:158:0x0482  */
    /* JADX WARN: Code duplicated, block: B:164:0x049b  */
    /* JADX WARN: Code duplicated, block: B:165:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:169:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:172:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:176:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x052b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0538 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x053c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0543  */
    /* JADX WARN: Code duplicated, block: B:186:0x0546  */
    /* JADX WARN: Code duplicated, block: B:187:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x054f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0551  */
    /* JADX WARN: Code duplicated, block: B:194:0x055b  */
    /* JADX WARN: Code duplicated, block: B:196:0x056a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0577  */
    /* JADX WARN: Code duplicated, block: B:200:0x058d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0590  */
    /* JADX WARN: Code duplicated, block: B:203:0x059c  */
    /* JADX WARN: Code duplicated, block: B:204:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:206:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:302:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:340:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:341:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:346:0x0a76 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x0a78 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:349:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:355:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:49:0x020a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0232  */
    /* JADX WARN: Code duplicated, block: B:53:0x0240  */
    /* JADX WARN: Code duplicated, block: B:62:0x026f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0287  */
    /* JADX WARN: Code duplicated, block: B:67:0x028d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0295  */
    /* JADX WARN: Code duplicated, block: B:72:0x0298  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02db  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ee A[PHI: r20
  0x02ee: PHI (r20v2 int) = (r20v0 int), (r20v3 int) binds: [B:88:0x02f2, B:85:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0305  */
    /* JADX WARN: Code duplicated, block: B:95:0x030b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0314  */
    /* JADX WARN: Code duplicated, block: B:99:0x0318  */
    public static final cuo a0(a5w a5wVar, ctf0 ctf0Var, HistoryTypeModel historyTypeModel, String str, List list, List list2, List list3, List list4, List list5, boolean z, boolean z2, int i) {
        buy wtyVar;
        int i2;
        long jM113getRed0d7_KjU;
        wm7 wm7Var;
        Object next;
        tvw tvwVar;
        String string;
        tvw rvwVar;
        boolean z3;
        iy4 iy4Var;
        x680 x680Var;
        l3w l3wVar;
        String upperCase;
        int i3;
        x680 x680Var2;
        String str2;
        buy wtyVar2;
        x680 x680Var3;
        boolean z4;
        wm7 wm7Var2;
        Object next2;
        int i4;
        tvw rvwVar2;
        String string2;
        q4f q4fVar;
        lsm0 lsm0Var;
        double d;
        double d2;
        hxu hxuVar;
        x680 x680Var4;
        double d3;
        String str3;
        i0w i0wVar;
        int i5;
        double d4;
        double d5;
        double d6;
        double d7;
        p3u0 p3u0Var;
        String strC;
        i0w i0wVar2;
        kzv kzvVar;
        xty xtyVar;
        buy wtyVar3;
        x680 x680Var5;
        i0w i0wVar3;
        x680 x680Var6;
        String strA;
        kzv kzvVar2;
        String strL;
        x680 x680Var7;
        x680 x680Var8;
        boolean z5;
        Double dValueOf;
        x680 x680Var9;
        long textPrimary;
        int iOrdinal;
        String strA2;
        int iOrdinal2;
        String strA3;
        double d8;
        long jM98getGreen0d7_KjU;
        ctf0Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        boolean z6 = a5wVar instanceof kzv;
        int i6 = R.string.credited_to_account_with_colon;
        qvw qvwVar = qvw.f29409a;
        x680 x680Var10 = null;
        if (!z6) {
            if (a5wVar instanceof for0) {
                for0 for0Var = (for0) a5wVar;
                double d9 = for0Var.f;
                String str4 = for0Var.f9896a;
                double d10 = for0Var.c;
                hxu hxuVar2 = for0Var.l;
                boolean z7 = for0Var.j;
                lsm0 lsm0Var2 = ctf0Var.b;
                String strA4 = lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str4}, 1));
                i0w i0wVar4 = for0Var.g;
                ArrayList arrayListG = hew0.G(historyTypeModel, i0wVar4, list4);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListG, 10));
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    arrayList.add(d5c.Z((HistoryMenuItem) it.next(), false));
                }
                boolean z8 = for0Var.o == a6w.b;
                String str5 = for0Var.f9896a;
                String strQ = w6x.q(bfb.R(for0Var.d, ctf0Var), " · \u200e", strA4);
                String strZ = aac.Z(i0wVar4, ctf0Var);
                Locale locale = Locale.ROOT;
                String upperCase2 = strZ.toUpperCase(locale);
                upperCase2.getClass();
                if (z7) {
                    upperCase = lsm0Var2.a(R.string.confirmed, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                    upperCase.getClass();
                } else {
                    upperCase = lsm0Var2.a(R.string.not_confirmed, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                    upperCase.getClass();
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(upperCase2);
                if (z8) {
                    lc00VarB.add(upperCase);
                }
                wm7 wm7Var3 = new wm7(CollectionsKt.b0(kotlin.collections.a.a(lc00VarB), " · ", null, null, null, 62), aac.Y(i0wVar4));
                boolean z9 = for0Var.k;
                lc00 lc00VarB2 = kotlin.collections.a.b();
                if (z9) {
                    lc00VarB2.add(new tso0("PROMO_ID", lsm0Var2.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), gpo0.f11692a));
                }
                if (z8 != 0) {
                    i3 = 0;
                    lc00VarB2.add(new tso0("FREE_BET_ID", lsm0Var2.a(R.string.toto_free_tag, Arrays.copyOf(new Object[0], 0)), hqo0.f13494a));
                } else {
                    i3 = 0;
                }
                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
                yto ytoVar = (yto) CollectionsKt.W(i3, arrayList);
                yto ytoVar2 = (yto) CollectionsKt.W(1, arrayList);
                int iY = lgb.Y(for0Var.b);
                String str6 = for0Var.i;
                String strConcat = "\u200e".concat(for0Var.h);
                if (z8 != 0) {
                    str2 = str;
                    x680Var2 = null;
                } else {
                    String strA5 = lsm0Var2.a(i0wVar4 == i0w.i ? R.string.credited_to_account_with_colon : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var = pn40.f27267a;
                    double d11 = hxuVar2.f.b;
                    if (d11 == 0.0d) {
                        d11 = d10;
                    }
                    p3u0 p3u0Var2 = p3u0.c;
                    String strC2 = pn40.c(d11, p3u0Var2);
                    String strC3 = pn40.c(d9, p3u0Var2);
                    switch (i0wVar4.ordinal()) {
                        case 0:
                        case 2:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            str2 = str;
                            pz40 pz40Var = s6t0.f31722a;
                            wtyVar2 = new wty(strC3, str2, s6t0.b().f33626a.getTextPrimary());
                            break;
                        case 1:
                            str2 = str;
                            String strC4 = pn40.c(d9, p3u0Var2);
                            pz40 pz40Var2 = s6t0.f31722a;
                            wtyVar2 = new wty(strC4, str2, s6t0.b().f33626a.getTextPrimary());
                            break;
                        case 3:
                        case 4:
                            pz40 pz40Var3 = s6t0.f31722a;
                            wtyVar2 = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC2, strC3, str);
                            str2 = str;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    x680Var2 = new x680("POSSIBLE_PAYOUT_ID", strA5, wtyVar2);
                }
                if (z8 && i0wVar4 == i0w.e) {
                    String strA6 = lsm0Var2.a(R.string.history_your_win_new, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var2 = pn40.f27267a;
                    double d12 = hxuVar2.f.b;
                    if (d12 == 0.0d) {
                        d12 = d10;
                    }
                    String strC5 = pn40.c(d12, p3u0.c);
                    pz40 pz40Var4 = s6t0.f31722a;
                    x680Var3 = new x680("POSSIBLE_PAYOUT_ID", strA6, new wty(strC5, str2, s6t0.b().f33626a.getCommerce()));
                } else {
                    x680Var3 = null;
                }
                i4 i4VarR1 = dyb.r0(tx3.z(new x680[]{x680Var2, x680Var3}));
                long j = for0Var.n;
                return new cuo(str5, str5, strQ, wm7Var3, i4VarR0, ytoVar, ytoVar2, null, new svw(iY), str6, false, "", strConcat, i4VarR1, (!z7 || j <= 0) ? null : new l3w(lsm0Var2.a(R.string.bet_info_approved_by_bet_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)), "", i8x.f14362a));
            }
            if (!(a5wVar instanceof vw4)) {
                int i7 = R.string.history_bet_rate;
                if (!(a5wVar instanceof z7y)) {
                    if (!(a5wVar instanceof nc10)) {
                        String strD = a5wVar.d();
                        String strD2 = a5wVar.d();
                        pz40 pz40Var5 = s6t0.f31722a;
                        wm7 wm7Var4 = new wm7("", s6t0.b().f33626a.getPrimary());
                        lak0 lak0Var = lak0.c;
                        return new cuo(strD, strD2, "", wm7Var4, lak0Var, null, null, null, qvwVar, "", false, "", "", lak0Var, null);
                    }
                    nc10 nc10Var = (nc10) a5wVar;
                    String str7 = nc10Var.d;
                    String strA7 = ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1));
                    String strH = rz4.h(i, str7);
                    String str8 = nc10Var.d;
                    String strQ2 = w6x.q(bfb.R(nc10Var.e, ctf0Var), " · \u200e", strA7);
                    rc10 rc10Var = nc10Var.c;
                    String upperCase3 = ctf0Var.k(pzw.e0(rc10Var), new Object[0]).toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    return new cuo(strH, str8, strQ2, new wm7(upperCase3, pzw.d0(rc10Var)), lak0.c, d5c.Z(HistoryMenuItem.c, false), null, null, new svw(R.drawable.glyph_loto), nc10Var.b, false, "", "", dyb.g0(pzw.U(nc10Var, ctf0Var, str, true)), null);
                }
                z7y z7yVar = (z7y) a5wVar;
                Object[] objArr = {z7yVar.f43943a};
                lsm0 lsm0Var3 = ctf0Var.b;
                String strA8 = lsm0Var3.a(R.string.history_coupon_number, Arrays.copyOf(objArr, 1));
                i0w i0wVar5 = z7yVar.e;
                ArrayList arrayListG2 = hew0.G(historyTypeModel, i0wVar5, list4);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayListG2, 10));
                Iterator it2 = arrayListG2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(d5c.Z((HistoryMenuItem) it2.next(), false));
                }
                String str9 = z7yVar.f43943a;
                String strQ3 = w6x.q(bfb.R(z7yVar.d, ctf0Var), " · \u200e", strA8);
                String upperCase4 = aac.Z(i0wVar5, ctf0Var).toUpperCase(Locale.ROOT);
                upperCase4.getClass();
                wm7 wm7Var5 = new wm7(upperCase4, aac.Y(i0wVar5));
                yto ytoVar3 = (yto) CollectionsKt.W(0, arrayList2);
                yto ytoVar4 = (yto) CollectionsKt.W(1, arrayList2);
                String str10 = z7yVar.j;
                pn40 pn40Var3 = pn40.f27267a;
                double d13 = z7yVar.f;
                p3u0 p3u0Var3 = p3u0.c;
                String strC6 = pn40.c(d13, p3u0Var3);
                if (i0wVar5 == i0w.i) {
                    i7 = R.string.credited_to_account_with_colon;
                }
                String strA9 = lsm0Var3.a(i7, Arrays.copyOf(new Object[0], 0));
                double d14 = z7yVar.k.f.b;
                if (d14 == 0.0d) {
                    d14 = z7yVar.c;
                }
                String strC7 = pn40.c(d14, p3u0Var3);
                String strC8 = pn40.c(z7yVar.g, p3u0Var3);
                switch (i0wVar5.ordinal()) {
                    case 0:
                    case 2:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        pz40 pz40Var6 = s6t0.f31722a;
                        wtyVar = new wty(strC8, str, s6t0.b().f33626a.getTextPrimary());
                        break;
                    case 1:
                        pz40 pz40Var7 = s6t0.f31722a;
                        wtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC7, strC8, str);
                        break;
                    case 3:
                    case 4:
                        pz40 pz40Var8 = s6t0.f31722a;
                        wtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC7, strC8, str);
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return new cuo(str9, str9, strQ3, wm7Var5, lak0.c, ytoVar3, ytoVar4, null, new svw(R.drawable.ic_football), str10, false, "", strC6, dyb.g0(new x680("POSSIBLE_PAYOUT", strA9, wtyVar)), null);
            }
            vw4 vw4Var = (vw4) a5wVar;
            iy4 iy4Var2 = vw4Var.g;
            int i8 = vw4Var.r;
            boolean z10 = iy4Var2 == iy4.b && historyTypeModel == HistoryTypeModel.AUTO;
            Object[] objArr2 = {vw4Var.f38130a};
            boolean z11 = z10;
            lsm0 lsm0Var4 = ctf0Var.b;
            String strA10 = lsm0Var4.a(R.string.history_coupon_number, Arrays.copyOf(objArr2, 1));
            String strI = jwb.I(vw4Var, ctf0Var, list2);
            String str11 = vw4Var.f38130a;
            String strQ4 = w6x.q(bfb.R(vw4Var.d, ctf0Var), " · \u200e", strA10);
            int iOrdinal3 = iy4Var2.ordinal();
            if (iOrdinal3 == 0) {
                i2 = R.string.error;
            } else if (iOrdinal3 == 1) {
                i2 = R.string.autobet_waiting;
            } else if (iOrdinal3 == 2) {
                i2 = R.string.autobet_dropped;
            } else {
                if (iOrdinal3 != 3) {
                    t9f.b();
                    return null;
                }
                i2 = R.string.accepted;
            }
            int iOrdinal4 = iy4Var2.ordinal();
            if (iOrdinal4 == 0) {
                pz40 pz40Var9 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            } else if (iOrdinal4 == 1) {
                pz40 pz40Var10 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getSecondary();
            } else if (iOrdinal4 == 2) {
                pz40 pz40Var11 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            } else {
                if (iOrdinal4 != 3) {
                    t9f.b();
                    return null;
                }
                pz40 pz40Var12 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
            }
            String upperCase5 = lsm0Var4.a(i2, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase5.getClass();
            wm7 wm7Var6 = new wm7(upperCase5, jM113getRed0d7_KjU);
            boolean z12 = vw4Var.p;
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    wm7Var = wm7Var6;
                    next = null;
                    break;
                }
                next = it3.next();
                Iterator it4 = it3;
                wm7Var = wm7Var6;
                if (((xco) next).f40655a == vw4Var.O) {
                    break;
                }
                it3 = it4;
                wm7Var6 = wm7Var;
            }
            xco xcoVar = (xco) next;
            boolean z13 = xcoVar != null ? xcoVar.e : false;
            lc00 lc00VarB3 = kotlin.collections.a.b();
            if (z12) {
                lc00VarB3.add(new tso0("LIVE_ID", lsm0Var4.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), oro0.f25744a));
            }
            if (strI.length() > 0) {
                lc00VarB3.add(new tso0("TOP_CHAMP_ID", strI, bro0.f3088a));
            }
            if (z13) {
                lc00VarB3.add(new tso0("AUTO_SUB_ID", lsm0Var4.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)), xqo0.f41332a));
            }
            i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
            yto ytoVar5 = !z11 ? null : new yto(HistoryMenuItem.l, new wul(qul.e, oe9.c, new te9(R.drawable.ic_glyph_cancel), true, false, false));
            q4f q4fVar2 = vw4Var.b;
            long j2 = vw4Var.h;
            if (i8 <= 1) {
                if (i8 == 1) {
                    if (j2 != 0) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j2, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    rvwVar = new rvw(string);
                } else {
                    tvwVar = qvwVar;
                }
                String str12 = vw4Var.z;
                if (i8 > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String strN = w6x.n(vw4Var.t, i8, Separators.SLASH);
                String strK = kng0.k("\u200e", vw4Var.i);
                lc00 lc00VarB4 = kotlin.collections.a.b();
                String strA11 = lsm0Var4.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var4 = pn40.f27267a;
                String strC9 = pn40.c(vw4Var.f, p3u0.c);
                pz40 pz40Var13 = s6t0.f31722a;
                lc00VarB4.add(new x680("BET_SUM_ID", strA11, new wty(strC9, str, s6t0.b().f33626a.getTextPrimary())));
                boolean z14 = vw4Var.B;
                iy4Var = iy4.b;
                if (iy4Var2 != iy4Var && z14) {
                    x680Var = new x680("DROP_ID", lsm0Var4.a(R.string.when_score_change, Arrays.copyOf(new Object[0], 0)), new auy(lsm0Var4.a(R.string.drop_on, Arrays.copyOf(new Object[0], 0))));
                } else if (iy4Var2 == iy4Var || z14) {
                    x680Var = null;
                } else {
                    x680Var = new x680("DROP_ID", lsm0Var4.a(R.string.when_score_change, Arrays.copyOf(new Object[0], 0)), new auy(lsm0Var4.a(R.string.not_drop_on, Arrays.copyOf(new Object[0], 0))));
                }
                lc00VarB4.add(x680Var);
                i4 i4VarR3 = dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB4)));
                String str13 = vw4Var.D;
                if (iy4Var2 == iy4.c || str13.length() <= 0) {
                    l3wVar = null;
                } else {
                    l3wVar = new l3w(kotlin.text.c.r(lsm0Var4.a(R.string.cancellation_reason, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false), str13, j8x.f16108a);
                }
                return new cuo(str11, str11, strQ4, wm7Var, i4VarR2, ytoVar5, null, null, tvwVar, str12, z3, strN, strK, i4VarR3, l3wVar);
            }
            rvwVar = new svw(lgb.S(q4fVar2));
            tvwVar = rvwVar;
            String str14 = vw4Var.z;
            if (i8 > 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            String strN2 = w6x.n(vw4Var.t, i8, Separators.SLASH);
            String strK2 = kng0.k("\u200e", vw4Var.i);
            lc00 lc00VarB5 = kotlin.collections.a.b();
            String strA12 = lsm0Var4.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var5 = pn40.f27267a;
            String strC10 = pn40.c(vw4Var.f, p3u0.c);
            pz40 pz40Var14 = s6t0.f31722a;
            lc00VarB5.add(new x680("BET_SUM_ID", strA12, new wty(strC10, str, s6t0.b().f33626a.getTextPrimary())));
            boolean z15 = vw4Var.B;
            iy4Var = iy4.b;
            if (iy4Var2 != iy4Var) {
                if (iy4Var2 == iy4Var) {
                    x680Var = null;
                } else {
                    x680Var = null;
                }
            } else if (iy4Var2 == iy4Var) {
                x680Var = null;
            } else {
                x680Var = null;
            }
            lc00VarB5.add(x680Var);
            i4 i4VarR4 = dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB5)));
            String str15 = vw4Var.D;
            if (iy4Var2 == iy4.c) {
                l3wVar = null;
            } else {
                l3wVar = null;
            }
            return new cuo(str11, str11, strQ4, wm7Var, i4VarR2, ytoVar5, null, null, tvwVar, str14, z3, strN2, strK2, i4VarR4, l3wVar);
        }
        kzv kzvVar3 = (kzv) a5wVar;
        double d15 = kzvVar3.V;
        double d16 = kzvVar3.U;
        String str16 = kzvVar3.f19169a;
        Long lT0 = StringsKt.t0(str16);
        boolean zContains = list.contains(Long.valueOf(lT0 != null ? lT0.longValue() : 0L));
        String str17 = kzvVar3.l;
        int i9 = kzvVar3.t;
        List list6 = kzvVar3.Y;
        q4f q4fVar3 = kzvVar3.b;
        lsm0 lsm0Var5 = ctf0Var.b;
        String strA13 = lsm0Var5.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str16}, 1));
        i0w i0wVar6 = kzvVar3.g;
        ArrayList arrayListG3 = hew0.G(historyTypeModel, i0wVar6, list4);
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListG3, 10));
        Iterator it5 = arrayListG3.iterator();
        while (it5.hasNext()) {
            arrayList3.add(d5c.Z((HistoryMenuItem) it5.next(), zContains));
        }
        boolean zA = i7u.c.a(list6, list5);
        boolean zA2 = i7u.b.a(list6, list5);
        String strQ5 = w6x.q(bfb.R(kzvVar3.d, ctf0Var), " · \u200e", strA13);
        String upperCase6 = aac.Z(i0wVar6, ctf0Var).toUpperCase(Locale.ROOT);
        upperCase6.getClass();
        wm7 wm7Var7 = new wm7(upperCase6, aac.Y(i0wVar6));
        Iterator it6 = list3.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z4 = zA2;
                wm7Var2 = wm7Var7;
                next2 = null;
                break;
            }
            next2 = it6.next();
            z4 = zA2;
            wm7Var2 = wm7Var7;
            if (((xco) next2).f40655a == kzvVar3.T) {
                break;
            }
            zA2 = z4;
            wm7Var7 = wm7Var2;
        }
        xco xcoVar2 = (xco) next2;
        wm7 wm7Var8 = wm7Var2;
        i4 i4VarS = hhm0.s(kzvVar3.q, kzvVar3.G, kzvVar3.x, xcoVar2 != null ? xcoVar2.e : false, ctf0Var, jwb.J(kzvVar3, ctf0Var, list2), kzvVar3.V, zA, z4);
        String str18 = kzvVar3.B;
        yto ytoVar6 = (yto) CollectionsKt.W(0, arrayList3);
        yto ytoVar7 = (yto) CollectionsKt.W(1, arrayList3);
        long j3 = kzvVar3.h;
        if (i9 > 1) {
            i4 = 1;
            rvwVar2 = new svw(lgb.S(q4fVar3));
        } else if (i9 == 1) {
            if (j3 != 0) {
                bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                rz4.s(j3, ".svg", bzuVarD2);
                string2 = ((StringBuilder) bzuVarD2.b).toString();
            } else {
                string2 = "";
            }
            rvwVar2 = new rvw(string2);
            i4 = 1;
        } else {
            i4 = 1;
            rvwVar2 = qvwVar;
        }
        boolean z16 = i9 > i4;
        String strN3 = w6x.n(kzvVar3.v, i9, Separators.SLASH);
        String strK3 = kng0.k("\u200e", sj3.b0(kzvVar3));
        i0w i0wVar7 = i0w.i;
        lc00 lc00VarB6 = kotlin.collections.a.b();
        if (zA || str17.length() != 0) {
            q4fVar = q4fVar3;
            if (q4fVar == q4f.c) {
                lsm0Var = lsm0Var5;
                x680Var10 = new x680("OPTION_BET", lsm0Var.a(R.string.optional_coeff_colon, Arrays.copyOf(new Object[0], 0)), new auy("\u200e".concat(str17)));
            }
            d = kzvVar3.r;
            d2 = kzvVar3.p;
            double d17 = kzvVar3.o;
            hxuVar = kzvVar3.O;
            lc00VarB6.add(x680Var10);
            if (e3c.r(kzvVar3, z)) {
                x680Var4 = new x680("OPTION_BET", lsm0Var.a(R.string.coefficient_type_title, Arrays.copyOf(new Object[0], 0)), new auy(lsm0Var.a(R.string.coef_view_ind, Arrays.copyOf(new Object[0], 0))));
            } else {
                x680Var4 = null;
            }
            lc00VarB6.add(x680Var4);
            d3 = kzvVar3.f;
            if (q4fVar == q4f.h) {
                iOrdinal2 = i0wVar6.ordinal();
                if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                    strA3 = lsm0Var.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 == 3 || iOrdinal2 == 4) {
                    strA3 = lsm0Var.a(R.string.history_your_win_new, Arrays.copyOf(new Object[0], 0));
                } else {
                    str3 = str;
                    kzvVar = kzvVar3;
                    d6 = d;
                    x680Var5 = null;
                    i0wVar = i0wVar6;
                }
                pn40 pn40Var6 = pn40.f27267a;
                d8 = hxuVar.f.b;
                if (d8 == 0.0d) {
                    i0wVar = i0wVar6;
                    if (i0wVar != i0w.f13966a || i0wVar == i0w.b) {
                        d8 = d2;
                    } else {
                        d8 = d17;
                    }
                } else {
                    i0wVar = i0wVar6;
                }
                String strC11 = pn40.c(d8, p3u0.c);
                if (i0wVar != i0w.d || i0wVar == i0w.e) {
                    pz40 pz40Var15 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else {
                    pz40 pz40Var16 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = s6t0.b().f33626a.getSecondary();
                }
                str3 = str;
                x680Var5 = new x680("POSSIBLE_PAYOUT_ID", strA3, new wty(strC11, str3, jM98getGreen0d7_KjU));
                kzvVar = kzvVar3;
                d6 = d;
            } else {
                str3 = str;
                i0wVar = i0wVar6;
                if (kzvVar3.L < d3 || i0wVar == i0wVar7) {
                    if (i0wVar != i0wVar7) {
                        i5 = R.string.history_bet_rate;
                    }
                    String strA14 = lsm0Var.a(i5, Arrays.copyOf(new Object[0], 0));
                    if (i0wVar == i0wVar7) {
                        d4 = d3;
                        d5 = kzvVar3.M;
                    } else {
                        d4 = d3;
                        d5 = hxuVar.f.b;
                        if (d5 == 0.0d) {
                            if (i0wVar != i0w.f13966a || i0wVar == i0w.b) {
                                d5 = d;
                                d6 = d5;
                            } else if (i0wVar == i0w.d) {
                                d5 = kzvVar3.c;
                            } else {
                                d6 = d;
                                d5 = d17;
                            }
                        }
                        d7 = kzvVar3.C;
                        if (d7 <= 0.0d) {
                            d7 = d4 - kzvVar3.E;
                        }
                        pn40 pn40Var7 = pn40.f27267a;
                        p3u0Var = p3u0.c;
                        strC = pn40.c(d7, p3u0Var);
                        i0wVar2 = i0w.b;
                        if (i0wVar == i0wVar2 || !(q4fVar == q4f.k || q4fVar == q4f.j)) {
                            if (i0wVar == i0wVar2) {
                                kzvVar = kzvVar3;
                                if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                                    pz40 pz40Var17 = s6t0.f31722a;
                                    wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                                }
                            } else {
                                kzvVar = kzvVar3;
                            }
                            if (d5 == 0.0d && i0wVar == i0wVar2) {
                                String strC12 = pn40.c(d5, p3u0Var);
                                pz40 pz40Var18 = s6t0.f31722a;
                                xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC12, strC, str3);
                            } else if ((d5 == 0.0d && i0wVar == i0w.d) || i0wVar == i0w.e) {
                                String strC13 = pn40.c(d5, p3u0Var);
                                pz40 pz40Var19 = s6t0.f31722a;
                                xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC13, strC, str3);
                            } else if (i0wVar == i0wVar7) {
                                String strC14 = pn40.c(d5, p3u0Var);
                                pz40 pz40Var20 = s6t0.f31722a;
                                wtyVar3 = new wty(strC14, str3, s6t0.b().f33626a.getTextPrimary());
                            } else {
                                pz40 pz40Var21 = s6t0.f31722a;
                                wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                            }
                            wtyVar3 = xtyVar;
                        } else {
                            pz40 pz40Var22 = s6t0.f31722a;
                            wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                            kzvVar = kzvVar3;
                        }
                        x680Var5 = new x680("BET_SUM_ID", strA14, wtyVar3);
                    }
                    d6 = d;
                    d7 = kzvVar3.C;
                    if (d7 <= 0.0d) {
                        d7 = d4 - kzvVar3.E;
                    }
                    pn40 pn40Var8 = pn40.f27267a;
                    p3u0Var = p3u0.c;
                    strC = pn40.c(d7, p3u0Var);
                    i0wVar2 = i0w.b;
                    if (i0wVar == i0wVar2) {
                        if (i0wVar == i0wVar2) {
                            kzvVar = kzvVar3;
                            if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                                pz40 pz40Var110 = s6t0.f31722a;
                                wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                            }
                        } else {
                            kzvVar = kzvVar3;
                        }
                        if (d5 == 0.0d) {
                            String strC15 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var111 = s6t0.f31722a;
                            xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC15, strC, str3);
                            wtyVar3 = xtyVar;
                        } else if (d5 == 0.0d) {
                            String strC16 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var112 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC16, strC, str3);
                            wtyVar3 = xtyVar;
                        } else {
                            String strC17 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var113 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC17, strC, str3);
                            wtyVar3 = xtyVar;
                        }
                    } else {
                        if (i0wVar == i0wVar2) {
                            kzvVar = kzvVar3;
                            if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                                pz40 pz40Var114 = s6t0.f31722a;
                                wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                            }
                        } else {
                            kzvVar = kzvVar3;
                        }
                        if (d5 == 0.0d) {
                            String strC18 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var115 = s6t0.f31722a;
                            xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC18, strC, str3);
                            wtyVar3 = xtyVar;
                        } else if (d5 == 0.0d) {
                            String strC19 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var116 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC19, strC, str3);
                            wtyVar3 = xtyVar;
                        } else {
                            String strC110 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var117 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC110, strC, str3);
                            wtyVar3 = xtyVar;
                        }
                    }
                    x680Var5 = new x680("BET_SUM_ID", strA14, wtyVar3);
                } else {
                    i6 = R.string.history_bet_rate_partially_sold;
                }
                i5 = i6;
                String strA15 = lsm0Var.a(i5, Arrays.copyOf(new Object[0], 0));
                if (i0wVar == i0wVar7) {
                    d4 = d3;
                    d5 = kzvVar3.M;
                } else {
                    d4 = d3;
                    d5 = hxuVar.f.b;
                    if (d5 == 0.0d) {
                        if (i0wVar != i0w.f13966a) {
                            d5 = d;
                            d6 = d5;
                        } else {
                            d5 = d;
                            d6 = d5;
                        }
                    }
                    d7 = kzvVar3.C;
                    if (d7 <= 0.0d) {
                        d7 = d4 - kzvVar3.E;
                    }
                    pn40 pn40Var9 = pn40.f27267a;
                    p3u0Var = p3u0.c;
                    strC = pn40.c(d7, p3u0Var);
                    i0wVar2 = i0w.b;
                    if (i0wVar == i0wVar2) {
                        if (i0wVar == i0wVar2) {
                            kzvVar = kzvVar3;
                            if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                                pz40 pz40Var118 = s6t0.f31722a;
                                wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                            }
                        } else {
                            kzvVar = kzvVar3;
                        }
                        if (d5 == 0.0d) {
                            String strC111 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var119 = s6t0.f31722a;
                            xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC111, strC, str3);
                            wtyVar3 = xtyVar;
                        } else if (d5 == 0.0d) {
                            String strC112 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var1110 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC112, strC, str3);
                            wtyVar3 = xtyVar;
                        } else {
                            String strC113 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var1111 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC113, strC, str3);
                            wtyVar3 = xtyVar;
                        }
                    } else {
                        if (i0wVar == i0wVar2) {
                            kzvVar = kzvVar3;
                            if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                                pz40 pz40Var1112 = s6t0.f31722a;
                                wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                            }
                        } else {
                            kzvVar = kzvVar3;
                        }
                        if (d5 == 0.0d) {
                            String strC114 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var1113 = s6t0.f31722a;
                            xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC114, strC, str3);
                            wtyVar3 = xtyVar;
                        } else if (d5 == 0.0d) {
                            String strC115 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var1114 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC115, strC, str3);
                            wtyVar3 = xtyVar;
                        } else {
                            String strC116 = pn40.c(d5, p3u0Var);
                            pz40 pz40Var1115 = s6t0.f31722a;
                            xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC116, strC, str3);
                            wtyVar3 = xtyVar;
                        }
                    }
                    x680Var5 = new x680("BET_SUM_ID", strA15, wtyVar3);
                }
                d6 = d;
                d7 = kzvVar3.C;
                if (d7 <= 0.0d) {
                    d7 = d4 - kzvVar3.E;
                }
                pn40 pn40Var10 = pn40.f27267a;
                p3u0Var = p3u0.c;
                strC = pn40.c(d7, p3u0Var);
                i0wVar2 = i0w.b;
                if (i0wVar == i0wVar2) {
                    if (i0wVar == i0wVar2) {
                        kzvVar = kzvVar3;
                        if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                            pz40 pz40Var1116 = s6t0.f31722a;
                            wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                        }
                    } else {
                        kzvVar = kzvVar3;
                    }
                    if (d5 == 0.0d) {
                        String strC117 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var1117 = s6t0.f31722a;
                        xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC117, strC, str3);
                        wtyVar3 = xtyVar;
                    } else if (d5 == 0.0d) {
                        String strC118 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var1118 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC118, strC, str3);
                        wtyVar3 = xtyVar;
                    } else {
                        String strC119 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var1119 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC119, strC, str3);
                        wtyVar3 = xtyVar;
                    }
                } else {
                    if (i0wVar == i0wVar2) {
                        kzvVar = kzvVar3;
                        if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                            pz40 pz40Var11110 = s6t0.f31722a;
                            wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                        }
                    } else {
                        kzvVar = kzvVar3;
                    }
                    if (d5 == 0.0d) {
                        String strC1110 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11111 = s6t0.f31722a;
                        xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC1110, strC, str3);
                        wtyVar3 = xtyVar;
                    } else if (d5 == 0.0d) {
                        String strC1111 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11112 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC1111, strC, str3);
                        wtyVar3 = xtyVar;
                    } else {
                        String strC1112 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11113 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC1112, strC, str3);
                        wtyVar3 = xtyVar;
                    }
                }
                x680Var5 = new x680("BET_SUM_ID", strA15, wtyVar3);
            }
            lc00VarB6.add(x680Var5);
            i0wVar3 = i0w.b;
            if (i0wVar == i0wVar3 || !q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                x680Var6 = null;
            } else {
                ivo0 ivo0Var = hxuVar.f;
                double d18 = ivo0Var.b;
                double d19 = d18 == 0.0d ? d6 : d18;
                String strN4 = ivo0Var.f15455a.length() > 0 ? ohs0.n(hxuVar.f.f15455a, Separators.COLON) : lsm0Var.a(R.string.history_min_payout, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var11 = pn40.f27267a;
                String strC20 = pn40.c(d19, p3u0.c);
                pz40 pz40Var23 = s6t0.f31722a;
                x680Var6 = new x680("MINIMUM_BET_ID", strN4, new wty(strC20, str3, s6t0.b().f33626a.getTextPrimary()));
            }
            lc00VarB6.add(x680Var6);
            if (d16 == 0.0d || i0wVar != i0w.e) {
                if (d15 == 0.0d) {
                    kzvVar2 = kzvVar;
                    x680Var7 = null;
                } else {
                    strA = lsm0Var.a(R.string.advance_close_with_dots, Arrays.copyOf(new Object[0], 0));
                }
                lc00VarB6.add(x680Var7);
                if (kzvVar2.x) {
                    String strA16 = lsm0Var.a(R.string.auto_sale_order_with_colon, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var12 = pn40.f27267a;
                    String strC21 = pn40.c(kzvVar2.y, p3u0.c);
                    pz40 pz40Var24 = s6t0.f31722a;
                    x680Var8 = new x680("AUTO_SALE_ID", strA16, new wty(strC21, str3, s6t0.b().f33626a.getTextPrimary()));
                } else {
                    x680Var8 = null;
                }
                lc00VarB6.add(x680Var8);
                if (Intrinsics.d(hxuVar, hxu.h) || !z2) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (kzvVar2.n != lb90.b) {
                    dValueOf = null;
                } else if (!z5 && i0wVar == i0wVar3) {
                    dValueOf = Double.valueOf(d2);
                } else if (z5 || i0wVar != i0w.e) {
                    dValueOf = null;
                } else {
                    dValueOf = Double.valueOf(d17);
                }
                if (dValueOf != null) {
                    double dDoubleValue = dValueOf.doubleValue();
                    if (mzv.f22671a[i0wVar.ordinal()] == 4) {
                        pz40 pz40Var25 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getCommerce();
                    } else {
                        pz40 pz40Var26 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getTextPrimary();
                    }
                    iOrdinal = i0wVar.ordinal();
                    if (iOrdinal == 1) {
                        strA2 = lsm0Var.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0));
                    } else if (iOrdinal != 4) {
                        strA2 = lsm0Var.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA2 = lsm0Var.a(R.string.history_payout_title, Arrays.copyOf(new Object[0], 0));
                    }
                    pn40 pn40Var13 = pn40.f27267a;
                    x680Var9 = new x680("FREE_BET_ID", strA2, new wty(pn40.c(dDoubleValue, p3u0.c), str3, textPrimary));
                } else {
                    x680Var9 = null;
                }
                lc00VarB6.add(x680Var9);
                return new cuo(str16, str16, strQ5, wm7Var8, i4VarS, ytoVar6, ytoVar7, null, rvwVar2, str18, z16, strN3, strK3, dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB6))), null);
            }
            strA = lsm0Var.a(R.string.advance_conf_bet_row, Arrays.copyOf(new Object[0], 0));
            if (d16 == 0.0d && i0wVar == i0w.e) {
                pn40 pn40Var14 = pn40.f27267a;
                strL = pn40.c(d16, p3u0.c);
                kzvVar2 = kzvVar;
            } else {
                pn40 pn40Var15 = pn40.f27267a;
                kzvVar2 = kzvVar;
                double d20 = kzvVar2.w;
                p3u0 p3u0Var4 = p3u0.c;
                strL = kng0.l(pn40.c(d20, p3u0Var4), Separators.SLASH, pn40.c(d15, p3u0Var4));
            }
            pz40 pz40Var27 = s6t0.f31722a;
            x680Var7 = new x680("ADVANCE_BET_ID", strA, new wty(strL, str3, s6t0.b().f33626a.getTextPrimary()));
            lc00VarB6.add(x680Var7);
            if (kzvVar2.x) {
                String strA17 = lsm0Var.a(R.string.auto_sale_order_with_colon, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var16 = pn40.f27267a;
                String strC22 = pn40.c(kzvVar2.y, p3u0.c);
                pz40 pz40Var28 = s6t0.f31722a;
                x680Var8 = new x680("AUTO_SALE_ID", strA17, new wty(strC22, str3, s6t0.b().f33626a.getTextPrimary()));
            } else {
                x680Var8 = null;
            }
            lc00VarB6.add(x680Var8);
            if (Intrinsics.d(hxuVar, hxu.h)) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (kzvVar2.n != lb90.b) {
                dValueOf = null;
            } else if (!z5) {
                if (z5) {
                    dValueOf = null;
                } else {
                    dValueOf = null;
                }
            } else if (z5) {
                dValueOf = null;
            } else {
                dValueOf = null;
            }
            if (dValueOf != null) {
                double dDoubleValue2 = dValueOf.doubleValue();
                if (mzv.f22671a[i0wVar.ordinal()] == 4) {
                    pz40 pz40Var29 = s6t0.f31722a;
                    textPrimary = s6t0.b().f33626a.getCommerce();
                } else {
                    pz40 pz40Var210 = s6t0.f31722a;
                    textPrimary = s6t0.b().f33626a.getTextPrimary();
                }
                iOrdinal = i0wVar.ordinal();
                if (iOrdinal == 1) {
                    strA2 = lsm0Var.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal != 4) {
                    strA2 = lsm0Var.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0));
                } else {
                    strA2 = lsm0Var.a(R.string.history_payout_title, Arrays.copyOf(new Object[0], 0));
                }
                pn40 pn40Var17 = pn40.f27267a;
                x680Var9 = new x680("FREE_BET_ID", strA2, new wty(pn40.c(dDoubleValue2, p3u0.c), str3, textPrimary));
            } else {
                x680Var9 = null;
            }
            lc00VarB6.add(x680Var9);
            return new cuo(str16, str16, strQ5, wm7Var8, i4VarS, ytoVar6, ytoVar7, null, rvwVar2, str18, z16, strN3, strK3, dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB6))), null);
        }
        q4fVar = q4fVar3;
        lsm0Var = lsm0Var5;
        d = kzvVar3.r;
        d2 = kzvVar3.p;
        double d110 = kzvVar3.o;
        hxuVar = kzvVar3.O;
        lc00VarB6.add(x680Var10);
        if (e3c.r(kzvVar3, z)) {
            x680Var4 = new x680("OPTION_BET", lsm0Var.a(R.string.coefficient_type_title, Arrays.copyOf(new Object[0], 0)), new auy(lsm0Var.a(R.string.coef_view_ind, Arrays.copyOf(new Object[0], 0))));
        } else {
            x680Var4 = null;
        }
        lc00VarB6.add(x680Var4);
        d3 = kzvVar3.f;
        if (q4fVar == q4f.h) {
            iOrdinal2 = i0wVar6.ordinal();
            if (iOrdinal2 != 0) {
                strA3 = lsm0Var.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var18 = pn40.f27267a;
                d8 = hxuVar.f.b;
                if (d8 == 0.0d) {
                    i0wVar = i0wVar6;
                    if (i0wVar != i0w.f13966a) {
                        d8 = d2;
                    } else {
                        d8 = d2;
                    }
                } else {
                    i0wVar = i0wVar6;
                }
                String strC120 = pn40.c(d8, p3u0.c);
                if (i0wVar != i0w.d) {
                    pz40 pz40Var120 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else {
                    pz40 pz40Var121 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                }
                str3 = str;
                x680Var5 = new x680("POSSIBLE_PAYOUT_ID", strA3, new wty(strC120, str3, jM98getGreen0d7_KjU));
                kzvVar = kzvVar3;
                d6 = d;
            } else {
                strA3 = lsm0Var.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var19 = pn40.f27267a;
                d8 = hxuVar.f.b;
                if (d8 == 0.0d) {
                    i0wVar = i0wVar6;
                    if (i0wVar != i0w.f13966a) {
                        d8 = d2;
                    } else {
                        d8 = d2;
                    }
                } else {
                    i0wVar = i0wVar6;
                }
                String strC121 = pn40.c(d8, p3u0.c);
                if (i0wVar != i0w.d) {
                    pz40 pz40Var122 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else {
                    pz40 pz40Var123 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                }
                str3 = str;
                x680Var5 = new x680("POSSIBLE_PAYOUT_ID", strA3, new wty(strC121, str3, jM98getGreen0d7_KjU));
                kzvVar = kzvVar3;
                d6 = d;
            }
        } else {
            str3 = str;
            i0wVar = i0wVar6;
            if (kzvVar3.L < d3) {
                if (i0wVar != i0wVar7) {
                    i5 = i6;
                } else {
                    i5 = R.string.history_bet_rate;
                }
            } else if (i0wVar != i0wVar7) {
                i5 = i6;
            } else {
                i5 = R.string.history_bet_rate;
            }
            String strA18 = lsm0Var.a(i5, Arrays.copyOf(new Object[0], 0));
            if (i0wVar == i0wVar7) {
                d4 = d3;
                d5 = kzvVar3.M;
            } else {
                d4 = d3;
                d5 = hxuVar.f.b;
                if (d5 == 0.0d) {
                    if (i0wVar != i0w.f13966a) {
                        d5 = d;
                        d6 = d5;
                    } else {
                        d5 = d;
                        d6 = d5;
                    }
                }
                d7 = kzvVar3.C;
                if (d7 <= 0.0d) {
                    d7 = d4 - kzvVar3.E;
                }
                pn40 pn40Var110 = pn40.f27267a;
                p3u0Var = p3u0.c;
                strC = pn40.c(d7, p3u0Var);
                i0wVar2 = i0w.b;
                if (i0wVar == i0wVar2) {
                    if (i0wVar == i0wVar2) {
                        kzvVar = kzvVar3;
                        if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                            pz40 pz40Var11114 = s6t0.f31722a;
                            wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                        }
                    } else {
                        kzvVar = kzvVar3;
                    }
                    if (d5 == 0.0d) {
                        String strC1113 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11115 = s6t0.f31722a;
                        xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC1113, strC, str3);
                        wtyVar3 = xtyVar;
                    } else if (d5 == 0.0d) {
                        String strC1114 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11116 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC1114, strC, str3);
                        wtyVar3 = xtyVar;
                    } else {
                        String strC1115 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11117 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC1115, strC, str3);
                        wtyVar3 = xtyVar;
                    }
                } else {
                    if (i0wVar == i0wVar2) {
                        kzvVar = kzvVar3;
                        if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                            pz40 pz40Var11118 = s6t0.f31722a;
                            wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                        }
                    } else {
                        kzvVar = kzvVar3;
                    }
                    if (d5 == 0.0d) {
                        String strC1116 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var11119 = s6t0.f31722a;
                        xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC1116, strC, str3);
                        wtyVar3 = xtyVar;
                    } else if (d5 == 0.0d) {
                        String strC1117 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var111110 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC1117, strC, str3);
                        wtyVar3 = xtyVar;
                    } else {
                        String strC1118 = pn40.c(d5, p3u0Var);
                        pz40 pz40Var111111 = s6t0.f31722a;
                        xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC1118, strC, str3);
                        wtyVar3 = xtyVar;
                    }
                }
                x680Var5 = new x680("BET_SUM_ID", strA18, wtyVar3);
            }
            d6 = d;
            d7 = kzvVar3.C;
            if (d7 <= 0.0d) {
                d7 = d4 - kzvVar3.E;
            }
            pn40 pn40Var111 = pn40.f27267a;
            p3u0Var = p3u0.c;
            strC = pn40.c(d7, p3u0Var);
            i0wVar2 = i0w.b;
            if (i0wVar == i0wVar2) {
                if (i0wVar == i0wVar2) {
                    kzvVar = kzvVar3;
                    if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                        pz40 pz40Var111112 = s6t0.f31722a;
                        wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                    }
                } else {
                    kzvVar = kzvVar3;
                }
                if (d5 == 0.0d) {
                    String strC1119 = pn40.c(d5, p3u0Var);
                    pz40 pz40Var111113 = s6t0.f31722a;
                    xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC1119, strC, str3);
                    wtyVar3 = xtyVar;
                } else if (d5 == 0.0d) {
                    String strC11110 = pn40.c(d5, p3u0Var);
                    pz40 pz40Var111114 = s6t0.f31722a;
                    xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC11110, strC, str3);
                    wtyVar3 = xtyVar;
                } else {
                    String strC11111 = pn40.c(d5, p3u0Var);
                    pz40 pz40Var111115 = s6t0.f31722a;
                    xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC11111, strC, str3);
                    wtyVar3 = xtyVar;
                }
            } else {
                if (i0wVar == i0wVar2) {
                    kzvVar = kzvVar3;
                    if (q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
                        pz40 pz40Var111116 = s6t0.f31722a;
                        wtyVar3 = new wty(strC, str3, s6t0.b().f33626a.getTextPrimary());
                    }
                } else {
                    kzvVar = kzvVar3;
                }
                if (d5 == 0.0d) {
                    String strC11112 = pn40.c(d5, p3u0Var);
                    pz40 pz40Var111117 = s6t0.f31722a;
                    xtyVar = new xty(s6t0.b().f33626a.getSecondary(), strC11112, strC, str3);
                    wtyVar3 = xtyVar;
                } else if (d5 == 0.0d) {
                    String strC11113 = pn40.c(d5, p3u0Var);
                    pz40 pz40Var111118 = s6t0.f31722a;
                    xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC11113, strC, str3);
                    wtyVar3 = xtyVar;
                } else {
                    String strC11114 = pn40.c(d5, p3u0Var);
                    pz40 pz40Var111119 = s6t0.f31722a;
                    xtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC11114, strC, str3);
                    wtyVar3 = xtyVar;
                }
            }
            x680Var5 = new x680("BET_SUM_ID", strA18, wtyVar3);
        }
        lc00VarB6.add(x680Var5);
        i0wVar3 = i0w.b;
        if (i0wVar == i0wVar3) {
            x680Var6 = null;
        } else {
            x680Var6 = null;
        }
        lc00VarB6.add(x680Var6);
        if (d16 == 0.0d) {
            strA = lsm0Var.a(R.string.advance_conf_bet_row, Arrays.copyOf(new Object[0], 0));
            if (d16 == 0.0d) {
                pn40 pn40Var112 = pn40.f27267a;
                kzvVar2 = kzvVar;
                double d21 = kzvVar2.w;
                p3u0 p3u0Var5 = p3u0.c;
                strL = kng0.l(pn40.c(d21, p3u0Var5), Separators.SLASH, pn40.c(d15, p3u0Var5));
            } else {
                pn40 pn40Var113 = pn40.f27267a;
                strL = pn40.c(d16, p3u0.c);
                kzvVar2 = kzvVar;
            }
            pz40 pz40Var211 = s6t0.f31722a;
            x680Var7 = new x680("ADVANCE_BET_ID", strA, new wty(strL, str3, s6t0.b().f33626a.getTextPrimary()));
        } else if (d15 == 0.0d) {
            kzvVar2 = kzvVar;
            x680Var7 = null;
        } else {
            strA = lsm0Var.a(R.string.advance_close_with_dots, Arrays.copyOf(new Object[0], 0));
            if (d16 == 0.0d) {
                pn40 pn40Var114 = pn40.f27267a;
                kzvVar2 = kzvVar;
                double d22 = kzvVar2.w;
                p3u0 p3u0Var6 = p3u0.c;
                strL = kng0.l(pn40.c(d22, p3u0Var6), Separators.SLASH, pn40.c(d15, p3u0Var6));
            } else {
                pn40 pn40Var115 = pn40.f27267a;
                strL = pn40.c(d16, p3u0.c);
                kzvVar2 = kzvVar;
            }
            pz40 pz40Var212 = s6t0.f31722a;
            x680Var7 = new x680("ADVANCE_BET_ID", strA, new wty(strL, str3, s6t0.b().f33626a.getTextPrimary()));
        }
        lc00VarB6.add(x680Var7);
        if (kzvVar2.x) {
            String strA19 = lsm0Var.a(R.string.auto_sale_order_with_colon, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var116 = pn40.f27267a;
            String strC23 = pn40.c(kzvVar2.y, p3u0.c);
            pz40 pz40Var213 = s6t0.f31722a;
            x680Var8 = new x680("AUTO_SALE_ID", strA19, new wty(strC23, str3, s6t0.b().f33626a.getTextPrimary()));
        } else {
            x680Var8 = null;
        }
        lc00VarB6.add(x680Var8);
        if (Intrinsics.d(hxuVar, hxu.h)) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (kzvVar2.n != lb90.b) {
            dValueOf = null;
        } else if (!z5) {
            if (z5) {
                dValueOf = null;
            } else {
                dValueOf = null;
            }
        } else if (z5) {
            dValueOf = null;
        } else {
            dValueOf = null;
        }
        if (dValueOf != null) {
            double dDoubleValue3 = dValueOf.doubleValue();
            if (mzv.f22671a[i0wVar.ordinal()] == 4) {
                pz40 pz40Var214 = s6t0.f31722a;
                textPrimary = s6t0.b().f33626a.getCommerce();
            } else {
                pz40 pz40Var215 = s6t0.f31722a;
                textPrimary = s6t0.b().f33626a.getTextPrimary();
            }
            iOrdinal = i0wVar.ordinal();
            if (iOrdinal == 1) {
                strA2 = lsm0Var.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal != 4) {
                strA2 = lsm0Var.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0));
            } else {
                strA2 = lsm0Var.a(R.string.history_payout_title, Arrays.copyOf(new Object[0], 0));
            }
            pn40 pn40Var117 = pn40.f27267a;
            x680Var9 = new x680("FREE_BET_ID", strA2, new wty(pn40.c(dDoubleValue3, p3u0.c), str3, textPrimary));
        } else {
            x680Var9 = null;
        }
        lc00VarB6.add(x680Var9);
        return new cuo(str16, str16, strQ5, wm7Var8, i4VarS, ytoVar6, ytoVar7, null, rvwVar2, str18, z16, strN3, strK3, dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB6))), null);
    }

    public static final void b(int i, int i2, fet fetVar, mm40 mm40Var, Function1 function1) {
        fet fetVar2;
        mm40 mm40Var2;
        Function1 function2;
        fetVar.g0(-1587815419);
        byte b = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            boolean z = (((i3 & 112) ^ 48) > 32 && fetVar.e(i)) || (i3 & 48) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dx2(i, b);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            dwi0.b((Function1) objP, mm40Var, function1, fetVar2, ((i3 << 3) & 112) | (i3 & 896), 0);
            mm40Var2 = mm40Var;
            function2 = function1;
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var2, i, function2, i2, (byte) 2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x05eb: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:89)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final a.p5t b0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x05eb: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:89)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r91v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:106:0x0158  */
    /* JADX WARN: Code duplicated, block: B:109:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0170  */
    /* JADX WARN: Code duplicated, block: B:115:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0178  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181  */
    /* JADX WARN: Code duplicated, block: B:121:0x0186  */
    /* JADX WARN: Code duplicated, block: B:122:0x0188  */
    /* JADX WARN: Code duplicated, block: B:124:0x018e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0118  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0130  */
    /* JADX WARN: Code duplicated, block: B:97:0x013a  */
    public static final long c(float f, float f2, float f3, float f4, y4d y4dVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (y4dVar.c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            float f9 = f5 <= 1.0f ? f5 : 1.0f;
            g2t0 g2t0Var = h2t0.b;
            long j = ((long) (i22 | ((int) ((f9 * 255.0f) + 0.5f)))) << 32;
            int i23 = y3d.h;
            return j;
        }
        int i24 = y4dVar.c;
        if (i24 == -1) {
            wcx.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i25 = 0;
        float fB3 = y4dVar.b(0);
        float fA3 = y4dVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i26 = iFloatToRawIntBits3 >>> 31;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = iFloatToRawIntBits3 & 8388607;
        if (i27 == 255) {
            i2 = i28 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | (i26 << 15);
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fB = y4dVar.b(1);
                    fA = y4dVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fB2 = y4dVar.b(2);
                                fA2 = y4dVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i25 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i25 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i25 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            g2t0 g2t0Var2 = h2t0.b;
                                            int i30 = y3d.h;
                                            return j2;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i25 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j3 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                g2t0 g2t0Var3 = h2t0.b;
                                int i31 = y3d.h;
                                return j3;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fB2 = y4dVar.b(2);
                    fA2 = y4dVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                g2t0 g2t0Var4 = h2t0.b;
                                int i32 = y3d.h;
                                return j4;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j5 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    g2t0 g2t0Var5 = h2t0.b;
                    int i33 = y3d.h;
                    return j5;
                }
                if (i >= -10) {
                    int i34 = (i28 | 8388608) >> (1 - i);
                    if ((i34 & 4096) != 0) {
                        i34 += 8192;
                    }
                    i2 = i34 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i26 << 15) | (i << 10);
        short s8 = (short) i3;
        fB = y4dVar.b(1);
        fA = y4dVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fB2 = y4dVar.b(2);
                    fA2 = y4dVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j6 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                g2t0 g2t0Var6 = h2t0.b;
                                int i35 = y3d.h;
                                return j6;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j7 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    g2t0 g2t0Var7 = h2t0.b;
                    int i36 = y3d.h;
                    return j7;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fB2 = y4dVar.b(2);
        fA2 = y4dVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i25 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i25 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i25 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    g2t0 g2t0Var8 = h2t0.b;
                    int i37 = y3d.h;
                    return j8;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i25 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j9 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        g2t0 g2t0Var9 = h2t0.b;
        int i38 = y3d.h;
        return j9;
    }

    public static final int c0(String str) {
        if (str == null) {
            return R.drawable.ic_cyber_lol_position_placeholder;
        }
        switch (str.hashCode()) {
            case 96416:
                return !str.equals("adc") ? R.drawable.ic_cyber_lol_position_placeholder : R.drawable.ic_cyber_lol_bot_lane;
            case 105603:
                return !str.equals("jun") ? R.drawable.ic_cyber_lol_position_placeholder : R.drawable.ic_cyber_lol_jungle;
            case 108104:
                return !str.equals("mid") ? R.drawable.ic_cyber_lol_position_placeholder : R.drawable.ic_cyber_lol_mid_lane;
            case 114254:
                return str.equals("sup") ? R.drawable.ic_cyber_lol_support : R.drawable.ic_cyber_lol_position_placeholder;
            case 115029:
                return !str.equals("top") ? R.drawable.ic_cyber_lol_position_placeholder : R.drawable.ic_cyber_lol_top_lane;
            default:
                return R.drawable.ic_cyber_lol_position_placeholder;
        }
    }

    public static final long d(int i) {
        long j = i;
        g2t0 g2t0Var = h2t0.b;
        long j2 = j << 32;
        int i2 = y3d.h;
        return j2;
    }

    public static final long e(int i, int i2, int i3, int i4) {
        return d(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long f(long j) {
        long j2 = j << 32;
        g2t0 g2t0Var = h2t0.b;
        int i = y3d.h;
        return j2;
    }

    public static final void h(l7m0 l7m0Var, qdz qdzVar, final Function1 function1, Function1 function2, fet fetVar, int i) {
        fetVar.g0(-476671503);
        byte b = 4;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            final float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            final float f = 168.0f + fH0;
            final float f2 = 56.0f + fH0;
            final qsk qskVar = (qsk) ((tsk) l7m0Var.getValue()).b.getValue();
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            final pz40 pz40Var = (pz40) objP;
            Unit unit = Unit.f46060a;
            boolean zG = fetVar.g(xczVarA);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new bz0(xczVarA, pz40Var, null, b);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            m0x0.d(null, f, ((StaticColors) fetVar.k(dVar)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), true, 0.0f, null, ((StaticColors) fetVar.k(dVar)).m121getTransparent0d7_KjU(), 56.0f, null, null, u1c.M(846136292, new zdr() { // from class: a.srk
                @Override // a.zdr
                public final Object O(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i3;
                    l7m0 l7m0Var2 = (l7m0) obj2;
                    ycl yclVar = (ycl) obj4;
                    fet fetVar2 = (fet) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    l7m0Var2.getClass();
                    ((l7m0) obj3).getClass();
                    if ((iIntValue & 6) == 0) {
                        i3 = (fetVar2.g(l7m0Var2) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 384) == 0) {
                        i3 |= fetVar2.d(yclVar.f42389a) ? 256 : 128;
                    }
                    if (fetVar2.U(i3 & 1, (i3 & 1155) != 1154)) {
                        qcc.e(qskVar, l7m0Var2, pz40Var, f, f2, fH0, yclVar.f42389a, function1, fetVar2, ((i3 << 3) & 112) | 384 | ((i3 << 12) & 3670016));
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1000493982, new mkb(xczVarA, qdzVar, function1, function2, l7m0Var), fetVar), fetVar, 24576, 432, 1601);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 7);
        }
    }

    public static final void i(int i, int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1716837377);
        int i3 = (fetVar2.e(i) ? 4 : 2) | i2;
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 24.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroup(), vgg0.f37379a);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(String.valueOf(i), jr8.f16991a.b(jm40Var, gqw0.e), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, i2, (byte) 7);
        }
    }

    public static final void j(drf drfVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-870021650);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(drfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new qgg0();
                fetVar.o0(objP);
            }
            qgg0 qgg0Var = (qgg0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = mmf.f22035a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(qgg0Var) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new v4f(qgg0Var, drfVar, (byte) 7);
                fetVar.o0(objP3);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP3, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(drfVar, i, (byte) 22);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(1187322654);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(vic.w(o7k0.e(mm40Var, 60.0f)), 8.0f);
            x5d x5dVarA = w5d.a(new qw3(10.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            long j = iph.f;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 3) & 14, 24960, 110586);
            long j2 = iph.g;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str2, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, (i2 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 17);
        }
    }

    public static final void l(mm40 mm40Var, String str, c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        u3i u3iVar5;
        u3i u3iVar6;
        int i2;
        boolean z;
        u3i u3iVar7;
        int i3;
        int i4;
        str.getClass();
        c4iVar.getClass();
        b4iVar.getClass();
        u3iVar.getClass();
        function1.getClass();
        fetVar.g0(-1154978289);
        int i5 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(c4iVar) ? 256 : 128) | (fetVar.g(b4iVar) ? 2048 : 1024) | (fetVar.g(u3iVar) ? 16384 : 8192) | (fetVar.g(u3iVar2) ? 131072 : 65536) | (fetVar.g(u3iVar3) ? 1048576 : 524288) | (fetVar.g(u3iVar4) ? 8388608 : 4194304);
        if ((i & 100663296) == 0) {
            i5 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if (fetVar.U(i6 & 1, (i6 & 38347923) != 38347922)) {
            zcl zclVar = qmk.f28987a;
            int iB = si30.b(pkd.b(12.0f, fetVar));
            int iB2 = si30.b(pkd.b(6.0f, fetVar));
            int iB3 = si30.b(pkd.b(4.0f, fetVar));
            int iB4 = si30.b(pkd.b(54.0f, fetVar));
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 54.0f), "EVENT_CARD_TOP_LAYOUT_V3");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new x2i((byte) 0);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            int i7 = i6 & 458752;
            int i8 = i6 & 3670016;
            boolean zE = (i7 == 131072) | (i8 == 1048576) | ((i6 & 29360128) == 8388608) | fetVar.e(iB) | fetVar.e(iB2) | fetVar.e(iB3) | fetVar.e(iB4);
            Object objP2 = fetVar.P();
            if (zE || objP2 == cl5Var) {
                i2 = i7;
                z = true;
                z2i z2iVar = new z2i(u3iVar2, u3iVar3, u3iVar4, iB, iB2, iB3, iB4);
                u3iVar5 = u3iVar2;
                u3iVar7 = u3iVar3;
                fetVar.o0(z2iVar);
                objP2 = z2iVar;
            } else {
                u3iVar7 = u3iVar3;
                i2 = i7;
                z = true;
                u3iVar5 = u3iVar2;
            }
            tj30 tj30Var = (tj30) objP2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i9 = i6 >> 3;
            fetVar2 = fetVar;
            u3iVar6 = u3iVar4;
            o(null, str, b4iVar, u3iVar, fetVar2, (i6 & 112) | (i9 & 896) | (i9 & 7168));
            p(null, c4iVar, fetVar2, i9 & 112);
            byte b = 3;
            if (u3iVar5 instanceof z3i) {
                fetVar2.e0(154985528);
                z3i z3iVar = (z3i) u3iVar5;
                int iOrdinal = z3iVar.f43719a.ordinal();
                if (iOrdinal == 0) {
                    i4 = R.drawable.ic_glyph_notification_active;
                } else {
                    if (iOrdinal != z) {
                        t9f.b();
                        return;
                    }
                    i4 = R.drawable.ic_glyph_notification_inactive;
                }
                boolean z2 = ((i6 & 234881024) == 67108864 ? z : false) | (i2 == 131072 ? z : false);
                Object objP3 = fetVar2.P();
                if (z2 || objP3 == cl5Var) {
                    objP3 = new j2i(function1, z3iVar, b);
                    fetVar2.o0(objP3);
                }
                m(i4, 0, fetVar2, null, (Function0) objP3);
                fetVar2.r(false);
            } else {
                fetVar2.e0(155389148);
                fetVar2.r(false);
            }
            if (u3iVar7 instanceof x3i) {
                fetVar2.e0(155488038);
                x3i x3iVar = (x3i) u3iVar7;
                int iOrdinal2 = x3iVar.f40219a.ordinal();
                if (iOrdinal2 == 0) {
                    i3 = R.drawable.ic_glyph_favourite_active;
                } else {
                    if (iOrdinal2 != z) {
                        t9f.b();
                        return;
                    }
                    i3 = R.drawable.ic_glyph_favourite_inactive;
                }
                boolean z3 = ((i6 & 234881024) == 67108864 ? z : false) | (i8 == 1048576 ? z : false);
                Object objP4 = fetVar2.P();
                if (z3 || objP4 == cl5Var) {
                    objP4 = new l2i(function1, x3iVar, b);
                    fetVar2.o0(objP4);
                }
                m(i3, 0, fetVar2, null, (Function0) objP4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(155878204);
                fetVar2.r(false);
            }
            if (u3iVar6 instanceof s3i) {
                fetVar2.e0(155971886);
                a(null, (s3i) u3iVar6, function1, fetVar2, (i6 >> 18) & 1008);
                fetVar2.r(false);
            } else {
                fetVar2.e0(156139100);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2 = fetVar;
            u3iVar5 = u3iVar2;
            u3iVar6 = u3iVar4;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var, str, (Object) c4iVar, (Object) b4iVar, (Object) u3iVar, (Object) u3iVar5, (Object) u3iVar3, (Object) u3iVar6, (wdr) function1, i, (byte) 3);
        }
    }

    public static final void m(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fetVar.g0(1380288812);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            wul wulVar = new wul(qul.e, oe9.c, new te9(i), true, false, false);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 3);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, wulVar, (Function0) objP, fetVar, 6, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(mm40Var2, i, function0, i2, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, o0x o0xVar, y3d y3dVar, y3d y3dVar2, m0x m0xVar, fet fetVar, int i) {
        mm40 mm40Var2;
        long secondary;
        long secondary2;
        fetVar.g0(1360543607);
        int i2 = i | 6 | (fetVar.g(o0xVar) ? 32 : 16) | (fetVar.g(y3dVar) ? 256 : 128) | (fetVar.g(y3dVar2) ? 2048 : 1024) | (fetVar.g(m0xVar) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            Context context = (Context) fetVar.k(dy2.b);
            if (o0xVar != null) {
                boolean z = o0xVar instanceof m0x;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(-1167869580);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        Drawable drawableU = epv0.U(((m0x) o0xVar).f20977a, context);
                        objP = drawableU != null ? mym0.j(drawableU) : null;
                        fetVar.o0(objP);
                    }
                    pm80 pm80Var = (pm80) objP;
                    if (pm80Var == null) {
                        fetVar.e0(-1167720099);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1167720098);
                        if (y3dVar == null) {
                            fetVar.e0(-114590596);
                            secondary2 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-114591681);
                            fetVar.r(false);
                            secondary2 = y3dVar.f41946a;
                        }
                        zcl zclVar = qmk.f28987a;
                        dww.c(pm80Var, null, o7k0.n(jm40Var, 16.0f), secondary2, fetVar, 56, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (o0xVar instanceof l0x) {
                    fetVar.e0(-1167342642);
                    Drawable drawable = ((l0x) o0xVar).f19222a;
                    if (drawable == null) {
                        fetVar.e0(-1167342643);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1167342642);
                        Object objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = mym0.j(drawable);
                            fetVar.o0(objP2);
                        }
                        pm80 pm80Var2 = (pm80) objP2;
                        if (y3dVar == null) {
                            fetVar.e0(703389610);
                            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(703388525);
                            fetVar.r(false);
                            secondary = y3dVar.f41946a;
                        }
                        zcl zclVar2 = qmk.f28987a;
                        dww.c(pm80Var2, null, o7k0.n(jm40Var, 16.0f), secondary, fetVar, 56, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (o0xVar instanceof n0x) {
                    fetVar.e0(-1166958459);
                    zcl zclVar3 = qmk.f28987a;
                    int i3 = i2 & 112;
                    int i4 = i2 << 3;
                    u7x.q(null, (n0x) o0xVar, 16.0f, y3dVar, y3dVar2, m0xVar, fetVar, i3 | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 1);
                    fetVar.r(false);
                }
                fetVar.r(true);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(-1838789199, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) o0xVar, (Object) y3dVar, (Object) y3dVar2, (Object) m0xVar, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    public static final void o(mm40 mm40Var, String str, b4i b4iVar, u3i u3iVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        jm40 jm40Var;
        boolean z;
        fet fetVar3;
        fet fetVar4;
        ?? r4;
        long j;
        fet fetVar5 = fetVar;
        fetVar5.g0(-981852369);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar5.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar5.g(b4iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar5.g(u3iVar) ? 2048 : 1024;
        }
        boolean z2 = false;
        if (fetVar5.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = str.length() > 0;
            boolean z4 = b4iVar.f1959a.length() > 0;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar5, 48);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar5, jm40Var2);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            if (z3) {
                fetVar5.e0(669231266);
                int i3 = ((i2 >> 3) & 14) | 48;
                jm40Var = jm40Var2;
                z = true;
                j6n.h(str, oro0.f25744a, null, 0, 0, fetVar5, i3, 28);
                fetVar5.r(false);
            } else {
                jm40Var = jm40Var2;
                z = true;
                fetVar5.e0(669374455);
                fetVar5.r(false);
            }
            h4i h4iVar = b4iVar.b;
            if (h4iVar instanceof e4i) {
                fetVar5.e0(669521333);
                e4i e4iVar = (e4i) h4iVar;
                fgm fgmVar = fgm.b;
                long j2 = e4iVar.f7183a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (e4iVar.c) {
                    j = j2 - jCurrentTimeMillis;
                    if (j < 0) {
                        j = 0;
                    }
                } else {
                    j = j2 - (jCurrentTimeMillis - e4iVar.b);
                    if (j < 0) {
                        j = 0;
                    }
                }
                rcb.x(null, j, h2m.b, nsm0.y(fgmVar), true, null, fetVar, 384);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                z2 = false;
                fetVar3 = fetVar6;
            } else if (h4iVar instanceof f4i) {
                fetVar5.e0(-1363863473);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                if (!Intrinsics.d(h4iVar, g4i.f10668a)) {
                    throw b1j.f(-1363879560, fetVar5, false);
                }
                fetVar5.e0(669963672);
                j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar5, 54, 28);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            if (z4) {
                fetVar3.e0(670177045);
                String str2 = b4iVar.f1959a;
                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                boolean z5 = z2;
                v8q0.a(str2, new x7z(1.0f, z2), ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
                fet fetVar7 = fetVar;
                fetVar7.r(z5);
                r4 = z5;
                fetVar4 = fetVar7;
            } else {
                boolean z6 = z2;
                fetVar3.e0(670496407);
                fetVar3.r(z6);
                r4 = z6;
                fetVar4 = fetVar3;
            }
            if (u3iVar instanceof v3i) {
                fetVar4.e0(670587733);
                n4c.d(null, ((v3i) u3iVar).f36733a, fetVar4, r4);
                fetVar4.r(r4);
            } else {
                fetVar4.e0(670681911);
                fetVar4.r(r4);
            }
            fetVar4.r(z);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 1, i, (Object) mm40Var2, (Object) str, (Object) b4iVar, (Object) u3iVar);
        }
    }

    public static final void p(mm40 mm40Var, c4i c4iVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-522488879);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(c4iVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "EVENT_CARD_CHAMP_LABEL_V3");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (c4iVar.c != null) {
                fetVar2.e0(-1032527433);
                if (c4iVar.b) {
                    fetVar2.e0(-1032490233);
                    q(0, fetVar2);
                    zcl zclVar = qmk.f28987a;
                    qxw.o(fetVar2, o7k0.s(jm40Var, 2.0f));
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1032361459);
                    fetVar2.r(false);
                }
                n(null, c4iVar.c, c4iVar.e, c4iVar.f, c4iVar.d, fetVar2, 0);
                zcl zclVar2 = qmk.f28987a;
                qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1031983507);
                fetVar2.r(false);
            }
            String str = c4iVar.f3727a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var2, c4iVar, i, (byte) 23);
        }
    }

    public static final void q(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1771240031);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar), null, o7k0.n(jm40.b, 16.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i, (byte) 7);
        }
    }

    public static final void r(mm40 mm40Var, dw1 dw1Var, fet fetVar, int i) {
        pcy pcyVar;
        dw1 dw1Var2 = dw1Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(222557197);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(dw1Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                zcl zclVar = qmk.f28987a;
                objP = androidx.compose.runtime.e.e(new ycl(0.0f));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            float f = ((ycl) pz40Var.getValue()).f42389a;
            zcl zclVar2 = qmk.f28987a;
            float f2 = ycl.a(f, 164.0f) > 0 ? 70.0f : 90.0f;
            mm40 mm40VarL = s5x0.L(o7k0.d(mm40Var, 1.0f), 16.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, f2);
            xx7 xx7Var = gqw0.m;
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            float f3 = f2;
            v8q0.a(dw1Var2.d, null, afn0.m(fetVar2).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, g1t0.g(), fetVar, 0, 28032, 102394);
            String str = dw1Var2.e;
            long secondary = afn0.m(fetVar).getSecondary();
            y9q0 y9q0VarR = g1t0.r();
            long j = qmk.q;
            long j2 = qmk.t;
            long j3 = qmk.n;
            v8q0.a(str, null, secondary, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, y9q0VarR, fetVar, 0, 28032, 102386);
            fetVar.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 10.0f, 4.0f, 0.0f, 8);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, mm40VarN, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarA2 = zhg0Var.a(0.1f, o7k0.b(jm40Var, 4.0f, 0.0f, 2), true);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarA2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            jcb.v(o7k0.d(jm40Var, 1.0f), 1.0f, afn0.m(fetVar).getSecondary20(), fetVar, 6, 0);
            fetVar.r(true);
            zcl zclVar3 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            dn8 dn8VarH = j120.h(1.0f, afn0.m(fetVar).getSecondary20());
            long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            ugd ugdVarM = u1c.M(-600704886, new cxj(dw1Var2, pz40Var, (byte) 18), fetVar);
            pcy pcyVar3 = pcyVar;
            gmn0.a(jm40Var, ugg0Var2, jM123getWhite0d7_KjU, 0L, 0.0f, 0.0f, dn8VarH, ugdVarM, fetVar, 12582918, 56);
            mm40 mm40VarB = o7k0.b(zhg0Var.a(0.1f, jm40Var, true), 4.0f, 0.0f, 2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            jcb.v(o7k0.d(jm40Var, 1.0f), 1.0f, afn0.m(fetVar).getSecondary20(), fetVar, 6, 0);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarS2 = o7k0.s(jm40Var, f3);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.o, fetVar, 48);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarS2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            dw1Var2 = dw1Var;
            v8q0.a(dw1Var2.f, null, afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, g1t0.g(), fetVar, 0, 28032, 102394);
            v8q0.a(dw1Var2.g, null, afn0.m(fetVar).getSecondary(), new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, g1t0.r(), fetVar, 0, 28032, 102386);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var, dw1Var2, i, (byte) 19);
        }
    }

    public static final void s(x7z x7zVar, m9m m9mVar, fet fetVar, int i) {
        fetVar.g0(-1655103793);
        int i2 = (fetVar.g(x7zVar) ? 4 : 2) | i | (fetVar.g(m9mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(x7zVar, 56.0f);
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            H(m9mVar.b, fetVar, 0);
            J(6, fetVar, o7k0.d(jm40.b, 1.0f), m9mVar.c);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(x7zVar, m9mVar, i, (byte) 8);
        }
    }

    public static final void t(mm40 mm40Var, nuj nujVar, Function0 function0, fet fetVar, int i) {
        int i2;
        nujVar.getClass();
        function0.getClass();
        fetVar.g0(468133530);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nujVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), nujVar.b, kjm.f18392a, null, function0, null, fetVar, ((i2 << 6) & 57344) | 384, 40);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, nujVar, function0, i, (byte) 28);
        }
    }

    public static final void u(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0 l7m0Var2;
        qdz qdzVar2;
        Function1 function3;
        Function1 function4;
        fet fetVar2;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1839391210);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar2 = fetVar;
            h(l7m0Var, qdzVar, function1, function2, fetVar2, i2 & 8190);
            l7m0Var2 = l7m0Var;
            qdzVar2 = qdzVar;
            function3 = function1;
            function4 = function2;
        } else {
            l7m0Var2 = l7m0Var;
            qdzVar2 = qdzVar;
            function3 = function1;
            function4 = function2;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var2, qdzVar2, function3, function4, i, (byte) 6);
        }
    }

    public static final void v(mm40 mm40Var, fw1 fw1Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1822186555);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(null) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (fw1Var instanceof dw1) {
            fetVar.e0(-667536023);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1127884291, new mz7(mm40Var, fw1Var, b2), fetVar), fetVar, 56);
            fetVar.r(false);
        } else {
            if (!fw1Var.equals(ew1.f8498a)) {
                throw b1j.f(1225390520, fetVar, false);
            }
            fetVar.e0(-662008630);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), vbc.d0(null, fetVar, 0, 1), fetVar, 0, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jql(mm40Var, fw1Var, i, b);
        }
    }

    public static final void w(mm40 mm40Var, List list, xyl xylVar, wxl wxlVar, uyl uylVar, Integer num, boolean z, boolean z2, Function2 function2, fet fetVar, int i) {
        List list2;
        xyl xylVar2;
        Integer num2;
        boolean z3;
        mm40 mm40Var2;
        wxl wxlVar2;
        uyl uylVar2;
        boolean z4;
        list.getClass();
        function2.getClass();
        fetVar.g0(-1700471689);
        int i2 = i | 12610566;
        byte b = 1;
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            wxl wxlVar3 = wxl.PRIMARY;
            uyl uylVar3 = uyl.f36494a;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new nrk(function2, b);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                list2 = list;
                xylVar2 = xylVar;
                num2 = num;
                z3 = z;
                objP2 = new t13(xylVar2, list2, z3, num2);
                fetVar.o0(objP2);
            } else {
                list2 = list;
                xylVar2 = xylVar;
                num2 = num;
                z3 = z;
            }
            mm40Var2 = jm40.b;
            dwi0.b(function1, mm40Var2, (Function1) objP2, fetVar, 48, 0);
            z4 = true;
            wxlVar2 = wxlVar3;
            uylVar2 = uylVar3;
        } else {
            list2 = list;
            xylVar2 = xylVar;
            num2 = num;
            z3 = z;
            fetVar.X();
            mm40Var2 = mm40Var;
            wxlVar2 = wxlVar;
            uylVar2 = uylVar;
            z4 = z2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o69(mm40Var2, list2, xylVar2, wxlVar2, uylVar2, num2, z3, z4, function2, i);
        }
    }

    public static final void x(mm40 mm40Var, axm axmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1191883769);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(axmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            jm40 jm40Var = jm40.b;
            E(o7k0.e(jm40Var, 22.0f), axmVar.f1629a, fetVar, 0);
            F(o7k0.e(jm40Var, 32.0f), axmVar.b, fetVar, 0);
            F(o7k0.e(jm40Var, 32.0f), axmVar.c, fetVar, 0);
            fetVar.r(true);
            B(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), axmVar.d, axmVar.e, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 10, i, mm40Var, axmVar);
        }
    }

    public static final void y(mm40 mm40Var, b1n b1nVar, b1n b1nVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        a2mVar.getClass();
        fetVar.g0(-1915740012);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(b1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(b1nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a2mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                fetVar.e0(1514829563);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1514830487);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(661607380, new ip0(mm40Var, b1nVar, a2mVar, z, b1nVar2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 16, i, mm40Var, (Object) b1nVar, (Object) b1nVar2, (Object) a2mVar, z);
        }
    }

    public static final void z(y5x y5xVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(2111411246);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(y5xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = p5o.f26414a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) y5xVar, (byte) 14);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean z2 = i3 == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new f5o(y5xVar, b);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, y5xVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(y5xVar, i, (byte) 8);
        }
    }
}
