package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sun0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sun0 f32830a = new sun0(1, w5q.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/swipex/impl/databinding/FiltersFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            return new w5q((FrameLayout) view, composeView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeView)));
        return null;
    }
}
