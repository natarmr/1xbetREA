package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final class tqq0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34392a;
    public final DSLottieEmptyContainer b;
    public final LinearLayout c;
    public final DsNavigationBar d;
    public final TableViewImpl e;

    public tqq0(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, LinearLayout linearLayout, DsNavigationBar dsNavigationBar, TableViewImpl tableViewImpl) {
        this.f34392a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = linearLayout;
        this.d = dsNavigationBar;
        this.e = tableViewImpl;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34392a;
    }
}
