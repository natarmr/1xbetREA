package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ohr0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ohr0 f25279a = new ohr0(1, d6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_bet/impl/databinding/FragmentTotoBetDsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new d6r((ComposeView) view);
    }
}
