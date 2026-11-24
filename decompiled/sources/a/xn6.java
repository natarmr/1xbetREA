package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class xn6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41158a;
    public final FrameLayout b;
    public final ImageView c;
    public final LottieView d;
    public final DsNavigationBarBasic e;
    public final ComposeView f;
    public final RecyclerView g;
    public final TextView h;

    public xn6(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic, ComposeView composeView, RecyclerView recyclerView, TextView textView) {
        this.f41158a = constraintLayout;
        this.b = frameLayout;
        this.c = imageView;
        this.d = lottieView;
        this.e = dsNavigationBarBasic;
        this.f = composeView;
        this.g = recyclerView;
        this.h = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41158a;
    }
}
