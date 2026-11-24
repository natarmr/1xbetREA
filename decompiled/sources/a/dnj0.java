package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class dnj0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6372a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final LinearLayout e;
    public final Group f;
    public final ImageView g;
    public final SubsamplingScaleImageView h;
    public final LottieView i;
    public final ProgressBar j;

    public dnj0(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, LinearLayout linearLayout, Group group, ImageView imageView, SubsamplingScaleImageView subsamplingScaleImageView, LottieView lottieView, ProgressBar progressBar) {
        this.f6372a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
        this.e = linearLayout;
        this.f = group;
        this.g = imageView;
        this.h = subsamplingScaleImageView;
        this.i = lottieView;
        this.j = progressBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6372a;
    }
}
