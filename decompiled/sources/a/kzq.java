package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSendClock;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class kzq implements yfu0 {
    public final TextView A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f19163a;
    public final View b;
    public final ImageView c;
    public final MaterialButton d;
    public final ConstraintLayout e;
    public final TextInputEditText f;
    public final AppCompatImageView g;
    public final AppCompatImageView h;
    public final ImageView i;
    public final ImageView j;
    public final ImageView k;
    public final jk3 l;
    public final LinearLayout m;
    public final RecyclerView n;
    public final RecyclerView o;
    public final LottieView p;
    public final ConstraintLayout q;
    public final ProgressBarWithSendClock r;
    public final CircularProgressIndicator s;
    public final ConstraintLayout t;
    public final AppCompatTextView u;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final MaterialToolbar x;
    public final TextView y;
    public final TextView z;

    public kzq(ConstraintLayout constraintLayout, View view, ImageView imageView, MaterialButton materialButton, ConstraintLayout constraintLayout2, TextInputEditText textInputEditText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView2, ImageView imageView3, ImageView imageView4, jk3 jk3Var, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, LottieView lottieView, ConstraintLayout constraintLayout3, ProgressBarWithSendClock progressBarWithSendClock, CircularProgressIndicator circularProgressIndicator, ConstraintLayout constraintLayout4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f19163a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = materialButton;
        this.e = constraintLayout2;
        this.f = textInputEditText;
        this.g = appCompatImageView;
        this.h = appCompatImageView2;
        this.i = imageView2;
        this.j = imageView3;
        this.k = imageView4;
        this.l = jk3Var;
        this.m = linearLayout;
        this.n = recyclerView;
        this.o = recyclerView2;
        this.p = lottieView;
        this.q = constraintLayout3;
        this.r = progressBarWithSendClock;
        this.s = circularProgressIndicator;
        this.t = constraintLayout4;
        this.u = appCompatTextView;
        this.v = appCompatTextView2;
        this.w = appCompatTextView3;
        this.x = materialToolbar;
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19163a;
    }
}
