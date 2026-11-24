package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tc10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tc10 f33697a = new tc10(1, vc10.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/lotto/impl/databinding/LottoFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            return new vc10((FrameLayout) view, composeView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeView)));
        return null;
    }
}
