package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class yt implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43194a;
    public final ImageView b;
    public final TextView c;

    public yt(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f43194a = linearLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43194a;
    }
}
