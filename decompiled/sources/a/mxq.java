package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class mxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f22570a;
    public final RecyclerView b;
    public final DsBottomBar c;
    public final DsNavigationBarBasic d;

    public mxq(ConstraintLayout constraintLayout, RecyclerView recyclerView, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f22570a = constraintLayout;
        this.b = recyclerView;
        this.c = dsBottomBar;
        this.d = dsNavigationBarBasic;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22570a;
    }
}
