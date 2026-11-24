package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class c6g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3816a;
    public final ImageView b;

    public c6g(FrameLayout frameLayout, ImageView imageView) {
        this.f3816a = frameLayout;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3816a;
    }
}
