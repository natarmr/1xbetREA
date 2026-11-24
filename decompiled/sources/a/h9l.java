package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class h9l implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f12683a;
    public final ImageView b;

    public h9l(FrameLayout frameLayout, ImageView imageView) {
        this.f12683a = frameLayout;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12683a;
    }
}
