package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tdc {
    public static final void A(tpe tpeVar, ope opeVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-172935343);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tpeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(o7k0.e(mm40Var, 24.0f), 24.0f, 0.0f, 2);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(mm40VarU, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarJ, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), ugg0Var), 6.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(M(tpeVar, opeVar, fetVar, i2 & 126), null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, J(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109)), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l0m(tpeVar, opeVar, mm40Var, i, (byte) 1);
        }
    }

    public static final void B(mm40 mm40Var, a4x a4xVar, u3n u3nVar, boolean z, xcz xczVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        boolean z2;
        Object obj;
        fetVar.g0(-1043695909);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(u3nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(xczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            obj = function1;
            i2 |= fetVar.i(obj) ? 131072 : 65536;
        } else {
            obj = function1;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                t13 t13Var = new t13((Object) a4xVar, (Object) u3nVar, z2, obj, (byte) 9);
                fetVar.o0(t13Var);
                objP = t13Var;
            }
            b8k0.e(mm40Var2, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, ((i2 >> 9) & 112) | (i2 & 14), Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var, (Object) a4xVar, (Object) u3nVar, z, (Object) xczVar, (wdr) function1, i, (byte) 13);
        }
    }

    public static final void C(int i, int i2, ope opeVar, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-25433966);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            long jK = K(opeVar, fetVar);
            long jR = R(opeVar, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.n(mm40Var, 14.0f), vgg0.f37379a), jK, jd8.n);
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
            v8q0.a(L(i, opeVar), null, jR, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, J(new y9q0(0L, qmk.o, null, j1t0.f15753a, 0L, null, 0, 0, qmk.B, 16646109)), fetVar, 0, 0, 131066);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0m(i, opeVar, mm40Var, i2, (byte) 0);
        }
    }

    public static final void D(EventCardInfoLive eventCardInfoLive, fus fusVar) {
        boolean z = fusVar.b;
        boolean z2 = fusVar.f10180a;
        l7n l7nVar = z ? l7n.f19567a : l7n.b;
        eventCardInfoLive.setTimerVisibility(z2);
        eventCardInfoLive.setHideAfterFinished(true);
        eventCardInfoLive.setTimeDirection(l7nVar);
        eventCardInfoLive.setTime(TimeUnit.SECONDS.toMillis(dtb.T(fusVar)));
        vd7 vd7Var = eventCardInfoLive.f47290a;
        if (z2) {
            ((DsTimer) vd7Var.d).d();
            eventCardInfoLive.b();
        } else {
            DsTimer dsTimer = (DsTimer) vd7Var.d;
            dsTimer.l = false;
            dsTimer.g.removeCallbacks(dsTimer.w);
            eventCardInfoLive.b();
        }
    }

    public static final jo20 E(lnf0 lnf0Var, long j, int i, Long l, int i2) {
        jo20 jo20Var = new jo20();
        if (j > 0) {
            jo20Var.put("champId", Long.valueOf(j));
        }
        qbt.c(i, jo20Var);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != -1) {
                jo20Var.put("dateFrom", Long.valueOf(jLongValue));
            }
        }
        jo20Var.put("gr", 1357);
        jo20Var.put("limit", Integer.valueOf(i2));
        jo20Var.put("lng", lnf0Var.f20342a);
        qbt.l(jo20Var);
        return jo20Var.b();
    }

    public static final mm40 F(mm40 mm40Var, float f) {
        float f2;
        mm40Var.getClass();
        float f3 = f / 12.0f;
        if (f3 >= 40.0f) {
            zcl zclVar = qmk.f28987a;
            f2 = 20.0f;
        } else {
            f2 = f3 / 2.0f;
        }
        return s5x0.L(mm40Var, 0.0f, f2, 1);
    }

    public static final Object G(yje yjeVar, kmq kmqVar, xdr xdrVar, Function0 function0, gmq[] gmqVarArr) {
        o6d o6dVar = new o6d(null, kmqVar, xdrVar, function0, gmqVarArr);
        lmq lmqVar = new lmq(yjeVar, yjeVar.getContext());
        Object objZ = ycm0.z(lmqVar, true, lmqVar, o6dVar);
        return objZ == wne.f39444a ? objZ : Unit.f46060a;
    }

    public static final String H(String str, String str2) {
        return str.concat(str2.length() > 0 ? " - ".concat(str2) : "");
    }

    public static fof I() {
        sqf sqfVar = sqf.f32627a;
        kif kifVar = new kif(pif.d, -1, -1);
        iun iunVar = iun.f15405a;
        irf irfVar = new irf(0, sqfVar, "", false, kifVar, 0L, 0L, iunVar, iunVar, 0.0f, iunVar, 0, 0, iunVar);
        wpf wpfVar = wpf.c;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        trf trfVar = new trf(iunVar, 0, wpfVar, lunVar, lunVar);
        lunVar.getClass();
        return new fof(irfVar, trfVar, new trf(iunVar, 0, wpfVar, lunVar, lunVar), iunVar, false, false);
    }

    public static final y9q0 J(y9q0 y9q0Var) {
        return y9q0Var.d(new y9q0(0L, 0L, null, null, 0L, null, 0, 1, 0L, 16711679));
    }

    public static final long K(ope opeVar, fet fetVar) {
        if (opeVar != null) {
            if ((opeVar instanceof gpe) || (opeVar instanceof jpe)) {
                fetVar.e0(-1192078597);
                long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                fetVar.r(false);
                return primary;
            }
            if ((opeVar instanceof fpe) || (opeVar instanceof ipe) || (opeVar instanceof mpe)) {
                fetVar.e0(-1192074817);
                long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                fetVar.r(false);
                return jM121getTransparent0d7_KjU;
            }
            if (opeVar instanceof hpe) {
                fetVar.e0(-1192072809);
                long jM113getRed0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                fetVar.r(false);
                return jM113getRed0d7_KjU;
            }
            if ((opeVar instanceof kpe) || (opeVar instanceof lpe)) {
                fetVar.e0(-1192069757);
                long backgroundGroup = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup();
                fetVar.r(false);
                return backgroundGroup;
            }
            if (opeVar instanceof npe) {
                fetVar.e0(-1192067559);
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
                return jM123getWhite0d7_KjU;
            }
        }
        throw b1j.f(-1192081352, fetVar, false);
    }

    public static final String L(int i, ope opeVar) {
        int i2;
        if (opeVar != null) {
            if ((opeVar instanceof gpe) || (opeVar instanceof hpe) || (opeVar instanceof npe)) {
                i2 = 99;
            } else if ((opeVar instanceof mpe) || (opeVar instanceof kpe) || (opeVar instanceof lpe) || (opeVar instanceof jpe) || (opeVar instanceof fpe)) {
                i2 = 9999;
            } else if (opeVar instanceof ipe) {
                i2 = 9;
            }
            return i <= i2 ? String.valueOf(i) : f140.i(i2, "+");
        }
        t9f.b();
        return null;
    }

    public static final String M(tpe tpeVar, ope opeVar, fet fetVar, int i) {
        if (tpeVar != null) {
            if (tpeVar instanceof rpe) {
                fetVar.e0(935620936);
                String strL = L(((rpe) tpeVar).f30883a, opeVar);
                fetVar.r(false);
                return strL;
            }
            if (tpeVar instanceof spe) {
                fetVar.e0(935623572);
                spe speVar = (spe) tpeVar;
                int i2 = speVar.f32589a;
                String strValueOf = i2 > 99 ? "99+" : String.valueOf(i2);
                int i3 = speVar.b;
                String str = strValueOf + Separators.SLASH + (i3 <= 99 ? String.valueOf(i3) : "99+");
                fetVar.r(false);
                return str;
            }
        }
        throw b1j.f(935619637, fetVar, false);
    }

    public static final tnh N(fks0 fks0Var) {
        switch (fks0Var.ordinal()) {
            case 0:
                return new tnh(rnh.ANALYTICS);
            case 1:
                return new tnh(rnh.COACH);
            case 2:
                return new tnh(rnh.FREE);
            case 3:
                return new tnh(rnh.INACTIVE);
            case 4:
                return new tnh(rnh.MANAGEMENT);
            case 5:
                return new tnh(rnh.MEDIA);
            case 6:
                return new tnh(rnh.RETIREMENT);
            case 7:
                return new tnh(rnh.SUBSTITUTE);
            default:
                return null;
        }
    }

    public static final c6q0 O(String str, String str2, String str3, boolean z) {
        String str4;
        t7q0 s7q0Var;
        a6q0 a6q0Var = new a6q0(false, z);
        if (str3.length() > 0) {
            str4 = str3;
            s7q0Var = new s7q0(str4);
        } else {
            str4 = str3;
            s7q0Var = r7q0.f29989a;
        }
        t7q0 t7q0Var = s7q0Var;
        boolean zC = cy7.c();
        return new c6q0(str, e6q0.f7299a, i6q0.f14254a, t7q0Var, true, str4.length() > 0, a6q0Var, str2, null, zC, 0, null, 259328);
    }

    public static final double P(BigDecimal bigDecimal, float f, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal3);
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalSubtract2 = bigDecimal2.subtract(bigDecimal3);
        bigDecimalSubtract2.getClass();
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, 4, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(f)));
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply.doubleValue();
    }

    public static final j83 Q(String str, boolean z) {
        h83 h83Var = new h83();
        long jZ = wzb.Z(z, StaticColors.INSTANCE.m123getWhite0d7_KjU());
        str.getClass();
        h83 h83Var2 = new h83();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(jZ, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var2.c(str);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        return h83Var.h();
    }

    public static final long R(ope opeVar, fet fetVar) {
        if (opeVar != null) {
            if ((opeVar instanceof gpe) || (opeVar instanceof jpe)) {
                fetVar.e0(1708386141);
                long primaryForeground = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
                fetVar.r(false);
                return primaryForeground;
            }
            if ((opeVar instanceof fpe) || (opeVar instanceof kpe) || (opeVar instanceof lpe) || (opeVar instanceof mpe)) {
                fetVar.e0(1708391381);
                long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
                return secondary;
            }
            if ((opeVar instanceof hpe) || (opeVar instanceof ipe)) {
                fetVar.e0(1708394257);
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
                return jM123getWhite0d7_KjU;
            }
            if (opeVar instanceof npe) {
                fetVar.e0(1708396145);
                long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
                fetVar.r(false);
                return jM62getBlack0d7_KjU;
            }
        }
        throw b1j.f(1708383344, fetVar, false);
    }

    public static final boolean S(mxp mxpVar, mxp mxpVar2) {
        return !(Y(mxpVar.y, mxpVar2.y) && Y(mxpVar.A, mxpVar2.A) && Y(mxpVar.z, mxpVar2.z) && Y(mxpVar.O, mxpVar2.O));
    }

    public static final boolean T(androidx.fragment.app.e eVar) {
        eVar.getClass();
        List<Fragment> listP = eVar.c.p();
        listP.getClass();
        if (listP != null && listP.isEmpty()) {
            return false;
        }
        for (Fragment fragment : listP) {
            if ((fragment instanceof sik) && !((sik) fragment).m) {
                return true;
            }
        }
        return false;
    }

    public static final boolean U(androidx.fragment.app.e eVar) {
        eVar.getClass();
        for (Fragment fragment : eVar.c.p()) {
            if ((fragment instanceof sik) && ((sik) fragment).S()) {
                return false;
            }
            List listP = fragment.C().c.p();
            listP.getClass();
            if (!listP.isEmpty()) {
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.getClass();
                if (!U(eVarC)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final mm40 V(mm40 mm40Var, xcz xczVar, fet fetVar) {
        mm40Var.getClass();
        xczVar.getClass();
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = jgk0.b(new eb(xczVar, (byte) 24));
            fetVar.o0(objP);
        }
        l7m0 l7m0Var = (l7m0) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = jgk0.b(new eb(xczVar, (byte) 25));
            fetVar.o0(objP2);
        }
        l7m0 l7m0Var2 = (l7m0) objP2;
        boolean z = fetVar.k(bmd.n) == k6z.f17794a;
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zD = fetVar.d(24.0f) | fetVar.g(w6kVar);
        Object objP3 = fetVar.P();
        if (zD || objP3 == obj) {
            objP3 = androidx.compose.runtime.e.a(w6kVar.w0(24.0f));
            fetVar.o0(objP3);
        }
        agk0 agk0Var = (agk0) objP3;
        long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
        Object objP4 = fetVar.P();
        if (objP4 == obj) {
            objP4 = new mmn((byte) 18);
            fetVar.o0(objP4);
        }
        mm40 mm40VarT = i4w0.T(mm40Var, (Function1) objP4);
        boolean zH = fetVar.h(z) | fetVar.g(agk0Var) | fetVar.f(backgroundContent);
        Object objP5 = fetVar.P();
        if (zH || objP5 == obj) {
            Object c6nVar = new c6n(z, backgroundContent, agk0Var, l7m0Var, l7m0Var2);
            fetVar.o0(c6nVar);
            objP5 = c6nVar;
        }
        return rq8.L(mm40VarT, (Function1) objP5);
    }

    public static final boolean W(double d, double d2, Double d3, i8r i8rVar, boolean z, wrz wrzVar) {
        if (wrzVar == oki0.SESSION_TIME_LIMIT_7_DAY || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
            d *= 24.0d;
        }
        if (d == 0.0d) {
            return false;
        }
        if (d == d2 || Intrinsics.a(d, d3) || z) {
            return true;
        }
        if (i8rVar == null) {
            return false;
        }
        return d > i8rVar.b.f12641a || d < i8rVar.f14353a.f12641a;
    }

    public static final boolean X(byp bypVar, byp bypVar2) {
        float f = bypVar.b;
        if (f == -1.0f) {
            return true;
        }
        float f2 = bypVar2.b;
        if (f2 == -1.0f || bypVar.f3429a == -1 || bypVar2.f3429a == -1) {
            return true;
        }
        return f == 0.0f && f2 == 0.0f;
    }

    public static final boolean Y(float f, float f2) {
        if (f == -1.0f || f2 == -1.0f) {
            return true;
        }
        return f == 0.0f && f2 == 0.0f;
    }

    public static final View Z(yzj yzjVar) {
        if (!((lm40) yzjVar).f20279a.n) {
            xcx.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) h7z.a(vcc.Z(yzjVar));
    }

    public static final void a(tpe tpeVar, ope opeVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        long jM123getWhite0d7_KjU;
        fetVar.g0(730283722);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tpeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 24.0f), "BOX_COUNTER");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            fpe fpeVar = opeVar instanceof fpe ? (fpe) opeVar : null;
            y3d y3dVar = fpeVar != null ? fpeVar.f9924a : null;
            if (y3dVar == null) {
                fetVar.e0(-1320072999);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(-1320075169);
                fetVar.r(false);
                jM123getWhite0d7_KjU = y3dVar.f41946a;
            }
            String strM = M(tpeVar, opeVar, fetVar, i2 & 126);
            y9q0 y9q0VarJ = J(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109));
            if (opeVar.g()) {
                fetVar.e0(-1320066315);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            } else {
                fetVar.e0(-1320065959);
            }
            fetVar.r(false);
            v8q0.a(strM, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarJ, fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l0m(tpeVar, opeVar, mm40Var, i, (byte) 0);
        }
    }

    public static final boolean a0(mxp mxpVar, mxp mxpVar2) {
        return !(Y(mxpVar.u, mxpVar2.u) && Y(mxpVar.x, mxpVar2.x) && Y(mxpVar.v, mxpVar2.v) && Y(mxpVar.w, mxpVar2.w));
    }

    public static final void b(mm40 mm40Var, ycm ycmVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        icm icmVar = ycmVar.f42390a;
        fetVar.g0(1957343911);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ycmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 120.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            vfc.n(o7k0.d(jm40.b, 1.0f), icmVar.f14542a, fetVar, 6);
            fre0.A(icmVar.b, xdrVar, fetVar, (i2 & 896) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) ycmVar, (Object) xdrVar, i, (byte) 16);
        }
    }

    public static final jwe b0(am00 am00Var) {
        am00Var.getClass();
        long j = am00Var.n;
        long j2 = am00Var.o;
        long j3 = am00Var.c;
        long j4 = am00Var.f1087a;
        long j5 = am00Var.d;
        double d = am00Var.e;
        long j6 = am00Var.g;
        String str = am00Var.h;
        String str2 = am00Var.p;
        String str3 = am00Var.q;
        String strH = H(str2, str3);
        List list = am00Var.r;
        int size = list.size();
        List list2 = am00Var.s;
        int iMax = Math.max(size, list2.size());
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        String str6 = (String) (1 < list.size() ? list.get(1) : "");
        String str7 = (String) CollectionsKt.firstOrNull(list2);
        if (str7 == null) {
            str7 = "";
        }
        String str8 = (String) (1 < list2.size() ? list2.get(1) : "");
        long j7 = am00Var.t;
        double d2 = am00Var.b;
        String str9 = am00Var.m;
        uoy uoyVar = am00Var.u == 1 ? uoy.LIVE : uoy.LINE;
        zfa0 zfa0Var = am00Var.w;
        yeo yeoVar = am00Var.x;
        return new jwe(j, j2, j3, j4, j6, str, str9, am00Var.l, "", j5, d, strH, str2, str3, iMax, str5, str6, str7, str8, j7, d2, uoyVar, zfa0Var, "", "", new yeo(yeoVar.f42496a, yeoVar.b));
    }

    public static final void c(int i, fet fetVar, final a4x a4xVar, mm40 mm40Var) {
        int i2;
        final int i3;
        a4xVar.getClass();
        fetVar.g0(-894378166);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            final int iC0 = CollectionsKt.C0(a4xVar);
            if (a4xVar.isEmpty()) {
                i3 = 0;
            } else {
                Iterator<E> it = a4xVar.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() > 0 && (i3 = i3 + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            final float f = i3 > 1 ? 4.8f : 0.0f;
            mm40 mm40VarV = yyw.V(mm40Var, fetVar.k(bmd.n) == k6z.b);
            boolean zE = fetVar.e(iC0) | fetVar.e(i3) | fetVar.d(f) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new Function1() { // from class: a.yph
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        fhl fhlVar = (fhl) obj;
                        fhlVar.getClass();
                        zcl zclVar = qmk.f28987a;
                        float fW0 = fhlVar.w0(6.0f);
                        vtm0 vtm0Var = new vtm0(fW0, 0.0f, 1, 0, null, 26);
                        float f2 = fW0 / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - fW0)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fW0)) << 32);
                        int i4 = iC0;
                        if (i4 <= 0) {
                            fhl.V(fhlVar, iph.d, -90.0f, 360.0f, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, vtm0Var, 832);
                        } else {
                            int i5 = i3;
                            float fD = i5 > 1 ? ((fW0 / h7k0.d(jFloatToRawIntBits2)) * 180.0f) / 3.1415927f : 0.0f;
                            float f3 = fD * 2.0f;
                            float f4 = f;
                            float f5 = 360.0f - ((f4 + f3) * i5);
                            int i6 = 0;
                            float f6 = -90.0f;
                            for (Object obj2 : a4xVar) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                int iIntValue = ((Number) obj2).intValue();
                                if (iIntValue > 0) {
                                    float f7 = (iIntValue * f5) / i4;
                                    i4 i4Var = iph.f15163a;
                                    fhl.V(fhlVar, ((y3d) i4Var.get(i6 % i4Var.size())).f41946a, f6 + fD, f7, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, vtm0Var, 832);
                                    f6 = f7 + f3 + f4 + f6;
                                }
                                i6 = i7;
                            }
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            p8a.k(mm40VarV, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, b);
        }
    }

    public static final a2m c0(d0t d0tVar) {
        t480 t480VarF = kpb.F(d0tVar);
        rqs rqsVar = d0tVar.p;
        boolean zIsEmpty = rqsVar.d.isEmpty();
        c2m c2mVar = c2m.f3631a;
        if (zIsEmpty || d0tVar.z) {
            return new z1m(c2mVar);
        }
        return new y1m(c2mVar, new x1m(), t480VarF.f33307a, t480VarF.b, rqsVar.r, rqsVar.s);
    }

    public static final void d(mm40 mm40Var, brl brlVar, fet fetVar, int i) {
        fetVar.g0(-443091399);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(brlVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = brlVar instanceof zql;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-1701155083);
                h((zql) brlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!brlVar.equals(arl.f1351a)) {
                    throw b1j.f(-609067547, fetVar, false);
                }
                fetVar.e0(-1701014498);
                i(i2 & 14, fetVar, jm40Var);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oql(mm40Var, brlVar, i, (byte) 3);
        }
    }

    public static final vgl d0(ygl yglVar) {
        lnm0 lnm0Var;
        nab nabVar;
        Long l = yglVar.f42590a;
        Integer num = yglVar.g;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Integer num2 = yglVar.b;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num2.intValue();
        Double d = yglVar.c;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = yglVar.f;
        if (d2 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d2.doubleValue();
        if (num != null) {
            cl5 cl5Var = nab.f23182a;
            int iIntValue2 = num.intValue();
            cl5Var.getClass();
            if (iIntValue2 == 1) {
                nabVar = nab.b;
            } else if (iIntValue2 != 2) {
                nabVar = iIntValue2 != 3 ? nab.e : nab.d;
            } else {
                nabVar = nab.c;
            }
            int iOrdinal = nabVar.ordinal();
            if (iOrdinal == 0) {
                lnm0Var = lnm0.c;
            } else if (iOrdinal == 1) {
                lnm0Var = lnm0.d;
            } else if (iOrdinal == 2) {
                lnm0Var = lnm0.e;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                lnm0Var = lnm0.b;
            }
        } else {
            lnm0Var = lnm0.b;
        }
        Double d3 = yglVar.h;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        List list = yglVar.k;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        List list2 = yglVar.j;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        List list3 = yglVar.e;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        rk10 rk10Var = yglVar.i;
        csr csrVarA0 = rk10Var != null ? d5c.a0(rk10Var) : csr.e;
        List list4 = yglVar.d;
        if (list4 != null) {
            return new vgl(jLongValue, iIntValue, dDoubleValue, dDoubleValue2, lnm0Var, dDoubleValue3, list, list2, list3, csrVarA0, list4);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01eb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void e(final tpe tpeVar, final ope opeVar, mm40 mm40Var, fet fetVar, final int i, final int i2) {
        int i3;
        mm40 mm40Var2;
        boolean z;
        final mm40 mm40Var3;
        yfe0 yfe0VarU;
        Function2 function2;
        mm40 mm40Var4;
        spe speVar;
        fet fetVar2 = fetVar;
        tpeVar.getClass();
        opeVar.getClass();
        fetVar2.g0(-433881336);
        if ((i & 6) == 0) {
            i3 = (fetVar2.g(tpeVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar2.g(opeVar) : fetVar2.i(opeVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar2.g(mm40Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                if (i4 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (tpeVar instanceof rpe) {
                    if (((rpe) tpeVar).f30883a >= 1) {
                        if (opeVar instanceof gpe) {
                            fetVar2.e0(2092909679);
                            gpe gpeVar = (gpe) opeVar;
                            v(kbc.X(tpeVar), gpeVar.f11678a, gpeVar, mm40Var4, fetVar2, (i3 << 6) & 64512);
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        } else if (opeVar instanceof hpe) {
                            fetVar2.e0(2093230095);
                            hpe hpeVar = (hpe) opeVar;
                            v(kbc.X(tpeVar), hpeVar.f13438a, hpeVar, mm40Var4, fetVar2, (i3 << 6) & 64512);
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        } else if (opeVar instanceof npe) {
                            fetVar2.e0(2093535941);
                            C(kbc.X(tpeVar), i3 & 1008, opeVar, fetVar2, mm40Var4);
                            fetVar2.r(false);
                        } else if (opeVar instanceof fpe) {
                            fetVar2.e0(2093748663);
                            a(tpeVar, opeVar, mm40Var4, fetVar2, i3 & 1022);
                            fetVar2.r(false);
                        } else if (opeVar instanceof ipe) {
                            fetVar2.e0(2093946691);
                            x(kbc.X(tpeVar), i3 & 1008, opeVar, fetVar2, mm40Var4);
                            fetVar2.r(false);
                        } else if (opeVar instanceof jpe) {
                            fetVar2.e0(2094172495);
                            jpe jpeVar = (jpe) opeVar;
                            y(kbc.X(tpeVar), jpeVar.d, jpeVar.f16895a, jpeVar.b, jpeVar.c, opeVar, mm40Var4, fetVar, (i3 << 15) & 33030144);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else if (opeVar instanceof kpe) {
                            fetVar2.e0(2094659102);
                            kpe kpeVar = (kpe) opeVar;
                            long j = kpeVar.f18670a;
                            long j2 = kpeVar.b;
                            int i5 = (i3 >> 6) & 14;
                            int i6 = i3 << 3;
                            z(mm40Var4, tpeVar, opeVar, j, j2, fetVar2, (i6 & 896) | i5 | (i6 & 112));
                            fetVar2.r(false);
                        } else if (opeVar instanceof lpe) {
                            fetVar2.e0(2094987454);
                            lpe lpeVar = (lpe) opeVar;
                            long j3 = lpeVar.b;
                            long j4 = lpeVar.c;
                            int i7 = (i3 >> 6) & 14;
                            int i8 = i3 << 3;
                            z(mm40Var4, tpeVar, opeVar, j3, j4, fetVar2, i7 | (i8 & 112) | (i8 & 896));
                            fetVar2.r(false);
                        } else {
                            if (!(opeVar instanceof mpe)) {
                                throw b1j.f(-348128666, fetVar2, false);
                            }
                            fetVar2.e0(2095300182);
                            A(tpeVar, opeVar, mm40Var4, fetVar2, i3 & 1022);
                            fetVar2.r(false);
                        }
                        mm40Var3 = mm40Var4;
                    } else {
                        yfe0VarU = fetVar2.u();
                        if (yfe0VarU != null) {
                            return;
                        }
                        final byte b = 0;
                        final mm40 mm40Var5 = mm40Var4;
                        function2 = new Function2() { // from class: a.k0m
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        tdc.e(tpeVar, opeVar, mm40Var5, (fet) obj, x8x.L(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        tdc.e(tpeVar, opeVar, mm40Var5, (fet) obj, x8x.L(i | 1), i2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                    }
                } else {
                    if (tpeVar instanceof spe) {
                        t9f.b();
                        return;
                    }
                    speVar = (spe) tpeVar;
                    if (speVar.f32589a >= 0 || speVar.b < 1) {
                        yfe0VarU = fetVar2.u();
                        if (yfe0VarU != null) {
                            return;
                        }
                        final byte b2 = 0;
                        final mm40 mm40Var6 = mm40Var4;
                        function2 = new Function2() { // from class: a.k0m
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b2) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        tdc.e(tpeVar, opeVar, mm40Var6, (fet) obj, x8x.L(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        tdc.e(tpeVar, opeVar, mm40Var6, (fet) obj, x8x.L(i | 1), i2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                    } else {
                        if (opeVar instanceof gpe) {
                            fetVar2.e0(2092909679);
                            gpe gpeVar2 = (gpe) opeVar;
                            v(kbc.X(tpeVar), gpeVar2.f11678a, gpeVar2, mm40Var4, fetVar2, (i3 << 6) & 64512);
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        } else if (opeVar instanceof hpe) {
                            fetVar2.e0(2093230095);
                            hpe hpeVar2 = (hpe) opeVar;
                            v(kbc.X(tpeVar), hpeVar2.f13438a, hpeVar2, mm40Var4, fetVar2, (i3 << 6) & 64512);
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        } else if (opeVar instanceof npe) {
                            fetVar2.e0(2093535941);
                            C(kbc.X(tpeVar), i3 & 1008, opeVar, fetVar2, mm40Var4);
                            fetVar2.r(false);
                        } else if (opeVar instanceof fpe) {
                            fetVar2.e0(2093748663);
                            a(tpeVar, opeVar, mm40Var4, fetVar2, i3 & 1022);
                            fetVar2.r(false);
                        } else if (opeVar instanceof ipe) {
                            fetVar2.e0(2093946691);
                            x(kbc.X(tpeVar), i3 & 1008, opeVar, fetVar2, mm40Var4);
                            fetVar2.r(false);
                        } else if (opeVar instanceof jpe) {
                            fetVar2.e0(2094172495);
                            jpe jpeVar2 = (jpe) opeVar;
                            y(kbc.X(tpeVar), jpeVar2.d, jpeVar2.f16895a, jpeVar2.b, jpeVar2.c, opeVar, mm40Var4, fetVar, (i3 << 15) & 33030144);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else if (opeVar instanceof kpe) {
                            fetVar2.e0(2094659102);
                            kpe kpeVar2 = (kpe) opeVar;
                            long j5 = kpeVar2.f18670a;
                            long j6 = kpeVar2.b;
                            int i9 = (i3 >> 6) & 14;
                            int i10 = i3 << 3;
                            z(mm40Var4, tpeVar, opeVar, j5, j6, fetVar2, (i10 & 896) | i9 | (i10 & 112));
                            fetVar2.r(false);
                        } else if (opeVar instanceof lpe) {
                            fetVar2.e0(2094987454);
                            lpe lpeVar2 = (lpe) opeVar;
                            long j7 = lpeVar2.b;
                            long j8 = lpeVar2.c;
                            int i11 = (i3 >> 6) & 14;
                            int i12 = i3 << 3;
                            z(mm40Var4, tpeVar, opeVar, j7, j8, fetVar2, i11 | (i12 & 112) | (i12 & 896));
                            fetVar2.r(false);
                        } else {
                            if (!(opeVar instanceof mpe)) {
                                throw b1j.f(-348128666, fetVar2, false);
                            }
                            fetVar2.e0(2095300182);
                            A(tpeVar, opeVar, mm40Var4, fetVar2, i3 & 1022);
                            fetVar2.r(false);
                        }
                        mm40Var3 = mm40Var4;
                    }
                }
                yfe0VarU.d = function2;
            }
            fetVar2.X();
            mm40Var3 = mm40Var2;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final byte b3 = 1;
                function2 = new Function2() { // from class: a.k0m
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b3) {
                            case 0:
                                ((Integer) obj2).getClass();
                                tdc.e(tpeVar, opeVar, mm40Var3, (fet) obj, x8x.L(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                tdc.e(tpeVar, opeVar, mm40Var3, (fet) obj, x8x.L(i | 1), i2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0VarU.d = function2;
            }
        }
        i3 |= 384;
        mm40Var2 = mm40Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            if (i4 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (tpeVar instanceof rpe) {
                if (((rpe) tpeVar).f30883a >= 1) {
                    if (opeVar instanceof gpe) {
                        fetVar2.e0(2092909679);
                        gpe gpeVar3 = (gpe) opeVar;
                        v(kbc.X(tpeVar), gpeVar3.f11678a, gpeVar3, mm40Var4, fetVar2, (i3 << 6) & 64512);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    } else if (opeVar instanceof hpe) {
                        fetVar2.e0(2093230095);
                        hpe hpeVar3 = (hpe) opeVar;
                        v(kbc.X(tpeVar), hpeVar3.f13438a, hpeVar3, mm40Var4, fetVar2, (i3 << 6) & 64512);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    } else if (opeVar instanceof npe) {
                        fetVar2.e0(2093535941);
                        C(kbc.X(tpeVar), i3 & 1008, opeVar, fetVar2, mm40Var4);
                        fetVar2.r(false);
                    } else if (opeVar instanceof fpe) {
                        fetVar2.e0(2093748663);
                        a(tpeVar, opeVar, mm40Var4, fetVar2, i3 & 1022);
                        fetVar2.r(false);
                    } else if (opeVar instanceof ipe) {
                        fetVar2.e0(2093946691);
                        x(kbc.X(tpeVar), i3 & 1008, opeVar, fetVar2, mm40Var4);
                        fetVar2.r(false);
                    } else if (opeVar instanceof jpe) {
                        fetVar2.e0(2094172495);
                        jpe jpeVar3 = (jpe) opeVar;
                        y(kbc.X(tpeVar), jpeVar3.d, jpeVar3.f16895a, jpeVar3.b, jpeVar3.c, opeVar, mm40Var4, fetVar, (i3 << 15) & 33030144);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else if (opeVar instanceof kpe) {
                        fetVar2.e0(2094659102);
                        kpe kpeVar3 = (kpe) opeVar;
                        long j9 = kpeVar3.f18670a;
                        long j10 = kpeVar3.b;
                        int i13 = (i3 >> 6) & 14;
                        int i14 = i3 << 3;
                        z(mm40Var4, tpeVar, opeVar, j9, j10, fetVar2, (i14 & 896) | i13 | (i14 & 112));
                        fetVar2.r(false);
                    } else if (opeVar instanceof lpe) {
                        fetVar2.e0(2094987454);
                        lpe lpeVar3 = (lpe) opeVar;
                        long j11 = lpeVar3.b;
                        long j12 = lpeVar3.c;
                        int i15 = (i3 >> 6) & 14;
                        int i16 = i3 << 3;
                        z(mm40Var4, tpeVar, opeVar, j11, j12, fetVar2, i15 | (i16 & 112) | (i16 & 896));
                        fetVar2.r(false);
                    } else {
                        if (!(opeVar instanceof mpe)) {
                            throw b1j.f(-348128666, fetVar2, false);
                        }
                        fetVar2.e0(2095300182);
                        A(tpeVar, opeVar, mm40Var4, fetVar2, i3 & 1022);
                        fetVar2.r(false);
                    }
                    mm40Var3 = mm40Var4;
                } else {
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        return;
                    }
                    final byte b4 = 0;
                    final mm40 mm40Var7 = mm40Var4;
                    function2 = new Function2() { // from class: a.k0m
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    tdc.e(tpeVar, opeVar, mm40Var7, (fet) obj, x8x.L(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    tdc.e(tpeVar, opeVar, mm40Var7, (fet) obj, x8x.L(i | 1), i2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                if (tpeVar instanceof spe) {
                    t9f.b();
                    return;
                }
                speVar = (spe) tpeVar;
                if (speVar.f32589a >= 0) {
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    return;
                }
                final byte b5 = 0;
                final mm40 mm40Var8 = mm40Var4;
                function2 = new Function2() { // from class: a.k0m
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b5) {
                            case 0:
                                ((Integer) obj2).getClass();
                                tdc.e(tpeVar, opeVar, mm40Var8, (fet) obj, x8x.L(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                tdc.e(tpeVar, opeVar, mm40Var8, (fet) obj, x8x.L(i | 1), i2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            }
            yfe0VarU.d = function2;
        }
        fetVar2.X();
        mm40Var3 = mm40Var2;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b6 = 1;
            function2 = new Function2() { // from class: a.k0m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            tdc.e(tpeVar, opeVar, mm40Var3, (fet) obj, x8x.L(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            tdc.e(tpeVar, opeVar, mm40Var3, (fet) obj, x8x.L(i | 1), i2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final String e0(dyo dyoVar, ctf0 ctf0Var) {
        int iOrdinal = dyoVar.ordinal();
        if (iOrdinal == 0) {
            return "";
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.passwords_not_be_same, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 2) {
            return ctf0Var.b.a(R.string.password_requirements_not_satisfied, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 3) {
            return ctf0Var.b.a(R.string.short_password, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 4) {
            return ctf0Var.b.a(R.string.password_not_match_error, Arrays.copyOf(new Object[0], 0));
        }
        t9f.b();
        return null;
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        int i3;
        fetVar.g0(-11508518);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(false) ? 32 : 16;
        }
        int i4 = i2;
        if ((i & 384) == 0) {
            i3 = (fetVar.g("LIVE") ? 256 : 128) | i4;
        } else {
            i3 = i4;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(1542855013);
            j6n.h("LIVE", oro0.f25744a, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0, 0, fetVar, ((i3 >> 6) & 14) | 48, 24);
            fetVar.r(false);
            fetVar.e0(1543207204);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x039a  */
    /* JADX WARN: Code duplicated, block: B:263:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:265:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:269:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:270:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:275:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:277:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:280:0x03e1 A[LOOP:2: B:278:0x03db->B:280:0x03e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:283:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:289:0x0404  */
    /* JADX WARN: Code duplicated, block: B:292:0x040a  */
    /* JADX WARN: Code duplicated, block: B:293:0x040f  */
    /* JADX WARN: Code duplicated, block: B:296:0x041e  */
    /* JADX WARN: Code duplicated, block: B:297:0x0421  */
    /* JADX WARN: Code duplicated, block: B:300:0x0427  */
    /* JADX WARN: Code duplicated, block: B:302:0x0435  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v38, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r84v0, types: [java.util.List] */
    public static final kzv f0(n97 n97Var) {
        double dDoubleValue;
        lb90 lb90Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        String str;
        double dDoubleValue2;
        double d;
        double dDoubleValue3;
        nob0 nob0Var;
        tqt tqtVar;
        int iIntValue;
        Double d2;
        double dDoubleValue4;
        double dDoubleValue5;
        Boolean bool;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        ?? arrayList;
        double dDoubleValue6;
        Integer num;
        int iIntValue2;
        String str2;
        String str3;
        String str4;
        String str5;
        Double d3;
        Iterator it;
        Boolean bool2;
        wgo wgoVar;
        Long l;
        Integer num2;
        wgo wgoVar2;
        wgo wgoVar3;
        Long l2;
        asn asnVar;
        int i2;
        int i3;
        Double d4;
        wgo wgoVar4;
        Long l3;
        n97Var.getClass();
        Integer num3 = n97Var.A;
        Double d5 = n97Var.M;
        Double d6 = n97Var.P;
        Double d7 = n97Var.O;
        Double d8 = n97Var.F;
        Double d9 = n97Var.h;
        Integer num4 = n97Var.i;
        Double d10 = n97Var.L;
        ivg0 ivg0Var = n97Var.r;
        List list = n97Var.p;
        i0w i0wVarM = kkb.M(num3 != null ? num3.intValue() : 0);
        nwd nwdVar = q4f.f28094a;
        int iIntValue3 = num4 != null ? num4.intValue() : 0;
        nwdVar.getClass();
        q4f q4fVarA = nwd.a(iIntValue3);
        Long l4 = n97Var.f23125a;
        String strValueOf = l4 != null ? String.valueOf(l4.longValue()) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        long jLongValue = (list == null || (wgoVar4 = (wgo) CollectionsKt.firstOrNull(list)) == null || (l3 = wgoVar4.e) == null) ? 0L : l3.longValue();
        Double d11 = n97Var.b;
        double dDoubleValue7 = d11 != null ? d11.doubleValue() : 0.0d;
        String strR = ieb.R(n97Var, q4fVarA);
        String str6 = n97Var.e;
        String str7 = str6 == null ? "" : str6;
        String str8 = n97Var.f;
        String str9 = str8 == null ? "" : str8;
        Long l5 = n97Var.g;
        long jLongValue2 = l5 != null ? l5.longValue() : 0L;
        double dDoubleValue8 = d10 != null ? d10.doubleValue() : 0.0d;
        double dDoubleValue9 = (ivg0Var == null || (d4 = ivg0Var.g) == null) ? 0.0d : d4.doubleValue();
        double dDoubleValue10 = d9 != null ? d9.doubleValue() : 0.0d;
        if (i0wVarM == i0w.d) {
            Double d12 = n97Var.B;
            if (d12 != null) {
                dDoubleValue = d12.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
        } else if (d8 != null) {
            dDoubleValue = d8.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        lb90 lb90VarW = uvw.W(n97Var.G);
        Double d13 = n97Var.H;
        double dDoubleValue11 = d13 != null ? d13.doubleValue() : 0.0d;
        double dDoubleValue12 = d8 != null ? d8.doubleValue() : 0.0d;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    lb90Var = lb90VarW;
                    z = false;
                    break;
                }
                lb90Var = lb90VarW;
                if (Intrinsics.d(((wgo) it2.next()).M, Boolean.TRUE)) {
                    z = true;
                    break;
                }
                lb90VarW = lb90Var;
            }
        } else {
            lb90Var = lb90VarW;
            z = false;
            break;
        }
        long jLongValue3 = 0;
        double d14 = dDoubleValue7;
        double d15 = dDoubleValue10;
        double d16 = dDoubleValue;
        double d17 = dDoubleValue11;
        double dJ = dtb.J(n97Var);
        Boolean bool3 = n97Var.E;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        double dDoubleValue13 = 0.0d;
        double d18 = dDoubleValue8;
        double d19 = dDoubleValue9;
        double d20 = dDoubleValue12;
        int iQ = acb.Q(n97Var);
        int size = list != null ? list.size() : 0;
        if (list != null) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it3 = list.iterator();
                i = 0;
                while (it3.hasNext()) {
                    boolean z4 = z;
                    Enum r1 = ((wgo) it3.next()).z;
                    if (r1 == null) {
                        r1 = rvn.NONE;
                    }
                    boolean z5 = zBooleanValue3;
                    if (r1 != rvn.NONE && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                    zBooleanValue3 = z5;
                    z = z4;
                }
            }
            z2 = z;
            z3 = zBooleanValue3;
        } else {
            z2 = z;
            z3 = zBooleanValue3;
            i = 0;
        }
        int iA = q4f.d.a();
        if (num4 != null && num4.intValue() == iA) {
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue4 = numValueOf.intValue();
                if (list != null) {
                    if (list.isEmpty()) {
                        i3 = 0;
                    } else {
                        Iterator it4 = list.iterator();
                        i3 = 0;
                        while (it4.hasNext()) {
                            int i4 = iIntValue4;
                            Long l6 = ((wgo) it4.next()).h;
                            if (l6 != null && l6.longValue() == 1 && (i3 = i3 + 1) < 0) {
                                q3d.o();
                                throw null;
                            }
                            iIntValue4 = i4;
                        }
                    }
                    i2 = iIntValue4;
                } else {
                    i2 = iIntValue4;
                    i3 = 0;
                }
                i = i2 - i3;
            } else {
                i = 0;
            }
        }
        double dDoubleValue14 = d7 != null ? d7.doubleValue() : -1.0d;
        boolean z6 = d6 != null && d6.doubleValue() > 0.0d;
        if (d6 != null) {
            dDoubleValue13 = d6.doubleValue();
        }
        boolean z7 = Intrinsics.c(d5, dDoubleValue13) || Intrinsics.c(d7, 0.0d);
        if (list == null || list.size() != 1 || (str = ((wgo) CollectionsKt.U(list)).g) == null) {
            str = r5;
        }
        String str10 = n97Var.j;
        if (str10 == null) {
            str10 = "";
        }
        String strConcat = str10.concat(lgb.X(q4fVarA, String.valueOf(n97Var.I)));
        if (d9 != 0) {
            dDoubleValue2 = d9.doubleValue() - (d10 != null ? d10.doubleValue() : 0.0d);
        } else {
            dDoubleValue2 = 0.0d;
        }
        Boolean bool4 = n97Var.z;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        if (d10 != null) {
            d = 0.0d;
            dDoubleValue3 = d10.doubleValue();
        } else {
            d = 0.0d;
            dDoubleValue3 = 0.0d;
        }
        String str11 = n97Var.y;
        if (str11 == null) {
            str11 = r5;
        }
        Boolean bool5 = n97Var.k;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        boolean z8 = z6;
        Double d21 = n97Var.K;
        double dDoubleValue15 = d21 != null ? d21.doubleValue() : d;
        Boolean bool6 = n97Var.s;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = n97Var.t;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        Double d22 = n97Var.C;
        double dDoubleValue16 = d22 != null ? d22.doubleValue() : d;
        Boolean bool8 = n97Var.u;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
        Double d23 = n97Var.Q;
        double dDoubleValue17 = d23 != null ? d23.doubleValue() : d;
        pxu pxuVar = n97Var.q;
        hxu hxuVarN0 = pxuVar != null ? dyb.n0(pxuVar) : hxu.h;
        if (ivg0Var == null || (asnVar = ivg0Var.b) == null) {
            iun iunVar = iun.f15405a;
            nob0Var = new nob0(-1, 0.0d, 0.0d, iunVar, iunVar);
        } else {
            nob0Var = qxw.V(asnVar);
        }
        long jLongValue4 = (list == null || (wgoVar3 = (wgo) CollectionsKt.firstOrNull(list)) == null || (l2 = wgoVar3.f39126a) == null) ? jLongValue3 : l2.longValue();
        String str12 = (list == null || (wgoVar2 = (wgo) CollectionsKt.firstOrNull(list)) == null) ? null : wgoVar2.b;
        String str13 = str12 == null ? r5 : str12;
        tqt tqtVar2 = uoy.b;
        if (list != null) {
            tqtVar = tqtVar2;
            wgo wgoVar5 = (wgo) CollectionsKt.firstOrNull(list);
            if (wgoVar5 != null && (num2 = wgoVar5.u) != null) {
                iIntValue = num2.intValue();
            }
            tqtVar.getClass();
            uoy uoyVarJ = tqt.j(iIntValue);
            if (list != null && (wgoVar = (wgo) CollectionsKt.firstOrNull(list)) != null && (l = wgoVar.G) != null) {
                jLongValue3 = l.longValue();
            }
            long j = jLongValue3;
            d2 = n97Var.N;
            if (d2 != null) {
                dDoubleValue4 = d2.doubleValue();
            } else {
                dDoubleValue4 = d;
            }
            if (d5 != null) {
                dDoubleValue5 = d5.doubleValue();
            } else {
                dDoubleValue5 = d;
            }
            bool = n97Var.J;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (ivg0Var != null || (bool2 = ivg0Var.d) == null) {
                zBooleanValue2 = false;
            } else {
                zBooleanValue2 = bool2.booleanValue();
            }
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(acb.b0((wgo) it.next()));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            ?? r84 = arrayList;
            if (ivg0Var != null || (d3 = ivg0Var.h) == null) {
                dDoubleValue6 = d;
            } else {
                dDoubleValue6 = d3.doubleValue();
            }
            num = n97Var.l;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = -1;
            }
            azv azvVarF = hkb.F(iIntValue2);
            ozc ozcVarP0 = rcb.p0(n97Var.m, q4fVarA);
            str2 = n97Var.n;
            if (str2 == null) {
                str3 = r5;
            } else {
                str3 = str2;
            }
            str4 = n97Var.o;
            if (str4 == null) {
                str5 = r5;
            } else {
                str5 = str4;
            }
            return new kzv(strValueOf, q4fVarA, d16, jLongValue2, d14, d15, i0wVarM, jLongValue, strR, d18, str7, str9, d19, lb90Var, d20, d17, z2, dJ, z3, iQ, size, i, dDoubleValue14, z8, dDoubleValue13, z7, str, strConcat, dDoubleValue2, zBooleanValue4, dDoubleValue3, str11, zBooleanValue5, zBooleanValue6, zBooleanValue7, false, zBooleanValue8, dDoubleValue16, dDoubleValue15, dDoubleValue17, hxuVarN0, nob0Var, jLongValue4, str13, uoyVarJ, j, dDoubleValue4, dDoubleValue5, zBooleanValue, zBooleanValue2, r84, azvVarF, ozcVarP0, str3, dDoubleValue6, str5);
        }
        tqtVar = tqtVar2;
        iIntValue = 0;
        tqtVar.getClass();
        uoy uoyVarJ2 = tqt.j(iIntValue);
        if (list != null) {
            jLongValue3 = l.longValue();
        }
        long j2 = jLongValue3;
        d2 = n97Var.N;
        if (d2 != null) {
            dDoubleValue4 = d2.doubleValue();
        } else {
            dDoubleValue4 = d;
        }
        if (d5 != null) {
            dDoubleValue5 = d5.doubleValue();
        } else {
            dDoubleValue5 = d;
        }
        bool = n97Var.J;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (ivg0Var != null) {
            zBooleanValue2 = false;
        } else {
            zBooleanValue2 = false;
        }
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(acb.b0((wgo) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r85 = arrayList;
        if (ivg0Var != null) {
            dDoubleValue6 = d;
        } else {
            dDoubleValue6 = d;
        }
        num = n97Var.l;
        if (num != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = -1;
        }
        azv azvVarF2 = hkb.F(iIntValue2);
        ozc ozcVarP1 = rcb.p0(n97Var.m, q4fVarA);
        str2 = n97Var.n;
        if (str2 == null) {
            str3 = r5;
        } else {
            str3 = str2;
        }
        str4 = n97Var.o;
        if (str4 == null) {
            str5 = r5;
        } else {
            str5 = str4;
        }
        return new kzv(strValueOf, q4fVarA, d16, jLongValue2, d14, d15, i0wVarM, jLongValue, strR, d18, str7, str9, d19, lb90Var, d20, d17, z2, dJ, z3, iQ, size, i, dDoubleValue14, z8, dDoubleValue13, z7, str, strConcat, dDoubleValue2, zBooleanValue4, dDoubleValue3, str11, zBooleanValue5, zBooleanValue6, zBooleanValue7, false, zBooleanValue8, dDoubleValue16, dDoubleValue15, dDoubleValue17, hxuVarN0, nob0Var, jLongValue4, str13, uoyVarJ2, j2, dDoubleValue4, dDoubleValue5, zBooleanValue, zBooleanValue2, r85, azvVarF2, ozcVarP1, str3, dDoubleValue6, str5);
    }

    public static final void g(bls blsVar, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1556832777);
        int i2 = i | (fetVar2.g(blsVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, x7zVar);
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
            v8q0.a(blsVar.c, hne.i(1.0f, true, "GAME_LOG_DIRE_EVENT_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (blsVar.g) {
                fetVar2.e0(165680019);
                pm80 pm80VarF = a8k0.F(blsVar.e, 0, fetVar2);
                b = 2;
                mm40 mm40VarN = o7k0.n(s5x0.L(jm40.b, 4.0f, 0.0f, 2), 24.0f);
                long j = kkg.f;
                zcl zclVar = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                dww.c(pm80VarF, null, o2e.e0(s5x0.J(i120.Q(mm40VarN, j, new ugg0(zclVar, zclVar, zclVar, zclVar)), 4.0f), "GAME_LOG_DIRE_EVENT_ICON"), y3d.g, fetVar2, 3128, 0);
                fetVar2.r(false);
            } else {
                b = 2;
                fetVar2.e0(166330616);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            b = 2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new als(blsVar, i, b);
        }
    }

    public static final mpm g0(d0t d0tVar) {
        t480 t480VarF = kpb.F(d0tVar);
        rqs rqsVar = d0tVar.p;
        boolean zIsEmpty = rqsVar.d.isEmpty();
        opm opmVar = opm.f25648a;
        return (zIsEmpty || d0tVar.z) ? new lpm(opmVar, new hpm(0L, 3)) : new kpm(opmVar, new hpm(0L, 3), d5c.O(t480VarF.f33307a, t480VarF.b, rqsVar.r, rqsVar.s, new hpm(0L, 3)));
    }

    public static final void h(zql zqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1210250852);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zqlVar) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (zqlVar instanceof wql) {
            fetVar.e0(885075959);
            j120.o(jm40Var, (wql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (zqlVar instanceof xql) {
            fetVar.e0(885080188);
            j120.p(jm40Var, (xql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!(zqlVar instanceof yql)) {
                throw b1j.f(885073768, fetVar, false);
            }
            fetVar.e0(885084473);
            vcc.f(jm40Var, (yql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pql(zqlVar, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static final boolean h0(mxp mxpVar, mxp mxpVar2) {
        boolean z;
        fyp fypVar = mxpVar.M;
        byp bypVar = fypVar.f10370a;
        fyp fypVar2 = mxpVar2.M;
        if (X(bypVar, fypVar2.f10370a) && X(fypVar.c, fypVar2.c) && X(fypVar.b, fypVar2.b)) {
            int i = mxpVar.I;
            int i2 = mxpVar2.I;
            if ((i == -1 || i2 == -1 || (i == 0 && i2 == 0)) && Y(mxpVar.F, mxpVar2.F)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return !z;
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(451546151);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), 172.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), fqj0VarD0));
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 108.0f), 1.0f);
            zcl zclVar3 = qmk.i;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 19);
        }
    }

    public static final void j(mm40 mm40Var, adm admVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        xdrVar.getClass();
        fetVar.g0(457416870);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(admVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (admVar instanceof ycm) {
            fetVar.e0(1490955227);
            b(mm40Var, (ycm) admVar, xdrVar, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!admVar.equals(zcm.f44174a)) {
                throw b1j.f(1490953184, fetVar, false);
            }
            fetVar.e0(1490960587);
            vic.f(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) admVar, (Object) xdrVar, i, (byte) 15);
        }
    }

    public static final void k(mm40 mm40Var, l0l0 l0l0Var, fet fetVar, int i) {
        int i2;
        l0l0Var.getClass();
        fetVar.g0(-579005984);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l0l0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, o2e.e0(xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), l0l0Var.a()), vgg0.a(l0l0Var.b())), vbc.d0(null, fetVar, 0, 1)), "SPORT_BASIC_EVENT_CARD_SHIMMER"));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) l0l0Var, i, (byte) 28);
        }
    }

    public static final void l(mm40 mm40Var, cym cymVar, fet fetVar, int i) {
        int i2;
        String str = cymVar.b;
        wxm wxmVar = cymVar.c;
        fetVar.g0(-749696337);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 94.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            u(0, fetVar, null, cymVar.f5184a);
            if ((wxmVar instanceof uxm) || (wxmVar instanceof vxm) || str.length() > 0) {
                fetVar.e0(-2011478989);
                t(null, wxmVar, str, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-2011346371);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 15, i, mm40Var, cymVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x0112  */
    public static final void m(mm40 mm40Var, a4x a4xVar, v3n v3nVar, boolean z, xcz xczVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        xcz xczVar2;
        mm40 mm40Var2;
        xcz xczVar3;
        mm40 mm40Var3;
        xcz xczVarA;
        xcz xczVar4;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        function1.getClass();
        fetVar2.g0(1698299945);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.g(v3nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                xczVar2 = xczVar;
                int i5 = fetVar2.g(xczVar2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                xczVar2 = xczVar;
            }
            i3 |= i5;
        } else {
            xczVar2 = xczVar;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar2.Z();
            if ((i & 1) == 0 || fetVar2.B()) {
                if (i4 != 0) {
                    mm40Var = jm40.b;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    mm40Var3 = mm40Var;
                    xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                }
                fetVar2.s();
                if (v3nVar instanceof u3n) {
                    fetVar2.e0(-660661210);
                    B(mm40Var3, a4xVar, (u3n) v3nVar, z, xczVarA, function1, fetVar2, i3 & 524286);
                    xczVar4 = xczVarA;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    xczVar4 = xczVarA;
                    if (v3nVar instanceof r3n) {
                        throw b1j.f(-21314069, fetVar2, false);
                    }
                    fetVar2.e0(-21298885);
                    int i6 = i3 >> 3;
                    r(mm40Var3, a4xVar, (r3n) v3nVar, xczVar4, function1, fetVar2, (i3 & 1022) | (i6 & 7168) | (i6 & 57344));
                    fetVar2.r(false);
                }
                mm40Var2 = mm40Var3;
                xczVar3 = xczVar4;
            } else {
                fetVar2.X();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            }
            xczVarA = xczVar2;
            mm40Var3 = mm40Var;
            fetVar2.s();
            if (v3nVar instanceof u3n) {
                fetVar2.e0(-660661210);
                B(mm40Var3, a4xVar, (u3n) v3nVar, z, xczVarA, function1, fetVar2, i3 & 524286);
                xczVar4 = xczVarA;
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                xczVar4 = xczVarA;
                if (v3nVar instanceof r3n) {
                    throw b1j.f(-21314069, fetVar2, false);
                }
                fetVar2.e0(-21298885);
                int i7 = i3 >> 3;
                r(mm40Var3, a4xVar, (r3n) v3nVar, xczVar4, function1, fetVar2, (i3 & 1022) | (i7 & 7168) | (i7 & 57344));
                fetVar2.r(false);
            }
            mm40Var2 = mm40Var3;
            xczVar3 = xczVar4;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
            xczVar3 = xczVar2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltl(mm40Var2, a4xVar, v3nVar, z, xczVar3, function1, i, i2, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, rse rseVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(967952875);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(rseVar.ordinal()) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 16.0f, 0.0f, 2);
            int iOrdinal = rseVar.ordinal();
            if (iOrdinal == 0) {
                fetVar2 = fetVar;
                fetVar2.e0(-126047992);
                qxw.o(fetVar2, o7k0.e(mm40VarL, 8.0f));
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                fetVar2 = fetVar;
                fetVar2.e0(-125900525);
                mbc.o(agi0.f827a, mm40VarL, true, fetVar2, 390, 0);
                fetVar2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-1805183371, fetVar, false);
                }
                fetVar.e0(-125683153);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new mmn(b);
                    fetVar.o0(objP);
                }
                fetVar2 = fetVar;
                dwi0.b((Function1) objP, mm40VarL, null, fetVar2, 6, 4);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 22, i, mm40Var, rseVar);
        }
    }

    public static final void o(ifg0 ifg0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1381996440);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ifg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            byte b = 14;
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (objP == obj) {
                hfg0 hfg0Var = new hfg0();
                hfg0Var.d.b(new gbn(new vtf0(b), new o5c0(3, (byte) 21), new wtf0((byte) 16), x4c0.x));
                fetVar.o0(hfg0Var);
                obj2 = hfg0Var;
            }
            Object obj3 = (hfg0) obj2;
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = z5o.f43826a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(obj3) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new qzn(obj3, ifg0Var, (byte) 11);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, mm40Var, (Function1) objP3, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(ifg0Var, i, (byte) 18);
        }
    }

    public static final void p(qy6 qy6Var, fet fetVar, int i) {
        int i2;
        qy6Var.getClass();
        fetVar.g0(-1727507955);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qy6Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hew0.b((i2 & 14) | 3504, u1c.M(1149674463, new j9q(qy6Var, b), fetVar), null, null, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(qy6Var, i);
        }
    }

    public static final void q(bls blsVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        blsVar.getClass();
        fetVar2.g0(-430580073);
        int i2 = i | (fetVar2.g(blsVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 32.0f), 1.0f);
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
            int i3 = (i2 & 14) | 48;
            g(blsVar, fetVar2, i3);
            v8q0.a(blsVar.f2808a, o2e.e0(o7k0.s(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 24.0f), "GAME_LOG_EVENT_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            w(blsVar, fetVar2, i3);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new als(blsVar, i, (byte) 0);
        }
    }

    public static final void r(mm40 mm40Var, a4x a4xVar, r3n r3nVar, xcz xczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1702586999);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(r3nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 184.0f);
            yx7 yx7Var = gqw0.k;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f8m(a4xVar, r3nVar, function1, b);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, xczVar, null, false, null, yx7Var, null, false, null, (Function1) objP, fetVar, ((i2 >> 6) & 112) | 196608, 476);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) a4xVar, (Object) r3nVar, (Object) xczVar, (Object) function1, i, (byte) 26);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-1895363669);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            xx7 xx7Var = gqw0.n;
            nw3 nw3Var = uc9.e;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.k, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVar, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarN, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 109560);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str2, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            jcb.v(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0.0f, staticColors.m126getWhite200d7_KjU(), fetVar2, 0, 2);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 8);
        }
    }

    public static final void t(mm40 mm40Var, wxm wxmVar, String str, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(236012695);
        int i2 = i | 6 | (fetVar2.g(wxmVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 40.0f), 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            if (wxmVar instanceof uxm) {
                fetVar2.e0(161745132);
                uxm uxmVar = (uxm) wxmVar;
                fgm fgmVar = fgm.b;
                boolean zF = fetVar2.f(uxmVar.f36447a) | fetVar2.e(2) | fetVar2.h(true);
                Object objP = fetVar2.P();
                if (zF || objP == ukd.f35823a) {
                    objP = new c8n(nsm0.y(fgmVar), new w7n(new a8n(), acb.W(uxmVar), true, 0, false, null, 56));
                    fetVar2.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar2, 5);
                fetVar2.r(false);
            } else if (wxmVar instanceof vxm) {
                fetVar2.e0(162411942);
                j6n.h("VAR", oro0.f25744a, null, 0, 0, fetVar2, 54, 28);
                fetVar2.r(false);
            } else {
                if (!wxmVar.equals(txm.f34707a)) {
                    throw b1j.f(1252141202, fetVar2, false);
                }
                fetVar2.e0(1252172657);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(162722469);
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                z = true;
                jm40Var = jm40Var2;
                v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, wxmVar instanceof txm ? 2 : 1, 0, null, g1t0.g(), fetVar, (i2 >> 6) & 14, 384, 109562);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                jm40Var = jm40Var2;
                fetVar2.e0(163086037);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, wxmVar, str, i, (byte) 16);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(2017172112);
        int i2 = i | 6 | (fetVar2.g(null) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 14.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, 1465726650, false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            nrq nrqVar = g1t0.m().f42262a.f;
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, textPrimary, new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, nrqVar, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarM, fetVar2, (i2 >> 6) & 14, 24960, 109426);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 21);
        }
    }

    public static final void v(int i, long j, ope opeVar, mm40 mm40Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(468666700);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(mm40Var) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            long jK = K(opeVar, fetVar);
            long jR = R(opeVar, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 18.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(s5x0.J(mm40VarN.e(i120.S(jm40Var, 2.0f, j, ugg0Var)), 2.0f), jK, ugg0Var);
            boolean zF = fetVar.f(jK);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 22, jK);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(pai0.a(mm40VarQ, false, (Function1) objP), "PRIMARY_BOX_COUNTER");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            v8q0.a(L(i, opeVar), o2e.e0(jm40Var, "PRIMARY_COUNTER_TEXT"), jR, null, 0L, null, null, null, 0L, new f2q0(1), 0L, 0, false, 0, 0, null, J(new y9q0(0L, qmk.o, null, j1t0.f15753a, 0L, null, 0, 0, qmk.B, 16646109)), fetVar, 48, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0m(i, j, opeVar, mm40Var, i2);
        }
    }

    public static final void w(bls blsVar, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(694550632);
        int i2 = i | (fetVar2.g(blsVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, x7zVar);
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
            if (blsVar.f) {
                fetVar2.e0(231831312);
                pm80 pm80VarF = a8k0.F(blsVar.d, 0, fetVar2);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(s5x0.L(jm40.b, 4.0f, 0.0f, 2), 24.0f);
                long j = kkg.f;
                zcl zclVar2 = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                dww.c(pm80VarF, null, o2e.e0(s5x0.J(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), "GAME_LOG_RADIANT_EVENT_ICON"), y3d.g, fetVar2, 3128, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(232487675);
                fetVar2.r(false);
            }
            b = 1;
            v8q0.a(blsVar.b, hne.i(1.0f, true, "GAME_LOG_RADIANT_EVENT_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new als(blsVar, i, b);
        }
    }

    public static final void x(int i, int i2, ope opeVar, fet fetVar, mm40 mm40Var) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1360753926);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(opeVar) : fetVar2.i(opeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            j0x.b(a8k0.F(R.drawable.ic_game_red_card, 0, fetVar2), null, null, null, null, 0.0f, null, fetVar2, 56, 124);
            v8q0.a(L(i, opeVar), null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, J(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109)), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0m(i, opeVar, mm40Var, i2, (byte) 1);
        }
    }

    public static final void y(final int i, final String str, final long j, final long j2, final long j3, final ope opeVar, final mm40 mm40Var, fet fetVar, final int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-744714940);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.f(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(true) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            mm40Var2 = mm40Var;
            i3 |= fetVar.g(mm40Var2) ? 8388608 : 4194304;
        } else {
            mm40Var2 = mm40Var;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1245753860, new n0m(mm40Var2, j3, j2, i, opeVar, j, str), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.o0m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tdc.y(i, str, j, j2, j3, opeVar, mm40Var, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void z(mm40 mm40Var, tpe tpeVar, ope opeVar, long j, long j2, fet fetVar, int i) {
        int i2;
        long j3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2127993249);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(tpeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(opeVar) : fetVar2.i(opeVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j3 = j2;
            i2 |= fetVar2.f(j3) ? 16384 : 8192;
        } else {
            j3 = j2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(i120.Q(lgb.J(o7k0.u(o7k0.e(mm40Var, 24.0f), 24.0f, 0.0f, 2), vgg0.f37379a), j, jd8.n), 6.0f, 0.0f, 2), "SECONDARY_COUNTER");
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new xjl((byte) 15);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            jm40 jm40Var = jm40.b;
            int i3 = i2 >> 3;
            v8q0.a(M(tpeVar, opeVar, fetVar2, i3 & 126), o2e.e0(jm40Var, "SECONDARY_COUNTER_TEXT"), j3, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, J(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109)), fetVar, ((i2 >> 6) & 896) | 48, 0, 131064);
            fetVar2 = fetVar;
            if (opeVar instanceof lpe) {
                fetVar2.e0(-1611001193);
                dww.c(a8k0.F(((lpe) opeVar).f20436a ? R.drawable.ic_glyph_chevron_up_small : R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), j2, fetVar2, 56 | (i3 & 7168), 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1610562977);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p0m(mm40Var, tpeVar, opeVar, j, j2, i);
        }
    }
}
