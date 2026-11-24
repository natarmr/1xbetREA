package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m9c0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m9c0 f21403a = new m9c0(1, y9c0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/uikit/databinding/PromoCheckFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new y9c0((ComposeView) view);
    }
}
