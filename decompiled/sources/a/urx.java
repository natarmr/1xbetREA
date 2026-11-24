package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class urx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f36183a;
    public final ImageView b;
    public final TextView c;

    public urx(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f36183a = linearLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36183a;
    }
}
