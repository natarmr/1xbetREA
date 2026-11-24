package org.xplatform.widget.impl.presentation.top.line;

import a.ap3;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;

/* JADX INFO: loaded from: classes7.dex */
public final class AppWidgetTopLineSmallService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        return new ap3(applicationContext, intent);
    }
}
