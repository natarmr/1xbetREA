package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zt7 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zt7 f44942a = new zt7(1, nyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/bets_on_players/impl/databinding/FragmentBetsOnPlayersBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new nyq((ComposeView) view);
    }
}
