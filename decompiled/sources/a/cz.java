package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.format.DateUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5201a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ ocl c;

    public /* synthetic */ cz(ocl oclVar, ctf0 ctf0Var, byte b) {
        this.f5201a = b;
        this.c = oclVar;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) throws Throwable {
        String strF;
        wui0 wui0Var;
        List list;
        ks9 js9Var;
        cs9 cs9Var = (cs9) obj;
        cs9Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        bs9 bs9Var = cs9Var.b;
        List list2 = cs9Var.f4877a;
        bs9 bs9Var2 = bs9.d;
        ocl oclVar = this.c;
        if (bs9Var == bs9Var2) {
            return new ns9(ocl.b(oclVar, pb10.r1, pdm.c, 0, 0, R.string.empty_callback, 0, 0L, 0L, 988));
        }
        if (bs9Var != bs9.e && (list2.isEmpty() || bs9Var != bs9.b)) {
            return bs9Var == bs9.c ? new ps9(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)) : rs9.f31021a;
        }
        ArrayList arrayList = new ArrayList();
        lsm0 lsm0Var = ctf0Var.b;
        boolean zH = ctf0Var.h();
        Iterator it = list2.iterator();
        int size = -1;
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                return new ls9(dyb.o0(arrayList), size, cs9Var.c || bs9Var == bs9.b);
            }
            xq9 xq9Var = (xq9) it.next();
            long j = xq9Var.f41304a;
            List list3 = xq9Var.b;
            Throwable th = null;
            if (DateUtils.isToday(j)) {
                strF = ctf0Var.f(R.string.today, new Object[0]);
            } else if (DateUtils.isToday(86400000 + j)) {
                strF = ctf0Var.f(R.string.yesterday, new Object[0]);
            } else {
                rdj rdjVar = rdj.f30294a;
                strF = rdj.f(new ynq0(j), sdj.UNIVERSAL, null, 60);
            }
            arrayList.add(new is9(strF));
            Iterator it2 = list3.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    Throwable th2 = th;
                    q3d.p();
                    throw th2;
                }
                it9 it9Var = (it9) next;
                Throwable th3 = th;
                if (list3.size() == i) {
                    wui0Var = wui0.f39793a;
                } else if (i2 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i2 == list3.size() - i ? wui0.d : wui0.c;
                }
                wui0 wui0Var2 = wui0Var;
                Iterator it3 = it2;
                boolean z = it9Var.f15344a == cs9Var.d;
                if (z) {
                    size = arrayList.size();
                }
                int iOrdinal = it9Var.d.ordinal();
                if (iOrdinal == 0) {
                    size = size;
                    list = list3;
                    js9Var = new js9(R.drawable.ic_glyph_warning, it9Var.f15344a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitBackground, ctf0Var)), wui0Var2, lsm0Var.a(R.string.call_unknown, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH));
                } else if (iOrdinal == 1) {
                    size = size;
                    list = list3;
                    js9Var = new hs9(it9Var.f15344a, R.drawable.ic_glyph_waiting, fbc.d(ctf0.b(R.attr.uikitStaticYellow, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitStaticYellow20, ctf0Var)), lsm0Var.a(R.string.support_call_application_in_queue, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH), lsm0Var.a(R.string.support_call_please_wait_for_call, Arrays.copyOf(new Object[0], 0)), true, wui0Var2);
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        js9Var = new hs9(it9Var.f15344a, R.drawable.ic_glyph_call_missed, fbc.d(ctf0.b(R.attr.uikitWarning, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitWarningTint, ctf0Var)), lsm0Var.a(R.string.support_call_we_could_not_reach_you, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH), lsm0Var.a(R.string.support_call_please_submit_again_if_valid, Arrays.copyOf(new Object[0], 0)), false, wui0Var2);
                    } else if (iOrdinal == 4) {
                        js9Var = new hs9(it9Var.f15344a, R.drawable.ic_glyph_cancel, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitBackground, ctf0Var)), lsm0Var.a(R.string.support_call_was_canceled_by_user, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH), lsm0Var.a(R.string.support_call_please_submit_again_if_valid, Arrays.copyOf(new Object[0], 0)), false, wui0Var2);
                    } else {
                        if (iOrdinal != 5) {
                            t9f.b();
                            return th3;
                        }
                        js9Var = new hs9(it9Var.f15344a, R.drawable.ic_glyph_cancel, fbc.d(ctf0.b(R.attr.uikitWarning, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitWarningTint, ctf0Var)), lsm0Var.a(R.string.support_call_was_canceled_by_operator, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH), lsm0Var.a(R.string.support_call_if_valid_please_submit_again, Arrays.copyOf(new Object[0], 0)), false, wui0Var2);
                    }
                    list = list3;
                } else {
                    size = size;
                    List list4 = list3;
                    if (it9Var.f) {
                        list = list4;
                        js9Var = new gs9(it9Var.f15344a, fbc.d(ctf0.b(R.attr.uikitCommerce, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitCommerceTint, ctf0Var)), lsm0Var.a(R.string.support_call_successfully_completed, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH), z, wui0Var2);
                    } else {
                        list = list4;
                        int i4 = it9Var.g;
                        long j2 = it9Var.f15344a;
                        if (i4 > 0) {
                            js9Var = new fs9(it9Var.g, j2, fbc.d(ctf0.b(R.attr.uikitCommerce, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitCommerceTint, ctf0Var)), wui0Var2, lsm0Var.a(R.string.support_call_successfully_completed, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH));
                        } else {
                            js9Var = new js9(R.drawable.ic_glyph_call_back, j2, fbc.d(ctf0.b(R.attr.uikitCommerce, ctf0Var)), fbc.d(ctf0.b(R.attr.uikitCommerceTint, ctf0Var)), wui0Var2, lsm0Var.a(R.string.support_call_successfully_completed, Arrays.copyOf(new Object[0], 0)), kpb.N(it9Var, zH));
                        }
                    }
                }
                arrayList.add(js9Var);
                list3 = list;
                it2 = it3;
                size = size;
                i2 = i3;
                ctf0Var = ctf0Var;
                i = 1;
                th = th3;
            }
        }
    }

    private final Object b(Object obj) {
        String str;
        oxh oxhVar = (oxh) obj;
        oxhVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List<lsd0> list = oxhVar.d.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                a4x a4xVarO0 = dyb.o0(arrayList);
                list.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (lsd0 lsd0Var : list) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = lsd0Var.b.iterator();
                    while (true) {
                        String str2 = "";
                        if (it2.hasNext()) {
                            g9a0 g9a0Var = (g9a0) it2.next();
                            String str3 = g9a0Var.f10904a;
                            String str4 = g9a0Var.f;
                            String str5 = str3.length() == 0 ? "-" : str3;
                            String str6 = g9a0Var.b;
                            if (kotlin.text.c.x(str6, ujn.h, z)) {
                                str = str6;
                            } else {
                                if (str6.length() != 0) {
                                    List list2 = u0d.f34849a;
                                    if (!u0d.c(str6)) {
                                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str6, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str6}, 2));
                                    }
                                }
                                str = str2;
                            }
                            c6u0 c6u0Var = g9a0Var.h;
                            arrayList3.add(new vwh(g9a0Var.e, str5, str, str4, c6u0Var.b == 0 ? 0 : ckb.d0(c6u0Var).b, ctf0Var.d(R.dimen.size_16), ctf0Var.d(R.dimen.space_4), ctf0Var.d(R.dimen.size_180)));
                            String str7 = g9a0Var.g;
                            if (str7.length() == 0) {
                                str7 = "-";
                            }
                            wwh wwhVar = new wwh(ctf0Var.d(R.dimen.size_70), str7, ctf0Var.d(R.dimen.size_100), str4);
                            String str8 = g9a0Var.c;
                            if (str8.length() == 0) {
                                str8 = "-";
                            }
                            List list3 = list;
                            wwh wwhVar2 = new wwh(ctf0Var.d(R.dimen.size_70), str8, ctf0Var.d(R.dimen.size_100), str4);
                            String str9 = g9a0Var.d;
                            if (str9.length() == 0) {
                                str9 = "-";
                            }
                            arrayList4.add(dyb.g0(wwhVar, wwhVar2, new wwh(ctf0Var.d(R.dimen.size_70), str9, ctf0Var.d(R.dimen.size_100), str4)));
                            list = list3;
                            z = false;
                            z2 = true;
                        }
                    }
                    lsm0 lsm0Var = ctf0Var.b;
                    arrayList2.add(new kxh(dyb.g0(new uwh(lsm0Var.a(R.string.team, Arrays.copyOf(new Object[0], 0)), ctf0Var.d(R.dimen.space_16)), new uwh(lsm0Var.a(R.string.time, Arrays.copyOf(new Object[0], 0)), ctf0Var.d(R.dimen.space_16)), new uwh(lsm0Var.a(R.string.winter_game_title_5, Arrays.copyOf(new Object[0], 0)), ctf0Var.d(R.dimen.space_16))), dyb.o0(arrayList4), dyb.o0(arrayList3), new wwh(0, "", 0, "")));
                    z = false;
                    list = list;
                    z2 = true;
                }
                List list4 = list;
                boolean z3 = oxhVar.b;
                ocl oclVar = this.c;
                if (z3) {
                    return new qxh(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (oxhVar.c) {
                    return new qxh(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                if (oxhVar.f26011a) {
                    return rxh.f31264a;
                }
                return new pxh(a4xVarO0, dyb.o0(arrayList2), oxhVar.e, list4.size());
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            long j = i;
            arrayList.add(new lxl(j, (dyl) new xxl(((lsd0) next).f20574a), (Integer) 1, false, oxhVar.e == j ? uxl.b : uxl.f36445a, (cwl) null));
            i = i2;
        }
    }

    private final Object c(Object obj) {
        k8k k8kVar = (k8k) obj;
        k8kVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = k8kVar.c;
        String str = k8kVar.d;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.limit_not_saved_error, Arrays.copyOf(new Object[0], 0));
        d8k d8kVar = k8kVar.b;
        boolean z2 = d8kVar.f5653a;
        long j = d8kVar.b;
        x6q0 x6q0Var = null;
        if (z2) {
            String strValueOf = j != 0 ? String.valueOf(j) : "";
            s7q0 s7q0Var = new s7q0(str);
            String strA2 = lsm0Var.a(R.string.limits_enter_sum_with_currency_v2, Arrays.copyOf(new Object[]{d8kVar.e}, 1));
            x6q0Var = new x6q0(strValueOf, o6q0.f24750a, s7q0Var, true, str.length() > 0, new y5q0(9, null, null, 6), strA2, null, 0, 32000);
        }
        mtl mtlVar = new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), !k8kVar.c && z2 && str.length() == 0 && j > 0, false, true), m7k.f21324a)));
        boolean z3 = k8kVar.e;
        mdm mdmVarB = ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990);
        pz40 pz40Var = s6t0.f31722a;
        return new l8k(z, strA, x6q0Var, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(lsm0Var.a(R.string.limits_choice_title, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null), mtlVar, z3, mdmVarB);
    }

    private final Object g(Object obj) {
        int i;
        t4q t4qVar = (t4q) obj;
        t4qVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        zzp0 zzp0Var = t4qVar.d;
        boolean z = !Intrinsics.d(zzp0Var, t4qVar.c);
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.rating_selectors_title, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA, ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_refresh, z, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
        if (t4qVar.f33333a) {
            return new w4q(ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), immVar);
        }
        int iOrdinal = zzp0Var.b.ordinal();
        if (iOrdinal == 0) {
            i = R.string.multisingle;
        } else if (iOrdinal == 1) {
            i = R.string.tennis_win_loss_match_type_double;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            i = R.string.empty_str;
        }
        return new v4q(immVar, new u4q(lsm0Var.a(i, Arrays.copyOf(new Object[0], 0)), String.valueOf(zzp0Var.f45266a), !zzp0Var.equals(t4qVar.b)));
    }

    /* JADX WARN: Code duplicated, block: B:74:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x020c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    private final Object h(Object obj) {
        boolean z;
        Integer num;
        Object next;
        plm plmVar;
        Object next2;
        Map mapF;
        Double dValueOf;
        se seVar;
        Object next3;
        List list;
        sbq sbqVar;
        List list2;
        oaq oaqVar = (oaq) obj;
        oaqVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z2 = oaqVar.h;
        int i = oaqVar.j;
        Integer num2 = oaqVar.c;
        List list3 = oaqVar.f24940a;
        cev cevVar = oaqVar.g;
        eb8 eb8Var = oaqVar.e;
        kcq kcqVar = oaqVar.f;
        boolean z3 = oaqVar.b;
        fa50 fa50Var = fa50.f9191a;
        if (z2) {
            z = z2;
            num = num2;
            String strL = kng0.l("\u202a", ctf0Var.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), "\u202c");
            pz40 pz40Var = s6t0.f31722a;
            plmVar = new plm(strL, s6t0.b().f33626a.getSecondary(), fa50Var);
        } else {
            z = z2;
            num = num2;
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int i2 = ((gcq) next).f11074a;
                if (num != null && i2 == num.intValue()) {
                    break;
                }
            }
            gcq gcqVar = (gcq) next;
            if (gcqVar != null) {
                String strL2 = kng0.l("\u202a", gcqVar.b, "\u202c");
                pz40 pz40Var2 = s6t0.f31722a;
                plmVar = new plm(strL2, s6t0.b().f33626a.getSecondary(), new ea50(s6t0.b().f33626a.getSecondary()));
            } else {
                String strL3 = kng0.l("\u202a", ctf0Var.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), "\u202c");
                pz40 pz40Var3 = s6t0.f31722a;
                plmVar = new plm(strL3, s6t0.b().f33626a.getSecondary(), fa50Var);
            }
        }
        boolean z4 = oaqVar.i;
        ocl oclVar = this.c;
        if (z4) {
            return new qaq(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), hic.x(plmVar, z3, false));
        }
        if (z) {
            return new raq(hic.x(plmVar, z3, false));
        }
        qaq qaqVar = new qaq(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), hic.x(plmVar, z3, false));
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            int i3 = ((gcq) next2).f11074a;
            if (num != null && i3 == num.intValue()) {
                break;
            }
        }
        gcq gcqVar2 = (gcq) next2;
        if (kcqVar == null || (list2 = kcqVar.b) == null) {
            mapF = null;
        } else {
            wbq wbqVar = oaqVar.k;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = CollectionsKt.A0(list2, new e3l((byte) 12)).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    mapF = xp20.f(new Pair(wbq.f38891a, dyb.o0(arrayList)), new Pair(wbq.b, dyb.o0(arrayList2)));
                    break;
                }
                sbq sbqVar2 = (sbq) it3.next();
                int iOrdinal = sbqVar2.e.ordinal();
                if (iOrdinal == 0) {
                    arrayList.add(vfc.P(sbqVar2, i == arrayList.size(), wbqVar));
                } else {
                    if (iOrdinal != 1) {
                        mapF = lun.f20680a;
                        mapF.getClass();
                        break;
                    }
                    arrayList2.add(vfc.P(sbqVar2, i == arrayList2.size(), wbqVar));
                }
            }
        }
        if (kcqVar != null && (list = kcqVar.b) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((sbq) obj2).e == wbq.b) {
                    arrayList3.add(obj2);
                }
            }
            List listA0 = CollectionsKt.A0(arrayList3, new e3l((byte) 13));
            if (listA0 != null && (sbqVar = (sbq) CollectionsKt.W(i, listA0)) != null) {
                dValueOf = Double.valueOf(sbqVar.c);
            } else if (eb8Var != null) {
                dValueOf = Double.valueOf(eb8Var.d);
            } else {
                dValueOf = null;
            }
        } else if (eb8Var != null) {
            dValueOf = Double.valueOf(eb8Var.d);
        } else {
            dValueOf = null;
        }
        a4x a4xVar = mapF != null ? (a4x) mapF.get(wbq.f38891a) : null;
        a4x a4xVar2 = mapF != null ? (a4x) mapF.get(wbq.b) : null;
        if (mapF != null && dValueOf != null && a4xVar != null && !a4xVar.isEmpty() && a4xVar2 != null && !a4xVar2.isEmpty() && cevVar != 0) {
            imm immVarX = hic.x(plmVar, z3, true);
            g9q g9qVar = oaqVar.d;
            if (g9qVar != null) {
                String str = g9qVar.m;
                pn40 pn40Var = pn40.f27267a;
                seVar = new se(str, new oe(pn40.c(g9qVar.b, p3u0.c), g9qVar.f), null);
            } else {
                seVar = null;
            }
            if (eb8Var != null) {
                float f = eb8Var.b;
                int i4 = gcqVar2 != null ? gcqVar2.c : 0;
                long j = cevVar.c;
                float f2 = cevVar.f4232a;
                boolean z5 = j < 0;
                float f3 = ((f - f2) / f2) * 100.0f;
                String strConcat = String.format(Locale.ENGLISH, "%2.4f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1)).concat(Separators.PERCENT);
                db8 db8Var = f3 < 0.0f ? db8.b : db8.f5790a;
                int i5 = cy7.f5159a;
                pn40 pn40Var2 = pn40.f27267a;
                String strE = cy7.e(pn40.j(wvb.N(f2), i4, true));
                String strE2 = cy7.e(pn40.j(wvb.N(f), i4, true));
                int i6 = z5 ? R.string.trade_open_normal : R.string.trade_closing_normal;
                lsm0 lsm0Var = ctf0Var.b;
                String strA = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                rdj rdjVar = rdj.f30294a;
                if (j < 0) {
                    j = cevVar.b;
                }
                ykq0 ykq0Var = ykq0.UNIQUE_1;
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                timeZone.getClass();
                Locale.US.getClass();
                h9q h9qVar = new h9q(strE, strE2, strA, rdj.h(new ynq0(j * 1000), ykq0Var, Boolean.TRUE, timeZone, 56), strConcat, db8Var);
                boolean zH = ctf0Var.h();
                double dDoubleValue = dValueOf.doubleValue();
                int i7 = gcqVar2 != null ? gcqVar2.c : 0;
                List list4 = cevVar.g;
                kcqVar.getClass();
                List<ybq> list5 = cevVar.e;
                Long l = (Long) CollectionsKt.W(2, list4);
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = (Long) CollectionsKt.W(1, list4);
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                oaq oaqVar2 = oaqVar;
                double d = eb8Var.c;
                double d2 = eb8Var.d;
                ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                for (ybq ybqVar : list5) {
                    ybqVar.getClass();
                    arrayList4.add(new p9q(ybqVar.f42350a, ybqVar.b));
                    ctf0Var = ctf0Var;
                    list5 = list5;
                    oaqVar2 = oaqVar2;
                    d2 = d2;
                }
                double d3 = d2;
                ctf0 ctf0Var2 = ctf0Var;
                List list6 = list5;
                oaq oaqVar3 = oaqVar2;
                a4x a4xVarO0 = dyb.o0(arrayList4);
                gcq gcqVar3 = kcqVar.c;
                int i8 = gcqVar3.f11074a;
                long j2 = jLongValue - ((long) ((i8 == 0 && gcqVar3.b.length() == 0) ? 0 : i8 >= 1500 ? 30 : 60));
                String strA2 = lsm0Var.a(R.string.finance_bet_stop_bets, Arrays.copyOf(new Object[0], 0));
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = strA2.toUpperCase(locale);
                upperCase.getClass();
                Iterator it4 = list6.iterator();
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (it4.hasNext()) {
                        long j3 = ((ybq) next3).b;
                        while (true) {
                            Object next4 = it4.next();
                            Iterator it5 = it4;
                            long j4 = ((ybq) next4).b;
                            if (j3 > j4) {
                                j3 = j4;
                                next3 = next4;
                            }
                            if (!it5.hasNext()) {
                                break;
                            }
                            it4 = it5;
                        }
                    }
                } else {
                    next3 = null;
                }
                ybq ybqVar2 = (ybq) next3;
                long j5 = ybqVar2 != null ? ybqVar2.b : 0L;
                rdj rdjVar2 = rdj.f30294a;
                boolean zH2 = ctf0Var2.h();
                ykq0 ykq0Var2 = ykq0.UNIVERSAL;
                String strH = rdj.h(new znq0(jLongValue2), ykq0Var2, Boolean.valueOf(zH2), null, 248);
                String strH2 = rdj.h(new znq0(jLongValue), ykq0Var2, Boolean.valueOf(ctf0Var2.h()), null, 248);
                pn40 pn40Var3 = pn40.f27267a;
                return new paq(immVarX, seVar, h9qVar, new i9q(d, d3, a4xVarO0, j2, upperCase, zH, j5, strH, jLongValue2, jLongValue, strH2, dDoubleValue, pn40.j(dDoubleValue, i7, true)), a4xVar, a4xVar2, oaqVar3.l);
            }
        }
        return qaqVar;
    }

    private final Object i(Object obj) {
        gmm dmmVar;
        fdv fdvVar = (fdv) obj;
        fdvVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = fdvVar.f9376a;
        List list = fdvVar.c;
        if (z) {
            return idv.f14603a;
        }
        boolean z2 = fdvVar.b;
        ocl oclVar = this.c;
        if (z2) {
            return new hdv(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (list.isEmpty()) {
            return new hdv(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        char c = 0;
        lsm0 lsm0Var = ctf0Var.b;
        List listJ = q3d.j(new hcv(lsm0Var.a(R.string.year, Arrays.copyOf(new Object[0], 0)), 17), new hcv(lsm0Var.a(R.string.stage, Arrays.copyOf(new Object[0], 0)), 8388611), new hcv(lsm0Var.a(R.string.city_title, Arrays.copyOf(new Object[0], 0)), 8388611), new hcv(lsm0Var.a(R.string.date, Arrays.copyOf(new Object[0], 0)), 8388611));
        iun iunVar = iun.f15405a;
        w8b w8bVar = new w8b(new h9b(""), 0, 0, 6);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jcv jcvVar = (jcv) it.next();
            String str = jcvVar.g;
            long j = jcvVar.e;
            tih0 tih0Var = new tih0(str);
            char c2 = c;
            List list2 = list;
            Iterator it2 = it;
            eyl0 eyl0Var = new eyl0(ctf0Var.d(R.dimen.size_14), jcvVar.b, ctf0Var.d(R.dimen.size_4), jcvVar.d);
            qkc qkcVar = new qkc(jcvVar.c);
            rdj rdjVar = rdj.f30294a;
            znq0 znq0Var = new znq0(j);
            sdj sdjVar = sdj.UNIVERSAL;
            idj idjVar = new idj(rdj.f(znq0Var, sdjVar, null, 60), rdj.f(new znq0(j), sdjVar, null, 60));
            y8b[] y8bVarArr = new y8b[4];
            y8bVarArr[c2] = tih0Var;
            y8bVarArr[1] = eyl0Var;
            y8bVarArr[2] = qkcVar;
            y8bVarArr[3] = idjVar;
            arrayList.add(q3d.j(y8bVarArr));
            c = c2;
            it = it2;
            list = list2;
        }
        List list3 = list;
        gdv gdvVar = new gdv(listJ, arrayList, iunVar, w8bVar);
        if (fdvVar.d.isEmpty() || list3.isEmpty()) {
            dmmVar = fmm.f9790a;
        } else {
            dmmVar = new dmm(new ta50(new wkm(1, R.drawable.ic_calendar_range, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)))));
        }
        return new jdv(gdvVar, dmmVar);
    }

    private final Object l(Object obj) {
        low lowVar = (low) obj;
        lowVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        if (lowVar.f20410a) {
            return uow.f36032a;
        }
        boolean z = lowVar.c;
        ocl oclVar = this.c;
        if (z) {
            return new sow(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (lowVar.b) {
            return new tow(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        List<ksd0> list = lowVar.d.f11654a;
        lsm0 lsm0Var = ctf0Var.b;
        int iD = ctf0Var.d(R.dimen.size_86);
        int iD2 = ctf0Var.d(R.dimen.space_16);
        boolean zH = ctf0Var.h();
        aow aowVar = new aow(lsm0Var.a(R.string.horse_races_date, Arrays.copyOf(new Object[0], 0)), iD);
        List listJ = q3d.j(lsm0Var.a(R.string.horse_races_hippodrome, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.horse_races_race, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.results, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.horse_races_description, Arrays.copyOf(new Object[0], 0)), "");
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(new znw((String) it.next(), iD2));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (ksd0 ksd0Var : list) {
            rdj rdjVar = rdj.f30294a;
            long j = ksd0Var.f18809a;
            arrayList2.add(new cow(rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56), iD));
        }
        a4x a4xVarO1 = dyb.o0(arrayList2);
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        for (ksd0 ksd0Var2 : list) {
            arrayList3.add(dyb.o0(q3d.j(new bow(ksd0Var2.b), new bow(ksd0Var2.c), new bow(ksd0Var2.d), new bow(CollectionsKt.b0(ksd0Var2.e, Separators.SP, null, null, null, 62)), new bow(""))));
        }
        return new row(new qow(aowVar, a4xVarO0, a4xVarO1, dyb.o0(arrayList3)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    private final Object m(Object obj) {
        dbd dbdVar;
        String strA;
        crw crwVar = (crw) obj;
        crwVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = crwVar.f4864a;
        List list = crwVar.d;
        if (z) {
            return new grw();
        }
        boolean z2 = crwVar.c;
        ocl oclVar = this.c;
        if (z2) {
            return new erw(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (crwVar.b) {
            return new frw(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (list.isEmpty()) {
            dbdVar = dbd.f5798a;
        } else {
            dbdVar = crwVar.e ? dbd.b : dbd.c;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            epw epwVar = (epw) it.next();
            epwVar.getClass();
            switch (epwVar.b) {
                case "1":
                    strA = ctf0Var.b.a(R.string.woman, Arrays.copyOf(new Object[0], 0));
                    break;
                case "2":
                    strA = ctf0Var.b.a(R.string.man, Arrays.copyOf(new Object[0], 0));
                    break;
                case "3":
                    strA = ctf0Var.b.a(R.string.statistic_horses_race_gelding, Arrays.copyOf(new Object[0], 0));
                    break;
                default:
                    strA = "-";
                    break;
            }
            String str = epwVar.f8207a;
            String str2 = epwVar.c;
            boolean z3 = epwVar.k;
            lsm0 lsm0Var = ctf0Var.b;
            arrayList.add(new fpw(dyb.o0(q3d.j(new dpw(lsm0Var.a(R.string.statistic_horses_race_start_position, Arrays.copyOf(new Object[0], 0)), epwVar.h), new dpw(lsm0Var.a(R.string.statistic_horses_race_jockey_and_trainer, Arrays.copyOf(new Object[0], 0)), epwVar.f), new dpw(lsm0Var.a(R.string.statistic_horses_race_gender, Arrays.copyOf(new Object[0], 0)), strA), new dpw(lsm0Var.a(R.string.statistic_horses_race_year_and_age, Arrays.copyOf(new Object[0], 0)), epwVar.j), new dpw(lsm0Var.a(R.string.statistic_horses_race_jockey_weight, Arrays.copyOf(new Object[0], 0)), epwVar.i), new dpw(lsm0Var.a(R.string.statistic_horses_race_dam_and_sire, Arrays.copyOf(new Object[0], 0)), epwVar.d), new dpw(lsm0Var.a(R.string.statistic_horses_race_distance, Arrays.copyOf(new Object[0], 0)), epwVar.e), new dpw(lsm0Var.a(R.string.statistic_horses_race_place, Arrays.copyOf(new Object[0], 0)), epwVar.g))), str, str2, z3));
            it = it;
            ctf0Var = ctf0Var;
        }
        return new drw(dbdVar, dyb.o0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0300  */
    /* JADX WARN: Code duplicated, block: B:103:0x0303  */
    /* JADX WARN: Code duplicated, block: B:104:0x0308  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f9  */
    private final Object o(Object obj) {
        boolean z;
        String strA;
        tl tlVar;
        String str;
        String strValueOf;
        uwz uwzVar;
        String str2;
        String strA2;
        String str3;
        String strA3;
        ny nyVar;
        wui0 wui0Var;
        uwz uwzVar2 = (uwz) obj;
        uwzVar2.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list = uwzVar2.f36415a;
        boolean zIsEmpty = list.isEmpty();
        List list2 = uwzVar2.b;
        boolean zIsEmpty2 = list2.isEmpty();
        int i = 0;
        lsm0 lsm0Var = ctf0Var.b;
        ewz ewzVar = new ewz(lsm0Var.a(R.string.set_your_limits_description, Arrays.copyOf(new Object[0], 0)));
        lc00 lc00VarB = kotlin.collections.a.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            bnz bnzVar = ((qcq) obj2).f28495a;
            Object arrayList = linkedHashMap.get(bnzVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bnzVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Iterator it = wp20.c(linkedHashMap, new wpv((byte) 14)).entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            Map.Entry entry = (Map.Entry) next;
            bnz bnzVar2 = (bnz) entry.getKey();
            List list3 = (List) entry.getValue();
            bnzVar2.getClass();
            ctf0 ctf0Var2 = ctf0Var;
            String strA4 = lsm0Var.a(n2x.A(bnzVar2), Arrays.copyOf(new Object[i], i));
            int iOrdinal = bnzVar2.ordinal();
            Iterator it2 = it;
            lc00VarB.add(new jwz(i2, strA4, lsm0Var.a((iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) ? R.string.deposit_limits_requirements_new : R.string.empty_str, Arrays.copyOf(new Object[0], 0))));
            list3.getClass();
            Iterator it3 = list3.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                qcq qcqVar = (qcq) next2;
                lrz lrzVar = qcqVar.h;
                boolean z2 = zIsEmpty;
                List list4 = list2;
                long j = qcqVar.k;
                List list5 = list3;
                double d = qcqVar.o;
                Iterator it4 = it3;
                lrz lrzVar2 = lrz.b;
                boolean z3 = lrzVar == lrzVar2 && d != 0.0d;
                wui0 wui0VarK = m7x.K(i4, list5.size() - 1, z3);
                xrz xrzVar = qcqVar.b;
                boolean z4 = z3;
                int i6 = i3;
                String strA5 = lsm0Var.a(d7x.I(xrzVar), Arrays.copyOf(new Object[0], 0));
                if (lrzVar == lrzVar2 && d == 0.0d) {
                    tl tlVar2 = qcqVar.r;
                    strA2 = tlVar2 != null ? tlVar2.c : null;
                    uwzVar = uwzVar2;
                    str2 = "";
                    if (strA2 == null) {
                        str3 = str2;
                    }
                    if (qcqVar.f28495a == bnz.c || lrzVar != lrzVar2 || j == 0) {
                        strA3 = str2;
                    } else {
                        rdj rdjVar = rdj.f30294a;
                        strA3 = lsm0Var.a(R.string.limits_expiration_time_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)}, 1));
                    }
                    if (z4) {
                        rdj rdjVar2 = rdj.f30294a;
                        String strA6 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(qcqVar.p), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)}, 1));
                        if (i4 == list5.size() - 1) {
                            wui0Var = wui0.d;
                        } else {
                            wui0Var = wui0.c;
                        }
                        nyVar = new ny(strA6, wui0Var);
                    } else {
                        nyVar = null;
                    }
                    lc00VarB.add(new dwz(xrzVar, strA5, str3, strA3, wui0VarK, qcqVar.f, nyVar));
                    list2 = list4;
                    list3 = list5;
                    i4 = i5;
                    it3 = it4;
                    uwzVar2 = uwzVar;
                    zIsEmpty2 = zIsEmpty2;
                    zIsEmpty = z2;
                    i3 = i6;
                } else if (z4) {
                    double d2 = qcqVar.m;
                    str2 = "";
                    String str4 = qcqVar.c;
                    uwzVar = uwzVar2;
                    StringBuilder sbS = vqd.s("\u202d", d2, Separators.SP, str4);
                    ohs0.A(sbS, d, " > ", Separators.SP);
                    strA2 = axq.n(sbS, str4, "\u202d");
                } else {
                    uwzVar = uwzVar2;
                    str2 = "";
                    strA2 = lsm0Var.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0));
                }
                str3 = strA2;
                if (qcqVar.f28495a == bnz.c) {
                    strA3 = str2;
                } else {
                    strA3 = str2;
                }
                if (z4) {
                    rdj rdjVar3 = rdj.f30294a;
                    String strA7 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(qcqVar.p), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)}, 1));
                    if (i4 == list5.size() - 1) {
                        wui0Var = wui0.d;
                    } else {
                        wui0Var = wui0.c;
                    }
                    nyVar = new ny(strA7, wui0Var);
                } else {
                    nyVar = null;
                }
                lc00VarB.add(new dwz(xrzVar, strA5, str3, strA3, wui0VarK, qcqVar.f, nyVar));
                list2 = list4;
                list3 = list5;
                i4 = i5;
                it3 = it4;
                uwzVar2 = uwzVar;
                zIsEmpty2 = zIsEmpty2;
                zIsEmpty = z2;
                i3 = i6;
            }
            ctf0Var = ctf0Var2;
            it = it2;
            i2 = i3;
            i = 0;
        }
        uwz uwzVar3 = uwzVar2;
        boolean z5 = zIsEmpty;
        boolean z6 = zIsEmpty2;
        lc00VarB.add(ewzVar);
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        lc00 lc00VarB2 = kotlin.collections.a.b();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list2) {
            bnz bnzVar3 = ((siq0) obj3).f32275a;
            Object arrayList2 = linkedHashMap2.get(bnzVar3);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(bnzVar3, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        Iterator it5 = wp20.c(linkedHashMap2, new wpv((byte) 15)).entrySet().iterator();
        while (it5.hasNext()) {
            List list6 = (List) ((Map.Entry) it5.next()).getValue();
            list6.getClass();
            int i7 = 0;
            for (Object obj4 : list6) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    q3d.p();
                    throw null;
                }
                siq0 siq0Var = (siq0) obj4;
                xrz xrzVar2 = siq0Var.b;
                String strA8 = lsm0Var.a(d7x.I(xrzVar2), Arrays.copyOf(new Object[0], 0));
                int i9 = ywz.f43396a[siq0Var.j.ordinal()];
                int i10 = 1;
                if (i9 != 1) {
                    if (i9 == i10) {
                        if (siq0Var.b instanceof tbe0) {
                            tlVar = siq0Var.l;
                            if (tlVar != null) {
                                str = tlVar.c;
                            } else {
                                str = null;
                            }
                            strValueOf = String.valueOf(str);
                            strA = strValueOf;
                            i10 = 1;
                            z = false;
                        } else {
                            i10 = 1;
                        }
                    }
                    if (i9 == i10) {
                        strA = siq0Var.d;
                        z = false;
                    } else {
                        z = false;
                        strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[0], 0));
                    }
                } else {
                    if (siq0Var.c == -1) {
                        strValueOf = lsm0Var.a(R.string.limits_self_exclusion_permanent, Arrays.copyOf(new Object[0], 0));
                    } else {
                        i10 = 1;
                        if (i9 == i10) {
                            if (siq0Var.b instanceof tbe0) {
                                tlVar = siq0Var.l;
                                if (tlVar != null) {
                                    str = tlVar.c;
                                } else {
                                    str = null;
                                }
                                strValueOf = String.valueOf(str);
                            } else {
                                i10 = 1;
                            }
                        }
                        if (i9 == i10) {
                            strA = siq0Var.d;
                            z = false;
                        } else {
                            z = false;
                            strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[0], 0));
                        }
                    }
                    strA = strValueOf;
                    i10 = 1;
                    z = false;
                }
                lc00VarB2.add(new vwz(xrzVar2, strA8, strA, m7x.K(i7, list6.size() - i10, z), siq0Var.h));
                i7 = i8;
            }
        }
        lc00VarB2.add(ewzVar);
        i4 i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
        lc00 lc00VarB3 = kotlin.collections.a.b();
        if (!z5) {
            lc00VarB3.add(knz.b);
        }
        if (!z6) {
            lc00VarB3.add(qnz.b);
        }
        i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
        int i11 = uwzVar3.c;
        boolean z7 = uwzVar3.d;
        boolean z8 = (z5 || z6) ? false : true;
        ArrayList arrayList3 = new ArrayList(r3d.q(i4VarR2, 10));
        int i12 = 0;
        ListIterator listIterator = i4VarR2.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList3.add(lsm0Var.a(((wnz) listIterator.next()).f39468a, Arrays.copyOf(new Object[i12], i12)));
            i12 = 0;
        }
        i4 i4VarR3 = dyb.r0(arrayList3);
        boolean z9 = uwzVar3.e;
        mdm mdmVarB = ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        pz40 pz40Var = s6t0.f31722a;
        return new xwz(i4VarR0, i4VarR1, i11, z7, z8, i4VarR2, i4VarR3, z9, mdmVarB, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(lsm0Var.a(R.string.limits, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x0172  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(Object obj) {
        boolean z;
        boolean z2;
        sy syVar;
        Object h000Var;
        String strA;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        StringBuilder sbS;
        sy syVar2;
        int i;
        wui0 wui0Var;
        e100 e100Var = (e100) obj;
        e100Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        Map map = e100Var.f7016a;
        boolean zIsEmpty = map.isEmpty();
        Map map2 = e100Var.b;
        boolean zIsEmpty2 = map2.isEmpty();
        lsm0 lsm0Var = ctf0Var.b;
        a000 a000Var = new a000(lsm0Var.a(R.string.set_your_limits_description, Arrays.copyOf(new Object[0], 0)));
        Map map3 = e100Var.k;
        TreeMap treeMapC = wp20.c(map, new wpv((byte) 17));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeMapC.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = Separators.POUND;
            if (!zHasNext) {
                e100 e100Var2 = e100Var;
                boolean z6 = zIsEmpty;
                boolean z7 = zIsEmpty2;
                i4 i4VarR0 = dyb.r0(CollectionsKt.r0(arrayList2, a000Var));
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    LimitNeGroupEnum limitNeGroupEnum = (LimitNeGroupEnum) entry.getKey();
                    List list = (List) entry.getValue();
                    i000 i000Var = new i000(lsm0Var.a(g8x.F(limitNeGroupEnum), Arrays.copyOf(new Object[0], 0)), lsm0Var.a(g8x.E(limitNeGroupEnum), Arrays.copyOf(new Object[0], 0)));
                    ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                    int i2 = 0;
                    for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it3) {
                        Object next = it3.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        riq0 riq0Var = (riq0) next;
                        wrz wrzVar = riq0Var.b;
                        Iterator it4 = it2;
                        orz orzVar = riq0Var.d;
                        List list2 = list;
                        if (wrzVar == g8i0.f10866a) {
                            int i4 = 0;
                            String strA2 = lsm0Var.a(g8x.L(wrzVar), Arrays.copyOf(new Object[0], 0));
                            orz orzVar2 = orz.b;
                            if (orzVar != orzVar2) {
                                if (orzVar == orzVar2) {
                                    strA = riq0Var.f;
                                    z3 = i4;
                                } else {
                                    strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[i4], i4));
                                    z3 = i4;
                                }
                            } else if (riq0Var.e == -1) {
                                z3 = 0;
                                strA = lsm0Var.a(R.string.limits_self_exclusion_permanent, Arrays.copyOf(new Object[0], 0));
                            } else {
                                i4 = 0;
                                if (orzVar == orzVar2) {
                                    strA = riq0Var.f;
                                    z3 = i4;
                                } else {
                                    strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[i4], i4));
                                    z3 = i4;
                                }
                            }
                            h000Var = new f100(g8x.I(i2, list2.size() - 1, z3), strA2, strA, orzVar == orzVar2);
                            limitNeGroupEnum = limitNeGroupEnum;
                        } else {
                            Long l = riq0Var.i;
                            if (orzVar != orz.b) {
                                z2 = false;
                            } else if ((l != null ? l.longValue() : 0L) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Double d = (Double) map3.get(wrzVar);
                            wui0 wui0VarI = g8x.I(i2, list2.size() - 1, z2);
                            boolean z8 = z2;
                            String strA3 = lsm0Var.a(g8x.L(wrzVar), Arrays.copyOf(new Object[0], 0));
                            DecimalFormat decimalFormat = new DecimalFormat(Separators.POUND);
                            double d2 = riq0Var.g;
                            oki0 oki0Var = oki0.SESSION_TIME_LIMIT_7_DAY;
                            long jLongValue = (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) ? (l != null ? l.longValue() : 0L) / 24 : l != null ? l.longValue() : 0L;
                            double d3 = (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) ? d2 / 24.0d : d2;
                            String strA4 = d3 == 0.0d ? lsm0Var.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0)) : String.valueOf(decimalFormat.format(Math.floor(d3)));
                            if (d != null) {
                                strA4 = b1j.k("\u202d", strA4, " > ", decimalFormat.format(Math.floor(d.doubleValue())), "\u202d");
                            } else if (z8) {
                                StringBuilder sbO = f140.o(jLongValue, "\u202d", strA4, " > ");
                                sbO.append("\u202d");
                                strA4 = sbO.toString();
                            }
                            String str2 = strA4;
                            d4d d4dVar = d != null ? d4d.STATIC_YELLOW : null;
                            if (z8) {
                                rdj rdjVar = rdj.f30294a;
                                String strA5 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(riq0Var.j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56)}, 1));
                                wui0 wui0Var2 = i2 == list2.size() - 1 ? wui0.d : wui0.c;
                                d4d d4dVar2 = d4d.PRIMARY;
                                d4d d4dVar3 = d4d.PRIMARY;
                                syVar = new sy(strA5, wui0Var2);
                            } else {
                                syVar = null;
                            }
                            h000Var = new h000(riq0Var.b, strA3, d4dVar, str2, wui0VarI, syVar);
                        }
                        ArrayList arrayList5 = arrayList4;
                        arrayList5.add(h000Var);
                        arrayList4 = arrayList5;
                        i2 = i3;
                        limitNeGroupEnum = limitNeGroupEnum;
                        it2 = it4;
                        list = list2;
                        i000Var = i000Var;
                    }
                    Iterator it5 = it2;
                    List list3 = list;
                    LimitNeGroupEnum limitNeGroupEnum2 = limitNeGroupEnum;
                    i000 i000Var2 = i000Var;
                    ArrayList arrayList6 = arrayList4;
                    if (list3.isEmpty()) {
                        z = false;
                        break;
                    }
                    Iterator it6 = list3.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z = false;
                            break;
                        }
                        if (map3.get(((riq0) it6.next()).b) != null) {
                            z = true;
                            break;
                        }
                    }
                    w3d.u(arrayList3, CollectionsKt.q0(CollectionsKt.q0(kotlin.collections.a.c(i000Var2), arrayList6), limitNeGroupEnum2 != LimitNeGroupEnum.SELF_EXCLUSION_LIMITS ? g8x.G(z, ctf0Var, limitNeGroupEnum2) : iun.f15405a));
                    it2 = it5;
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                if (!z6) {
                    lc00VarB.add(jnz.b);
                }
                if (!z7) {
                    lc00VarB.add(pnz.b);
                }
                i4 i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                i4 i4VarR2 = dyb.r0(arrayList3);
                int i5 = e100Var2.c;
                boolean z9 = (z6 || z7) ? false : true;
                ArrayList arrayList7 = new ArrayList(r3d.q(i4VarR1, 10));
                ListIterator listIterator = i4VarR1.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList7.add(lsm0Var.a(((vnz) listIterator.next()).f37740a, Arrays.copyOf(new Object[0], 0)));
                }
                return new h100(i4VarR0, i4VarR2, e100Var2.d, i5, z9, i4VarR1, dyb.r0(arrayList7), e100Var2.e, ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990));
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            int i6 = 1;
            LimitNeGroupEnum limitNeGroupEnum3 = (LimitNeGroupEnum) entry2.getKey();
            List list4 = (List) entry2.getValue();
            Iterator it7 = it;
            limitNeGroupEnum3.getClass();
            boolean z10 = zIsEmpty;
            Map map4 = map2;
            boolean z11 = zIsEmpty2;
            i000 i000Var3 = new i000(lsm0Var.a(g8x.F(limitNeGroupEnum3), Arrays.copyOf(new Object[0], 0)), lsm0Var.a(g8x.E(limitNeGroupEnum3), Arrays.copyOf(new Object[0], 0)));
            list4.getClass();
            ArrayList arrayList8 = new ArrayList(r3d.q(list4, 10));
            Iterator it8 = list4.iterator();
            int i7 = 0;
            while (it8.hasNext()) {
                Object next2 = it8.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    q3d.p();
                    throw null;
                }
                sn40 sn40Var = (sn40) next2;
                i000 i000Var4 = i000Var3;
                orz orzVar3 = sn40Var.e;
                Iterator it9 = it8;
                wrz wrzVar2 = sn40Var.b;
                List list5 = list4;
                Long l2 = sn40Var.i;
                e100 e100Var3 = e100Var;
                if (orzVar3 != orz.b) {
                    z5 = 0;
                } else if ((l2 != null ? l2.longValue() : 0L) != 0) {
                    z5 = i6;
                } else {
                    z5 = 0;
                }
                wui0 wui0VarI2 = g8x.I(i7, list5.size() - 1, z5);
                Double d4 = (Double) map3.get(wrzVar2);
                boolean z12 = z5;
                String strA6 = lsm0Var.a(g8x.L(wrzVar2), Arrays.copyOf(new Object[0], 0));
                d4d d4dVar4 = d4 != null ? d4d.STATIC_YELLOW : null;
                DecimalFormat decimalFormat2 = new DecimalFormat(str);
                ctf0 ctf0Var2 = ctf0Var;
                double d5 = sn40Var.g;
                String str3 = sn40Var.c;
                String strA7 = d5 == 0.0d ? lsm0Var.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0)) : w6x.q(decimalFormat2.format(Math.floor(d5)), Separators.SP, str3);
                if (d4 != null) {
                    arrayList = arrayList2;
                    sbS = b1j.n("\u202d", strA7, " > ", decimalFormat2.format(Math.floor(d4.doubleValue())), Separators.SP);
                } else {
                    arrayList = arrayList2;
                    if (z12) {
                        sbS = kng0.s(l2, "\u202d", strA7, " > ", Separators.SP);
                    }
                    if (z12) {
                        rdj rdjVar2 = rdj.f30294a;
                        i = i6;
                        String strA8 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(sn40Var.j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)}, i));
                        if (i7 == list5.size() - i) {
                            wui0Var = wui0.d;
                        } else {
                            wui0Var = wui0.c;
                        }
                        d4d d4dVar5 = d4d.PRIMARY;
                        d4d d4dVar6 = d4d.PRIMARY;
                        syVar2 = new sy(strA8, wui0Var);
                    } else {
                        syVar2 = null;
                    }
                    arrayList8.add(new h000(wrzVar2, strA6, d4dVar4, strA7, wui0VarI2, syVar2));
                    a000Var = a000Var;
                    arrayList2 = arrayList;
                    limitNeGroupEnum3 = limitNeGroupEnum3;
                    i7 = i8;
                    i000Var3 = i000Var4;
                    it8 = it9;
                    list4 = list5;
                    e100Var = e100Var3;
                    ctf0Var = ctf0Var2;
                    str = str;
                    i6 = 1;
                }
                strA7 = axq.n(sbS, str3, "\u202d");
                if (z12) {
                    rdj rdjVar3 = rdj.f30294a;
                    i = i6;
                    String strA9 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(sn40Var.j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)}, i));
                    if (i7 == list5.size() - i) {
                        wui0Var = wui0.d;
                    } else {
                        wui0Var = wui0.c;
                    }
                    d4d d4dVar7 = d4d.PRIMARY;
                    d4d d4dVar8 = d4d.PRIMARY;
                    syVar2 = new sy(strA9, wui0Var);
                } else {
                    syVar2 = null;
                }
                arrayList8.add(new h000(wrzVar2, strA6, d4dVar4, strA7, wui0VarI2, syVar2));
                a000Var = a000Var;
                arrayList2 = arrayList;
                limitNeGroupEnum3 = limitNeGroupEnum3;
                i7 = i8;
                i000Var3 = i000Var4;
                it8 = it9;
                list4 = list5;
                e100Var = e100Var3;
                ctf0Var = ctf0Var2;
                str = str;
                i6 = 1;
            }
            e100 e100Var4 = e100Var;
            ctf0Var = ctf0Var;
            i000 i000Var5 = i000Var3;
            a000 a000Var2 = a000Var;
            LimitNeGroupEnum limitNeGroupEnum4 = limitNeGroupEnum3;
            ArrayList arrayList9 = arrayList2;
            List list6 = list4;
            if (list6.isEmpty()) {
                z4 = false;
                break;
            }
            Iterator it10 = list6.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    z4 = false;
                    break;
                    break;
                }
                if (map3.get(((sn40) it10.next()).b) != null) {
                    z4 = true;
                    break;
                }
            }
            w3d.u(arrayList9, CollectionsKt.q0(CollectionsKt.q0(kotlin.collections.a.c(i000Var5), arrayList8), g8x.G(z4, ctf0Var, limitNeGroupEnum4)));
            a000Var = a000Var2;
            arrayList2 = arrayList9;
            it = it7;
            zIsEmpty = z10;
            map2 = map4;
            zIsEmpty2 = z11;
            e100Var = e100Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x030a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0321  */
    private final Object r(Object obj) {
        boolean z;
        String strA;
        String str;
        String strA2;
        String strA3;
        String str2;
        oy oyVar;
        l400 l400Var = (l400) obj;
        l400Var.getClass();
        List list = t400.f33295a;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list2 = l400Var.f19381a;
        boolean zIsEmpty = list2.isEmpty();
        List list3 = l400Var.b;
        boolean zIsEmpty2 = list3.isEmpty();
        boolean zH = ctf0Var.h();
        int i = 0;
        lsm0 lsm0Var = ctf0Var.b;
        n400 n400Var = new n400(lsm0Var.a(R.string.set_your_limits_description, Arrays.copyOf(new Object[0], 0)));
        lc00 lc00VarB = kotlin.collections.a.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list2) {
            bnz bnzVar = ((pcq) obj2).f26772a;
            Object arrayList = linkedHashMap.get(bnzVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bnzVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        List<bnz> list4 = t400.f33295a;
        ArrayList arrayList2 = new ArrayList();
        for (bnz bnzVar2 : list4) {
            List list5 = (List) linkedHashMap.get(bnzVar2);
            Pair pair = list5 != null ? new Pair(bnzVar2, list5) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            Pair pair2 = (Pair) next;
            bnz bnzVar3 = (bnz) pair2.f46059a;
            List list6 = (List) pair2.b;
            Iterator it2 = it;
            boolean z2 = zIsEmpty;
            String strA4 = lsm0Var.a(n2x.A(bnzVar3), Arrays.copyOf(new Object[i], i));
            int iOrdinal = bnzVar3.ordinal();
            lc00VarB.add(new o400(i2, strA4, lsm0Var.a((iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) ? R.string.deposit_limits_requirements_new : R.string.empty_str, Arrays.copyOf(new Object[i], i))));
            Iterator it3 = list6.iterator();
            int i4 = i;
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                pcq pcqVar = (pcq) next2;
                krz krzVar = pcqVar.h;
                sl slVar = pcqVar.r;
                List list7 = list3;
                boolean z3 = zIsEmpty2;
                long j = pcqVar.o;
                Iterator it4 = it3;
                krz krzVar2 = krz.b;
                boolean z4 = krzVar == krzVar2 && j != 0;
                wui0 wui0VarA = t400.a(i4, list6.size() - 1, z4);
                xrz xrzVar = pcqVar.b;
                boolean z5 = zH;
                String strA5 = lsm0Var.a(d7x.I(xrzVar), Arrays.copyOf(new Object[0], 0));
                if (pcqVar.h == krzVar2 && j == 0) {
                    String str3 = slVar != null ? slVar.c : null;
                    if (str3 == null) {
                        list6 = list6;
                        str2 = "";
                    } else {
                        str2 = str3;
                        list6 = list6;
                    }
                } else {
                    if (z4) {
                        String str4 = slVar != null ? slVar.c : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        strA3 = axq.n(b1j.n("\u202d", str4, " > ", String.valueOf(j), Separators.SP), pcqVar.c, "\u202d");
                    } else {
                        strA3 = lsm0Var.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0));
                    }
                    str2 = strA3;
                }
                if (z4) {
                    long j2 = pcqVar.p;
                    rdj rdjVar = rdj.f30294a;
                    oyVar = new oy(lsm0Var.a(R.string.limits_changes_apply_description, Arrays.copyOf(new Object[]{rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(z5), false, 56)}, 1)), i4 == list6.size() - 1 ? wui0.d : wui0.c);
                } else {
                    oyVar = null;
                }
                lc00VarB.add(new m400(xrzVar, strA5, str2, wui0VarA, pcqVar.f, oyVar));
                i4 = i5;
                list3 = list7;
                zIsEmpty2 = z3;
                it3 = it4;
                list6 = list6;
                zH = z5;
                i = 0;
            }
            i2 = i3;
            it = it2;
            zIsEmpty = z2;
        }
        boolean z6 = zIsEmpty;
        boolean z7 = zIsEmpty2;
        boolean z8 = zH;
        lc00VarB.add(n400Var);
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        lc00 lc00VarB2 = kotlin.collections.a.b();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list3) {
            bnz bnzVar4 = ((niq0) obj3).f23602a;
            Object arrayList3 = linkedHashMap2.get(bnzVar4);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap2.put(bnzVar4, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        List<bnz> list8 = t400.b;
        ArrayList arrayList4 = new ArrayList();
        for (bnz bnzVar5 : list8) {
            List list9 = (List) linkedHashMap2.get(bnzVar5);
            Pair pair3 = list9 != null ? new Pair(bnzVar5, list9) : null;
            if (pair3 != null) {
                arrayList4.add(pair3);
            }
        }
        Iterator it5 = arrayList4.iterator();
        int i6 = 0;
        while (it5.hasNext()) {
            Object next3 = it5.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                q3d.p();
                throw null;
            }
            Pair pair4 = (Pair) next3;
            bnz bnzVar6 = (bnz) pair4.f46059a;
            List list10 = (List) pair4.b;
            lc00VarB2.add(new o400(i6, lsm0Var.a(n2x.A(bnzVar6), Arrays.copyOf(new Object[0], 0)), ""));
            Iterator it6 = list10.iterator();
            int i8 = 0;
            while (it6.hasNext()) {
                Object next4 = it6.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    q3d.p();
                    throw null;
                }
                niq0 niq0Var = (niq0) next4;
                xrz xrzVar2 = niq0Var.b;
                long j3 = niq0Var.c;
                Iterator it7 = it5;
                Iterator it8 = it6;
                List list11 = list10;
                String strA6 = lsm0Var.a(d7x.I(xrzVar2), Arrays.copyOf(new Object[0], 0));
                int i10 = s400.f31581a[niq0Var.h.ordinal()];
                int i11 = 1;
                if (i10 == 1) {
                    if (niq0Var.b instanceof pki0) {
                        sl slVar2 = niq0Var.j;
                        strA2 = slVar2 != null ? slVar2.c : null;
                        str = strA2 == null ? "" : strA2;
                    } else {
                        i11 = 1;
                        if (i10 == i11) {
                        }
                        if (i10 == i11) {
                            rdj rdjVar2 = rdj.f30294a;
                            z = false;
                            strA = rdj.g(new znq0(j3), efj.UNIVERSAL, Boolean.valueOf(z8), false, 56);
                        } else {
                            z = false;
                            strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[0], 0));
                        }
                        str = strA;
                    }
                    z = false;
                } else if (i10 == i11 || j3 != -1) {
                    if (i10 == i11) {
                        rdj rdjVar3 = rdj.f30294a;
                        z = false;
                        strA = rdj.g(new znq0(j3), efj.UNIVERSAL, Boolean.valueOf(z8), false, 56);
                    } else {
                        z = false;
                        strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[0], 0));
                    }
                    str = strA;
                } else {
                    strA2 = lsm0Var.a(R.string.limits_self_exclusion_permanent, Arrays.copyOf(new Object[0], 0));
                    z = false;
                }
                lc00VarB2.add(new p400(xrzVar2, strA6, str, t400.a(i8, list11.size() - 1, z), niq0Var.f));
                i8 = i9;
                it5 = it7;
                it6 = it8;
                list10 = list11;
            }
            i6 = i7;
        }
        lc00VarB2.add(n400Var);
        i4 i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
        lc00 lc00VarB3 = kotlin.collections.a.b();
        if (!z6) {
            lc00VarB3.add(fnz.b);
        }
        if (!z7) {
            lc00VarB3.add(lnz.b);
        }
        i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
        int i12 = l400Var.c;
        boolean z9 = l400Var.d;
        boolean z10 = (z6 || z7) ? false : true;
        ArrayList arrayList5 = new ArrayList(r3d.q(i4VarR2, 10));
        int i13 = 0;
        ListIterator listIterator = i4VarR2.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList5.add(lsm0Var.a(((rnz) listIterator.next()).f30811a, Arrays.copyOf(new Object[i13], i13)));
            i13 = 0;
        }
        i4 i4VarR3 = dyb.r0(arrayList5);
        boolean z11 = l400Var.e;
        mdm mdmVarB = ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        pz40 pz40Var = s6t0.f31722a;
        return new r400(i4VarR0, i4VarR1, i12, z9, z10, i4VarR2, i4VarR3, z11, mdmVarB, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(lsm0Var.a(R.string.limits, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }

    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v5, types: [a.oie, a.vuu0] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [a.x6q0] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [a.hjm] */
    /* JADX WARN: Type inference failed for: r22v2 */
    private final Object s(Object obj) {
        Object obj2;
        List list;
        ?? x6q0Var;
        ?? r15;
        boolean z;
        boolean z2;
        List list2;
        wui0 wui0Var;
        gp40 gp40Var = (gp40) obj;
        gp40Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pcq pcqVar = gp40Var.b;
        long j = gp40Var.h;
        String str = gp40Var.d;
        int i = gp40Var.g;
        int i2 = 1;
        if (pcqVar == null || (list2 = pcqVar.q) == null) {
            obj2 = null;
            list = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            int i3 = 0;
            for (Object obj3 : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                v85 v85Var = (v85) obj3;
                int size = list2.size();
                if (size == i2) {
                    wui0Var = wui0.f39793a;
                } else if (i3 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i3 == size + (-1) ? wui0.d : wui0.c;
                }
                arrayList.add(new mp40(v85Var.c, i >= 0 && i3 == i, wui0Var));
                i3 = i4;
                i2 = 1;
            }
            obj2 = null;
            list = arrayList;
        }
        List list3 = list;
        boolean zIsEmpty = list3.isEmpty();
        boolean z3 = gp40Var.c;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.limit_not_saved_error, Arrays.copyOf(new Object[0], 0));
        if (pcqVar == null || !pcqVar.e) {
            Object obj4 = obj2;
            x6q0Var = obj4;
            r15 = obj4;
        } else {
            ?? r16 = obj2;
            x6q0Var = new x6q0(j != 0 ? String.valueOf(j) : "", o6q0.f24750a, new s7q0(str), true, str.length() > 0, new y5q0(9, r16, r16, 6), lsm0Var.a(R.string.limits_enter_sum_with_currency_v2, Arrays.copyOf(new Object[]{pcqVar.c}, 1)), null, 0, 32000);
            r15 = r16;
        }
        ?? hjmVar = !zIsEmpty ? new hjm(lsm0Var.a(R.string.fixed_sum, Arrays.copyOf(new Object[0], 0)), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188) : r15;
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        ue9 ue9Var = new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0)));
        if (pcqVar == null) {
            z2 = false;
            z = z3;
        } else {
            long j2 = pcqVar.o;
            z = z3;
            long j3 = pcqVar.m;
            if (gp40Var.c || str.length() != 0) {
                z2 = false;
            } else if (i >= 0) {
                v85 v85Var2 = (v85) CollectionsKt.W(i, pcqVar.q);
                Long lValueOf = v85Var2 != null ? Long.valueOf(v85Var2.f36965a) : null;
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    if (jLongValue != j3 && (j2 <= 0 || jLongValue != j2)) {
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (!pcqVar.e || j <= r11 || j == j3 || (j2 > r11 && j == j2)) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        mtl mtlVar = new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, ue9Var, z2, false, true), vo40.f37747a)));
        boolean z4 = gp40Var.e;
        mdm mdmVarB = ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990);
        pz40 pz40Var = s6t0.f31722a;
        return new hp40(z, strA, x6q0Var, hjmVar, list3, mtlVar, z4, mdmVarB, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(lsm0Var.a(R.string.limits_choice_title, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }

    private final Object t(Object obj) {
        zmm xmmVar;
        y780 y780Var = (y780) obj;
        y780Var.getClass();
        String str = y780Var.f42141a;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = y780Var.m;
        List list = y780Var.c;
        String str2 = y780Var.e;
        int i = y780Var.b;
        String str3 = y780Var.h;
        String str4 = y780Var.j;
        if (z) {
            return b880.f2145a;
        }
        if (y780Var.p) {
            return new a880(ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 9000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        boolean z2 = y780Var.n;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.support_hint, Arrays.copyOf(new Object[0], 0));
        if (str3 == null || str3.length() == 0) {
            xmmVar = new xmm(lsm0Var.a(R.string.callback_code_hint, Arrays.copyOf(new Object[0], 0)));
        } else {
            String strConcat = "+".concat(str3);
            n0x n0xVar = new n0x(y780Var.g);
            pz40 pz40Var = s6t0.f31722a;
            xmmVar = new ymm(strConcat, n0xVar, lsm0Var.a(R.string.callback_code_hint, Arrays.copyOf(new Object[0], 0)), Integer.valueOf(R.drawable.ic_glyph_language), new y3d(s6t0.b().f33626a.getSecondary60()));
        }
        String strA2 = lsm0Var.a(R.string.callback_phone_hint, Arrays.copyOf(new Object[0], 0));
        if (str4.length() == 0 && i == 0) {
            i = 25;
        }
        hnm hnmVar = new hnm(xmmVar, new knm(str, strA2, new bm90(str4), Integer.valueOf(i), new yu90(str4)), str2.length() > 0 ? new anm(str2) : null);
        boolean z3 = !list.isEmpty();
        bt9 bt9Var = y780Var.d;
        String str5 = bt9Var != null ? bt9Var.b : null;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        boolean z4 = list.size() > 1;
        String strA3 = lsm0Var.a(R.string.operator_language, Arrays.copyOf(new Object[0], 0));
        e6q0 e6q0Var = e6q0.f7299a;
        k6q0 k6q0Var = k6q0.f17783a;
        r7q0 r7q0Var = r7q0.f29989a;
        return new z780(z2, strA, hnmVar, z3, new s6q0(str6, e6q0Var, k6q0Var, r7q0Var, z4, false, null, strA3, null, 32128), new x6q0(y780Var.l, o6q0.f24750a, r7q0Var, true, false, null, lsm0Var.a(R.string.callback_message_field_hint, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.callback_message_field_hint, Arrays.copyOf(new Object[0], 0)), 0, 31104), new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.support_get_call, Arrays.copyOf(new Object[0], 0))), str.length() > 2, false, true), sh00.s))));
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01f4  */
    private final Object u(Object obj) {
        int i;
        List list;
        u2u0 u2u0Var;
        String str;
        List list2;
        String str2;
        List list3;
        List list4;
        List<u2u0> listO;
        int i2;
        Iterator it;
        List list5;
        Object dvaVar;
        Object next;
        String str3;
        String str4;
        Object next2;
        k0a0 k0a0Var = (k0a0) obj;
        k0a0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.career, Arrays.copyOf(new Object[0], 0));
        if (k0a0Var.f17456a) {
            return new n0a0(strA);
        }
        boolean z = k0a0Var.b;
        ocl oclVar = this.c;
        if (z) {
            return new m0a0(strA, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (k0a0Var.c) {
            return new l0a0(strA, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990));
        }
        List list6 = k0a0Var.e;
        int i3 = 10;
        ArrayList<wua> arrayList = new ArrayList(r3d.q(list6, 10));
        Iterator it2 = list6.iterator();
        while (true) {
            i = 1;
            boolean z2 = true;
            if (!it2.hasNext()) {
                break;
            }
            hva hvaVar = (hva) it2.next();
            int i4 = k0a0Var.d;
            hvaVar.getClass();
            int i5 = hvaVar.f13717a;
            String str5 = hvaVar.b;
            if (i5 != i4) {
                z2 = false;
            }
            arrayList.add(new wua(str5, i5, z2));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (wua wuaVar : arrayList) {
            arrayList2.add(new lxl(wuaVar.f39781a, (dyl) new xxl(wuaVar.b), false, wuaVar.c ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
        fyl fylVar = new fyl(dyb.o0(arrayList2), null, null, null, null, 30);
        hva hvaVar2 = k0a0Var.f;
        List list7 = k0a0Var.g;
        List list8 = k0a0Var.h;
        hvaVar2.getClass();
        list7.getClass();
        list8.getClass();
        iko0 iko0Var = hvaVar2.c;
        List list9 = iko0Var.c;
        List list10 = iko0Var.b;
        List list11 = iko0Var.d;
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it3 = list9.iterator();
        while (true) {
            String str6 = "-";
            if (!it3.hasNext()) {
                if (!list11.isEmpty()) {
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    int i6 = 0;
                    for (Object obj2 : list11) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            q3d.p();
                            throw null;
                        }
                        m2u0 m2u0Var = (m2u0) obj2;
                        if (i6 == 0) {
                            lc00VarB2.add(zua.d);
                            i2 = m2u0Var.e - 1;
                        } else {
                            String str7 = (String) CollectionsKt.firstOrNull(m2u0Var.c);
                            if (str7 == null) {
                                str7 = "";
                            }
                            lc00VarB2.add(new ava(str7));
                            i2 = m2u0Var.e;
                        }
                        while (i2 > 1) {
                            lc00VarB2.add(zua.d);
                            i2--;
                        }
                        i6 = i7;
                    }
                    lc00VarB.add(kotlin.collections.a.a(lc00VarB2));
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                lc00 lc00VarB3 = kotlin.collections.a.b();
                bmo0 bmo0Var = (bmo0) CollectionsKt.firstOrNull(list10);
                if (bmo0Var != null && (list4 = bmo0Var.b) != null && (listO = CollectionsKt.O(list4, 1)) != null) {
                    for (u2u0 u2u0Var2 : listO) {
                        prq0 prq0Var = u2u0Var2.c;
                        if (prq0Var == prq0.d) {
                            lc00VarB3.add(new yua(u2u0Var2.b, ctf0Var.d(R.dimen.space_16)));
                        } else {
                            lc00VarB3.add(new xua(prq0Var.b, ctf0Var.d(R.dimen.size_24)));
                        }
                    }
                }
                lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                List list12 = iko0Var.c;
                lc00 lc00VarB4 = kotlin.collections.a.b();
                List list13 = (List) CollectionsKt.firstOrNull(list12);
                if (list13 != null) {
                    Iterator it4 = list13.iterator();
                    while (it4.hasNext()) {
                        m2u0 m2u0Var2 = (m2u0) CollectionsKt.firstOrNull(((vio0) it4.next()).b);
                        if (m2u0Var2 == null || (list3 = m2u0Var2.c) == null || (str2 = (String) CollectionsKt.firstOrNull(list3)) == null) {
                            str2 = "-";
                        }
                        lc00VarB4.add(new eva(str2));
                    }
                }
                if (!list11.isEmpty()) {
                    m2u0 m2u0Var3 = (m2u0) CollectionsKt.firstOrNull(list11);
                    if (m2u0Var3 == null || (list2 = m2u0Var3.c) == null || (str = (String) CollectionsKt.firstOrNull(list2)) == null) {
                        str = "-";
                    }
                    lc00VarB4.add(new fva(str));
                }
                lc00 lc00VarA3 = kotlin.collections.a.a(lc00VarB4);
                List list14 = !list11.isEmpty() ? lc00VarA : iun.f15405a;
                bmo0 bmo0Var2 = (bmo0) CollectionsKt.firstOrNull(list10);
                if (bmo0Var2 != null && (list = bmo0Var2.b) != null && (u2u0Var = (u2u0) CollectionsKt.firstOrNull(list)) != null) {
                    str6 = u2u0Var.b;
                }
                return new o0a0(strA, fylVar, new iva(lc00VarA2, lc00VarA3, lc00VarA, list14, new vih0(str6)));
            }
            List list15 = (List) it3.next();
            ArrayList arrayList3 = new ArrayList(r3d.q(list15, i3));
            Iterator it5 = list15.iterator();
            while (it5.hasNext()) {
                List listO2 = CollectionsKt.O(((vio0) it5.next()).b, i);
                List list16 = list8;
                ArrayList arrayList4 = new ArrayList(r3d.q(listO2, i3));
                Iterator it6 = listO2.iterator();
                while (it6.hasNext()) {
                    m2u0 m2u0Var4 = (m2u0) it6.next();
                    nie nieVar = m2u0Var4.b;
                    Iterator it7 = it6;
                    String str8 = m2u0Var4.d;
                    int iOrdinal = nieVar.ordinal();
                    if (iOrdinal != 0) {
                        it = it5;
                        list5 = list7;
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                String str9 = (String) CollectionsKt.firstOrNull(m2u0Var4.c);
                                if (str9 == null) {
                                    str9 = "-";
                                }
                                dvaVar = new dva(str9);
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                Iterator it8 = list16.iterator();
                                do {
                                    if (!it8.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it8.next();
                                } while (!((p2s0) next2).f26268a.equals(str8));
                                p2s0 p2s0Var = (p2s0) next2;
                                dvaVar = new cva(p2s0Var != null ? p2s0Var.b : "-");
                            }
                            it3 = it3;
                        } else {
                            Iterator it9 = list5.iterator();
                            do {
                                if (!it9.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it9.next();
                            } while (!Intrinsics.d(((ufp0) next).f35586a, str8));
                            ufp0 ufp0Var = (ufp0) next;
                            if (ufp0Var == null || (str3 = ufp0Var.b) == null) {
                                str3 = "-";
                            }
                            if (ufp0Var == null || (str4 = ufp0Var.d) == null) {
                                str4 = "";
                            }
                            if (!kotlin.text.c.x(str4, ujn.h, false)) {
                                if (str4.length() == 0) {
                                    str4 = "";
                                } else {
                                    List list17 = u0d.f34849a;
                                    if (u0d.c(str4)) {
                                        str4 = "";
                                    } else {
                                        str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                                    }
                                }
                            }
                            dvaVar = new bva(str3, str4);
                        }
                    } else {
                        it = it5;
                        list5 = list7;
                        it3 = it3;
                        dvaVar = new dva("-");
                    }
                    arrayList4.add(dvaVar);
                    it6 = it7;
                    it5 = it;
                    list7 = list5;
                    it3 = it3;
                }
                arrayList3.add(arrayList4);
                list8 = list16;
                i3 = 10;
                i = 1;
            }
            lc00VarB.addAll(arrayList3);
            i3 = 10;
            i = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object v(Object obj) throws Throwable {
        a4x a4xVarO0;
        Throwable th;
        a4x a4xVarO1;
        String str;
        List list;
        boolean z;
        ocl oclVar;
        long backgroundContent;
        List list2;
        hiv hivVar;
        List list3;
        hiv hivVar2;
        List list4;
        List list5;
        ahn ahnVar;
        List list6;
        n3a0 n3a0Var = (n3a0) obj;
        n3a0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        int i = n3a0Var.b;
        vgn vgnVar = n3a0Var.f22841a;
        int i2 = i == 0 ? n3a0Var.c : n3a0Var.d;
        String strA = ctf0Var.b.a(R.string.earned_points, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        r1e0 r1e0Var = (vgnVar == null || (list5 = vgnVar.f37389a) == null || (ahnVar = (ahn) CollectionsKt.W(i, list5)) == null || (list6 = ahnVar.f881a) == null) ? null : (r1e0) CollectionsKt.firstOrNull(list6);
        if (vgnVar != null) {
            List list7 = vgnVar.f37389a;
            ArrayList arrayList = new ArrayList(r3d.q(list7, 10));
            Iterator it = list7.iterator();
            while (it.hasNext()) {
                arrayList.add(new yvh0(((ahn) it.next()).b, bwh0.f3325a));
            }
            a4xVarO0 = dyb.o0(arrayList);
        } else {
            a4xVarO0 = null;
        }
        if (r1e0Var != null && (list4 = r1e0Var.f29676a) != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
            int i3 = 0;
            for (Object obj2 : list4) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList2.add(new lxl(i3, (dyl) new xxl(((hiv) obj2).b), false, i3 == i2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
                i3 = i4;
            }
            th = null;
            a4xVarO1 = dyb.o0(arrayList2);
            if (a4xVarO1 == null) {
            }
            a4x a4xVar = a4xVarO1;
            fyl fylVar = new fyl(a4xVar, tyl.b, syl.f33027a, null, null, 24);
            if (r1e0Var != null || (list3 = r1e0Var.f29676a) == null || (hivVar2 = (hiv) CollectionsKt.W(i2, list3)) == null) {
                str = "";
            } else {
                str = hivVar2.b;
            }
            String str2 = str;
            if (r1e0Var != null || (list2 = r1e0Var.f29676a) == null || (hivVar = (hiv) CollectionsKt.W(i2, list2)) == null || (list = hivVar.f13134a) == null) {
                list = iun.f15405a;
            }
            if (n3a0Var.e) {
                return new s3a0(immVar);
            }
            z = n3a0Var.f;
            oclVar = this.c;
            if (z) {
                return new r3a0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar);
            }
            if (vgnVar != null || a4xVarO0 == null || vgnVar.f37389a.isEmpty()) {
                return new r3a0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), immVar);
            }
            if (r1e0Var == null) {
                return new q3a0(immVar, a4xVarO0, n3a0Var.b, new m1e0("-", "-", "-", "-", "-"), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
            }
            if (a4xVar.isEmpty()) {
                return new q3a0(immVar, a4xVarO0, n3a0Var.b, l7x.d0(r1e0Var), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
            }
            if (list.isEmpty()) {
                return new p3a0(immVar, a4xVarO0, n3a0Var.b, fylVar, i2, l7x.d0(r1e0Var), str2, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    Throwable th2 = th;
                    q3d.p();
                    throw th2;
                }
                u29 u29Var = (u29) next;
                if (i5 % 2 != 0) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackground();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                long j = backgroundContent;
                u29Var.getClass();
                rdj rdjVar = rdj.f30294a;
                znq0 znq0Var = new znq0(u29Var.f34934a);
                sdj sdjVar = sdj.UNIVERSAL;
                arrayList3.add(new h3a0(rdj.f(znq0Var, sdjVar, th, 60), u29Var.e, u29Var.d, String.valueOf(u29Var.c), rdj.f(new znq0(u29Var.b), sdjVar, null, 60), j));
                th = null;
                i5 = i6;
                it2 = it2;
                r1e0Var = r1e0Var;
            }
            return new o3a0(immVar, a4xVarO0, n3a0Var.b, fylVar, i2, l7x.d0(r1e0Var), str2, dyb.o0(arrayList3));
        }
        th = null;
        a4xVarO1 = lak0.c;
        a4x a4xVar2 = a4xVarO1;
        fyl fylVar2 = new fyl(a4xVar2, tyl.b, syl.f33027a, null, null, 24);
        if (r1e0Var != null) {
            str = "";
        } else {
            str = "";
        }
        String str3 = str;
        if (r1e0Var != null) {
            list = iun.f15405a;
        } else {
            list = iun.f15405a;
        }
        if (n3a0Var.e) {
            return new s3a0(immVar);
        }
        z = n3a0Var.f;
        oclVar = this.c;
        if (z) {
            return new r3a0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar);
        }
        if (vgnVar != null) {
        }
        return new r3a0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), immVar);
    }

    private final Object w(Object obj) {
        bzu bzuVar;
        dfm0 dfm0Var;
        bzu bzuVar2;
        v5a0 v5a0Var = (v5a0) obj;
        v5a0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = v5a0Var.b;
        oaa0 oaa0Var = v5a0Var.f;
        nc5 nc5Var = v5a0Var.f36818a;
        h8a0 h8a0Var = v5a0Var.e;
        if (z) {
            return new y5a0(ydx.c0(nc5Var), k7x.O(oaa0Var, ctf0Var));
        }
        boolean z2 = v5a0Var.c;
        ocl oclVar = this.c;
        u5a0 t5a0Var = s5a0.f31646a;
        if (z2 || h8a0Var == null) {
            return new x5a0(t5a0Var, ydx.c0(nc5Var), k7x.O(oaa0Var, ctf0Var), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        String strQ = h8a0Var.f;
        String str = h8a0Var.d.b;
        b9a0 b9a0Var = h8a0Var.b;
        if (v5a0Var.d) {
            if (h8a0Var.f12617a.length() > 0) {
                String str2 = b9a0Var.f;
                bre breVar = b9a0Var.e;
                if (StringsKt.O(str2, "playerlogo", false)) {
                    bzuVar2 = new bzu((byte) 23);
                    bzuVar2.g(str2);
                } else {
                    bzuVar2 = new bzu((byte) 23);
                    bzuVar2.g("playerlogo");
                    bzuVar2.g(str2);
                }
                t5a0Var = new t5a0(((StringBuilder) bzuVar2.b).toString(), ((StringBuilder) rz4.d("sfiles", "logo_teams", breVar.b).b).toString(), b9a0Var.b, strQ, breVar.f3077a, k7x.I(h8a0Var, ctf0Var));
            }
            return new x5a0(t5a0Var, ydx.c0(nc5Var), k7x.O(oaa0Var, ctf0Var), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        String str3 = b9a0Var.f;
        bre breVar2 = b9a0Var.e;
        if (StringsKt.O(str3, "playerlogo", false)) {
            bzuVar = new bzu((byte) 23);
            bzuVar.g(str3);
        } else {
            bzuVar = new bzu((byte) 23);
            bzuVar.g("playerlogo");
            bzuVar.g(str3);
        }
        String string = ((StringBuilder) bzuVar.b).toString();
        String string2 = ((StringBuilder) rz4.d("sfiles", "logo_teams", breVar2.b).b).toString();
        String str4 = b9a0Var.b;
        if (str.length() > 0) {
            strQ = w6x.q(str, ". ", strQ);
        }
        t5a0 t5a0Var2 = new t5a0(string, string2, str4, strQ, breVar2.f3077a, k7x.I(h8a0Var, ctf0Var));
        j9m0 j9m0VarC0 = ydx.c0(nc5Var);
        List<f8a0> list = h8a0Var.g;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (f8a0 f8a0Var : list) {
            f8a0Var.getClass();
            String str5 = f8a0Var.f9096a;
            int i = f8a0Var.b;
            if (i != 62) {
                switch (i) {
                    case 23:
                        dfm0Var = q8a0.b;
                        break;
                    case 24:
                        dfm0Var = l8a0.b;
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        dfm0Var = t8a0.b;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        dfm0Var = m8a0.b;
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        dfm0Var = s8a0.b;
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        dfm0Var = r8a0.b;
                        break;
                    default:
                        switch (i) {
                            case 56:
                                dfm0Var = p8a0.b;
                                break;
                            case 57:
                                dfm0Var = n8a0.b;
                                break;
                            case 58:
                                dfm0Var = o8a0.b;
                                break;
                            default:
                                dfm0Var = u8a0.b;
                                break;
                        }
                        break;
                }
            } else {
                dfm0Var = v8a0.b;
            }
            arrayList.add(new j240(dfm0Var, str5));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((j240) obj2).f15765a instanceof u8a0)) {
                arrayList2.add(obj2);
            }
        }
        return new w5a0(t5a0Var2, j9m0VarC0, k7x.O(oaa0Var, ctf0Var), dyb.o0(arrayList2));
    }

    private final Object x(Object obj) {
        s7a0 s7a0Var = (s7a0) obj;
        s7a0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.medals, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        boolean z = s7a0Var.f31741a;
        List<cl30> list = s7a0Var.c;
        if (z) {
            return new w7a0(immVar);
        }
        boolean z2 = s7a0Var.b;
        ocl oclVar = this.c;
        if (z2) {
            return new v7a0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar);
        }
        if (list.isEmpty()) {
            return new v7a0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990), immVar);
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (cl30 cl30Var : list) {
            String str = cl30Var.f4537a;
            int i = cl30Var.b;
            String strValueOf = "-";
            String strValueOf2 = i == -1 ? "-" : String.valueOf(i);
            int i2 = cl30Var.c;
            String strValueOf3 = i2 == -1 ? "-" : String.valueOf(i2);
            int i3 = cl30Var.d;
            if (i3 != -1) {
                strValueOf = String.valueOf(i3);
            }
            arrayList.add(new t7a0(str, strValueOf2, strValueOf3, strValueOf));
        }
        return new u7a0(immVar, dyb.o0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:181:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    private final Object y(Object obj) {
        j9m0 j9m0Var;
        Object next;
        Object next2;
        String str;
        Object next3;
        ?? arrayList;
        hca0 hca0Var;
        List list;
        bre breVar;
        List list2;
        Object next4;
        String str2;
        String strM;
        String str3;
        String str4;
        String str5;
        Iterator it;
        Object next5;
        b9a0 b9a0Var;
        bre breVar2;
        ?? arrayList2;
        List list3;
        bre breVar3;
        String str6;
        String str7;
        rja0 rja0Var = (rja0) obj;
        rja0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = rja0Var.i;
        cca0 cca0Var = rja0Var.f30583a;
        String str8 = "";
        j9m0 j9m0Var2 = new j9m0(R.drawable.default_background, p7x.z(z, 4L), "");
        if (rja0Var.e) {
            return new tja0(j9m0Var2);
        }
        boolean z2 = rja0Var.g;
        ocl oclVar = this.c;
        if (z2) {
            return new sja0(j9m0Var2, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.currently_no_events, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (cca0Var == null) {
            return new sja0(j9m0Var2, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        List list4 = cca0Var.c;
        List list5 = cca0Var.f4101a;
        List<ufp0> list6 = cca0Var.b;
        boolean z3 = rja0Var.b;
        bre breVar4 = bre.c;
        if (z3) {
            int i = rja0Var.c;
            ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
            for (ufp0 ufp0Var : list6) {
                Iterator it2 = list5.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = list4;
                        next4 = null;
                        break;
                    }
                    next4 = it2.next();
                    list2 = list4;
                    if (((xba0) next4).c.equals(ufp0Var.f35586a)) {
                        break;
                    }
                    list4 = list2;
                }
                xba0 xba0Var = (xba0) next4;
                String str9 = ufp0Var.b;
                String str10 = ufp0Var.d;
                str10.getClass();
                List list7 = list5;
                j9m0 j9m0Var3 = j9m0Var2;
                if (!kotlin.text.c.x(str10, ujn.h, false)) {
                    if (str10.length() != 0) {
                        List list8 = u0d.f34849a;
                        if (!u0d.c(str10)) {
                            str10 = String.format(Locale.ENGLISH, StringsKt.O(str10, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str10}, 2));
                        }
                        if (xba0Var != null) {
                            strM = k9x.M(xba0Var, ctf0Var);
                        } else {
                            strM = null;
                        }
                        if (strM == null) {
                            str3 = str8;
                        } else {
                            str3 = strM;
                        }
                        if (xba0Var != null) {
                            str4 = xba0Var.e;
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str5 = str8;
                        } else {
                            str5 = str4;
                        }
                        it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it.next();
                            str6 = ((b9a0) next5).f2199a;
                            if (xba0Var != null) {
                                str7 = xba0Var.c;
                            } else {
                                str7 = null;
                            }
                        } while (!str6.equals(str7));
                        b9a0Var = (b9a0) next5;
                        if (b9a0Var != null || (breVar3 = b9a0Var.e) == null) {
                            breVar2 = breVar4;
                        } else {
                            breVar2 = breVar3;
                        }
                        if (xba0Var != null || (list3 = xba0Var.d) == null) {
                            arrayList2 = 0;
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(h8x.V((udb) it3.next()));
                            }
                            arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList4) {
                                if (!(((jz30) obj2).b instanceof gxp0)) {
                                    arrayList2.add(obj2);
                                }
                            }
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        arrayList3.add(new hca0(str9, str2, str3, str5, breVar2, arrayList2));
                        list5 = list7;
                        j9m0Var2 = j9m0Var3;
                        list4 = list2;
                        str8 = str8;
                    }
                    str2 = str8;
                    str8 = str2;
                    if (xba0Var != null) {
                        strM = k9x.M(xba0Var, ctf0Var);
                    } else {
                        strM = null;
                    }
                    if (strM == null) {
                        str3 = str8;
                    } else {
                        str3 = strM;
                    }
                    if (xba0Var != null) {
                        str4 = xba0Var.e;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str5 = str8;
                    } else {
                        str5 = str4;
                    }
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it.next();
                        str6 = ((b9a0) next5).f2199a;
                        if (xba0Var != null) {
                            str7 = xba0Var.c;
                        } else {
                            str7 = null;
                        }
                    } while (!str6.equals(str7));
                    b9a0Var = (b9a0) next5;
                    if (b9a0Var != null) {
                        breVar2 = breVar4;
                    } else {
                        breVar2 = breVar4;
                    }
                    if (xba0Var != null) {
                        arrayList2 = 0;
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = iun.f15405a;
                    }
                    arrayList3.add(new hca0(str9, str2, str3, str5, breVar2, arrayList2));
                    list5 = list7;
                    j9m0Var2 = j9m0Var3;
                    list4 = list2;
                    str8 = str8;
                }
                str2 = str10;
                if (xba0Var != null) {
                    strM = k9x.M(xba0Var, ctf0Var);
                } else {
                    strM = null;
                }
                if (strM == null) {
                    str3 = str8;
                } else {
                    str3 = strM;
                }
                if (xba0Var != null) {
                    str4 = xba0Var.e;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = str8;
                } else {
                    str5 = str4;
                }
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it.next();
                    str6 = ((b9a0) next5).f2199a;
                    if (xba0Var != null) {
                        str7 = xba0Var.c;
                    } else {
                        str7 = null;
                    }
                } while (!str6.equals(str7));
                b9a0Var = (b9a0) next5;
                if (b9a0Var != null) {
                    breVar2 = breVar4;
                } else {
                    breVar2 = breVar4;
                }
                if (xba0Var != null) {
                    arrayList2 = 0;
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                arrayList3.add(new hca0(str9, str2, str3, str5, breVar2, arrayList2));
                list5 = list7;
                j9m0Var2 = j9m0Var3;
                list4 = list2;
                str8 = str8;
            }
            j9m0Var = j9m0Var2;
            hca0Var = (hca0) CollectionsKt.W(i, arrayList3);
            if (hca0Var == null) {
                hca0Var = new hca0("", "", "", "", bre.c, iun.f15405a);
            }
        } else {
            j9m0Var = j9m0Var2;
            String str11 = rja0Var.h;
            Iterator it4 = list6.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!Intrinsics.d(((ufp0) next).f35586a, str11));
            ufp0 ufp0Var2 = (ufp0) next;
            Iterator it5 = list5.iterator();
            do {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
            } while (!((xba0) next2).c.equals(str11));
            xba0 xba0Var2 = (xba0) next2;
            String str12 = ufp0Var2 != null ? ufp0Var2.b : null;
            String str13 = str12 == null ? "" : str12;
            String str14 = ufp0Var2 != null ? ufp0Var2.d : null;
            if (str14 == null) {
                str14 = "";
            }
            if (kotlin.text.c.x(str14, ujn.h, false)) {
                str = str14;
            } else {
                if (str14.length() != 0) {
                    List list9 = u0d.f34849a;
                    if (!u0d.c(str14)) {
                        str14 = String.format(Locale.ENGLISH, StringsKt.O(str14, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str14}, 2));
                        str = str14;
                    }
                }
                str = "";
            }
            String strM2 = xba0Var2 != null ? k9x.M(xba0Var2, ctf0Var) : null;
            String str15 = strM2 == null ? "" : strM2;
            String str16 = xba0Var2 != null ? xba0Var2.e : null;
            String str17 = str16 == null ? "" : str16;
            Iterator it6 = list4.iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (!((b9a0) next3).f2199a.equals(str11));
            b9a0 b9a0Var2 = (b9a0) next3;
            bre breVar5 = (b9a0Var2 == null || (breVar = b9a0Var2.e) == null) ? breVar4 : breVar;
            if (xba0Var2 == null || (list = xba0Var2.d) == null) {
                arrayList = 0;
            } else {
                ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(h8x.V((udb) it7.next()));
                }
                arrayList = new ArrayList();
                for (Object obj3 : arrayList5) {
                    if (!(((jz30) obj3).b instanceof gxp0)) {
                        arrayList.add(obj3);
                    }
                }
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            hca0Var = new hca0(str13, str, str15, str17, breVar5, arrayList);
        }
        ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
        Iterator it8 = list6.iterator();
        while (it8.hasNext()) {
            arrayList6.add(((ufp0) it8.next()).b);
        }
        return new uja0(j9m0Var, hca0Var, dyb.o0(arrayList6), rja0Var.c, rja0Var.b, rja0Var.i);
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0566  */
    /* JADX WARN: Code duplicated, block: B:210:0x0570  */
    /* JADX WARN: Code duplicated, block: B:216:0x0581  */
    /* JADX WARN: Code duplicated, block: B:257:0x0635  */
    /* JADX WARN: Code duplicated, block: B:258:0x0638  */
    /* JADX WARN: Code duplicated, block: B:262:0x0670  */
    /* JADX WARN: Code duplicated, block: B:265:0x067b A[LOOP:3: B:260:0x066a->B:265:0x067b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x0681  */
    /* JADX WARN: Code duplicated, block: B:269:0x0684  */
    /* JADX WARN: Code duplicated, block: B:272:0x068a  */
    /* JADX WARN: Code duplicated, block: B:273:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:313:0x0766  */
    /* JADX WARN: Code duplicated, block: B:316:0x0770  */
    /* JADX WARN: Code duplicated, block: B:322:0x0781  */
    /* JADX WARN: Code duplicated, block: B:359:0x082e  */
    /* JADX WARN: Code duplicated, block: B:360:0x0840  */
    /* JADX WARN: Code duplicated, block: B:363:0x0852  */
    /* JADX WARN: Code duplicated, block: B:364:0x0875  */
    /* JADX WARN: Code duplicated, block: B:405:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:408:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:411:0x090e A[LOOP:9: B:406:0x08f8->B:411:0x090e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:596:0x067e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x067f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:? A[LOOP:4: B:208:0x056a->B:600:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x077b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x077f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[LOOP:7: B:314:0x076a->B:609:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x090c A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        mpm lpmVar;
        int i;
        kgp0 kgp0Var;
        long jM111getPurple0d7_KjU;
        String str;
        String string2;
        ctf0 ctf0Var;
        boolean z;
        w2w w2wVarB0;
        rv7 pv7Var;
        Object x77Var;
        dn7 dn7Var;
        Object u77Var;
        fa50 fa50Var;
        boolean z2;
        ga50 ea50Var;
        llm ilmVar;
        gmm dmmVar;
        int i2;
        String strA;
        Iterator it;
        Iterator it2;
        int iOrdinal;
        ga50 ea50Var2;
        llm ilmVar2;
        boolean z3;
        gmm dmmVar2;
        dmm dmmVar3;
        String strA2;
        tlm plmVar;
        Iterator it3;
        i4 i4VarR0;
        llm ilmVar3;
        boolean z4;
        gmm dmmVar4;
        dmm dmmVar5;
        String str2;
        ListIterator listIterator;
        int i3;
        int i4;
        tlm plmVar2;
        Iterator it4;
        x6q0 x6q0Var;
        int i5;
        String strA3;
        jjm hjmVar;
        int i6;
        byte b = this.f5201a;
        String strA4 = "";
        int i7 = 1;
        ocl oclVar = this.c;
        ctf0 ctf0Var2 = this.b;
        switch (b) {
            case 0:
                long j = 0;
                my myVar = (my) obj;
                myVar.getClass();
                ctf0Var2.getClass();
                if (myVar.f22581a) {
                    return yy.f43445a;
                }
                if (myVar.c) {
                    return new xy(ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                ArrayList arrayList = new ArrayList(r3d.q(myVar.b, 10));
                int i8 = 0;
                for (Iterator it5 = r0.iterator(); it5.hasNext(); it5 = it5) {
                    Object next = it5.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        q3d.p();
                        throw null;
                    }
                    cy cyVar = (cy) next;
                    cyVar.getClass();
                    long j2 = cyVar.f5148a;
                    int i10 = cyVar.j;
                    String str3 = cyVar.h;
                    if (j2 != j) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j2, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    x00 x00Var = new x00(string, cyVar.b);
                    boolean z5 = cyVar.g;
                    int length = str3.length();
                    opm opmVar = opm.f25648a;
                    if (length != 0 && z5) {
                        bh30 bh30VarB = new Regex("(\\d+[:-]\\d+)").b(str3);
                        String value = bh30VarB != null ? bh30VarB.getValue() : null;
                        if (value == null) {
                            value = "";
                        }
                        List listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{Separators.COLON}, false, 0, 6, null);
                        lpmVar = new kpm(opmVar, new hpm(0L, 3), d5c.O((String) listSplit$default.get(0), (String) listSplit$default.get(1), false, false, new hpm(0L, 3)));
                    } else {
                        lpmVar = new lpm(opmVar, new hpm(j, 3));
                    }
                    String str4 = cyVar.c;
                    String str5 = (String) CollectionsKt.firstOrNull(cyVar.d);
                    if (str5 == null) {
                        str5 = "";
                    }
                    c280 c280Var = new c280(vsm0.t(str5), R.drawable.ic_glyph_placeholder_player);
                    String str6 = cyVar.e;
                    String str7 = (String) CollectionsKt.firstOrNull(cyVar.f);
                    if (str7 == null) {
                        str7 = "";
                    }
                    c280 c280Var2 = new c280(vsm0.t(str7), R.drawable.ic_glyph_placeholder_player);
                    int i11 = cyVar.i;
                    if (i11 != 1) {
                        i = 2;
                        kgp0Var = i11 != 2 ? kgp0.f18250a : kgp0.b;
                    } else {
                        i = 2;
                        kgp0Var = kgp0.f18250a;
                    }
                    kgp0 kgp0Var2 = kgp0Var;
                    String strA5 = i10 != 1 ? i10 != i ? ctf0Var2.b.a(R.string.team_first, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.team_sec, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.team_first, Arrays.copyOf(new Object[0], 0));
                    if (i10 == 1 || i10 != 2) {
                        pz40 pz40Var = s6t0.f31722a;
                        jM111getPurple0d7_KjU = StaticColors.INSTANCE.m111getPurple0d7_KjU();
                    } else {
                        pz40 pz40Var2 = s6t0.f31722a;
                        jM111getPurple0d7_KjU = StaticColors.INSTANCE.m119getTeal0d7_KjU();
                    }
                    j00 j00Var = new j00(lpmVar, str4, c280Var, str6, c280Var2, strA5, kgp0Var2, jM111getPurple0d7_KjU);
                    bh30 bh30VarB2 = new Regex("\\((.*?)\\)").b(str3);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new ex(i8, x00Var, j00Var, (bh30VarB2 == null || (str = (String) CollectionsKt.d0(bh30VarB2.a())) == null || (string2 = StringsKt.u0(str).toString()) == null) ? "" : kotlin.text.c.r(string2, Separators.COMMA, ", ", false)));
                    myVar = myVar;
                    arrayList = arrayList2;
                    i8 = i9;
                    j = 0;
                }
                return new zy(dyb.o0(arrayList), myVar.d);
            case 1:
                jp6 jp6Var = (jp6) obj;
                jp6Var.getClass();
                return new op6(jp6Var, ctf0Var2, oclVar);
            case 2:
                or6 or6Var = (or6) obj;
                or6Var.getClass();
                return new op6(or6Var, ctf0Var2, oclVar);
            case 3:
                i77 i77Var = (i77) obj;
                i77Var.getClass();
                boolean z6 = i77Var.f14279a;
                boolean z7 = i77Var.c;
                boolean z8 = i77Var.q;
                String str8 = i77Var.j;
                ctf0Var2.getClass();
                ql5 ql5Var = i77Var.e;
                ov7 ov7Var = i77Var.h;
                wdj wdjVar = i77Var.l;
                List list = i77Var.m;
                List list2 = i77Var.F;
                boolean z9 = i77Var.E.m;
                List list3 = i77Var.t;
                boolean z10 = i77Var.k;
                HistoryTypeModel historyTypeModel = i77Var.i;
                on5 on5VarX0 = jiq0.x0(ql5Var, ctf0Var2);
                BetHistoryScreenModel betHistoryScreenModel = i77Var.f;
                int iOrdinal2 = betHistoryScreenModel.getC().ordinal();
                if (iOrdinal2 != 0) {
                    boolean z11 = z8;
                    mlm mlmVar = mlm.f21997a;
                    fmm fmmVar = fmm.f9790a;
                    ra50 ra50Var = ra50.f30118a;
                    klm klmVar = klm.f18497a;
                    fa50 fa50Var2 = fa50.f9191a;
                    if (iOrdinal2 == 1) {
                        list3 = list3;
                        ctf0Var = ctf0Var2;
                        z = z10;
                        f8w f8wVarA = i8w.a(betHistoryScreenModel);
                        String strP0 = uzb.p0(historyTypeModel, ctf0Var, f8wVarA, str8);
                        boolean z12 = f8wVarA != f8w.b && z;
                        boolean z13 = k7x.R(historyTypeModel) && z;
                        boolean z14 = z && ((iOrdinal = historyTypeModel.ordinal()) == 0 || iOrdinal == 2 || iOrdinal == 3);
                        boolean z15 = (z6 || z7) ? false : true;
                        if (list == null || !list.isEmpty()) {
                            Iterator it6 = list.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    fa50Var = fa50Var2;
                                    if (((h0w) it6.next()).b) {
                                        fa50Var2 = fa50Var;
                                    }
                                } else {
                                    fa50Var = fa50Var2;
                                    if (list2 != null || !list2.isEmpty()) {
                                        it = list2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                it2 = it;
                                                if (((un7) it.next()).b) {
                                                    it = it2;
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                }
                                z2 = true;
                            }
                        } else {
                            fa50Var = fa50Var2;
                            if (list2 != null) {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        it2 = it;
                                        if (((un7) it.next()).b) {
                                            z2 = true;
                                        } else {
                                            it = it2;
                                        }
                                    }
                                }
                            } else {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        it2 = it;
                                        if (((un7) it.next()).b) {
                                            z2 = true;
                                        } else {
                                            it = it2;
                                        }
                                    }
                                }
                            }
                            z2 = false;
                        }
                        int i12 = z11 ? R.drawable.ic_glyph_compressed_inactive : R.drawable.ic_glyph_extended;
                        boolean z16 = z2;
                        int iOrdinal3 = historyTypeModel.ordinal();
                        if (iOrdinal3 == 1 || iOrdinal3 == 7) {
                            z11 = true;
                        }
                        HistoryTypeModel historyTypeModel2 = HistoryTypeModel.EVENTS;
                        boolean z17 = historyTypeModel == historyTypeModel2;
                        if (z12) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            ea50Var = new ea50(s6t0.b().f33626a.getSecondary());
                        } else {
                            ea50Var = fa50Var;
                        }
                        f8w f8wVar = f8w.b;
                        if (f8wVarA == f8wVar) {
                            pz40 pz40Var4 = s6t0.f31722a;
                            ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        } else {
                            ilmVar = klmVar;
                        }
                        if (z14) {
                            boolean z18 = z15 && !list3.isEmpty();
                            pz40 pz40Var5 = s6t0.f31722a;
                            dmmVar = new dmm(new ta50(new wkm(1, i12, z18, ra50Var, s6t0.b().f33626a.getSecondary())));
                        } else {
                            dmmVar = fmmVar;
                        }
                        String strH = ibm0.h(ql5Var);
                        HistoryTypeModel historyTypeModel3 = HistoryTypeModel.UNSETTLED;
                        if (historyTypeModel != historyTypeModel3) {
                            strA4 = ctf0Var.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        }
                        String strT = (historyTypeModel == historyTypeModel3 || f8wVarA == f8wVar) ? strA4 : lgb.T(wdjVar, ctf0Var);
                        if (historyTypeModel == historyTypeModel2 && z9) {
                            i2 = 0;
                            strA = ctf0Var.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                        } else {
                            i2 = 0;
                            strA = strA4;
                        }
                        w2wVarB0 = new w2w(strP0, z17, z11, strH, new dx(strT, strA, strA4), new w2q(ctf0Var.b.a(R.string.filters, Arrays.copyOf(new Object[i2], i2)), z13, z16 || (wdjVar instanceof vdj) || (wdjVar instanceof tdj), !z7), ea50Var, ilmVar, dmmVar, mlmVar, "", false, 0, lak0.c);
                    } else if (iOrdinal2 == 3) {
                        list3 = list3;
                        z = z10;
                        f8w f8wVarA2 = i8w.a(betHistoryScreenModel);
                        ctf0Var = ctf0Var2;
                        String strP1 = uzb.p0(historyTypeModel, ctf0Var, f8wVarA2, str8);
                        f8w f8wVar2 = f8w.b;
                        boolean z19 = f8wVarA2 != f8wVar2 && z;
                        HistoryTypeModel historyTypeModel4 = HistoryTypeModel.EVENTS;
                        String strA6 = historyTypeModel == historyTypeModel4 ? ctf0Var.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0)) : "";
                        boolean z20 = historyTypeModel == HistoryTypeModel.TOTO || z11;
                        boolean z21 = historyTypeModel == historyTypeModel4;
                        if (z19) {
                            pz40 pz40Var6 = s6t0.f31722a;
                            ea50Var2 = new ea50(s6t0.b().f33626a.getSecondary());
                        } else {
                            ea50Var2 = fa50Var2;
                        }
                        if (f8wVarA2 == f8wVar2) {
                            pz40 pz40Var7 = s6t0.f31722a;
                            ilmVar2 = new ilm(s6t0.b().f33626a.getSecondary());
                        } else {
                            ilmVar2 = klmVar;
                        }
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it7 = list2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (!((un7) it7.next()).b) {
                                    }
                                } else if (list != null || !list.isEmpty()) {
                                    it3 = list.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!((h0w) it3.next()).b) {
                                            }
                                        } else if (wdjVar instanceof vdj) {
                                            z3 = false;
                                        }
                                    }
                                } else if (wdjVar instanceof vdj) {
                                    z3 = false;
                                }
                                z3 = true;
                            }
                        } else {
                            if (list != null) {
                                it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!((h0w) it3.next()).b) {
                                        }
                                    } else if (wdjVar instanceof vdj) {
                                        z3 = false;
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!((h0w) it3.next()).b) {
                                        }
                                    } else if (wdjVar instanceof vdj) {
                                        z3 = false;
                                    }
                                }
                            }
                            z3 = true;
                        }
                        boolean z22 = !list3.isEmpty() || z3;
                        int i13 = z3 ? R.drawable.ic_glyph_filter_active : R.drawable.ic_glyph_filter_inactive;
                        boolean z23 = k7x.R(historyTypeModel) && z;
                        boolean z24 = historyTypeModel == HistoryTypeModel.EVENTS && z;
                        if (z23 && z24) {
                            boolean z25 = !list3.isEmpty();
                            pz40 pz40Var8 = s6t0.f31722a;
                            dmmVar3 = new dmm(new va50(new wkm(1, R.drawable.ic_glyph_statistics, z25, ra50Var, s6t0.b().f33626a.getSecondary()), gkb.R(i13, z22, z3)));
                        } else {
                            if (z23) {
                                dmmVar3 = new dmm(new ta50(gkb.R(i13, z22, z3)));
                            } else if (z24) {
                                boolean z26 = (ov7Var instanceof mv7) && !list3.isEmpty();
                                pz40 pz40Var9 = s6t0.f31722a;
                                dmmVar2 = new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_statistics, z26, ra50Var, s6t0.b().f33626a.getSecondary())));
                            } else {
                                dmmVar2 = fmmVar;
                            }
                            String strH2 = ibm0.h(ql5Var);
                            if (z) {
                                strA2 = ctf0Var.b.a(R.string.history_type_title, Arrays.copyOf(new Object[0], 0));
                            } else {
                                strA2 = "";
                            }
                            dx dxVar = new dx("", strA6, "");
                            w2q w2qVar = new w2q("", false, false, false);
                            lak0 lak0Var = lak0.c;
                            if (f8wVarA2 == f8w.b) {
                                String strA7 = ctf0Var.b.a(R.string.my_bets, Arrays.copyOf(new Object[0], 0));
                                pz40 pz40Var10 = s6t0.f31722a;
                                plmVar = new plm(strA7, s6t0.b().f33626a.getSecondary(), fa50Var2);
                            } else {
                                plmVar = mlmVar;
                            }
                            strA4 = "";
                            w2wVarB0 = new w2w(strP1, z21, z20, strH2, dxVar, w2qVar, ea50Var2, ilmVar2, dmmVar2, plmVar, strA2, z19, 0, lak0Var);
                        }
                        dmmVar2 = dmmVar3;
                        String strH3 = ibm0.h(ql5Var);
                        if (z) {
                            strA2 = ctf0Var.b.a(R.string.history_type_title, Arrays.copyOf(new Object[0], 0));
                        } else {
                            strA2 = "";
                        }
                        dx dxVar2 = new dx("", strA6, "");
                        w2q w2qVar2 = new w2q("", false, false, false);
                        lak0 lak0Var2 = lak0.c;
                        if (f8wVarA2 == f8w.b) {
                            String strA8 = ctf0Var.b.a(R.string.my_bets, Arrays.copyOf(new Object[0], 0));
                            pz40 pz40Var11 = s6t0.f31722a;
                            plmVar = new plm(strA8, s6t0.b().f33626a.getSecondary(), fa50Var2);
                        } else {
                            plmVar = mlmVar;
                        }
                        strA4 = "";
                        w2wVarB0 = new w2w(strP1, z21, z20, strH3, dxVar2, w2qVar2, ea50Var2, ilmVar2, dmmVar2, plmVar, strA2, z19, 0, lak0Var2);
                    } else if (iOrdinal2 != 4) {
                        w2wVarB0 = l7x.b0(i77Var, ctf0Var2, i8w.a(betHistoryScreenModel), z9);
                        strA4 = "";
                        list3 = list3;
                        ctf0Var = ctf0Var2;
                        z = z10;
                    } else {
                        f8w f8wVarA3 = i8w.a(betHistoryScreenModel);
                        List list4 = eno0.f8105a;
                        List list5 = i77Var.I;
                        boolean z27 = ql5Var != null && ql5Var.i.a();
                        if (f8wVarA3 == f8w.b) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            i4VarR0 = dyb.g0(new j8w(new s4i(lsm0Var.a(R.string.bets, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_history, null, false, 12), HistoryTypeModel.EVENTS), new j8w(new s4i(lsm0Var.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_sell, null, false, 12), HistoryTypeModel.SALE));
                        } else {
                            List list6 = eno0.f8105a;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it8 = list6.iterator();
                            while (it8.hasNext()) {
                                HistoryTypeModel historyTypeModel5 = (HistoryTypeModel) it8.next();
                                Iterator it9 = it8;
                                j8w j8wVarB = (historyTypeModel5 == HistoryTypeModel.SALE || list5.contains(historyTypeModel5)) ? eno0.b(historyTypeModel5, ctf0Var2, z27) : null;
                                if (j8wVarB != null) {
                                    arrayList3.add(j8wVarB);
                                }
                                it8 = it9;
                            }
                            i4VarR0 = dyb.r0(arrayList3);
                        }
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA9 = lsm0Var2.a(R.string.history, Arrays.copyOf(new Object[0], 0));
                        boolean z28 = historyTypeModel == HistoryTypeModel.EVENTS;
                        if (f8wVarA3 == f8w.b) {
                            pz40 pz40Var12 = s6t0.f31722a;
                            ilmVar3 = new ilm(s6t0.b().f33626a.getSecondary());
                        } else {
                            ilmVar3 = klmVar;
                        }
                        if (list2 == 0 || !list2.isEmpty()) {
                            Iterator it10 = list2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    if (!((un7) it10.next()).b) {
                                    }
                                } else if (list != null || !list.isEmpty()) {
                                    it4 = list.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!((h0w) it4.next()).b) {
                                            }
                                        } else if (wdjVar instanceof vdj) {
                                            z4 = false;
                                        }
                                    }
                                } else if (wdjVar instanceof vdj) {
                                    z4 = false;
                                }
                                z4 = true;
                            }
                        } else {
                            if (list != null) {
                                it4 = list.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!((h0w) it4.next()).b) {
                                        }
                                    } else if (wdjVar instanceof vdj) {
                                        z4 = false;
                                    }
                                }
                            } else {
                                it4 = list.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!((h0w) it4.next()).b) {
                                        }
                                    } else if (wdjVar instanceof vdj) {
                                        z4 = false;
                                    }
                                }
                            }
                            z4 = true;
                        }
                        boolean z29 = !list3.isEmpty() || z4;
                        int i14 = z4 ? R.drawable.ic_glyph_filter_active : R.drawable.ic_glyph_filter_inactive;
                        boolean z30 = k7x.R(historyTypeModel) && z10;
                        boolean z31 = historyTypeModel == HistoryTypeModel.EVENTS && z10 && f8wVarA3 == f8w.f9129a && i77Var.D;
                        if (z30 && z31) {
                            boolean z32 = !list3.isEmpty();
                            pz40 pz40Var13 = s6t0.f31722a;
                            z = z10;
                            dmmVar5 = new dmm(new va50(new wkm(25, R.drawable.ic_glyph_hide, z32, ra50Var, s6t0.b().f33626a.getSecondary()), eno0.a(i14, z29, z4)));
                        } else {
                            z = z10;
                            if (z30) {
                                dmmVar5 = new dmm(new ta50(eno0.a(i14, z29, z4)));
                            } else if (z31) {
                                boolean z33 = (ov7Var instanceof mv7) && !list3.isEmpty();
                                pz40 pz40Var14 = s6t0.f31722a;
                                dmmVar4 = new dmm(new ta50(new wkm(25, R.drawable.ic_glyph_hide, z33, ra50Var, s6t0.b().f33626a.getSecondary())));
                            } else {
                                dmmVar4 = fmmVar;
                            }
                            if (ql5Var == null) {
                                str2 = "";
                            } else {
                                pn40 pn40Var = pn40.f27267a;
                                String strC = pn40.c(ql5Var.b, p3u0.c);
                                String str9 = ql5Var.f;
                                str9.getClass();
                                str2 = String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{strC, str9}, 2));
                            }
                            dx dxVar3 = new dx("", "", "");
                            w2q w2qVar3 = new w2q("", false, false, false);
                            listIterator = i4VarR0.listIterator(0);
                            i3 = 0;
                            while (true) {
                                if (listIterator.hasNext()) {
                                    i3 = -1;
                                } else if (((j8w) listIterator.next()).b == historyTypeModel) {
                                    i3++;
                                }
                            }
                            if (i3 < 0) {
                                i4 = 0;
                            } else {
                                i4 = i3;
                            }
                            if (f8wVarA3 == f8w.b) {
                                String strA10 = lsm0Var2.a(R.string.my_bets, Arrays.copyOf(new Object[0], 0));
                                pz40 pz40Var15 = s6t0.f31722a;
                                plmVar2 = new plm(strA10, s6t0.b().f33626a.getSecondary(), fa50Var2);
                            } else {
                                plmVar2 = mlmVar;
                            }
                            strA4 = "";
                            w2wVarB0 = new w2w(strA9, z28, false, str2, dxVar3, w2qVar3, fa50Var2, ilmVar3, dmmVar4, plmVar2, "", false, i4, i4VarR0);
                            ctf0Var = ctf0Var2;
                        }
                        dmmVar4 = dmmVar5;
                        if (ql5Var == null) {
                            str2 = "";
                        } else {
                            pn40 pn40Var2 = pn40.f27267a;
                            String strC2 = pn40.c(ql5Var.b, p3u0.c);
                            String str10 = ql5Var.f;
                            str10.getClass();
                            str2 = String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{strC2, str10}, 2));
                        }
                        dx dxVar4 = new dx("", "", "");
                        w2q w2qVar4 = new w2q("", false, false, false);
                        listIterator = i4VarR0.listIterator(0);
                        i3 = 0;
                        while (true) {
                            if (listIterator.hasNext()) {
                                i3 = -1;
                            } else if (((j8w) listIterator.next()).b == historyTypeModel) {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            i4 = 0;
                        } else {
                            i4 = i3;
                        }
                        if (f8wVarA3 == f8w.b) {
                            String strA11 = lsm0Var2.a(R.string.my_bets, Arrays.copyOf(new Object[0], 0));
                            pz40 pz40Var16 = s6t0.f31722a;
                            plmVar2 = new plm(strA11, s6t0.b().f33626a.getSecondary(), fa50Var2);
                        } else {
                            plmVar2 = mlmVar;
                        }
                        strA4 = "";
                        w2wVarB0 = new w2w(strA9, z28, false, str2, dxVar4, w2qVar4, fa50Var2, ilmVar3, dmmVar4, plmVar2, "", false, i4, i4VarR0);
                        ctf0Var = ctf0Var2;
                    }
                } else {
                    strA4 = "";
                    list3 = list3;
                    ctf0Var = ctf0Var2;
                    z = z10;
                    w2wVarB0 = l7x.b0(i77Var, ctf0Var, i8w.a(betHistoryScreenModel), z9);
                }
                ocl oclVar2 = this.c;
                if (z) {
                    if (z6) {
                        u77Var = new w77(on5VarX0, w2wVarB0, i77Var.y, i77Var.z, i77Var.b);
                    } else if (z7) {
                        u77Var = new v77(on5VarX0, w2wVarB0, i77Var.y, i77Var.z, i77Var.b, ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else if (z6 || !list3.isEmpty()) {
                        boolean z34 = i77Var.o;
                        boolean z35 = i77Var.p;
                        ArrayList arrayListS0 = kc5.S0(i77Var, ctf0Var, i77Var.K, i77Var.L);
                        qgv0 qgv0Var = i77Var.v;
                        if (ov7Var instanceof mv7) {
                            lv7 lv7Var = ((mv7) ov7Var).f22443a;
                            String str11 = ql5Var != null ? ql5Var.f : null;
                            String str12 = str11 == null ? strA4 : str11;
                            k77 c = betHistoryScreenModel.getC();
                            int i15 = lv7Var.f20704a;
                            c.getClass();
                            int iOrdinal4 = c.ordinal();
                            if (iOrdinal4 != 2) {
                                qvw qvwVar = qvw.f29409a;
                                if (iOrdinal4 != 4) {
                                    dn7Var = new dn7(ctf0Var.b.a(R.string.statistic_for_period, Arrays.copyOf(new Object[0], 0)), mrv.f0(lv7Var, ctf0Var, mrv.g0(lv7Var, str12)), String.valueOf(i15), qvwVar);
                                } else {
                                    String strR = w6x.r(new Object[0], 0, ctf0Var.b, R.string.bets_for_period_with_colon, " ");
                                    pn40 pn40Var3 = pn40.f27267a;
                                    dn7Var = new dn7(strR, kng0.l(pn40.i(lv7Var.d, 2), " ", str12), String.valueOf(i15), qvwVar);
                                }
                            } else {
                                dn7Var = new dn7(ctf0Var.b.a(R.string.statistic_for_period, Arrays.copyOf(new Object[0], 0)), mrv.f0(lv7Var, ctf0Var, mrv.g0(lv7Var, str12)), String.valueOf(i15), new svw(R.drawable.ic_glyph_statistics));
                            }
                            pv7Var = new pv7(dn7Var);
                        } else {
                            if (!ov7Var.equals(nv7.f24177a)) {
                                t9f.b();
                                return null;
                            }
                            pv7Var = qv7.f29375a;
                        }
                        x77Var = new x77(on5VarX0, w2wVarB0, i77Var.w && i77Var.C, i77Var.y, i77Var.z, i77Var.b, arrayListS0, pv7Var, qgv0Var, z34, z35);
                    } else {
                        u77Var = new u77(on5VarX0, w2wVarB0, i77Var.y, i77Var.z, i77Var.b, a87.f412a[historyTypeModel.ordinal()] == 1 ? ocl.b(oclVar2, pb10.f, null, 0, 0, R.string.no_bets_for_the_selected_period_game_more, R.string.play_button, 0L, 0L, 862) : ocl.b(oclVar2, pb10.f, null, 0, 0, R.string.bet_market_empty_bets_do_more_bets, R.string.make_bet, 0L, 0L, 862));
                    }
                    return u77Var;
                }
                mdm mdmVarB = ocl.b(oclVar2, pb10.r1, pdm.b, R.drawable.ic_glyph_circle_time, 0, R.string.bet_history_available_only_authorized_users, 0, 0L, 0L, 980);
                lsm0 lsm0Var3 = ctf0Var.b;
                x77Var = new y77(on5VarX0, w2wVarB0, i77Var.y, i77Var.z, i77Var.b, mdmVarB, new g7t0(lsm0Var3.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.registration, Arrays.copyOf(new Object[0], 0))));
                return x77Var;
            case 4:
                rc7 rc7Var = (rc7) obj;
                rc7Var.getClass();
                return new xc7(rc7Var, ctf0Var2, oclVar);
            case 5:
                hf7 hf7Var = (hf7) obj;
                hf7Var.getClass();
                ctf0Var2.getClass();
                af7 af7Var = hf7Var.b;
                String str13 = hf7Var.d;
                boolean z36 = af7Var.f764a;
                boolean z37 = z36 && af7Var.b;
                boolean z38 = hf7Var.c;
                lsm0 lsm0Var4 = ctf0Var2.b;
                String strA12 = lsm0Var4.a(R.string.limit_not_saved_error, Arrays.copyOf(new Object[0], 0));
                long j3 = af7Var.f;
                long j4 = af7Var.c;
                o6q0 o6q0Var = o6q0.f24750a;
                if (z36) {
                    x6q0Var = new x6q0(j4 > 0 ? String.valueOf(j4) : "", o6q0Var, new s7q0(str13), true, str13.length() > 0, new y5q0(9, null, null, 6), lsm0Var4.a(R.string.limits_enter_sum_with_currency_v2, Arrays.copyOf(new Object[]{af7Var.g}, 1)), null, 0, 32000);
                } else {
                    x6q0Var = null;
                }
                xrz xrzVar = hf7Var.f12959a;
                if (xrzVar == xh7.BET_PROLONGATION_LIMIT_1_DAY) {
                    i5 = 0;
                    strA3 = lsm0Var4.a(R.string.limits_prolongation_days, Arrays.copyOf(new Object[0], 0));
                } else {
                    i5 = 0;
                    strA3 = xrzVar == xh7.BET_PROLONGATION_LIMIT_7_DAY ? lsm0Var4.a(R.string.limits_prolongation_weeks, Arrays.copyOf(new Object[0], 0)) : xrzVar == xh7.BET_PROLONGATION_LIMIT_30_DAY ? lsm0Var4.a(R.string.limits_prolongation_months, Arrays.copyOf(new Object[0], 0)) : "";
                }
                x6q0 x6q0Var2 = z37 ? new x6q0(j3 != 0 ? String.valueOf(j3) : "", o6q0Var, new s7q0(""), true, false, new y5q0(9, null, null, 6), lsm0Var4.a(R.string.limits_enter_count_periods, Arrays.copyOf(new Object[i5], i5)), null, 0, 32000) : null;
                mtl mtlVar = new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var4.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), !hf7Var.c && z36 && str13.length() == 0 && j4 > r15 && (!z37 || j3 > r15), false, true), ee7.f7656a)));
                boolean z39 = hf7Var.e;
                mdm mdmVarB2 = ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990);
                pz40 pz40Var17 = s6t0.f31722a;
                return new if7(z38, strA12, x6q0Var, strA3, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(lsm0Var4.a(R.string.limits_choice_title, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null), x6q0Var2, mtlVar, z39, mdmVarB2);
            case 6:
                pj8 pj8Var = (pj8) obj;
                pj8Var.getClass();
                ctf0Var2.getClass();
                boolean z40 = pj8Var.b;
                List list7 = pj8Var.d;
                if (z40) {
                    return new rj8(ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), lv00.R(ctf0Var2));
                }
                imm immVarR = lv00.R(ctf0Var2);
                boolean zIsEmpty = list7.isEmpty();
                strA4 = pj8Var.c ? ctf0Var2.b.a(R.string.bonuses_info_bio_new, Arrays.copyOf(new Object[0], 0)) : "";
                if (list7.isEmpty()) {
                    hjmVar = new ijm();
                } else {
                    String strA13 = ctf0Var2.b.a(R.string.possible_bonuses, Arrays.copyOf(new Object[0], 0));
                    pz40 pz40Var18 = s6t0.f31722a;
                    hjmVar = new hjm(strA13, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186);
                }
                ArrayList<mf8> arrayList4 = new ArrayList();
                for (Object obj2 : list7) {
                    if (((mf8) obj2) != mf8.h || pj8Var.e) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                for (mf8 mf8Var : arrayList4) {
                    int i16 = mf8Var.b;
                    lsm0 lsm0Var5 = ctf0Var2.b;
                    String strA14 = lsm0Var5.a(i16, Arrays.copyOf(new Object[0], 0));
                    mf8 mf8Var2 = mf8.g;
                    int i17 = mf8Var.c;
                    String strA15 = mf8Var == mf8Var2 ? lsm0Var5.a(i17, Arrays.copyOf(new Object[]{pj8Var.f27075a}, i7)) : lsm0Var5.a(i17, Arrays.copyOf(new Object[0], 0));
                    int iOrdinal5 = mf8Var.ordinal();
                    if (iOrdinal5 == 0) {
                        i6 = R.drawable.ic_bonuses_info_doubling;
                    } else if (iOrdinal5 == i7) {
                        i6 = R.drawable.ic_bonuses_info_return;
                    } else if (iOrdinal5 == 2) {
                        i6 = R.drawable.ic_bonuses_info_free_bet;
                    } else if (iOrdinal5 == 3) {
                        i6 = R.drawable.ic_bonuses_info_free_spin;
                    } else {
                        if (iOrdinal5 != 4) {
                            t9f.b();
                            return null;
                        }
                        i6 = R.drawable.bonuses_info_wild_freebet;
                    }
                    m0x m0xVar = new m0x(i6, null, 6);
                    d4d d4dVar = d4d.PRIMARY;
                    arrayList5.add(new nan(strA14, strA15, m0xVar, new mt90()));
                    i7 = 1;
                }
                if (arrayList5.isEmpty()) {
                    arrayList5 = new ArrayList(5);
                    for (int i18 = 0; i18 < 5; i18++) {
                        arrayList5.add(oan.f24935a);
                    }
                }
                return new qj8(immVarR, zIsEmpty, strA4, hjmVar, dyb.o0(arrayList5));
            case 7:
                ((kl8) obj).getClass();
                return new ml8(ctf0Var2, oclVar);
            case 8:
                pa9 pa9Var = (pa9) obj;
                pa9Var.getClass();
                return new xa9(pa9Var, ctf0Var2, oclVar);
            case 9:
                return a(obj);
            case 10:
                kya kyaVar = (kya) obj;
                kyaVar.getClass();
                return new mya(kyaVar, ctf0Var2, oclVar);
            case 11:
                return b(obj);
            case 12:
                return c(obj);
            case 13:
                return g(obj);
            case 14:
                return h(obj);
            case 15:
                return i(obj);
            case 16:
                return l(obj);
            case 17:
                return m(obj);
            case 18:
                return o(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return p(obj);
            case 20:
                return r(obj);
            case 21:
                return s(obj);
            case 22:
                ru60 ru60Var = (ru60) obj;
                ru60Var.getClass();
                return new b430(ru60Var, ctf0Var2, oclVar);
            case 23:
                return t(obj);
            case 24:
                return u(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return v(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return w(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return x(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return y(obj);
            default:
                ufb0 ufb0Var = (ufb0) obj;
                ufb0Var.getClass();
                return new syp(oclVar, ctf0Var2, ufb0Var);
        }
    }

    public /* synthetic */ cz(ctf0 ctf0Var, ocl oclVar, byte b) {
        this.f5201a = b;
        this.b = ctf0Var;
        this.c = oclVar;
    }
}
