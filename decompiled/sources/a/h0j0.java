package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h0j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12238a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ h0j0(ctf0 ctf0Var, byte b) {
        this.f12238a = b;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) {
        int i;
        lc00 lc00Var;
        lc00 lc00Var2;
        lc00 lc00Var3;
        lsm0 lsm0Var;
        w0n0 w0n0Var = (w0n0) obj;
        w0n0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        o2n0 o2n0Var = w0n0Var.f38358a;
        f2n0 f2n0Var = f2n0.f8820a;
        boolean zEquals = o2n0Var.equals(f2n0Var);
        h2n0 h2n0Var = h2n0.f12343a;
        j2n0 j2n0Var = j2n0.f15789a;
        n2n0 n2n0Var = n2n0.f22810a;
        g2n0 g2n0Var = g2n0.f10568a;
        l2n0 l2n0Var = l2n0.f19319a;
        k2n0 k2n0Var = k2n0.f17583a;
        m2n0 m2n0Var = m2n0.f21070a;
        i2n0 i2n0Var = i2n0.f14058a;
        if (zEquals) {
            i = R.string.app_guid;
        } else if (o2n0Var.equals(i2n0Var)) {
            i = R.string.environment_and_servers;
        } else if (o2n0Var.equals(m2n0Var)) {
            i = R.string.ui_settings;
        } else if (o2n0Var.equals(k2n0Var)) {
            i = R.string.markets_and_events;
        } else if (o2n0Var.equals(l2n0Var)) {
            i = R.string.online_call;
        } else if (o2n0Var.equals(g2n0Var)) {
            i = R.string.test_chose_country;
        } else if (o2n0Var.equals(n2n0Var)) {
            i = R.string.test_update;
        } else if (o2n0Var.equals(j2n0Var)) {
            i = R.string.test_coupon_generate;
        } else {
            if (!o2n0Var.equals(h2n0Var)) {
                t9f.b();
                return null;
            }
            i = R.string.test_debug_console;
        }
        lsm0 lsm0Var2 = ctf0Var.b;
        imm immVar = new imm(ilmVar, new plm(lsm0Var2.a(i, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        l1q0 l1q0Var = w0n0Var.b;
        z0q0 z0q0Var = w0n0Var.c;
        String str = w0n0Var.d;
        String str2 = w0n0Var.e;
        boolean z = w0n0Var.f;
        int i2 = w0n0Var.g;
        ljj ljjVar = w0n0Var.h;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (o2n0Var.equals(i2n0Var)) {
            if (l1q0Var != null) {
                lsm0Var = lsm0Var2;
                v2n0.j(lc00VarB, lsm0Var.a(R.string.test_servers, Arrays.copyOf(new Object[0], 0)));
                v2n0.l(lc00VarB, q1n0.f27963a, lsm0Var.a(R.string.test_server, Arrays.copyOf(new Object[0], 0)), wui0.b, new ovi0(l1q0Var.f19269a), 16);
                String strA = lsm0Var.a(R.string.second_test_server, Arrays.copyOf(new Object[0], 0));
                ovi0 ovi0Var = new ovi0(l1q0Var.b);
                wui0 wui0Var = wui0.c;
                v2n0.l(lc00VarB, n1n0.f22760a, strA, wui0Var, ovi0Var, 16);
                v2n0.l(lc00VarB, o1n0.f24490a, lsm0Var.a(R.string.luxury_server, Arrays.copyOf(new Object[0], 0)), wui0Var, new ovi0(l1q0Var.c), 16);
                v2n0.l(lc00VarB, l1n0.f19263a, lsm0Var.a(R.string.show_only_test, Arrays.copyOf(new Object[0], 0)), wui0Var, new ovi0(l1q0Var.d), 16);
                v2n0.l(lc00VarB, g1n0.f10522a, lsm0Var.a(R.string.test_casino, Arrays.copyOf(new Object[0], 0)), wui0.d, new ovi0(l1q0Var.e), 16);
                lc00Var3 = lc00VarB;
            } else {
                lc00Var3 = lc00VarB;
                lsm0Var = lsm0Var2;
            }
            v2n0.j(lc00Var3, lsm0Var.a(R.string.test_consultant, Arrays.copyOf(new Object[0], 0)));
            String str3 = z0q0Var.f43582a;
            String strA2 = lsm0Var.a(R.string.test_consultant_projectid_hint, Arrays.copyOf(new Object[0], 0));
            wui0 wui0Var2 = wui0.b;
            lc00 lc00Var4 = lc00Var3;
            v2n0.m(lc00Var4, y0n0.f41816a, str3, strA2, wui0Var2, z0q0Var.c);
            String str4 = z0q0Var.b;
            String strA3 = lsm0Var.a(R.string.test_consultant_projecturl_hint, Arrays.copyOf(new Object[0], 0));
            wui0 wui0Var3 = wui0.c;
            v2n0.m(lc00Var4, z0n0.f43577a, str4, strA3, wui0Var3, z0q0Var.c);
            v2n0.l(lc00Var4, h1n0.f12293a, lsm0Var.a(R.string.test_custom_test_support, Arrays.copyOf(new Object[0], 0)), wui0Var3, new ovi0(z0q0Var.c), 16);
            v2n0.l(lc00Var4, j1n0.f15745a, lsm0Var.a(R.string.test_support, Arrays.copyOf(new Object[0], 0)), wui0Var3, new ovi0(z0q0Var.d), 16);
            v2n0.l(lc00Var4, k1n0.f17535a, lsm0Var.a(R.string.test_stage_support, Arrays.copyOf(new Object[0], 0)), wui0Var3, new ovi0(z0q0Var.e), 16);
            String strA4 = lsm0Var.a(R.string.stage_support, Arrays.copyOf(new Object[0], 0));
            ovi0 ovi0Var2 = new ovi0(z0q0Var.f);
            wui0 wui0Var4 = wui0.d;
            v2n0.l(lc00Var4, i1n0.f14008a, strA4, wui0Var4, ovi0Var2, 16);
            if (l1q0Var != null) {
                boolean z2 = l1q0Var.u;
                v2n0.j(lc00Var4, lsm0Var.a(R.string.special_event_toggle, Arrays.copyOf(new Object[0], 0)));
                lc00Var2 = lc00Var4;
                v2n0.l(lc00Var2, p1n0.f26212a, lsm0Var.a(R.string.special_event_toggle, Arrays.copyOf(new Object[0], 0)), wui0.f39793a, new ovi0(l1q0Var.r), 16);
                v2n0.j(lc00Var4, lsm0Var.a(R.string.domain_title, Arrays.copyOf(new Object[0], 0)));
                v2n0.l(lc00Var2, m1n0.f21017a, lsm0Var.a(R.string.domain_txt_toggle, Arrays.copyOf(new Object[0], 0)), wui0Var2, new ovi0(z2), 16);
                v2n0.m(lc00Var2, a1n0.f79a, str, lsm0Var.a(R.string.manual_txt_hint, Arrays.copyOf(new Object[0], 0)), wui0Var4, !z2);
                lc00VarB = lc00Var2;
            } else {
                lc00VarB = lc00Var4;
            }
            lc00Var = lc00VarB;
        } else {
            if (o2n0Var.equals(m2n0Var)) {
                v2n0.j(lc00VarB, lsm0Var2.a(R.string.ui_settings, Arrays.copyOf(new Object[0], 0)));
                lc00Var2 = lc00VarB;
                v2n0.l(lc00Var2, q0n0.f27909a, lsm0Var2.a(R.string.test_palette, Arrays.copyOf(new Object[0], 0)), wui0.b, null, 24);
                if (l1q0Var != null) {
                    String strA5 = lsm0Var2.a(R.string.change_string_keys_enable, Arrays.copyOf(new Object[0], 0));
                    ovi0 ovi0Var3 = new ovi0(l1q0Var.B);
                    wui0 wui0Var5 = wui0.c;
                    v2n0.l(lc00Var2, z1n0.f43630a, strA5, wui0Var5, ovi0Var3, 16);
                    v2n0.l(lc00Var2, b2n0.f1861a, lsm0Var2.a(R.string.highlight_design_system_toggle, Arrays.copyOf(new Object[0], 0)), wui0Var5, new ovi0(l1q0Var.n), 16);
                    v2n0.l(lc00Var2, c2n0.f3634a, lsm0Var2.a(R.string.new_app_start_partner, Arrays.copyOf(new Object[0], 0)), wui0Var5, new ovi0(l1q0Var.s), 16);
                    v2n0.l(lc00Var2, a2n0.f132a, lsm0Var2.a(R.string.dynamic_theme_switching_enable_ui_model, Arrays.copyOf(new Object[0], 0)), wui0.d, new ovi0(l1q0Var.t), 16);
                }
            } else {
                if (o2n0Var.equals(f2n0Var)) {
                    if (l1q0Var != null) {
                        v2n0.j(lc00VarB, lsm0Var2.a(R.string.test_app_guid, Arrays.copyOf(new Object[0], 0)));
                        v2n0.m(lc00VarB, x0n0.f40078a, l1q0Var.j, lsm0Var2.a(R.string.app_guid, Arrays.copyOf(new Object[0], 0)), wui0.b, true);
                        v2n0.l(lc00VarB, f1n0.f8773a, lsm0Var2.a(R.string.fake_app_guid, Arrays.copyOf(new Object[0], 0)), wui0.d, new ovi0(l1q0Var.y), 16);
                    }
                } else if (o2n0Var.equals(k2n0Var)) {
                    if (l1q0Var != null) {
                        v2n0.j(lc00VarB, lsm0Var2.a(R.string.markets_and_events, Arrays.copyOf(new Object[0], 0)));
                        v2n0.l(lc00VarB, t1n0.f33175a, lsm0Var2.a(R.string.show_markets_numbers, Arrays.copyOf(new Object[0], 0)), wui0.b, new ovi0(l1q0Var.g), 16);
                        v2n0.l(lc00VarB, s1n0.f31466a, lsm0Var2.a(R.string.log_failed_event_params, Arrays.copyOf(new Object[0], 0)), wui0.d, new ovi0(l1q0Var.z), 16);
                    }
                } else if (o2n0Var.equals(l2n0Var)) {
                    if (l1q0Var != null) {
                        v2n0.j(lc00VarB, lsm0Var2.a(R.string.online_call, Arrays.copyOf(new Object[0], 0)));
                        v2n0.l(lc00VarB, v1n0.f36642a, lsm0Var2.a(R.string.sip_crm_test, Arrays.copyOf(new Object[0], 0)), wui0.b, new ovi0(l1q0Var.o), 16);
                        v2n0.l(lc00VarB, w1n0.f38411a, lsm0Var2.a(R.string.sip_crm_v2_test, Arrays.copyOf(new Object[0], 0)), wui0.d, new ovi0(l1q0Var.p), 16);
                    }
                } else if (o2n0Var.equals(g2n0Var)) {
                    if (l1q0Var != null) {
                        v2n0.j(lc00VarB, lsm0Var2.a(R.string.test_chose_country, Arrays.copyOf(new Object[0], 0)));
                        v2n0.n(lc00VarB, b1n0.f1815a, l1q0Var.l.b, lsm0Var2.a(R.string.test_country, Arrays.copyOf(new Object[0], 0)), f0n0.f8724a, lsm0Var2.a(R.string.clear_country, Arrays.copyOf(new Object[0], 0)), false, false, 448);
                    }
                } else if (o2n0Var.equals(n2n0Var)) {
                    if (l1q0Var != null) {
                        v2n0.j(lc00VarB, lsm0Var2.a(R.string.test_update, Arrays.copyOf(new Object[0], 0)));
                        lc00Var2 = lc00VarB;
                        v2n0.m(lc00Var2, d1n0.f5317a, str2, lsm0Var2.a(R.string.words, Arrays.copyOf(new Object[0], 0)), wui0.b, true);
                        v2n0.k(lc00Var2, y1n0.f41865a, lsm0Var2.a(R.string.fake_words, Arrays.copyOf(new Object[0], 0)), wui0.d, new ovi0(z), str2.length() > 0);
                    }
                } else if (o2n0Var.equals(j2n0Var)) {
                    v2n0.j(lc00VarB, lsm0Var2.a(R.string.test_coupon_generate, Arrays.copyOf(new Object[0], 0)));
                    lc00Var = lc00VarB;
                    v2n0.n(lc00Var, c1n0.f3581a, String.valueOf(i2), lsm0Var2.a(R.string.test_generate_coupon_size, Arrays.copyOf(new Object[0], 0)), e0n0.f6997a, lsm0Var2.a(R.string.test_generate, Arrays.copyOf(new Object[0], 0)), i2 >= 0 && i2 < 51, i2 > 50, 96);
                } else {
                    if (!o2n0Var.equals(h2n0Var)) {
                        t9f.b();
                        return null;
                    }
                    v2n0.j(lc00VarB, lsm0Var2.a(R.string.test_debug_console, Arrays.copyOf(new Object[0], 0)));
                    lc00Var = lc00VarB;
                    v2n0.l(lc00Var, o0n0.f24436a, lsm0Var2.a(R.string.test_debug_console_close, Arrays.copyOf(new Object[0], 0)), wui0.b, new nvi0(ljjVar == ljj.f20154a), 16);
                    v2n0.l(lc00Var, n0n0.f22708a, lsm0Var2.a(R.string.test_debug_console_analytics_events, Arrays.copyOf(new Object[0], 0)), wui0.d, new nvi0(ljjVar == ljj.b), 16);
                }
                lc00Var = lc00VarB;
            }
            lc00VarB = lc00Var2;
            lc00Var = lc00VarB;
        }
        return new u2n0(immVar, o2n0Var, dyb.o0(kotlin.collections.a.a(lc00Var)));
    }

    private final Object b(Object obj) {
        non0 non0Var = (non0) obj;
        non0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.swipex_bet_warning_title, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var.a(R.string.swipex_bet_warning_subtitle, Arrays.copyOf(new Object[0], 0));
        String strA3 = lsm0Var.a(R.string.no_ask_more, Arrays.copyOf(new Object[0], 0));
        yvl yvlVar = non0Var.b;
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        return new oon0(strA, strA2, strA3, yvlVar, new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(nul.e, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, true));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c4 A[PHI: r23 r24
  0x00c4: PHI (r23v3 java.util.Set) = (r23v1 java.util.Set), (r23v4 java.util.Set) binds: [B:26:0x00c2, B:23:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00c4: PHI (r24v3 java.util.List) = (r24v1 java.util.List), (r24v4 java.util.List) binds: [B:26:0x00c2, B:23:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object c(Object obj) {
        fvn0 dvn0Var;
        Object obj2;
        int i;
        Collection collectionC;
        String string;
        Set set;
        List list;
        gvn0 gvn0Var = (gvn0) obj;
        gvn0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        wrv wrvVar = new wrv(lsm0Var.a(R.string.filters, Arrays.copyOf(new Object[0], 0)));
        boolean z = gvn0Var.f11984a;
        mdm mdmVar = gvn0Var.h;
        if (z) {
            dvn0Var = new cvn0(mdmVar);
        } else if (gvn0Var.b) {
            dvn0Var = evn0.f8479a;
        } else {
            List list2 = gvn0Var.f;
            Set set2 = gvn0Var.g;
            List list3 = gvn0Var.e;
            i3q i3qVar = new i3q(lsm0Var.a(R.string.sport, Arrays.copyOf(new Object[0], 0)));
            i3q i3qVar2 = new i3q(lsm0Var.a(R.string.cyber_zone, Arrays.copyOf(new Object[0], 0)));
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hpn0 hpn0Var = (hpn0) it.next();
                Iterator it2 = it;
                long j = hpn0Var.c;
                long j2 = hpn0Var.f13452a;
                boolean z2 = j == -1;
                if (z2) {
                    j = j2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    long j3 = j;
                    epn0 epn0Var = (epn0) obj3;
                    if (z2) {
                        set = set2;
                        list = list3;
                        if (epn0Var.d == j3) {
                            arrayList2.add(obj3);
                        }
                    } else {
                        set = set2;
                        list = list3;
                        if (epn0Var.e == j3) {
                            arrayList2.add(obj3);
                        }
                    }
                    j = j3;
                    set2 = set;
                    list3 = list;
                }
                Set set3 = set2;
                List list4 = list3;
                Iterator it3 = set3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next = it3.next();
                    roo rooVar = (roo) next;
                    Iterator it4 = it3;
                    if (rooVar.f30849a == j2 && rooVar.b == hpn0Var.c) {
                        obj2 = next;
                        break;
                    }
                    it3 = it4;
                }
                boolean z3 = obj2 != null;
                int size = arrayList2.size();
                if (arrayList2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it5 = arrayList2.iterator();
                    int i2 = 0;
                    while (it5.hasNext()) {
                        if (((epn0) it5.next()).f && (i2 = i2 + 1) < 0) {
                            q3d.o();
                            throw null;
                        }
                    }
                    i = i2;
                }
                long j4 = hpn0Var.f13452a;
                String str = hpn0Var.d;
                if (str.length() == 0) {
                    str = hpn0Var.b;
                }
                String str2 = str;
                boolean z4 = hpn0Var.g;
                long j5 = hpn0Var.c;
                String str3 = hpn0Var.h;
                if (str3.length() == 0) {
                    if (j2 != 0) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j2, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    str3 = string;
                } else {
                    j5 = j5;
                }
                t3q t3qVar = new t3q(j4, str2, z4, j5, str3, z3, size, i, hpn0Var.f);
                if (z3) {
                    List listC = kotlin.collections.a.c(t3qVar);
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    for (Iterator it6 = arrayList2.iterator(); it6.hasNext(); it6 = it6) {
                        epn0 epn0Var2 = (epn0) it6.next();
                        epn0Var2.getClass();
                        arrayList3.add(new b3q(epn0Var2.f8198a, epn0Var2.d, epn0Var2.e, epn0Var2.b, epn0Var2.f));
                    }
                    collectionC = CollectionsKt.q0(listC, arrayList3);
                } else {
                    collectionC = kotlin.collections.a.c(t3qVar);
                }
                arrayList.add(collectionC);
                it = it2;
                set2 = set3;
                list3 = list4;
            }
            ArrayList arrayList4 = new ArrayList(r3d.r(arrayList));
            Iterator it7 = arrayList4.iterator();
            int i3 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i3 = -1;
                    break;
                }
                p6t0 p6t0Var = (p6t0) it7.next();
                t3q t3qVar2 = p6t0Var instanceof t3q ? (t3q) p6t0Var : null;
                if (t3qVar2 != null && t3qVar2.c) {
                    break;
                }
                i3++;
            }
            Object objFirstOrNull = CollectionsKt.firstOrNull(arrayList4);
            t3q t3qVar3 = objFirstOrNull instanceof t3q ? (t3q) objFirstOrNull : null;
            if (t3qVar3 != null && !t3qVar3.c) {
                arrayList4.add(0, i3qVar);
            }
            if (i3 >= 0) {
                arrayList4.add(i3 + 1, i3qVar2);
            }
            a4x a4xVarO0 = dyb.o0(arrayList4);
            dvn0Var = !a4xVarO0.isEmpty() ? new dvn0(new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.Z))), a4xVarO0, gvn0Var.d) : new cvn0(mdmVar);
        }
        return new pvn0(wrvVar, dvn0Var);
    }

    private final Object g(Object obj) {
        ee eeVar;
        vxn0 vxn0Var = (vxn0) obj;
        vxn0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        he heVar = vxn0Var.m;
        int iOrdinal = heVar.ordinal();
        boolean z = iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 3 || iOrdinal == 4;
        a4x a4xVar = vxn0Var.f38209a;
        a4x a4xVar2 = vxn0Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(a4xVar2, 10));
        Iterator<E> it = a4xVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(((g5l0) it.next()).c);
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        boolean z2 = vxn0Var.d;
        boolean z3 = vxn0Var.e;
        boolean z4 = vxn0Var.c;
        boolean z5 = vxn0Var.f;
        boolean z6 = vxn0Var.g;
        boolean z7 = vxn0Var.h;
        ksn0 ksn0Var = new ksn0(vxn0Var.i, vxn0Var.j, vxn0Var.k, vxn0Var.l);
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.swipex, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackground(), z, null);
        int iOrdinal2 = heVar.ordinal();
        if (iOrdinal2 == 0) {
            eeVar = yd.f42407a;
        } else if (iOrdinal2 == 1) {
            eeVar = be.f2424a;
        } else if (iOrdinal2 == 2) {
            eeVar = de.f5922a;
        } else if (iOrdinal2 == 3) {
            eeVar = zd.f44189a;
        } else if (iOrdinal2 == 4) {
            eeVar = ae.f704a;
        } else {
            if (iOrdinal2 != 5) {
                t9f.b();
                return null;
            }
            eeVar = ce.f4189a;
        }
        return new wxn0(a4xVar, a4xVarO0, z2, z3, z4, z5, z7, z6, immVar, eeVar, new rd(null, null, z ? new y3d(s6t0.b().f33626a.getBackgroundContent()) : null), lsm0Var.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)), ksn0Var);
    }

    private final Object h(Object obj) {
        uxo0 uxo0Var = (uxo0) obj;
        uxo0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        bop0 bop0Var = uxo0Var.f36451a;
        bop0 bop0Var2 = bop0.FIRST;
        if (bop0Var == bop0Var2) {
            bop0Var2 = bop0.SECOND;
        }
        Object[] objArr = {Integer.valueOf(bop0Var2.f2946a)};
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.move_to_team_new_v2, Arrays.copyOf(objArr, 1));
        pz40 pz40Var = s6t0.f31722a;
        pxo0 pxo0Var = new pxo0(bop0Var2, new rqm((vui0) new tui0(strA, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) new oui0((Integer) null, (y3d) null, new m0x(R.drawable.ic_replace, null, 6), new y3d(s6t0.b().f33626a.getSecondary()), 19), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508));
        bop0 bop0Var3 = bop0.UNDEFINED;
        String strA2 = lsm0Var.a(R.string.remove, Arrays.copyOf(new Object[0], 0));
        StaticColors staticColors = StaticColors.INSTANCE;
        return new vxo0(dyb.g0(pxo0Var, new pxo0(bop0Var3, new rqm((vui0) new tui0(strA2, new y3d(staticColors.m113getRed0d7_KjU())), (pui0) new oui0((Integer) null, (y3d) null, new m0x(R.drawable.ic_delete_basket_new, null, 6), new y3d(staticColors.m113getRed0d7_KjU()), 19), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508))));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object i(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    private final Object l(Object obj) {
        rqm rqmVarG;
        fjp0 fjp0Var = (fjp0) obj;
        fjp0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        ArrayList<bop0> arrayList = fjp0Var.f9655a;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (bop0 bop0Var : arrayList) {
            int iOrdinal = bop0Var.ordinal();
            if (iOrdinal == 0) {
                rqmVarG = a4n0.g(R.string.add_to_first_team, R.drawable.ic_first_team, ctf0Var);
            } else if (iOrdinal == 1) {
                rqmVarG = a4n0.g(R.string.add_to_second_team, R.drawable.ic_second_team, ctf0Var);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                String strA = ctf0Var.b.a(R.string.remove, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                rqmVarG = new rqm((vui0) new tui0(strA, new y3d(staticColors.m113getRed0d7_KjU())), (pui0) new oui0((Integer) null, (y3d) null, new m0x(R.drawable.ic_glyph_trash, null, 6), new y3d(staticColors.m113getRed0d7_KjU()), 19), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
            }
            arrayList2.add(new kjp0(bop0Var, rqmVarG));
        }
        return new gjp0(dyb.o0(arrayList2));
    }

    private final Object m(Object obj) {
        ((zvp0) obj).getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.telegram_accounts_not_match_title, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var.a(R.string.telegram_accounts_not_match_description, Arrays.copyOf(new Object[0], 0));
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        return new awp0(strA, strA2, new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.telegram_change_account, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.telegram_pair_current_account, Arrays.copyOf(new Object[0], 0))), true, false, true));
    }

    private final Object o(Object obj) {
        nyp0 nyp0Var = (nyp0) obj;
        nyp0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        TennisSummaryFilterModel tennisSummaryFilterModel = nyp0Var.f24340a;
        TennisSummaryFilterModel tennisSummaryFilterModel2 = nyp0Var.b;
        return new oyp0(l7x.e0(ctf0Var, tennisSummaryFilterModel2.f47097a), ghm0.s(tennisSummaryFilterModel2.b, ctf0Var), !Intrinsics.d(tennisSummaryFilterModel, tennisSummaryFilterModel2), !Intrinsics.d(tennisSummaryFilterModel2, nyp0Var.c));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    private final Object p(Object obj) {
        v5l0 v5l0Var;
        lsm0 lsm0Var;
        w4r0 w4r0Var;
        boolean z;
        a2n x56Var;
        int iOrdinal;
        l0l0 l0l0Var;
        z4r0 x4r0Var;
        w4r0 w4r0Var2;
        Object next;
        h5r0 h5r0Var = (h5r0) obj;
        h5r0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA = lsm0Var2.a(R.string.top_games_by_stat_title, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var2.a(R.string.top_games_by_stat_description, Arrays.copyOf(new Object[0], 0));
        boolean z2 = h5r0Var.c;
        d0t d0tVar = h5r0Var.b;
        w4r0 w4r0Var3 = h5r0Var.f12496a;
        if (z2) {
            x4r0Var = new y4r0(h5r0Var.d);
            w4r0Var2 = w4r0Var3;
            lsm0Var = lsm0Var2;
            z = true;
        } else {
            if (w4r0Var3 == null || (v5l0Var = w4r0Var3.f38556a) == null) {
                v5l0Var = v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO;
            }
            if (w4r0Var3 != null) {
                List list = w4r0Var3.g;
                if (d0tVar != null) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((lok0) next).f20396a != d0tVar.O);
                    lok0 lok0Var = (lok0) next;
                    y78 y78Var = w4r0Var3.e;
                    boolean z3 = w4r0Var3.c;
                    boolean z4 = w4r0Var3.b;
                    String strA3 = w4r0Var3.f.a(d0tVar.v, d0tVar.u);
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                    }
                    boolean z5 = lok0Var != null ? lok0Var.n : false;
                    boolean z6 = lok0Var != null ? lok0Var.p : false;
                    v5l0 v5l0Var2 = w4r0Var3.f38556a;
                    m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
                    String str = lok0Var != null ? lok0Var.u : null;
                    if (str == null) {
                        str = "";
                    }
                    w4r0Var = w4r0Var3;
                    lsm0Var = lsm0Var2;
                    z = true;
                    x56Var = wwb.V(d0tVar, ctf0Var, y78Var, z3, z4, strA3, false, arrayList, z5, z6, false, v5l0Var2, m5l0Var, str, w4r0Var3.d);
                } else {
                    lsm0Var = lsm0Var2;
                    w4r0Var = w4r0Var3;
                    z = true;
                    iOrdinal = v5l0Var.ordinal();
                    if (iOrdinal != 0) {
                        l0l0Var = g0l0.f10465a;
                    } else if (iOrdinal != 1) {
                        l0l0Var = k0l0.f17474a;
                    } else if (iOrdinal != 2) {
                        l0l0Var = j0l0.f15687a;
                    } else if (iOrdinal != 3) {
                        l0l0Var = i0l0.f13953a;
                    } else {
                        if (iOrdinal == 4) {
                            t9f.b();
                            return null;
                        }
                        l0l0Var = h0l0.f12241a;
                    }
                    x56Var = new x56(l0l0Var);
                }
            } else {
                lsm0Var = lsm0Var2;
                w4r0Var = w4r0Var3;
                z = true;
                iOrdinal = v5l0Var.ordinal();
                if (iOrdinal != 0) {
                    l0l0Var = g0l0.f10465a;
                } else if (iOrdinal != 1) {
                    l0l0Var = k0l0.f17474a;
                } else if (iOrdinal != 2) {
                    l0l0Var = j0l0.f15687a;
                } else if (iOrdinal != 3) {
                    l0l0Var = i0l0.f13953a;
                } else {
                    if (iOrdinal == 4) {
                        t9f.b();
                        return null;
                    }
                    l0l0Var = h0l0.f12241a;
                }
                x56Var = new x56(l0l0Var);
            }
            x4r0Var = new x4r0(x56Var);
            w4r0Var2 = w4r0Var;
        }
        return new i5r0(strA, strA2, x4r0Var, w4r0Var2 != null ? w4r0Var2.d : false, new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.top_games_by_stat_go_to_event, Arrays.copyOf(new Object[0], 0))), d0tVar != null ? z : false, false, false));
    }

    private final Object r(Object obj) {
        dbr0 dbr0Var = (dbr0) obj;
        dbr0Var.getClass();
        return new b09(dbr0Var, this.b);
    }

    private final Object s(Object obj) {
        long secondary;
        bmr0 bmr0Var = (bmr0) obj;
        bmr0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = bmr0Var.f2851a;
        List<lmr0> list = bmr0Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (lmr0 lmr0Var : list) {
            int i = lmr0Var.f20312a;
            ulr0 ulr0Var = lmr0Var.c;
            Integer numValueOf = Integer.valueOf(afn0.n(ulr0Var));
            m0x m0xVar = new m0x(afn0.n(ulr0Var), null, 6);
            boolean z = lmr0Var.d;
            if (z) {
                pz40 pz40Var = s6t0.f31722a;
                secondary = s6t0.b().f33626a.getPrimary();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                secondary = s6t0.b().f33626a.getSecondary();
            }
            oui0 oui0Var = new oui0(numValueOf, (y3d) null, m0xVar, new y3d(secondary), 18);
            ulr0 ulr0Var2 = ulr0.TOTO_1XTOTO;
            String str2 = lmr0Var.b;
            arrayList.add(new hmr0(i, new rqm(ulr0Var == ulr0Var2 ? new rui0(str2, null, ctf0Var.b.a(R.string.free_toto_history, Arrays.copyOf(new Object[0], 0)), new y3d(StaticColors.INSTANCE.m98getGreen0d7_KjU()), 50) : new tui0(str2, null), (pui0) oui0Var, (pvi0) new nvi0(z), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT)));
        }
        return new cmr0(dyb.r0(arrayList), str);
    }

    private final Object t(Object obj) {
        ftr0 ftr0Var = (ftr0) obj;
        ftr0Var.getClass();
        return new n5j(ftr0Var, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v7 */
    private final Object u(Object obj) {
        evq0 evq0Var;
        int i;
        ztr0 ztr0Var = (ztr0) obj;
        ztr0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        qul qulVar = qul.e;
        oe9 oe9Var = oe9.f25112a;
        int i2 = 0;
        lsm0 lsm0Var = ctf0Var.b;
        itl itlVar = new itl(new wul(qulVar, oe9Var, new ve9(lsm0Var.a(R.string.select_all, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_checkmark), true, false, false), otr0.b);
        lul lulVar = lul.e;
        String strA = lsm0Var.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0));
        int i3 = ztr0Var.d;
        int i4 = 1;
        String strConcat = Separators.SP.concat(lsm0Var.a(R.string.line_live_counter, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
        if (i3 <= 0) {
            strConcat = null;
        }
        if (strConcat == null) {
            strConcat = "";
        }
        mtl mtlVar = new mtl(dyb.g0(itlVar, new itl(new wul(lulVar, oe9Var, new ue9(strA.concat(strConcat)), i3 > 0, false, false), otr0.f25843a)));
        me80 me80Var = new me80(lsm0Var.a(R.string.toto_accurate_toolbar_title, Arrays.copyOf(new Object[0], 0)), i3 > 0);
        he80 he80Var = ztr0Var.f44976a;
        List list = ztr0Var.b;
        int i5 = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd80 vd80Var = (vd80) it.next();
            int iOrdinal = vd80Var.f37219a.ordinal();
            if (iOrdinal == 0) {
                evq0Var = evq0.f8484a;
            } else if (iOrdinal == i4) {
                evq0Var = evq0.b;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                evq0Var = evq0.c;
            }
            yvl yvlVar = new yvl(evq0Var, (boolean) i2, 6);
            int iOrdinal2 = vd80Var.b.ordinal();
            if (iOrdinal2 == 0) {
                i = R.string.win_first;
            } else if (iOrdinal2 == i4) {
                i = R.string.draw;
            } else {
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return null;
                }
                i = R.string.win_second;
            }
            String strA2 = lsm0Var.a(i, Arrays.copyOf(new Object[i2], i2));
            List list2 = vd80Var.d;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i5));
            Iterator it2 = list2.iterator();
            int i6 = i2;
            int i7 = i2;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i8 = i6 + 1;
                if (i6 < 0) {
                    q3d.p();
                    throw null;
                }
                ntr0 ntr0Var = (ntr0) next;
                ntr0Var.getClass();
                Iterator it3 = it;
                Iterator it4 = it2;
                arrayList2.add(new lxl(i6, (dyl) new xxl(lsm0Var.a(qxw.C(ntr0Var.f24114a), Arrays.copyOf(new Object[0], 0))), false, ntr0Var.b ? uxl.b : uxl.f36445a, (cwl) null, 108));
                i7 = 0;
                i6 = i8;
                it = it3;
                it2 = it4;
            }
            arrayList.add(new fe80(yvlVar, strA2, dyb.r0(arrayList2)));
            it = it;
            i5 = 10;
            i4 = 1;
            i2 = i7;
        }
        return new aur0(me80Var, he80Var, dyb.r0(arrayList), mtlVar);
    }

    private final Object v(Object obj) {
        a4s0 a4s0Var = (a4s0) obj;
        a4s0Var.getClass();
        return new ej1(a4s0Var, this.b);
    }

    private final Object w(Object obj) {
        e6s0 e6s0Var = (e6s0) obj;
        e6s0Var.getClass();
        return new p92(e6s0Var, this.b);
    }

    private final Object x(Object obj) {
        e7s0 e7s0Var = (e7s0) obj;
        e7s0Var.getClass();
        return new rw(e7s0Var, this.b);
    }

    private final Object y(Object obj) {
        sas0 sas0Var = (sas0) obj;
        sas0Var.getClass();
        return new b09(sas0Var, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0452  */
    /* JADX WARN: Code duplicated, block: B:207:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:423:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:430:0x0c86  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        String str;
        boolean z;
        int i3;
        a4x a4xVarO0;
        int i4;
        Pair pair;
        String strL;
        int i5;
        String strA;
        int i6;
        boolean z2;
        a4x a4xVarO1;
        boolean z3;
        boolean z4;
        Pair pair2;
        String strL2;
        int i7;
        String strA2;
        int i8;
        int i9;
        byte b = this.f12238a;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                ((f0j0) obj).getClass();
                return new m72(ctf0Var, (byte) 15);
            case 1:
                s6j0 s6j0Var = (s6j0) obj;
                s6j0Var.getClass();
                ctf0Var.getClass();
                pz40 pz40Var = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                lsm0 lsm0Var = ctf0Var.b;
                imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.pin_code_and_biometric_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, new y3d(s6t0.b().f33626a.getSeparator60()));
                tui0 tui0Var = new tui0(lsm0Var.a(R.string.activate_pin_code, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary()));
                boolean z5 = s6j0Var.f31706a;
                return new t6j0(immVar, new rqm((vui0) tui0Var, (pui0) null, (pvi0) new ovi0(z5), (d4d) null, (tvi0) null, wui0.b, false, (e900) null, 442), new rqm(new tui0(lsm0Var.a(R.string.change_pin_code, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0.d, s6j0Var.f31706a, (e900) null, 318), new rqm(new tui0(lsm0Var.a(R.string.use_finger_print, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, new ovi0(s6j0Var.b), (d4d) null, (tvi0) null, wui0.f39793a, s6j0Var.c && z5, (e900) null, 314), lsm0Var.a(R.string.pin_code_info, Arrays.copyOf(new Object[0], 0)), s6j0Var.c);
            case 2:
                tcj0 tcj0Var = (tcj0) obj;
                tcj0Var.getClass();
                boolean z6 = tcj0Var.c;
                ctf0Var.getClass();
                boolean zC = cy7.c();
                String str2 = tcj0Var.e;
                String str3 = tcj0Var.f;
                int i10 = tcj0Var.P;
                boolean z7 = tcj0Var.c;
                zsv zsvVar = new zsv(i10, str2, str3, z7, false);
                vg vgVar = new vg(tcj0Var.h, tcj0Var.i, z7, !tcj0Var.q, !tcj0Var.r, tcj0Var.j);
                sff0 sff0Var = tcj0Var.H;
                v8d v8dVar = tcj0Var.I;
                k0j0 k0j0Var = tcj0Var.J;
                boolean z8 = tcj0Var.K;
                String str4 = tcj0Var.L;
                int i11 = tcj0Var.M;
                boolean z9 = tcj0Var.O;
                co4 co4Var = sff0Var.N;
                boolean z10 = co4Var.g;
                if (tcj0Var.b) {
                    lsm0 lsm0Var2 = ctf0Var.b;
                    a4xVarO0 = dyb.o0(q3d.j(new ewi0(R.drawable.ic_glyph_authenticator, vdx.M(), lsm0Var2.a(R.string.account_title, Arrays.copyOf(new Object[0], 0))), new ewi0(R.drawable.ic_glyph_personalization, vdx.M(), lsm0Var2.a(R.string.personalization_title, Arrays.copyOf(new Object[0], 0))), new ewi0(R.drawable.ic_glyph_settings_other, vdx.M(), lsm0Var2.a(R.string.other_title, Arrays.copyOf(new Object[0], 0)))));
                } else {
                    lsm0 lsm0Var3 = ctf0Var.b;
                    String strA3 = lsm0Var3.a(R.string.account_title, Arrays.copyOf(new Object[0], 0));
                    lc00 lc00VarB = kotlin.collections.a.b();
                    x6j0 x6j0Var = sff0Var.e;
                    boolean z11 = !z7 || (z7 && tcj0Var.v);
                    if (tcj0Var.z) {
                        lc00VarB.add(new hzi0(lsm0Var3.a(R.string.wrong_time_settings_subtitle, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.wrong_time_settings_title, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (z7 && !z8) {
                        boolean z12 = sff0Var.r0;
                        boolean z13 = tcj0Var.p;
                        if (z12) {
                            boolean z14 = !z13;
                            lc00VarB.add(new ahj0(lsm0Var3.a(R.string.verification, Arrays.copyOf(new Object[0], 0)), z13 ? lsm0Var3.a(R.string.verification_completed, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.verification_not_completed, Arrays.copyOf(new Object[0], 0)), z13 ? i8m0.CHECK : i8m0.WARNING_RED, z14, z14));
                        }
                    }
                    boolean z15 = tcj0Var.V;
                    boolean z16 = tcj0Var.m;
                    mrh0 mrh0Var = tcj0Var.n;
                    lc00VarB.add(new n8j0(lsm0Var3.a(R.string.pin_code_and_biometric_title, Arrays.copyOf(new Object[0], 0))));
                    if (z15 && !z8) {
                        lc00VarB.add(new zgj0(lsm0Var3.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), z16 ? lsm0Var3.a(R.string.authenticator_enabled, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.authenticator_not_enabled, Arrays.copyOf(new Object[0], 0)), z16 ? i8m0.CHECK : i8m0.CROSS));
                    }
                    if (z8) {
                        i = 0;
                    } else {
                        if (z7) {
                            i5 = 0;
                            strA = lsm0Var3.a(d9x.M(mrh0Var), Arrays.copyOf(new Object[0], 0));
                        } else {
                            strA = "";
                            i5 = 0;
                        }
                        lc00VarB.add(new dhj0(lsm0Var3.a(R.string.security_settings, Arrays.copyOf(new Object[i5], i5)), strA, d9x.Y(mrh0Var), z7));
                        i = 0;
                        String strA4 = lsm0Var3.a(R.string.settings_auth_history, Arrays.copyOf(new Object[0], 0));
                        i8m0 i8m0Var = i8m0.CHECK;
                        lc00VarB.add(new ygj0(strA4, z7));
                    }
                    if (z7 && z10) {
                        lc00VarB.add(new ydj0(lsm0Var3.a(R.string.qr_authorization_title, Arrays.copyOf(new Object[i], i)), tcj0Var.t));
                    }
                    if (z11 && z10) {
                        i2 = 0;
                        lc00VarB.add(new r8j0(lsm0Var3.a(R.string.qr_unauthorized, Arrays.copyOf(new Object[0], 0))));
                    } else {
                        i2 = 0;
                    }
                    if (z7) {
                        lc00VarB.add(new dy00(lsm0Var3.a(R.string.logout_title, Arrays.copyOf(new Object[i2], i2))));
                        if (tcj0Var.A) {
                            lc00VarB.add(new f4k(lsm0Var3.a(R.string.delete_account_title, Arrays.copyOf(new Object[i2], i2))));
                        }
                    }
                    ewi0 ewi0Var = new ewi0(R.drawable.ic_glyph_authenticator, dyb.o0(kotlin.collections.a.a(lc00VarB)), strA3);
                    int i12 = 0;
                    String strA5 = lsm0Var3.a(R.string.personalization_title, Arrays.copyOf(new Object[0], 0));
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    if (z8) {
                        str = "";
                    } else {
                        baj0 baj0Var = tcj0Var.o;
                        lc00VarB2.add(new o8j0(lsm0Var3.a(R.string.make_bet_settings_title, Arrays.copyOf(new Object[0], 0)), z6));
                        if (baj0Var != null) {
                            double d = baj0Var.f2260a;
                            boolean z17 = d > 0.0d && baj0Var.c;
                            pn40 pn40Var = pn40.f27267a;
                            str = "";
                            String strC = pn40.c(d, p3u0.c);
                            if (z17) {
                                strL = kng0.l(strC, Separators.SP, baj0Var.b);
                            }
                            i12 = 0;
                            String strA6 = lsm0Var3.a(R.string.one_click_bet_title, Arrays.copyOf(new Object[0], 0));
                            i8m0 i8m0Var2 = i8m0.CHECK;
                            lc00VarB2.add(new bhj0(strA6, strL, z6));
                        } else {
                            str = "";
                        }
                        strL = str;
                        i12 = 0;
                        String strA7 = lsm0Var3.a(R.string.one_click_bet_title, Arrays.copyOf(new Object[0], 0));
                        i8m0 i8m0Var3 = i8m0.CHECK;
                        lc00VarB2.add(new bhj0(strA7, strL, z6));
                    }
                    lc00VarB2.add(new xhj0(lsm0Var3.a(R.string.coefficient_type, Arrays.copyOf(new Object[i12], i12)), lsm0Var3.a(i11, Arrays.copyOf(new Object[i12], i12))));
                    if (!z8) {
                        lc00VarB2.add(new q8j0(lsm0Var3.a(R.string.push_notifications, Arrays.copyOf(new Object[i12], i12))));
                    }
                    if (!z8) {
                        lc00VarB2.add(new j8j0(lsm0Var3.a(R.string.mailing_management_title, Arrays.copyOf(new Object[i12], i12)), z6));
                    }
                    if (v8dVar.d.size() > 1) {
                        lc00VarB2.add(new l8j0(lsm0Var3.a(R.string.theme_choose_title, Arrays.copyOf(new Object[i12], i12))));
                    }
                    lc00VarB2.add(new k8j0(lsm0Var3.a(R.string.markets_display, Arrays.copyOf(new Object[i12], i12))));
                    if (sff0Var.L.f) {
                        lc00VarB2.add(new p8j0(lsm0Var3.a(R.string.popular_settings_title_name, Arrays.copyOf(new Object[i12], i12))));
                    }
                    if (x6j0Var.f && !z8) {
                        lc00VarB2.add(new s8j0(lsm0Var3.a(R.string.shake_settings_title, Arrays.copyOf(new Object[i12], i12))));
                    }
                    if (v8dVar.w) {
                        lc00VarB2.add(new y8j0(lsm0Var3.a(R.string.widget, Arrays.copyOf(new Object[i12], i12))));
                    }
                    lc00VarB2.add(new i8j0(lsm0Var3.a(R.string.language_settings, Arrays.copyOf(new Object[i12], i12))));
                    ewi0 ewi0Var2 = new ewi0(R.drawable.ic_glyph_personalization, dyb.o0(kotlin.collections.a.a(lc00VarB2)), strA5);
                    String strA8 = lsm0Var3.a(R.string.other_title, Arrays.copyOf(new Object[i12], i12));
                    lc00 lc00VarB3 = kotlin.collections.a.b();
                    if (z8) {
                        z = true;
                    } else {
                        j6d0 j6d0Var = tcj0Var.k;
                        boolean z18 = tcj0Var.u;
                        boolean z19 = sff0Var.n;
                        boolean z20 = co4Var.i;
                        f3c0 f3c0Var = sff0Var.k;
                        boolean z21 = f3c0Var.h && !f3c0Var.r && z7;
                        boolean z22 = sff0Var.O.length() > 0;
                        if (z19 || z10 || z20 || z21) {
                            if (z19) {
                                lc00VarB3.add(new e8j0(lsm0Var3.a(z22 ? R.string.official_site : R.string.working_mirror, Arrays.copyOf(new Object[0], 0))));
                            }
                            if (z20) {
                                if (j6d0Var != null) {
                                    String str5 = j6d0Var.c;
                                    if (!j6d0Var.f15979a || StringsKt.W(str5)) {
                                        pair = new Pair(str, i8m0.CROSS);
                                    } else {
                                        int i13 = j6d0Var.d;
                                        pair = new Pair(str5.concat(i13 > 0 ? twn.m(i13, Separators.COLON) : str), i8m0.CHECK);
                                    }
                                } else {
                                    pair = new Pair(str, i8m0.CROSS);
                                }
                                String str6 = (String) pair.f46059a;
                                i8m0 i8m0Var4 = (i8m0) pair.b;
                                i4 = 0;
                                lc00VarB3.add(new chj0(lsm0Var3.a(R.string.proxy_settings_title, Arrays.copyOf(new Object[0], 0)), str6, i8m0Var4));
                            } else {
                                i4 = 0;
                            }
                            if (z21) {
                                lc00VarB3.add(new v8j0(lsm0Var3.a(R.string.social_networks, Arrays.copyOf(new Object[i4], i4))));
                            }
                            if (z9) {
                                z = true;
                                lc00VarB3.add(new xdj0(z18, true, lsm0Var3.a(R.string.show_currency_conversion_popup, Arrays.copyOf(new Object[i4], i4)), R.drawable.ic_glyph_conversion));
                            } else {
                                z = true;
                            }
                        } else {
                            z = true;
                        }
                    }
                    boolean z23 = tcj0Var.w;
                    boolean z24 = tcj0Var.l;
                    String str7 = tcj0Var.x;
                    boolean z25 = tcj0Var.y;
                    boolean z26 = x6j0Var.f40367a;
                    boolean z27 = x6j0Var.b;
                    if (!sff0Var.z || k0j0Var.d.isEmpty()) {
                        z = false;
                    }
                    if (z8) {
                        i3 = 0;
                    } else {
                        if (z26) {
                            lc00VarB3.add(new u8j0(lsm0Var3.a(R.string.share_app_title, Arrays.copyOf(new Object[0], 0)), z23, z23));
                        }
                        if (z27) {
                            i3 = 0;
                            lc00VarB3.add(new t8j0(lsm0Var3.a(R.string.share_app_by_qr_title, Arrays.copyOf(new Object[0], 0))));
                        } else {
                            i3 = 0;
                        }
                        if (z) {
                            lc00VarB3.add(new m8j0(lsm0Var3.a(R.string.onoboarding_section_title, Arrays.copyOf(new Object[i3], i3))));
                        }
                    }
                    lc00VarB3.add(new pzi0(lsm0Var3.a(R.string.app_version_title, Arrays.copyOf(new Object[i3], i3)), str4, lsm0Var3.a(z24 ? R.string.update_app_button : R.string.updated, Arrays.copyOf(new Object[i3], i3)), z24 ? d4d.PRIMARY : d4d.SECONDARY, z24));
                    lc00VarB3.add(new f8j0(lsm0Var3.a(R.string.clear_cache_title, Arrays.copyOf(new Object[i3], i3)), str7, z25));
                    a4xVarO0 = dyb.o0(q3d.j(ewi0Var, ewi0Var2, new ewi0(R.drawable.ic_glyph_settings_other, dyb.o0(kotlin.collections.a.a(lc00VarB3)), strA8)));
                }
                a4x a4xVar = a4xVarO0;
                boolean z28 = tcj0Var.B;
                s9m0 s9m0Var = aoo0.f1212a;
                String str8 = sff0Var.g.n.f739a;
                s9m0Var.getClass();
                return new ucj0(zC, zsvVar, vgVar, a4xVar, z28, s9m0.g(str8));
            case 3:
                pfj0 pfj0Var = (pfj0) obj;
                pfj0Var.getClass();
                boolean z29 = pfj0Var.c;
                ctf0Var.getClass();
                zsv zsvVar2 = new zsv(R.drawable.ic_glyph_edit, pfj0Var.e, pfj0Var.f, pfj0Var.c, true);
                boolean z30 = pfj0Var.f26909a;
                sff0 sff0Var2 = pfj0Var.G;
                v8d v8dVar2 = pfj0Var.H;
                k0j0 k0j0Var2 = pfj0Var.I;
                boolean z31 = pfj0Var.J;
                String str9 = pfj0Var.K;
                int i14 = pfj0Var.L;
                boolean z32 = pfj0Var.N;
                if (pfj0Var.b) {
                    a4xVarO1 = dyb.o0(q3d.j(new wev0(), new aaj0(true, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, true, false), new aaj0(true, false, true), new aaj0(false, true, false), new aaj0(true, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, true, false), new aaj0(true, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, false, false), new aaj0(false, false, true), new aaj0(false, false, false), new aaj0(false, true, false)));
                    zsvVar2 = zsvVar2;
                    z30 = z30;
                } else {
                    lc00 lc00VarB4 = kotlin.collections.a.b();
                    boolean z33 = pfj0Var.y;
                    jph0 jph0Var = pfj0Var.m;
                    int i15 = jph0Var.c;
                    Map map = jph0Var.d;
                    if (z33) {
                        lsm0 lsm0Var4 = ctf0Var.b;
                        lc00VarB4.add(new hzi0(lsm0Var4.a(R.string.wrong_time_settings_subtitle, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.wrong_time_settings_title, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (z29) {
                        String str10 = pfj0Var.g;
                        String str11 = pfj0Var.h;
                        String str12 = pfj0Var.i;
                        boolean z34 = pfj0Var.p;
                        boolean z35 = pfj0Var.q;
                        if (map.isEmpty()) {
                            i8 = 0;
                        } else {
                            Iterator it = map.entrySet().iterator();
                            i8 = 0;
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    i8++;
                                }
                            }
                        }
                        int size = map.size();
                        mrh0.f22272a.getClass();
                        mrh0 mrh0VarI = cge0.i(i15);
                        yg ygVar = new yg(str10, str11, str12, !z34, !z35);
                        int iOrdinal = mrh0VarI.ordinal();
                        if (iOrdinal == 0) {
                            i9 = R.string.empty_str;
                        } else if (iOrdinal == 1) {
                            i9 = R.string.security_level_title_low_new;
                        } else if (iOrdinal == 2) {
                            i9 = R.string.low_security_level;
                        } else if (iOrdinal == 3) {
                            i9 = R.string.medium_security_level;
                        } else {
                            if (iOrdinal != 4) {
                                t9f.b();
                                return null;
                            }
                            i9 = R.string.security_level_title_high_new;
                        }
                        lsm0 lsm0Var5 = ctf0Var.b;
                        lc00VarB4.add(new qfj0(ygVar, new ksh0(i8, size, lsm0Var5.a(i9, Arrays.copyOf(new Object[0], 0)), lsm0Var5.a(R.string.security_settings, Arrays.copyOf(new Object[0], 0)), mrh0VarI != mrh0.b)));
                    }
                    if (z29 && !z31) {
                        boolean z36 = sff0Var2.r0;
                        boolean z37 = pfj0Var.o;
                        if (z36) {
                            if (z37) {
                                i7 = 0;
                                strA2 = ctf0Var.b.a(R.string.verification_completed, Arrays.copyOf(new Object[0], 0));
                            } else {
                                i7 = 0;
                                strA2 = ctf0Var.b.a(R.string.verification_not_completed, Arrays.copyOf(new Object[0], 0));
                            }
                            boolean z38 = !z37;
                            lc00VarB4.add(new sgj0(ctf0Var.b.a(R.string.verification, Arrays.copyOf(new Object[i7], i7)), strA2, z37 ? i8m0.CHECK : i8m0.WARNING_RED, z38, z38, true, true));
                        }
                    }
                    x6j0 x6j0Var2 = sff0Var2.e;
                    if (x6j0Var2.e) {
                        mrh0.f22272a.getClass();
                        cge0.i(i15);
                        boolean z39 = pfj0Var.R;
                        boolean z40 = pfj0Var.l;
                        lsm0 lsm0Var6 = ctf0Var.b;
                        lc00VarB4.add(new p7j0(lsm0Var6.a(R.string.pin_code_and_biometric_title, Arrays.copyOf(new Object[0], 0)), true, false));
                        if (z39 && !z31) {
                            lc00VarB4.add(new rgj0(lsm0Var6.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), z40 ? lsm0Var6.a(R.string.authenticator_enabled, Arrays.copyOf(new Object[0], 0)) : lsm0Var6.a(R.string.authenticator_not_enabled, Arrays.copyOf(new Object[0], 0)), z40 ? i8m0.CHECK : i8m0.CROSS, true, true));
                        }
                        if (!z31) {
                            String strA9 = lsm0Var6.a(R.string.settings_auth_history, Arrays.copyOf(new Object[0], 0));
                            i8m0 i8m0Var5 = i8m0.CHECK;
                            lc00VarB4.add(new qgj0(strA9, z29, true));
                        }
                    }
                    if (z31) {
                        i6 = 0;
                    } else {
                        baj0 baj0Var2 = pfj0Var.n;
                        lsm0 lsm0Var7 = ctf0Var.b;
                        lc00VarB4.add(new q7j0(lsm0Var7.a(R.string.make_bet_settings_title, Arrays.copyOf(new Object[0], 0)), z29, true));
                        if (baj0Var2 != null) {
                            double d2 = baj0Var2.f2260a;
                            boolean z41 = d2 > 0.0d && baj0Var2.c;
                            pn40 pn40Var2 = pn40.f27267a;
                            String strC2 = pn40.c(d2, p3u0.c);
                            if (z41) {
                                strL2 = kng0.l(strC2, Separators.SP, baj0Var2.b);
                            } else {
                                strL2 = "";
                            }
                        } else {
                            strL2 = "";
                        }
                        i6 = 0;
                        String strA10 = lsm0Var7.a(R.string.one_click_bet_title, Arrays.copyOf(new Object[0], 0));
                        i8m0 i8m0Var6 = i8m0.CHECK;
                        lc00VarB4.add(new tgj0(strA10, strL2, z29));
                    }
                    lsm0 lsm0Var8 = ctf0Var.b;
                    lc00VarB4.add(new vhj0(lsm0Var8.a(R.string.coefficient_type, Arrays.copyOf(new Object[i6], i6)), lsm0Var8.a(i14, Arrays.copyOf(new Object[i6], i6)), true));
                    if (!z31) {
                        lc00VarB4.add(new s7j0(lsm0Var8.a(R.string.push_notifications, Arrays.copyOf(new Object[i6], i6))));
                    }
                    if (!z31) {
                        lc00VarB4.add(new l7j0(lsm0Var8.a(R.string.mailing_management_title, Arrays.copyOf(new Object[i6], i6)), z29));
                    }
                    if (v8dVar2.d.size() > 1) {
                        lc00VarB4.add(new n7j0(lsm0Var8.a(R.string.theme_choose_title, Arrays.copyOf(new Object[i6], i6))));
                    }
                    lc00VarB4.add(new m7j0(lsm0Var8.a(R.string.markets_display, Arrays.copyOf(new Object[i6], i6))));
                    if (sff0Var2.L.f) {
                        lc00VarB4.add(new r7j0(lsm0Var8.a(R.string.popular_settings_title_name, Arrays.copyOf(new Object[i6], i6))));
                    }
                    if (x6j0Var2.f && !z31) {
                        lc00VarB4.add(new u7j0(lsm0Var8.a(R.string.shake_settings_title, Arrays.copyOf(new Object[i6], i6))));
                    }
                    if (v8dVar2.w) {
                        lc00VarB4.add(new a8j0(lsm0Var8.a(R.string.widget, Arrays.copyOf(new Object[i6], i6))));
                    }
                    lc00VarB4.add(new k7j0(lsm0Var8.a(R.string.language_settings, Arrays.copyOf(new Object[i6], i6))));
                    if (z31) {
                        z2 = z29;
                    } else {
                        j6d0 j6d0Var2 = pfj0Var.j;
                        boolean z42 = pfj0Var.s;
                        boolean z43 = pfj0Var.t;
                        boolean z44 = pfj0Var.u;
                        boolean z45 = sff0Var2.n;
                        co4 co4Var2 = sff0Var2.N;
                        boolean z46 = co4Var2.g;
                        boolean z47 = co4Var2.i;
                        f3c0 f3c0Var2 = sff0Var2.k;
                        z2 = z29;
                        boolean z48 = f3c0Var2.h && !f3c0Var2.r && z2;
                        boolean z49 = !z2 || (z2 && z44);
                        boolean z50 = sff0Var2.O.length() > 0;
                        if (z45 || z46 || z47 || z48) {
                            if (z45) {
                                z3 = z48;
                                z4 = z49;
                                lc00VarB4.add(new g7j0(lsm0Var8.a(z50 ? R.string.official_site : R.string.working_mirror, Arrays.copyOf(new Object[0], 0)), true, (z32 || z4 || z3 || z47 || z46) ? false : true));
                            } else {
                                z3 = z48;
                                z4 = z49;
                            }
                            if (z47) {
                                if (j6d0Var2 != null) {
                                    String str13 = j6d0Var2.c;
                                    if (!j6d0Var2.f15979a || StringsKt.W(str13)) {
                                        pair2 = new Pair("", i8m0.CROSS);
                                    } else {
                                        int i16 = j6d0Var2.d;
                                        pair2 = new Pair(str13.concat(i16 > 0 ? twn.m(i16, Separators.COLON) : ""), i8m0.CHECK);
                                    }
                                } else {
                                    pair2 = new Pair("", i8m0.CROSS);
                                }
                                lc00VarB4.add(new ugj0(lsm0Var8.a(R.string.proxy_settings_title, Arrays.copyOf(new Object[0], 0)), (String) pair2.f46059a, (i8m0) pair2.b, !z45, (z32 != 0 || z4 || z3 || z46) ? false : true));
                            }
                            if (z3) {
                                lc00VarB4.add(new x7j0(lsm0Var8.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), !z47 && z45 == 0, (z32 != 0 || z4 || z46) ? false : true));
                            }
                            if (z2 && z46) {
                                lc00VarB4.add(new udj0(lsm0Var8.a(R.string.qr_authorization_title, Arrays.copyOf(new Object[0], 0)), z42, (z47 || z45 != 0 || z3) ? false : true, z32 == 0 && !z4));
                            }
                            if (z4 && z46) {
                                lc00VarB4.add(new t7j0(lsm0Var8.a(R.string.qr_unauthorized, Arrays.copyOf(new Object[0], 0)), (z47 || z45 != 0 || z3 || z2) ? false : true, !z32));
                            }
                            if (z32 != 0) {
                                lc00VarB4.add(new tdj0(lsm0Var8.a(R.string.show_currency_conversion_popup, Arrays.copyOf(new Object[0], 0)), z43, (z47 || z45 != 0 || z3 || !z4 || z2) ? false : true));
                            }
                        }
                    }
                    boolean z51 = pfj0Var.v;
                    boolean z52 = pfj0Var.k;
                    String str14 = pfj0Var.w;
                    boolean z53 = pfj0Var.x;
                    boolean z54 = pfj0Var.z;
                    boolean z55 = x6j0Var2.f40367a;
                    boolean z56 = x6j0Var2.b;
                    boolean z57 = sff0Var2.z && !k0j0Var2.d.isEmpty();
                    if (!z31) {
                        if (z55) {
                            lc00VarB4.add(new w7j0(lsm0Var8.a(R.string.share_app_title, Arrays.copyOf(new Object[0], 0)), z51, z51, true));
                        }
                        if (z56) {
                            lc00VarB4.add(new v7j0(lsm0Var8.a(R.string.share_app_by_qr_title, Arrays.copyOf(new Object[0], 0)), !z55));
                        }
                        if (z57) {
                            lc00VarB4.add(new o7j0(lsm0Var8.a(R.string.onoboarding_section_title, Arrays.copyOf(new Object[0], 0)), (z55 || z56) ? false : true));
                        }
                    }
                    lc00VarB4.add(new nzi0(lsm0Var8.a(R.string.app_version_title, Arrays.copyOf(new Object[0], 0)), str9, z52));
                    lc00VarB4.add(new h7j0(lsm0Var8.a(R.string.clear_cache_title, Arrays.copyOf(new Object[0], 0)), str14, z53, (z2 || z54) ? false : true));
                    if (z2) {
                        lc00VarB4.add(new mv00(!z54));
                    }
                    if (z54) {
                        lc00VarB4.add(new g4k());
                    }
                    a4xVarO1 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                }
                return new rfj0(z30, zsvVar2, pfj0Var.A, a4xVarO1);
            case 4:
                cdk0 cdk0Var = (cdk0) obj;
                cdk0Var.getClass();
                return new ecr(ctf0Var, cdk0Var);
            case 5:
                jpk0 jpk0Var = (jpk0) obj;
                jpk0Var.getClass();
                return new p92(jpk0Var, ctf0Var);
            case 6:
                dvk0 dvk0Var = (dvk0) obj;
                dvk0Var.getClass();
                return new ovk0(dvk0Var, ctf0Var);
            case 7:
                return a(obj);
            case 8:
                ((vnn0) obj).getClass();
                return new m72(ctf0Var, (byte) 16);
            case 9:
                return b(obj);
            case 10:
                return c(obj);
            case 11:
                return g(obj);
            case 12:
                keo0 keo0Var = (keo0) obj;
                keo0Var.getClass();
                return new teo0(keo0Var, ctf0Var);
            case 13:
                return h(obj);
            case 14:
                kyo0 kyo0Var = (kyo0) obj;
                kyo0Var.getClass();
                return new s7p0(kyo0Var, ctf0Var);
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
                ((w6r0) obj).getClass();
                return new m72(ctf0Var, (byte) 17);
            case 21:
                return r(obj);
            case 22:
                return s(obj);
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
                fts0 fts0Var = (fts0) obj;
                fts0Var.getClass();
                return new nw8(ctf0Var, fts0Var);
        }
    }
}
