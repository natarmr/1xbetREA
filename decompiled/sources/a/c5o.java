package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakGameView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c5o f3781a = new c5o(3, l1o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticDurakGameTableBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_durak_game_table, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        CyberDurakGameView cyberDurakGameView = (CyberDurakGameView) yum0.f(viewInflate, R.id.gameView);
        if (cyberDurakGameView != null) {
            return new l1o0((FrameLayout) viewInflate, cyberDurakGameView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.gameView)));
        return null;
    }
}
