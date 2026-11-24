package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hlf extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hlf f13257a = new hlf(3, xsh.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/counterstrike/impl/databinding/CybergameCs2GameLogViewBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_cs2_game_log_view, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.gameLogRecycler;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.gameLogRecycler);
        if (recyclerView != null) {
            i = R.id.mapMovementView;
            Cs2MapMovementView cs2MapMovementView = (Cs2MapMovementView) yum0.f(viewInflate, R.id.mapMovementView);
            if (cs2MapMovementView != null) {
                i = R.id.vBombLayout;
                Cs2GameLogBombTimerView cs2GameLogBombTimerView = (Cs2GameLogBombTimerView) yum0.f(viewInflate, R.id.vBombLayout);
                if (cs2GameLogBombTimerView != null) {
                    return new xsh((ConstraintLayout) viewInflate, recyclerView, cs2MapMovementView, cs2GameLogBombTimerView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
