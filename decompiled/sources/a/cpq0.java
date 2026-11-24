package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cpq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpq0 f4761a = new cpq0(1, z5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_bet/impl/databinding/FragmentTirageCategoryDsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.emptyView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.emptyView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.llShimmers;
            LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llShimmers);
            if (linearLayout != null) {
                i = R.id.navigationBar;
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBar != null) {
                    i = R.id.tableView;
                    TableViewImpl tableViewImpl = (TableViewImpl) yum0.f(view, R.id.tableView);
                    if (tableViewImpl != null) {
                        return new z5r((ConstraintLayout) view, dSLottieEmptyContainer, linearLayout, dsNavigationBar, tableViewImpl);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
