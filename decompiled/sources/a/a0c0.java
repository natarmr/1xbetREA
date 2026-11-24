package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a0c0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0c0 f20a = new a0c0(1, b3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/personal/impl/databinding/FragmentProfileEditRecyclerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnConfirm;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.btnConfirm);
        if (dsBottomBar != null) {
            i = R.id.lottieEmptyView;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
            if (lottieView != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.progress;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                    if (frameLayout != null) {
                        i = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                        if (recyclerView != null) {
                            return new b3r((ConstraintLayout) view, dsBottomBar, lottieView, dsNavigationBarBasic, frameLayout, recyclerView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
