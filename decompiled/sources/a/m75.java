package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m75 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m75 f21303a = new m75(1, fyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/aggregator/impl/databinding/FragmentAvailableGamesBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new fyq((ComposeView) view);
    }
}
