package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final class z1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43634a;
    public final LineChartView b;
    public final FrameLayout c;
    public final RecyclerView d;
    public final DSLottieEmptyContainer e;
    public final LinearLayout f;
    public final FrameLayout g;
    public final TextView h;
    public final MaterialToolbar i;

    public z1r(ConstraintLayout constraintLayout, LineChartView lineChartView, FrameLayout frameLayout, RecyclerView recyclerView, DSLottieEmptyContainer dSLottieEmptyContainer, LinearLayout linearLayout, FrameLayout frameLayout2, TextView textView, MaterialToolbar materialToolbar) {
        this.f43634a = constraintLayout;
        this.b = lineChartView;
        this.c = frameLayout;
        this.d = recyclerView;
        this.e = dSLottieEmptyContainer;
        this.f = linearLayout;
        this.g = frameLayout2;
        this.h = textView;
        this.i = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43634a;
    }
}
