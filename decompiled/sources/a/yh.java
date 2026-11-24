package a;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class yh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42610a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ yh(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.f42610a = b;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f42610a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (b) {
            case 0:
                actionBarOverlayLayout.a();
                actionBarOverlayLayout.z = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A);
                break;
            default:
                actionBarOverlayLayout.a();
                actionBarOverlayLayout.z = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.A);
                break;
        }
    }
}
