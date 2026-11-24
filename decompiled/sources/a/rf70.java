package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rf70 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rf70 f30372a = new rf70(1, kyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/FragmentBetButtonBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.betButton);
        if (appCompatButton != null) {
            return new kyq((FrameLayout) view, appCompatButton);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.betButton)));
        return null;
    }
}
