package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class gxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12089a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final RecyclerView d;

    public gxq(ConstraintLayout constraintLayout, RecyclerView recyclerView, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f12089a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12089a;
    }
}
