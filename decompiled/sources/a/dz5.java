package a;

import android.app.Application;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.widget.impl.presentation.favorites.AppWidgetFavoritesService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dz5 extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yo4 f6924a;
    public fck0 b;
    public afm0 c;
    public wgu d;
    public wiu e;
    public au0 f;
    public mj50 g;
    public dpi0 h;
    public ctf0 i;
    public boolean j;
    public boolean k;
    public rzi l;
    public final sje m;
    public bby n;

    public dz5() {
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.m = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
    }

    public static void q(RemoteViews remoteViews, Context context, long j, long j2) {
        remoteViews.setViewVisibility(R.id.layoutError, 8);
        remoteViews.setViewVisibility(R.id.listGames, 8);
        remoteViews.setViewVisibility(R.id.layoutProphylaxis, 0);
        remoteViews.setViewVisibility(R.id.renewContainer, 8);
        us00 us00VarH = b8k0.H(context);
        rdj rdjVar = rdj.f30294a;
        efj efjVar = efj.UNIQUE_1;
        znq0 znq0Var = new znq0(j);
        Boolean bool = Boolean.TRUE;
        remoteViews.setTextViewText(R.id.textViewProphylaxis, us00VarH.getString(R.string.prophylaxis_message, rdj.g(znq0Var, efjVar, bool, false, 56), rdj.g(new znq0(j2), efjVar, bool, false, 56)));
    }

    public bz5 a() {
        return bz5.c;
    }

    public int b() {
        return R.layout.app_widget_favorites_light;
    }

    public int c() {
        return R.layout.app_widget_favorites_night;
    }

    public final PendingIntent d(Context context, int i, String str) {
        Intent intent = new Intent(context, e().getClass());
        intent.setAction(str);
        intent.putExtra("widget_id", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        intent.addCategory("CUSTOM_INTENT");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        broadcast.getClass();
        return broadcast;
    }

    public RemoteViewsService f() {
        return new AppWidgetFavoritesService();
    }

    public int g() {
        return R.string.favorites_name;
    }

    public final yo4 h() {
        yo4 yo4Var = this.f6924a;
        if (yo4Var != null) {
            return yo4Var;
        }
        Intrinsics.h("widgetAnalytics");
        throw null;
    }

    public final au0 i() {
        au0 au0Var = this.f;
        if (au0Var != null) {
            return au0Var;
        }
        Intrinsics.h("widgetFatmanLogger");
        throw null;
    }

    public final void j(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) applicationContext;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ldv0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ldv0 ldv0Var = (ldv0) (ze3Var instanceof ldv0 ? ze3Var : null);
            if (ldv0Var != null) {
                rzi rziVarA = ldv0Var.a();
                this.l = rziVarA;
                this.f6924a = rziVarA.i();
                bn6 bn6Var = rziVarA.p;
                je jeVar = rziVarA.q;
                this.b = new fck0((Object) bn6Var, (Object) jeVar, (byte) 18);
                this.c = new afm0((Object) bn6Var, (Object) jeVar, (byte) 17);
                this.d = rziVarA.r;
                this.e = rziVarA.s;
                this.f = rziVarA.n;
                this.g = new mj50(rziVarA.h());
                this.h = new dpi0(rziVarA.h());
                this.i = rziVarA.o;
                return;
            }
        }
        jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
    }

    public void k(RemoteViews remoteViews, Context context, AppWidgetManager appWidgetManager, int i) {
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        if (this.j) {
            remoteViews.setViewVisibility(R.id.listGames, 8);
            remoteViews.setViewVisibility(R.id.layoutError, 0);
            remoteViews.setViewVisibility(R.id.imageViewError, 8);
            remoteViews.setViewVisibility(R.id.layoutProphylaxis, 8);
            remoteViews.setViewVisibility(R.id.renewContainer, 0);
            remoteViews.setTextViewText(R.id.textViewError, b8k0.H(context).getString(R.string.data_retrieval_error));
            remoteViews.setTextViewText(R.id.buttonRefresh, b8k0.H(context).getString(R.string.refresh_data));
            remoteViews.setOnClickPendingIntent(R.id.buttonRefresh, d(context, i, "refresh_event_click"));
            return;
        }
        if (this.k) {
            try {
                q(remoteViews, context, appWidgetOptions.getLong("key_start_date_prophylaxis"), appWidgetOptions.getLong("key_end_date_prophylaxis"));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        remoteViews.setViewVisibility(R.id.layoutError, 8);
        remoteViews.setViewVisibility(R.id.listGames, 0);
        remoteViews.setViewVisibility(R.id.renewContainer, 0);
        remoteViews.setViewVisibility(R.id.layoutProphylaxis, 8);
    }

    public int l() {
        return 0;
    }

    public final void m() {
        mj50 mj50Var = this.g;
        if (mj50Var == null) {
            Intrinsics.h("needWidgetAuthorizationLogUseCase");
            throw null;
        }
        if (ua80.x((vwb0) mj50Var.f21879a.f43005a, "NEED_AUTHORIZATION_LOG", true)) {
            dpi0 dpi0Var = this.h;
            if (dpi0Var == null) {
                Intrinsics.h("updateNeedAuthorizationLogUseCase");
                throw null;
            }
            ((vwb0) ((yox) dpi0Var.f6468a).f43005a).e("NEED_AUTHORIZATION_LOG", false);
            h().f42966a.c("widget_favor_anonim");
            i().f1455a.a(xun.f41520a, 3151L);
        }
    }

    public final void n(Context context, Intent intent) {
        String str;
        int intExtra = intent.getIntExtra("widget_id", 0);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        Boolean bool = Boolean.FALSE;
        appWidgetManager.updateAppWidgetOptions(intExtra, i120.V(new Pair("top_live_error_data", bool), new Pair("error_need_authorization", bool)));
        int iOrdinal = a().ordinal();
        if (iOrdinal == 0) {
            str = "action_update_top_line_games";
        } else if (iOrdinal == 1) {
            str = "action_update_top_live_games";
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            str = "action_update_top_all_games";
        }
        gr00.t(context).E(new Intent(str));
    }

    public void o(long j, long j2, long j3, boolean z, boolean z2) {
        fck0 fck0Var = this.b;
        if (fck0Var == null) {
            Intrinsics.h("widgetLiveAndLineUseCase");
            throw null;
        }
        String str = z ? "widget_live_list" : "widget_line_list";
        ((bn6) fck0Var.b).d(j, j2, j3, str, z);
        ((je) fck0Var.c).g(j, j2, j3, str, z);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        if (context == null || appWidgetManager == null) {
            return;
        }
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, e().getClass()));
        appWidgetIds.getClass();
        onUpdate(context, appWidgetManager, appWidgetIds);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        dpi0 dpi0Var = this.h;
        if (dpi0Var == null) {
            Intrinsics.h("updateNeedAuthorizationLogUseCase");
            throw null;
        }
        ((vwb0) ((yox) dpi0Var.f6468a).f43005a).e("NEED_AUTHORIZATION_LOG", true);
        super.onDeleted(context, iArr);
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("widget_shared_prefs", 0);
            sharedPreferences.getClass();
            sharedPreferences.edit().putString("widget_language", null).apply();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dz5.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        rdj rdjVar = rdj.f30294a;
        ctf0 ctf0Var = this.i;
        if (ctf0Var == null) {
            Intrinsics.h("resourceManager");
            throw null;
        }
        rdj.l(ctf0Var.h());
        for (int i : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (context.getResources().getConfiguration().uiMode & 32) == 32 ? c() : b());
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
            this.j = appWidgetOptions.getBoolean("top_live_error_data", false);
            remoteViews.setPendingIntentTemplate(R.id.listGames, d(context, i, "games_events_click"));
            this.k = appWidgetOptions.getBoolean("show_prophylaxis", false);
            if (appWidgetOptions.getBoolean("renew_animation_needed", false)) {
                remoteViews.setViewVisibility(R.id.renewFlip, 0);
                remoteViews.setViewVisibility(R.id.renewImageStatic, 8);
            } else {
                remoteViews.setViewVisibility(R.id.renewFlip, 8);
                remoteViews.setViewVisibility(R.id.renewImageStatic, 0);
            }
            remoteViews.setOnClickPendingIntent(R.id.renewContainer, d(context, i, "refresh_events_click"));
            long j = appWidgetOptions.getLong("upload_data_time", Calendar.getInstance(Locale.getDefault()).getTime().getTime() / 1000);
            rdj rdjVar2 = rdj.f30294a;
            remoteViews.setTextViewText(R.id.renewTime, rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(context)), null, 248));
            remoteViews.setTextViewText(R.id.textViewTitle, b8k0.H(context).getString(g()));
            Intent intent = new Intent(context, f().getClass());
            intent.putExtra("appWidgetId", i);
            intent.putExtra("key_widget_provider_class", e().getClass().getName());
            intent.putExtra("key_count_item_for_notification", l());
            intent.setData(Uri.parse(intent.toUri(1)));
            remoteViews.setRemoteAdapter(R.id.listGames, intent);
            k(remoteViews, context, appWidgetManager, i);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }

    public final void p(RemoteViews remoteViews, Context context, int i) {
        remoteViews.setViewVisibility(R.id.layoutError, 0);
        remoteViews.setViewVisibility(R.id.imageViewError, 0);
        remoteViews.setTextViewText(R.id.textViewError, b8k0.H(context).getString(R.string.need_authorization_for_favorites));
        remoteViews.setTextViewText(R.id.buttonRefresh, b8k0.H(context).getString(R.string.make_login));
        remoteViews.setOnClickPendingIntent(R.id.buttonRefresh, d(context, i, "authorization_event_click"));
    }

    public AppWidgetProvider e() {
        return this;
    }
}
