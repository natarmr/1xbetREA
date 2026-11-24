package a;

import android.app.Notification;
import android.content.Context;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class um30 {
    public static /* synthetic */ Notification.Builder d(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* bridge */ /* synthetic */ AutofillManager j(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ void v(Object obj) {
    }
}
