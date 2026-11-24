package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class edf0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edf0 f7615a = new edf0(1, c4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/related/impl/databinding/FragmentRelatedBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            i = R.id.relatedGamesList;
            ComposeView composeView = (ComposeView) yum0.f(view, R.id.relatedGamesList);
            if (composeView != null) {
                return new c4r(constraintLayout, dsNavigationBarBasic, composeView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
