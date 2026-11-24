package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class dgu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f6059a;
    public final ImageView b;
    public final FrameLayout c;
    public final TextView d;

    public dgu0(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, TextView textView) {
        this.f6059a = frameLayout;
        this.b = imageView;
        this.c = frameLayout2;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6059a;
    }
}
