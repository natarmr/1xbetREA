package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class lku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f20219a;
    public final ImageView b;
    public final TextView c;

    public lku0(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.f20219a = frameLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20219a;
    }
}
