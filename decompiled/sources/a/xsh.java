package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;

/* JADX INFO: loaded from: classes3.dex */
public final class xsh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41416a;
    public final RecyclerView b;
    public final Cs2MapMovementView c;
    public final Cs2GameLogBombTimerView d;

    public xsh(ConstraintLayout constraintLayout, RecyclerView recyclerView, Cs2MapMovementView cs2MapMovementView, Cs2GameLogBombTimerView cs2GameLogBombTimerView) {
        this.f41416a = constraintLayout;
        this.b = recyclerView;
        this.c = cs2MapMovementView;
        this.d = cs2GameLogBombTimerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41416a;
    }
}
