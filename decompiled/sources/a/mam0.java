package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mam0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mam0 f21465a = new mam0(1, oam0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/statistics_blocks/impl/databinding/StatisticBlocksFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.applyButtonBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.applyButtonBar);
        if (dsBottomBar != null) {
            i = R.id.composeView;
            ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
            if (composeView != null) {
                i = R.id.lottieEmptyView;
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
                if (dSLottieEmptyContainer != null) {
                    i = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                    if (recyclerView != null) {
                        return new oam0((ConstraintLayout) view, dsBottomBar, composeView, dSLottieEmptyContainer, recyclerView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
