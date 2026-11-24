package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ku50 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ku50 f18898a = new ku50(1, c2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/promotions/news/impl/databinding/FragmentNewsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new c2r((ComposeView) view);
    }
}
