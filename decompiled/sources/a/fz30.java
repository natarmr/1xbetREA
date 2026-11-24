package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class fz30 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f10391a;
    public final ImageView b;
    public final TextView c;

    public fz30(LinearLayoutCompat linearLayoutCompat, ImageView imageView, TextView textView) {
        this.f10391a = linearLayoutCompat;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10391a;
    }
}
