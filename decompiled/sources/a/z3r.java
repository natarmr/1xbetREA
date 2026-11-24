package a;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class z3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43735a;
    public final ImageButton b;
    public final ConstraintLayout c;
    public final LoaderView d;
    public final LottieView e;
    public final RecyclerView f;
    public final TextView g;
    public final TextView h;
    public final MaterialToolbar i;

    public z3r(ConstraintLayout constraintLayout, ImageButton imageButton, ConstraintLayout constraintLayout2, LoaderView loaderView, LottieView lottieView, RecyclerView recyclerView, TextView textView, TextView textView2, MaterialToolbar materialToolbar) {
        this.f43735a = constraintLayout;
        this.b = imageButton;
        this.c = constraintLayout2;
        this.d = loaderView;
        this.e = lottieView;
        this.f = recyclerView;
        this.g = textView;
        this.h = textView2;
        this.i = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43735a;
    }
}
