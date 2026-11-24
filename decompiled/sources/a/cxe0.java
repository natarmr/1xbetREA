package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cxe0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cxe0 f5119a = new cxe0(1, a4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/registration_default/impl/databinding/FragmentRegistrationDefaultComposeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new a4r(composeView, composeView);
    }
}
