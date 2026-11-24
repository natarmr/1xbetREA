package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v430 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v430 f36760a = new v430(1, x1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/markets/base/impl/databinding/FragmentMarketsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new x1r((ComposeView) view);
    }
}
