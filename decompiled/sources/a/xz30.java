package a;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class xz30 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz30 f41737a;

    public xz30(yz30 yz30Var) {
        this.f41737a = yz30Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f41737a.c();
    }
}
