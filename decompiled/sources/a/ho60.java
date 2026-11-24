package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.presentation.bonuses.views.GamesBonusButtonViewNew;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ho60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ho60 f13380a = new ho60(1, sm70.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/OnexGameToolbarFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bonus_button;
        GamesBonusButtonViewNew gamesBonusButtonViewNew = (GamesBonusButtonViewNew) yum0.f(view, R.id.bonus_button);
        if (gamesBonusButtonViewNew != null) {
            i = R.id.bonus_shimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) yum0.f(view, R.id.bonus_shimmer);
            if (shimmerFrameLayout != null) {
                MaterialToolbar materialToolbar = (MaterialToolbar) view;
                i = R.id.rules_button;
                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.rules_button);
                if (appCompatImageView != null) {
                    i = R.id.rules_shimmer;
                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) yum0.f(view, R.id.rules_shimmer);
                    if (shimmerFrameLayout2 != null) {
                        i = R.id.toolbar_container;
                        if (((ConstraintLayout) yum0.f(view, R.id.toolbar_container)) != null) {
                            return new sm70(materialToolbar, gamesBonusButtonViewNew, shimmerFrameLayout, materialToolbar, appCompatImageView, shimmerFrameLayout2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
