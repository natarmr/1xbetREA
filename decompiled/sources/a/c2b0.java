package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c2b0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2b0 f3618a = new c2b0(1, u2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/aggregator/popular/classic/impl/databinding/FragmentPopularClassicAggregatorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new u2r((ComposeView) view);
    }
}
