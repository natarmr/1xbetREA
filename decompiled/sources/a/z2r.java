package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class z2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43684a;
    public final DsNavigationBar b;
    public final RecyclerView c;

    public z2r(LinearLayout linearLayout, DsNavigationBar dsNavigationBar, RecyclerView recyclerView) {
        this.f43684a = linearLayout;
        this.b = dsNavigationBar;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43684a;
    }
}
