package a;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.javax.sip.message.Response;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.GLES20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.feed.linelive.presentation.feeds.child.sports.models.SportItemsSelectionState;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g8l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10869a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g8l(Object obj, Object obj2, Object obj3, byte b) {
        this.f10869a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fT;
        lc00 lc00VarA;
        jge0 jge0VarC;
        jge0 jge0VarC2;
        Object[] objArr = 0;
        switch (this.f10869a) {
            case 0:
                i8l i8lVar = (i8l) this.d;
                List<? extends a3l> list = (List) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                i8lVar.i = true;
                i8lVar.setMapBuildings(list);
                i8lVar.setMapHeroes(arrayList);
                return Unit.f46060a;
            case 1:
                d9l d9lVar = (d9l) this.d;
                List<? extends a3l> list2 = (List) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                d9lVar.x = true;
                d9lVar.setMapBuildings(list2);
                d9lVar.setMapHeroes(arrayList2);
                return Unit.f46060a;
            case 2:
                a4x a4xVar = (a4x) this.d;
                xk80 xk80Var = (xk80) this.b;
                cgk0 cgk0Var = (cgk0) this.c;
                pr5 pr5Var = (pr5) CollectionsKt.W(xk80Var.k(), a4xVar);
                ds5 ds5Var = pr5Var != null ? pr5Var.c : null;
                if (ds5Var == null) {
                    fT = f7k.T((int) (cgk0Var.l() / 1.7142857f));
                } else {
                    if (!(ds5Var instanceof ds5)) {
                        t9f.b();
                        return null;
                    }
                    fT = ds5Var.f6595a;
                }
                return new ycl(fT);
            case 3:
                omv omvVar = (omv) this.d;
                yvl yvlVar = (yvl) this.b;
                Function0 function0 = (Function0) this.c;
                ckb.a0(omvVar, yvlVar.f43325a == evq0.f8484a ? 22 : 21);
                function0.invoke();
                return Unit.f46060a;
            case 4:
                ((Function2) this.d).invoke(Integer.valueOf(((kzc0) this.b).f19148a), (String) ((pz40) this.c).getValue());
                return Unit.f46060a;
            case 5:
                cqq cqqVar = (cqq) this.d;
                pz40 pz40Var = (pz40) this.b;
                Function1 function1 = (Function1) this.c;
                cqq.a(cqqVar);
                aac.o(pz40Var, function1, a8q0.b((a8q0) pz40Var.getValue(), "", s7n0.e(0, 0), 4));
                return Unit.f46060a;
            case 6:
                rqm rqmVar = (rqm) this.d;
                Function0 function2 = (Function0) this.b;
                Function0 function3 = (Function0) this.c;
                if (rqmVar.h) {
                    if (function2 != null) {
                        function2.invoke();
                    }
                } else if (function3 != null) {
                    function3.invoke();
                }
                return Unit.f46060a;
            case 7:
                lan lanVar = (lan) this.d;
                Function1 function4 = (Function1) this.b;
                pz40 pz40Var2 = (pz40) this.c;
                if (!((jan) lanVar).g) {
                    function4.invoke(pz40Var2.getValue());
                }
                return Unit.f46060a;
            case 8:
                MarketsParams.DuelSubGame duelSubGame = (MarketsParams.DuelSubGame) this.d;
                edu eduVar = (edu) this.b;
                r9u r9uVar = (r9u) this.c;
                iun iunVar = iun.f15405a;
                long j = duelSubGame.c;
                aw20 aw20VarG = eduVar.g();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new cdn(iunVar, iunVar, null, j, true, null, aw20VarG, j1q0Var.f15748a.d(ygpVar));
            case 9:
                edu eduVar2 = (edu) this.d;
                r9u r9uVar2 = (r9u) this.b;
                bzt bztVar = (bzt) this.c;
                aw20 aw20VarG2 = eduVar2.g();
                ygp ygpVar2 = ygp.t;
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                return new ipn(aw20VarG2, j1q0Var2.f15748a.d(ygpVar2), bztVar.f3488a.a().r, mon.f22142a);
            case 10:
                String[] strArr = (String[]) this.d;
                boolean[] zArr = (boolean[]) this.b;
                Object obj = this.c;
                try {
                    try {
                        strArr[0] = GLES20.glGetString(7937);
                        zArr[0] = true;
                        synchronized (obj) {
                            obj.notify();
                            break;
                        }
                    } catch (Exception unused) {
                        strArr[0] = null;
                        zArr[0] = true;
                        synchronized (obj) {
                            obj.notify();
                            break;
                        }
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    zArr[0] = true;
                    synchronized (obj) {
                        obj.notify();
                        throw th;
                    }
                }
            case 11:
                mco mcoVar = (mco) this.d;
                n0o0 n0o0Var = mcoVar.o;
                n0o0 n0o0Var2 = mcoVar.q;
                n0o0 n0o0Var3 = mcoVar.m;
                n0o0 n0o0Var4 = mcoVar.s;
                n0o0 n0o0Var5 = mcoVar.p;
                n0o0 n0o0Var6 = mcoVar.n;
                n0o0 n0o0Var7 = mcoVar.r;
                n0o0 n0o0Var8 = mcoVar.l;
                n0o0 n0o0Var9 = mcoVar.k;
                jih jihVar = (jih) this.b;
                Object obj2 = jihVar.c;
                zjw zjwVar = (zjw) this.c;
                Map map = zjwVar.m;
                CyberGamesPage cyberGamesPage = zjwVar.g.f7971a;
                Long l = (Long) map.get(cyberGamesPage);
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = (Long) zjwVar.n.get(cyberGamesPage);
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                List list3 = (List) zjwVar.o.get(cyberGamesPage);
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                List list4 = (List) zjwVar.p.get(cyberGamesPage);
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                fee feeVar = (fee) n0o0Var9.getValue();
                Object obj3 = jihVar.d;
                e0g0 e0g0Var = j0g0.b;
                Collection collection = (List) (obj2 instanceof g0g0 ? null : obj2);
                if (collection == null) {
                    collection = iun.f15405a;
                }
                boolean z = obj3 instanceof g0g0;
                Iterable iterable = (List) (z ? null : obj3);
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                feeVar.d(CollectionsKt.q0(collection, iterable));
                fee feeVar2 = (fee) n0o0Var8.getValue();
                Object obj4 = jihVar.b;
                if (obj4 instanceof g0g0) {
                    obj4 = null;
                }
                Object obj5 = (List) obj4;
                if (obj5 == null) {
                    obj5 = iun.f15405a;
                }
                feeVar2.d(obj5);
                fee feeVar3 = (fee) n0o0Var7.getValue();
                feeVar3.getClass();
                pz40 pz40VarA = feeVar3.a();
                ((xbo) feeVar3.a().getValue()).getClass();
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                List list5 = (List) obj2;
                if (list5 == null) {
                    list5 = iun.f15405a;
                }
                pz40VarA.setValue(new xbo(jLongValue, list5, list3));
                fee feeVar4 = (fee) n0o0Var6.getValue();
                Object obj6 = jihVar.e;
                if (obj6 instanceof g0g0) {
                    obj6 = null;
                }
                Object obj7 = (List) obj6;
                if (obj7 == null) {
                    obj7 = iun.f15405a;
                }
                feeVar4.d(obj7);
                ((fee) n0o0Var5.getValue()).d(phu0.W(jihVar));
                fee feeVar5 = (fee) n0o0Var4.getValue();
                feeVar5.getClass();
                pz40 pz40VarA2 = feeVar5.a();
                ((xbo) feeVar5.a().getValue()).getClass();
                List list6 = (List) (z ? null : obj3);
                if (list6 == null) {
                    list6 = iun.f15405a;
                }
                pz40VarA2.setValue(new xbo(jLongValue2, list6, list4));
                ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(kih.a(jihVar, ((ekw) mcoVar.a().c()).f7971a, true)));
                fee feeVar6 = (fee) n0o0Var2.getValue();
                Object obj8 = jihVar.h;
                if (obj8 instanceof g0g0) {
                    obj8 = null;
                }
                Object obj9 = (List) obj8;
                if (obj9 == null) {
                    obj9 = iun.f15405a;
                }
                feeVar6.d(obj9);
                fee feeVar7 = (fee) n0o0Var.getValue();
                Object obj10 = jihVar.i;
                if (obj10 instanceof g0g0) {
                    obj10 = null;
                }
                List list7 = (List) obj10;
                if (list7 == null) {
                    list7 = iun.f15405a;
                }
                feeVar7.d(cwr0.S(list7));
                if (cyberGamesPage instanceof CyberGamesPage.Real) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    lc00VarB.add(((fee) n0o0Var9.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var7.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var6.getValue()).b());
                    lc00VarA = kotlin.collections.a.a(lc00VarB);
                } else {
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    lc00VarB2.add(((fee) n0o0Var9.getValue()).b());
                    lc00VarB2.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                    lc00VarB2.addAll((Collection) ((fee) n0o0Var7.getValue()).b());
                    lc00VarB2.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                    lc00VarB2.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                    lc00VarA = kotlin.collections.a.a(lc00VarB2);
                }
                return dyb.o0(lc00VarA);
            case 12:
                vzg0 vzg0Var = (vzg0) this.d;
                ctf0 ctf0Var = (ctf0) this.b;
                FeedsChampsItemsScreenParams feedsChampsItemsScreenParams = (FeedsChampsItemsScreenParams) this.c;
                FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = new FeedsChampsItemsSelectionState(xun.f41520a, false);
                FeedsChampsItemsSelectionState feedsChampsItemsSelectionState2 = (FeedsChampsItemsSelectionState) vzg0Var.a("SELECTION_STATE_KEY");
                FeedsChampsItemsSelectionState feedsChampsItemsSelectionState3 = feedsChampsItemsSelectionState2 == null ? feedsChampsItemsSelectionState : feedsChampsItemsSelectionState2;
                Set setB = (Set) vzg0Var.a("EXPANDED_STATE_KEY");
                if (setB == null) {
                    setB = cui0.b("-2");
                }
                Set set = setB;
                iun iunVar2 = iun.f15405a;
                jnb jnbVar = new jnb(new knb(iunVar2, iunVar2), iunVar2);
                String strA = ctf0Var.b.a(R.string.feeds_sport_events_count_new, Arrays.copyOf(new Object[0], 0));
                j700 j700Var = feedsChampsItemsScreenParams.b;
                List list8 = (List) vzg0Var.a("EXPANDED_GAMES_STATE_KEY");
                return new xmp(jnbVar, null, "", set, feedsChampsItemsSelectionState3, false, true, false, list8 == null ? iunVar2 : list8, strA, false, j700Var, zmb.f44617a, false);
            case 13:
                vzg0 vzg0Var2 = (vzg0) this.d;
                ctf0 ctf0Var2 = (ctf0) this.b;
                j700 j700Var2 = (j700) this.c;
                SportItemsSelectionState sportItemsSelectionState = new SportItemsSelectionState(xun.f41520a, false);
                SportItemsSelectionState sportItemsSelectionState2 = (SportItemsSelectionState) vzg0Var2.a("SELECTION_STATE_KEY");
                SportItemsSelectionState sportItemsSelectionState3 = sportItemsSelectionState2 == null ? sportItemsSelectionState : sportItemsSelectionState2;
                iun iunVar3 = iun.f15405a;
                return new ngl0(iunVar3, iunVar3, "", null, j700Var2, sportItemsSelectionState3, false, true, false, false, false, ctf0Var2.b.a(R.string.feeds_sport_events_count_new, Arrays.copyOf(new Object[0], 0)), false);
            case 14:
                yqt yqtVar = (yqt) this.d;
                w1u w1uVar = (w1u) this.b;
                w4u w4uVar = (w4u) this.c;
                zzp0 zzp0VarA = yqtVar.a();
                return new t4q(Intrinsics.d((rgv0) w1uVar.f38418a.f17481a.f12247a, rgv0.g), zzp0VarA, (zzp0) w4uVar.f38559a.f17481a.d, zzp0VarA);
            case 15:
                pru pruVar = (pru) this.d;
                return new z7w(q3d.l(HistoryTypeModel.EVENTS), pruVar.a().f32117a.f, (f8w) this.b, (HistoryTypeModel) this.c, pruVar.a().f32117a.b.f);
            case 16:
                hie0 hie0Var = (hie0) this.d;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.b;
                o1e o1eVar = (o1e) this.c;
                if (hie0Var.f13108a) {
                    wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(o1eVar);
                }
                return Unit.f46060a;
            case 17:
                ((Function2) this.d).invoke(Long.valueOf(((jvy) this.b).f17225a), (String) ((pz40) this.c).getValue());
                return Unit.f46060a;
            case 18:
                luu luuVar = (luu) this.d;
                pru pruVar2 = (pru) this.b;
                r9u r9uVar3 = (r9u) this.c;
                lel0.Companion.getClass();
                ypl0 ypl0Var = new ypl0(0L, "", kel0.a());
                xun xunVar = xun.f41520a;
                List listA = luuVar.f20692a.a();
                sff0 sff0VarA = pruVar2.a();
                ygp ygpVar3 = ygp.t;
                j1q0 j1q0Var3 = r9uVar3.f30104a;
                j1q0Var3.getClass();
                return new pyy(false, ypl0Var, null, xunVar, listA, sff0VarA, j1q0Var3.f15748a.d(ygpVar3));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kxq kxqVar = (kxq) this.d;
                String str = (String) this.b;
                wdk0 wdk0Var = (wdk0) this.c;
                try {
                    try {
                        kxqVar.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=".concat(str))));
                    } catch (ActivityNotFoundException unused2) {
                        n6x.h0(kxqVar, wdk0Var);
                    }
                    break;
                } catch (ActivityNotFoundException unused3) {
                    kxqVar.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://play.google.com/store/apps/details?id=".concat(str))));
                    break;
                } catch (Exception unused4) {
                    n6x.h0(kxqVar, wdk0Var);
                }
                return Unit.f46060a;
            case 20:
                return new jk80((ydr) ((pz40) this.d).getValue(), (Function1) ((pz40) this.b).getValue(), ((Number) ((Function0) this.c).invoke()).intValue());
            case 21:
                zbk zbkVar = (zbk) this.d;
                xcz xczVar = (xcz) this.b;
                g9z g9zVar = (g9z) this.c;
                hcz hczVar = (hcz) zbkVar.getValue();
                return new icz(xczVar, hczVar, g9zVar, new androidx.compose.foundation.lazy.layout.c((IntRange) xczVar.e.f.getValue(), hczVar));
            case 22:
                return new b800((cp) this.d, (gkz) this.b, (gkz) this.c);
            case 23:
                Function2 function5 = (Function2) this.d;
                mie0 mie0Var = (mie0) this.b;
                Object obj11 = (xlw) this.c;
                c810 c810Var = (c810) mie0Var.f21842a;
                hz40 hz40Var = c810Var.m;
                if (hz40Var == null) {
                    long[] jArr = u1h0.f34903a;
                    hz40Var = new hz40();
                    c810Var.m = hz40Var;
                }
                Object objG = hz40Var.g(obj11);
                if (objG == null) {
                    objG = new a810(c810Var);
                    hz40Var.n(obj11, objG);
                }
                a810 a810Var = (a810) objG;
                a810Var.f402a = false;
                function5.invoke(a810Var, obj11);
                return Unit.f46060a;
            case 24:
                return Integer.valueOf(((cgk0) this.c).l() + ((cgk0) this.b).l() + ((cgk0) this.d).l());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xpj0 xpj0Var = (xpj0) this.d;
                vne vneVar = (vne) this.b;
                xpj0 xpj0Var2 = (xpj0) this.c;
                if (((Boolean) ((Function1) xpj0Var.e.e).invoke(ypj0.b)).booleanValue()) {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var2, objArr == true ? 1 : 0, (byte) 13), 3);
                }
                return Boolean.TRUE;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((vzg0) this.d).c(this.c, (String) this.b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Function0 function6 = (Function0) this.d;
                gc50 gc50Var = (gc50) this.b;
                jc50 jc50Var = (jc50) this.c;
                function6.invoke();
                gc50Var.d.invoke();
                jc50Var.f.invoke();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ctf0 ctf0Var3 = (ctf0) this.d;
                g2v g2vVar = (g2v) this.b;
                qho qhoVar = (qho) this.c;
                String strA2 = ctf0Var3.b.a(R.string.favorites_settings_title, Arrays.copyOf(new Object[0], 0));
                j060 j060Var = new j060(0, 0, 0, 0, 0, 0, 0);
                iun iunVar4 = iun.f15405a;
                return new q060("NoTabsDashboardFiltersViewModel", strA2, null, j060Var, iunVar4, iunVar4, iunVar4, false, true, g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), qhoVar);
            default:
                Function1 function7 = (Function1) this.d;
                s460 s460Var = (s460) this.b;
                hie0 hie0Var2 = (hie0) this.c;
                jge0 jge0Var = jge0.e;
                uag0 uag0Var = s460.y1;
                function7.invoke(uag0Var);
                boolean zD = Intrinsics.d(s460Var.k1, uag0Var.o);
                boolean z2 = s460Var.n1 != uag0Var.p;
                x1x x1xVarA = uag0Var.o.a(uag0Var.r, uag0Var.u, uag0Var.t);
                uag0Var.y = x1xVarA;
                boolean zD2 = Intrinsics.d(s460Var.m1, x1xVarA != null ? x1xVarA.C() : null);
                hie0Var2.f13108a = !zD2;
                if (!zD || z2 || !zD2) {
                    s460Var.k1 = uag0Var.o;
                    s460Var.n1 = uag0Var.p;
                    x1x x1xVar = uag0Var.y;
                    if (x1xVar == null || (jge0VarC = x1xVar.C()) == null) {
                        jge0VarC = jge0Var;
                    }
                    s460Var.m1 = jge0VarC;
                    x1x x1xVar2 = uag0Var.y;
                    if (x1xVar2 != null && (jge0VarC2 = x1xVar2.C()) != null) {
                        mkx mkxVarC = m2x.C(jge0VarC2);
                        jge0Var = new jge0(mkxVarC.f21964a, mkxVarC.b, mkxVarC.c, mkxVarC.d);
                    }
                    s460Var.l1 = jge0Var;
                    if (s460Var.o1 && (z2 || (s460Var.n1 && !zD))) {
                        s460Var.u.G();
                    }
                }
                s460Var.o1 = true;
                return Unit.f46060a;
        }
    }
}
