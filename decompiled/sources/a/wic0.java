package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes3.dex */
public final class wic0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39208a;
    public final DsShimmerView b;
    public final FrameLayout c;
    public final View d;
    public final TextView e;
    public final MaterialButton f;
    public final DsShimmerView g;
    public final TextView h;

    public wic0(ConstraintLayout constraintLayout, DsShimmerView dsShimmerView, FrameLayout frameLayout, View view, TextView textView, MaterialButton materialButton, DsShimmerView dsShimmerView2, TextView textView2) {
        this.f39208a = constraintLayout;
        this.b = dsShimmerView;
        this.c = frameLayout;
        this.d = view;
        this.e = textView;
        this.f = materialButton;
        this.g = dsShimmerView2;
        this.h = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39208a;
    }
}
