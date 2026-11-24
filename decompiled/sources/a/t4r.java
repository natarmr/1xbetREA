package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes.dex */
public final class t4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33335a;
    public final ProgressBar b;
    public final RecyclerView c;
    public final DsNavigationBar d;

    public t4r(LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, DsNavigationBar dsNavigationBar) {
        this.f33335a = linearLayout;
        this.b = progressBar;
        this.c = recyclerView;
        this.d = dsNavigationBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33335a;
    }
}
