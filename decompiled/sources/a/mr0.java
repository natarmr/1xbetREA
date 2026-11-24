package a;

import android.content.Context;
import android.javax.sip.message.Response;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.crystal.presentation.views.CrystalFieldView;
import org.xplatform.cyber.game.core.betting.presentation.sub_games_filter.SubGamesFilterBottomSheetParams;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22245a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mr0(a570 a570Var, yn2 yn2Var, String str, String str2) {
        this.f22245a = (byte) 2;
        this.d = a570Var;
        this.e = yn2Var;
        this.b = str;
        this.c = str2;
    }

    private final Object a() {
        String str;
        long j;
        fhj fhjVar = (fhj) this.b;
        RatingStatisticScreenParams ratingStatisticScreenParams = (RatingStatisticScreenParams) this.c;
        wyu wyuVar = (wyu) this.d;
        qzt qztVar = (qzt) this.e;
        boolean z = ratingStatisticScreenParams instanceof RatingStatisticScreenParams.EventParamsStatistic;
        if (z) {
            str = "";
        } else {
            if (!(ratingStatisticScreenParams instanceof RatingStatisticScreenParams.GameParamsStatistic)) {
                t9f.b();
                return null;
            }
            str = ((RatingStatisticScreenParams.GameParamsStatistic) ratingStatisticScreenParams).f47061a;
        }
        long b = ratingStatisticScreenParams.getB();
        uaq0 uaq0VarA = wyuVar.a();
        if (z) {
            j = ((RatingStatisticScreenParams.EventParamsStatistic) ratingStatisticScreenParams).b;
        } else {
            if (!(ratingStatisticScreenParams instanceof RatingStatisticScreenParams.GameParamsStatistic)) {
                t9f.b();
                return null;
            }
            j = 0;
        }
        nc5 nc5VarS = fhjVar.s(str, b, uaq0VarA, j);
        eme emeVarA = qztVar.a();
        HashMap map = new HashMap();
        y4e0 y4e0Var = new y4e0(0, "");
        iun iunVar = iun.f15405a;
        return new l8e0(true, false, null, nc5VarS, emeVarA, map, new h8e0(y4e0Var, iunVar, iunVar, iunVar, null), null, 0, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:173:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x05c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x05c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:178:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:179:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:182:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:185:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:188:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:189:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:192:0x0617  */
    /* JADX WARN: Code duplicated, block: B:195:0x0627  */
    /* JADX WARN: Code duplicated, block: B:198:0x063e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0657  */
    /* JADX WARN: Code duplicated, block: B:204:0x0668  */
    /* JADX WARN: Code duplicated, block: B:207:0x0679  */
    /* JADX WARN: Code duplicated, block: B:210:0x068a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0363  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair;
        o49 o49Var;
        o49 o49Var2;
        Long l;
        Boolean bool;
        boolean zBooleanValue;
        t3z t3zVarH;
        ArrayList arrayList;
        ch00 ch00Var;
        Object objA;
        Boolean bool2;
        ch00 ch00Var2;
        ch00 ch00Var3;
        ch00 ch00Var4;
        int iOrdinal;
        o49 o49Var3;
        boolean z;
        boolean z2;
        boolean z3;
        dxh0 dxh0Var;
        byte b = this.f22245a;
        byte b2 = 7;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj2;
                pz40 pz40Var = (pz40) obj;
                if (Intrinsics.d((String) obj4, (String) obj3) && ((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.FALSE);
                } else {
                    function1.invoke(rp0.f30863a);
                }
                return Unit.f46060a;
            case 1:
                return new dz1(((ctf0) obj2).b.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), ((pru) obj).a().k.h, false, false, ((iqt) obj4).f15225a.a(), null, true, ((dmt) obj3).b(), null, null, false, new vge(lak0.c));
            case 2:
                a570 a570Var = (a570) obj2;
                yn2 yn2Var = (yn2) obj;
                String str = (String) obj4;
                String str2 = (String) obj3;
                yje yjeVar = null;
                if (a570Var instanceof w470) {
                    s470 s470Var = ((w470) a570Var).f38531a;
                    int i = yn2.g0;
                    sac.V(jiu0.a(yn2Var), new bk2(1, yn2Var, yn2.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, null, new ex1((byte) 3, yjeVar, str, yn2Var, s470Var), 14);
                } else {
                    if (!(a570Var instanceof z470)) {
                        t9f.b();
                        return null;
                    }
                    int i2 = yn2.g0;
                    sac.V(jiu0.a(yn2Var), new bk2(1, yn2Var, yn2.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 5), null, yn2Var.G.b, new xn2(yn2Var, (z470) a570Var, str2, (yje) null), 10);
                }
                return Unit.f46060a;
            case 3:
                ((xjk) obj4).f((Function0) obj3, (fjk) obj2, (k6z) obj);
                return Unit.f46060a;
            case 4:
                w6k w6kVar = (w6k) obj4;
                vhv0 vhv0Var = (vhv0) obj3;
                vhv0 vhv0Var2 = (vhv0) obj2;
                vhv0 vhv0Var3 = (vhv0) obj;
                w6kVar.getClass();
                vhv0Var.getClass();
                vhv0Var2.getClass();
                vhv0Var3.getClass();
                float fR0 = w6kVar.r0(vhv0Var.d(w6kVar));
                float fR1 = w6kVar.r0(vhv0Var2.b(w6kVar));
                k6z k6zVar = k6z.f17794a;
                return new t9o0(fR0, fR1, w6kVar.r0(vhv0Var2.a(w6kVar, k6zVar)), w6kVar.r0(vhv0Var2.c(w6kVar, k6zVar)), w6kVar.r0(vhv0Var3.d(w6kVar)), w6kVar.r0(vhv0Var3.b(w6kVar)), w6kVar.r0(vhv0Var3.a(w6kVar, k6zVar)), w6kVar.r0(vhv0Var3.c(w6kVar, k6zVar)));
            case 5:
                Context context = (Context) obj4;
                q15 q15Var = (q15) obj3;
                ru ruVar = (ru) obj2;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                m1a m1aVar = (m1a) ((n0o0) ruVar.f31100a).getValue();
                wy9 wy9Var = (wy9) ruVar.e;
                l4a l4aVar = (l4a) ruVar.d;
                context.getClass();
                q15Var.getClass();
                m1aVar.getClass();
                wy9Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = context;
                esg0Var.b = q15Var;
                esg0Var.c = m1aVar;
                esg0Var.d = (ehf0) obj;
                esg0Var.e = wy9Var;
                esg0Var.f = l4aVar;
                cbi cbiVar = new cbi(esg0Var);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                Trace.endSection();
                return cbiVar;
            case 6:
                fz9 fz9Var = (fz9) obj4;
                Context context2 = (Context) obj3;
                q15 q15Var2 = (q15) obj2;
                zen zenVar = (zen) obj;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context contextA = uje.a(context2);
                    contextA.getClass();
                    k1a k1aVar = new k1a(new rgi0(q15Var2.f27934a), 119);
                    ehf0 ehf0Var = fz9Var.f10396a;
                    m1a m1aVarA = o1a.a(new i1a(contextA, k1aVar, new h1a((x0a) ehf0Var.b, (chf0) ehf0Var.c, zenVar)));
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                        break;
                    }
                    return m1aVarA;
                } finally {
                    Trace.endSection();
                }
            case 7:
                int i3 = CrystalFieldView.j;
                ((CrystalFieldView) obj4).f((dhf) obj3, (Set) obj2, (LinkedHashMap) obj);
                return Unit.f46060a;
            case 8:
                l7m0 l7m0Var = (l7m0) obj4;
                Fragment fragment = (Fragment) obj3;
                clz clzVar = (clz) obj2;
                i3t0 i3t0Var = (i3t0) obj;
                long j = ((k7h) l7m0Var.getValue()).c;
                a4x a4xVar = ((k7h) l7m0Var.getValue()).f17819a;
                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                Iterator<E> it = a4xVar.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((h7h) it.next()).f12573a));
                }
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.getClass();
                vi6 vi6Var = new vi6(i3t0Var, (byte) 4);
                clzVar.getClass();
                m6m0 m6m0Var = kxm0.n2;
                SubGamesFilterBottomSheetParams subGamesFilterBottomSheetParams = new SubGamesFilterBottomSheetParams(j, "SUB_GAME_SELECTED_KEY");
                m6m0Var.getClass();
                String strJ = sre0.f32672a.b(kxm0.class).J();
                if (eVarC.J(strJ) == null) {
                    kxm0 kxm0Var = new kxm0();
                    kxm0Var.l2.J(kxm0Var, kxm0.o2[0], subGamesFilterBottomSheetParams);
                    kxm0Var.H0(eVarC, strJ);
                }
                eVarC.u0("SUB_GAME_SELECTED_KEY", clzVar, new b0l0(vi6Var, b2));
                return Unit.f46060a;
            case 9:
                ((agk0) obj2).m(((Number) ((t33) obj4).d()).floatValue());
                ((agk0) obj).m(((Number) ((t33) obj3).d()).floatValue());
                return Unit.f46060a;
            case 10:
                wdn wdnVar = (wdn) obj2;
                g7u g7uVar = (g7u) obj;
                List list = ebc.k0(((ibu) obj4).f14507a.f14642a.b).f12930a;
                List list2 = ebc.k0(((hbu) obj3).f12788a.f14642a.b).b;
                int iOrdinal2 = wdnVar.ordinal();
                if (iOrdinal2 == 0) {
                    pair = new Pair(list, list2);
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    pair = new Pair(list2, list);
                }
                List list3 = (List) pair.f46059a;
                List list4 = (List) pair.b;
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((tdn) it2.next()).f33777a));
                }
                Set setP0 = CollectionsKt.P0(arrayList3);
                List list5 = (List) g7uVar.f10834a.f14642a.f11164a.getValue();
                if (list5 == null) {
                    list5 = iun.f15405a;
                }
                List list6 = list5;
                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Long.valueOf(((tdn) it3.next()).f33777a));
                }
                return new ybn(wdnVar, list6, CollectionsKt.P0(arrayList4), setP0, setP0, null);
            case 11:
                v0f v0fVarD = ((vqc) ((ocl) obj4).f25032a).d();
                b3f b3fVar = ((pru) obj3).a().f32117a.c;
                q4f q4fVar = v0fVarD.b;
                int i4 = ((bzt) obj2).f3488a.a().r;
                iun iunVar = iun.f15405a;
                xte xteVar = b3fVar.i;
                rse rseVarE0 = vbc.e0(b3fVar.j.f1428a);
                en7 en7Var = new en7(0, 0, 0, 0.0d, false);
                ygp ygpVar = ygp.t;
                j1q0 j1q0Var = ((r9u) obj).f30104a;
                j1q0Var.getClass();
                return new inn(q4fVar, false, iunVar, i4, xteVar, rseVarE0, yln.f42852a, v0fVarD, lnn.f20354a, false, false, en7Var, 0L, false, j1q0Var.f15748a.d(ygpVar));
            case 12:
                iun iunVar2 = iun.f15405a;
                sff0 sff0VarA = ((pru) obj4).a();
                boolean zJ = ((lbu) obj3).j();
                a9o[] a9oVarArr = a9o.f488a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                d8o d8oVar = new d8o(1L, lunVar);
                boolean zL = ((svu) obj2).l();
                ygp ygpVar2 = ygp.t;
                j1q0 j1q0Var2 = ((r9u) obj).f30104a;
                j1q0Var2.getClass();
                return new z8o(true, null, iunVar2, sff0VarA, zJ, d8oVar, zL, j1q0Var2.f15748a.d(ygpVar2));
            case 13:
                zxp[] zxpVarArr = zxp.c;
                sff0 sff0VarA2 = ((pru) obj4).a();
                boolean zJ2 = ((lbu) obj3).j();
                List listA = ((luu) obj2).f20692a.a();
                ygp ygpVar3 = ygp.t;
                j1q0 j1q0Var3 = ((r9u) obj).f30104a;
                j1q0Var3.getClass();
                boolean zD = j1q0Var3.f15748a.d(ygpVar3);
                lel0.Companion.getClass();
                return new kxp(true, null, 1L, sff0VarA2, zJ2, listA, zD, new ypl0(0L, "", kel0.a()));
            case 14:
                SportGameLiteScreenParams sportGameLiteScreenParams = (SportGameLiteScreenParams) obj4;
                vzg0 vzg0Var = (vzg0) obj3;
                lbu lbuVar = (lbu) obj2;
                r9u r9uVar = (r9u) obj;
                long jLongValue = sportGameLiteScreenParams.c;
                boolean z4 = sportGameLiteScreenParams.b;
                GameBroadcastType gameBroadcastType = sportGameLiteScreenParams.d;
                String strH = h97.h(jLongValue, "KEY_GAME_ID");
                String strH2 = h97.h(jLongValue, "KEY_GAME_TYPE");
                tf50 tf50Var = (tf50) vzg0Var.a("KEY_CURRENT_NAVIGATION_TAB");
                if (tf50Var != null) {
                    o49Var = (o49) vzg0Var.a("KEY_BROADCASTING_TAB");
                    if (o49Var == null) {
                        iOrdinal = gameBroadcastType.ordinal();
                        if (iOrdinal != 0) {
                            o49Var3 = o49.f24622a;
                        } else if (iOrdinal != 1) {
                            o49Var3 = o49.b;
                        } else if (iOrdinal == 2) {
                            o49Var2 = null;
                        } else {
                            t9f.b();
                        }
                        o49Var2 = o49Var3;
                    } else {
                        o49Var2 = o49Var;
                    }
                    l = (Long) vzg0Var.a(strH);
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    long j2 = jLongValue;
                    bool = (Boolean) vzg0Var.a("KEY_LIVE");
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = z4;
                    }
                    long j3 = sportGameLiteScreenParams.f47004a;
                    boolean zJ3 = lbuVar.j();
                    long j4 = sportGameLiteScreenParams.e;
                    Long l2 = (Long) vzg0Var.a("KEY_CHAMP_ID");
                    Boolean bool3 = (Boolean) vzg0Var.a("KEY_SHOW_SUB_GAMES");
                    boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : true;
                    iun iunVar3 = iun.f15405a;
                    t3zVarH = (t3z) vzg0Var.a(strH2);
                    if (t3zVarH == null) {
                        t3z.f33292a.getClass();
                        t3zVarH = rqt.h(z4, false, false);
                    }
                    t3z t3zVar = t3zVarH;
                    Long l3 = (Long) vzg0Var.a("KEY_CATEGORY_ID");
                    if (tf50Var == null) {
                        tf50Var = tf50.f33851a;
                    }
                    tf50 tf50Var2 = tf50Var;
                    arrayList = new ArrayList();
                    ch00Var = ch00.SHORT_STATISTIC;
                    objA = vzg0Var.a("SHORT_STATISTIC");
                    bool2 = Boolean.TRUE;
                    if (Intrinsics.d(objA, bool2)) {
                        arrayList.add(ch00Var);
                    }
                    ch00Var2 = ch00.LAST_GAMES;
                    if (Intrinsics.d(vzg0Var.a("LAST_GAMES"), bool2)) {
                        arrayList.add(ch00Var2);
                    }
                    ch00Var3 = ch00.LAST_GAMES_OPP_ONE;
                    if (Intrinsics.d(vzg0Var.a("LAST_GAMES_OPP_ONE"), bool2)) {
                        arrayList.add(ch00Var3);
                    }
                    ch00Var4 = ch00.LAST_GAMES_OPP_TWO;
                    if (Intrinsics.d(vzg0Var.a("LAST_GAMES_OPP_TWO"), bool2)) {
                        arrayList.add(ch00Var4);
                    }
                    List listL0 = CollectionsKt.L0(arrayList);
                    ygp ygpVar4 = ygp.t;
                    r9uVar.getClass();
                    j1q0 j1q0Var4 = r9uVar.f30104a;
                    j1q0Var4.getClass();
                    return new njs(j2, "", null, zBooleanValue, j3, j4, l2, t3zVar, zJ3, tf50Var2, o49Var2, listL0, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, true, zBooleanValue2, false, false, null, null, null, l3, null, null, null, null, iunVar3, j1q0Var4.f15748a.d(ygpVar4), iunVar3);
                }
                int iOrdinal3 = gameBroadcastType.ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                    tf50Var = tf50.b;
                } else if (iOrdinal3 == 2) {
                    tf50Var = null;
                } else {
                    t9f.b();
                }
                o49Var = (o49) vzg0Var.a("KEY_BROADCASTING_TAB");
                if (o49Var == null) {
                    iOrdinal = gameBroadcastType.ordinal();
                    if (iOrdinal != 0) {
                        o49Var3 = o49.f24622a;
                    } else if (iOrdinal != 1) {
                        o49Var3 = o49.b;
                    } else if (iOrdinal == 2) {
                        o49Var2 = null;
                    } else {
                        t9f.b();
                    }
                    o49Var2 = o49Var3;
                } else {
                    o49Var2 = o49Var;
                }
                l = (Long) vzg0Var.a(strH);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                long j5 = jLongValue;
                bool = (Boolean) vzg0Var.a("KEY_LIVE");
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = z4;
                }
                long j6 = sportGameLiteScreenParams.f47004a;
                boolean zJ4 = lbuVar.j();
                long j7 = sportGameLiteScreenParams.e;
                Long l4 = (Long) vzg0Var.a("KEY_CHAMP_ID");
                Boolean bool4 = (Boolean) vzg0Var.a("KEY_SHOW_SUB_GAMES");
                boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : true;
                iun iunVar4 = iun.f15405a;
                t3zVarH = (t3z) vzg0Var.a(strH2);
                if (t3zVarH == null) {
                    t3z.f33292a.getClass();
                    t3zVarH = rqt.h(z4, false, false);
                }
                t3z t3zVar2 = t3zVarH;
                Long l5 = (Long) vzg0Var.a("KEY_CATEGORY_ID");
                if (tf50Var == null) {
                    tf50Var = tf50.f33851a;
                }
                tf50 tf50Var3 = tf50Var;
                arrayList = new ArrayList();
                ch00Var = ch00.SHORT_STATISTIC;
                objA = vzg0Var.a("SHORT_STATISTIC");
                bool2 = Boolean.TRUE;
                if (Intrinsics.d(objA, bool2)) {
                    arrayList.add(ch00Var);
                }
                ch00Var2 = ch00.LAST_GAMES;
                if (Intrinsics.d(vzg0Var.a("LAST_GAMES"), bool2)) {
                    arrayList.add(ch00Var2);
                }
                ch00Var3 = ch00.LAST_GAMES_OPP_ONE;
                if (Intrinsics.d(vzg0Var.a("LAST_GAMES_OPP_ONE"), bool2)) {
                    arrayList.add(ch00Var3);
                }
                ch00Var4 = ch00.LAST_GAMES_OPP_TWO;
                if (Intrinsics.d(vzg0Var.a("LAST_GAMES_OPP_TWO"), bool2)) {
                    arrayList.add(ch00Var4);
                }
                List listL1 = CollectionsKt.L0(arrayList);
                ygp ygpVar5 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var5 = r9uVar.f30104a;
                j1q0Var5.getClass();
                return new njs(j5, "", null, zBooleanValue, j6, j7, l4, t3zVar2, zJ4, tf50Var3, o49Var2, listL1, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, true, zBooleanValue3, false, false, null, null, null, l5, null, null, null, null, iunVar4, j1q0Var5.f15748a.d(ygpVar5), iunVar4);
                return null;
            case 15:
                fet fetVar = (fet) obj4;
                qpb qpbVar = (qpb) obj3;
                p9k0 p9k0Var = (p9k0) obj2;
                mu40 mu40Var = (mu40) obj;
                vkd vkdVar = fetVar.M;
                qpb qpbVar2 = vkdVar.b;
                try {
                    vkdVar.b = qpbVar;
                    p9k0 p9k0Var2 = fetVar.G;
                    int[] iArr = fetVar.o;
                    ey40 ey40Var = fetVar.v;
                    fetVar.o = null;
                    fetVar.v = null;
                    try {
                        fetVar.G = p9k0Var;
                        boolean z5 = vkdVar.e;
                        try {
                            vkdVar.e = false;
                            fetVar.F(mu40Var.f22397a, mu40Var.g, mu40Var.b, true);
                            vkdVar.e = z5;
                            fetVar.G = p9k0Var2;
                            fetVar.o = iArr;
                            fetVar.v = ey40Var;
                            vkdVar.b = qpbVar2;
                            return Unit.f46060a;
                        } catch (Throwable th) {
                            vkdVar.e = z5;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        fetVar.G = p9k0Var2;
                        fetVar.o = iArr;
                        fetVar.v = ey40Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    vkdVar.b = qpbVar2;
                    throw th3;
                }
            case 16:
                hnu hnuVar = (hnu) obj3;
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) obj2;
                f8w f8wVar = (f8w) obj;
                gm7 gm7Var = ((pru) obj4).a().f32117a.f12063a;
                List listH = hnuVar.h(historyTypeModel, f8wVar, gm7Var.m || gm7Var.n || gm7Var.q);
                if (listH.isEmpty()) {
                    z = true;
                } else {
                    Iterator it4 = listH.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z = true;
                        } else if (!((h0w) it4.next()).b) {
                            z = false;
                        }
                    }
                }
                List listD0 = CollectionsKt.D0(listH, 2);
                if (listD0 == null || !listD0.isEmpty()) {
                    Iterator it5 = listD0.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z2 = true;
                        } else if (!((h0w) it5.next()).b) {
                            z2 = false;
                        }
                    }
                } else {
                    z2 = true;
                }
                List listE0 = CollectionsKt.E0(2, listH);
                if (listE0 == null || !listE0.isEmpty()) {
                    Iterator it6 = listE0.iterator();
                    while (it6.hasNext()) {
                        if (!((h0w) it6.next()).b) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                } else {
                    z3 = true;
                }
                return new unm0(listH, listH, true, false, z, z2, z3, historyTypeModel);
            case 17:
                Float f = (Float) obj4;
                x7x x7xVar = (x7x) obj3;
                Float f2 = (Float) obj2;
                w7x w7xVar = (w7x) obj;
                if (!f.equals(x7xVar.f40436a) || !f2.equals(x7xVar.b)) {
                    x7xVar.f40436a = f;
                    x7xVar.b = f2;
                    x7xVar.d = new wto0(w7xVar, hp4.j, f, f2, null);
                    ((hgk0) x7xVar.h.b).setValue(Boolean.TRUE);
                    x7xVar.e = false;
                    x7xVar.f = true;
                }
                return Unit.f46060a;
            case 18:
                return Integer.valueOf(((cgk0) obj).l() + ((cgk0) obj2).l() + ((cgk0) obj3).l() + ((cgk0) obj4).l());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vzg0 vzg0Var2 = (vzg0) obj3;
                MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj2;
                cmt cmtVar = (cmt) obj;
                sff0 sff0VarA3 = ((pru) obj4).a();
                Long l6 = (Long) vzg0Var2.a("KEY_CURRENT_CATEGORY_ID");
                Long lValueOf = (Long) vzg0Var2.a("KEY_CURRENT_SUB_GAME_ID");
                if (lValueOf == null) {
                    long j8 = marketsCategoriesParams.c;
                    if (j8 == 0) {
                        j8 = marketsCategoriesParams.f46990a;
                    }
                    lValueOf = Long.valueOf(j8);
                }
                return new dz20(null, null, l6, null, lValueOf, null, sff0VarA3.h1, false, "", nx7.f24269a, new sf6(nl6.f23712a, !((of6) ((yk50) cmtVar.b).b).f25150a.a().getBoolean("KEY_MARKETS_CATEGORIES_BET_BUILDER_BADGE_CLICKED", false)), false);
            case 20:
                r9u r9uVar2 = (r9u) obj3;
                sff0 sff0VarA4 = ((pru) obj4).a();
                ygp ygpVar6 = ygp.c;
                r9uVar2.getClass();
                j1q0 j1q0Var6 = r9uVar2.f30104a;
                j1q0Var6.getClass();
                m1q0 m1q0Var = j1q0Var6.f15748a;
                boolean zD2 = m1q0Var.d(ygpVar6);
                iun iunVar5 = iun.f15405a;
                return new lx30("", null, null, zD2, iunVar5, ((ntu) obj2).f24118a.f15748a.j(), sff0VarA4.f32117a.f12063a.n, iunVar5, HistoryTypeModel.EVENTS, sff0VarA4.J1, ((yiu) obj).a() || sff0VarA4.O1, m1q0Var.d(ygp.x));
            case 21:
                xpj0 xpj0Var = (xpj0) obj4;
                vne vneVar = (vne) obj3;
                t33 t33Var = (t33) obj2;
                Function0 function0 = (Function0) obj;
                if (xpj0Var.c() == ypj0.b) {
                    if (xpj0Var.e.j().f23849a.containsKey(ypj0.c)) {
                        yje yjeVar2 = null;
                        qjj.W(vneVar, null, null, new my7(t33Var, yjeVar2, (byte) 22), 3);
                        qjj.W(vneVar, null, null, new xp8(xpj0Var, yjeVar2, b2), 3);
                    } else {
                        qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 8), 3).invokeOnCompletion(new r3w(function0, (byte) 12));
                    }
                } else {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 8), 3).invokeOnCompletion(new r3w(function0, (byte) 12));
                }
                return Unit.f46060a;
            case 22:
                g2v g2vVar = (g2v) obj4;
                vzg0 vzg0Var3 = (vzg0) obj;
                pb10 pb10Var = pb10.g;
                mdm mdmVarB = g2v.b(g2vVar, pb10Var, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                pdm pdmVar = pdm.b;
                mdm mdmVarB2 = g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_favourite, R.string.empty_favorites_dashboard_title, R.string.empty_favorites_dashboard_description, 0, 0, 0L, 0L, 964);
                mdm mdmVarB3 = g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_favourite, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 980);
                boolean zA = ((iqt) obj3).f15225a.a();
                kz50 kz50Var = new kz50(iun.f15405a);
                mz50 mz50Var = mz50.f22637a;
                return new c260(((ctf0) obj2).b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), null, false, zA, true, hm5.f13289a, true, false, k460.e, new rz50(mz50Var, mz50Var, mz50Var, mz50Var, mz50Var, mz50Var, mz50Var, kz50Var), mdmVarB, mdmVarB2, true, mdmVarB3, (s4i0) vzg0Var3.a("SELECTED_TRACK_COEF_KEY"), (s4i0) vzg0Var3.a("REMOVING_TRACK_COEF_KEY"));
            case 23:
                return hb90.d((hb90) obj4, (WebView) obj3, (WebResourceRequest) obj2, (WebResourceError) obj);
            case 24:
                ctf0 ctf0Var = (ctf0) obj3;
                pru pruVar = (pru) obj2;
                g2v g2vVar2 = (g2v) obj;
                ydc0 ydc0Var = (ydc0) ((vzg0) obj4).a("KEY_FILTER_STATE");
                if (ydc0Var == null) {
                    ydc0Var = ydc0.ALL;
                }
                List list7 = sec0.E;
                a4x a4xVarC = ydx.C(ydc0Var, ctf0Var);
                toc0 toc0Var = pruVar.a().l;
                iun iunVar6 = iun.f15405a;
                a4x a4xVarO0 = dyb.o0(iunVar6);
                mdm mdmVarB4 = g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                mdm mdmVarB5 = g2v.b(g2vVar2, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_promocode, 0, R.string.partners_empty_promocodes_text, 0, 0, 0L, 0L, 980);
                a4x a4xVarO1 = dyb.o0(iunVar6);
                lsm0 lsm0Var = ctf0Var.b;
                return new bec0(a4xVarO0, ydc0Var, a4xVarC, true, false, false, true, false, mdmVarB4, mdmVarB5, toc0Var.d, a4xVarO1, lsm0Var.a(R.string.promo_recommendation, Arrays.copyOf(new Object[0], 0)), false, false, new kdc0(0, lsm0Var.a(R.string.promo_bonus_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.promo_bonus_request_pts, Arrays.copyOf(new Object[0], 0)), toc0Var.u, toc0Var.v, false));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pru pruVar2 = (pru) obj4;
                vgc0 vgc0Var = (vgc0) obj3;
                vzg0 vzg0Var4 = (vzg0) obj2;
                ctf0 ctf0Var2 = (ctf0) obj;
                toc0 toc0Var2 = pruVar2.a().l;
                zvh0 zvh0Var = pruVar2.a().g.x;
                boolean z6 = toc0Var2.f;
                if (!z6) {
                    vgc0Var = vgc0.PROMO_LIST;
                }
                c0o c0oVar = vgc0.f;
                ArrayList arrayList5 = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it7 = c0oVar.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(new yvh0(ctf0Var2.b.a(((vgc0) it7.next()).f37375a, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                }
                a4x a4xVarO2 = dyb.o0(arrayList5);
                vgc0 vgc0Var2 = (vgc0) vzg0Var4.a("KEY_CURRENT_TAB");
                vgc0 vgc0Var3 = vgc0Var2 == null ? vgc0Var : vgc0Var2;
                boolean z7 = z6 && toc0Var2.g;
                boolean z8 = (z6 && toc0Var2.j) ? false : true;
                int iOrdinal4 = zvh0Var.ordinal();
                if (iOrdinal4 == 0) {
                    dxh0Var = axh0.f1625a;
                } else if (iOrdinal4 == 1) {
                    dxh0Var = zwh0.f45106a;
                } else if (iOrdinal4 == 2) {
                    dxh0Var = cxh0.f5122a;
                } else {
                    if (iOrdinal4 != 3) {
                        t9f.b();
                        return null;
                    }
                    dxh0Var = bxh0.f3376a;
                }
                return new kgc0(vgc0Var3, z7, z8, "", dxh0Var, a4xVarO2, ctf0Var2.b.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.my_promo_codes, Arrays.copyOf(new Object[0], 0)));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                vrc0 vrc0Var = (vrc0) obj4;
                vzg0 vzg0Var5 = (vzg0) obj2;
                g2v g2vVar3 = (g2v) obj;
                xi70 xi70Var = src0.f32669a;
                long jB = vrc0Var.B();
                xi70Var.getClass();
                src0 src0VarE = xi70.e(jB);
                boolean z9 = ((pru) obj3).a().l.x;
                Integer num = (Integer) vzg0Var5.a("AMOUNT_KEY");
                int iIntValue = num != null ? num.intValue() : vrc0Var.h0();
                Integer num2 = (Integer) vzg0Var5.a("GAME_COUNT_KEY");
                return new zqc0(true, false, g2v.b(g2vVar3, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 0L, 0L, 862), iun.f15405a, vrc0Var, src0VarE, "", iIntValue, num2 != null ? num2.intValue() : 1, 0, vrc0Var.C(), z9, 0L, 0.0d, esr.NOTHING, false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gf50 gf50Var = (gf50) obj4;
                ((hgk0) gf50Var.c).setValue((c2h0) obj3);
                ((hgk0) gf50Var.b).setValue((List) obj2);
                ((hgk0) gf50Var.d).setValue((List) obj);
                return Unit.f46060a;
            default:
                sff0 sff0VarA5 = ((pru) obj4).a();
                int i5 = ((bzt) obj3).f3488a.a().r;
                v5l0 v5l0Var = sff0VarA5.g.y;
                xun xunVar = xun.f41520a;
                ygp ygpVar7 = ygp.t;
                j1q0 j1q0Var7 = ((r9u) obj2).f30104a;
                j1q0Var7.getClass();
                return new y3g0(false, "", false, cnf0.f4652a, qhh0.f28739a, (ctf0) obj, i5, null, null, v5l0Var, xunVar, false, j1q0Var7.f15748a.d(ygpVar7), false);
        }
    }

    public /* synthetic */ mr0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f22245a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
