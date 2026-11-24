package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n2e0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n2e0 f22795a = new n2e0(1, ijk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/rate_app/impl/databinding/DialogRateAppBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_rate_app, (ViewGroup) null, false);
        ComposeView composeView = (ComposeView) yum0.f(viewInflate, R.id.composeView);
        if (composeView != null) {
            return new ijk((FrameLayout) viewInflate, composeView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.composeView)));
        return null;
    }
}
