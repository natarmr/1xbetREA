package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final class czq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f5235a;
    public final DsNavigationBarBasic b;
    public final RecyclerView c;

    public czq(LinearLayout linearLayout, DsNavigationBarBasic dsNavigationBarBasic, RecyclerView recyclerView) {
        this.f5235a = linearLayout;
        this.b = dsNavigationBarBasic;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5235a;
    }
}
