package a;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class vsj0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f37955a;
    public final ImageView b;

    public vsj0(ImageView imageView, ImageView imageView2) {
        this.f37955a = imageView;
        this.b = imageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37955a;
    }
}
