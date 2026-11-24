package a;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class exk0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8582a;
    public final FrameLayout b;

    public exk0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f8582a = frameLayout;
        this.b = frameLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8582a;
    }
}
