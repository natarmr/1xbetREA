package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class trr0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final trr0 f34432a = new trr0(1, e6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_jackpot/impl/databinding/FragmentTotoJackpotDsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new e6r((ComposeView) view);
    }
}
