package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.app_start.impl.presentation.view.AppStartScreenLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class zxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f45173a;
    public final AppStartScreenLayout b;

    public zxq(FrameLayout frameLayout, AppStartScreenLayout appStartScreenLayout) {
        this.f45173a = frameLayout;
        this.b = appStartScreenLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f45173a;
    }
}
