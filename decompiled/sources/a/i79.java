package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i79 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i79 f14282a = new i79(1, uyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/game_broadcasting/impl/databinding/FragmentBroadcastingZoneFullScreenBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new uyq((ComposeView) view);
    }
}
