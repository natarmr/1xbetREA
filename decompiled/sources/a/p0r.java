package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class p0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26167a;
    public final DsNavigationBar b;
    public final RecyclerView c;

    public p0r(ConstraintLayout constraintLayout, DsNavigationBar dsNavigationBar, RecyclerView recyclerView) {
        this.f26167a = constraintLayout;
        this.b = dsNavigationBar;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26167a;
    }
}
