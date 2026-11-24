package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.view.inputmethod.HandwritingGesture;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchLabelPresetParams;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zjb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f44475a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static final String A(n3w n3wVar, ctf0 ctf0Var) {
        n3wVar.getClass();
        ctf0Var.getClass();
        s77 s77Var = n3wVar.c;
        String str = n3wVar.C1;
        String str2 = n3wVar.x;
        if (s77Var == s77.JACKPOT) {
            return ctf0Var.f(R.string.jackpot_word, new Object[0]);
        }
        if (str2.length() > 0) {
            return str2;
        }
        if (n3wVar.d == 95) {
            return ctf0Var.f(R.string.bet_constructor_title_v2, str);
        }
        return n3wVar.y == 1 ? str : ctf0Var.f(R.string.history_events_v2, Integer.valueOf(n3wVar.z));
    }

    public static final gbn B(Function1 function1) {
        return new gbn(new sfc((byte) 25), new tad(3, (byte) 10), new trb(function1, (byte) 23), qja.u);
    }

    public static final Pair C(String str) {
        if (StringsKt.O(str, Separators.RETURN, false)) {
            return new Pair(StringsKt.r0(str, Separators.RETURN), str);
        }
        return str.length() >= 150 ? new Pair(str.substring(0, 150).concat("…"), str) : new Pair(str, "");
    }

    public static final ydo D(wmr0 wmr0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        String str = wmr0Var.s;
        double d2 = wmr0Var.q;
        if (str.length() > 0 && d2 > 0.0d) {
            return E(str + ". " + ctf0Var.b.a(R.string.total_v2, Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
        }
        if (str.length() > 0 && d2 <= 0.0d) {
            return E(str);
        }
        if (str.length() != 0 || d2 <= 0.0d) {
            return null;
        }
        return E(ctf0Var.b.a(R.string.total_v2, Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
    }

    public static final ydo E(String str) {
        return new ydo(kng0.k("EventInfoLabelUiModel", str), str);
    }

    public static String F(int i) {
        if (i == 1) {
            return "VK";
        }
        if (i == 5) {
            return Payload.RESPONSE_OK;
        }
        if (i == 7) {
            return "Yandex";
        }
        if (i == 9) {
            return "Mail";
        }
        if (i == 11) {
            return "Google";
        }
        if (i == 13) {
            return "XCom";
        }
        if (i == 17) {
            return "Telegram";
        }
        if (i != 19) {
            return i != 31 ? "Unknown" : "Discord";
        }
        return "Apple_ID";
    }

    public static final String G(n3w n3wVar, ctf0 ctf0Var) {
        n3wVar.getClass();
        ctf0Var.getClass();
        if (n3wVar.F1 == 0.0d) {
            return n3wVar.G1 == 0.0d ? "" : ctf0Var.f(R.string.advance_with_colon, new Object[0]);
        }
        return ctf0Var.f(R.string.advance_conf_bet_row, new Object[0]);
    }

    public static final String H(n3w n3wVar, ctf0 ctf0Var, String str) {
        n3wVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        double d2 = n3wVar.F1;
        double d3 = n3wVar.G1;
        if (d2 != 0.0d) {
            pn40 pn40Var = pn40.f27267a;
            return pn40.d(d2, str, p3u0.c);
        }
        if (d3 == 0.0d) {
            return "";
        }
        Locale locale = Locale.ENGLISH;
        String strF = ctf0Var.f(R.string.advance_bet_value, new Object[0]);
        pn40 pn40Var2 = pn40.f27267a;
        p3u0 p3u0Var = p3u0.c;
        return String.format(locale, strF, Arrays.copyOf(new Object[]{pn40.d(d3, str, p3u0Var), pn40.d(n3wVar.B, str, p3u0Var)}, 2));
    }

    public static boolean J(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f44475a == null) {
            f44475a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            b = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return !ufx.F() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static void K(long j, j83 j83Var, boolean z, v6d0 v6d0Var) {
        if (z) {
            int i = o9q0.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(j83Var, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < j83Var.b.length() ? Character.codePointAt(j83Var, iCharCount2) : 10;
            if (bkb.b0(iCodePointBefore) && (bkb.a0(iCodePointAt) || bkb.Z(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(j83Var, iCharCount);
                    }
                } while (bkb.b0(iCodePointBefore));
                j = s7n0.e(iCharCount, iCharCount2);
            } else if (bkb.b0(iCodePointAt) && (bkb.a0(iCodePointBefore) || bkb.Z(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == j83Var.b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(j83Var, iCharCount2);
                    }
                } while (bkb.b0(iCodePointAt));
                j = s7n0.e(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        v6d0Var.invoke(new nmv(new vjn[]{new fsi0(i2, i2), new g6k(o9q0.d(j), 0)}));
    }

    public static final h5m L(int i, fet fetVar) {
        boolean z = (i & 1) == 0;
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new h5m(z);
            fetVar.o0(objP);
        }
        return (h5m) objP;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    public static final jlo0 N(v3g v3gVar, s8h s8hVar, List list, ctf0 ctf0Var, long j, boolean z) {
        ctf0Var.getClass();
        String strValueOf = String.valueOf(s8hVar.b);
        lc00 lc00VarB = kotlin.collections.a.b();
        boolean z2 = v3gVar.b;
        sjo0 sjo0Var = sjo0.f32312a;
        String str = s8hVar.c;
        String strQ = bkb.Q(s8hVar, list);
        if (!kotlin.text.c.x(strQ, ujn.h, false)) {
            if (strQ.length() == 0) {
                strQ = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(strQ)) {
                    strQ = "";
                } else {
                    strQ = String.format(Locale.ENGLISH, StringsKt.O(strQ, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strQ}, 2));
                }
            }
        }
        vlo0 vlo0Var = new vlo0(sjo0Var, str, strQ, z2 ? ctf0Var.b.a(R.string.cyber_win, Arrays.copyOf(new Object[0], 0)) : "", j);
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.cs2_kd, Arrays.copyOf(new Object[0], 0));
        eko0 eko0Var = new eko0(j);
        olo0 olo0Var = olo0.f25466a;
        lc00VarB.add(new tlo0(vlo0Var, dyb.g0(new mlo0(strA, eko0Var, olo0Var), new mlo0(lsm0Var.a(R.string.cs2_adr, Arrays.copyOf(new Object[0], 0)), new eko0(j), olo0Var), new mlo0(lsm0Var.a(R.string.cs2_kast, Arrays.copyOf(new Object[0], 0)), new eko0(j), olo0Var), new mlo0(lsm0Var.a(R.string.cs2_rating_new_abbreviation, Arrays.copyOf(new Object[0], 0)), new eko0(j), olo0Var))));
        List<w3g> list3 = v3gVar.c;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        for (w3g w3gVar : list3) {
            w3gVar.getClass();
            xlo0 xlo0Var = new xlo0(w3gVar.f38500a);
            String strN = w6x.n(w3gVar.b, w3gVar.c, "-");
            qek0 qek0Var = qek0.c;
            arrayList.add(new tlo0(xlo0Var, dyb.g0(new mlo0(strN, qek0Var, olo0Var), new mlo0(jeb.c0(String.valueOf(w3gVar.f)), qek0Var, olo0Var), new mlo0(jeb.c0(String.valueOf(w3gVar.e)).concat(Separators.PERCENT), qek0Var, olo0Var), new mlo0(jeb.c0(String.valueOf(w3gVar.g)), qek0Var, olo0Var))));
        }
        return new jlo0(strValueOf, cs0.f(lc00VarB, lc00VarB, arrayList), ulo0.f35883a, z);
    }

    public static final Integer O(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            default:
                return null;
        }
    }

    public static final la30 P(x9l x9lVar, m9s m9sVar) {
        m9sVar.getClass();
        yk5 yk5Var = mc6.b;
        qqs qqsVar = m9sVar.h;
        Integer numValueOf = Integer.valueOf(qqsVar.n);
        yk5Var.getClass();
        byte b2 = yk5.d(numValueOf).f21536a;
        int i = qqsVar.d;
        return new la30(b2, znq0.f(x9lVar.f40514a.f3777a.b), "", qem0.l(b2, i), qem0.l(b2, i));
    }

    public static final void a(mm40 mm40Var, String str, String str2, String str3, String str4, boolean z, boolean z2, a4x a4xVar, String str5, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(-1866508602);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(str3) ? 2048 : 1024) | (fetVar.g(str4) ? 16384 : 8192) | (fetVar.h(z) ? 131072 : 65536) | (fetVar.h(z2) ? 1048576 : 524288) | (fetVar.g(a4xVar) ? 8388608 : 4194304) | (fetVar.g(str5) ? 67108864 : 33554432);
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (str5.length() > 0) {
                fetVar.e0(-1399959213);
                long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                f1t0.a(null, str5, secondary, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, (i2 >> 21) & 112, 438265);
                fetVar.r(false);
            } else {
                fetVar.e0(-1399704238);
                fetVar.r(false);
            }
            p(null, str, str2, str3, str4, z, z2, fetVar, i2 & 4194288);
            fetVar2 = fetVar;
            q((i2 >> 18) & 112, fetVar2, a4xVar, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13));
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o69(mm40Var2, str, str2, str3, str4, z, z2, a4xVar, str5, i);
        }
    }

    public static final void b(final fq8 fq8Var, xpj0 xpj0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        final fq8 fq8Var2;
        xpj0 xpj0Var2;
        int i3;
        xpj0 xpj0VarF;
        function1.getClass();
        fetVar.g0(881030657);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(fq8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                i3 = i2 & (-113);
                xpj0VarF = dm40.f(fetVar);
            } else {
                fetVar.X();
                i3 = i2 & (-113);
                xpj0VarF = xpj0Var;
            }
            fetVar.s();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean z = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new dib(function1, (byte) 14);
                fetVar.o0(objP2);
            }
            xpj0 xpj0Var3 = xpj0VarF;
            fq8Var2 = fq8Var;
            ulb.i((Function0) objP2, null, false, null, null, xpj0Var3, null, u1c.M(-1747245405, new xdr() { // from class: a.yuc
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    fq8 fq8Var3 = fq8Var;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                wwb.i(null, fq8Var3.b, 0L, 0, 0L, fetVar2, 0, 29);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarJ = s5x0.J(jm40.b, 16.0f);
                                ao4 ao4Var = fq8Var3.f9960a;
                                int i4 = ao4Var.b;
                                String str = ao4Var.d;
                                zfn zfnVar = zaq0.b;
                                obc.q(mm40VarJ, new rqm((vui0) new uui0(str, new y3d(((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary()), ao4Var.f, null, null, 56), (pui0) new nui0(Integer.valueOf(i4), null, new m0x(i4, null, 6), new y3d(((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU()), null, new pc5(new y3d(((ThemeColors) fetVar3.k(zfnVar)).getPrimary())), 0.0f, 210), (pvi0) null, d4d.BACKGROUND, (tvi0) null, (wui0) null, false, (e900) null, 492), false, null, null, null, null, null, fetVar3, 0, 252);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-565012670, new x2g((Object) xpj0Var3, (Object) vneVar, (Object) function1, (Object) fq8Var, (byte) 11), fetVar), u1c.M(-976453420, new xdr() { // from class: a.yuc
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    fq8 fq8Var3 = fq8Var2;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                wwb.i(null, fq8Var3.b, 0L, 0, 0L, fetVar2, 0, 29);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarJ = s5x0.J(jm40.b, 16.0f);
                                ao4 ao4Var = fq8Var3.f9960a;
                                int i4 = ao4Var.b;
                                String str = ao4Var.d;
                                zfn zfnVar = zaq0.b;
                                obc.q(mm40VarJ, new rqm((vui0) new uui0(str, new y3d(((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary()), ao4Var.f, null, null, 56), (pui0) new nui0(Integer.valueOf(i4), null, new m0x(i4, null, 6), new y3d(((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU()), null, new pc5(new y3d(((ThemeColors) fetVar3.k(zfnVar)).getPrimary())), 0.0f, 210), (pvi0) null, d4d.BACKGROUND, (tvi0) null, (wui0) null, false, (e900) null, 492), false, null, null, null, null, null, fetVar3, 0, 252);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 905969664, 222);
            xpj0Var2 = xpj0Var3;
        } else {
            fq8Var2 = fq8Var;
            fetVar.X();
            xpj0Var2 = xpj0Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(fq8Var2, xpj0Var2, function1, i, (byte) 0);
        }
    }

    public static final void c(final mm40 mm40Var, final int i, long j, nrq nrqVar, long j2, int i2, fet fetVar, final int i3) {
        final long j3;
        final nrq nrqVar2;
        final long j4;
        final int i4;
        long jS;
        nrq nrqVar3;
        long j5;
        int i5;
        fetVar.g0(-60460429);
        int i6 = i3 | (fetVar.e(i) ? 32 : 16) | 74880;
        if (fetVar.U(i6 & 1, (74899 & i6) != 74898)) {
            fetVar.Z();
            if ((i3 & 1) == 0 || fetVar.B()) {
                long j6 = qmk.r;
                qrq qrqVar = j1t0.c;
                jS = qcc.S(R.attr.uikitSecondary, fetVar);
                nrqVar3 = qrqVar;
                j5 = j6;
                i5 = 3;
            } else {
                fetVar.X();
                j5 = j;
                nrqVar3 = nrqVar;
                jS = j2;
                i5 = i2;
            }
            fetVar.s();
            v8q0.a(xsm0.s(i, fetVar), mm40Var, jS, null, j5, null, null, nrqVar3, 0L, new f2q0(i5), 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 260968);
            j4 = jS;
            j3 = j5;
            nrqVar2 = nrqVar3;
            i4 = i5;
        } else {
            fetVar.X();
            j3 = j;
            nrqVar2 = nrqVar;
            j4 = j2;
            i4 = i2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(i, j3, nrqVar2, j4, i4, i3) { // from class: a.eee
                public final /* synthetic */ int b;
                public final /* synthetic */ long c;
                public final /* synthetic */ nrq d;
                public final /* synthetic */ long e;
                public final /* synthetic */ byte f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(7);
                    zjb.c(this.f7668a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, hjm hjmVar, String str, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-15281252);
        int i2 = i | 6 | (fetVar2.g(hjmVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            nkb.h(jm40Var, hjmVar, kjm.f18392a, null, null, null, fetVar2, (i2 & 112) | 390, 56);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i2 >> 6) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, hjmVar, str, i, (byte) 9);
        }
    }

    public static final void e(mm40 mm40Var, tll tllVar, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        fetVar.g0(1881471074);
        int i2 = i | (fetVar.g(tllVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024) | (fetVar.i(function3) ? 16384 : 8192);
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (tllVar instanceof rll) {
            fetVar.e0(1581923930);
            f(mm40Var, (rll) tllVar, function1, function2, function3, fetVar, i2 & 65534);
            fetVar.r(false);
        } else {
            if (!tllVar.equals(sll.f32405a)) {
                throw b1j.f(-87519479, fetVar, false);
            }
            fetVar.e0(1582290908);
            g(0, fetVar, null);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) tllVar, function1, function2, function3, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static final void f(mm40 mm40Var, rll rllVar, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        int i2;
        Function1 function4;
        ?? r6;
        a4x a4xVar;
        xx7 xx7Var;
        ?? r1;
        jm40 jm40Var;
        ?? r0;
        fet fetVar2;
        fet fetVar3 = fetVar;
        a4x a4xVar2 = rllVar.b;
        xx7 xx7Var2 = gqw0.n;
        fetVar3.g0(294700816);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(rllVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.i(function3) ? 16384 : 8192;
        }
        if (fetVar3.U(i2 & 1, (i2 & 9363) != 9362)) {
            float fE = pkd.e((int) (((yez) ((rhv0) fetVar3.k(bmd.u))).b() >> 32), fetVar3);
            zcl zclVar = qmk.f28987a;
            boolean z = ycl.a(fE, 360.0f) <= 0;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var2, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            jm40 jm40Var2 = jm40.b;
            if (z) {
                a4xVar = a4xVar2;
                xx7Var = xx7Var2;
                fet fetVar4 = fetVar3;
                r1 = 0;
                jm40Var = jm40Var2;
                r0 = 1;
                fetVar4.e0(389271900);
                fetVar4.r(false);
                fetVar2 = fetVar4;
            } else {
                fetVar3.e0(388635408);
                mm40 mm40VarS = o7k0.s(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 32.0f, 7), 304.0f);
                String str = rllVar.f30702a;
                pz40 pz40Var = s6t0.f31722a;
                qrq qrqVar = j1t0.c;
                long j = qmk.s;
                a4xVar = a4xVar2;
                xx7Var = xx7Var2;
                jm40Var = jm40Var2;
                r1 = 0;
                r0 = 1;
                v8q0.a(str, mm40VarS, s6t0.b().f33626a.getTextPrimary(), new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 109552);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar2 = fetVar5;
            }
            Iterator it = a4xVar.iterator();
            ?? r15 = r1;
            while (true) {
                if (!it.hasNext()) {
                    r15 = -1;
                    break;
                }
                oll ollVar = ((hll) it.next()).f;
                if ((ollVar instanceof kll) || (ollVar instanceof mll)) {
                    break;
                } else {
                    r15++;
                }
            }
            Integer numValueOf = Integer.valueOf((int) r15);
            yje yjeVar = null;
            if (r15 < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : a4xVar.size() - r0;
            ?? r16 = (i2 & 112) == 32 ? r0 : r1;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (r16 != 0 || objP == cl5Var) {
                objP = new ucj(rllVar, (byte) 29);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(iIntValue, (Function0) objP, fetVar2, r1, 2);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new s39(kwjVarB, (byte) 5));
                fetVar2.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            Integer numValueOf2 = Integer.valueOf(((Number) l7m0Var.getValue()).intValue());
            ?? r17 = (i2 & 57344) == 16384 ? r0 : r1;
            Object objP3 = fetVar2.P();
            if (r17 != 0 || objP3 == cl5Var) {
                function4 = function3;
                objP3 = new gll(r1, yjeVar, l7m0Var, function4);
                fetVar2.o0(objP3);
            } else {
                function4 = function3;
            }
            m0x0.t(fetVar2, numValueOf2, (Function2) objP3);
            jm40 jm40Var3 = jm40Var;
            ?? r7 = fetVar2;
            nnw0.g(o7k0.d(jm40Var3, 1.0f), null, false, u1c.M(1124700124, new hgs0(kwjVarB, rllVar, function1, function2, l7m0Var, (byte) 6), fetVar2), r7, 3078, 6);
            if (a4xVar.size() > r0) {
                r7.e0(391314242);
                zcl zclVar2 = qmk.f28987a;
                thb.d(((Number) l7m0Var.getValue()).intValue(), r1, r7, s5x0.N(jm40Var3, 0.0f, z ? 16.0f : 32.0f, 0.0f, 0.0f, 13).e(new wkw(xx7Var)), a4xVar);
                r7.r(r1);
            } else {
                r7.e0(391677500);
                r7.r(r1);
            }
            r7.r(r0);
            r6 = r7;
        } else {
            function4 = function3;
            fetVar3.X();
            r6 = fetVar3;
        }
        yfe0 yfe0VarU = r6.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) rllVar, (Object) function1, (Object) function2, (Object) function4, i, (byte) 16);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(304532633);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float fE = pkd.e((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32), fetVar);
            zcl zclVar = qmk.f28987a;
            boolean z = ycl.a(fE, 360.0f) <= 0;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            if (z) {
                fetVar.e0(1255313887);
                fetVar.r(false);
            } else {
                fetVar.e0(1254548931);
                mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(mm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), 256.0f), 16.0f);
                zcl zclVar2 = qmk.f;
                ugg0 ugg0Var = vgg0.f37379a;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 34.0f, 5), 176.0f), 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, false);
            }
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new xal((byte) 21);
                fetVar.o0(objP);
            }
            nnw0.g(o7k0.d(mm40Var2, 1.0f), null, false, u1c.M(-1433704627, new sd8(zk80.b(1, (Function0) objP, fetVar, 390, 2), (byte) 27), fetVar), fetVar, 3078, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var2, i, (byte) 28);
        }
    }

    public static final void h(mm40 mm40Var, final a4x a4xVar, boolean z, long j, long j2, xk80 xk80Var, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        final long j3;
        final long j4;
        final xk80 xk80Var2;
        final mm40 mm40Var3;
        final boolean z2;
        long primary;
        long backgroundContent;
        xk80 xk80VarB;
        mm40 mm40Var4;
        boolean z3;
        long j5;
        boolean z4;
        a4xVar.getClass();
        fetVar.g0(1363165061);
        int i4 = i2 & 1;
        byte b2 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(a4xVar) ? 32 : 16) | 75136;
        byte b3 = 0;
        byte b4 = 1;
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            fetVar.Z();
            int i6 = i & 1;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (i6 == 0 || fetVar.B()) {
                if (i4 != 0) {
                    mm40Var2 = jm40Var;
                }
                zfn zfnVar = zaq0.b;
                primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                boolean z5 = (i5 & 112) == 32;
                Object objP = fetVar.P();
                if (z5 || objP == cl5Var) {
                    objP = new ife(a4xVar, b4);
                    fetVar.o0(objP);
                }
                mm40 mm40Var5 = mm40Var2;
                xk80VarB = zk80.b(0, (Function0) objP, fetVar, 0, 3);
                mm40Var4 = mm40Var5;
                z3 = true;
            } else {
                fetVar.X();
                z3 = z;
                primary = j;
                backgroundContent = j2;
                mm40Var4 = mm40Var2;
                xk80VarB = xk80Var;
            }
            fetVar.s();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new g8l(a4xVar, xk80VarB, cgk0Var, b2));
                fetVar.o0(objP3);
            }
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var4, 1.0f), ((ycl) d43.a(((ycl) ((l7m0) objP3).getValue()).f42389a, ro4.m0(300, 0, null, 6), "", fetVar, 432, 8).getValue()).f42389a);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new nw6(cgk0Var, (byte) 8);
                fetVar.o0(objP4);
            }
            mm40 mm40VarY = fre0.Y(mm40VarE, (Function1) objP4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            long j6 = primary;
            long j7 = backgroundContent;
            mm40 mm40Var6 = mm40Var4;
            q5x.e(xk80VarB, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-450514228, new ftl(a4xVar, b3), fetVar), fetVar, 0, 24576, 16382);
            if (z3) {
                fetVar.e0(-1509880393);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarQ = i120.Q(lgb.J(jr8.f16991a.b(o7k0.d(o7k0.e(jm40Var, 24.0f), 1.0f), gqw0.h), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), j7, jd8.n);
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new knl((byte) 16);
                    fetVar.o0(objP5);
                }
                mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP5, 28);
                thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                xk80 xk80Var3 = xk80VarB;
                j5 = j6;
                n1i.a(new ecu0(gqw0.l), xk80Var3, smm.f32453a, new y3d(j5), fetVar, 384, 0);
                xk80VarB = xk80Var3;
                z4 = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                j5 = j6;
                z4 = true;
                fetVar.e0(-1509019337);
                fetVar.r(false);
            }
            fetVar.r(z4);
            j4 = j7;
            xk80Var2 = xk80VarB;
            j3 = j5;
            z2 = z3;
            mm40Var3 = mm40Var6;
        } else {
            fetVar.X();
            j3 = j;
            j4 = j2;
            xk80Var2 = xk80Var;
            mm40Var3 = mm40Var2;
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(a4xVar, z2, j3, j4, xk80Var2, i, i2) { // from class: a.gtl
                public final /* synthetic */ a4x b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ xk80 f;
                public final /* synthetic */ byte g;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.g = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    zjb.h(this.f11887a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL, this.g);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void i(xhm xhmVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        ugd ugdVarM;
        fetVar.g0(-1718093602);
        jm40 jm40Var = jm40.b;
        int i2 = i | (fetVar.g(jm40Var) ? 4 : 2) | (fetVar.g(xhmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            String str = xhmVar.f40899a;
            androidx.compose.runtime.d dVar = zaq0.b;
            imm immVar = new imm(klm.f18497a, new plm(str, ((ThemeColors) fetVar.k(dVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_filter_line_inactive, xhmVar.b, ra50.f30118a, ((ThemeColors) fetVar.k(dVar)).getSecondary()))), ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), true, null);
            sd sdVar = xhmVar.d;
            if (sdVar == null) {
                fetVar.e0(-599867555);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-599867554);
                ugdVarM = u1c.M(1899701012, new d8m((Object) xhmVar, (Object) sdVar, (Object) function0, (byte) 6), fetVar);
                fetVar.r(false);
            }
            ugd ugdVar = ugdVarM;
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            byte b2 = 14;
            if (z || objP == ukd.f35823a) {
                objP = new cjl(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(jm40Var, immVar, null, null, null, (Function1) objP, null, null, null, ugdVar, null, null, fetVar, (i2 & 14) | 27648, 54, 452);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(xhmVar, function0, function1, i, (byte) 7);
        }
    }

    public static final void j(uba ubaVar, boolean z, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i, int i2) {
        float f;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.e0(-1180308345);
        if (ubaVar instanceof pba) {
            zcl zclVar = qmk.f28987a;
            f = 16.0f;
        } else {
            zcl zclVar2 = qmk.f28987a;
            f = 20.0f;
        }
        float f2 = f;
        boolean z2 = true;
        boolean z3 = (((i & 7168) ^ 3072) > 2048 && fetVar.g(function1)) || (i & 3072) == 2048;
        if ((((i & 112) ^ 48) <= 32 || !fetVar.g(ubaVar)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objP = fetVar.P();
        if (z4 || objP == ukd.f35823a) {
            objP = new lrk(function1, ubaVar, (byte) 26);
            fetVar.o0(objP);
        }
        a8k0.n(y860.W(jm40.b, null, null, false, null, (Function0) objP, 28), f2, 0L, null, u1c.M(435053826, new i4a0((Object) ubaVar, z, (Object) function0, (Object) function2, (byte) 16), fetVar), u1c.M(-1696611261, new jv1((Object) ubaVar, z, (byte) 8), fetVar), u1c.M(466690948, new igm((Object) ubaVar, z, (Object) function1, (byte) 18), fetVar), fetVar, 1797120, 4);
        fetVar.r(false);
    }

    public static final void k(mm40 mm40Var, kym kymVar, fet fetVar, int i) {
        int i2;
        String str = kymVar.h;
        fetVar.g0(-512714511);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(1416490531);
            boolean zG = fetVar.g(str);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = twn.j(str.length() == 0 ? 68.0f : 86.0f, fetVar);
            }
            jeb.r(s5x0.L(o7k0.e(jm40.b, ((ycl) objP).f42389a), 4.0f, 0.0f, 2), bhm.b, fetVar, 48);
            fetVar.r(false);
            a(null, kymVar.f19112a, kymVar.b, kymVar.c, kymVar.d, kymVar.e, kymVar.f, kymVar.g, str, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 21, i, mm40Var, kymVar);
        }
    }

    public static final void l(mm40 mm40Var, ejm0 ejm0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        ejm0Var.getClass();
        fetVar.g0(-769480490);
        int i2 = i | 6 | (fetVar.g(ejm0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ejm0Var instanceof yim0;
            mm40Var2 = jm40.b;
            if (z) {
                fetVar.e0(-1352522197);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40Var2, 0.0f, 12.0f, 1);
                yim0 yim0Var = (yim0) ejm0Var;
                k1n k1nVar = new k1n(yim0Var.f42700a, yim0Var.c);
                k1n k1nVar2 = new k1n(yim0Var.b, yim0Var.d);
                String str = yim0Var.f;
                String str2 = yim0Var.g;
                z1m z1mVar = yim0Var.e;
                String str3 = yim0Var.h;
                x0m x0mVar = x0m.f40076a;
                sac.r(mm40VarL, k1nVar, k1nVar2, z1mVar, str, str2, str3, fetVar, 0);
                fetVar.r(false);
            } else if (ejm0Var instanceof zim0) {
                fetVar.e0(-1350552085);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(mm40Var2, 0.0f, 12.0f, 1);
                zim0 zim0Var = (zim0) ejm0Var;
                k1n k1nVar3 = new k1n(zim0Var.f44447a, zim0Var.c);
                k1n k1nVar4 = new k1n(zim0Var.b, zim0Var.d);
                String str4 = zim0Var.f;
                String str5 = zim0Var.g;
                z1m z1mVar2 = zim0Var.e;
                String str6 = zim0Var.h;
                x0m x0mVar2 = x0m.f40076a;
                sac.r(mm40VarL2, k1nVar3, k1nVar4, z1mVar2, str4, str5, str6, fetVar, 0);
                fetVar.r(false);
            } else if (ejm0Var instanceof ajm0) {
                fetVar.e0(-1348191466);
                zcl zclVar3 = qmk.f28987a;
                ajm0 ajm0Var = (ajm0) ejm0Var;
                feb.p(s5x0.L(mm40Var2, 0.0f, 12.0f, 1), new bym(ajm0Var.b, ajm0Var.f984a, ajm0Var.c, ajm0Var.d, ajm0Var.e), fetVar, 0);
                fetVar.r(false);
            } else if (ejm0Var instanceof bjm0) {
                fetVar.e0(-1346797427);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarL3 = s5x0.L(mm40Var2, 0.0f, 12.0f, 1);
                bjm0 bjm0Var = (bjm0) ejm0Var;
                k1n k1nVar5 = new k1n(bjm0Var.f2713a, bjm0Var.c);
                k1n k1nVar6 = new k1n(bjm0Var.b, bjm0Var.d);
                String str7 = bjm0Var.f;
                String str8 = bjm0Var.g;
                z1m z1mVar3 = bjm0Var.e;
                String str9 = bjm0Var.h;
                x0m x0mVar3 = x0m.f40076a;
                sac.r(mm40VarL3, k1nVar5, k1nVar6, z1mVar3, str7, str8, str9, fetVar, 0);
                fetVar.r(false);
            } else if (ejm0Var instanceof cjm0) {
                fetVar.e0(-1345809395);
                zcl zclVar5 = qmk.f28987a;
                mm40 mm40VarL4 = s5x0.L(mm40Var2, 0.0f, 12.0f, 1);
                cjm0 cjm0Var = (cjm0) ejm0Var;
                k1n k1nVar7 = new k1n(cjm0Var.f4468a, cjm0Var.c);
                k1n k1nVar8 = new k1n(cjm0Var.b, cjm0Var.d);
                String str10 = cjm0Var.f;
                String str11 = cjm0Var.g;
                z1m z1mVar4 = cjm0Var.e;
                String str12 = cjm0Var.h;
                x0m x0mVar4 = x0m.f40076a;
                sac.r(mm40VarL4, k1nVar7, k1nVar8, z1mVar4, str10, str11, str12, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(ejm0Var instanceof djm0)) {
                    throw b1j.f(-736362176, fetVar, false);
                }
                fetVar.e0(-1344846349);
                zcl zclVar6 = qmk.f28987a;
                mm40 mm40VarL5 = s5x0.L(mm40Var2, 0.0f, 12.0f, 1);
                djm0 djm0Var = (djm0) ejm0Var;
                bzm bzmVar = djm0Var.f6195a;
                bzm bzmVar2 = djm0Var.b;
                String str13 = djm0Var.c;
                q6x q6xVar = q6x.f28221a;
                kpb.k(mm40VarL5, new vym(bzmVar, bzmVar2, null, str13, djm0Var.d, djm0Var.e), fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 12, i, mm40Var2, ejm0Var);
        }
    }

    public static final void m(owr0 owr0Var, Function1 function1, fet fetVar, int i) {
        owr0Var.getClass();
        function1.getClass();
        fetVar.g0(-1814147605);
        int i2 = (fetVar.g(owr0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = v7o.f36937a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new mmn((byte) 10);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new u7o(owr0Var, function1);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(owr0Var, function1, i, (byte) 12);
        }
    }

    public static final void n(mm40 mm40Var, qwe qweVar, fet fetVar, int i) {
        fetVar.g0(-1117567367);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 60.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, qweVar, i, (byte) 21);
        }
    }

    public static final void o(ffr ffrVar, Function0 function0, fet fetVar, int i) {
        ffrVar.getClass();
        function0.getClass();
        fetVar.g0(668653008);
        int i2 = (fetVar.g(ffrVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            cvm0.d(ffrVar.f9460a, fetVar, 0);
            fetVar.e0(-1191867990);
            Iterator<E> it = ffrVar.b.iterator();
            while (it.hasNext()) {
                lgb.p((efr) it.next(), fetVar, 0);
            }
            fetVar.r(false);
            if (ffrVar.c) {
                fetVar.e0(1706899439);
                int i3 = ffrVar.d;
                boolean z = (i2 & 112) == 32;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new dbn(function0, (byte) 11);
                    fetVar.o0(objP);
                }
                n2x.c(i3, 0, fetVar, (Function0) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(1707004188);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(ffrVar, function0, i, (byte) 15);
        }
    }

    public static final void p(mm40 mm40Var, String str, String str2, String str3, String str4, boolean z, boolean z2, fet fetVar, int i) {
        String str5;
        fet fetVar2;
        mm40 mm40Var2;
        boolean z3;
        long jE;
        fetVar.g0(-1435916451);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str5 = str4;
            i2 |= fetVar.g(str5) ? 16384 : 8192;
        } else {
            str5 = str4;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVarI);
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
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            afn0.v(fetVar).getClass();
            jm40 jm40Var2 = jm40Var;
            f1t0.a(null, str, textPrimary, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, i3 & 112, 438265);
            long textPrimary2 = afn0.m(fetVar).getTextPrimary();
            afn0.v(fetVar).getClass();
            f1t0.a(null, str2, textPrimary2, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, (i3 >> 3) & 112, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (str3.length() <= 0 && str5.length() <= 0) {
                fetVar2.e0(-359516055);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-360223351);
                x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                if (z) {
                    z3 = false;
                    jE = cs0.D(fetVar2, -1343337075, fetVar2, false);
                } else {
                    z3 = false;
                    jE = cs0.e(fetVar2, -1343336145, fetVar2, false);
                }
                long j = jE;
                afn0.v(fetVar2).getClass();
                jm40Var2 = jm40Var2;
                v8q0.a(str3, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar2, (i3 >> 9) & 14, 0, 131066);
                long jD = z2 ? cs0.D(fetVar2, -1343328275, fetVar2, z3) : cs0.e(fetVar2, -1343327345, fetVar2, z3);
                afn0.v(fetVar2).getClass();
                v8q0.a(str5, null, jD, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar2, (i3 >> 12) & 14, 0, 131066);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                fetVar2.r(z3);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var2;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwl(mm40Var2, str, str2, str3, str4, z, z2, i);
        }
    }

    public static final void q(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(57100871);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            l7m0 l7m0VarT = ahb.T(a4xVar, fetVar, (i2 >> 3) & 14);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
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
            fetVar.e0(-347590627);
            int i3 = 0;
            for (Object obj : (List) l7m0VarT.getValue()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                fetVar.b0(1386697378, Integer.valueOf(i3));
                feb.n((egm) obj, fetVar);
                fetVar.r(false);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    public static final void r(lc00 lc00Var, f2h f2hVar, int i, List list, List list2, ctf0 ctf0Var, boolean z, long j) {
        Object next;
        String str;
        int i2;
        String str2 = f2hVar.d;
        str2.getClass();
        boolean z2 = false;
        boolean z3 = true;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list3 = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        lc00Var.add(new q4k0(new o4k0(str2), i));
        List listD0 = z ? CollectionsKt.D0(list2, 5) : list2;
        int i3 = 0;
        for (Object obj : listD0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            q1h q1hVar = (q1h) obj;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((f2h) next).f8812a.equals(q1hVar.c));
            f2h f2hVar2 = (f2h) next;
            if (f2hVar2 != null) {
                String str3 = f2hVar2.d;
                str3.getClass();
                if (kotlin.text.c.x(str3, ujn.h, z2)) {
                    str = str3;
                } else {
                    if (str3.length() != 0) {
                        List list4 = u0d.f34849a;
                        if (!u0d.c(str3)) {
                            z3 = z3;
                            str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", z3) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                        }
                        oog oogVar = new oog(f2hVar2.c, str);
                        String str4 = q1hVar.g;
                        long j2 = q1hVar.f;
                        rdj rdjVar = rdj.f30294a;
                        String strF = rdj.f(new znq0(j2), sdj.UNIVERSAL, null, 60);
                        strF.getClass();
                        String strH = rdj.h(new znq0(j2), ykq0.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), null, 248);
                        if (i3 == listD0.size() - 1 || list2.size() > 5) {
                            i2 = R.color.static_black_40;
                        } else {
                            i2 = R.drawable.cyber_game_last_matches_last_item_bg;
                        }
                        lc00Var.add(new tog(oogVar, str4, strF, strH, i2));
                    }
                    str = "";
                }
                oog oogVar2 = new oog(f2hVar2.c, str);
                String str5 = q1hVar.g;
                long j3 = q1hVar.f;
                rdj rdjVar2 = rdj.f30294a;
                String strF2 = rdj.f(new znq0(j3), sdj.UNIVERSAL, null, 60);
                strF2.getClass();
                String strH2 = rdj.h(new znq0(j3), ykq0.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), null, 248);
                if (i3 == listD0.size() - 1) {
                    i2 = R.color.static_black_40;
                } else {
                    i2 = R.color.static_black_40;
                }
                lc00Var.add(new tog(oogVar2, str5, strF2, strH2, i2));
            } else {
                z3 = z3;
            }
            i3 = i4;
            z3 = z3;
            z2 = false;
        }
        if (list2.size() > 5) {
            lc00Var.add(new b2z(z ? R.drawable.ic_glyph_chevron_down_small : R.drawable.ic_glyph_chevron_up_small, R.drawable.cyber_game_last_matches_last_item_bg, j));
        }
    }

    public static final akb s(v5l0 v5l0Var, boolean z, boolean z2) {
        l0l0 l0l0Var;
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            l0l0Var = g0l0.f10465a;
        } else if (iOrdinal == 1) {
            l0l0Var = k0l0.f17474a;
        } else if (iOrdinal == 2) {
            l0l0Var = j0l0.f15687a;
        } else if (iOrdinal == 3) {
            l0l0Var = i0l0.f13953a;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            l0l0Var = h0l0.f12241a;
        }
        return new akb(z ? "LIVE_GAMES_SHIMMERS" : "LINE_GAMES_SHIMMERS", new ijm(), new vb90(q0s.f27918a, z ? dyb.g0(new x56(l0l0Var)) : dyb.g0(new x56(l0l0Var), new x56(l0l0Var), new x56(l0l0Var)), true, z2));
    }

    public static final v2l t(m9s m9sVar, List list, i6l i6lVar) {
        char c2;
        String strT;
        String strT2;
        m9sVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((gah) obj).c == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            c2 = 2;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((gah) next).c == 2) {
                arrayList2.add(next);
            }
        }
        int iMax = Math.max(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (i < iMax) {
            gah gahVar = (gah) ((i < 0 || i >= arrayList.size()) ? new gah(0, 0, 0L, "", false) : arrayList.get(i));
            gah gahVar2 = (gah) ((i < 0 || i >= arrayList2.size()) ? new gah(0, 0, 0L, "", false) : arrayList2.get(i));
            gah gahVar3 = (gah) CollectionsKt.W(i, arrayList);
            String strValueOf = gahVar3 != null ? String.valueOf(gahVar3.e) : null;
            String str = strValueOf == null ? "" : strValueOf;
            gah gahVar4 = (gah) CollectionsKt.W(i, arrayList2);
            String strValueOf2 = gahVar4 != null ? String.valueOf(gahVar4.e) : null;
            i++;
            arrayList3.add(new i2l(i, gahVar.d, gahVar2.d, str, strValueOf2 == null ? "" : strValueOf2, gahVar.f10964a, gahVar2.f10964a, thb.F(i, true), thb.F(i, false)));
            c2 = c2;
        }
        if (!arrayList3.isEmpty() && arrayList3.size() < 12) {
            int size = arrayList3.size();
            while (size < 12) {
                long j = size;
                size++;
                arrayList3.add(new i2l(j, "", "", "", "", false, false, thb.F(size, true), thb.F(size, false)));
            }
        }
        long j2 = m9sVar.f21426a;
        List list2 = m9sVar.n;
        List list3 = m9sVar.m;
        i6l i6lVar2 = i6l.b;
        if (i6lVar == i6lVar2) {
            String str2 = (String) CollectionsKt.firstOrNull(list3);
            if (str2 == null) {
                str2 = "";
            }
            strT = vsm0.t(str2);
        } else {
            String str3 = (String) CollectionsKt.firstOrNull(list2);
            if (str3 == null) {
                str3 = "";
            }
            strT = vsm0.t(str3);
        }
        String str4 = strT;
        if (i6lVar == i6lVar2) {
            String str5 = (String) CollectionsKt.firstOrNull(list2);
            if (str5 == null) {
                str5 = "";
            }
            strT2 = vsm0.t(str5);
        } else {
            String str6 = (String) CollectionsKt.firstOrNull(list3);
            if (str6 == null) {
                str6 = "";
            }
            strT2 = vsm0.t(str6);
        }
        String str7 = strT2;
        int size2 = list.size();
        return new v2l(j2, str4, str7, arrayList3, size2 < 24 ? new s2l(size2 / 2, true) : size2 == 24 ? new s2l(0, false) : new s2l(0, true));
    }

    public static final CyberTournamentBracketMatchParams u(rkh rkhVar, String str, ctf0 ctf0Var) {
        Pair pair;
        String strF;
        Object next;
        ctf0Var.getClass();
        if (rkhVar != null) {
            bkq bkqVar = new bkq(pgi0.k(CollectionsKt.I(rkhVar.r), new m7h((byte) 14)));
            do {
                if (!bkqVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bkqVar.next();
            } while (!((zjh) ((Pair) next).b).f44481a.equals(str));
            pair = (Pair) next;
        } else {
            pair = null;
        }
        if (rkhVar == null || pair == null) {
            return null;
        }
        String str2 = (String) pair.f46059a;
        zjh zjhVar = (zjh) pair.b;
        mkh mkhVar = zjhVar.d;
        CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel = zjhVar.h;
        String str3 = mkhVar.c;
        String str4 = mkhVar.b;
        mkh mkhVar2 = zjhVar.e;
        String str5 = mkhVar2.c;
        String str6 = mkhVar2.b;
        int i = mkhVar.d;
        int i2 = mkhVar2.d;
        lsm0 lsm0Var = ctf0Var.b;
        CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams = new CyberTournamentBracketMatchLabelPresetParams(lsm0Var.a(R.string.stage_of_the_match, Arrays.copyOf(new Object[0], 0)), str2);
        String strA = lsm0Var.a(R.string.date, Arrays.copyOf(new Object[0], 0));
        long j = zjhVar.j;
        if (j == -1 || j == 0) {
            strF = "";
        } else {
            rdj rdjVar = rdj.f30294a;
            strF = rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60);
        }
        return new CyberTournamentBracketMatchParams(str3, str4, str5, str6, i, i2, cyberTournamentBracketMatchStatusModel, cyberTournamentBracketMatchLabelPresetParams, new CyberTournamentBracketMatchLabelPresetParams(strA, strF), zjhVar.c, lsm0Var.a((cyberTournamentBracketMatchStatusModel == CyberTournamentBracketMatchStatusModel.c || cyberTournamentBracketMatchStatusModel == CyberTournamentBracketMatchStatusModel.b) ? R.string.to_game_screen : R.string.watch_full_statistic, Arrays.copyOf(new Object[0], 0)), (int) rkhVar.d, rkhVar.b);
    }

    public static final ywr v(String str) {
        Object next;
        int i = R.drawable.game_card_type_17_default_bg;
        if (str == null) {
            return new ywr("", R.drawable.game_card_type_17_default_bg);
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        Iterator it = xwr.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i2 = ((xwr) next).f41623a;
            if (intOrNull != null && i2 == intOrNull.intValue()) {
                break;
            }
        }
        xwr xwrVar = (xwr) next;
        if (xwrVar != null) {
            i = xwrVar.b;
        }
        return new ywr(str, i);
    }

    public static int w(HandwritingGesture handwritingGesture, v6d0 v6d0Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        v6d0Var.invoke(new l8d(fallbackText, 1));
        return 5;
    }

    public static final String x(long j, ctf0 ctf0Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        ctf0Var.getClass();
        if (j == 66) {
            return str;
        }
        List listP = xkb.P();
        boolean z = false;
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == j) {
                    z = true;
                    break;
                }
            }
        }
        l00 l00Var = new l00(str, (byte) 3);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new gmo(str, maz.a(wezVar, l00Var), (byte) 4));
        if (j == 99) {
            return ctf0Var.b.a(R.string.game_series_info_v2, Arrays.copyOf(new Object[]{str}, 1));
        }
        if (((String) a8zVarA.getValue()).length() == 0 && str2.length() > 0) {
            return str2;
        }
        if (((String) a8zVarA.getValue()).length() <= 0 || str2.length() <= 0) {
            return z ? ctf0Var.b.a(R.string.game_series_info_v2, Arrays.copyOf(new Object[]{str}, 1)) : (String) a8zVarA.getValue();
        }
        return cy7.c() ? kng0.l(str2, ", ", (String) a8zVarA.getValue()) : kng0.l(str2, ", ", (String) a8zVarA.getValue());
    }

    public static final String y(String str, String str2, Map map) {
        str.getClass();
        if (str2.length() != 0) {
            str = kng0.l(str, ", ", str2);
        }
        String str3 = (String) map.get("1");
        if (str3 == null) {
            str3 = "";
        }
        return str3.length() > 0 ? kng0.l(str, ". ", str3) : str;
    }

    public static final ArrayList z(ljg ljgVar, List list) {
        ljgVar.getClass();
        v1h v1hVar = ljgVar.d;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mog mogVar = (mog) it.next();
            if (mogVar != null) {
                if (mogVar instanceof kog) {
                    if (!v1hVar.g.isEmpty() && ljgVar.b.c.length() > 0) {
                        arrayList.add(mogVar);
                    }
                } else if (mogVar instanceof log) {
                    if (!v1hVar.h.isEmpty() && ljgVar.c.c.length() > 0) {
                        arrayList.add(mogVar);
                    }
                }
            }
            t9f.b();
            return null;
        }
        return arrayList;
    }

    public abstract float I(Object obj);

    public abstract void M(Object obj, float f);
}
