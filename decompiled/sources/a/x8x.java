package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.hardware.display.DisplayManager;
import android.javax.sip.header.WarningHeader;
import android.view.Display;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x8x {
    public static int A(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String B(s760 s760Var) {
        s760Var.getClass();
        evz evzVar = r760.f29964a;
        long j = s760Var.b;
        evzVar.getClass();
        r760 r760VarF = evz.f(j);
        boolean z = s760Var.c;
        int iOrdinal = r760VarF.ordinal();
        if (iOrdinal == 0) {
            return z ? "mb_ig_score_on" : "mb_ig_score_off";
        }
        if (iOrdinal == 1) {
            return z ? "mb_ig_yellow_on" : "mb_ig_yellow_off";
        }
        if (iOrdinal == 2) {
            return z ? "mb_ig_corner_on" : "mb_ig_corner_off";
        }
        if (iOrdinal == 3) {
            return z ? "mb_ig_red_on" : "mb_ig_red_off";
        }
        if (iOrdinal == 4) {
            return z ? "mb_ig_penalty_on" : "mb_ig_penalty_off";
        }
        if (iOrdinal != 10) {
            return "";
        }
        return z ? "mb_ig_replace_on" : "mb_ig_replace_off";
    }

    public static final sq90 C(nq90 nq90Var, boolean z, boolean z2) {
        nq90Var.getClass();
        if (nq90Var instanceof fq90) {
            return new rq90(z2, z, m(nq90Var), ((fq90) nq90Var).f9963a);
        }
        if (nq90Var instanceof gq90) {
            String strM = m(nq90Var);
            gq90 gq90Var = (gq90) nq90Var;
            return new qq90(gq90Var.f11722a, strM, gq90Var.e, z2, z);
        }
        boolean z3 = nq90Var instanceof hq90;
        int i = R.attr.uikitPrimary;
        if (z3) {
            String strM2 = m(nq90Var);
            int i2 = ((hq90) nq90Var).f13474a;
            if (!z) {
                i = R.attr.uikitSecondary;
            }
            return new oq90(i2, i, strM2, z2, z);
        }
        if (nq90Var instanceof eq90) {
            return new rq90(z2, z, m(nq90Var), ((eq90) nq90Var).f8227a);
        }
        if (nq90Var instanceof kq90) {
            String strM3 = m(nq90Var);
            kq90 kq90Var = (kq90) nq90Var;
            return new qq90(kq90Var.f18711a, strM3, kq90Var.f, z2, z);
        }
        if (nq90Var instanceof lq90) {
            return new rq90(z2, z, m(nq90Var), ((lq90) nq90Var).f20476a);
        }
        if (nq90Var instanceof iq90) {
            return new rq90(z2, z, m(nq90Var), ((iq90) nq90Var).f15199a);
        }
        if (!(nq90Var instanceof jq90)) {
            if (nq90Var instanceof mq90) {
                return new rq90(z2, z, m(nq90Var), nq90Var.getId());
            }
            t9f.b();
            return null;
        }
        jq90 jq90Var = (jq90) nq90Var;
        String str = jq90Var.b;
        int i3 = jq90Var.f16940a;
        if (!z) {
            i = R.attr.uikitTextPrimary;
        }
        return new pq90(i3, i, str, z2, z);
    }

    public static final kx00 D(qw00 qw00Var) {
        String str;
        Long lT0;
        String str2 = qw00Var.f29413a;
        String strConcat = qw00Var.c;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        if (strConcat == null) {
            jf4.k(null);
            return null;
        }
        if (strConcat.length() > 0) {
            strConcat = "Bearer ".concat(strConcat);
        }
        String str3 = strConcat;
        Long l = qw00Var.d;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        pw00 pw00Var = qw00Var.e;
        if (pw00Var != null && (str = pw00Var.f27687a) != null && (lT0 = StringsKt.t0(str)) != null) {
            return new kx00(jLongValue, lT0.longValue(), str2, str3);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    public static final List E(xcb0 xcb0Var) {
        ArrayList arrayList;
        adb0 adb0Var;
        List list;
        xcb0Var.getClass();
        List list2 = xcb0Var.b;
        if (list2 == null || (adb0Var = (adb0) CollectionsKt.firstOrNull(list2)) == null || (list = adb0Var.d) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                qcb0 qcb0Var = (qcb0) next;
                Float f = qcb0Var.b;
                Integer num = qcb0Var.d;
                int iFloatValue = f != null ? (int) f.floatValue() : 0;
                int iIntValue = num != null ? num.intValue() : 0;
                if (num == null || num.intValue() != 0) {
                    String str = qcb0Var.f28477a;
                    if ((str != null ? str : "").length() > 0 && iFloatValue != 0 && iIntValue != 0) {
                        arrayList2.add(next);
                    }
                }
            }
            List<qcb0> listD0 = CollectionsKt.D0(arrayList2, 10);
            if (listD0 != null) {
                arrayList = new ArrayList(r3d.q(listD0, 10));
                for (qcb0 qcb0Var2 : listD0) {
                    String str2 = qcb0Var2.f28477a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String strE = lmc.E(qcb0Var2.e);
                    Float f2 = qcb0Var2.b;
                    float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
                    Float f3 = qcb0Var2.c;
                    float fFloatValue2 = f3 != null ? f3.floatValue() : 0.0f;
                    Integer num2 = qcb0Var2.d;
                    arrayList.add(new mcb0(str2, strE, fFloatValue, fFloatValue2, num2 != null ? num2.intValue() : 0));
                }
            } else {
                arrayList = null;
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final lvj0 F(zxj0 zxj0Var, boolean z) {
        zxj0Var.getClass();
        return new lvj0(zxj0Var.f45162a, zxj0Var.b, zxj0Var.c, zxj0Var.d, zxj0Var.e, zxj0Var.f, zxj0Var.a(z), zxj0Var.g, zxj0Var.i, zxj0Var.j, zxj0Var.k, zxj0Var.m);
    }

    public static final qil0 G(aw20 aw20Var) {
        aw20Var.getClass();
        t730 t730Var = aw20Var.f;
        qy20 qy20Var = aw20Var.e;
        i0d i0dVar = aw20Var.c;
        sw20 sw20Var = aw20Var.b;
        int iOrdinal = t730Var.ordinal();
        if (iOrdinal == 0) {
            zgl0 zgl0VarK = K(aw20Var);
            y9q0 y9q0VarA0 = g8x.a0(sw20Var);
            y9q0 y9q0VarH0 = f7k.h0(i0dVar);
            int iOrdinal2 = qy20Var.ordinal();
            if (iOrdinal2 == 0) {
                return new gil0(0, y9q0VarA0, y9q0VarH0, zgl0VarK, 1);
            }
            if (iOrdinal2 == 1) {
                return new fil0(y9q0VarA0, y9q0VarH0, zgl0VarK);
            }
            t9f.b();
            return null;
        }
        if (iOrdinal == 1) {
            zgl0 zgl0VarK2 = K(aw20Var);
            y9q0 y9q0VarA1 = g8x.a0(sw20Var);
            y9q0 y9q0VarH1 = f7k.h0(i0dVar);
            int iOrdinal3 = qy20Var.ordinal();
            if (iOrdinal3 == 0) {
                return new dil0(y9q0VarA1, y9q0VarH1, zgl0VarK2, 1);
            }
            if (iOrdinal3 == 1) {
                return new cil0(Integer.MAX_VALUE, y9q0VarA1, y9q0VarH1, zgl0VarK2);
            }
            t9f.b();
            return null;
        }
        if (iOrdinal == 2) {
            zgl0 zgl0VarK3 = K(aw20Var);
            y9q0 y9q0VarA2 = g8x.a0(sw20Var);
            y9q0 y9q0VarH2 = f7k.h0(i0dVar);
            int iOrdinal4 = qy20Var.ordinal();
            if (iOrdinal4 == 0) {
                return new oil0(y9q0VarA2, y9q0VarH2, zgl0VarK3, 1);
            }
            if (iOrdinal4 == 1) {
                return new nil0(y9q0VarA2, y9q0VarH2, zgl0VarK3);
            }
            t9f.b();
            return null;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return null;
        }
        zgl0 zgl0VarK4 = K(aw20Var);
        y9q0 y9q0VarA3 = g8x.a0(sw20Var);
        y9q0 y9q0VarH3 = f7k.h0(i0dVar);
        int iOrdinal5 = qy20Var.ordinal();
        if (iOrdinal5 == 0) {
            return new kil0(y9q0VarA3, y9q0VarH3, zgl0VarK4, 9);
        }
        if (iOrdinal5 == 1) {
            return new jil0(y9q0VarA3, y9q0VarH3, zgl0VarK4);
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    public static final n5l0 H(ygs ygsVar, ctf0 ctf0Var, gad gadVar) {
        boolean z;
        vas vasVar;
        vas vasVar2;
        ygsVar.getClass();
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0));
        ehs ehsVar = ygsVar.i;
        String str = (ehsVar == null || (vasVar2 = ehsVar.h) == null) ? null : vasVar2.f37106a;
        String str2 = str == null ? "" : str;
        String str3 = (ehsVar == null || (vasVar = ehsVar.h) == null) ? null : vasVar.b;
        String str4 = str3 == null ? "" : str3;
        if (str2.length() <= 0 || str4.length() <= 0) {
            z = false;
        } else {
            long j = ygsVar.d;
            if (j == 4 || j == 21 || j == ixg.d.b || j == 282) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z2 = ehsVar != null && ehsVar.q;
        boolean z3 = ehsVar != null && ehsVar.r;
        if (!z || ygsVar.w) {
            return null;
        }
        gad gadVar2 = gad.f10960a;
        long jP = p(gadVar, gadVar2, z2);
        gad gadVar3 = gad.b;
        return new n5l0(str2, str4, strA, new y3d(p(gadVar, gadVar3, z3)), new y3d(jP), gadVar == gadVar2, gadVar == gadVar3);
    }

    public static final n5l0 I(ygs ygsVar, gad gadVar) {
        String str;
        String str2;
        Object next;
        tf90 tf90Var;
        tf90 tf90Var2;
        ygsVar.getClass();
        ehs ehsVar = ygsVar.i;
        boolean z = ehsVar != null && ehsVar.s;
        boolean z2 = ehsVar != null && ehsVar.t;
        List list = ehsVar != null ? ehsVar.e : null;
        if (!ygsVar.w) {
            if (ehsVar == null || list == null || list.isEmpty()) {
                List listI0 = (ehsVar == null || (str2 = ehsVar.i) == null) ? null : StringsKt.i0(str2, new char[]{','}, 6);
                String strValueOf = String.valueOf((listI0 == null ? iun.f15405a : listI0).size());
                List listI1 = (listI0 == null || (str = (String) CollectionsKt.f0(listI0)) == null) ? null : StringsKt.i0(str, new char[]{'-'}, 6);
                String str3 = listI1 != null ? (String) CollectionsKt.firstOrNull(listI1) : null;
                String str4 = str3 == null ? "" : str3;
                String str5 = listI1 != null ? (String) CollectionsKt.f0(listI1) : null;
                String str6 = str5 == null ? "" : str5;
                gad gadVar2 = gad.f10960a;
                long jP = p(gadVar, gadVar2, z);
                gad gadVar3 = gad.b;
                return new n5l0(str4, str6, strValueOf, new y3d(p(gadVar, gadVar3, z2)), new y3d(jP), gadVar == gadVar2, gadVar == gadVar3);
            }
            Integer num = ehsVar.b;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int i = ((df90) next).f5989a;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            df90 df90Var = (df90) next;
            String strValueOf2 = df90Var != null ? String.valueOf(df90Var.f5989a) : null;
            String str7 = strValueOf2 == null ? "" : strValueOf2;
            String strValueOf3 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : String.valueOf(tf90Var2.b);
            String str8 = strValueOf3 == null ? "" : strValueOf3;
            String strValueOf4 = (df90Var == null || (tf90Var = df90Var.b) == null) ? null : String.valueOf(tf90Var.c);
            String str9 = strValueOf4 == null ? "" : strValueOf4;
            if (str8.length() > 0 && str9.length() > 0) {
                pz40 pz40Var = s6t0.f31722a;
                return new n5l0(str8, str9, str7, new y3d(z2 ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : s6t0.b().f33626a.getSecondary()), new y3d(z ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : s6t0.b().f33626a.getTextPrimary()), true, false);
            }
        }
        return null;
    }

    public static final n5l0 J(ygs ygsVar, ctf0 ctf0Var) {
        ygsVar.getClass();
        ctf0Var.getClass();
        boolean z = false;
        String strA = ctf0Var.b.a(R.string.total_tennis_column, Arrays.copyOf(new Object[0], 0));
        ehs ehsVar = ygsVar.i;
        int i = ehsVar != null ? ehsVar.C.f35394a : 0;
        int i2 = ehsVar != null ? ehsVar.C.b : 0;
        boolean z2 = ehsVar != null && ehsVar.u;
        if (ehsVar != null && ehsVar.v) {
            z = true;
        }
        if (ygsVar.w) {
            return null;
        }
        String strValueOf = String.valueOf(i);
        String strValueOf2 = String.valueOf(i2);
        pz40 pz40Var = s6t0.f31722a;
        return new n5l0(strValueOf, strValueOf2, strA, new y3d(z ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : s6t0.b().f33626a.getTextPrimary()), new y3d(z2 ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : s6t0.b().f33626a.getTextPrimary()), true, true);
    }

    public static final zgl0 K(aw20 aw20Var) {
        gfx it20Var;
        long j;
        long j2;
        s4d s4dVar = aw20Var.d;
        s4dVar.getClass();
        int iOrdinal = s4dVar.ordinal();
        if (iOrdinal == 0) {
            pz40 pz40Var = s6t0.f31722a;
            it20Var = new it20(s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary());
        } else if (iOrdinal == 1) {
            pz40 pz40Var2 = s6t0.f31722a;
            it20Var = new ht20(s6t0.b().f33626a.getTextPrimary());
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            pz40 pz40Var3 = s6t0.f31722a;
            it20Var = new ht20(s6t0.b().f33626a.getCustomizedMarket());
        }
        boolean z = it20Var instanceof ht20;
        if (z) {
            j = ((ht20) it20Var).f13611a;
        } else {
            if (!(it20Var instanceof it20)) {
                t9f.b();
                return null;
            }
            j = ((it20) it20Var).b;
        }
        if (z) {
            j2 = ((ht20) it20Var).f13611a;
        } else {
            if (!(it20Var instanceof it20)) {
                t9f.b();
                return null;
            }
            j2 = ((it20) it20Var).f15334a;
        }
        return new zgl0(j2, j);
    }

    public static final int L(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void a(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(-1058375537);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.K(jm40.b, 16.0f, 8.0f), 1.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 15, i, fqj0Var);
        }
    }

    public static final void b(mm40 mm40Var, ypq0 ypq0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        ypq0 ypq0Var2 = ypq0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1415039185);
        int i2 = i | 6 | (fetVar2.g(ypq0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 8.0f, 0.0f, 8.0f, 4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVarI);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            String str = ypq0Var2.b;
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarD, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(y9q0VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110588);
            ypq0Var2 = ypq0Var;
            v8q0.a(ypq0Var2.f43043a, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.d(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary60(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            j6n.h(ypq0Var2.c, ypq0Var2.d, o7k0.y(new ecu0(gqw0.k), null, 3), 0, 0, fetVar2, 0, 24);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, ypq0Var2, i, (byte) 26);
        }
    }

    public static final void c(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        float f3;
        long j;
        fetVar.g0(195713493);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f4 = f + f2;
            float f5 = 0.0f;
            if (f4 == 0.0f) {
                f3 = 0.0f;
            } else {
                f3 = f == f2 ? 1.0f : f / f4;
            }
            if (f4 != 0.0f) {
                f5 = f == f2 ? 1.0f : f2 / f4;
            }
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long jM79getBlue0d7_KjU = StaticColors.INSTANCE.m79getBlue0d7_KjU();
            long jM129getWhite400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m129getWhite400d7_KjU();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            boolean zF = fetVar.f(jM129getWhite400d7_KjU) | fetVar.d(f3) | fetVar.f(jM79getBlue0d7_KjU);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                u9c u9cVar = new u9c(jM129getWhite400d7_KjU, f3, jM79getBlue0d7_KjU, (byte) 1);
                j = jM79getBlue0d7_KjU;
                fetVar.o0(u9cVar);
                objP = u9cVar;
            } else {
                j = jM79getBlue0d7_KjU;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarC, (Function1) objP));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC2 = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            boolean zF2 = fetVar.f(jM129getWhite400d7_KjU) | fetVar.d(f5) | fetVar.f(j);
            Object objP2 = fetVar.P();
            if (zF2 || objP2 == cl5Var) {
                u9c u9cVar2 = new u9c(jM129getWhite400d7_KjU, f5, j, (byte) 6);
                fetVar.o0(u9cVar2);
                objP2 = u9cVar2;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarC2, (Function1) objP2));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vil(mm40Var, f, f2, i, (byte) 4);
        }
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1389471929);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(24.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new tr20(b);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 818085888, WarningHeader.MULTICAST_NOT_AVAILABLE);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gn8(mm40Var, ugdVar, i, (byte) 4);
        }
    }

    public static final void e(ywv0 ywv0Var, l7m0 l7m0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        ywv0 ywv0Var2 = ywv0Var;
        l7m0 l7m0Var2 = l7m0Var;
        ywv0Var2.getClass();
        l7m0Var2.getClass();
        function0.getClass();
        fetVar.g0(-1256572098);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ywv0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new ufk0();
                fetVar.o0(objP);
            }
            ufk0 ufk0Var = (ufk0) objP;
            boolean zI = fetVar.i(ufk0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new cd60(ufk0Var, b);
                fetVar.o0(objP2);
            }
            m0x0.o(ufk0Var, (Function1) objP2, fetVar);
            boolean zI2 = fetVar.i(ufk0Var) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                Object jv0Var = new jv0(ufk0Var, ywv0Var2, l7m0Var2, function0, null);
                ywv0Var2 = ywv0Var2;
                l7m0Var2 = l7m0Var2;
                fetVar.o0(jv0Var);
                objP3 = jv0Var;
            }
            m0x0.u(ufk0Var, ywv0Var2, l7m0Var2, (Function2) objP3, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) ywv0Var2, (Object) l7m0Var2, (Object) function0, i, (byte) 20);
        }
    }

    public static final void f(mm40 mm40Var, List list, Function0 function0, fet fetVar, int i) {
        list.getClass();
        function0.getClass();
        fetVar.g0(393943659);
        int i2 = i | 6 | (fetVar.g(list) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else {
            if (list.isEmpty()) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new k5d0(list, function0, i);
                    return;
                }
                return;
            }
            c9x.i(u1c.M(-1683563512, new j5d0(list, function0), fetVar), fetVar, 6);
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new r93(mm40Var2, list, function0, i, (byte) 13);
        }
    }

    public static final void g(zfg0 zfg0Var, fet fetVar, int i) {
        zfg0Var.getClass();
        fetVar.g0(-629342660);
        int i2 = (fetVar.i(zfg0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            d9x.w(null, zfg0Var.f44299a, fetVar, 64, 1);
            zcl zclVar = qmk.f28987a;
            d9x.w(s5x0.L(jm40Var, 0.0f, 4.0f, 1), zfg0Var.b, fetVar, 64, 0);
            d9x.w(null, zfg0Var.c, fetVar, 64, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dke0(zfg0Var, i, (byte) 19);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, boolean z) {
        fet fetVar2;
        fetVar.g0(-1918752799);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.L(jm40.b, 0.0f, 24.0f, 1), 16.0f), 96.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            if (z) {
                fetVar.e0(1100498771);
                fetVar2 = fetVar;
                jcb.v(null, 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), fetVar2, 0, 1);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(1100644843);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(z, mm40Var, i, (byte) 14);
        }
    }

    public static final void i(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(-1450708303);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 94.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 4);
        }
    }

    public static final void j(mm40 mm40Var, fak0 fak0Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-893872766);
        int i2 = i | 6 | (fetVar.g(fak0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        int i3 = i2 | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                fetVar.e0(-566120355);
                vdb.G(fak0Var, function1, fetVar, (i3 & 126) | ((i3 >> 3) & 896));
                fetVar.r(false);
            } else {
                fetVar.e0(-565920870);
                slb.h(fak0Var, function1, fetVar, (i3 & 126) | ((i3 >> 3) & 896));
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hmo(mm40Var2, fak0Var, z, function1, i);
        }
    }

    public static final void k(o4m0 o4m0Var, fet fetVar, int i) {
        o4m0 o4m0Var2;
        float f;
        fetVar.g0(-366684517);
        int i2 = i | (fetVar.g(o4m0Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            k82 k82Var = new k82(xfn.a(fetVar).c, (byte) 5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(knx.Q(jm40Var, k82Var), 1.0f);
            float f2 = xfn.a(fetVar).c;
            if (o4m0Var.c) {
                fetVar.e0(-196492911);
                float f3 = xfn.a(fetVar).c;
                fetVar.r(false);
                f = f3;
            } else {
                fetVar.e0(-196491807);
                fetVar.r(false);
                zcl zclVar = qmk.f28987a;
                f = 0.0f;
            }
            mm40 mm40VarN = s5x0.N(mm40VarD, f2, 0.0f, f, 0.0f, 10);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE0 = o2e.e0(jr8Var.b(jm40Var, zx7Var), "STANDINGS_ROW_TEST_TAG");
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarN2 = s5x0.N(mm40VarE0, 44.0f, 0.0f, 0.0f, 0.0f, 14);
            lh80 lh80VarU = s5x0.u(40.0f, 0.0f, qmk.a(fetVar).c, 0.0f, 10);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new j1l0(o4m0Var, (byte) 12);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarN2, null, lh80VarU, false, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            o4m0Var2 = o4m0Var;
            wgm0.l(0, fetVar, o4m0Var2.f24645a, jr8Var.b(jm40Var, zx7Var));
            fetVar.r(true);
        } else {
            o4m0Var2 = o4m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new edk0(o4m0Var2, i, (byte) 21);
        }
    }

    public static boolean l(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String m(nq90 nq90Var) {
        if (nq90Var != null) {
            if (nq90Var instanceof kq90) {
                int i = cy7.f5159a;
                kq90 kq90Var = (kq90) nq90Var;
                String str = kq90Var.d;
                boolean zD = cy7.d(str);
                String str2 = kq90Var.g;
                return zD ? w6x.q(str2, "+ ", str) : ua80.i("+", str2, Separators.SP, str);
            }
            if (nq90Var instanceof hq90) {
                hq90 hq90Var = (hq90) nq90Var;
                String str3 = hq90Var.d;
                return ohs0.n(hq90Var.c, str3.length() > 0 ? kng0.l(" (", str3, Separators.RPAREN) : "");
            }
        }
        return nq90Var.getTitle();
    }

    public static final int n(cp cpVar, boolean z) {
        Context context = cpVar.w;
        return z ? m5d.b(R.attr.uikitPrimary, context) : m5d.b(R.attr.uikitTextPrimary, context);
    }

    public static final ArrayList o(long j, List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c280(vsm0.s(j, (String) it.next()), R.drawable.ic_glyph_placeholder_player));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList2.add(new c280("", R.drawable.ic_glyph_placeholder_player));
        }
        return arrayList2;
    }

    public static final long p(gad gadVar, gad gadVar2, boolean z) {
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            return StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        if (gadVar == gadVar2) {
            pz40 pz40Var2 = s6t0.f31722a;
            return s6t0.b().f33626a.getTextPrimary();
        }
        pz40 pz40Var3 = s6t0.f31722a;
        return s6t0.b().f33626a.getSecondary();
    }

    public static boolean q(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object r(Context context, qa10 qa10Var, String str, String str2, String str3, String str4, zje zjeVar) {
        iff0 iff0Var;
        String str5;
        String str6;
        String str7;
        Context context2;
        Context context3;
        Object objD0;
        String str8;
        fa10 fa10Var;
        String str9;
        Object objD1;
        if (zjeVar instanceof iff0) {
            iff0Var = (iff0) zjeVar;
            int i = iff0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                iff0Var.n = i - Integer.MIN_VALUE;
            } else {
                iff0Var = new iff0(zjeVar);
            }
        } else {
            iff0Var = new iff0(zjeVar);
        }
        Object objP = iff0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = iff0Var.n;
        byte b = 1;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objP);
            sb10 sb10VarS = s(context, qa10Var, str4);
            iff0Var.i = context;
            str5 = str;
            iff0Var.j = str5;
            iff0Var.k = str2;
            str6 = str3;
            iff0Var.l = str6;
            iff0Var.n = 1;
            n5a n5aVar = new n5a(1, pnx.b(iff0Var));
            n5aVar.r();
            sb10VarS.b(new hff0(n5aVar, (byte) 0));
            sb10VarS.a(new hff0(n5aVar, b));
            objP = n5aVar.p();
            if (objP != wneVar) {
                str7 = str2;
                context2 = context;
            }
            return wneVar;
        }
        if (i2 == 1) {
            String str10 = (String) iff0Var.l;
            String str11 = iff0Var.k;
            String str12 = iff0Var.j;
            context2 = (Context) iff0Var.i;
            z1x.P(objP);
            str6 = str10;
            str7 = str11;
            str5 = str12;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fa10 fa10Var2 = (fa10) iff0Var.i;
                z1x.P(objP);
                return fa10Var2;
            }
            fa10Var = (fa10) iff0Var.l;
            str9 = iff0Var.k;
            str8 = iff0Var.j;
            context3 = (Context) iff0Var.i;
            z1x.P(objP);
        }
        iff0Var.i = fa10Var;
        iff0Var.j = null;
        iff0Var.k = null;
        iff0Var.l = null;
        iff0Var.n = 3;
        if (fa10Var.f.isEmpty()) {
            objD1 = Unit.f46060a;
        } else {
            rwj rwjVar = tvk.f34603a;
            String str13 = str8;
            Context context4 = context3;
            objD1 = qjj.d0(dvj.c, new ah0((Object) fa10Var, (Object) context4, str13, str9, (yje) null, (byte) 15), iff0Var);
            if (objD1 != wneVar) {
                objD1 = Unit.f46060a;
            }
        }
        if (objD1 != wneVar) {
            return wneVar;
        }
        return fa10Var;
        fa10 fa10Var3 = (fa10) objP;
        iff0Var.i = context2;
        iff0Var.j = str7;
        iff0Var.k = str6;
        iff0Var.l = fa10Var3;
        iff0Var.n = 2;
        if (fa10Var3.d.isEmpty()) {
            objD0 = Unit.f46060a;
            context3 = context2;
        } else {
            rwj rwjVar2 = tvk.f34603a;
            Context context5 = context2;
            context3 = context5;
            objD0 = qjj.d0(dvj.c, new qkb0(fa10Var3, context5, str5, yjeVar, (byte) 6), iff0Var);
            if (objD0 != wneVar) {
                objD0 = Unit.f46060a;
            }
        }
        if (objD0 != wneVar) {
            str8 = str7;
            fa10Var = fa10Var3;
            str9 = str6;
            iff0Var.i = fa10Var;
            iff0Var.j = null;
            iff0Var.k = null;
            iff0Var.l = null;
            iff0Var.n = 3;
            if (fa10Var.f.isEmpty()) {
                objD1 = Unit.f46060a;
            } else {
                rwj rwjVar3 = tvk.f34603a;
                String str14 = str8;
                Context context6 = context3;
                objD1 = qjj.d0(dvj.c, new ah0((Object) fa10Var, (Object) context6, str14, str9, (yje) null, (byte) 15), iff0Var);
                if (objD1 != wneVar) {
                    objD1 = Unit.f46060a;
                }
            }
            if (objD1 != wneVar) {
                return fa10Var;
            }
        }
        return wneVar;
    }

    public static final sb10 s(Context context, qa10 qa10Var, String str) {
        if (qa10Var instanceof pa10) {
            if (!Intrinsics.d(str, "__LottieInternalDefaultCacheKey__")) {
                return ka10.f(context, ((pa10) qa10Var).f26634a, str);
            }
            int i = ((pa10) qa10Var).f26634a;
            return ka10.f(context, i, ka10.l(i, context));
        }
        if (!(qa10Var instanceof oa10)) {
            t9f.b();
            return null;
        }
        byte b = 1;
        if (!Intrinsics.d(str, "__LottieInternalDefaultCacheKey__")) {
            String str2 = ((oa10) qa10Var).f24908a;
            HashMap map = ka10.f17941a;
            return ka10.a(str, new ha10(context.getApplicationContext(), str2, str, b), null);
        }
        String str3 = ((oa10) qa10Var).f24908a;
        HashMap map2 = ka10.f17941a;
        String strConcat = "asset_".concat(str3);
        return ka10.a(strConcat, new ha10(context.getApplicationContext(), str3, strConcat, b), null);
    }

    public static final v0h0 t(Function1 function1, Function2 function2) {
        return qxw.L(new lj00(function1, (byte) 12), new qyl(function2, (byte) 2));
    }

    public static final void u(t9k0 t9k0Var, bv3 bv3Var, int i) {
        while (true) {
            int i2 = t9k0Var.v;
            if (i > i2 && i < t9k0Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            t9k0Var.N();
            if (t9k0Var.x(t9k0Var.v)) {
                bv3Var.l();
            }
            t9k0Var.i();
        }
    }

    public static final y1h0 v(o470 o470Var, List list, List list2, List list3) {
        int size = list2.size();
        y1h0 h3k0Var = null;
        for (int i = 0; i < size; i++) {
            h3k0Var = ((i2h0) list2.get(i)).a(o470Var, list);
            if (h3k0Var != null) {
                break;
            }
        }
        if (h3k0Var == null) {
            h3k0Var = new h3k0(((ob50) CollectionsKt.d0(list)).b, (ob50) CollectionsKt.d0(list), CollectionsKt.P(1, list));
        }
        int size2 = list3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (list3.get(i2) != null) {
                hny.b();
                return null;
            }
            h3k0Var = h3k0Var instanceof pf80 ? (pf80) h3k0Var : null;
            h3k0Var.getClass();
        }
        return h3k0Var;
    }

    public static final na10 w(qa10 qa10Var, fet fetVar) {
        fetVar.f0(-1248473602);
        byte b = 3;
        bk9 bk9Var = new bk9(b, null, b);
        Context context = (Context) fetVar.k(dy2.b);
        fetVar.f0(1388713953);
        boolean zG = fetVar.g(qa10Var);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = androidx.compose.runtime.e.e(new na10());
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        fetVar.r(false);
        fetVar.f0(1388714244);
        boolean zG2 = fetVar.g(qa10Var) | fetVar.g("__LottieInternalDefaultCacheKey__");
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == cl5Var) {
            objP2 = s(context, qa10Var, "__LottieInternalDefaultCacheKey__");
            fetVar.o0(objP2);
        }
        fetVar.r(false);
        m0x0.v(qa10Var, "__LottieInternalDefaultCacheKey__", new gb2(bk9Var, context, qa10Var, pz40Var, null), fetVar);
        na10 na10Var = (na10) pz40Var.getValue();
        fetVar.r(false);
        return na10Var;
    }

    public static final void x(cp cpVar) {
        ((r2k) cpVar.u).f.setText(cpVar.w(R.string.two_values_with_space, String.valueOf(((h5c0) cpVar.u()).f12473a), ((h5c0) cpVar.u()).b));
    }

    public static final void y(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((r2k) yfu0Var).e.setVisibility(((h5c0) cpVar.u()).f ? 0 : 8);
        ((r2k) yfu0Var).d.setVisibility(((h5c0) cpVar.u()).f ? 0 : 8);
    }

    public static int z(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
