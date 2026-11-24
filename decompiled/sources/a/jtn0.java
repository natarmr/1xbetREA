package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes5.dex */
public final class jtn0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17108a;
    public final ShapeableImageView b;
    public final View c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;
    public final View l;
    public final TextView m;
    public final DsTimer n;
    public final TextView o;

    public jtn0(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, View view, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView, View view3, TextView textView7, DsTimer dsTimer, TextView textView8) {
        this.f17108a = constraintLayout;
        this.b = shapeableImageView;
        this.c = view;
        this.d = view2;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.j = textView6;
        this.k = imageView;
        this.l = view3;
        this.m = textView7;
        this.n = dsTimer;
        this.o = textView8;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17108a;
    }
}
