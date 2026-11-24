package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dyz extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dyz f6916a = new dyz(1, v0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/limits_kenya/impl/databinding/FragmentKenyaLimitsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new v0r(composeView, composeView);
    }
}
