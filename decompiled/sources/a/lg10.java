package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lg10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lg10 f19985a = new lg10(1, ng10.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/aggregator/loyalty_program/impl/databinding/LoyaltyProgramBasicFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new ng10(composeView, composeView);
    }
}
