package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy1 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sy1 f33003a = new sy1(1, uy1.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/aggregator/impl/databinding/AggregatorTournamentsFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new uy1((ComposeView) view);
    }
}
