package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.app_update.impl.presentation.update_screen.views.AppUpdateScreenLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class em3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8029a;
    public final FrameLayout b;
    public final AppUpdateScreenLayout c;

    public em3(FrameLayout frameLayout, FrameLayout frameLayout2, AppUpdateScreenLayout appUpdateScreenLayout) {
        this.f8029a = frameLayout;
        this.b = frameLayout2;
        this.c = appUpdateScreenLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8029a;
    }
}
