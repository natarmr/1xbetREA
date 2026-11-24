package a;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.MeasuredImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class fz60 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10395a;
    public final CheckBox b;
    public final FrameLayout c;
    public final ImageView d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final MeasuredImageView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;

    public fz60(ConstraintLayout constraintLayout, CheckBox checkBox, FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, MeasuredImageView measuredImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10395a = constraintLayout;
        this.b = checkBox;
        this.c = frameLayout;
        this.d = imageView;
        this.e = frameLayout2;
        this.f = frameLayout3;
        this.g = frameLayout4;
        this.h = measuredImageView;
        this.i = textView;
        this.j = textView2;
        this.k = textView3;
        this.l = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10395a;
    }
}
