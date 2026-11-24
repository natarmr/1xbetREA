package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y79 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y79 f42142a = new y79(1, f0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameZoneFullscreenLayoutBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.gameZoneView;
        GameZoneView gameZoneView = (GameZoneView) yum0.f(view, R.id.gameZoneView);
        if (gameZoneView != null) {
            i = R.id.tvErrorMessage;
            TextView textView = (TextView) yum0.f(view, R.id.tvErrorMessage);
            if (textView != null) {
                return new f0r((FrameLayout) view, gameZoneView, textView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
