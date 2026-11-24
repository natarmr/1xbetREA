package a;

import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;

/* JADX INFO: loaded from: classes4.dex */
public final class du5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f6684a;
    public final /* synthetic */ float b;
    public final /* synthetic */ FinBetChartView c;

    public du5(FinBetChartView finBetChartView, float f, float f2) {
        this.c = finBetChartView;
        this.f6684a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinBetChartView finBetChartView = this.c;
        xju0 xju0Var = finBetChartView.r;
        xju0Var.b.set(0.0f, this.f6684a, xju0Var.c - 0.0f, xju0Var.d - this.b);
        ywq0 ywq0Var = finBetChartView.A1;
        finBetChartView.w1.getClass();
        ywq0Var.y();
        ywq0 ywq0Var2 = finBetChartView.z1;
        finBetChartView.v1.getClass();
        ywq0Var2.y();
        finBetChartView.g();
    }
}
