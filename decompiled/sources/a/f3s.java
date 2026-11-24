package a;

import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import org.xplatform.bethistory.history_info.presentation.HistoryInfoScreen;
import org.xplatform.bethistory.share_coupon.presentation.ShareCouponScreen;
import org.xplatform.bethistory.share_coupon.presentation.ShareCouponScreenOld;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getUfcPostGameScreen$1;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f3s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8880a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f3s(Object obj, Object obj2, byte b) {
        this.f8880a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8880a;
        byte b2 = 15;
        byte b3 = 24;
        byte b4 = 20;
        byte b5 = 0;
        Object[] objArr = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                k4s k4sVar = (k4s) obj3;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rl70 rl70Var = k4sVar.T;
                String str = ((z2s) k4sVar.D()).b;
                long j = ((z2s) k4sVar.D()).e;
                rl70Var.getClass();
                k0w0Var.h(rl70.d(j, (String) obj2, str));
                return Unit.f46060a;
            case 1:
                k4s k4sVar2 = (k4s) obj3;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(((zfm0) k4sVar2.s).a(((z2s) k4sVar2.D()).e, ((s1s) ((v1s) obj2)).f31471a));
                return Unit.f46060a;
            case 2:
                g9s g9sVar = (g9s) obj3;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(((zfm0) g9sVar.N).a(((r7s) g9sVar.D()).e, ((t6s) ((v6s) obj2)).f33434a));
                return Unit.f46060a;
            case 3:
                g9s g9sVar2 = (g9s) obj3;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                rl70 rl70Var2 = g9sVar2.s;
                String str2 = ((r7s) g9sVar2.D()).b;
                long j2 = ((r7s) g9sVar2.D()).e;
                rl70Var2.getClass();
                k0w0Var4.h(rl70.d(j2, (String) obj2, str2));
                return Unit.f46060a;
            case 4:
                sbs sbsVar = (sbs) obj3;
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                rl70 rl70Var3 = sbsVar.A;
                String str3 = sbsVar.s;
                long j3 = sbsVar.r;
                rl70Var3.getClass();
                k0w0Var5.h(rl70.d(j3, (String) obj2, str3));
                return Unit.f46060a;
            case 5:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int iL = ((cgk0) obj3).l();
                for (pu90 pu90Var : (ArrayList) obj2) {
                    Object objN = pu90Var.n();
                    mh00 mh00Var = objN instanceof mh00 ? (mh00) objN : null;
                    String str4 = mh00Var != null ? mh00Var.b : null;
                    if (Intrinsics.d(str4, "TOOLBAR_ID")) {
                        ou90Var.m(pu90Var, 0, iL, 0.0f);
                        iL += pu90Var.b;
                    } else if (Intrinsics.d(str4, "CONTENT_ID")) {
                        ou90Var.m(pu90Var, 0, iL, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 6:
                yks yksVar = (yks) obj3;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(((zfm0) yksVar.N).a(((njs) yksVar.D()).e, ((qis) ((sis) obj2)).f28806a));
                return Unit.f46060a;
            case 7:
                yks yksVar2 = (yks) obj3;
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                rl70 rl70Var4 = yksVar2.s;
                String str5 = ((njs) yksVar2.D()).b;
                long j4 = ((njs) yksVar2.D()).e;
                rl70Var4.getClass();
                k0w0Var7.h(rl70.d(j4, (String) obj2, str5));
                return Unit.f46060a;
            case 8:
                pq8 pq8Var = (pq8) obj3;
                View view = (View) obj2;
                ((FrameLayout) obj).getClass();
                try {
                    e0g0 e0g0Var = j0g0.b;
                    androidx.fragment.app.e eVarC = androidx.fragment.app.e.H(view).C();
                    eVarC.getClass();
                    zss.d(eVarC, "video_fragment_tag");
                    zss.d(eVarC, "zone_fragment_tag");
                    break;
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                pq8Var.f27402a = null;
                return Unit.f46060a;
            case 9:
                pz40 pz40Var = (pz40) obj2;
                bts btsVar = (bts) CollectionsKt.W(((Integer) obj).intValue(), (i4) obj3);
                if (btsVar != null) {
                    pz40Var.setValue(btsVar);
                }
                return Unit.f46060a;
            case 10:
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                kys0 kys0Var = ((c0t) obj3).M;
                String str6 = ((tlr) obj2).f34160a;
                kys0Var.getClass();
                k0w0Var8.h(new UfcScreensFactoryImpl$getUfcPostGameScreen$1(-1L, 189L, str6));
                return Unit.f46060a;
            case 11:
                c0t c0tVar = (c0t) obj3;
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                kys0 kys0Var2 = c0tVar.M;
                long j5 = c0tVar.r.e;
                kys0Var2.getClass();
                k0w0Var9.h(new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(j5, (String) obj2));
                return Unit.f46060a;
            case 12:
                c0t c0tVar2 = (c0t) obj3;
                k0w0 k0w0Var10 = (k0w0) obj;
                k0w0Var10.getClass();
                kys0 kys0Var3 = c0tVar2.M;
                String str7 = ((wrs) c0tVar2.D()).g;
                long j6 = ((clr) ((jlr) obj2)).b;
                kys0Var3.getClass();
                k0w0Var10.k(new UfcScreensFactoryImpl$getUfcPostGameScreen$1(j6, 189L, str7));
                return Unit.f46060a;
            case 13:
                ((View) obj).getClass();
                ((ur6) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 14:
                pkk0 pkk0Var = (pkk0) obj2;
                ((jly) obj).getClass();
                ((ypq) ((wpq) obj3)).b(false);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                return Unit.f46060a;
            case 15:
                nkt nktVar = (nkt) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                th.getLocalizedMessage();
                nktVar.i.o(null, i8d.e);
                nktVar.f(th, (vne) obj2);
                return Unit.f46060a;
            case 16:
                jdv jdvVar = (jdv) obj3;
                ((TableViewImpl) obj).getClass();
                adv advVar = (adv) ((pz40) obj2).getValue();
                if (advVar != null) {
                    gdv gdvVar = jdvVar.f16347a;
                    advVar.q(gdvVar.b, gdvVar.c, gdvVar.f11121a, gdvVar.d);
                }
                return Unit.f46060a;
            case 17:
                ((View) obj).getClass();
                ((vft) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 18:
                ((hmv) obj3).c.removeCallbacks((llo) obj2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kie0 kie0Var = (kie0) obj3;
                kie0 kie0Var2 = (kie0) obj2;
                MatchResult matchResult = (MatchResult) obj;
                if (kie0Var.f18333a == -1) {
                    kie0Var.f18333a = matchResult.b().f46068a;
                }
                kie0Var2.f18333a = matchResult.b().b + 1;
                return "";
            case 20:
                ztv ztvVar = (ztv) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, new ugd(-628702389, true, new elm(ztvVar, b2)), 3);
                a4x a4xVar = ztvVar.f44982a.b;
                hczVar.f(a4xVar.size(), new d2p(new s3t(b3), a4xVar, b4), new far(a4xVar, (byte) 13), new ugd(2039820996, true, new c8((List) a4xVar, (Object) ztvVar, (Function1) obj2, (byte) 27)));
                return Unit.f46060a;
            case 21:
                List list = (List) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(list.size(), null, new far(list, (byte) 14), new ugd(802480018, true, new xe4(list, (wyx) obj2, (byte) 6)));
                return Unit.f46060a;
            case 22:
                ArrayList arrayList = (ArrayList) obj3;
                hcz hczVar3 = (hcz) obj;
                art artVar = axv.n2;
                hczVar3.getClass();
                hczVar3.f(arrayList.size(), null, new j13(arrayList, b2, objArr == true ? 1 : 0), new ugd(2039820996, true, new c8((List) arrayList, (Object) arrayList, obj2, (byte) 28)));
                return Unit.f46060a;
            case 23:
                n3w n3wVar = (n3w) obj2;
                rqt rqtVar = izv.d2;
                ((View) obj).getClass();
                z4w z4wVar = ((izv) obj3).M0().d;
                z4wVar.getClass();
                z4wVar.v = n3wVar;
                q37 q37Var = z4wVar.r;
                q37Var.b.f1961a.c(a1w.j.a());
                q37Var.c.f1455a.a(xun.f41520a, 3206L);
                z4wVar.v(n3wVar, false);
                return Unit.f46060a;
            case 24:
                f0w f0wVar = (f0w) obj3;
                hcz hczVar4 = (hcz) obj;
                sqt sqtVar = vzv.p2;
                hczVar4.getClass();
                i4 i4Var = f0wVar.f8735a;
                hczVar4.f(i4Var.size(), null, new pn7(i4Var, (byte) 3), new ugd(2039820996, true, new c8((List) i4Var, obj2, (Object) f0wVar, (byte) 29)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar = (cp) obj3;
                ((List) obj).getClass();
                View view2 = cpVar.f40887a;
                fz30 fz30Var = (fz30) cpVar.u;
                fz30Var.c.setText(view2.getContext().getString(((e4w) cpVar.u()).f7203a));
                fz30Var.b.setImageResource(((e4w) cpVar.u()).b);
                fz30Var.f10391a.setOnClickListener(new wg((t3t) obj2, cpVar, b3));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                n3w n3wVar2 = (n3w) obj2;
                k0w0 k0w0Var11 = (k0w0) obj;
                k0w0Var11.getClass();
                r9u r9uVar = ((z4w) obj3).s;
                ygp ygpVar = ygp.I1;
                r9uVar.getClass();
                k0w0Var11.h(r9uVar.f30104a.a(ygpVar) ? new ShareCouponScreen(n3wVar2.f22868a) : new ShareCouponScreenOld(n3wVar2.f22868a));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new k9v((Object) cpVar2, obj3, obj2, (byte) 2));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b8w b8wVar = (b8w) obj3;
                Function1 function1 = (Function1) obj2;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                i4 i4Var2 = b8wVar.f2179a;
                hczVar5.f(i4Var2.size(), null, new far(i4Var2, (byte) 17), new ugd(2039820996, true, new h8w(i4Var2, function1, b8wVar, b5)));
                if (b8wVar.b) {
                    hcz.e(hczVar5, null, null, new ugd(-1578427453, true, new gn(function1, b4)), 3);
                }
                return Unit.f46060a;
            default:
                n3w n3wVar3 = (n3w) obj3;
                naw nawVar = (naw) obj2;
                k0w0 k0w0Var12 = (k0w0) obj;
                k0w0Var12.getClass();
                ql5 ql5Var = nawVar.C0;
                k0w0Var12.h(new HistoryInfoScreen(n3wVar3, false, ql5Var != null ? ql5Var.f28916a : 0L, false, nawVar.d));
                return Unit.f46060a;
        }
    }
}
