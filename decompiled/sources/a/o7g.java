package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o7g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7g f24785a = new o7g(1, t7g.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            i = R.id.emptyComposeView;
            ComposeView composeView2 = (ComposeView) yum0.f(view, R.id.emptyComposeView);
            if (composeView2 != null) {
                i = R.id.fragmentContainer;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.fragmentContainer);
                if (frameLayout != null) {
                    return new t7g((ConstraintLayout) view, composeView, composeView2, frameLayout);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
