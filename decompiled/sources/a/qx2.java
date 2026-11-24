package a;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class qx2 {
    public static void a(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void b(tai0 tai0Var, AccessibilityEvent accessibilityEvent) {
        nai0 nai0Var = tai0Var.d;
        Object objG = nai0Var.f23193a.g(xai0.M);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            hny.b();
        } else {
            Object objG2 = nai0Var.f23193a.g(xai0.I);
            accessibilityEvent.setTextChangeTypes((((o9q0) (objG2 != null ? objG2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
