package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class rjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f30598a;
    public final ImageView b;
    public final ImageView c;

    public rjk(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.f30598a = frameLayout;
        this.b = imageView;
        this.c = imageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f30598a;
    }
}
