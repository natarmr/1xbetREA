package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0t extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0t f22717a = new n0t(1, g0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameZoneLayoutBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.gameZoneContainer;
        if (((MaterialCardView) yum0.f(view, R.id.gameZoneContainer)) != null) {
            i = R.id.gameZoneView;
            GameZoneView gameZoneView = (GameZoneView) yum0.f(view, R.id.gameZoneView);
            if (gameZoneView != null) {
                i = R.id.tvErrorMessage;
                TextView textView = (TextView) yum0.f(view, R.id.tvErrorMessage);
                if (textView != null) {
                    return new g0r((ConstraintLayout) view, gameZoneView, textView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
