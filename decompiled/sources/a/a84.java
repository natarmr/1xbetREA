package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a84 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a84 f406a = new a84(1, dyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/auth_history/impl/databinding/FragmentAuthHistoryComposeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new dyq((ComposeView) view);
    }
}
