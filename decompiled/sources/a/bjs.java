package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bjs extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bjs f2720a = new bjs(1, d0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/lite/impl/databinding/FragmentGameLiteBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new d0r(composeView, composeView);
    }
}
