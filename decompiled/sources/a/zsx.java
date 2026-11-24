package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class zsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44928a;
    public final Flow b;
    public final Flow c;
    public final Flow d;
    public final Flow e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    public zsx(ConstraintLayout constraintLayout, Flow flow, Flow flow2, Flow flow3, Flow flow4, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f44928a = constraintLayout;
        this.b = flow;
        this.c = flow2;
        this.d = flow3;
        this.e = flow4;
        this.f = imageView;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44928a;
    }
}
