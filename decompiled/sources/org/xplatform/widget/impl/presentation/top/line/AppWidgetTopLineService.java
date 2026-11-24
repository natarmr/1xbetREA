package org.xplatform.widget.impl.presentation.top.line;

import a.zo3;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;

/* JADX INFO: loaded from: classes7.dex */
public final class AppWidgetTopLineService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        return new zo3(applicationContext, intent, (byte) 0);
    }
}
