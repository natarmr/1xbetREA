package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class nux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24166a;
    public final ImageView b;
    public final ImageView c;
    public final RoundCornerImageView d;
    public final RoundCornerImageView e;
    public final TextView f;
    public final AppCompatTextView g;
    public final TextView h;
    public final AppCompatTextView i;
    public final TextView j;
    public final TextView k;
    public final AppCompatTextView l;

    public nux(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, TextView textView, AppCompatTextView appCompatTextView, TextView textView2, AppCompatTextView appCompatTextView2, TextView textView3, TextView textView4, AppCompatTextView appCompatTextView3) {
        this.f24166a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = roundCornerImageView;
        this.e = roundCornerImageView2;
        this.f = textView;
        this.g = appCompatTextView;
        this.h = textView2;
        this.i = appCompatTextView2;
        this.j = textView3;
        this.k = textView4;
        this.l = appCompatTextView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24166a;
    }
}
