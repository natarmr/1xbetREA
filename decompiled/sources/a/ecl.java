package a;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ecl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f7572a;
    public final boolean b;

    public ecl(FrameLayout frameLayout) {
        this.f7572a = frameLayout;
        this.b = frameLayout.getLayoutDirection() == 1;
    }
}
