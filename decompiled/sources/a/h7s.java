package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h7s extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h7s f12590a = new h7s(1, c0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/dashboard/impl/databinding/FragmentGameDashboardBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new c0r(composeView, composeView);
    }
}
