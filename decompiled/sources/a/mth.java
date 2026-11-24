package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class mth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f22370a;
    public final ImageView b;

    public mth(FrameLayout frameLayout, ImageView imageView) {
        this.f22370a = frameLayout;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22370a;
    }
}
