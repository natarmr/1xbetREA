package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class npc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final npc0 f23906a = new npc0(1, f3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/promo/impl/databinding/FragmentPromoShopCategoriesComposeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeViewPromoShopCategory);
        if (composeView != null) {
            return new f3r((FrameLayout) view, composeView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeViewPromoShopCategory)));
        return null;
    }
}
