package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x82 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x82 f40442a = new x82(1, xxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/special_event/impl/databinding/FragmentAltDesignLSpecialEventBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new xxq(composeView, composeView);
    }
}
