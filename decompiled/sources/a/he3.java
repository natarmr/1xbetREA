package a;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class he3 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ de3 f12901a;
    public final /* synthetic */ ie3 b;

    public he3(ie3 ie3Var, de3 de3Var) {
        this.b = ie3Var;
        this.f12901a = de3Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.h1.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f12901a);
        }
    }
}
