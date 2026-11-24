package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class vfk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f37337a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final LinearLayout d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final View g;

    public vfk(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, LinearLayout linearLayout, FrameLayout frameLayout4, FrameLayout frameLayout5, View view) {
        this.f37337a = frameLayout;
        this.b = frameLayout2;
        this.c = frameLayout3;
        this.d = linearLayout;
        this.e = frameLayout4;
        this.f = frameLayout5;
        this.g = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37337a;
    }
}
