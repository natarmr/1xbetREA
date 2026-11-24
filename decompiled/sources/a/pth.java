package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class pth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f27564a;
    public final ImageView b;

    public pth(FrameLayout frameLayout, ImageView imageView) {
        this.f27564a = frameLayout;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27564a;
    }
}
