package a;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.RealInterceptorChain;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ng0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23461a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ng0(pru pruVar, zri zriVar, iqt iqtVar, bzt bztVar, q250 q250Var) {
        this.f23461a = (byte) 11;
        this.b = pruVar;
        this.d = zriVar;
        this.c = iqtVar;
        this.e = bztVar;
        this.f = q250Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Throwable th;
        String strO;
        Object g0g0Var;
        MediaType mediaTypeA;
        Throwable th2;
        Response responseA;
        int iIntValue;
        lq5 jq5Var;
        byte b = this.f23461a;
        Response response = null;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                fs80 fs80Var = (fs80) obj;
                boolean zA = ((iqt) obj5).f15225a.a();
                kg kgVarB = ((dmt) obj4).b();
                boolean z = ((pru) obj3).a().b.O;
                String strA = ((ctf0) obj2).b.a(R.string.cases_categories, Arrays.copyOf(new Object[0], 0));
                w7r0 v7r0Var = zA ? new v7r0(pbj.f26710a) : u7r0.f35200a;
                lak0 lak0Var = lak0.c;
                return new hg0(fs80Var, lak0Var, lak0Var, lak0Var, lak0Var, strA, false, v7r0Var, zA, true, true, true, true, z, null, null, kgVarB);
            case 1:
                n71 n71Var = (n71) obj4;
                j1q0 j1q0Var = (j1q0) obj2;
                iqt iqtVar = (iqt) obj5;
                bzt bztVar = (bzt) obj;
                sff0 sff0VarA = ((pru) obj3).a();
                return new u81(mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), n71Var.f23019a, 0L, 0L, null, false, n71Var.i, n71Var.c && !n71Var.h, 249854), null, n71Var.b, n71Var.d, false, false, n71Var.e, n71Var.f, n71Var.g.longValue(), j1q0Var.f15748a.b(), false, iqtVar.f15225a.a(), null, sff0VarA, false, false, false, sff0VarA.b.G, bztVar.f3488a.a().X, new ax0(null, null), new LinkedHashSet());
            case 2:
                ((rmb0) obj5).o((Function0) obj4, (wmb0) obj3, (String) obj2, (k6z) obj);
                return Unit.f46060a;
            case 3:
                r9u r9uVar = (r9u) obj4;
                BetHistoryScreenModel betHistoryScreenModel = (BetHistoryScreenModel) obj;
                sff0 sff0VarA2 = ((pru) obj3).a();
                String strA2 = ((ctf0) obj2).b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                iun iunVar = iun.f15405a;
                boolean z2 = sff0VarA2.f32117a.f12063a.n;
                HashMap map = new HashMap();
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                boolean z3 = sff0VarA2.J1;
                boolean z4 = ((yiu) obj5).a() || sff0VarA2.O1;
                ygp ygpVar = ygp.x;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new jk7(true, false, 0L, betHistoryScreenModel, false, null, false, false, strA2, iunVar, iunVar, false, iunVar, false, z2, j1q0Var2.f15748a.d(ygpVar), false, iunVar, iunVar, false, lunVar, true, map, z3, z4);
            case 4:
                dk9 dk9Var = (dk9) obj4;
                String str = (String) obj3;
                RealInterceptorChain realInterceptorChain = (RealInterceptorChain) obj2;
                Request request = (Request) obj;
                if (((fk9) obj5).f9679a) {
                    return dk9Var.b(str, request, realInterceptorChain);
                }
                yi9 yi9Var = dk9Var.f6219a;
                yi9Var.getClass();
                str.getClass();
                try {
                    DiskLruCache.Snapshot snapshot = yi9Var.a().get(str);
                    if (snapshot != null) {
                        zae0 zae0VarD = x9x.D((emk0) snapshot.b.get(0));
                        try {
                            f99 f99Var = zae0VarD.b;
                            f99Var.P(zae0VarD.f44063a);
                            strO = f99Var.O();
                            try {
                                zae0VarD.close();
                                th = null;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            try {
                                zae0VarD.close();
                            } catch (Throwable th5) {
                                tjo.a(th4, th5);
                            }
                            th = th4;
                            strO = null;
                            break;
                        }
                        if (th != null) {
                            throw th;
                        }
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            g0g0Var = ti9.a(strO);
                        } catch (Throwable th6) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th6);
                        }
                        boolean z5 = g0g0Var instanceof g0g0;
                        Object obj6 = g0g0Var;
                        if (z5) {
                            obj6 = null;
                        }
                        si9 si9Var = (si9) obj6;
                        if (si9Var == null || System.currentTimeMillis() >= si9Var.g + si9Var.h) {
                            snapshot.close();
                            yi9Var.a().remove(str);
                        } else {
                            String strB = si9Var.f.b("Content-Type");
                            if (strB != null) {
                                Regex regex = MediaType.e;
                                try {
                                    mediaTypeA = MediaType.Companion.a(strB);
                                } catch (IllegalArgumentException unused) {
                                    mediaTypeA = null;
                                }
                            } else {
                                mediaTypeA = null;
                            }
                            zae0 zae0VarD2 = x9x.D((emk0) snapshot.b.get(1));
                            try {
                                f99 f99Var2 = new f99();
                                f99Var2.P(zae0VarD2);
                                snapshot.close();
                                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
                                responseA = mtf0.a(si9Var, new ResponseBody$Companion$asResponseBody$1(mediaTypeA, f99Var2.b, f99Var2));
                                try {
                                    zae0VarD2.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    zae0VarD2.close();
                                } catch (Throwable th9) {
                                    tjo.a(th8, th9);
                                }
                                th2 = th8;
                                responseA = null;
                                break;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            response = responseA;
                        }
                        break;
                        response = null;
                    }
                } catch (Throwable th10) {
                    th10.printStackTrace();
                    try {
                        e0g0 e0g0Var3 = j0g0.b;
                        DiskLruCache.Snapshot snapshot2 = yi9Var.a().get(str);
                        if (snapshot2 != null) {
                            snapshot2.close();
                        }
                    } catch (Throwable unused2) {
                        e0g0 e0g0Var4 = j0g0.b;
                    }
                    yi9Var.a().remove(str);
                    break;
                }
                return response != null ? response.c().a() : dk9Var.b(str, request, realInterceptorChain);
            case 5:
                s1u s1uVar = (s1u) obj4;
                edu eduVar = (edu) obj2;
                r9u r9uVar2 = (r9u) obj;
                sff0 sff0VarA3 = ((pru) obj3).a();
                iun iunVar2 = iun.f15405a;
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                js20 js20Var = (js20) ((as20) ((ivn) obj5).f15453a).f1372a.b.getValue();
                if (js20Var == null) {
                    throw new ef5();
                }
                xvm0 xvm0VarA = s1uVar.f31473a.b.a();
                n6b n6bVar = new n6b(sff0VarA3.h1, sff0VarA3.J1);
                aw20 aw20VarG = eduVar.g();
                ygp ygpVar2 = ygp.t;
                r9uVar2.getClass();
                j1q0 j1q0Var3 = r9uVar2.f30104a;
                j1q0Var3.getClass();
                return new r6b(iunVar2, lunVar2, null, lunVar2, null, js20Var, null, iunVar2, xvm0VarA, null, iunVar2, n6bVar, aw20VarG, j1q0Var3.f15748a.d(ygpVar2), null, "", false, sff0VarA3.I1, false);
            case 6:
                sff0 sff0VarA4 = ((pru) obj3).a();
                List listA = ((luu) obj4).f20692a.a();
                boolean zJ = ((lbu) obj2).j();
                ygp ygpVar3 = ygp.t;
                j1q0 j1q0Var4 = ((r9u) obj).f30104a;
                j1q0Var4.getClass();
                return new dfg((CyberChampParams) obj5, sff0VarA4, null, listA, zJ, true, false, j1q0Var4.f15748a.d(ygpVar3));
            case 7:
                sff0 sff0VarA5 = ((pru) obj3).a();
                List listA2 = ((luu) obj5).f20692a.a();
                boolean zJ2 = ((lbu) obj4).j();
                iun iunVar3 = iun.f15405a;
                lun lunVar3 = lun.f20680a;
                lunVar3.getClass();
                return new sig((CyberChampsMainParams) obj2, (sip) obj, sff0VarA5, listA2, zJ2, true, new wcb("%s", lunVar3, lunVar3), null, "", iunVar3, false, iunVar3);
            case 8:
                ctf0 ctf0Var = (ctf0) obj2;
                j700 j700Var = (j700) obj5;
                vzg0 vzg0Var = (vzg0) obj4;
                f9h0 f9h0Var = (f9h0) obj3;
                long[] jArr = (long[]) obj;
                f9h0 f9h0Var2 = (f9h0) vzg0Var.a("KEY_SCREEN_STATE");
                f9h0 f9h0Var3 = f9h0Var2 == null ? f9h0Var : f9h0Var2;
                ctf0Var.getClass();
                j700 j700Var2 = j700.c;
                boolean z6 = j700Var != j700Var2;
                Integer num = (Integer) vzg0Var.a("KEY_CURRENT_TAB");
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    int iOrdinal = j700Var.ordinal();
                    if (iOrdinal == 0) {
                        iIntValue = 1;
                    } else if (iOrdinal == 1 || iOrdinal == 2) {
                        iIntValue = 0;
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        iIntValue = 2;
                    }
                }
                lak0 lak0Var2 = lak0.c;
                boolean z7 = (j700Var == j700Var2 || (j700Var == j700.d && (f9h0Var3 instanceof d8h0)) || (f9h0Var3 instanceof m8h0) || (f9h0Var3 instanceof p8h0)) ? false : true;
                a4x a4xVarO0 = dyb.o0(tx3.f0(jArr));
                String strA3 = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                String strR = ntb.R(f9h0Var3, ctf0Var);
                String str2 = (String) vzg0Var.a("KEY_SEARCH_QUERY");
                String str3 = str2 == null ? "" : str2;
                j6m0 j6m0Var = ygq0.b;
                Integer num2 = (Integer) vzg0Var.a("KEY_TIME_FILTER_ID");
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                j6m0Var.getClass();
                ygq0 ygq0VarA = j6m0.a(iIntValue2);
                Long l = (Long) vzg0Var.a("KEY_TIME_FILTER_START");
                long jLongValue = l != null ? l.longValue() : -1L;
                Long l2 = (Long) vzg0Var.a("KEY_TIME_FILTER_END");
                ghq0 ghq0Var = new ghq0(ygq0VarA, new wgq0(jLongValue, l2 != null ? l2.longValue() : -1L));
                Boolean bool = (Boolean) vzg0Var.a("KEY_DISABLED_TOOLBAR_ENABLE_STATE");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                Boolean bool2 = (Boolean) vzg0Var.a("KEY_MULTISELECT_ACTIVE_STATE");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = (Boolean) vzg0Var.a("KEY_STREAM_ACTIVE_STATE");
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = (Boolean) vzg0Var.a("KEY_TIME_ACTIVE_STATE");
                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                zmb zmbVar = (zmb) vzg0Var.a("KEY_CHAMP_SORT_TYPE");
                if (zmbVar == null) {
                    zmbVar = zmb.f44617a;
                }
                return new pnp(null, false, strR, f9h0Var3, strA3, str3, true, false, lak0Var2, z6, iIntValue, z7, a4xVarO0, j700Var, lak0Var2, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zmbVar, ghq0Var);
            case 9:
                SportGameDashboardScreenParams sportGameDashboardScreenParams = (SportGameDashboardScreenParams) obj5;
                vzg0 vzg0Var2 = (vzg0) obj4;
                lbu lbuVar = (lbu) obj3;
                wyu wyuVar = (wyu) obj2;
                r9u r9uVar3 = (r9u) obj;
                long jLongValue2 = sportGameDashboardScreenParams.c;
                boolean z8 = sportGameDashboardScreenParams.b;
                String strH = h97.h(jLongValue2, "KEY_GAME_ID");
                String strH2 = h97.h(jLongValue2, "KEY_GAME_TYPE");
                Integer num3 = (Integer) vzg0Var2.a("KEY_BROADCASTING_INDEX");
                Long l3 = (Long) vzg0Var2.a(strH);
                if (l3 != null) {
                    jLongValue2 = l3.longValue();
                }
                long j = jLongValue2;
                Boolean bool5 = (Boolean) vzg0Var2.a("KEY_LIVE");
                boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : z8;
                long j2 = sportGameDashboardScreenParams.f47002a;
                boolean zJ3 = lbuVar.j();
                long j3 = sportGameDashboardScreenParams.e;
                Long l4 = (Long) vzg0Var2.a("KEY_CHAMP_ID");
                Boolean bool6 = (Boolean) vzg0Var2.a("KEY_SHOW_SUB_GAMES");
                boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : true;
                iun iunVar4 = iun.f15405a;
                t3z t3zVarH = (t3z) vzg0Var2.a(strH2);
                if (t3zVarH == null) {
                    t3z.f33292a.getClass();
                    t3zVarH = rqt.h(z8, false, false);
                }
                t3z t3zVar = t3zVarH;
                Long l5 = (Long) vzg0Var2.a("KEY_CATEGORY_ID");
                xun xunVar = xun.f41520a;
                py20 py20Var = (py20) vzg0Var2.a("KEY_MARKETS_ANCHOR_STATE");
                if (py20Var == null) {
                    py20Var = py20.f27786a;
                }
                py20 py20Var2 = py20Var;
                boolean z9 = !h97.A(wyuVar, uaq0.f35345a);
                ygp ygpVar4 = ygp.t;
                r9uVar3.getClass();
                j1q0 j1q0Var5 = r9uVar3.f30104a;
                j1q0Var5.getClass();
                return new r7s(j, "", null, zBooleanValue5, j2, j3, l4, t3zVar, zJ3, xunVar, py20Var2, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, num3, false, false, z9, "", "", true, zBooleanValue6, false, false, null, null, l5, null, null, null, null, iunVar4, j1q0Var5.f15748a.d(ygpVar4), iunVar4, false);
            case 10:
                vzg0 vzg0Var3 = (vzg0) obj5;
                GlobalSearchContainerSettings globalSearchContainerSettings = (GlobalSearchContainerSettings) obj4;
                pru pruVar = (pru) obj3;
                lbu lbuVar2 = (lbu) obj;
                ctf0 ctf0Var2 = (ctf0) obj2;
                String str4 = (String) vzg0Var3.a("SAVED_QUERY_STATE_HANDLE_KEY");
                String str5 = str4 == null ? "" : str4;
                bfo0 f46913a = (bfo0) vzg0Var3.a("SAVED_SELECTED_TAB_HANDLE_KEY");
                if (f46913a == null) {
                    f46913a = globalSearchContainerSettings.getF46913a();
                }
                bfo0 bfo0Var = f46913a;
                sff0 sff0VarA6 = pruVar.a();
                hl1 hl1Var = sff0VarA6.b;
                boolean z10 = hl1Var.b;
                boolean zJ4 = lbuVar2.j();
                ctf0Var2.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                boolean z11 = globalSearchContainerSettings.equals(GlobalSearchContainerSettings.FromBetSlip.f46915a) || globalSearchContainerSettings.equals(GlobalSearchContainerSettings.FavoriteTeam.f46914a);
                bfo0 bfo0Var2 = bfo0.f2512a;
                lsm0 lsm0Var = ctf0Var2.b;
                lc00VarB.add(new jfo0(bfo0Var2, lsm0Var.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), false));
                if (!zJ4) {
                    q1w0 q1w0Var = sff0VarA6.d;
                    if (q1w0Var.b && !z11) {
                        bfo0 bfo0Var3 = bfo0.b;
                        String strA4 = q1w0Var.f27973a.b;
                        if (strA4.length() == 0) {
                            strA4 = lsm0Var.a(R.string.tag_one_x_games, Arrays.copyOf(new Object[0], 0));
                        }
                        lc00VarB.add(new jfo0(bfo0Var3, strA4, false));
                    }
                }
                if (!zJ4 && !z11) {
                    boolean z12 = hl1Var.C;
                    if (z10 || z12) {
                        lc00VarB.add(new jfo0(bfo0.c, z12 ? lsm0Var.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.casino_games, Arrays.copyOf(new Object[0], 0)), false));
                    }
                }
                if (!zJ4 && !z11 && hl1Var.d && z10) {
                    lc00VarB.add(new jfo0(bfo0.d, lsm0Var.a(R.string.casino_providers, Arrays.copyOf(new Object[0], 0)), false));
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                Boolean bool7 = (Boolean) vzg0Var3.a("SEARCH_FOCUSED_KEY");
                return new r8v(str5, lc00VarA, bfo0Var, g8v.class.getSimpleName(), bool7 != null ? bool7.booleanValue() : true);
            case 11:
                zri zriVar = (zri) obj4;
                iqt iqtVar2 = (iqt) obj5;
                bzt bztVar2 = (bzt) obj2;
                q250 q250Var = (q250) obj;
                sff0 sff0VarA7 = ((pru) obj3).a();
                hl1 hl1Var2 = sff0VarA7.b;
                mi0 mi0Var = hl1Var2.c == ep1.AGGREGATOR ? mi0.MY_AGGREGATOR : null;
                if (mi0Var == null) {
                    mi0Var = mi0.MY_VIRTUAL;
                }
                mi0 mi0Var2 = mi0Var;
                return new p650(mi0Var2, hl1Var2.f, hl1Var2.t, hl1Var2.l, sff0VarA7.g.e, bztVar2.f3488a.a().r, null, thb.v(zriVar.p(mi0Var2)), xun.f41520a, sff0VarA7.O0, sff0VarA7.l.n, hl1Var2.f13233a.d, hl1Var2.K, iqtVar2.f15225a.a(), hl1Var2.z, hl1Var2.A, q250Var);
            case 12:
                xrt xrtVar = (xrt) obj4;
                bzt bztVar3 = (bzt) obj2;
                iqt iqtVar3 = (iqt) obj5;
                wyu wyuVar2 = (wyu) obj;
                sff0 sff0VarA8 = ((pru) obj3).a();
                hl1 hl1Var3 = sff0VarA8.b;
                boolean z13 = hl1Var3.C;
                boolean z14 = sff0VarA8.O0;
                switch (hl1Var3.e) {
                    case SQUARE_S:
                        jq5Var = new jq5();
                        break;
                    case SQUARE_S_NO_TITLE:
                        jq5Var = kq5.f18703a;
                        break;
                    case SQUARE_L:
                        jq5Var = hq5.f13470a;
                        break;
                    case SQUARE_L_NO_TITLE:
                        jq5Var = iq5.f15191a;
                        break;
                    case RECTANGLE_VERTICAL:
                        jq5Var = fq5.f9956a;
                        break;
                    case RECTANGLE_VERTICAL_NO_TITLE:
                        jq5Var = gq5.f11714a;
                        break;
                    case RECTANGLE_HORIZONTAL:
                        jq5Var = dq5.f6497a;
                        break;
                    case RECTANGLE_HORIZONTAL_NO_TITLE:
                        jq5Var = eq5.f8219a;
                        break;
                    case CARD_HORIZONTAL:
                        jq5Var = cq5.f4775a;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return new d0b0(new xza0(null, false, false), new zza0(null, false, false), new yza0(null, false, false), new b0b0(false, false, null), xun.f41520a, new c0b0(z13, z14, jq5Var, hl1Var3.l, hl1Var3.d, hl1Var3.f13233a.k, xrtVar.a() && sff0VarA8.L.e, bztVar3.f3488a.a().r, hl1Var3.z, hl1Var3.A, hl1Var3.B), iqtVar3.f15225a.a(), true, false, !h97.A(wyuVar2, uaq0.f35345a), null, false);
            case 13:
                r9u r9uVar4 = (r9u) obj;
                sff0 sff0VarA9 = ((pru) obj3).a();
                v8d v8dVarA = ((bzt) obj5).f3488a.a();
                boolean zJ5 = ((lbu) obj4).j();
                List listA3 = ((luu) obj2).f20692a.a();
                iun iunVar5 = iun.f15405a;
                v5l0 v5l0Var = sff0VarA9.g.y;
                int i = v8dVarA.r;
                boolean z15 = sff0VarA9.J;
                boolean z16 = sff0VarA9.J1;
                ygp ygpVar5 = ygp.t;
                r9uVar4.getClass();
                j1q0 j1q0Var6 = r9uVar4.f30104a;
                j1q0Var6.getClass();
                return new aef0(iunVar5, true, false, v5l0Var, i, z15, zJ5, listA3, null, z16, j1q0Var6.f15748a.d(ygpVar5));
            case 14:
                ResultsScreenParams resultsScreenParams = (ResultsScreenParams) obj4;
                r9u r9uVar5 = (r9u) obj;
                lok0 lok0VarA = ((kuu) obj5).a(resultsScreenParams.f46971a);
                sff0 sff0VarA10 = ((pru) obj3).a();
                int i2 = resultsScreenParams.f46971a;
                String str6 = lok0VarA.b;
                Set set = (Set) ((vzg0) obj2).a("EXPANDED_IDS_KEY");
                if (set == null) {
                    set = xun.f41520a;
                }
                Set set2 = set;
                boolean z17 = lok0VarA.n;
                boolean z18 = lok0VarA.p;
                String str7 = lok0VarA.u;
                iun iunVar6 = iun.f15405a;
                q5g0 q5g0Var = q5g0.f28150a;
                v5l0 v5l0VarP = xdx.P(lok0VarA.e, sff0VarA10);
                xun xunVar2 = xun.f41520a;
                Long l6 = resultsScreenParams.c;
                yl9 yl9Var = new yl9(xunVar2, l6 != null ? new Date(l6.longValue()) : null);
                ygp ygpVar6 = ygp.t;
                r9uVar5.getClass();
                j1q0 j1q0Var7 = r9uVar5.f30104a;
                j1q0Var7.getClass();
                return new e9g0(i2, str6, set2, z17, z18, str7, iunVar6, q5g0Var, -321L, iunVar6, v5l0VarP, null, yl9Var, j1q0Var7.f15748a.d(ygpVar6));
            case 15:
                return new glb0(true, true, ((puu) obj5).a(), true, ((lbu) obj4).j(), new kl5(), (y78) obj3, new kl5(), (g2v) obj, (ctf0) obj2, new kl5(), new kl5(), new kl5(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), iun.f15405a, null, false);
            case 16:
                vzg0 vzg0Var4 = (vzg0) obj5;
                m7r0 m7r0Var = (m7r0) obj4;
                g2v g2vVar = (g2v) obj2;
                y78 y78Var = (y78) obj;
                sff0 sff0VarA11 = ((pru) obj3).a();
                Boolean bool8 = (Boolean) vzg0Var4.a("SAVED_VIDEO_FILTER_KEY");
                boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
                m7r0 m7r0Var2 = (m7r0) vzg0Var4.a("SAVED_CURRENT_TAB_KEY");
                m7r0 m7r0Var3 = m7r0Var2 == null ? m7r0Var : m7r0Var2;
                h8l0 h8l0Var = h8l0.LARGE_HEADER_MEDIUM_TABS;
                g8l0 g8l0Var = g8l0.BOTTOM_SHEET;
                String str8 = (String) vzg0Var4.a("SAVED_QUERY_STATE_HANDLE_KEY");
                String str9 = str8 == null ? "" : str8;
                Boolean bool9 = (Boolean) vzg0Var4.a("SAVED_SEARCH_IS_ACTIVE_KEY");
                boolean zBooleanValue8 = bool9 != null ? bool9.booleanValue() : false;
                uuz uuzVar = new uuz();
                zvh0 zvh0Var = sff0VarA11.g.x;
                ldt ldtVar = ldt.f19868a;
                return new w6r0(g2vVar, zBooleanValue7, zBooleanValue8, m7r0Var3, h8l0Var, g8l0Var, y78Var, null, null, null, null, null, str9, true, false, uuzVar, ldtVar, ldtVar, false, false, zvh0Var, false, true);
            case 17:
                return new ftr0(new tjr0(h97.A((wyu) obj5, uaq0.f35345a), ((ctu) obj4).f4960a.r(), (int) ((hru) obj2).a()), ((lk5) obj).c(j820.c), ((pru) obj3).a().g.x, vsr0.SIMPLE, new rm5(0L, 0.0d, ""), new pur0(new rjr0(new a8q0((String) null, 0L, 7), new BigDecimal(String.valueOf(0.0d)), new BigDecimal(String.valueOf(0.0d)), new BigDecimal(String.valueOf(0.0d)), new BigDecimal(String.valueOf(0.0d)), "", true, true), ""), true, null);
            default:
                ywv0 ywv0Var = (ywv0) obj5;
                cuv0 cuv0Var = (cuv0) obj4;
                Function2 function2 = (Function2) obj3;
                nsv0 nsv0Var = (nsv0) obj2;
                Function2 function3 = (Function2) obj;
                buv0 buv0Var = ywv0Var.h;
                fuj0 fuj0Var = ywv0Var.g;
                if (!Intrinsics.d(buv0Var.k, cuv0Var)) {
                    buv0Var.k = cuv0Var;
                }
                if (function2 == null) {
                    fuj0Var.j(tsv0.c, nsv0Var);
                }
                if (function3 == null) {
                    fuj0Var.j(tsv0.f34482a, nsv0Var);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ng0(pru pruVar, ctf0 ctf0Var, yiu yiuVar, r9u r9uVar, BetHistoryScreenModel betHistoryScreenModel) {
        this.f23461a = (byte) 3;
        this.b = pruVar;
        this.e = ctf0Var;
        this.c = yiuVar;
        this.d = r9uVar;
        this.f = betHistoryScreenModel;
    }

    public /* synthetic */ ng0(pru pruVar, Object obj, Object obj2, iqt iqtVar, Object obj3, byte b) {
        this.f23461a = b;
        this.b = pruVar;
        this.d = obj;
        this.e = obj2;
        this.c = iqtVar;
        this.f = obj3;
    }

    public /* synthetic */ ng0(pru pruVar, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f23461a = b;
        this.b = pruVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ng0(wyu wyuVar, ctu ctuVar, hru hruVar, lk5 lk5Var, pru pruVar) {
        this.f23461a = (byte) 17;
        this.c = wyuVar;
        this.d = ctuVar;
        this.e = hruVar;
        this.f = lk5Var;
        this.b = pruVar;
    }

    public /* synthetic */ ng0(ctf0 ctf0Var, j700 j700Var, vzg0 vzg0Var, f9h0 f9h0Var, long[] jArr) {
        this.f23461a = (byte) 8;
        this.e = ctf0Var;
        this.c = j700Var;
        this.d = vzg0Var;
        this.b = f9h0Var;
        this.f = jArr;
    }

    public /* synthetic */ ng0(Object obj, Object obj2, Object obj3, Object obj4, ctf0 ctf0Var, byte b) {
        this.f23461a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.f = obj4;
        this.e = ctf0Var;
    }

    public /* synthetic */ ng0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f23461a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ng0(CyberChampParams cyberChampParams, pru pruVar, luu luuVar, lbu lbuVar, r9u r9uVar) {
        this.f23461a = (byte) 6;
        this.c = cyberChampParams;
        this.b = pruVar;
        this.d = luuVar;
        this.e = lbuVar;
        this.f = r9uVar;
    }
}
