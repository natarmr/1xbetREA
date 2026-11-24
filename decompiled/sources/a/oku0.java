package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class oku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f25424a;
    public final ImageView b;

    public oku0(FrameLayout frameLayout, ImageView imageView) {
        this.f25424a = frameLayout;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25424a;
    }
}
