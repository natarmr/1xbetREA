package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class x3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40233a;
    public final LoaderView b;
    public final LottieView c;
    public final MaterialToolbar d;

    public x3r(ConstraintLayout constraintLayout, LoaderView loaderView, LottieView lottieView, MaterialToolbar materialToolbar) {
        this.f40233a = constraintLayout;
        this.b = loaderView;
        this.c = lottieView;
        this.d = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40233a;
    }
}
