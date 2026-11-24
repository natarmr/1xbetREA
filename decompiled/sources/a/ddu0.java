package a;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ddu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f5915a;
    public final View b;

    public ddu0(View view, FrameLayout frameLayout) {
        this.f5915a = frameLayout;
        this.b = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5915a;
    }
}
