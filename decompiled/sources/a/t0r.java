package a;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes2.dex */
public final class t0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f33133a;
    public final DsNavigationBar b;
    public final RecyclerView c;

    public t0r(LinearLayoutCompat linearLayoutCompat, DsNavigationBar dsNavigationBar, RecyclerView recyclerView) {
        this.f33133a = linearLayoutCompat;
        this.b = dsNavigationBar;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33133a;
    }
}
