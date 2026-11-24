package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class e3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7151a;
    public final DsNavigationBarBasic b;
    public final RecyclerView c;

    public e3r(ConstraintLayout constraintLayout, DsNavigationBarBasic dsNavigationBarBasic, RecyclerView recyclerView) {
        this.f7151a = constraintLayout;
        this.b = dsNavigationBarBasic;
        this.c = recyclerView;
    }

    public static e3r a(View view) {
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            i = R.id.rvPromoSettingsItems;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvPromoSettingsItems);
            if (recyclerView != null) {
                return new e3r((ConstraintLayout) view, dsNavigationBarBasic, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7151a;
    }
}
