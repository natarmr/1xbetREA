package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wph0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wph0 f39546a = new wph0(1, mqh0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/SecurityGiftsContainerFragemntBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            i = R.id.tabLayout;
            ComposeView composeView = (ComposeView) yum0.f(view, R.id.tabLayout);
            if (composeView != null) {
                return new mqh0((LinearLayout) view, dsNavigationBarBasic, composeView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
