package org.xplatform.widget.impl.presentation.favorites;

import a.dz5;
import a.io3;
import a.jo3;
import a.sac;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AppWidgetFavoritesDefaultProvider extends dz5 {
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
        sac.V(this.m, io3.f15099a, null, null, new jo3(this, z, j, j2, j3, z2, null, (byte) 0), 14);
    }
}
