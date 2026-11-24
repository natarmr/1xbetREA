package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q730 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q730 f28230a = new q730(1, z1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/market_statistic/impl/databinding/FragmentMarketsStatisticBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.chart;
        LineChartView lineChartView = (LineChartView) yum0.f(view, R.id.chart);
        if (lineChartView != null) {
            i = R.id.flChart;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flChart);
            if (frameLayout != null) {
                i = R.id.graphsButtonsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.graphsButtonsRecyclerView);
                if (recyclerView != null) {
                    i = R.id.lottieEmptyView;
                    DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
                    if (dSLottieEmptyContainer != null) {
                        i = R.id.marketsTable;
                        LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.marketsTable);
                        if (linearLayout != null) {
                            i = R.id.progressBar;
                            FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.progressBar);
                            if (frameLayout2 != null) {
                                i = R.id.time;
                                TextView textView = (TextView) yum0.f(view, R.id.time);
                                if (textView != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        return new z1r((ConstraintLayout) view, lineChartView, frameLayout, recyclerView, dSLottieEmptyContainer, linearLayout, frameLayout2, textView, materialToolbar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
