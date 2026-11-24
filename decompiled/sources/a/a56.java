package a;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a56 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f254a;
    public final Intent b;
    public final int c;
    public List d;
    public sje e;
    public final n0o0 f;
    public wdv0 g;
    public final md3 h;
    public final kj5 i;

    public a56(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.f254a = context;
        this.b = intent;
        this.c = intent.getIntExtra("appWidgetId", 0);
        this.d = iun.f15405a;
        kin0 kin0VarE = qem0.e();
        rwj rwjVar = tvk.f34603a;
        this.e = d5c.a(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a));
        this.f = maz.b(new zo4(this, (byte) 16));
        this.g = wdv0.f38992a;
        this.h = new md3(this, (byte) 2);
        this.i = new kj5();
    }

    public final RemoteViews a(xdv0 xdv0Var) {
        RemoteViews remoteViewsD;
        String string;
        unp0 unp0Var = xdv0Var.i;
        boolean z = xdv0Var.e;
        long j = xdv0Var.f40715a;
        int size = unp0Var.c.size();
        unp0 unp0Var2 = xdv0Var.j;
        String str = unp0Var2.b;
        int length = str.length();
        Context context = this.f254a;
        if (length == 0) {
            remoteViewsD = new RemoteViews(context.getPackageName(), R.layout.widget_item_game_one_team);
        } else if (size == 2) {
            remoteViewsD = c();
        } else {
            remoteViewsD = size > 2 ? d() : b();
        }
        RemoteViews remoteViews = remoteViewsD;
        context.getClass();
        Intent intentPutExtra = new Intent().putExtra("selected_game_id", j).putExtra("selected_sub_game_id", xdv0Var.d);
        long j2 = xdv0Var.b;
        remoteViews.setOnClickFillInIntent(R.id.widgetItemContainer, intentPutExtra.putExtra("SPORT_ID", j2).putExtra("is_live", z).putExtra("sportId", j2).putExtra("subSportId", xdv0Var.c).putExtra("favorite", xdv0Var.l).putExtra("champ_id", xdv0Var.h));
        SharedPreferences sharedPreferences = context.getSharedPreferences("widget_shared_prefs", 0);
        sharedPreferences.getClass();
        sharedPreferences.edit().putLong("widget_selected_game_id", j).apply();
        remoteViews.setTextViewText(R.id.textViewTitle, xdv0Var.g);
        long j3 = xdv0Var.f;
        if (j3 != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j3, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        a4n0.h(remoteViews, this.f254a, R.id.imageViewIcon, string, R.drawable.sport_new, (int) context.getResources().getDimension(R.dimen.icon_size_16), iun.f15405a);
        k(remoteViews, z);
        j(remoteViews, xdv0Var);
        this.i.getClass();
        int size2 = unp0Var.c.size();
        long j4 = unp0Var.f35975a;
        if (size2 == 1) {
            kj5.n(remoteViews, j4, kotlin.collections.a.c(Integer.valueOf(R.id.imageViewTeamOne)), unp0Var.c, context);
            kj5.n(remoteViews, unp0Var2.f35975a, kotlin.collections.a.c(Integer.valueOf(R.id.imageViewTeamTwo)), unp0Var2.c, context);
        } else {
            kj5.n(remoteViews, j4, q3d.j(Integer.valueOf(R.id.imageViewTeamOneFirst), Integer.valueOf(R.id.imageViewTeamOneSecond), Integer.valueOf(R.id.imageViewTeamOneThird), Integer.valueOf(R.id.imageViewTeamOneQuarter)), unp0Var.c, context);
            kj5.n(remoteViews, unp0Var2.f35975a, q3d.j(Integer.valueOf(R.id.imageViewTeamTwoFirst), Integer.valueOf(R.id.imageViewTeamTwoSecond), Integer.valueOf(R.id.imageViewTeamTwoThird), Integer.valueOf(R.id.imageViewTeamTwoQuarter)), unp0Var2.c, context);
        }
        wdv0 wdv0Var = this.g;
        wdv0Var.getClass();
        wdv0 wdv0Var2 = wdv0.f38992a;
        String str2 = unp0Var.b;
        if (wdv0Var == wdv0Var2) {
            remoteViews.setTextViewText(R.id.textViewTeamOne, str2);
            remoteViews.setTextViewText(R.id.textViewTeamTwo, str);
        } else {
            int i = this.c;
            remoteViews.setTextViewText(R.id.textViewTeamOne, kj5.l(str2, i, context, wdv0Var));
            remoteViews.setTextViewText(R.id.textViewTeamTwo, kj5.l(str, i, context, wdv0Var));
        }
        remoteViews.setTextViewText(R.id.textViewPoints, xdv0Var.k);
        return remoteViews;
    }

    public RemoteViews b() {
        Context context = this.f254a;
        return context.getResources().getConfiguration().fontScale > 1.29f ? new RemoteViews(context.getPackageName(), R.layout.widget_scaled_small_item_game) : new RemoteViews(context.getPackageName(), R.layout.widget_item_game);
    }

    public RemoteViews c() {
        Context context = this.f254a;
        return context.getResources().getConfiguration().fontScale > 1.29f ? new RemoteViews(context.getPackageName(), R.layout.widget_scaled_small_item_game_doubles) : new RemoteViews(context.getPackageName(), R.layout.widget_item_game_doubles);
    }

    public RemoteViews d() {
        Context context = this.f254a;
        if (context.getResources().getConfiguration().fontScale > 1.29f) {
            this.g = wdv0.b;
            return new RemoteViews(context.getPackageName(), R.layout.widget_scaled_small_item_game_quarter);
        }
        this.g = wdv0.c;
        return new RemoteViews(context.getPackageName(), R.layout.widget_item_game_quarter);
    }

    public final g56 e() {
        return (g56) this.f.getValue();
    }

    public final void f(Context context) {
        String stringExtra = this.b.getStringExtra("key_widget_provider_class");
        if (stringExtra != null) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(context, Class.forName(stringExtra))), R.id.listGames);
        }
    }

    public void g(Context context, Intent intent) {
        context.getClass();
        if (Intrinsics.d(intent.getAction(), "action_update_top_all_games")) {
            e().a();
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        f56 f56Var = (f56) CollectionsKt.firstOrNull(e().b().f31713a.d());
        if ((f56Var instanceof d56) || (f56Var instanceof e56)) {
            return 0;
        }
        if (!this.d.isEmpty() || (f56Var instanceof b56)) {
            return this.d.size();
        }
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return new RemoteViews(this.f254a.getPackageName(), R.layout.widget_item_game_loading);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int i) {
        if (this.d.isEmpty()) {
            return getLoadingView();
        }
        pev0 pev0Var = (pev0) CollectionsKt.W(i, this.d);
        if (pev0Var != null) {
            RemoteViews remoteViewsA = (pev0Var instanceof xdv0 ? (xdv0) pev0Var : null) != null ? a((xdv0) pev0Var) : null;
            if (remoteViewsA != null) {
                return remoteViewsA;
            }
        }
        return getLoadingView();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 6;
    }

    public abstract g56 h();

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    public final void i(Bundle bundle) {
        AppWidgetManager.getInstance(this.f254a).updateAppWidgetOptions(this.c, bundle);
    }

    public void j(RemoteViews remoteViews, xdv0 xdv0Var) {
        boolean z = xdv0Var.e;
        Long l = xdv0Var.m;
        if (z || l == null) {
            return;
        }
        rdj rdjVar = rdj.f30294a;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(this.f254a);
        long jLongValue = l.longValue();
        remoteViews.setTextViewText(R.id.textViewDate, rdj.g(new znq0(jLongValue), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56));
    }

    public void k(RemoteViews remoteViews, boolean z) {
        remoteViews.setViewVisibility(R.id.imageViewLive, z ? 0 : 8);
        remoteViews.setViewVisibility(R.id.textViewDate, z ? 8 : 0);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        gr00 gr00VarT = gr00.t(this.f254a);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_update_top_line_games");
        intentFilter.addAction("action_update_top_live_games");
        intentFilter.addAction("action_update_top_all_games");
        intentFilter.addAction("action_change_locale");
        gr00VarT.D(this.h, intentFilter);
        kin0 kin0VarE = qem0.e();
        rwj rwjVar = tvk.f34603a;
        vs10 vs10Var = ys10.f43147a;
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(kin0VarE, vs10Var));
        this.e = sjeVarA;
        qjj.W(sjeVarA, vs10Var, null, new qv3(this, null, (byte) 10), 2);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        gr00.t(this.f254a).F(this.h);
        e().onDestroy();
        d5c.G(this.e, null);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
    }
}
