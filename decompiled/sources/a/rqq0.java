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
public final /* synthetic */ class rqq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rqq0 f30944a = new rqq0(1, tqq0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_bet/impl/databinding/TirageParametersTableFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.dsLottieContainer;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.dsLottieContainer);
        if (dSLottieEmptyContainer != null) {
            i = R.id.llShimmers;
            LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llShimmers);
            if (linearLayout != null) {
                i = R.id.navigationBar;
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBar != null) {
                    i = R.id.table;
                    TableViewImpl tableViewImpl = (TableViewImpl) yum0.f(view, R.id.table);
                    if (tableViewImpl != null) {
                        return new tqq0((ConstraintLayout) view, dSLottieEmptyContainer, linearLayout, dsNavigationBar, tableViewImpl);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
