package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.InterceptTouchRecyclerView;
import org.xplatform.cyber.game.core.game_background.presentation.view.TopCropFillImageView;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.toolbar.statical.DsNavigationBarStatic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class npg extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final npg f23912a = new npg(1, rth.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/cyberstatistic/impl/databinding/CybergameStatisticFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            i = R.id.imgBackground;
            TopCropFillImageView topCropFillImageView = (TopCropFillImageView) yum0.f(view, R.id.imgBackground);
            if (topCropFillImageView != null) {
                i = R.id.lottieEmptyView;
                DsLottieEmpty dsLottieEmpty = (DsLottieEmpty) yum0.f(view, R.id.lottieEmptyView);
                if (dsLottieEmpty != null) {
                    i = R.id.navigationBar;
                    DsNavigationBarStatic dsNavigationBarStatic = (DsNavigationBarStatic) yum0.f(view, R.id.navigationBar);
                    if (dsNavigationBarStatic != null) {
                        i = R.id.recyclerView;
                        InterceptTouchRecyclerView interceptTouchRecyclerView = (InterceptTouchRecyclerView) yum0.f(view, R.id.recyclerView);
                        if (interceptTouchRecyclerView != null) {
                            return new rth((ConstraintLayout) view, composeView, topCropFillImageView, dsLottieEmpty, dsNavigationBarStatic, interceptTouchRecyclerView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
