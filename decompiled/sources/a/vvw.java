package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.resources.UiText;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vvw {
    public static final fhj A(gre0 gre0Var, String str) {
        str.getClass();
        jtj jtjVarO = xtt0.o(str);
        ArrayList arrayList = (ArrayList) jtjVarO.b;
        boolean zD = Intrinsics.d(CollectionsKt.f0(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = z1x.K(gre0Var).size() + (zD ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(CollectionsKt.D0(arrayList, arrayList.size() - size));
        for (Pair pair : CollectionsKt.T0(z1x.K(gre0Var), CollectionsKt.E0(size, arrayList))) {
            hre0 hre0Var = (hre0) pair.f46059a;
            String str2 = (String) pair.b;
            hre0Var.getClass();
            if (hre0Var.f() && xtt0.i(hre0Var.p())) {
                Iterator it = pgi0.g(lgi0.e(pnk0.p, hre0Var.p()), 1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (xtt0.k((kiy) it.next())) {
                            linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                            fhy fhyVarO = hre0Var.p().o();
                            fhyVarO.getClass();
                            StringBuilder sb = new StringBuilder(TokenNames.L);
                            String strReplace = ((xgy) ((sgy) fhyVarO)).b.getName().replace('.', '/');
                            strReplace.getClass();
                            sb.append(strReplace);
                            sb.append(';');
                            arrayList2.add(sb.toString());
                            break;
                        }
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (zD) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new fhj(str, (Set) xun.f41520a) : new fhj(CollectionsKt.b0(arrayList2, "", Separators.LPAREN, Separators.RPAREN, null, 56).concat((String) jtjVarO.c), (Set) linkedHashSet);
    }

    public static long B(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final String C(iz30 iz30Var) {
        iz30Var.getClass();
        switch (iz30Var.ordinal()) {
            case 1:
                return "live";
            case 2:
                return "line";
            case 3:
                return "daily_express";
            case 4:
                return "stream";
            case 5:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 33:
            case 40:
            case 49:
            case 52:
            case 53:
            case 60:
            case 63:
            case 64:
            case 65:
            default:
                return "";
            case 6:
                return "results";
            case 7:
                return "bet_for_locals";
            case 8:
                return "tvbet";
            case 9:
                return "all_games";
            case 10:
                return "bonuses";
            case 11:
                return "cashback";
            case 12:
                return "favorite";
            case 13:
                return "secur";
            case 14:
                return "promotions";
            case 15:
                return "toto";
            case 16:
                return "finbets";
            case 17:
                return "bet_constructor";
            case 18:
                return "coupon_scanner";
            case 20:
                return "notifications";
            case 21:
                return "support";
            case 22:
                return ParameterNames.INFO;
            case 24:
                return "auth";
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return "telegram_bot";
            case 32:
                return "cyber";
            case 34:
                return "my_aggregator";
            case 35:
                return "categories";
            case 36:
                return "tournament";
            case 37:
                return "promo_aggregator";
            case 38:
                return "promo";
            case 39:
                return "bill_management";
            case 41:
                return "quick_games";
            case 42:
            case 55:
                return "aggregator_slots";
            case 43:
            case 57:
                return "aggregator_live";
            case 44:
                return "virtual";
            case 45:
                return "providers";
            case 46:
                return "promocodes";
            case 47:
                return "champions_club";
            case 48:
                return "sport_cashback";
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return "swipex";
            case 51:
                return "jackpot";
            case 54:
                return "call";
            case 56:
                return "responsible_gambling";
            case 58:
                return "brand_live";
            case 59:
                return "aviator";
            case 61:
                return "fast_bet";
            case 62:
                return "loto";
            case 66:
                return "polybet";
        }
    }

    public static final String D(f240 f240Var) {
        f240Var.getClass();
        if (f240Var instanceof c240) {
            c240 c240Var = (c240) f240Var;
            long j = c240Var.d;
            if (j == 534) {
                return "aggregator_aviatrix";
            }
            if (j == 24) {
                return "aggregator_legion_poker";
            }
            if (j == 65) {
                return "aggregator_vulkan";
            }
            return j == 150 ? "aggregator_jetx" : C(c240Var.b);
        }
        if (!(f240Var instanceof d240)) {
            return C(f240Var.m());
        }
        d240 d240Var = (d240) f240Var;
        long j2 = d240Var.d;
        if (j2 == 1) {
            return "aggregator_slots";
        }
        if (j2 == 37) {
            return "aggregator_live";
        }
        if (j2 == 51) {
            return "aggregator_tv_games";
        }
        if (j2 == 47 || j2 == 8) {
            return "bingo";
        }
        if (j2 == 12) {
            return "aggregator_fish_hunt";
        }
        if (j2 == 66) {
            return "aggregator_scratch";
        }
        if (j2 == 149) {
            return "aggregator_crush";
        }
        if (j2 == 41) {
            return "aggregator_virtual_sport";
        }
        if (j2 == 49) {
            return "keno";
        }
        if (j2 == 151) {
            return "aggregator_asian";
        }
        if (j2 == 142) {
            return "tvbet";
        }
        return j2 == 175 ? "aggregator_fast_bet" : C(d240Var.b);
    }

    public static final tvw E(z0w z0wVar) {
        String string;
        long j = z0wVar.t;
        if (j == 95) {
            return new svw(R.drawable.ic_nav_bet_constructor);
        }
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        return new rvw(string);
    }

    public static final wt20 F(hw20 hw20Var, boolean z) {
        return new wt20(0, hw20Var.b, hw20Var.f13751a, z);
    }

    public static final mb90 G(n3w n3wVar, ctf0 ctf0Var, boolean z) {
        String strA;
        n3wVar.getClass();
        ctf0Var.getClass();
        e4f e4fVar = n3wVar.l;
        lb90 lb90Var = n3wVar.q;
        lb90 lb90Var2 = lb90.b;
        boolean z2 = false;
        if (lb90Var == lb90Var2 && (e4fVar == e4f.e || e4fVar == e4f.f)) {
            strA = ctf0Var.b.a(R.string.history_payout_title, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = (lb90Var == lb90Var2 && e4fVar == e4f.c) ? ctf0Var.b.a(R.string.history_possible_payout_title, Arrays.copyOf(new Object[0], 0)) : "";
        }
        double d = n3wVar.r;
        double d2 = n3wVar.s;
        String str = n3wVar.g;
        if (lb90Var != lb90Var2 || (e4fVar != e4f.e && e4fVar != e4f.f)) {
            d = (lb90Var == lb90Var2 && e4fVar == e4f.c) ? d2 : 0.0d;
        }
        pn40 pn40Var = pn40.f27267a;
        String strD = pn40.d(d, str, p3u0.c);
        if (lb90Var == lb90Var2 && Intrinsics.d(n3wVar.z1, hxu.h) && z) {
            z2 = true;
        }
        return new mb90(ctf0.b((e4fVar == e4f.e || e4fVar == e4f.f) ? R.attr.uikitStaticGreen : R.attr.uikitTextPrimary, ctf0Var), strA, strD, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final yy90 H(bz90 bz90Var) {
        ?? arrayList;
        List list;
        String string;
        jz90 jz90Var = bz90Var.d;
        List list2 = bz90Var.f3455a;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(dnm0.q((gip0) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        Integer num = bz90Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = bz90Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (jz90Var == null || (list = jz90Var.f17400a) == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            r48 r48Var = (r48) it2.next();
            String str = r48Var.f29823a;
            String str2 = str != null ? str : "";
            List list3 = r48Var.b;
            if (list3 == null) {
                list3 = iun.f15405a;
            }
            arrayList2.add(new o48(str2, list3));
        }
        List<um90> list4 = jz90Var.b;
        if (list4 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
        for (um90 um90Var : list4) {
            String str3 = um90Var.f35909a;
            if (str3 != null) {
                StringBuilder sb = new StringBuilder(ujn.h);
                String strConcat = "sfiles/statistics/tennis/".concat(str3);
                if (strConcat.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
                    sb.setLength(0);
                    sb.append(strConcat);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(strConcat, '/'));
                }
                string = sb.toString();
            } else {
                string = "";
            }
            String str4 = um90Var.b;
            if (str4 == null) {
                str4 = "";
            }
            arrayList3.add(new nm90(string, str4));
        }
        return new yy90(arrayList, iIntValue, iIntValue2, new gz90(arrayList2, arrayList3));
    }

    public static final lnd0 I(nnd0 nnd0Var, String str, boolean z, ctf0 ctf0Var, String str2, boolean z2) {
        String upperCase;
        str.getClass();
        ctf0Var.getClass();
        if (str2 == null) {
            str2 = "";
        }
        boolean z3 = nnd0Var.e && !z;
        pn40 pn40Var = pn40.f27267a;
        double d = nnd0Var.b;
        p3u0 p3u0Var = p3u0.c;
        String strC = pn40.c(d, p3u0Var);
        String strC2 = pn40.c(nnd0Var.c, p3u0Var);
        String strC3 = pn40.c(nnd0Var.d, p3u0Var);
        if (nnd0Var.f) {
            upperCase = ctf0Var.b.a(R.string.maximum, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        return new lnd0(str2, new epd0(strC, strC2, strC3, str, upperCase, z3), nnd0Var.f23816a && z2);
    }

    public static final i9h0 J(oho ohoVar) {
        ohoVar.getClass();
        int iOrdinal = ohoVar.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? i9h0.f14386a : i9h0.b;
        }
        return i9h0.f14386a;
    }

    public static final i9l0 K(d0t d0tVar, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, v5l0 v5l0Var, v12 v12Var, boolean z3) {
        gga ggaVarG0;
        ctf0Var.getClass();
        v5l0Var.getClass();
        boolean z4 = d0tVar.C;
        List list = d0tVar.K;
        m5l0 m5l0Var = l5l0.f19463a;
        i5l0 i5l0Var = i5l0.f14197a;
        if (!z4 || d0tVar.z) {
            if (list.isEmpty()) {
                m5l0Var = i5l0Var;
            }
            ggaVarG0 = zvw.g0(d0tVar, v5l0Var, m5l0Var, ctf0Var, z);
        } else {
            ggaVarG0 = cww.R(d0tVar, v5l0Var, list.isEmpty() ? i5l0Var : m5l0Var, ctf0Var, z, y78Var, z2, z3);
        }
        return new i9l0(ggaVarG0, v12Var);
    }

    public static final void a(mm40 mm40Var, pz40 pz40Var, xcz xczVar, hh80 hh80Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        int i2;
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(-1627677336);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            bww.d(mm40Var, pz40Var, true, hh80Var, xczVar, u1c.M(-1913061063, new hgx(xdrVar, b), fetVar), u1c.M(1271021452, new igx(backgroundContent, qmk.a(fetVar).d, function1, function2, (byte) 0), fetVar), fre0.b, fetVar, (i2 & 14) | 14352768 | (i2 & 112) | (i2 & 7168) | ((i2 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jgx(mm40Var, pz40Var, xczVar, hh80Var, function1, function2, xdrVar, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, l2h l2hVar, String str, Function0 function0, fet fetVar, int i) {
        int i2;
        String str2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(1017645647);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l2hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new a2z(function0, (byte) 2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40Var, null, null, false, null, (Function0) objP, fetVar, i2 & 14, 15);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            l7m0 l7m0VarB = d43.b(l2hVar.equals(j2h.f15779a) ? 180.0f : 0.0f, ro4.m0(150, 0, null, 6), null, null, fetVar, 48, 28);
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 >> 6) & 14, 0, 131066);
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f);
            boolean zG = fetVar.g(l7m0VarB);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ufp(l7m0VarB, (byte) 13);
                fetVar.o0(objP2);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_up_small, 0, fetVar), null, i4w0.T(mm40VarN, (Function1) objP2), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 10, i, (Object) mm40Var, (Object) l2hVar, (Object) str, (Object) function0);
        }
    }

    public static final void c(mm40 mm40Var, z380 z380Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(2056186788);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(z380Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            iym0.e(i2 & 14, fetVar, mm40Var, z380Var.f43708a);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, z380Var, i, (byte) 25);
        }
    }

    public static final void d(mm40 mm40Var, k680 k680Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        k680Var.getClass();
        fetVar.g0(-70929587);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(k680Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            int i3 = i2 & 896;
            e(rsm0.w(R.string.edit_coupon_maximum_coef, 0, fetVar), k680Var.f17756a, y9q0Var, fetVar, i3);
            e(rsm0.w(R.string.edit_coupon_optional_coef, 0, fetVar), k680Var.b, y9q0Var, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, k680Var, y9q0Var, i, (byte) 2);
        }
    }

    public static final void e(String str, j43 j43Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-2059708238);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j43Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2;
            v8q0.a(str, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, new n05(idm0.t(8), y9q0Var.f42262a.b, idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, i2 & 14, ((i2 << 15) & 29360128) | 24960, 110580);
            fetVar2 = fetVar;
            if (j43Var.d) {
                fetVar2.e0(1276012912);
                dw9.x(o7k0.e(o7k0.s(jm40Var, 72.0f), 14.0f), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
            } else {
                fetVar2.e0(1276250093);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarD = g1t0.d();
                o05 o05Var = o05.f24405a;
                kkb.q(x7zVar, j43Var, new ay6(y9q0VarD, new fy6(), 699), fetVar2, i3 & 112);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(str, j43Var, y9q0Var, i, (byte) 3);
        }
    }

    public static final void f(mm40 mm40Var, k680 k680Var, fet fetVar, int i) {
        mm40 mm40Var2;
        k680Var.getClass();
        fetVar.g0(-10773119);
        int i2 = i | 6 | (fetVar.g(k680Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var2, 8.0f, 0.0f, 2), 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            mm40 mm40VarK = s5x0.K(mm40Var2, 12.0f, 8.0f);
            pz40 pz40Var = s6t0.f31722a;
            d(mm40VarK, k680Var, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var2, k680Var, i, (byte) 26);
        }
    }

    public static final void g(gfa0 gfa0Var, boolean z, fet fetVar, int i) {
        int i2;
        mm40 mm40VarD;
        fet fetVar2 = fetVar;
        fetVar2.g0(506553633);
        int i3 = i & 6;
        y5d y5dVar = y5d.f42040a;
        if (i3 == 0) {
            i2 = (fetVar2.g(y5dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(gfa0Var) : fetVar2.i(gfa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (z) {
                mm40 mm40VarA = y5dVar.a(jm40Var, gqw0.n);
                zcl zclVar = qmk.f28987a;
                mm40VarD = o7k0.s(mm40VarA, 352.0f);
            } else {
                mm40VarD = o7k0.d(jm40Var, 1.0f);
            }
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(s5x0.L(jm40Var, 8.0f, 0.0f, 2).e(mm40VarD), 32.0f), "PLAYERS_COMPOSITION_TEAM_INFO");
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
            n(gfa0Var.b, fetVar2, 0);
            mm40 mm40VarE1 = o2e.e0(s5x0.L(jm40Var, 8.0f, 0.0f, 2).e(new x7z(1.0f, true)), "TeamName");
            String str = gfa0Var.f11199a;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE1, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            v8q0.a(gfa0Var.c, o2e.e0(jm40Var, "PLAYERS_COMPOSITION_TEAM_INFO_RANK_TEXT"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(gfa0Var, z, i, (byte) 6);
        }
    }

    public static final void h(mm40 mm40Var, rfc0 rfc0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        rfc0Var.getClass();
        function1.getClass();
        fetVar.g0(-1899136112);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(rfc0Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Boolean.valueOf(rfc0Var.b);
                fetVar.o0(objP);
            }
            obc.d(h36.f12370a.a(cqqVar), u1c.M(-912904112, new lfc0(rfc0Var, function1, mm40Var, ((Boolean) objP).booleanValue()), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) rfc0Var, (Object) cqqVar, function1, i, (byte) 3);
        }
    }

    public static final void i(String str, a4x a4xVar, fet fetVar, int i) {
        str.getClass();
        a4xVar.getClass();
        fetVar.g0(-745053784);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarY0 = q8a.y0(jm40.b, enx.b);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY0);
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
            zdx.m(str, fetVar, i2 & 14);
            fetVar.e0(-637785606);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                j((ckg0) it.next(), fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new djg0(str, a4xVar, i, b);
        }
    }

    public static final void j(ckg0 ckg0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-935579393);
        int i2 = i | (fetVar2.g(ckg0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 36.0f);
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new a7g0(ckg0Var, (byte) 5);
                fetVar2.o0(objP);
            }
            kkb.p(0, fetVar2, mm40VarN, (Function0) objP);
            mm40 mm40VarE = o7k0.e(q8a.y0(jm40Var, enx.b), 36.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
            String str = ckg0Var.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24576, 114682);
            fetVar2 = fetVar;
            j6n.h(ckg0Var.e, ckg0Var.d ? dqo0.f6527a : lso0.f20590a, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 0, 0, fetVar2, 0, 24);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dke0(ckg0Var, i, (byte) 22);
        }
    }

    public static final void k(Function1 function1, vhj0 vhj0Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        vhj0Var.getClass();
        fetVar.g0(-1278880951);
        byte b = 2;
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(vhj0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = hij0.f13115a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new thj0(b);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            byte b2 = 3;
            if (z || objP3 == cl5Var) {
                objP3 = new gb(vhj0Var, function1, b2);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) vhj0Var, mm40Var, i, (byte) 10);
        }
    }

    public static final void l(mm40 mm40Var, hjk0 hjk0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        hjk0 hjk0Var2 = hjk0Var;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        hjk0Var2.getClass();
        function2.getClass();
        fetVar2.g0(1902222641);
        int i2 = i | (fetVar2.g(hjk0Var2) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            float f = 8.0f;
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            List list = hjk0Var2.f13164a;
            int i3 = hjk0Var2.c;
            ArrayList arrayListK = CollectionsKt.K(list, i3);
            fetVar2.e0(1553223848);
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                Iterator it2 = it;
                thg0 thg0VarA = shg0.a(new qw3(f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                jm40 jm40Var2 = jm40Var;
                int i4 = i3;
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                Iterator itV = kng0.v(fetVar2, mm40VarC2, shdVar, 699945561, list2);
                while (itV.hasNext()) {
                    p6t0 p6t0Var = (p6t0) itV.next();
                    fetVar2.b0(-941729837, p6t0Var.getKey());
                    List list3 = list2;
                    int i5 = i4;
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    Iterator it3 = itV;
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar4);
                    jpm0.o(fetVar2, bh90VarM4, shdVar3);
                    vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar);
                    if (p6t0Var instanceof chk0) {
                        fetVar2.e0(-974134606);
                        gfx.r(o7k0.d(jm40Var2, 1.0f), (chk0) p6t0Var, function2, fetVar2, (i2 & 896) | 6);
                        z3 = false;
                        fetVar2.r(false);
                    } else if (p6t0Var instanceof ugk0) {
                        fetVar2.e0(-973732753);
                        cjx.a(o7k0.d(jm40Var2, 1.0f), (ugk0) p6t0Var, function2, fetVar2, (i2 & 896) | 6);
                        z3 = false;
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        fetVar2.e0(-973370363);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    fetVar2.r(z3);
                    list2 = list3;
                    i4 = i5;
                    itV = it3;
                }
                List list4 = list2;
                int i6 = i4;
                fetVar2.r(false);
                if (list4.size() < i6) {
                    fetVar2.e0(224586519);
                    int size = i6 - list4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = i7;
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        qxw.o(fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        i7 = i8 + 1;
                    }
                    z2 = true;
                    fetVar2.r(false);
                } else {
                    z2 = true;
                    fetVar2.e0(224760460);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
                function2 = function1;
                jm40Var = jm40Var2;
                i3 = i6;
                it = it2;
                f = 8.0f;
            }
            jm40 jm40Var3 = jm40Var;
            fetVar2.r(false);
            fetVar2.r(true);
            hjk0Var2 = hjk0Var;
            if (hjk0Var2.b) {
                fetVar2.e0(821808037);
                mm40 mm40VarD3 = o7k0.d(jm40Var3, 1.0f);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD3, 0.0f, 10.0f, 0.0f, 0.0f, 13);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarN);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM5, shdVar3);
                vqd.u(iHashCode5, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar);
                mm40 mm40VarN2 = s5x0.N(jm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                String strS = xsm0.s(R.string.choose_social_network, fetVar2);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                zfn zfnVar = zaq0.b;
                v8q0.a(strS, mm40VarN2, ((ThemeColors) fetVar2.k(zfnVar)).getWarning(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarG, fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                dww.c(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar2), null, o7k0.n(jm40Var3, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getWarning(), fetVar2, 56, 0);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(822690235);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, hjk0Var2, function1, i, (byte) 5);
        }
    }

    public static final void m(y5d y5dVar, mm40 mm40Var, j83 j83Var, j83 j83Var2, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        ugdVar.F(y5dVar, fetVar, Integer.valueOf((i & 14) | ((i >> 12) & 112)));
        int i2 = i >> 3;
        int i3 = i >> 6;
        int i4 = i3 & 896;
        w9x.s(mm40Var, j83Var, y9q0Var, fetVar, (i2 & 126) | i4);
        w9x.s(mm40Var, j83Var2, y9q0Var, fetVar, (i3 & 112) | (i2 & 14) | i4);
    }

    public static final void n(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(1022259581);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.f1;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 22.0f), str2, R.drawable.icon_globe_new, jM130getWhite600d7_KjU, pgeVar, fetVar2, ((i2 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 13, i, str2);
        }
    }

    public static void o(RecyclerView recyclerView, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        recyclerView.getClass();
        yrh yrhVar = new yrh(z ? recyclerView.getResources().getDimensionPixelSize(R.dimen.space_56) : 0);
        recyclerView.m(yrhVar);
        int i2 = ((cgx) tfx.B(recyclerView).f37357a.getValue()).f4335a;
        yrhVar.c = ((cgx) tfx.B(recyclerView).f37357a.getValue()).f4335a;
        recyclerView.b0();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0113  */
    /* JADX WARN: Code duplicated, block: B:35:0x0121  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139  */
    /* JADX WARN: Code duplicated, block: B:43:0x0140  */
    /* JADX WARN: Code duplicated, block: B:46:0x0150  */
    /* JADX WARN: Code duplicated, block: B:47:0x015b  */
    public static final void p(lc00 lc00Var, xxh0 xxh0Var, ctf0 ctf0Var, m9s m9sVar, boolean z) {
        vxh0 txh0Var;
        vxh0 txh0Var2;
        String str;
        wxh0 wxh0Var;
        int i;
        int i2;
        znq0 znq0Var;
        Long lValueOf;
        ctf0Var.getClass();
        m9sVar.getClass();
        List list = xxh0Var.f41659a;
        wxh0 wxh0Var2 = xxh0Var.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(z1x.F((tna0) it.next())));
        }
        List list2 = xxh0Var.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(z1x.F((tna0) it2.next())));
        }
        int iOrdinal = wxh0Var2.ordinal();
        if (iOrdinal == 0) {
            txh0Var = new txh0(ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0)));
        } else if (iOrdinal == 1) {
            txh0Var = new uxh0(ctf0Var.b.a(R.string.issuing_second_card, Arrays.copyOf(new Object[0], 0)));
        } else if (iOrdinal == 2) {
            txh0Var = new uxh0(ctf0Var.b.a(R.string.issuing_third_card, Arrays.copyOf(new Object[0], 0)));
        } else if (iOrdinal == 3) {
            txh0Var = new txh0(ctf0Var.b.a(R.string.first_player_wins, Arrays.copyOf(new Object[0], 0)));
        } else {
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    txh0Var2 = new txh0("");
                } else {
                    txh0Var = new txh0(ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[0], 0)));
                }
                qqs qqsVar = m9sVar.h;
                String str2 = qqsVar.b;
                str = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str2, new String[]{"-"}, false, 0, 6, null));
                if (str == null) {
                    str = "";
                }
                wxh0Var = wxh0.d;
                i = R.drawable.cybergame_seka_cards_bg;
                if (wxh0Var2 == wxh0Var) {
                    i2 = R.drawable.cybergame_seka_cards_win_bg;
                } else {
                    i2 = R.drawable.cybergame_seka_cards_bg;
                }
                pxh0 pxh0Var = new pxh0(str, i2);
                String str3 = (String) CollectionsKt.W(1, StringsKt__StringsKt.split$default(str2, new String[]{"-"}, false, 0, 6, null));
                String str4 = str3 != null ? str3 : "";
                if (wxh0Var2 == wxh0.e) {
                    i = R.drawable.cybergame_seka_cards_win_bg;
                }
                pxh0 pxh0Var2 = new pxh0(str4, i);
                long j = xxh0Var.d * 1000;
                znq0Var = qqsVar.k;
                if (znq0Var != null) {
                    lValueOf = Long.valueOf(znq0.f(znq0Var.f44687a));
                } else {
                    lValueOf = null;
                }
                lc00Var.add(new iyh0(arrayList, arrayList2, txh0Var2, pxh0Var, pxh0Var2, new gyh0(lValueOf, j), z));
            }
            txh0Var = new txh0(ctf0Var.b.a(R.string.second_player_wins, Arrays.copyOf(new Object[0], 0)));
        }
        txh0Var2 = txh0Var;
        qqs qqsVar2 = m9sVar.h;
        String str5 = qqsVar2.b;
        str = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str5, new String[]{"-"}, false, 0, 6, null));
        if (str == null) {
            str = "";
        }
        wxh0Var = wxh0.d;
        i = R.drawable.cybergame_seka_cards_bg;
        if (wxh0Var2 == wxh0Var) {
            i2 = R.drawable.cybergame_seka_cards_win_bg;
        } else {
            i2 = R.drawable.cybergame_seka_cards_bg;
        }
        pxh0 pxh0Var3 = new pxh0(str, i2);
        String str6 = (String) CollectionsKt.W(1, StringsKt__StringsKt.split$default(str5, new String[]{"-"}, false, 0, 6, null));
        if (str6 != null) {
        }
        if (wxh0Var2 == wxh0.e) {
            i = R.drawable.cybergame_seka_cards_win_bg;
        }
        pxh0 pxh0Var4 = new pxh0(str4, i);
        long j2 = xxh0Var.d * 1000;
        znq0Var = qqsVar2.k;
        if (znq0Var != null) {
            lValueOf = Long.valueOf(znq0.f(znq0Var.f44687a));
        } else {
            lValueOf = null;
        }
        lc00Var.add(new iyh0(arrayList, arrayList2, txh0Var2, pxh0Var3, pxh0Var4, new gyh0(lValueOf, j2), z));
    }

    public static int q(cf60 cf60Var, boolean z) {
        int i = cf60Var.b;
        int i2 = cf60Var.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) cf60Var.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static final CharSequence r(aus ausVar, Context context) {
        CharSequence charSequence = ausVar.f1494a;
        context.getClass();
        UiText.ByString byString = ausVar.b;
        if (byString.a(context).length() <= 0) {
            return charSequence;
        }
        return ((Object) byString.a(context)) + " \n " + ((Object) charSequence);
    }

    public static final lq0 s(float f, String str) {
        ijm ijmVar = new ijm(new qjm());
        kjm kjmVar = kjm.f18392a;
        yo0 yo0Var = yo0.e;
        zcl zclVar = qmk.f28987a;
        return new lq0(str, new zo0(s5x0.u(16.0f, f, 16.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), yo0Var), ijmVar, kjmVar);
    }

    public static final qgm0 t(b1u0 b1u0Var, List list, ctf0 ctf0Var, long j, boolean z) {
        String str;
        b1u0Var.getClass();
        list.getClass();
        ctf0Var.getClass();
        String str2 = b1u0Var.c;
        String strM = qim0.m(b1u0Var, list);
        if (kotlin.text.c.x(strM, ujn.h, false)) {
            str = strM;
        } else {
            if (strM.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(strM)) {
                    strM = String.format(Locale.ENGLISH, StringsKt.O(strM, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strM}, 2));
                    str = strM;
                }
            }
            str = "";
        }
        ngm0 ngm0Var = new ngm0(j, str2, str, z ? ctf0Var.b.a(R.string.valorant_win, Arrays.copyOf(new Object[0], 0)) : "");
        lsm0 lsm0Var = ctf0Var.b;
        return new qgm0(ngm0Var, dyb.g0(new vem0(lsm0Var.a(R.string.valorant_k, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_a, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_d, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_plus_minus, Arrays.copyOf(new Object[0], 0)), new eko0(j))));
    }

    public static final s6q0 u(String str, String str2, boolean z, String str3, oie oieVar) {
        t7q0 s7q0Var = str3.length() > 0 ? new s7q0(str3) : r7q0.f29989a;
        y5q0 y5q0Var = new y5q0(0, null, oieVar, 3);
        return new s6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, z, str3.length() > 0, y5q0Var, str2, null, 32000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long v(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (e710.f7312a[roundingMode.ordinal()]) {
            case 1:
                n7x.z(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    public static final Type w(gre0 gre0Var) {
        Type[] lowerBounds;
        if (gre0Var.isSuspend()) {
            Object objF0 = CollectionsKt.f0(gre0Var.x().a());
            ParameterizedType parameterizedType = objF0 instanceof ParameterizedType ? (ParameterizedType) objF0 : null;
            if (Intrinsics.d(parameterizedType != null ? parameterizedType.getRawType() : null, yje.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objW = tx3.W(actualTypeArguments);
                WildcardType wildcardType = objW instanceof WildcardType ? (WildcardType) objW : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) tx3.A(lowerBounds);
                }
            }
        }
        return null;
    }

    public static long x(long j, long j2) {
        n7x.y(j, "a");
        n7x.y(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean y(j jVar) {
        Iterator it = jVar.a().iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            ar20 ar20Var = ((j) it.next()).f15657a;
            if (Intrinsics.d(ar20Var, cy2.M)) {
                i++;
            } else {
                if (Intrinsics.d(ar20Var, cy2.W) ? true : Intrinsics.d(ar20Var, cy2.Z) ? true : Intrinsics.d(ar20Var, cy2.z) ? true : Intrinsics.d(ar20Var, cy2.j0)) {
                    continue;
                } else {
                    if (z && i > 1) {
                        return true;
                    }
                    i = 0;
                    z = true;
                }
            }
        }
        return false;
    }

    public static boolean z(y190 y190Var) {
        return !kotlin.text.c.n(y190Var.b(), ".class", true);
    }
}
