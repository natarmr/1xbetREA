package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventSettingsUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bcn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2361a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ bcn(ctf0 ctf0Var, byte b) {
        this.f2361a = b;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) {
        cie zgeVar;
        e2p e2pVar = (e2p) obj;
        e2pVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = e2pVar.c;
        List list = e2pVar.i;
        ot0 ot0Var = e2pVar.k;
        List list2 = e2pVar.j;
        xll xllVar = xll.f41078a;
        if (z) {
            zgeVar = new the(new aml(x4d0.g0(ot0Var), xllVar, false));
        } else if (e2pVar.f) {
            zgeVar = new tge(e2pVar.l);
        } else if (e2pVar.g) {
            boolean zIsEmpty = list.isEmpty();
            mdm mdmVar = e2pVar.n;
            zgeVar = zIsEmpty ? new zge(mdmVar) : new ehe(plc.B(e2pVar, ctf0Var, mdmVar));
        } else if (list2.isEmpty()) {
            boolean zIsEmpty2 = list.isEmpty();
            mdm mdmVar2 = e2pVar.m;
            zgeVar = zIsEmpty2 ? new zge(mdmVar2) : new ehe(plc.B(e2pVar, ctf0Var, mdmVar2));
        } else {
            pt0 pt0VarG0 = x4d0.g0(ot0Var);
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(unh0.l0((mlr) it.next(), ctf0Var, e2pVar.e, e2pVar.h, true, x4d0.g0(ot0Var), null));
            }
            zgeVar = new lhe(new zll(pt0VarG0, xllVar, CollectionsKt.q0(arrayList, list2.size() == 1 ? kotlin.collections.a.c(new ra0(ctf0Var.b.a(R.string.add, Arrays.copyOf(new Object[0], 0)))) : iun.f15405a)));
        }
        return new f2p(zgeVar, new zpv(false, e2pVar.o && !list2.isEmpty()), e2pVar.b, e2pVar.d);
    }

    private final Object b(Object obj) {
        die dheVar;
        die aheVar;
        i9p i9pVar = (i9p) obj;
        i9pVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = i9pVar.f14397a;
        List list = i9pVar.g;
        List<pbv> list2 = i9pVar.i;
        if (z) {
            aheVar = new uhe(new gtr(false));
        } else if (i9pVar.e) {
            aheVar = new rge(i9pVar.j);
        } else if (i9pVar.f) {
            boolean zIsEmpty = list.isEmpty();
            mdm mdmVar = i9pVar.l;
            if (zIsEmpty) {
                aheVar = new ahe(mdmVar);
            } else {
                dheVar = new dhe(bfb.M(i9pVar, ctf0Var, mdmVar));
                aheVar = dheVar;
            }
        } else {
            if (list2.isEmpty()) {
                boolean zIsEmpty2 = list.isEmpty();
                mdm mdmVar2 = i9pVar.k;
                if (zIsEmpty2) {
                    aheVar = new ahe(mdmVar2);
                } else {
                    dheVar = new dhe(bfb.M(i9pVar, ctf0Var, mdmVar2));
                }
            } else {
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                for (pbv pbvVar : list2) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((pbv) it.next()).f26728a));
                    }
                    arrayList.add(ulb.i0(pbvVar, ctf0Var, CollectionsKt.P0(arrayList2), i9pVar.d));
                }
                dheVar = new khe(new ftr(dyb.r0(CollectionsKt.q0(arrayList, list2.size() == 1 ? kotlin.collections.a.c(new k9n(ctf0Var.b.a(R.string.add, Arrays.copyOf(new Object[0], 0)))) : iun.f15405a))));
            }
            aheVar = dheVar;
        }
        return new j9p(aheVar, new zpv(!list2.isEmpty(), i9pVar.m && !list2.isEmpty()), i9pVar.b, i9pVar.c);
    }

    private final Object c(Object obj) {
        wui0 wui0Var;
        hhp hhpVar = (hhp) obj;
        hhpVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        String str = hhpVar.f13076a;
        int i = 0;
        imm immVar = new imm(ilmVar, new nlm(new hmm(str, (sfh0) qfh0.f28634a, ctf0Var.b.a(R.string.input_query_message, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        lc00 lc00VarB = kotlin.collections.a.b();
        List list = hhpVar.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (StringsKt.O(((xgp) obj2).f40850a.b, str, true)) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            xgp xgpVar = (xgp) obj3;
            int iOrdinal = xgpVar.f40850a.ordinal();
            String str2 = xgpVar.f40850a.b;
            pz40 pz40Var2 = s6t0.f31722a;
            tui0 tui0Var = new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary()));
            ovi0 ovi0Var = new ovi0(xgpVar.b);
            d4d d4dVar = d4d.BACKGROUND_CONTENT;
            if (arrayList.size() == 1) {
                wui0Var = wui0.f39793a;
            } else if (i == 0) {
                wui0Var = wui0.b;
            } else {
                wui0Var = i == arrayList.size() - 1 ? wui0.d : wui0.c;
            }
            lc00VarB.add(new zgp(iOrdinal, new rqm((vui0) tui0Var, (pui0) null, (pvi0) ovi0Var, d4dVar, (tvi0) null, wui0Var, false, (e900) null, 426)));
            i = i2;
        }
        return new ihp(immVar, dyb.o0(kotlin.collections.a.a(lc00VarB)));
    }

    private final Object g(Object obj) {
        Enum r27;
        boolean z;
        int i;
        boolean z2;
        i4 i4VarR0;
        boolean z3;
        String str;
        h8l0 h8l0Var;
        a4x a4xVarO0;
        ysv usvVar;
        int i2;
        long background;
        j700 j700Var;
        j700 j700Var2;
        pnp pnpVar = (pnp) obj;
        pz40 pz40Var = s6t0.f31722a;
        pnpVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        hop hopVar = pnpVar.f27300a;
        j700 j700Var3 = pnpVar.n;
        boolean z4 = pnpVar.l;
        boolean z5 = pnpVar.h;
        int i3 = pnpVar.k;
        f9h0 f9h0Var = pnpVar.d;
        if (hopVar == null) {
            z = z4;
            z5 = z5;
            usvVar = vsv.f37972a;
            r27 = null;
        } else {
            h8l0 h8l0Var2 = hopVar.b;
            boolean z6 = pnpVar.b;
            String str2 = pnpVar.e;
            String str3 = pnpVar.f;
            String strR = ntb.R(f9h0Var, ctf0Var);
            r27 = null;
            int i4 = pnpVar.k;
            lc00 lc00VarB = kotlin.collections.a.b();
            boolean z7 = pnpVar.b;
            zmb zmbVar = pnpVar.t;
            z = z4;
            boolean z8 = pnpVar.p;
            if (z7) {
                i = 1;
            } else {
                i = 1;
                lc00VarB.add(new xip(0, R.drawable.ic_glyph_search, false, true));
            }
            boolean z9 = f9h0Var instanceof d8h0;
            if (z9) {
                int iOrdinal = zmbVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = R.drawable.ic_glyph_planet;
                } else {
                    if (iOrdinal != i) {
                        t9f.b();
                        return null;
                    }
                    i2 = R.drawable.ic_glyph_planet_active;
                }
                lc00VarB.add(new xip(4, i2, zmbVar == zmb.b, z8));
            }
            if (i3 == 1) {
                if (!z5) {
                    boolean z10 = pnpVar.s;
                    lc00VarB.add(new xip(3, z10 ? R.drawable.ic_glyph_filter_active : R.drawable.ic_glyph_filter_inactive, z10, z8));
                }
            } else if (pnpVar.j && !(f9h0Var instanceof p8h0)) {
                boolean z11 = pnpVar.r;
                lc00VarB.add(new xip(2, z11 ? R.drawable.ic_glyph_video_active : R.drawable.ic_glyph_video_inactive, z11, z8));
            }
            a4x a4xVarO1 = dyb.o0(kotlin.collections.a.a(lc00VarB));
            if (!z) {
                z2 = false;
                i4VarR0 = lak0.c;
            } else if (z9) {
                lsm0 lsm0Var = ctf0Var.b;
                i4VarR0 = dyb.g0(new pim(R.drawable.ic_glyph_live, lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))), new pim(R.drawable.ic_glyph_line, lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0))));
                z2 = false;
            } else if ((f9h0Var instanceof y8h0) || (f9h0Var instanceof z8h0)) {
                boolean z12 = hopVar.c;
                lc00 lc00VarB2 = kotlin.collections.a.b();
                z2 = false;
                lsm0 lsm0Var2 = ctf0Var.b;
                lc00VarB2.add(new pim(R.drawable.ic_glyph_live, lsm0Var2.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))));
                lc00VarB2.add(new pim(R.drawable.ic_glyph_line, lsm0Var2.a(R.string.line, Arrays.copyOf(new Object[0], 0))));
                if (z12) {
                    lc00VarB2.add(new pim(R.drawable.ic_glyph_cyber_gamepad, lsm0Var2.a(R.string.cybers, Arrays.copyOf(new Object[0], 0))));
                }
                i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
            } else {
                z2 = false;
                if (!(f9h0Var instanceof m8h0) && !(f9h0Var instanceof p8h0)) {
                    t9f.b();
                    return null;
                }
                i4VarR0 = lak0.c;
            }
            i4 i4Var = i4VarR0;
            int iOrdinal2 = h8l0Var2.ordinal();
            if (iOrdinal2 == 0) {
                z3 = true;
            } else {
                if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    if (hopVar.f13405a != j8l0.SMALL_ITEM_LINE_SEPARATOR) {
                        z3 = z2;
                    }
                } else if (iOrdinal2 != 3) {
                    t9f.b();
                    return null;
                }
                z3 = true;
            }
            if (f9h0Var instanceof z8h0) {
                a4x a4xVar = pnpVar.o;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                Iterator it = a4xVar.iterator();
                while (it.hasNext()) {
                    frq frqVar = (frq) it.next();
                    frqVar.getClass();
                    int i5 = frqVar.f10031a;
                    String str4 = frqVar.b;
                    Iterator it2 = it;
                    bzu bzuVarD = rz4.d("static", "svg", "flags");
                    rz4.s(i5, ".svg", bzuVarD);
                    arrayList.add(new grq(i5, str4, ((StringBuilder) bzuVarD.b).toString()));
                    str3 = str3;
                    it = it2;
                    h8l0Var2 = h8l0Var2;
                }
                str = str3;
                h8l0Var = h8l0Var2;
                a4xVarO0 = dyb.o0(arrayList);
            } else {
                str = str3;
                h8l0Var = h8l0Var2;
                a4xVarO0 = lak0.c;
            }
            usvVar = new usv(h8l0Var, z6, strR, str2, str, a4xVarO1, i4Var, z3, a4xVarO0, i4, pnpVar.g);
        }
        a4x a4xVarI = (z5 && i3 == 1) ? iom0.i(pnpVar.i, pnpVar.u, ctf0Var) : lak0.c;
        Enum r3 = hopVar != null ? hopVar.f13405a : r27;
        Enum r4 = j8l0.SMALL_ITEM_LINE_SEPARATOR;
        if (r3 != r4 || (f9h0Var instanceof m8h0)) {
            pz40 pz40Var2 = s6t0.f31722a;
            background = s6t0.b().f33626a.getBackground();
        } else {
            pz40 pz40Var3 = s6t0.f31722a;
            background = s6t0.b().f33626a.getBackgroundContent();
        }
        Enum r5 = hopVar != null ? hopVar.f13405a : r27;
        wxl wxlVar = ((r5 == null ? -1 : fop.f9893a[r5.ordinal()]) != 1 || (f9h0Var instanceof m8h0)) ? wxl.PRIMARY : wxl.SECONDARY;
        dhq0 dhq0Var = new dhq0(a4xVarI, wxlVar, background);
        long background2 = ((hopVar != null ? hopVar.f13405a : r27) != r4 || (f9h0Var instanceof m8h0)) ? s6t0.b().f33626a.getBackground() : s6t0.b().f33626a.getBackgroundContent();
        boolean z13 = (hopVar != null ? hopVar.b : r27) == h8l0.SMALL_HEADER_MEDIUM_TABS_BACKGROUND;
        a4x a4xVar2 = pnpVar.m;
        if (z) {
            if (f9h0Var instanceof d8h0) {
                j700Var2 = i3 == 0 ? j700.b : j700.f16016a;
            } else if (!(f9h0Var instanceof y8h0) && !(f9h0Var instanceof z8h0)) {
                j700Var2 = j700Var3;
            } else if (i3 != 0) {
                j700Var2 = i3 != 1 ? j700.d : j700.f16016a;
            } else {
                j700Var2 = j700.b;
            }
            j700Var = j700Var2;
        } else {
            j700Var = j700Var3;
        }
        return new qnp(usvVar, dhq0Var, f9h0Var, z13, j700Var, background2, a4xVar2);
    }

    private final Object h(Object obj) {
        o5q o5qVar = (o5q) obj;
        o5qVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        nmy nmyVar = o5qVar.f24699a;
        cny cnyVar = o5qVar.b;
        lsm0 lsm0Var = ctf0Var.b;
        i4 i4VarG0 = dyb.g0(lsm0Var.a(R.string.test_client_config_tab_all, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.test_client_config_tab_changed, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.test_client_config_tab_not_changed, Arrays.copyOf(new Object[0], 0)));
        i4 i4VarG1 = dyb.g0(lsm0Var.a(R.string.test_client_config_tab_a_z, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.test_client_config_tab_z_a, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.test_client_config_tab_first_changed, Arrays.copyOf(new Object[0], 0)));
        String strA = lsm0Var.a(R.string.test_client_config_filters_title, Arrays.copyOf(new Object[0], 0));
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        return new p5q(nmyVar, cnyVar, i4VarG0, i4VarG1, strA, new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.test_client_config_apply_title, Arrays.copyOf(new Object[0], 0))), true, false, false), new wul(rul.e, oe9Var, new ue9(lsm0Var.a(R.string.test_client_config_reset_config, Arrays.copyOf(new Object[0], 0))), true, false, false), new hjm(lsm0Var.a(R.string.test_client_config_filters_subtitle, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190), new hjm(lsm0Var.a(R.string.test_client_config_sort_subtitle, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190));
    }

    private final Object i(Object obj) {
        i4 i4VarR0;
        boolean z;
        ekr ekrVar = (ekr) obj;
        ekrVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z2 = ekrVar.b;
        List list = ekrVar.f7966a;
        boolean zIsEmpty = list.isEmpty();
        int i = R.string.yes;
        if (zIsEmpty) {
            i4VarR0 = lak0.c;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                ikr ikrVar = (ikr) obj2;
                int size = list.size();
                int i4 = ikrVar.f14942a;
                djr djrVar = ikrVar.c;
                String str = i3 + Separators.SLASH + size + ". " + ikrVar.b;
                lsm0 lsm0Var = ctf0Var.b;
                arrayList.add(new okr(i4, str, new rqm((vui0) new tui0(lsm0Var.a(i, Arrays.copyOf(new Object[0], 0)), null), (pui0) null, (pvi0) new nvi0(djrVar == djr.c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), new rqm((vui0) new tui0(lsm0Var.a(R.string.no, Arrays.copyOf(new Object[0], 0)), null), (pui0) null, (pvi0) new nvi0(djrVar == djr.b), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), djrVar));
                i2 = i3;
                i = R.string.yes;
            }
            i4VarR0 = dyb.r0(arrayList);
        }
        i4 i4Var = i4VarR0;
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA = lsm0Var2.a(R.string.yes, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var2.a(R.string.no, Arrays.copyOf(new Object[0], 0));
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        ue9 ue9Var = new ue9(lsm0Var2.a(R.string.next, Arrays.copyOf(new Object[0], 0)));
        if (list.isEmpty()) {
            z = false;
        } else {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ikr) it.next()).c == djr.f6200a) {
                            z = false;
                        }
                    }
                }
            }
            z = true;
        }
        mtl mtlVar = new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, ue9Var, z, false, true), rk.z)));
        pz40 pz40Var = s6t0.f31722a;
        return new fkr(z2, lsm0Var2.a(R.string.responsible_gaming_test_title, Arrays.copyOf(new Object[0], 0)), i4Var, strA, strA2, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(lsm0Var2.a(R.string.financial_test_title, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null), mtlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.Throwable] */
    private final Object l(Object obj) {
        Iterable iterableJ;
        wui0 wui0Var;
        qns qnsVar = (qns) obj;
        qnsVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        int i = 0;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.subscriptions, Arrays.copyOf(new Object[0], 0));
        boolean z = qnsVar.b;
        boolean z2 = qnsVar.e;
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel = qnsVar.g;
        y3d y3dVar = null;
        mdm mdmVar = qnsVar.d ? qnsVar.f : null;
        int i2 = 10;
        int i3 = 1;
        if (gameSubscriptionSettingsScreenUiModel == null || qnsVar.f29046a) {
            dqj0 dqj0Var = new dqj0(wui0.f39793a, false);
            wui0 wui0Var2 = wui0.b;
            dqj0 dqj0Var2 = new dqj0(wui0Var2, true);
            wui0 wui0Var3 = wui0.c;
            dqj0 dqj0Var3 = new dqj0(wui0Var3, false);
            dqj0 dqj0Var4 = new dqj0(wui0Var3, true);
            dqj0 dqj0Var5 = new dqj0(wui0Var3, false);
            dqj0 dqj0Var6 = new dqj0(wui0Var3, true);
            wui0 wui0Var4 = wui0.d;
            dqj0 dqj0Var7 = new dqj0(wui0Var4, false);
            dqj0 dqj0Var8 = new dqj0(wui0Var2, true);
            dqj0 dqj0Var9 = new dqj0(wui0Var3, false);
            dqj0 dqj0Var10 = new dqj0(wui0Var3, true);
            dqj0 dqj0Var11 = new dqj0(wui0Var3, false);
            dqj0 dqj0Var12 = new dqj0(wui0Var3, true);
            dqj0 dqj0Var13 = new dqj0(wui0Var4, false);
            srv srvVar = srv.f32697a;
            iterableJ = q3d.j(dqj0Var, srvVar, dqj0Var2, dqj0Var3, dqj0Var4, dqj0Var5, dqj0Var6, dqj0Var7, srvVar, dqj0Var8, dqj0Var9, dqj0Var10, dqj0Var11, dqj0Var12, dqj0Var13);
        } else {
            lc00 lc00VarB = kotlin.collections.a.b();
            String strA2 = lsm0Var.a(R.string.select_all, Arrays.copyOf(new Object[0], 0));
            boolean zA = gameSubscriptionSettingsScreenUiModel.a();
            rqm rqmVar = new rqm((vui0) new tui0(strA2, null), (pui0) null, (pvi0) new ovi0(zA), (d4d) null, (tvi0) null, wui0.f39793a, false, (e900) null, 442);
            j760 j760Var = j760.f16026a;
            lc00VarB.add(new b760(new NotificationInfoUiModel(strA2, zA), rqmVar));
            ArrayList arrayList = gameSubscriptionSettingsScreenUiModel.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if ((((PeriodSubscriptionSettingsScreenUiModel) obj2).f46679a.f46682a != 3 && z2) || !z2) {
                    arrayList2.add(obj2);
                }
            }
            List<PeriodSubscriptionSettingsScreenUiModel> listA0 = CollectionsKt.A0(arrayList2, new e3l((byte) 16));
            ArrayList arrayList3 = new ArrayList();
            for (PeriodSubscriptionSettingsScreenUiModel periodSubscriptionSettingsScreenUiModel : listA0) {
                lc00 lc00VarB2 = kotlin.collections.a.b();
                lc00VarB2.add(new rsv(periodSubscriptionSettingsScreenUiModel.f46679a.b));
                ArrayList arrayList4 = periodSubscriptionSettingsScreenUiModel.b;
                long j = periodSubscriptionSettingsScreenUiModel.f46679a.f46682a;
                ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, i2));
                int i4 = i;
                for (Object obj3 : arrayList4) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ?? r33 = y3dVar;
                        q3d.p();
                        throw r33;
                    }
                    int i6 = i2;
                    SubscriptionEventSettingsUiModel subscriptionEventSettingsUiModel = (SubscriptionEventSettingsUiModel) obj3;
                    if (arrayList4.size() <= i3) {
                        wui0Var = wui0.f39793a;
                    } else if (i4 == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = i4 == arrayList4.size() - i3 ? wui0.d : wui0.c;
                    }
                    y3d y3dVar2 = y3dVar;
                    rqm rqmVar2 = new rqm((vui0) new tui0(subscriptionEventSettingsUiModel.f46680a.b, y3dVar), (pui0) null, (pvi0) new ovi0(subscriptionEventSettingsUiModel.b), (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442);
                    long j2 = j;
                    j760 j760Var2 = j760.c;
                    SubscriptionEventUiModel subscriptionEventUiModel = subscriptionEventSettingsUiModel.f46680a;
                    arrayList5.add(new b760(new NotificationInfoUiModel(j760Var2, subscriptionEventUiModel.b, subscriptionEventSettingsUiModel.b, j2, subscriptionEventUiModel.f46681a), rqmVar2));
                    i2 = i6;
                    j = j2;
                    i4 = i5;
                    lc00VarB2 = lc00VarB2;
                    y3dVar = y3dVar2;
                    i3 = 1;
                }
                lc00 lc00Var = lc00VarB2;
                lc00Var.addAll(arrayList5);
                w3d.u(arrayList3, kotlin.collections.a.a(lc00Var));
                i = 0;
                i3 = 1;
            }
            lc00VarB.addAll(arrayList3);
            iterableJ = kotlin.collections.a.a(lc00VarB);
        }
        return new rns(mdmVar, dyb.o0(iterableJ), strA, z);
    }

    private final Object m(Object obj) {
        agt agtVar = (agt) obj;
        agtVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.choose_gender, Arrays.copyOf(new Object[0], 0));
        int i = agtVar.f842a;
        return new bgt(strA, q3d.j(new ok90(1, i == 1 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getTextPrimary(), lsm0Var.a(R.string.male, Arrays.copyOf(new Object[0], 0)), i == 1, false), new ok90(2, i == 2 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getTextPrimary(), lsm0Var.a(R.string.female, Arrays.copyOf(new Object[0], 0)), i == 2, true)));
    }

    private final Object o(Object obj) {
        r8v r8vVar = (r8v) obj;
        r8vVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list = r8vVar.b;
        bfo0 bfo0Var = r8vVar.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            jfo0 jfo0Var = (jfo0) it.next();
            bfo0 bfo0Var2 = jfo0Var.f16439a;
            if (bfo0Var2 != bfo0Var) {
                z = false;
            }
            String str = jfo0Var.b;
            str.getClass();
            arrayList.add(new jfo0(bfo0Var2, str, z));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        return new s8v(new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new nlm(new hmm(2, r8vVar.f30047a, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), r8vVar.e)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), false, null), a4xVarO0, bfo0Var, a4xVarO0.size() > 1);
    }

    private final Object p(Object obj) {
        zhv zhvVar = (zhv) obj;
        zhvVar.getClass();
        String str = zhvVar.f44412a;
        List list = zhvVar.b;
        if (str == null) {
            str = "";
        }
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            fyl fylVar = null;
            lxl lxlVar = null;
            if (!it.hasNext()) {
                i4 i4VarR0 = dyb.r0(arrayList);
                if (!i4VarR0.isEmpty()) {
                    fylVar = new fyl(i4VarR0, null, null, s5x0.t(ctf0Var.j() ? 32.0f : 8.0f, 0.0f, 2), null, 22);
                }
                return new aiv(fylVar, str, dyb.r0(list));
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            String str2 = (String) next;
            if (str2.length() > 0) {
                lxlVar = new lxl(i, (dyl) new xxl(str2), false, str.equalsIgnoreCase(str2) ? uxl.b : uxl.f36445a, (cwl) null, 108);
            }
            if (lxlVar != null) {
                arrayList.add(lxlVar);
            }
            i = i2;
        }
    }

    private final Object r(Object obj) {
        unm0 unm0Var = (unm0) obj;
        unm0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list = unm0Var.f35971a;
        boolean z = unm0Var.c;
        if (list.isEmpty()) {
            return e0w.f7009a;
        }
        HistoryTypeModel historyTypeModel = unm0Var.h;
        HistoryTypeModel historyTypeModel2 = HistoryTypeModel.AGGREGATOR;
        f1w f1wVar = f1w.f8786a;
        if (historyTypeModel != historyTypeModel2) {
            lsm0 lsm0Var = ctf0Var.b;
            g1w g1wVar = new g1w(new xso0(lsm0Var.a(R.string.select_all, Arrays.copyOf(new Object[0], 0))), unm0Var.e);
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList.add(hic.J((h0w) obj2, ctf0Var, i != list.size() - 1));
                i = i2;
            }
            d1w d1wVar = new d1w(dyb.g0(new kn8(lsm0Var.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0)), z)));
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(g1wVar);
            lc00VarB.add(f1wVar);
            lc00VarB.addAll(arrayList);
            lc00VarB.add(d1wVar);
            return new f0w(dyb.r0(kotlin.collections.a.a(lc00VarB)));
        }
        lsm0 lsm0Var2 = ctf0Var.b;
        g1w g1wVar2 = new g1w(new zso0(lsm0Var2.a(R.string.select_all, Arrays.copyOf(new Object[0], 0))), unm0Var.f);
        g1w g1wVar3 = new g1w(new yso0(lsm0Var2.a(R.string.select_all, Arrays.copyOf(new Object[0], 0))), unm0Var.g);
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(hic.J((h0w) it.next(), ctf0Var, false));
        }
        d1w d1wVar2 = new d1w(dyb.g0(new ln8(lsm0Var2.a(R.string.clear, Arrays.copyOf(new Object[0], 0)), unm0Var.d), new kn8(lsm0Var2.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0)), z)));
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lc00VarB2.add(new h1w(lsm0Var2.a(R.string.type_of_game, Arrays.copyOf(new Object[0], 0))));
        lc00VarB2.add(g1wVar2);
        lc00VarB2.add(f1wVar);
        i1w i1wVar = (i1w) CollectionsKt.W(0, arrayList2);
        if (i1wVar != null) {
            lc00VarB2.add(i1wVar);
        }
        lc00VarB2.add(f1wVar);
        i1w i1wVar2 = (i1w) CollectionsKt.W(1, arrayList2);
        if (i1wVar2 != null) {
            lc00VarB2.add(i1wVar2);
        }
        lc00VarB2.add(new h1w(lsm0Var2.a(R.string.bet_type, Arrays.copyOf(new Object[0], 0))));
        lc00VarB2.add(g1wVar3);
        lc00VarB2.add(f1wVar);
        i1w i1wVar3 = (i1w) CollectionsKt.W(2, arrayList2);
        if (i1wVar3 != null) {
            lc00VarB2.add(i1wVar3);
        }
        lc00VarB2.add(f1wVar);
        i1w i1wVar4 = (i1w) CollectionsKt.W(3, arrayList2);
        if (i1wVar4 != null) {
            lc00VarB2.add(i1wVar4);
        }
        lc00VarB2.add(d1wVar2);
        return new f0w(dyb.r0(kotlin.collections.a.a(lc00VarB2)));
    }

    private final Object s(Object obj) {
        z7w z7wVar = (z7w) obj;
        z7wVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list = z7wVar.f43940a;
        HistoryTypeModel historyTypeModel = z7wVar.d;
        if (list.isEmpty()) {
            return a8w.f448a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                i4 i4VarR0 = dyb.r0(arrayList);
                if (historyTypeModel == HistoryTypeModel.EVENTS && z7wVar.e) {
                    z = true;
                }
                return new b8w(i4VarR0, z);
            }
            HistoryTypeModel historyTypeModel2 = (HistoryTypeModel) it.next();
            f8w f8wVar = z7wVar.c;
            String str = z7wVar.b;
            z = historyTypeModel == historyTypeModel2;
            historyTypeModel2.getClass();
            int iOrdinal = historyTypeModel2.ordinal();
            int i = R.drawable.ic_nav_toto;
            switch (iOrdinal) {
                case 0:
                    i = R.drawable.ic_nav_history;
                    break;
                case 1:
                case 6:
                    break;
                case 2:
                    i = R.drawable.ic_autobet_history;
                    break;
                case 3:
                    i = R.drawable.ic_unsettled_history;
                    break;
                case 4:
                    i = R.drawable.ic_replace;
                    break;
                case 5:
                    i = R.drawable.ic_glyph_cards;
                    break;
                case 7:
                    i = R.drawable.glyph_loto;
                    break;
                default:
                    t9f.b();
                    return null;
            }
            arrayList.add(new e8w(i, uzb.p0(historyTypeModel2, ctf0Var, f8wVar, str), z, historyTypeModel2));
        }
    }

    private final Object t(Object obj) {
        hx6 hx6Var;
        qln0 lln0Var;
        s1y s1yVar = (s1y) obj;
        s1yVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = s1yVar.g;
        sm5 sm5Var = s1yVar.c;
        ax6 ax6Var = s1yVar.d;
        double d = ax6Var.d;
        double d2 = ax6Var.c;
        double d3 = ax6Var.b;
        if (z) {
            hx6Var = hx6.c;
        } else {
            hx6Var = ((d2 > d3 || d3 > d) && d3 != -1.0d) ? hx6.b : hx6.f13799a;
        }
        hx6 hx6Var2 = hx6Var;
        String str = s1yVar.b;
        lsm0 lsm0Var = ctf0Var.b;
        e0s e0sVar = new e0s(str, lsm0Var.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0)));
        String strA = lsm0Var.a(R.string.balance, Arrays.copyOf(new Object[0], 0));
        String str2 = sm5Var.c;
        String str3 = sm5Var.d;
        kn5 kn5Var = new kn5(strA, lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[0], 0)), str2, sm5Var.e, str3);
        iul iulVar = iul.e;
        wul wulVar = new wul(iulVar, oe9.d, new te9(R.drawable.ic_glyph_plus_small), true, false, false);
        wul wulVar2 = new wul(iulVar, oe9.f25112a, new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), !z && d3 != -1.0d && d2 <= d3 && d3 <= d, false, false);
        pz40 pz40VarE = !z ? ax6Var.f1608a : androidx.compose.runtime.e.e(new a8q0("", 0L, 6));
        String strA2 = lsm0Var.a(R.string.bet_enter_sum, Arrays.copyOf(new Object[0], 0));
        boolean z2 = d3 == -1.0d || ((d2 > d3 || d3 > d) && d3 != -1.0d);
        if (d3 < d2) {
            String strA3 = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            lln0Var = new lln0(strA3, cy7.e(pn40.d(d2, str3, p3u0.c)));
        } else if (d3 > d) {
            String strA4 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
            int i2 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            lln0Var = new lln0(strA4, cy7.e(pn40.d(d, str3, p3u0.c)));
        } else {
            lln0Var = kln0.f18499a;
        }
        ox6 ox6Var = new ox6(pz40VarE, strA2, z2, lln0Var, hx6Var2);
        pn40 pn40Var3 = pn40.f27267a;
        p3u0 p3u0Var = p3u0.c;
        String strD = pn40.d(d2, str3, p3u0Var);
        String strD2 = pn40.d(d, str3, p3u0Var);
        double d4 = d - d2;
        if (d4 < 1.0d) {
            d4 = 1.0d;
        }
        float fB = d3 >= d2 ? (float) l1e0.b(((d3 - d2) / d4) * 100.0d, 0.0d, 100.0d) : 0.0f;
        String strA5 = lsm0Var.a(R.string.from_, Arrays.copyOf(new Object[0], 0));
        Locale locale = Locale.ROOT;
        String lowerCase = strA5.toLowerCase(locale);
        lowerCase.getClass();
        String str4 = lowerCase + Separators.SP + strD;
        String lowerCase2 = lsm0Var.a(R.string.to_, Arrays.copyOf(new Object[0], 0)).toLowerCase(locale);
        lowerCase2.getClass();
        return new t1y(e0sVar, kn5Var, ox6Var, new i8k0(fB, str4, kng0.l(lowerCase2, Separators.SP, strD2)), new qjx(lsm0Var.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.insufficient_balance_bet_dialog, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))), sm5Var.d, s1yVar.f31477a, wulVar, wulVar2, s1yVar.e, sm5Var.f);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    private final Object u(Object obj) {
        boolean z;
        boolean z2;
        ix6 ix6Var;
        x3y x3yVar = (x3y) obj;
        x3yVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        xw6 xw6Var = x3yVar.c;
        tm5 tm5Var = x3yVar.b;
        boolean z3 = x3yVar.e;
        dpm0 dpm0Var = xw6Var.b;
        double d = dpm0Var.b;
        double d2 = dpm0Var.d;
        double d3 = dpm0Var.c;
        boolean z4 = dpm0Var.f;
        double d4 = dpm0Var.f6476a;
        boolean z5 = !(d == 0.0d);
        zy6 zy6Var = x3yVar.f40242a;
        String str = tm5Var.c;
        String str2 = tm5Var.d;
        ln5 ln5Var = new ln5(str, str2, tm5Var.e);
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        wul wulVar = new wul(iulVar, oe9Var, new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), !z4 && z3 && d4 != -1.0d && d3 <= d4 && d4 <= d2, false, true);
        String strA = "";
        vx6 vx6Var = new vx6((z4 || !z3) ? androidx.compose.runtime.e.e(new a8q0("", 0L, 6)) : xw6Var.f41594a, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)));
        if ((d3 <= d4 && d4 <= d2) || d4 == -1.0d) {
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            strA = kng0.l(cy7.e(pn40.d(d3, str2, p3u0Var)), " – ", cy7.e(pn40.d(d2, str2, p3u0Var)));
        } else {
            if (d4 >= d3) {
                if (d4 > d2) {
                    int i2 = cy7.f5159a;
                    pn40 pn40Var2 = pn40.f27267a;
                    Object[] objArr = {cy7.e(pn40.d(d2, str2, p3u0.c))};
                    z = true;
                    strA = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(objArr, 1));
                }
                if (z4 && z3 && d4 > d3) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (z4 || !z3 || d4 >= d2) {
                    z = false;
                }
                lke lkeVar = new lke(z2, z, z5);
                if (z4 && z3) {
                    ix6Var = ((d3 > d4 || d4 > d2) && d4 != -1.0d) ? ix6.b : ix6.f15526a;
                } else {
                    ix6Var = ix6.c;
                }
                return new y3y(zy6Var, ln5Var, new px6(vx6Var, strA, lkeVar, ix6Var, tm5Var.d), wulVar, x3yVar.d);
            }
            int i3 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(d3, str2, p3u0.c))}, 1));
        }
        z = true;
        if (z4) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z4) {
            z = false;
        } else {
            z = false;
        }
        lke lkeVar2 = new lke(z2, z, z5);
        if (z4) {
            ix6Var = ix6.c;
        } else {
            ix6Var = ix6.c;
        }
        return new y3y(zy6Var, ln5Var, new px6(vx6Var, strA, lkeVar2, ix6Var, tm5Var.d), wulVar, x3yVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    private final Object v(Object obj) {
        boolean z;
        boolean z2;
        jx6 jx6Var;
        zzx zzxVar = (zzx) obj;
        zzxVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        yw6 yw6Var = zzxVar.c;
        um5 um5Var = zzxVar.b;
        boolean z3 = zzxVar.e;
        epm0 epm0Var = yw6Var.b;
        double d = epm0Var.b;
        double d2 = epm0Var.d;
        double d3 = epm0Var.c;
        boolean z4 = epm0Var.f;
        double d4 = epm0Var.f8196a;
        boolean z5 = !(d == 0.0d);
        az6 az6Var = zzxVar.f45277a;
        String str = um5Var.c;
        String str2 = um5Var.d;
        mn5 mn5Var = new mn5(str, str2, um5Var.e);
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        wul wulVar = new wul(iulVar, oe9Var, new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), !z4 && z3 && d4 != -1.0d && d3 <= d4 && d4 <= d2, false, true);
        String strA = "";
        tx6 tx6Var = new tx6((z4 || !z3) ? androidx.compose.runtime.e.e(new a8q0("", 0L, 6)) : yw6Var.f43355a, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)));
        if ((d3 <= d4 && d4 <= d2) || d4 == -1.0d) {
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            strA = kng0.l(cy7.e(pn40.d(d3, str2, p3u0Var)), " – ", cy7.e(pn40.d(d2, str2, p3u0Var)));
        } else {
            if (d4 >= d3) {
                if (d4 > d2) {
                    int i2 = cy7.f5159a;
                    pn40 pn40Var2 = pn40.f27267a;
                    Object[] objArr = {cy7.e(pn40.d(d2, str2, p3u0.c))};
                    z = true;
                    strA = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(objArr, 1));
                }
                if (z4 && z3 && d4 > d3) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (z4 || !z3 || d4 >= d2) {
                    z = false;
                }
                mke mkeVar = new mke(z2, z, z5);
                if (z4 && z3) {
                    jx6Var = ((d3 > d4 || d4 > d2) && d4 != -1.0d) ? jx6.b : jx6.f17288a;
                } else {
                    jx6Var = jx6.c;
                }
                return new a0y(az6Var, mn5Var, new qx6(tx6Var, strA, mkeVar, jx6Var, um5Var.d), wulVar, zzxVar.d);
            }
            int i3 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(d3, str2, p3u0.c))}, 1));
        }
        z = true;
        if (z4) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z4) {
            z = false;
        } else {
            z = false;
        }
        mke mkeVar2 = new mke(z2, z, z5);
        if (z4) {
            jx6Var = jx6.c;
        } else {
            jx6Var = jx6.c;
        }
        return new a0y(az6Var, mn5Var, new qx6(tx6Var, strA, mkeVar2, jx6Var, um5Var.d), wulVar, zzxVar.d);
    }

    private final Object w(Object obj) {
        kx6 kx6Var;
        x5y x5yVar = (x5y) obj;
        x5yVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = x5yVar.f40337a;
        zw6 zw6Var = x5yVar.c;
        double d = zw6Var.d;
        double d2 = zw6Var.c;
        double d3 = zw6Var.b;
        lsm0 lsm0Var = ctf0Var.b;
        d0s d0sVar = new d0s(str, lsm0Var.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0)));
        String strA = lsm0Var.a(R.string.balance, Arrays.copyOf(new Object[0], 0));
        vm5 vm5Var = x5yVar.b;
        nn5 nn5Var = new nn5(strA, lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[0], 0)), vm5Var.c, vm5Var.e, vm5Var.d);
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        wul wulVar = new wul(iulVar, oe9Var, new se9(R.drawable.ic_glyph_plus_small), true, false, true);
        ue9 ue9Var = new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        boolean z = x5yVar.f;
        wul wulVar2 = new wul(iulVar, oe9Var, ue9Var, !z && d3 != -1.0d && d2 <= d3 && d3 <= d, false, false);
        String strA2 = "";
        ux6 ux6Var = new ux6(!z ? zw6Var.f45091a : androidx.compose.runtime.e.e(new a8q0("", 0L, 6)), lsm0Var.a(R.string.bet_enter_sum, Arrays.copyOf(new Object[0], 0)));
        String str2 = vm5Var.d;
        if ((d2 <= d3 && d3 <= d) || d3 == -1.0d) {
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            strA2 = kng0.l(cy7.e(pn40.d(d2, str2, p3u0Var)), " – ", cy7.e(pn40.d(d, str2, p3u0Var)));
        } else if (d3 < d2) {
            int i2 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            strA2 = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(d2, str2, p3u0.c))}, 1));
        } else if (d3 > d) {
            int i3 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(d, str2, p3u0.c))}, 1));
        }
        if (z) {
            kx6Var = kx6.c;
        } else {
            kx6Var = ((d2 > d3 || d3 > d) && d3 != -1.0d) ? kx6.b : kx6.f19037a;
        }
        return new y5y(d0sVar, nn5Var, new rx6(ux6Var, strA2, kx6Var), wulVar, wulVar2, x5yVar.d);
    }

    private final Object x(Object obj) {
        wxz wxzVar = (wxz) obj;
        wxzVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = wxzVar.b;
        String str2 = wxzVar.c;
        String str3 = wxzVar.d;
        String str4 = wxzVar.e;
        boolean z = (StringsKt.W(str2) || str2.equals(str3) || str.equals(str2)) ? false : true;
        lsm0 lsm0Var = ctf0Var.b;
        return new xxz(str, str2, str3, str4, z, lsm0Var.a(R.string.limits_bottom_sheet_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.limits_bottom_sheet_description, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.limits_enter_sum_with_currency_v2, Arrays.copyOf(new Object[]{wxzVar.e}, 1)), lsm0Var.a(R.string.save_changes, Arrays.copyOf(new Object[0], 0)));
    }

    private final Object y(Object obj) {
        cy00 cy00Var = (cy00) obj;
        cy00Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String strA = cy00Var.b;
        if (strA.length() == 0) {
            strA = ctf0Var.b.a(R.string.exit_warning_message, Arrays.copyOf(new Object[0], 0));
        }
        return new ey00(strA, cy00Var.f5150a ? false : cy00Var.c);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 4120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bcn.invoke(java.lang.Object):java.lang.Object");
    }
}
