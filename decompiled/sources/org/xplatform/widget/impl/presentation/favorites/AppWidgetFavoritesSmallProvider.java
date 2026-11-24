package org.xplatform.widget.impl.presentation.favorites;

import a.bz5;
import a.dz5;
import a.jo3;
import a.sac;
import a.yo3;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AppWidgetFavoritesSmallProvider extends dz5 {
    @Override // a.dz5
    public final bz5 a() {
        return bz5.c;
    }

    @Override // a.dz5
    public final int b() {
        return R.layout.app_widget_favorites_light;
    }

    @Override // a.dz5
    public final int c() {
        return R.layout.app_widget_favorites_night;
    }

    @Override // a.dz5
    public final AppWidgetProvider e() {
        return this;
    }

    @Override // a.dz5
    public final RemoteViewsService f() {
        return new AppWidgetFavoritesSmallService();
    }

    @Override // a.dz5
    public final int g() {
        return R.string.favorites_name;
    }

    @Override // a.dz5
    public final void k(RemoteViews remoteViews, Context context, AppWidgetManager appWidgetManager, int i) {
        if (!appWidgetManager.getAppWidgetOptions(i).getBoolean("error_need_authorization")) {
            super.k(remoteViews, context, appWidgetManager, i);
            return;
        }
        j(context);
        m();
        p(remoteViews, context, i);
        remoteViews.setViewVisibility(R.id.listGames, 8);
        remoteViews.setViewVisibility(R.id.layoutProphylaxis, 8);
    }

    @Override // a.dz5
    public final int l() {
        return 2;
    }

    @Override // a.dz5
    public final void o(long j, long j2, long j3, boolean z, boolean z2) {
        sac.V(this.m, yo3.f42964a, null, null, new jo3(this, z, j, j2, j3, z2, null, (byte) 2), 14);
    }
}
