package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.app_start.impl.work.StartFailedLogWorker;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k9x {
    public static final void A(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellMiddleTitle) ((g4j0) yfu0Var).c.c).setTitle(R.string.first_quick_bet_sum);
        g4j0 g4j0Var = (g4j0) yfu0Var;
        ((DsCellRightLabel) g4j0Var.c.d).setText(((o4j0) cpVar.u()).c);
        ((DsSettingsCell) g4j0Var.c.e).setFirst(false);
        ((DsSettingsCell) g4j0Var.c.e).setLast(false);
    }

    public static final void B(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellMiddleTitle) ((g4j0) yfu0Var).d.c).setTitle(R.string.second_quick_bet_sum);
        g4j0 g4j0Var = (g4j0) yfu0Var;
        ((DsCellRightLabel) g4j0Var.d.d).setText(((o4j0) cpVar.u()).d);
        ((DsSettingsCell) g4j0Var.d.e).setFirst(false);
        ((DsSettingsCell) g4j0Var.d.e).setLast(false);
    }

    public static final void C(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellMiddleTitle) ((g4j0) yfu0Var).e.c).setTitle(R.string.third_quick_bet_sum);
        g4j0 g4j0Var = (g4j0) yfu0Var;
        ((DsCellRightLabel) g4j0Var.e.d).setText(((o4j0) cpVar.u()).e);
        ((DsSettingsCell) g4j0Var.e.e).setFirst(false);
        ((DsSettingsCell) g4j0Var.e.e).setLast(true);
    }

    public static final void D(cp cpVar, j3j0 j3j0Var) {
        yfu0 yfu0Var = cpVar.u;
        g4j0 g4j0Var = (g4j0) yfu0Var;
        boolean z = ((o4j0) cpVar.u()).f24639a;
        g4j0 g4j0Var2 = (g4j0) yfu0Var;
        ((DsCellRightSwitch) g4j0Var2.f.e).setOnCheckedChangeListener(null);
        ((DsCellRightSwitch) g4j0Var2.f.e).setChecked(z);
        ((DsCellRightSwitch) g4j0Var2.f.e).setOnCheckedChangeListener(j3j0Var);
        ((DsCellMiddleTitle) g4j0Var.f.c).setTitle(R.string.display_quick_bets);
        ((DsSettingsCell) g4j0Var.c.e).setEnabled(z);
        ((DsSettingsCell) g4j0Var.d.e).setEnabled(z);
        ((DsSettingsCell) g4j0Var.e.e).setEnabled(z);
    }

    public static final String E(ctf0 ctf0Var, double d, String str) {
        ctf0Var.getClass();
        String strF = ctf0Var.f(R.string.one_click_bet_min_value_info, new Object[0]);
        pn40 pn40Var = pn40.f27267a;
        return b1j.k(strF, Separators.SP, pn40.c(d, p3u0.c), Separators.SP, str);
    }

    public static final List F(vby vbyVar, String str) {
        str.getClass();
        vbyVar.getClass();
        try {
            vbyVar.getClass();
            return (List) vbyVar.b(new zw3(f3n0.Companion.serializer(), (byte) 0), str);
        } catch (Exception unused) {
            return iun.f15405a;
        }
    }

    public static final void G(Collection collection, Object obj, Object obj2) {
        collection.getClass();
        if (Intrinsics.d(obj, obj2)) {
            return;
        }
        collection.add(obj2);
    }

    public static final Collection H(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static boolean I(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final int J(int i, hbz hbzVar, Object obj) {
        int iC;
        return (obj == null || hbzVar.b() == 0 || (i < hbzVar.b() && obj.equals(hbzVar.d(i))) || (iC = hbzVar.c(obj)) == -1) ? i : iC;
    }

    public static final String K(double d) {
        Double dValueOf = Double.valueOf(d);
        String strC = null;
        if (d == 0.0d) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            pn40 pn40Var = pn40.f27267a;
            strC = pn40.c(dDoubleValue, p3u0.c);
        }
        return strC == null ? "" : strC;
    }

    public static final gbn L(Function1 function1) {
        return new gbn(new kyz((byte) 9), new tvx(3, (byte) 12), new i1y(function1, (byte) 24), gvy.m);
    }

    public static final String M(xba0 xba0Var, ctf0 ctf0Var) {
        long j = xba0Var.b;
        int i = xba0Var.f40593a;
        String strConcat = "";
        if (i <= 0 && znq0.g(j) <= 0) {
            return "";
        }
        String strM = i <= 0 ? "" : twn.m(i, Separators.SP);
        rdj rdjVar = rdj.f30294a;
        String strF = rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60);
        if (znq0.g(j) != 0 && strF.length() != 0) {
            strConcat = strM.length() == 0 ? Separators.SP.concat(strF) : kng0.l(" (", strF, Separators.RPAREN);
        }
        return ctf0Var.b.a(R.string.referee_card_age, Arrays.copyOf(new Object[]{strM, strConcat}, 2));
    }

    public static final mbk0 N(ArrayList arrayList) {
        mbk0 mbk0Var = new mbk0();
        for (Object obj : arrayList) {
            cr30 cr30Var = (cr30) obj;
            if (cr30Var != null && cr30Var != br30.b) {
                mbk0Var.add(obj);
            }
        }
        return mbk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    public static final qgn0 O(SuccessBetStringModel successBetStringModel, SuccessBetAlertModel successBetAlertModel, bu6 bu6Var, fet fetVar) {
        chn0 chn0Var;
        qgn0 qgn0Var;
        ugn0 ugn0Var;
        xgn0 xgn0Var;
        long jD;
        Object obj;
        String strW = rsm0.w(R.string.history, 0, fetVar);
        String strW2 = rsm0.w(R.string.continue_action, 0, fetVar);
        String strW3 = rsm0.w(R.string.sp_coef, 0, fetVar);
        boolean zG = fetVar.g(successBetStringModel) | fetVar.g(successBetAlertModel) | fetVar.e(bu6Var.ordinal()) | fetVar.g(strW) | fetVar.g(strW2) | fetVar.g(strW3);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            String str = successBetStringModel.f46423a;
            brm0.B(strW, strW2, strW3);
            String strConcat = StringsKt.O(str, "!", false) ? str : null;
            if (strConcat == null) {
                strConcat = str.concat("!");
            }
            String str2 = strConcat;
            String str3 = successBetStringModel.d;
            String str4 = str3 == null ? "" : str3;
            String str5 = successBetStringModel.c;
            String str6 = str5 != null ? str5 : "";
            int iOrdinal = bu6Var.ordinal();
            if (iOrdinal == 0) {
                chn0Var = chn0.f4368a;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                t9f.b();
                                return null;
                            }
                        }
                    }
                    chn0Var = chn0.f4368a;
                }
                chn0Var = chn0.b;
            }
            String str7 = successBetAlertModel.f46420a;
            String str8 = successBetAlertModel.b;
            if (str7 == null || str7.length() == 0 || str8 == null || str8.length() == 0) {
                qgn0Var = null;
                ugn0Var = null;
            } else {
                qgn0Var = null;
                String upperCase = str7.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                ugn0Var = new ugn0(upperCase, "№".concat(str8), str6);
            }
            List<SuccessBetInfoItem> list = successBetAlertModel.f;
            ArrayList arrayList = new ArrayList();
            for (SuccessBetInfoItem successBetInfoItem : list) {
                if (successBetInfoItem != null) {
                    if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                        SuccessBetInfoItem.Simple simple = (SuccessBetInfoItem.Simple) successBetInfoItem;
                        String str9 = simple.b;
                        if (str9.length() == 0) {
                            obj = qgn0Var;
                        } else {
                            String str10 = simple.f46421a;
                            String str11 = Intrinsics.d(str9, "0") ? strW3 : str9;
                            pz40 pz40Var = s6t0.f31722a;
                            xgn0Var = new xgn0(s6t0.b().f33626a.getTextPrimary(), str10, str11, "");
                            obj = xgn0Var;
                        }
                    } else if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                        SuccessBetInfoItem.WithCurrency withCurrency = (SuccessBetInfoItem.WithCurrency) successBetInfoItem;
                        if (withCurrency.b.length() == 0) {
                            obj = qgn0Var;
                        } else {
                            String str12 = withCurrency.f46422a;
                            String str13 = withCurrency.b;
                            String str14 = withCurrency.d;
                            int iOrdinal2 = chn0Var.ordinal();
                            if (iOrdinal2 == 0) {
                                jD = fbc.d(withCurrency.c);
                            } else {
                                if (iOrdinal2 != 1) {
                                    t9f.b();
                                    return qgn0Var;
                                }
                                pz40 pz40Var2 = s6t0.f31722a;
                                jD = s6t0.b().f33626a.getTextPrimary();
                            }
                            xgn0Var = new xgn0(jD, str12, str13, str14);
                            obj = xgn0Var;
                        }
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                t9f.b();
                return qgn0Var;
            }
            dhn0 dhn0Var = new dhn0(ugn0Var, dyb.o0(arrayList), chn0Var);
            sul sulVar = nul.e;
            wul wulVar = new wul(sulVar, idm0.x(bu6Var), new ue9(strW), true, false, false);
            int iOrdinal3 = bu6Var.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == 2) {
                sulVar = lul.e;
            } else if (iOrdinal3 != 3 && iOrdinal3 != 4) {
                t9f.b();
                return qgn0Var;
            }
            Object qgn0Var2 = new qgn0(str2, str4, dhn0Var, wulVar, new wul(sulVar, idm0.x(bu6Var), new ue9(strW2), true, false, false));
            fetVar.o0(qgn0Var2);
            objP = qgn0Var2;
        }
        return (qgn0) objP;
    }

    public static void P(Context context, String str) throws IOException {
        File file = new File(context.getCacheDir(), axq.h(System.currentTimeMillis(), "crash_log_", ".txt"));
        Charset charset = Charsets.UTF_8;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i0q.c(fileOutputStream, str, charset);
            fileOutputStream.close();
            sl50 sl50Var = sl50.f32381a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
            Pair[] pairArr = {new Pair("FAILED_WORKER_LOG_FILE_PATH", file.getAbsolutePath())};
            laj lajVar = new laj((byte) 0);
            Pair pair = pairArr[0];
            lajVar.b(pair.b, (String) pair.f46059a);
            maj majVarA = lajVar.a();
            xl60 xl60Var = (xl60) new xl60(StartFailedLogWorker.class).g("FAILED_WORKER_NAME");
            ((ppv0) xl60Var.c).j = o4eVar;
            ((ppv0) xl60Var.c).e = majVarA;
            yl60 yl60Var = (yl60) xl60Var.k();
            cpv0 cpv0VarD = cpv0.d(context);
            cpv0VarD.getClass();
            cpv0VarD.c("FAILED_WORKER_NAME", zko.d, yl60Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void Q(Throwable th, yje yjeVar) {
        jry jryVar;
        if (yjeVar instanceof jry) {
            jryVar = (jry) yjeVar;
            int i = jryVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                jryVar.j = i - Integer.MIN_VALUE;
            } else {
                jryVar = new jry(yjeVar);
            }
        } else {
            jryVar = new jry(yjeVar);
        }
        Object obj = jryVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jryVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            jryVar.j = 1;
            tvk.f34603a.q(jryVar.getContext(), new lfr((Object) jryVar, (Object) th, (byte) 12));
        } else if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
        } else {
            z1x.P(obj);
            csj.b();
        }
    }

    public static final xm4 R(obk0 obk0Var) {
        obk0Var.getClass();
        int iOrdinal = obk0Var.ordinal();
        if (iOrdinal == 0) {
            return xm4.SMS;
        }
        if (iOrdinal == 1) {
            return xm4.VOICE_SMS;
        }
        if (iOrdinal == 2) {
            return xm4.TELEGRAM;
        }
        if (iOrdinal == 3) {
            return xm4.CALL_CODE;
        }
        t9f.b();
        return null;
    }

    public static final r64 S(obk0 obk0Var) {
        obk0Var.getClass();
        int iOrdinal = obk0Var.ordinal();
        if (iOrdinal == 0) {
            return r64.SMS;
        }
        if (iOrdinal == 1) {
            return r64.VOICE_SMS;
        }
        if (iOrdinal == 2) {
            return r64.TELEGRAM;
        }
        if (iOrdinal == 3) {
            return r64.CALL_CODE;
        }
        t9f.b();
        return null;
    }

    public static final a7c0 T(dzc0 dzc0Var, ctf0 ctf0Var, boolean z) {
        wyc0 wyc0Var;
        boolean z2;
        mlc0 mlc0Var;
        ctf0Var.getClass();
        syc0 syc0Var = dzc0Var.f6938a;
        azc0 azc0Var = new azc0(syc0Var.f33019a, syc0Var.b, syc0Var.c, true, syc0Var.d, syc0Var.e);
        if (z) {
            wyc0Var = wyc0.b;
        } else {
            int iOrdinal = dzc0Var.b.ordinal();
            if (iOrdinal == 0) {
                wyc0Var = wyc0.f39969a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                wyc0Var = wyc0.b;
            }
        }
        olc0 olc0Var = dzc0Var.c;
        double d = olc0Var.f25446a;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        String str = olc0Var.c;
        p3u0 p3u0Var = p3u0.c;
        mlc0 mlc0Var2 = new mlc0(strA, cy7.e(pn40.d(d, str, p3u0Var)), false);
        mlc0 mlc0Var3 = new mlc0(lsm0Var.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), olc0Var.b, false);
        mlc0 mlc0Var4 = olc0Var.f ? new mlc0(lsm0Var.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(olc0Var.e, str, p3u0Var)), true) : null;
        if (olc0Var.g) {
            z2 = true;
            mlc0Var = new mlc0(lsm0Var.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((olc0Var.d - 1.0d) * d, str, p3u0Var)), true);
        } else {
            z2 = true;
            mlc0Var = null;
        }
        slc0 slc0Var = new slc0(dyb.r0(tx3.z(new mlc0[]{mlc0Var2, mlc0Var3, mlc0Var4, mlc0Var})), olc0Var.h);
        boolean z3 = dzc0Var.d;
        String strA2 = lsm0Var.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
        String strConcat = z3 ? Separators.RETURN.concat(lsm0Var.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        String strConcat2 = strA2.concat(strConcat);
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        boolean z4 = false;
        ue9 ue9Var = new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        if (dzc0Var.e && !z) {
            z4 = z2;
        }
        return new a7c0(azc0Var, wyc0Var, slc0Var, strConcat2, new wul(iulVar, oe9Var, ue9Var, z4, false, true));
    }

    public static final epd0 U(mnd0 mnd0Var, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        String upperCase = null;
        if (!mnd0Var.f22084a) {
            return null;
        }
        boolean z2 = !z;
        String strK = K(mnd0Var.b);
        String strK2 = K(mnd0Var.c);
        String strK3 = K(mnd0Var.d);
        String str = mnd0Var.e;
        if (mnd0Var.f) {
            upperCase = ctf0Var.b.a(R.string.maximum, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        }
        return new epd0(strK, strK2, strK3, str, upperCase, z2);
    }

    public static final lel0 V(h5l0 h5l0Var) {
        StringBuilder sb = new StringBuilder(ujn.h);
        String str = h5l0Var.f;
        str.getClass();
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(ujn.h);
        String str2 = h5l0Var.i;
        str2.getClass();
        if (str2.length() == 0) {
            sb2.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb2.setLength(0);
            sb2.append(str2);
        } else {
            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                sb2.append('/');
            }
            sb2.append(StringsKt.y0(str2, '/'));
        }
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder(ujn.h);
        String str3 = h5l0Var.j;
        str3.getClass();
        if (str3.length() == 0) {
            sb3.setLength(0);
        } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
            sb3.setLength(0);
            sb3.append(str3);
        } else {
            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                sb3.append('/');
            }
            sb3.append(StringsKt.y0(str3, '/'));
        }
        String string3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder(ujn.h);
        String str4 = h5l0Var.k;
        str4.getClass();
        if (str4.length() == 0) {
            sb4.setLength(0);
        } else if (StringsKt.O(str4, ujn.h, false) || kotlin.text.c.x(str4, "https://", false)) {
            sb4.setLength(0);
            sb4.append(str4);
        } else {
            if (sb4.length() > 0 && !StringsKt.S(sb4, Separators.SLASH)) {
                sb4.append('/');
            }
            sb4.append(StringsKt.y0(str4, '/'));
        }
        String string4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder(ujn.h);
        String str5 = h5l0Var.l;
        str5.getClass();
        if (str5.length() == 0) {
            sb5.setLength(0);
        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
            sb5.setLength(0);
            sb5.append(str5);
        } else {
            if (sb5.length() > 0 && !StringsKt.S(sb5, Separators.SLASH)) {
                sb5.append('/');
            }
            sb5.append(StringsKt.y0(str5, '/'));
        }
        String string5 = sb5.toString();
        StringBuilder sb6 = new StringBuilder(ujn.h);
        String str6 = h5l0Var.m;
        str6.getClass();
        if (str6.length() == 0) {
            sb6.setLength(0);
        } else if (StringsKt.O(str6, ujn.h, false) || kotlin.text.c.x(str6, "https://", false)) {
            sb6.setLength(0);
            sb6.append(str6);
        } else {
            if (sb6.length() > 0 && !StringsKt.S(sb6, Separators.SLASH)) {
                sb6.append('/');
            }
            sb6.append(StringsKt.y0(str6, '/'));
        }
        String string6 = sb6.toString();
        StringBuilder sb7 = new StringBuilder(ujn.h);
        String str7 = h5l0Var.g;
        str7.getClass();
        if (str7.length() == 0) {
            sb7.setLength(0);
        } else if (StringsKt.O(str7, ujn.h, false) || kotlin.text.c.x(str7, "https://", false)) {
            sb7.setLength(0);
            sb7.append(str7);
        } else {
            if (sb7.length() > 0 && !StringsKt.S(sb7, Separators.SLASH)) {
                sb7.append('/');
            }
            sb7.append(StringsKt.y0(str7, '/'));
        }
        String string7 = sb7.toString();
        StringBuilder sb8 = new StringBuilder(ujn.h);
        String str8 = h5l0Var.h;
        str8.getClass();
        if (str8.length() == 0) {
            sb8.setLength(0);
        } else if (StringsKt.O(str8, ujn.h, false) || kotlin.text.c.x(str8, "https://", false)) {
            sb8.setLength(0);
            sb8.append(str8);
        } else {
            if (sb8.length() > 0 && !StringsKt.S(sb8, Separators.SLASH)) {
                sb8.append('/');
            }
            sb8.append(StringsKt.y0(str8, '/'));
        }
        String string8 = sb8.toString();
        StringBuilder sb9 = new StringBuilder(ujn.h);
        String str9 = h5l0Var.n;
        str9.getClass();
        if (str9.length() == 0) {
            sb9.setLength(0);
        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
            sb9.setLength(0);
            sb9.append(str9);
        } else {
            if (sb9.length() > 0 && !StringsKt.S(sb9, Separators.SLASH)) {
                sb9.append('/');
            }
            sb9.append(StringsKt.y0(str9, '/'));
        }
        String string9 = sb9.toString();
        StringBuilder sb10 = new StringBuilder(ujn.h);
        String str10 = h5l0Var.p;
        str10.getClass();
        if (str10.length() == 0) {
            sb10.setLength(0);
        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
            sb10.setLength(0);
            sb10.append(str10);
        } else {
            if (sb10.length() > 0 && !StringsKt.S(sb10, Separators.SLASH)) {
                sb10.append('/');
            }
            sb10.append(StringsKt.y0(str10, '/'));
        }
        String string10 = sb10.toString();
        StringBuilder sb11 = new StringBuilder(ujn.h);
        String str11 = h5l0Var.q;
        str11.getClass();
        if (str11.length() == 0) {
            sb11.setLength(0);
        } else if (StringsKt.O(str11, ujn.h, false) || kotlin.text.c.x(str11, "https://", false)) {
            sb11.setLength(0);
            sb11.append(str11);
        } else {
            if (sb11.length() > 0 && !StringsKt.S(sb11, Separators.SLASH)) {
                sb11.append('/');
            }
            sb11.append(StringsKt.y0(str11, '/'));
        }
        String string11 = sb11.toString();
        StringBuilder sb12 = new StringBuilder(ujn.h);
        String str12 = h5l0Var.r;
        str12.getClass();
        if (str12.length() == 0) {
            sb12.setLength(0);
        } else if (StringsKt.O(str12, ujn.h, false) || kotlin.text.c.x(str12, "https://", false)) {
            sb12.setLength(0);
            sb12.append(str12);
        } else {
            if (sb12.length() > 0 && !StringsKt.S(sb12, Separators.SLASH)) {
                sb12.append('/');
            }
            sb12.append(StringsKt.y0(str12, '/'));
        }
        String string12 = sb12.toString();
        StringBuilder sb13 = new StringBuilder(ujn.h);
        String str13 = h5l0Var.s;
        str13.getClass();
        if (str13.length() == 0) {
            sb13.setLength(0);
        } else if (StringsKt.O(str13, ujn.h, false) || kotlin.text.c.x(str13, "https://", false)) {
            sb13.setLength(0);
            sb13.append(str13);
        } else {
            if (sb13.length() > 0 && !StringsKt.S(sb13, Separators.SLASH)) {
                sb13.append('/');
            }
            sb13.append(StringsKt.y0(str13, '/'));
        }
        String string13 = sb13.toString();
        StringBuilder sb14 = new StringBuilder(ujn.h);
        String str14 = h5l0Var.t;
        str14.getClass();
        if (str14.length() == 0) {
            sb14.setLength(0);
        } else if (StringsKt.O(str14, ujn.h, false) || kotlin.text.c.x(str14, "https://", false)) {
            sb14.setLength(0);
            sb14.append(str14);
        } else {
            if (sb14.length() > 0 && !StringsKt.S(sb14, Separators.SLASH)) {
                sb14.append('/');
            }
            sb14.append(StringsKt.y0(str14, '/'));
        }
        String string14 = sb14.toString();
        StringBuilder sb15 = new StringBuilder(ujn.h);
        String str15 = h5l0Var.u;
        str15.getClass();
        if (str15.length() == 0) {
            sb15.setLength(0);
        } else if (StringsKt.O(str15, ujn.h, false) || kotlin.text.c.x(str15, "https://", false)) {
            sb15.setLength(0);
            sb15.append(str15);
        } else {
            if (sb15.length() > 0 && !StringsKt.S(sb15, Separators.SLASH)) {
                sb15.append('/');
            }
            sb15.append(StringsKt.y0(str15, '/'));
        }
        String string15 = sb15.toString();
        StringBuilder sb16 = new StringBuilder(ujn.h);
        String str16 = h5l0Var.v;
        str16.getClass();
        if (str16.length() == 0) {
            sb16.setLength(0);
        } else if (StringsKt.O(str16, ujn.h, false) || kotlin.text.c.x(str16, "https://", false)) {
            sb16.setLength(0);
            sb16.append(str16);
        } else {
            if (sb16.length() > 0 && !StringsKt.S(sb16, Separators.SLASH)) {
                sb16.append('/');
            }
            sb16.append(StringsKt.y0(str16, '/'));
        }
        String string16 = sb16.toString();
        StringBuilder sb17 = new StringBuilder(ujn.h);
        String str17 = h5l0Var.w;
        str17.getClass();
        if (str17.length() == 0) {
            sb17.setLength(0);
        } else if (StringsKt.O(str17, ujn.h, false) || kotlin.text.c.x(str17, "https://", false)) {
            sb17.setLength(0);
            sb17.append(str17);
        } else {
            if (sb17.length() > 0 && !StringsKt.S(sb17, Separators.SLASH)) {
                sb17.append('/');
            }
            sb17.append(StringsKt.y0(str17, '/'));
        }
        String string17 = sb17.toString();
        StringBuilder sb18 = new StringBuilder(ujn.h);
        String str18 = h5l0Var.x;
        str18.getClass();
        if (str18.length() == 0) {
            sb18.setLength(0);
        } else if (StringsKt.O(str18, ujn.h, false) || kotlin.text.c.x(str18, "https://", false)) {
            sb18.setLength(0);
            sb18.append(str18);
        } else {
            if (sb18.length() > 0 && !StringsKt.S(sb18, Separators.SLASH)) {
                sb18.append('/');
            }
            sb18.append(StringsKt.y0(str18, '/'));
        }
        return new lel0(string7, string8, string, string2, string3, string4, string5, string6, string9, string10, string11, string12, string13, string14, string15, string16, string17, sb18.toString());
    }

    public static final ril0 W(h5l0 h5l0Var, vby vbyVar) {
        h5l0Var.getClass();
        vbyVar.getClass();
        return new ril0(h5l0Var.f12486a, h5l0Var.b, h5l0Var.c, h5l0Var.d, h5l0Var.e, F(vbyVar, h5l0Var.o), V(h5l0Var));
    }

    public static final void a(mm40 mm40Var, l3w l3wVar, fet fetVar, int i) {
        int i2;
        long warningTint;
        long warning;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(885091194);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l3wVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            k8x k8xVar = l3wVar.c;
            i8x i8xVar = i8x.f14362a;
            boolean zEquals = k8xVar.equals(i8xVar);
            j8x j8xVar = j8x.f16108a;
            if (zEquals) {
                fetVar2.e0(169120132);
                warningTint = afn0.m(fetVar2).getBackground();
                fetVar2.r(false);
            } else {
                if (!k8xVar.equals(j8xVar)) {
                    throw b1j.f(169117349, fetVar2, false);
                }
                fetVar2.e0(169122117);
                warningTint = afn0.m(fetVar2).getWarningTint();
                fetVar2.r(false);
            }
            k8x k8xVar2 = l3wVar.c;
            if (k8xVar2.equals(i8xVar)) {
                fetVar2.e0(169126307);
                warning = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            } else {
                if (!k8xVar2.equals(j8xVar)) {
                    throw b1j.f(169123520, fetVar2, false);
                }
                fetVar2.e0(169128257);
                warning = afn0.m(fetVar2).getWarning();
                fetVar2.r(false);
            }
            mm40 mm40VarK0 = q8a.k0(o7k0.d(mm40Var, 1.0f), enx.b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA = pkd.a(mm40VarK0, 10.0f);
            boolean zF = fetVar2.f(warningTint);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new dls((byte) 25, warningTint);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarA, (Function1) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var, 6.0f), 1.0f);
            boolean zF2 = fetVar2.f(warning);
            Object objP2 = fetVar2.P();
            if (zF2 || objP2 == cl5Var) {
                objP2 = new dls((byte) 26, warning);
                fetVar2.o0(objP2);
            }
            zq8.a(0, fetVar2, rq8.K(mm40VarC, (Function1) objP2));
            mm40 mm40VarD = o7k0.d(s5x0.M(jm40Var, 6.0f, 8.0f, 8.0f, 8.0f), 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
            if (l3wVar.f19376a.length() > 0) {
                fetVar2.e0(-1223476670);
                z = false;
                v8q0.a(l3wVar.f19376a, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, 0, 0, 131068);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-1223247518);
                fetVar2.r(false);
            }
            if (l3wVar.b.length() > 0) {
                fetVar2.e0(-1223171196);
                v8q0.a(l3wVar.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 0, 131070);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                fetVar2.e0(-1222988606);
                fetVar2.r(z);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, l3wVar, i, (byte) 16);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-420516578);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f), 204.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 204.0f)), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 204.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 6);
        }
    }

    public static final void c(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-193434816);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            zfn zfnVar = m8m0.f21378a;
            ilm ilmVar = new ilm(((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU());
            plm plmVar = new plm(xsm0.s(R.string.toto_jackpot_title, fetVar), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fa50.f9191a);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            ra50 ra50Var = ra50.f30118a;
            imm immVar = new imm(ilmVar, plmVar, new dmm(new va50(new wkm(0, R.drawable.ic_glyph_toto, true, ra50Var, jM123getWhite0d7_KjU), new wkm(1, R.drawable.ic_glyph_info_circle, true, ra50Var, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU()))), ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), false, null);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u9x(function1, (byte) 26);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new i1y(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarN, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4052);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var2, function1, i, (byte) 4);
        }
    }

    public static final void d(final m010 m010Var, mm40 mm40Var, fet fetVar, int i) {
        m010Var.getClass();
        fetVar.g0(-1647493503);
        final byte b = 4;
        final byte b2 = 2;
        int i2 = i | (fetVar.g(m010Var) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        final byte b3 = 0;
        final byte b4 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            final byte b5 = 3;
            final byte b6 = 5;
            mbc.f(mm40Var, 0.55f, 0.7f, u1c.M(1456102268, new xdr() { // from class: a.c010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b7 = b3;
                    m010 m010Var2 = m010Var;
                    switch (b7) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f, 28.0f), null, false, 3), m010Var2.f20932a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                x2x.u(0, 1, fetVar3, null, m010Var2.b);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar4, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3), m010Var2.c);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar5, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), m010Var2.d);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), m010Var2.e);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(jm40.b, 46.0f), m010Var2.f);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1553802499, new xdr() { // from class: a.c010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b7 = b4;
                    m010 m010Var2 = m010Var;
                    switch (b7) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f, 28.0f), null, false, 3), m010Var2.f20932a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                x2x.u(0, 1, fetVar3, null, m010Var2.b);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar4, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3), m010Var2.c);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar5, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), m010Var2.d);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), m010Var2.e);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(jm40.b, 46.0f), m010Var2.f);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, null, u1c.M(-1993582208, new xdr() { // from class: a.c010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b7 = b2;
                    m010 m010Var2 = m010Var;
                    switch (b7) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f, 28.0f), null, false, 3), m010Var2.f20932a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                x2x.u(0, 1, fetVar3, null, m010Var2.b);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar4, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3), m010Var2.c);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar5, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), m010Var2.d);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), m010Var2.e);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(jm40.b, 46.0f), m010Var2.f);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1393796994, new xdr() { // from class: a.c010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b7 = b5;
                    m010 m010Var2 = m010Var;
                    switch (b7) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f, 28.0f), null, false, 3), m010Var2.f20932a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                x2x.u(0, 1, fetVar3, null, m010Var2.b);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar4, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3), m010Var2.c);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar5, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), m010Var2.d);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), m010Var2.e);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(jm40.b, 46.0f), m010Var2.f);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-108734465, new xdr() { // from class: a.c010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b7 = b;
                    m010 m010Var2 = m010Var;
                    switch (b7) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f, 28.0f), null, false, 3), m010Var2.f20932a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                x2x.u(0, 1, fetVar3, null, m010Var2.b);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar4, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3), m010Var2.c);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar5, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), m010Var2.d);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), m010Var2.e);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(jm40.b, 46.0f), m010Var2.f);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1176328064, new xdr() { // from class: a.c010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b7 = b6;
                    m010 m010Var2 = m010Var;
                    switch (b7) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f, 28.0f), null, false, 3), m010Var2.f20932a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                x2x.u(0, 1, fetVar3, null, m010Var2.b);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar4, o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3), m010Var2.c);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar5, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), m010Var2.d);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), m010Var2.e);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        default:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(jm40.b, 46.0f), m010Var2.f);
                            } else {
                                fetVar7.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i2 >> 3) & 14) | 807079296, 438, Response.PAYMENT_REQUIRED);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(m010Var, mm40Var, i, (byte) 29);
        }
    }

    public static final void e(mm40 mm40Var, kz20 kz20Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        ugd ugdVar2 = ugdVar;
        function1.getClass();
        fetVar.g0(-650296617);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kz20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
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
            boolean z = kz20Var.e;
            pzn pznVarA = kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3));
            alo aloVarA = kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3));
            ugd ugdVarM = u1c.M(-755150391, new gz20(kz20Var, function1, (byte) 1), fetVar);
            int i3 = i2;
            y5d y5dVar = y5d.f42040a;
            b34.e(y5dVar, z, null, pznVarA, aloVarA, null, ugdVarM, fetVar, 1600518, 18);
            b34.e(y5dVar, kz20Var.g, null, kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(1327953714, new gz20(kz20Var, function1, (byte) 2), fetVar), fetVar, 1600518, 18);
            pz40 pz40Var = s6t0.f31722a;
            b34.e(y5dVar, kz20Var.j != null, i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n), kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(1986336593, new gz20(kz20Var, function1, (byte) 3), fetVar), fetVar, 1600518, 16);
            ugdVar2 = ugdVar;
            ugdVar2.F(Long.valueOf(kz20Var.c), fetVar, Integer.valueOf((i3 >> 6) & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hz20(mm40Var, kz20Var, function1, ugdVar2, i, (byte) 1);
        }
    }

    public static final void f(mm40 mm40Var, nom0 nom0Var, String str, l3w l3wVar, so30 so30Var, so30 so30Var2, Function0 function0, Function1 function1, fet fetVar, int i) {
        String str2 = str;
        str2.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(343816847);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(nom0Var) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(l3wVar) ? 2048 : 1024) | (fetVar.g(so30Var) ? 16384 : 8192) | (fetVar.g(so30Var2) ? 131072 : 65536) | (fetVar.i(function0) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
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
            if (l3wVar != null) {
                fetVar.e0(-1538175679);
                zcl zclVar = qmk.f28987a;
                a(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), l3wVar, fetVar, (i2 >> 6) & 112);
                fetVar.r(false);
            } else {
                fetVar.e0(-1537995011);
                fetVar.r(false);
            }
            int i3 = i2 >> 9;
            w(nom0Var, so30Var, so30Var2, function1, fetVar, ((i2 >> 3) & 14) | (i3 & 112) | (i3 & 896) | ((i2 >> 12) & 7168));
            if (str.length() > 0) {
                fetVar.e0(-1537712229);
                str2 = str;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1924739945, new txf(str2, function0, (byte) 2), fetVar), fetVar, 56);
                fetVar.r(false);
            } else {
                str2 = str;
                fetVar.e0(-1537003011);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6(mm40Var, nom0Var, str2, l3wVar, so30Var, so30Var2, function0, function1, i);
        }
    }

    public static final void g(d280 d280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1788868176);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(d280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, b);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.d().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5l0(d280Var, str, i, (byte) 2);
        }
    }

    public static final void h(int i, long j, long j2, fet fetVar, d280 d280Var, d280 d280Var2, String str, String str2, String str3, String str4) {
        long j3;
        d280 d280Var3;
        long j4 = j2;
        String str5 = str3;
        String str6 = str4;
        fetVar.g0(-537086774);
        int i2 = i | (fetVar.g(d280Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(d280Var2) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192) | (fetVar.f(j) ? 131072 : 65536) | (fetVar.g(str6) ? 1048576 : 524288) | (fetVar.f(j4) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            d280Var3 = d280Var;
            g(d280Var3, str, fetVar, i2 & 126);
            g(d280Var2, str2, fetVar, (i2 >> 6) & 126);
            fetVar.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            j3 = j;
            str5 = str3;
            t(str5, j3, fetVar, (i2 >> 12) & 126);
            j4 = j2;
            str6 = str4;
            t(str6, j4, fetVar, (i2 >> 18) & 126);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            j3 = j;
            d280Var3 = d280Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q5l0(d280Var3, str, d280Var2, str2, str5, j3, str6, j4, i, (byte) 2);
        }
    }

    public static final long i(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void j(mm40 mm40Var, final j00 j00Var, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        final byte b;
        fetVar.g0(-188587723);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            boolean z3 = z2 | (i3 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new n180(j00Var, z, b2);
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
            v8q0.a(j00Var.b, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            boolean z4 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                b = 0;
                objP2 = new Function0() { // from class: a.l180
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        j00 j00Var2 = j00Var;
                        switch (b3) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.h, j00Var2.c);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, j00Var2.e);
                        }
                    }
                };
                fetVar.o0(objP2);
            } else {
                b = 0;
            }
            final byte b3 = 1;
            kkb.p(1, fetVar, null, (Function0) objP2);
            n4c.l(null, j00Var.f15659a, z, fetVar, 1);
            byte b4 = i3 == 32 ? (byte) 1 : b;
            Object objP3 = fetVar.P();
            if (b4 != 0 || objP3 == cl5Var) {
                objP3 = new Function0() { // from class: a.l180
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b3;
                        j00 j00Var2 = j00Var;
                        switch (b5) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.h, j00Var2.c);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, j00Var2.e);
                        }
                    }
                };
                fetVar.o0(objP3);
            }
            kkb.p(1, fetVar, null, (Function0) objP3);
            v8q0.a(j00Var.d, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            zcl zclVar = qmk.f28987a;
            v8q0.a(j00Var.f, s5x0.K(i120.Q(o7k0.e(jm40.b, 14.0f), j00Var.h, vgg0.a(4.0f)), 4.0f, 2.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.m(g1t0.c(), fetVar), fetVar, 0, 0, 130044);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) mm40Var, (Object) j00Var, z, i, (byte) 5);
        }
    }

    public static final void k(mm40 mm40Var, zw80 zw80Var, qdz qdzVar, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        function2.getClass();
        fetVar2.g0(-2056322762);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(zw80Var) : fetVar2.i(zw80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(qdzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = zw80Var instanceof xw80;
            jm40 jm40Var2 = jm40.b;
            if (z) {
                fetVar2.e0(-792492170);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
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
                xw80 xw80Var = (xw80) zw80Var;
                jm40Var = jm40Var2;
                v8q0.a(xw80Var.b, o2e.e0(s5x0.J(jm40Var2, 8.0f), "PARTNER_BOTTOM_DISCIPLINES_TEXT"), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, 0, 0, 131064);
                xcz xczVarB = qdzVar.b(xw80Var.f41598a, new ht80((byte) 4), fetVar2, i2 & 896);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar2.i(zw80Var)));
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new ww80(zw80Var, function2);
                    fetVar2.o0(objP);
                }
                b8k0.f(null, xczVarB, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.BAD_EVENT);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                if (!zw80Var.equals(yw80.f43359a)) {
                    throw b1j.f(-441208644, fetVar2, false);
                }
                fetVar2.e0(-791215094);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 29, i, (Object) mm40Var2, (Object) zw80Var, (Object) qdzVar, (Object) function2);
        }
    }

    public static final void l(mm40 mm40Var, vw80 vw80Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-28894780);
        int i2 = i | (fetVar2.g(vw80Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "PARTNER_DISCIPLINE");
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new qw80(function1, vw80Var, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarO = feb.O(mm40VarE0, (Function0) objP);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarO, background, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 8.0f, 10.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            n0x n0xVar = vw80Var.b;
            m0x m0xVar = vw80Var.c;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            pge pgeVar = gqw0.B;
            jm40 jm40Var = jm40.b;
            lgb.w(o7k0.n(jm40Var, 20.0f), o7k0.n(jm40Var, 20.0f), n0xVar, m0xVar, secondary, null, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), pgeVar, fetVar2, 12582912, 32);
            v8q0.a(vw80Var.d, o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), "PARTNER_DISCIPLINE_TEXT"), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, vw80Var, function1, i, (byte) 25);
        }
    }

    public static final void m(mm40 mm40Var, oea0 oea0Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(-859708076);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(oea0Var) : fetVar2.i(oea0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = oea0Var.e;
            boolean z2 = oea0Var.f;
            l7m0 l7m0VarK0 = sac.k0(l7m0Var, z, fetVar2, (i2 >> 6) & 14);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(o7k0.e(jm40Var, 60.0f), z2 ? 0.6f : 1.0f);
            boolean z3 = !z2;
            boolean z4 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar2.i(oea0Var))) | ((i2 & 7168) == 2048);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new jf00(function1, oea0Var, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, z3, null, (Function0) objP, 24);
            boolean zG = fetVar2.g(l7m0VarK0);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ufp(l7m0VarK0, (byte) 19);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarK = rq8.K(mm40VarW, (Function1) objP2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = r71.F;
                fetVar2.o0(objP3);
            }
            tj30 tj30Var = (tj30) objP3;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            c280 c280Var = oea0Var.b;
            boolean zG2 = fetVar2.g(c280Var);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new t6n(d4d.STATIC_WHITE60, w6n.h, c280Var);
                fetVar2.o0(objP4);
            }
            t6n t6nVar = (t6n) objP4;
            mm40 mm40VarK0 = mrv.k0(jm40Var, "PitchPlayerLogo");
            boolean zG3 = fetVar2.g(t6nVar);
            Object objP5 = fetVar2.P();
            if (zG3 || objP5 == cl5Var) {
                objP5 = new m2m(t6nVar, (byte) 2);
                fetVar2.o0(objP5);
            }
            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP5);
            mm40Var2 = jm40Var;
            v8q0.a(oea0Var.c, mrv.k0(jm40Var, "PitchPlayerName"), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            if (oea0Var.d) {
                fetVar2.e0(1129594515);
                j6n.h(xsm0.s(R.string.bets_on_players_captain_tag_value, fetVar2), tqo0.f34390a, mrv.k0(o7k0.s(mm40Var2, 16.0f), "PitchPlayerCaptainTag"), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1129919767);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 0, i, (Object) mm40Var2, (Object) oea0Var, (Object) l7m0Var, (Object) function1);
        }
    }

    public static final void n(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        Function1 function2;
        fet fetVar2 = fetVar;
        yx7 yx7Var = gqw0.j;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-432431733);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = kzn.d(ro4.m0(Response.OK, 0, null, 6), 0.0f, 2).a(kzn.c(ro4.m0(Response.OK, 0, ihn.f14788a, 2), yx7Var, 12));
                fetVar2.o0(objP);
            }
            pzn pznVar = (pzn) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = kzn.e(ro4.m0(Response.OK, 0, null, 6), 2).a(kzn.i(ro4.m0(Response.OK, 0, ihn.f14788a, 2), yx7Var, 12));
                fetVar2.o0(objP2);
            }
            alo aloVar = (alo) objP2;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            cmm cmmVar = ((emb0) l7m0Var.getValue()).h;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new rpa0(function1, (byte) 10);
                fetVar2.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            if (((emb0) l7m0Var.getValue()).k == skb0.TopUpBalance) {
                fetVar2.e0(-756541892);
                boolean z2 = i3 == 256;
                Object objP4 = fetVar2.P();
                if (z2 || objP4 == cl5Var) {
                    objP4 = new rpa0(function1, (byte) 11);
                    fetVar2.o0(objP4);
                }
                function2 = (Function1) objP4;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-755934199);
                fetVar2.r(false);
                function2 = null;
            }
            byte b = 12;
            unh0.y(mm40VarD, cmmVar, function3, function2, fetVar2, 6);
            boolean z3 = ((emb0) l7m0Var.getValue()).d;
            ugd ugdVarM = u1c.M(1780296317, new tft(l7m0Var, (byte) 13), fetVar2);
            y5d y5dVar = y5d.f42040a;
            fetVar2 = fetVar2;
            b34.e(y5dVar, z3, null, pznVar, aloVar, null, ugdVarM, fetVar2, 1600518, 18);
            Object[] objArr = new Object[0];
            boolean z4 = (i2 & 112) == 32;
            Object objP5 = fetVar2.P();
            if (z4 || objP5 == cl5Var) {
                objP5 = new wda0(l7m0Var, b);
                fetVar2.o0(objP5);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP5, fetVar2);
            if (((g1b0) l7m0VarY.getValue()).f10505a) {
                fetVar2.e0(-755370743);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                Object objP6 = fetVar2.P();
                if (objP6 == cl5Var) {
                    objP6 = new peb0((byte) 2);
                    fetVar2.o0(objP6);
                }
                mm40 mm40VarK = rq8.K(mm40VarD2, (Function1) objP6);
                float f = xfn.a(fetVar2).d;
                float f2 = xfn.a(fetVar2).d;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarK, f, 0.0f, f2, 8.0f, 2);
                String str = ((g1b0) l7m0VarY.getValue()).b;
                String str2 = ((g1b0) l7m0VarY.getValue()).c;
                boolean z5 = i3 == 256;
                Object objP7 = fetVar2.P();
                if (z5 || objP7 == cl5Var) {
                    objP7 = new wta0(function1, (byte) 7);
                    fetVar2.o0(objP7);
                }
                Function0 function0 = (Function0) objP7;
                boolean z6 = i3 == 256;
                Object objP8 = fetVar2.P();
                if (z6 || objP8 == cl5Var) {
                    objP8 = new wta0(function1, (byte) 8);
                    fetVar2.o0(objP8);
                }
                pzb.g(mm40VarN, str, str2, function0, (Function0) objP8, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-754598099);
                fetVar2.r(false);
            }
            ugdVar2 = ugdVar;
            vqd.t(54, ugdVar2, y5dVar, fetVar2, true);
        } else {
            ugdVar2 = ugdVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qhb0(mm40Var, l7m0Var, function1, ugdVar2, i, (byte) 0);
        }
    }

    public static final void o(mm40 mm40Var, t5d0 t5d0Var, hh80 hh80Var, Function1 function1, fet fetVar, int i) {
        hh80 hh80Var2;
        fetVar.g0(-62218418);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(t5d0Var) ? 32 : 16) | 384 | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            lh80 lh80VarT = s5x0.t(0.0f, 0.0f, 3);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            atm0.e(mm40VarD, lh80VarT, new qw3(8.0f, true, new jf4(b)), new qw3(8.0f, true, new jf4(b)), u1c.M(451472892, new j5d0(t5d0Var, function1, (byte) 3), fetVar), fetVar, 197040);
            hh80Var2 = lh80VarT;
        } else {
            fetVar.X();
            hh80Var2 = hh80Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) t5d0Var, (Object) hh80Var2, function1, i, (byte) 7);
        }
    }

    public static final jge0 p(long j, long j2) {
        return new jge0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final jge0 q(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jge0(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final jge0 r(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jge0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1617005643);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarC = o7k0.c(mm40Var2, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarN, zx7Var);
            mm40 mm40VarB2 = jr8Var.b(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 24.0f), gqw0.g);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.A;
            lgb.v(mm40VarB, mm40VarB, str, R.drawable.ic_glyph_circle_globe, jM130getWhite600d7_KjU, pgeVar, fetVar2, ((i2 << 3) & 896) | 196608, 0);
            fetVar2 = fetVar;
            lgb.v(mm40VarB2, mm40VarB2, str2, R.drawable.ic_glyph_circle_globe, staticColors.m130getWhite600d7_KjU(), pgeVar, fetVar2, (i2 & 896) | 196608, 0);
            fetVar2.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var2, str, str2, i, (byte) 18);
        }
    }

    public static final void t(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1625633759);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            v8q0.a(str, o7k0.u(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 144.0f, 1), j, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 4);
        }
    }

    public static final void u(eqh0 eqh0Var, mm40 mm40Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        eqh0Var.getClass();
        fetVar2.g0(-1992594872);
        int i2 = i | (fetVar2.g(eqh0Var) ? 4 : 2) | (fetVar2.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            nw3 nw3Var = uc9.g;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.M(mm40Var, 16.0f, 12.0f, 16.0f, 8.0f), 1.0f);
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.j, fetVar2, 6);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarE = new ecu0(yx7Var).e(new x7z(1.0f, false));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            String str = eqh0Var.f8237a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarU = g1t0.u();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 2, 0, null, y9q0VarU, fetVar, 0, 24576, 114682);
            fetVar2 = fetVar;
            if (eqh0Var.c) {
                fetVar2.e0(2023532728);
                qxw.o(fetVar2, o7k0.e(jm40.b, 4.0f));
                String str2 = eqh0Var.b;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(2023805652);
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
            fre0.I(eqh0Var.d, eqh0Var.e, eqh0Var.f, o2e.e0(s5x0.N(new ecu0(yx7Var), 8.0f, 0.0f, 0.0f, 0.0f, 14), "SecurityCircularProgressIndicator"), ibc.Y(eqh0Var.g, fetVar2), 0L, fetVar2, 0);
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0(eqh0Var, mm40Var, i, b);
        }
    }

    public static final void v(mm40 mm40Var, boolean z, vtm vtmVar, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(309681112);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.g(vtmVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                fetVar.e0(1250812511);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1250813435);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
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
            d280 d280Var = vtmVar.f38014a;
            String str = vtmVar.c;
            h(0, vtmVar.e, vtmVar.h, fetVar, d280Var, vtmVar.b, str, vtmVar.f, vtmVar.d, vtmVar.g);
            obc.d(bmd.n.a(k6zVar), u1c.M(-515627762, new edk0(vtmVar, (byte) 9), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13((byte) 7, i, mm40Var, (Object) vtmVar, z);
        }
    }

    public static final void w(nom0 nom0Var, final so30 so30Var, final so30 so30Var2, Function1 function1, fet fetVar, int i) {
        int i2;
        final Function1 function2;
        long primary;
        Object objE;
        int i3;
        float f;
        cl5 cl5Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-810000869);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(nom0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(so30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(so30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            hom0 hom0Var = nom0Var.b;
            boolean zE = fetVar2.e(hom0Var.ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zE || objP == cl5Var2) {
                switch (hom0Var.ordinal()) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        primary = s6t0.b().f33626a.getPrimary();
                        break;
                    case 1:
                    case 2:
                    case 3:
                        pz40 pz40Var2 = s6t0.f31722a;
                        primary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                        break;
                    case 4:
                    case 5:
                        pz40 pz40Var3 = s6t0.f31722a;
                        primary = StaticColors.INSTANCE.m113getRed0d7_KjU();
                        break;
                    case 6:
                    case 7:
                        pz40 pz40Var4 = s6t0.f31722a;
                        primary = s6t0.b().f33626a.getSecondary();
                        break;
                    default:
                        t9f.b();
                        return;
                }
                objE = dw9.e(primary, fetVar2);
            } else {
                objE = objP;
            }
            long j = ((y3d) objE).f41946a;
            boolean zE2 = fetVar2.e(hom0Var.ordinal());
            Object objP2 = fetVar2.P();
            if (zE2 || objP2 == cl5Var2) {
                switch (hom0Var.ordinal()) {
                    case 0:
                    case 1:
                        i3 = R.drawable.ic_glyph_status_outline_check;
                        break;
                    case 2:
                        i3 = R.drawable.ic_glyph_status_outline_plus;
                        break;
                    case 3:
                        i3 = R.drawable.ic_glyph_status_outline_return;
                        break;
                    case 4:
                        i3 = R.drawable.ic_glyph_status_outline_cancel;
                        break;
                    case 5:
                        i3 = R.drawable.ic_glyph_status_outline_minus;
                        break;
                    case 6:
                        i3 = R.drawable.ic_glyph_status_outline_clock;
                        break;
                    case 7:
                        i3 = R.drawable.ic_glyph_status_outline_block;
                        break;
                    default:
                        t9f.b();
                        return;
                }
                objP2 = Integer.valueOf(i3);
                fetVar2.o0(objP2);
            }
            int iIntValue = ((Number) objP2).intValue();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (so30Var == null && so30Var2 == null) {
                zcl zclVar = qmk.f28987a;
                f = 8.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            }
            mm40 mm40VarL = s5x0.L(x7zVar, 0.0f, f, 1);
            thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            final byte b = 0;
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            String str = nom0Var.f23874a;
            qrq qrqVar = j1t0.b;
            long j2 = qmk.r;
            final byte b2 = 1;
            v8q0.a(str, x7zVar2, j, new n05(qmk.q, j2, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110576);
            dww.c(a8k0.F(iIntValue, 0, fetVar), null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), j, fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (so30Var != null) {
                fetVar2.e0(-885512269);
                wul wulVar = new wul(qul.e, oe9.b, new te9(so30Var.f32525a), true, false, false);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
                Object objP3 = fetVar2.P();
                if (z2) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP3 != cl5Var) {
                        function2 = function1;
                    }
                    qzb.n(null, wulVar, (Function0) objP3, fetVar2, 0, 1);
                    fetVar2.r(false);
                }
                function2 = function1;
                objP3 = new Function0() { // from class: a.wo30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b) {
                            case 0:
                                function2.invoke(so30Var.b);
                                break;
                            default:
                                function2.invoke(so30Var.b);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
                qzb.n(null, wulVar, (Function0) objP3, fetVar2, 0, 1);
                fetVar2.r(false);
            } else {
                function2 = function1;
                cl5Var = cl5Var2;
                fetVar2.e0(-1680649877);
                fetVar2.r(false);
            }
            if (so30Var2 != null) {
                fetVar2.e0(-885496715);
                wul wulVar2 = new wul(qul.e, oe9.b, new te9(so30Var2.f32525a), true, false, false);
                boolean z3 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objP4 = fetVar2.P();
                if (z3 || objP4 == cl5Var) {
                    objP4 = new Function0() { // from class: a.wo30
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (b2) {
                                case 0:
                                    function2.invoke(so30Var2.b);
                                    break;
                                default:
                                    function2.invoke(so30Var2.b);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP4);
                }
                qzb.n(null, wulVar2, (Function0) objP4, fetVar2, 0, 1);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1680165781);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 16, i, (Object) nom0Var, (Object) so30Var, (Object) so30Var2, (Object) function2);
        }
    }

    public static final Object x(to9 to9Var, yje yjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        n5aVar.t(new iry(to9Var, (byte) 0));
        to9Var.y(new onv(n5aVar));
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    public static final Object y(to9 to9Var, yje yjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        n5aVar.t(new iry(to9Var, (byte) 1));
        to9Var.y(new pyu(n5aVar));
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    public static final void z(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((g4j0) yfu0Var).b.setText(((o4j0) cpVar.u()).f);
        g4j0 g4j0Var = (g4j0) yfu0Var;
        ((DsSettingsCell) g4j0Var.f.d).setFirst(true);
        ((DsSettingsCell) g4j0Var.f.d).setLast(false);
    }
}
