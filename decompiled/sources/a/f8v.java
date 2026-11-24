package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f8v extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f8v f9127a = new f8v(1, n0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/search/impl/databinding/FragmentGlobalSearchContainerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.container;
        if (((FragmentContainerView) yum0.f(view, R.id.container)) != null) {
            i = R.id.rootView;
            ComposeView composeView = (ComposeView) yum0.f(view, R.id.rootView);
            if (composeView != null) {
                return new n0r((LinearLayout) view, composeView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
