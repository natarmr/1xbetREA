package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bj4 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bj4 f2687a = new bj4(1, eyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/login/visual/impl/databinding/FragmentAuthLoginVisualBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new eyq(composeView, composeView);
    }
}
