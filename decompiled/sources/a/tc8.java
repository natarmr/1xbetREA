package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tc8 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tc8 f33707a = new tc8(1, vc8.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_agreements/impl/databinding/BonusAgreementsFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new vc8((ComposeView) view);
    }
}
