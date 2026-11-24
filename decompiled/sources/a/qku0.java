package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class qku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f28904a;
    public final ImageView b;
    public final TextView c;

    public qku0(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.f28904a = frameLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28904a;
    }
}
