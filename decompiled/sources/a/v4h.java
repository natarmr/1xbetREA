package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4h extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4h f36778a = new v4h(1, vth.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentMainBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            if (((FragmentContainerView) yum0.f(view, R.id.fragmentContainer)) != null) {
                return new vth(constraintLayout, composeView);
            }
            i = R.id.fragmentContainer;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
