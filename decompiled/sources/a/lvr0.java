package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lvr0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lvr0 f20729a = new lvr0(1, nvr0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_bet/impl/databinding/TotoTirageComposeFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new nvr0((ComposeView) view);
    }
}
