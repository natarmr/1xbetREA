package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class hau0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12742a;
    public final MaterialButton b;
    public final LottieView c;
    public final nq8 d;
    public final MaterialToolbar e;
    public final TextView f;
    public final ImageView g;
    public final TextView h;
    public final LinearLayout i;

    public hau0(ConstraintLayout constraintLayout, MaterialButton materialButton, LottieView lottieView, nq8 nq8Var, MaterialToolbar materialToolbar, TextView textView, ImageView imageView, TextView textView2, LinearLayout linearLayout) {
        this.f12742a = constraintLayout;
        this.b = materialButton;
        this.c = lottieView;
        this.d = nq8Var;
        this.e = materialToolbar;
        this.f = textView;
        this.g = imageView;
        this.h = textView2;
        this.i = linearLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12742a;
    }
}
