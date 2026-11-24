package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l6f0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l6f0 f19504a = new l6f0(1, vn8.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/registration/success/impl/databinding/BottomDialogRegistrarionSuccessBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new vn8(composeView, composeView);
    }
}
