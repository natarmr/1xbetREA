package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jr70 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jr70 f16990a = new jr70(1, l2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/online_cal/impl/databinding/FragmentOnlineCallBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new l2r(composeView, composeView);
    }
}
