package org.xplatform.widget.impl.presentation.top.live;

import a.bz5;
import a.dz5;
import a.xun;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViewsService;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AppWidgetTopLiveSmallProvider extends dz5 {
    @Override // a.dz5
    public final bz5 a() {
        return bz5.b;
    }

    @Override // a.dz5
    public final int b() {
        return R.layout.app_widget_top_live_light;
    }

    @Override // a.dz5
    public final int c() {
        return R.layout.app_widget_top_live_night;
    }

    @Override // a.dz5
    public final AppWidgetProvider e() {
        return this;
    }

    @Override // a.dz5
    public final RemoteViewsService f() {
        return new AppWidgetTopLiveSmallService();
    }

    @Override // a.dz5
    public final int g() {
        return R.string.popular_live_new;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        j(context);
        h().f42966a.c("widget_live_call");
        i().f1455a.a(xun.f41520a, 3147L);
    }
}
