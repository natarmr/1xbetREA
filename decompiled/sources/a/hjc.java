package a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.ui_core.circleindicator.CircleIndicator;

/* JADX INFO: loaded from: classes6.dex */
public final class hjc extends ahe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13154a;
    public final /* synthetic */ CircleIndicator b;

    public /* synthetic */ hjc(CircleIndicator circleIndicator, byte b) {
        this.f13154a = b;
        this.b = circleIndicator;
    }

    @Override // a.ahe0
    public void a() {
        yge0 adapter;
        switch (this.f13154a) {
            case 1:
                CircleIndicator circleIndicator = this.b;
                ViewPager2 viewPager2 = circleIndicator.h;
                circleIndicator.k = (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) ? 0 : adapter.d();
                circleIndicator.d();
                break;
        }
    }

    @Override // a.ahe0
    public final void d(int i, int i2) {
        yge0 adapter;
        yge0 adapter2;
        byte b = this.f13154a;
        int iD = 0;
        CircleIndicator circleIndicator = this.b;
        switch (b) {
            case 0:
                RecyclerView recyclerView = circleIndicator.g;
                circleIndicator.j = circleIndicator.e(recyclerView != null ? recyclerView.getLayoutManager() : null);
                RecyclerView recyclerView2 = circleIndicator.g;
                if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                    iD = adapter.d();
                }
                circleIndicator.k = iD;
                circleIndicator.d();
                break;
            default:
                ViewPager2 viewPager2 = circleIndicator.h;
                if (viewPager2 != null && (adapter2 = viewPager2.getAdapter()) != null) {
                    iD = adapter2.d();
                }
                circleIndicator.k = iD;
                circleIndicator.d();
                break;
        }
    }

    @Override // a.ahe0
    public final void f(int i, int i2) {
        yge0 adapter;
        yge0 adapter2;
        byte b = this.f13154a;
        int iD = 0;
        CircleIndicator circleIndicator = this.b;
        switch (b) {
            case 0:
                int i3 = CircleIndicator.o;
                int iE = circleIndicator.i;
                if (iE == -1 || iE <= 0) {
                    RecyclerView recyclerView = circleIndicator.g;
                    iE = circleIndicator.e(recyclerView != null ? recyclerView.getLayoutManager() : null);
                } else if (i < iE) {
                    iE--;
                }
                circleIndicator.j = iE;
                RecyclerView recyclerView2 = circleIndicator.g;
                if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                    iD = adapter.d();
                }
                circleIndicator.k = iD;
                circleIndicator.d();
                break;
            default:
                ViewPager2 viewPager2 = circleIndicator.h;
                if (viewPager2 != null && (adapter2 = viewPager2.getAdapter()) != null) {
                    iD = adapter2.d();
                }
                circleIndicator.k = iD;
                circleIndicator.d();
                break;
        }
    }
}
