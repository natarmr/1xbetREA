package org.xplatform.widget.impl.presentation.favorites;

import a.vo3;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;

/* JADX INFO: loaded from: classes7.dex */
public final class AppWidgetFavoritesService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        return new vo3(applicationContext, intent);
    }
}
