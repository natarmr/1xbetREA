package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final class xzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f41765a;
    public final DSLottieEmptyContainer b;
    public final DsNavigationBarBasic c;
    public final RecyclerView d;

    public xzq(LinearLayout linearLayout, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBarBasic dsNavigationBarBasic, RecyclerView recyclerView) {
        this.f41765a = linearLayout;
        this.b = dSLottieEmptyContainer;
        this.c = dsNavigationBarBasic;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41765a;
    }
}
