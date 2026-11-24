package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final class m5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21233a;
    public final FrameLayout b;
    public final DsNavigationBar c;
    public final RecyclerView d;

    public m5r(ConstraintLayout constraintLayout, FrameLayout frameLayout, DsNavigationBar dsNavigationBar, RecyclerView recyclerView) {
        this.f21233a = constraintLayout;
        this.b = frameLayout;
        this.c = dsNavigationBar;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21233a;
    }
}
