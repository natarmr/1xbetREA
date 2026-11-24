package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewParent;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k7x {
    public static qzb A(int i) {
        if (i != 0) {
            return i != 1 ? new wgg0() : new uzf();
        }
        return new wgg0();
    }

    public static final long B(xk80 xk80Var) {
        return si30.c(xk80Var.l() * xk80Var.p()) + (((long) xk80Var.k()) * ((long) xk80Var.p()));
    }

    public static final j6z C(j6z j6zVar) {
        j6z j6zVar2;
        j6z j6zVarU = j6zVar.U();
        while (true) {
            j6z j6zVar3 = j6zVarU;
            j6zVar2 = j6zVar;
            j6zVar = j6zVar3;
            if (j6zVar == null) {
                break;
            }
            j6zVarU = j6zVar.U();
        }
        s460 s460Var = j6zVar2 instanceof s460 ? (s460) j6zVar2 : null;
        if (s460Var == null) {
            return j6zVar2;
        }
        s460 s460Var2 = s460Var.w;
        while (true) {
            s460 s460Var3 = s460Var2;
            s460 s460Var4 = s460Var;
            s460Var = s460Var3;
            if (s460Var == null) {
                return s460Var4;
            }
            s460Var2 = s460Var.w;
        }
    }

    public static final String D(int i, String str, String str2, List list, boolean z) {
        str.getClass();
        list.getClass();
        if (z && str2.length() > 0) {
            str = kng0.l(str, ". ", str2);
        } else if (list.contains(Integer.valueOf(i)) && str2.length() > 0) {
            str = kng0.l(str, ", ", str2);
        }
        String string = StringsKt.u0(str).toString();
        int iY = StringsKt.Y(0, string, 6, Separators.SP);
        if (iY == -1) {
            return string;
        }
        int i2 = iY + 1;
        return string.substring(i2).length() <= 2 ? new StringBuilder(string).replace(iY, i2, " ").toString() : string;
    }

    public static final f3w E(kzv kzvVar, ctf0 ctf0Var, String str) {
        if (!kzvVar.x) {
            return null;
        }
        String strConcat = "autoSale".concat(kzvVar.f19169a);
        String strA = ctf0Var.b.a(R.string.auto_sale_order_with_colon, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w(strConcat, strA, pn40.c(kzvVar.y, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w F(kzv kzvVar, ctf0 ctf0Var, String str) {
        double d = kzvVar.L;
        double d2 = kzvVar.f;
        String strA = (d >= d2 || kzvVar.g == i0w.i) ? ctf0Var.b.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.history_bet_rate_partially_sold, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        double d3 = kzvVar.C;
        if (d3 <= 0.0d) {
            d3 = d2 - kzvVar.E;
        }
        return new f3w("", strA, pn40.c(d3, p3u0.c), str, e3w.f7156a);
    }

    public static final gbn G(Function1 function1) {
        byte b = 3;
        byte b2 = 24;
        return new gbn(new v1x(b), new pkv(b, b2), new dht(function1, b2), btv.u);
    }

    public static final jo20 H(int i, int i2, int i3, long j, String str, boolean z, long j2, int i4) {
        str.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(i));
        jo20Var.put("country", Integer.valueOf(i3));
        jo20Var.put("fcountry", Integer.valueOf(i2));
        jo20Var.put("gameId", Long.valueOf(j));
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", str);
        jo20Var.put("ref", 1);
        if (i4 > 0) {
            jo20Var.put("supportedSpecialType", Integer.valueOf(i4));
        }
        if (z && j2 > 0) {
            jo20Var.put("userId", Long.valueOf(j2));
        }
        return w6x.j(22, jo20Var, "whence");
    }

    public static final String I(h8a0 h8a0Var, ctf0 ctf0Var) {
        int i = h8a0Var.e;
        znq0 znq0Var = h8a0Var.c;
        String strConcat = "";
        if (i <= 0 && znq0Var.b() <= 0) {
            return "";
        }
        int i2 = h8a0Var.e;
        String strM = i2 <= 0 ? "" : twn.m(i2, Separators.SP);
        rdj rdjVar = rdj.f30294a;
        String strF = rdj.f(znq0Var, sdj.UNIVERSAL, null, 60);
        if (znq0Var.b() != 0 && strF.length() != 0) {
            strConcat = strM.length() == 0 ? Separators.SP.concat(strF) : kng0.l(" (", strF, Separators.RPAREN);
        }
        return ctf0Var.b.a(R.string.referee_card_age, Arrays.copyOf(new Object[]{strM, strConcat}, 2));
    }

    public static final wui0 J(int i, int i2, boolean z) {
        if (i2 == 0 && z) {
            return wui0.b;
        }
        if (i2 == 0) {
            return wui0.f39793a;
        }
        if (i == 0) {
            return wui0.b;
        }
        if (i == i2 && z) {
            return wui0.c;
        }
        return i == i2 ? wui0.d : wui0.c;
    }

    public static final f3w K(kzv kzvVar, ctf0 ctf0Var, String str) {
        e3w e3wVar;
        BigDecimal bigDecimalSubtract = new BigDecimal(String.valueOf(kzvVar.f)).subtract(new BigDecimal(String.valueOf(kzvVar.E)));
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalSubtract2 = new BigDecimal(String.valueOf(kzvVar.m)).subtract(bigDecimalSubtract);
        bigDecimalSubtract2.getClass();
        double dDoubleValue = bigDecimalSubtract2.doubleValue();
        String strO = ntb.O(str, dDoubleValue);
        if (dDoubleValue > 0.0d) {
            e3wVar = e3w.b;
        } else {
            e3wVar = dDoubleValue < 0.0d ? e3w.c : e3w.f7156a;
        }
        return new f3w("", ctf0Var.b.a(R.string.history_your_profit_new, Arrays.copyOf(new Object[0], 0)), strO, str, e3wVar);
    }

    public static final String L(kzv kzvVar, ctf0 ctf0Var, String str) {
        pn40 pn40Var = pn40.f27267a;
        String strD = pn40.d(kzvVar.m, str, p3u0.c);
        return cy7.c() ? ua80.i("\u200e", strD, Separators.SP, StringsKt.v0(ctf0Var.b.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{""}, 1))).toString()) : ctf0Var.b.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{strD}, 1));
    }

    public static final m3w M(ctf0 ctf0Var) {
        String strA = ctf0Var.b.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0));
        String strA2 = ctf0Var.b.a(R.string.accepted, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        return new m3w(strA, strA2, s6t0.b().f33626a.getPrimary());
    }

    public static final int N(trz trzVar) {
        if (trzVar == he7.BET_LIMIT_1_DAY || trzVar == q7k.DEPOSIT_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (trzVar == he7.BET_LIMIT_7_DAY || trzVar == q7k.DEPOSIT_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (trzVar == he7.BET_LIMIT_30_DAY || trzVar == q7k.DEPOSIT_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (trzVar == miq0.f21857a) {
            return R.string.limits_self_exclusion_desc;
        }
        if (trzVar == bsz.b) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final String O(oaa0 oaa0Var, ctf0 ctf0Var) {
        int iOrdinal = oaa0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.player_info_statistic, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.statistic_info_referee_card, Arrays.copyOf(new Object[0], 0));
        }
        t9f.b();
        return null;
    }

    public static final void P(cp cpVar, bex bexVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        yfu0 yfu0Var = cpVar.u;
        int iOrdinal = bexVar.ordinal();
        if (iOrdinal == 0) {
            ((usx) yfu0Var).g.setVisibility(8);
            ((usx) yfu0Var).d.setVisibility(0);
            objectAnimator2.cancel();
            objectAnimator.start();
            return;
        }
        if (iOrdinal == 1) {
            ((usx) yfu0Var).d.setVisibility(8);
            ((usx) yfu0Var).g.setVisibility(0);
            objectAnimator.cancel();
            objectAnimator2.start();
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        objectAnimator.cancel();
        objectAnimator2.cancel();
        ((usx) yfu0Var).d.setVisibility(8);
        ((usx) yfu0Var).g.setVisibility(8);
    }

    public static final boolean Q(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final boolean R(HistoryTypeModel historyTypeModel) {
        historyTypeModel.getClass();
        int iOrdinal = historyTypeModel.ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7;
    }

    public static final mm40 S(mm40 mm40Var, xcz xczVar) {
        mm40Var.getClass();
        xczVar.getClass();
        return mm40Var.e(new njy(xczVar));
    }

    public static final int T(f1e0 f1e0Var, IntRange intRange) {
        f1e0Var.getClass();
        if (intRange.isEmpty()) {
            e9d0.i(intRange, "Cannot get random in empty range: ");
            return 0;
        }
        int i = intRange.b;
        int i2 = intRange.f46068a;
        if (i < Integer.MAX_VALUE) {
            return f1e0Var.d(i2, i + 1);
        }
        return i2 > Integer.MIN_VALUE ? f1e0Var.d(i2 - 1, i) + 1 : f1e0Var.b();
    }

    public static od40 U(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            ohq.l("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    od40 od40Var = new od40();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    od40Var.d = byteBufferDuplicate;
                    od40Var.f15098a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    od40Var.b = i6;
                    od40Var.c = ((ByteBuffer) od40Var.d).getShort(i6);
                    return od40Var;
                }
            }
        }
        ohq.l("Cannot read metadata.");
        return null;
    }

    public static void V(View view, ki30 ki30Var) {
        csn csnVar = ki30Var.b.b;
        if (csnVar == null || !csnVar.f4898a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        ii30 ii30Var = ki30Var.b;
        if (ii30Var.l != elevation) {
            ii30Var.l = elevation;
            ki30Var.z();
        }
    }

    public static final pxb0 W(sxb0 sxb0Var, int i) {
        byb0 byb0Var;
        sxb0Var.getClass();
        Integer num = sxb0Var.f32969a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = sxb0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String str = sxb0Var.c;
        String str2 = str == null ? "" : str;
        Integer num3 = sxb0Var.e;
        if (num3 != null && num3.intValue() == 1) {
            byb0Var = byb0.f3409a;
        } else if (num3 != null && num3.intValue() == 2) {
            byb0Var = byb0.b;
        } else {
            byb0Var = (num3 != null && num3.intValue() == 3) ? byb0.c : byb0.d;
        }
        byb0 byb0Var2 = byb0Var;
        Double d = sxb0Var.f;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Integer num4 = sxb0Var.g;
        int iIntValue3 = num4 != null ? num4.intValue() : 0;
        String str3 = sxb0Var.d;
        return new pxb0(axq.g(), iIntValue, iIntValue2, str2, byb0Var2, dDoubleValue, i, str3 == null ? "" : str3, iIntValue3);
    }

    public static final chl0 X(gao gaoVar, String str) {
        k0d k0dVar;
        String str2 = gaoVar != null ? gaoVar.f : null;
        if (str2 == null) {
            str2 = "";
        }
        if (gaoVar == null) {
            k0dVar = k0d.f17460a;
        } else if (gaoVar.e) {
            k0dVar = k0d.b;
        } else {
            fao faoVar = gaoVar.k;
            if (faoVar == fao.b) {
                k0dVar = k0d.c;
            } else {
                k0dVar = faoVar == fao.c ? k0d.d : k0d.f17460a;
            }
        }
        return new chl0(str, str2, k0dVar, a65.f301a, false, false, false, false, new xgl0(0L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false));
    }

    public static final void a(Object obj, String str, mm40 mm40Var, qge qgeVar, a4d a4dVar, fet fetVar, int i, int i2) {
        zx7 zx7Var = gqw0.b;
        if ((i2 & 32) != 0) {
            zx7Var = gqw0.e;
        }
        zx7 zx7Var2 = zx7Var;
        qge qgeVar2 = (i2 & 64) != 0 ? gqw0.B : qgeVar;
        a4d a4dVar2 = (i2 & 256) != 0 ? null : a4dVar;
        int i3 = i << 3;
        int i4 = (i & 126) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        dj8.e(new qz3(obj, (fz3) fetVar.k(dr00.f6538a), o5k0.a((Context) fetVar.k(dy2.b))), str, mm40Var, mz3.v, null, zx7Var2, qgeVar2, a4dVar2, true, fetVar, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static final void b(Object obj, String str, mm40 mm40Var, pm80 pm80Var, pm80 pm80Var2, pm80 pm80Var3, Function1 function1, Function1 function2, Function1 function3, u12 u12Var, qge qgeVar, a4d a4dVar, fet fetVar, int i, int i2, int i3) {
        pm80 pm80Var4 = (i3 & 8) != 0 ? null : pm80Var;
        pm80 pm80Var5 = (i3 & 16) != 0 ? null : pm80Var2;
        pm80 pm80Var6 = (i3 & 32) != 0 ? pm80Var5 : pm80Var3;
        Function1 function4 = (i3 & 64) != 0 ? null : function1;
        Function1 function5 = (i3 & 128) != 0 ? null : function2;
        Function1 function6 = (i3 & 256) != 0 ? null : function3;
        u12 u12Var2 = (i3 & 512) != 0 ? gqw0.e : u12Var;
        qge qgeVar2 = (i3 & 1024) != 0 ? gqw0.B : qgeVar;
        int i4 = i << 3;
        int i5 = (i & 126) | (i4 & 7168) | 32768 | (i4 & 57344) | 262144 | (i4 & 458752) | 2097152 | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        int i6 = i2 << 3;
        int i7 = (i6 & 458752) | ((i >> 27) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344);
        int i8 = i5 >> 3;
        a4d a4dVar2 = (i3 & 4096) != 0 ? null : a4dVar;
        qz3 qz3Var = new qz3(obj, (fz3) fetVar.k(dr00.f6538a), o5k0.a((Context) fetVar.k(dy2.b)));
        int i9 = iut0.b;
        Function1 m8s0Var = (pm80Var4 == null && pm80Var5 == null && pm80Var6 == null) ? mz3.v : new m8s0(pm80Var4, pm80Var6, pm80Var5, (byte) 4);
        m8s0 m8s0Var2 = (function4 == null && function5 == null && function6 == null) ? null : new m8s0(function4, function5, function6, (byte) 5);
        int i10 = i7 << 15;
        dj8.e(qz3Var, str, mm40Var, m8s0Var, m8s0Var2, u12Var2, qgeVar2, a4dVar2, true, fetVar, (i5 & 112) | (i8 & 896) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i7 >> 15) & 14);
    }

    public static final void c(final String str, final String str2, final long j, final long j2, final float f, fet fetVar, final int i) {
        int i2;
        String str3;
        long j3;
        fetVar.g0(648097301);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= fetVar.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= fetVar.f(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new daq0(qmk.q));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1967915919, new ds8(str, j3, str3, pz40Var), fetVar), fetVar, 56);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), "ADVANCEBET_RELOAD_ICON");
            boolean z = (57344 & i2) == 16384;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new f54(f, (byte) 26);
                fetVar.o0(objP2);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_reload, 0, fetVar), null, i4w0.T(mm40VarE0, (Function1) objP2), j2, fetVar, 56 | (i2 & 7168), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ccg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    k7x.c(str, str2, j, j2, f, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(float f, fet fetVar, int i) {
        fetVar.g0(96746099);
        byte b = 2;
        int i2 = (fetVar.d(f) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            String strW = rsm0.w(R.string.request, 0, fetVar);
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long secondary40 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary40();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new j6g0((byte) 10);
                fetVar.o0(objP);
            }
            g(false, strW, "", secondary40, secondary, f, (Function0) objP, fetVar, ((i2 << 15) & 458752) | 1573254);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ro50(f, i, b);
        }
    }

    public static final void e(float f, fet fetVar, int i) {
        fetVar.g0(-408117447);
        int i2 = (fetVar.d(f) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            String strW = rsm0.w(R.string.request, 0, fetVar);
            zfn zfnVar = zaq0.b;
            long secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            long secondary21 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new j6g0((byte) 12);
                fetVar.o0(objP);
            }
            g(false, strW, "", secondary21, secondary20, f, (Function0) objP, fetVar, ((i2 << 15) & 458752) | 1573254);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ro50(f, i, (byte) 3);
        }
    }

    public static final void f(float f, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(1887314371);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String strW = rsm0.w(R.string.request, 0, fetVar);
            zfn zfnVar = zaq0.b;
            int i3 = i2 << 15;
            g(true, strW, "", ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), f, function0, fetVar, (458752 & i3) | 390 | (i3 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i7m(b, f, i, function0);
        }
    }

    public static final void g(boolean z, String str, String str2, long j, long j2, float f, Function0 function0, fet fetVar, int i) {
        int i2;
        String str3;
        String str4;
        long j3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-492042495);
        if ((i & 6) == 0) {
            i2 = (fetVar2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i2 |= fetVar2.f(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean z2 = ((i2 & 14) == 4) | ((3670016 & i2) == 1048576);
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new jw7(z, function0, (byte) 13);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarD, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.o, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(jm40Var, 14.0f), "ADVANCE_BET_SUM");
            String strW = rsm0.w(R.string.advance, 0, fetVar2);
            qrq qrqVar = j1t0.c;
            long j4 = qmk.q;
            v8q0.a(strW, mm40VarE0, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary80(), new n05(qmk.o, j4, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j4, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 110576);
            c(str3, str4, j3, j2, f, fetVar, (i2 >> 3) & 65534);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cs8(z, str, str2, j, j2, f, function0, i);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1396291675);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(null) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        } else {
            if (str == null || str.length() == 0) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new yh20((byte) 25, i, str);
                    return;
                }
                return;
            }
            fetVar.e0(1806509796);
            long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
            fetVar.r(false);
            qrq qrqVar = j1t0.b;
            mm40Var2 = jm40.b;
            str2 = str;
            v8q0.a(str2, mm40Var2, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.q, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | 48, 384, 126968);
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new n040(mm40Var2, str2, i, (byte) 18);
        }
    }

    public static final void i(View view, fet fetVar, int i) {
        fetVar.g0(-195878225);
        byte b = 2;
        int i2 = (fetVar.i(view) ? 4 : 2) | i;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            pz40 pz40VarZ = v3c.Z(32, new Object[0], fetVar);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(view) | fetVar.g(pz40VarZ);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new rly(view, pz40VarZ, b);
                fetVar.o0(objP);
            }
            m0x0.o(unit, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zr10(view, i, b2);
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        pfx pfxVarI;
        fetVar.g0(-649064498);
        int i2 = i | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            int i3 = q33Var.e().d;
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = null;
            if (i3 == 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                fetVar.e0(-337076114);
                View view = (View) fetVar.k(dy2.f);
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && (pfxVarI = xiv0VarA.f40966a.i(2)) != null) {
                    numValueOf2 = Integer.valueOf(pfxVarI.d);
                }
                fetVar.r(false);
                numValueOf = numValueOf2;
            } else {
                fetVar.e0(-980710297);
                fetVar.r(false);
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            boolean zE = fetVar.e(iIntValue);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iIntValue, (byte) 4);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar.F(mrv.k0(jm40Var, "MEDIA_ID"), fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(-214376345);
                fetVar.r(false);
            } else {
                fetVar.e0(-6915366);
                w6x.v(((i2 >> 3) & 112) | 6, xdrVar, mrv.k0(jm40Var, "COMPANY_LOGO_ID"), fetVar, false);
            }
            if (xdrVar2 == null) {
                fetVar.e0(-214297977);
                fetVar.r(false);
            } else {
                fetVar.e0(-6912838);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar2, mrv.k0(jm40Var, "PARTNER_LOGO_ID"), fetVar, false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "STEP_PROGRESS_BAR_ID"), fetVar, 54);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "APP_VERSION_ID");
            ugdVar5 = ugdVar3;
            ugdVar5.F(mm40VarK0, fetVar, 54);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nq00(mm40Var, ugdVar, xdrVar, xdrVar2, ugdVar4, ugdVar5, i, (byte) 1);
        }
    }

    public static final void k(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(214852651);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String strW = rsm0.w(R.string.operator_rating_good_mark, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f);
            zfn zfnVar = zaq0.b;
            v8q0.a(strW, mm40VarD, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            v8q0.a(rsm0.w(R.string.operator_rating_bad_mark, 0, fetVar), o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            a4x a4xVar = ((vs70) l7m0Var.getValue()).f37936a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new i160(function1, (byte) 15);
                fetVar.o0(objP);
            }
            l7x.t(a4xVar, (Function1) objP, fetVar, 0);
            wvb.o(null, 2.0f, 0L, fetVar, 0, 5);
            i7n i7nVar = new i7n(new y6q0(((vs70) l7m0Var.getValue()).b, new s7q0(((vs70) l7m0Var.getValue()).c), ((vs70) l7m0Var.getValue()).d, rsm0.w(R.string.operator_rating_comment_placeholder, 0, fetVar)));
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new i160(function1, (byte) 16);
                fetVar.o0(objP2);
            }
            jwb.j(null, i7nVar, (Function1) objP2, fetVar, 0, 5);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, (byte) 28);
        }
    }

    public static final void l(mm40 mm40Var, upa0 upa0Var, Function1 function1, fet fetVar, int i) {
        long jC;
        fet fetVar2 = fetVar;
        upa0Var.getClass();
        function1.getClass();
        fetVar2.g0(-1820577049);
        int i2 = i | (fetVar2.g(upa0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            String str = upa0Var.f36055a;
            if (upa0Var.c) {
                fetVar2.e0(1642180616);
                jC = afn0.m(fetVar2).getWarning();
                fetVar2.r(false);
            } else {
                jC = rz4.c(fetVar2, 1642181612, fetVar2, false);
            }
            v8q0.a(str, x7zVarI, jC, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new i0a0(function1, (byte) 22);
                fetVar2.o0(objP);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28), afn0.m(fetVar2).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fyl fylVar = upa0Var.b;
            vxl vxlVar = vxl.b;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new rpa0(function1, (byte) 0);
                fetVar2.o0(objP2);
            }
            ebc.r(null, fylVar, vxlVar, (Function1) objP2, null, fetVar2, 384, 41);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, upa0Var, function1, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x02df  */
    /* JADX WARN: Code duplicated, block: B:68:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0307  */
    /* JADX WARN: Code duplicated, block: B:74:0x0309  */
    /* JADX WARN: Code duplicated, block: B:80:0x0316  */
    /* JADX WARN: Code duplicated, block: B:83:0x034d  */
    /* JADX WARN: Code duplicated, block: B:84:0x036b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v8, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r40v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    public static final void m(mm40 mm40Var, bzc0 bzc0Var, xyc0 xyc0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        ?? r10;
        boolean z;
        long secondary20;
        jm40 jm40Var;
        ?? r4;
        pz40 pz40Var;
        Object obj;
        int i2;
        ?? r11;
        Object obj2;
        int iOrdinal;
        boolean z2;
        ?? r8;
        ?? r0;
        Object objP;
        ?? r12 = fetVar;
        function1.getClass();
        r12.g0(-1080945580);
        int i3 = i | 6 | (r12.g(bzc0Var) ? 32 : 16) | (r12.e(xyc0Var.ordinal()) ? 256 : 128) | (r12.i(function1) ? 2048 : 1024);
        if (r12.U(i3 & 1, (i3 & 1171) != 1170)) {
            String str = (String) bzc0Var.f3460a.getValue();
            if (str == null) {
                str = "";
            }
            Object[] objArr = new Object[0];
            Object objP2 = r12.P();
            Object obj3 = ukd.f35823a;
            if (objP2 == obj3) {
                objP2 = new cbc0((byte) 13);
                r12.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) e9x.Q(objArr, (Function0) objP2, r12, 48);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = epv0.N(o7k0.d(jm40Var2, 1.0f), xyc0Var == xyc0.b ? 0.5f : 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarN, 12.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.h, yx7Var, r12, 54);
            int iHashCode = Long.hashCode(r12.T);
            bh90 bh90VarM = r12.m();
            mm40 mm40VarC0 = kbc.c0(r12, mm40VarL);
            mkd.c0.getClass();
            r12.i0();
            boolean z3 = r12.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(r12, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(r12, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(r12, numValueOf, shdVar3);
            jpm0.n(r12);
            shd shdVar4 = gqw0.v;
            String str2 = str;
            x7z x7zVarI = ohs0.i(r12, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, r12, 48);
            int iHashCode2 = Long.hashCode(r12.T);
            bh90 bh90VarM2 = r12.m();
            mm40 mm40VarC1 = kbc.c0(r12, x7zVarI);
            r12.i0();
            if (r12.S) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            jpm0.o(r12, x5dVarA, shdVar);
            jpm0.o(r12, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, r12, shdVar3, r12);
            jpm0.o(r12, mm40VarC1, shdVar4);
            mm40 mm40VarA = o7k0.A(jm40Var2, null, 3);
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                r12.e0(2000894218);
                secondary20 = afn0.m(r12).getPrimaryHighlight();
                z = false;
            } else {
                z = false;
                r12.e0(2000895493);
                secondary20 = afn0.m(r12).getSecondary20();
            }
            r12.r(z);
            long j = secondary20;
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(o7k0.e(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.S(mm40VarA, 1.0f, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2))), afn0.m(r12).getBackgroundGroupSecondary(), jd8.n), 32.0f), 6.0f, 4.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, r12, 48);
            int iHashCode3 = Long.hashCode(r12.T);
            bh90 bh90VarM3 = r12.m();
            mm40 mm40VarC2 = kbc.c0(r12, mm40VarK);
            r12.i0();
            if (r12.S) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            jpm0.o(r12, thg0VarA2, shdVar);
            jpm0.o(r12, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, r12, shdVar3, r12);
            jpm0.o(r12, mm40VarC2, shdVar4);
            mm40 mm40VarA2 = o7k0.A(jm40Var2, null, 3);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode4 = Long.hashCode(r12.T);
            bh90 bh90VarM4 = r12.m();
            mm40 mm40VarC3 = kbc.c0(r12, mm40VarA2);
            r12.i0();
            if (r12.S) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            jpm0.o(r12, tj30VarC, shdVar);
            jpm0.o(r12, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, r12, shdVar3, r12);
            jpm0.o(r12, mm40VarC3, shdVar4);
            if (str2.length() == 0) {
                r12.e0(-1399422492);
                String str3 = bzc0Var.b;
                afn0.v(r12).getClass();
                y9q0 y9q0VarU = g1t0.u();
                afn0.v(r12).getClass();
                r4 = 0;
                jm40Var = jm40Var2;
                pz40Var = pz40Var2;
                obj = obj3;
                i2 = 3;
                v8q0.a(str3, null, afn0.m(r12).getSecondary60(), null, 0L, null, null, g1t0.u().f42262a.f, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarU, fetVar, 0, 24960, 110458);
                ?? r13 = fetVar;
                r13.r(false);
                r11 = r13;
            } else {
                jm40Var = jm40Var2;
                r4 = 0;
                pz40Var = pz40Var2;
                obj = obj3;
                i2 = 3;
                r12.e0(-1398987438);
                r12.r(false);
                r11 = r12;
            }
            mm40 mm40VarA3 = o7k0.A(jm40Var, null, i2);
            boolean zG = r11.g(pz40Var);
            Object objP3 = r11.P();
            if (zG) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (objP3 == obj2) {
                }
                mm40 mm40VarB0 = j120.b0(mm40VarA3, (Function1) objP3);
                afn0.v(r11).getClass();
                y9q0 y9q0VarA = y9q0.a(g1t0.q(), afn0.m(r11).getTextPrimary(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446);
                iOrdinal = xyc0Var.ordinal();
                if (iOrdinal != 0) {
                    z2 = true;
                    if (iOrdinal == 1) {
                        t9f.b();
                        return;
                    }
                    r8 = r4;
                } else {
                    z2 = true;
                    r8 = 1;
                }
                skk0 skk0Var = new skk0(afn0.m(r11).getPrimary());
                uly ulyVar = new uly(0, null, 1, 0, 123);
                if ((i3 & 7168) == 2048) {
                    r0 = z2;
                } else {
                    r0 = r4;
                }
                objP = r11.P();
                if (r0 == 0 || objP == obj2) {
                    objP = new rpa0(function1, (byte) 26);
                    r11.o0(objP);
                }
                boolean z4 = z2;
                z96.b(str2, (Function1) objP, mm40VarB0, r8, y9q0VarA, ulyVar, null, true, 0, 0, null, null, skk0Var, null, fetVar, 102236160, 0, 48784);
                fetVar.r(z4);
                if (bzc0Var.d) {
                    fetVar.e0(-1029810580);
                    dww.c(a8k0.F(R.drawable.ic_status_green_check_circle, r4, fetVar), null, o7k0.n(jm40Var, 14.0f), y3d.g, fetVar, 3128, 0);
                    fetVar.r(r4);
                } else {
                    fetVar.e0(-1029388205);
                    dww.c(a8k0.F(R.drawable.ic_glyph_edit, r4, fetVar), null, o7k0.n(jm40Var, 14.0f), afn0.m(fetVar).getPrimary(), fetVar, 56, 0);
                    fetVar.r(r4);
                }
                fetVar.r(z4);
                qxw.o(fetVar, o7k0.e(jm40Var, 6.0f));
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String strW = rsm0.w(R.string.promocode_for_free_bet, r4, fetVar);
                afn0.v(fetVar).getClass();
                v8q0.a(strW, mm40VarD, 0L, null, 0L, null, null, null, 0L, new f2q0(i2), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.e(), afn0.m(fetVar).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 109564);
                ?? r14 = fetVar;
                r14.r(z4);
                r14.r(z4);
                mm40Var2 = jm40Var;
                r10 = r14;
            }
            objP3 = new y9v(pz40Var, (byte) 29);
            r11.o0(objP3);
            mm40 mm40VarB1 = j120.b0(mm40VarA3, (Function1) objP3);
            afn0.v(r11).getClass();
            y9q0 y9q0VarA2 = y9q0.a(g1t0.q(), afn0.m(r11).getTextPrimary(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446);
            iOrdinal = xyc0Var.ordinal();
            if (iOrdinal != 0) {
                z2 = true;
                if (iOrdinal == 1) {
                    t9f.b();
                    return;
                }
                r8 = r4;
            } else {
                z2 = true;
                r8 = 1;
            }
            skk0 skk0Var2 = new skk0(afn0.m(r11).getPrimary());
            uly ulyVar2 = new uly(0, null, 1, 0, 123);
            if ((i3 & 7168) == 2048) {
                r0 = z2;
            } else {
                r0 = r4;
            }
            objP = r11.P();
            if (r0 == 0) {
                objP = new rpa0(function1, (byte) 26);
                r11.o0(objP);
            } else {
                objP = new rpa0(function1, (byte) 26);
                r11.o0(objP);
            }
            boolean z5 = z2;
            z96.b(str2, (Function1) objP, mm40VarB1, r8, y9q0VarA2, ulyVar2, null, true, 0, 0, null, null, skk0Var2, null, fetVar, 102236160, 0, 48784);
            fetVar.r(z5);
            if (bzc0Var.d) {
                fetVar.e0(-1029810580);
                dww.c(a8k0.F(R.drawable.ic_status_green_check_circle, r4, fetVar), null, o7k0.n(jm40Var, 14.0f), y3d.g, fetVar, 3128, 0);
                fetVar.r(r4);
            } else {
                fetVar.e0(-1029388205);
                dww.c(a8k0.F(R.drawable.ic_glyph_edit, r4, fetVar), null, o7k0.n(jm40Var, 14.0f), afn0.m(fetVar).getPrimary(), fetVar, 56, 0);
                fetVar.r(r4);
            }
            fetVar.r(z5);
            qxw.o(fetVar, o7k0.e(jm40Var, 6.0f));
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            String strW2 = rsm0.w(R.string.promocode_for_free_bet, r4, fetVar);
            afn0.v(fetVar).getClass();
            v8q0.a(strW2, mm40VarD2, 0L, null, 0L, null, null, null, 0L, new f2q0(i2), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.e(), afn0.m(fetVar).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 109564);
            ?? r15 = fetVar;
            r15.r(z5);
            r15.r(z5);
            mm40Var2 = jm40Var;
            r10 = r15;
        } else {
            r12.X();
            mm40Var2 = mm40Var;
            r10 = r12;
        }
        yfe0 yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var2, (Object) bzc0Var, (Object) xyc0Var, function1, i, (byte) 6);
        }
    }

    public static final void n(o30 o30Var, float f, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2121185169);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(o30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = o30Var.f24556a;
            String str2 = o30Var.b;
            zfn zfnVar = zaq0.b;
            int i3 = i2 << 12;
            g(true, str, str2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), f, function0, fetVar, (458752 & i3) | 6 | (i3 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm((Object) o30Var, f, (wdr) function0, i, (byte) 5);
        }
    }

    public static final void o(r30 r30Var, float f, fet fetVar, int i) {
        fetVar.g0(-1497974577);
        int i2 = (fetVar.g(r30Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = r30Var.f29762a;
            String str2 = r30Var.b;
            zfn zfnVar = zaq0.b;
            long secondary40 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary40();
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new j6g0((byte) 11);
                fetVar.o0(objP);
            }
            g(false, str, str2, textPrimary, secondary40, f, (Function0) objP, fetVar, 1572870 | ((i2 << 12) & 458752));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7((byte) 5, f, i, r30Var);
        }
    }

    public static final void p(mm40 mm40Var, pz40 pz40Var, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(137735404);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 32.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            x30 x30Var = (x30) pz40Var.getValue();
            boolean z = (x30Var instanceof c30) || (x30Var instanceof u30);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = fetVar.h(z) | fetVar.i(t33Var);
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj) {
                objP2 = new pw7(b, t33Var, null, z);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            if (Intrinsics.d(x30Var, i30.f14073a)) {
                fetVar.e0(-1713425610);
                fetVar.r(false);
            } else if (Intrinsics.d(x30Var, f30.f8838a)) {
                fetVar.e0(-1713424015);
                e(((Number) t33Var.d()).floatValue(), fetVar, 0);
                fetVar.r(false);
            } else if (Intrinsics.d(x30Var, l30.f19337a)) {
                fetVar.e0(-1713421525);
                f(((Number) t33Var.d()).floatValue(), function0, fetVar, (i2 >> 3) & 112);
                fetVar.r(false);
            } else if (Intrinsics.d(x30Var, c30.f3649a)) {
                fetVar.e0(-1713416302);
                d(((Number) t33Var.d()).floatValue(), fetVar, 0);
                fetVar.r(false);
            } else if (x30Var instanceof r30) {
                fetVar.e0(-1713413446);
                o((r30) x30Var, ((Number) t33Var.d()).floatValue(), fetVar, 0);
                fetVar.r(false);
            } else if (x30Var instanceof o30) {
                fetVar.e0(-1713408375);
                n((o30) x30Var, ((Number) t33Var.d()).floatValue(), function0, fetVar, i2 & 896);
                fetVar.r(false);
            } else {
                if (!(x30Var instanceof u30)) {
                    throw b1j.f(-1713426791, fetVar, false);
                }
                fetVar.e0(-1713401847);
                x((u30) x30Var, ((Number) t33Var.d()).floatValue(), function0, fetVar, i2 & 896);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dw7(mm40Var, pz40Var, function0, i, (byte) 2);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var, String str) {
        str.getClass();
        fetVar.g0(1262321468);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            nkb.h(mm40Var, new hjm(str, new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjm.b, null, null, null, fetVar, (i2 & 14) | 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str, i, (byte) 17);
        }
    }

    public static final void r(mm40 mm40Var, ejh0 ejh0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        ejh0Var.getClass();
        fetVar2.g0(782266670);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ejh0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            v8q0.a(String.valueOf(ejh0Var.f7910a), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), ejh0Var.b, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            if (ejh0Var.c) {
                fetVar2.e0(-1785974506);
                mbc.o(agi0.f827a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1785833890);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, ejh0Var, i, (byte) 29);
        }
    }

    public static final void s(mm40 mm40Var, vui0 vui0Var, boolean z, fet fetVar, int i) {
        vui0 vui0Var2;
        fet fetVar2 = fetVar;
        vui0Var.getClass();
        fetVar2.g0(745418125);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(vui0Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 10.0f, 0.0f, 10.0f, 4);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (vui0Var instanceof tui0) {
                fetVar2.e0(1114765717);
                w(null, vui0Var, z, fetVar2, i2 & 1008, 1);
                vui0Var2 = vui0Var;
                fetVar2.r(false);
            } else {
                vui0Var2 = vui0Var;
                boolean z2 = vui0Var2 instanceof rui0;
                jm40 jm40Var = jm40.b;
                if (z2) {
                    fetVar2.e0(1115003642);
                    rui0 rui0Var = (rui0) vui0Var2;
                    v(null, rui0Var.c, rui0Var.d, null, fetVar, 0);
                    fetVar2 = fetVar;
                    w(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), rui0Var, z, fetVar2, i2 & 1008, 0);
                    fetVar2.r(false);
                } else if (vui0Var2 instanceof sui0) {
                    fetVar2.e0(1115649496);
                    sui0 sui0Var = (sui0) vui0Var2;
                    v(null, sui0Var.b, null, null, fetVar, 0);
                    fetVar2 = fetVar;
                    w(s5x0.L(jm40Var, 0.0f, 4.0f, 1), sui0Var, z, fetVar2, i2 & 1008, 0);
                    h(0, fetVar2, null, sui0Var.c);
                    fetVar2.r(false);
                } else {
                    if (!(vui0Var2 instanceof uui0)) {
                        throw b1j.f(728697433, fetVar2, false);
                    }
                    fetVar2.e0(1116468919);
                    uui0 uui0Var = (uui0) vui0Var2;
                    w(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), uui0Var, z, fetVar2, i2 & 1008, 0);
                    v(null, uui0Var.c, uui0Var.d, uui0Var.e, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            fetVar2.r(true);
        } else {
            vui0Var2 = vui0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) vui0Var2, z, i, (byte) 21);
        }
    }

    public static final void t(mm40 mm40Var, trj0 trj0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        trj0 trj0Var2 = trj0Var;
        fet fetVar2 = fetVar;
        trj0Var2.getClass();
        fetVar2.g0(842958877);
        int i2 = i | 6 | (fetVar2.g(trj0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarW, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
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
            String str = trj0Var2.b;
            y9q0 y9q0VarH = g1t0.h();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarH, fetVar, 0, 0, 131066);
            trj0Var2 = trj0Var;
            v8q0.a(trj0Var.f34424a, s5x0.L(new x7z(1.0f, true), 8.0f, 0.0f, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
            v8q0.a(trj0Var2.c, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
            e9x.c(o7k0.e(o7k0.d(mm40Var2, 1.0f), 4.0f), trj0Var2.d, trj0Var2.e, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) trj0Var2, i, (byte) 26);
        }
    }

    public static final void u(mm40 mm40Var, oal0 oal0Var, Function2 function2, fet fetVar, int i) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        mw3 mw3Var = uc9.c;
        xx7 xx7Var = gqw0.n;
        boolean z = oal0Var instanceof lal0;
        jm40 jm40Var = jm40.b;
        Function0 function0 = e7z.u1;
        Object obj = ukd.f35823a;
        if (z) {
            fetVar.e0(-734106839);
            lal0 lal0Var = (lal0) oal0Var;
            zfn zfnVar = zep0.f44264a;
            w6n w6nVar = w6n.b;
            w6n w6nVar2 = w6n.e;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Context context = (Context) fetVar.k(dy2.b);
            boolean zG = fetVar.g(context);
            Object objP = fetVar.P();
            if (zG || objP == obj) {
                objP = zep0.b(zep0.a(context.getResources().getDisplayMetrics().density, jB), w6nVar, w6nVar2, w6nVar2);
                fetVar.o0(objP);
            }
            w6n w6nVar3 = (w6n) objP;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-696475191, new aak0(lal0Var, w6nVar3, function2, (byte) 20), fetVar), fetVar, 56);
            zfn zfnVar2 = eal0.c;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            obc.d(zfnVar2.a(g1t0.m()), u1c.M(1045284146, new edk0(lal0Var, (byte) 12), fetVar), fetVar, 56);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            fww.o(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), lal0Var.d, fetVar, 0);
            fetVar.r(true);
            fetVar.r(false);
            return;
        }
        if (!(oal0Var instanceof mal0)) {
            if (oal0Var instanceof hal0) {
                fetVar.e0(-734092693);
                obc.e(new l5d0[]{eal0.f7472a.a(gqw0.d), dw9.k(5, eal0.b), gap.f10979a.a(fetVar.k(bmd.n))}, u1c.M(-377718145, new aak0(mm40Var, (hal0) oal0Var, function2, (byte) 18), fetVar), fetVar, 48);
                fetVar.r(false);
                return;
            } else {
                if (!(oal0Var instanceof ial0)) {
                    throw b1j.f(-734108642, fetVar, false);
                }
                fetVar.e0(-734085523);
                azw.v(mm40Var, (ial0) oal0Var, function2, fetVar);
                fetVar.r(false);
                return;
            }
        }
        fetVar.e0(-734099797);
        mal0 mal0Var = (mal0) oal0Var;
        zfn zfnVar3 = zep0.f44264a;
        w6n w6nVar4 = w6n.f38632a;
        w6n w6nVar5 = w6n.c;
        long jB2 = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
        Context context2 = (Context) fetVar.k(dy2.b);
        boolean zF = fetVar.f(jB2);
        Object objP2 = fetVar.P();
        if (zF || objP2 == obj) {
            objP2 = zep0.b(zep0.a(context2.getResources().getDisplayMetrics().density, jB2), w6nVar4, w6nVar5, w6nVar5);
            fetVar.o0(objP2);
        }
        w6n w6nVar6 = (w6n) objP2;
        x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 48);
        int iHashCode2 = Long.hashCode(fetVar.T);
        bh90 bh90VarM2 = fetVar.m();
        mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var);
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(function0);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, x5dVarA2, shdVar4);
        jpm0.o(fetVar, bh90VarM2, shdVar3);
        vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
        jpm0.o(fetVar, mm40VarC1, shdVar);
        c3x.m(mal0Var.b, w6nVar6, function2, fetVar, 0, 1);
        zfn zfnVar4 = eal0.c;
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        obc.d(zfnVar4.a(g1t0.m()), u1c.M(28506423, new edk0(mal0Var, (byte) 13), fetVar), fetVar, 56);
        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
        zcl zclVar2 = qmk.f28987a;
        fww.o(s5x0.N(mm40VarD2, 0.0f, 8.0f, 0.0f, 0.0f, 13), mal0Var.c, fetVar, 0);
        fetVar.r(true);
        fetVar.r(false);
    }

    public static final void v(mm40 mm40Var, final String str, final y3d y3dVar, final Integer num, fet fetVar, final int i) {
        final mm40 mm40Var2;
        yfe0 yfe0VarU;
        Function2 function2;
        long secondary;
        fet fetVar2 = fetVar;
        fetVar2.g0(-505873757);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(y3dVar) ? 256 : 128) | (fetVar2.g(num) ? 2048 : 1024) | (fetVar2.g(null) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            final jm40 jm40Var = jm40.b;
            if (str == null || str.length() == 0) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2(jm40Var, str, y3dVar, num, i, b) { // from class: a.qui0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f29347a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ y3d d;
                    public final /* synthetic */ Integer e;

                    {
                        this.f29347a = b;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f29347a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(1);
                                k7x.v(this.b, this.c, this.d, this.e, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(1);
                                k7x.v(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
                if (num == null) {
                    fetVar2.e0(2133000382);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(2133000383);
                    int iIntValue = num.intValue();
                    zcl zclVar = qmk.f28987a;
                    dww.c(a8k0.F(iIntValue, 0, fetVar2), "", o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 14.0f), y3d.g, fetVar2, 56, 0);
                    fetVar2.r(false);
                }
                if (y3dVar == null) {
                    fetVar2.e0(-901013016);
                    secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-901014101);
                    fetVar2.r(false);
                    secondary = y3dVar.f41946a;
                }
                v8q0.a(str, o2e.e0(jm40Var, "SUB_TITLE_TEXT"), secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, ((i2 >> 3) & 14) | 48, 384, 126968);
                fetVar2 = fetVar;
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            yfe0VarU.d = function2;
        }
        fetVar2.X();
        mm40Var2 = mm40Var;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2(mm40Var2, str, y3dVar, num, i, b2) { // from class: a.qui0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f29347a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ y3d d;
                public final /* synthetic */ Integer e;

                {
                    this.f29347a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f29347a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            k7x.v(this.b, this.c, this.d, this.e, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            k7x.v(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void w(mm40 mm40Var, vui0 vui0Var, boolean z, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        vui0 vui0Var2;
        mm40 mm40Var3;
        long textPrimary;
        fetVar.g0(1656712747);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            vui0Var2 = vui0Var;
            i3 |= fetVar.g(vui0Var2) ? 32 : 16;
        } else {
            vui0Var2 = vui0Var;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            y3d y3dVarB = vui0Var2.b();
            if (z) {
                fetVar.e0(-1331908974);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                fetVar.r(false);
            } else if (y3dVarB != null) {
                fetVar.e0(-1331907755);
                fetVar.r(false);
                textPrimary = y3dVarB.f41946a;
            } else {
                fetVar.e0(-1331906314);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            v8q0.a(vui0Var2.a(), o2e.e0(mm40Var3, "TITLE_TEXT"), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110584);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5(mm40Var3, (Object) vui0Var, z, i, i2, (byte) 9);
        }
    }

    public static final void x(u30 u30Var, float f, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(188156887);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(u30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = u30Var.f34971a;
            String str2 = u30Var.b;
            zfn zfnVar = zaq0.b;
            int i3 = i2 << 12;
            g(true, str, str2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary40(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), f, function0, fetVar, (458752 & i3) | 6 | (i3 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm((Object) u30Var, f, (wdr) function0, i, (byte) 6);
        }
    }

    public static final jge0 y(j6z j6zVar) {
        j6z j6zVarU = j6zVar.U();
        return j6zVarU != null ? j6zVarU.w(j6zVar, true) : new jge0(0.0f, 0.0f, (int) (j6zVar.g() >> 32), (int) (j6zVar.g() & 4294967295L));
    }

    public static final jge0 z(j6z j6zVar, boolean z) {
        j6z j6zVarC = C(j6zVar);
        float fG = (int) (j6zVarC.g() >> 32);
        float fG2 = (int) (j6zVarC.g() & 4294967295L);
        jge0 jge0VarW = j6zVarC.w(j6zVar, z);
        float f = jge0VarW.f16474a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fG) {
                f = fG;
            }
        }
        float f2 = jge0VarW.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fG2) {
                f2 = fG2;
            }
        }
        float f3 = jge0VarW.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fG) {
                fG = f3;
            }
            f3 = fG;
        }
        float f4 = jge0VarW.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fG2) {
                fG2 = f5;
            }
            f4 = fG2;
        }
        if (f == f3 || f2 == f4) {
            return jge0.e;
        }
        long jG = j6zVarC.G((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jG2 = j6zVarC.G((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jG3 = j6zVarC.G((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jG4 = j6zVarC.G((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jG4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jG3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jG & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jG2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jG4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jG3 & 4294967295L));
        return new jge0(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }
}
