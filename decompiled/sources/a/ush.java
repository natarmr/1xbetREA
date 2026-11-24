package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;

/* JADX INFO: loaded from: classes3.dex */
public final class ush implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cs2GameLogBombTimerView f36210a;
    public final ImageView b;
    public final TextView c;

    public ush(Cs2GameLogBombTimerView cs2GameLogBombTimerView, ImageView imageView, TextView textView) {
        this.f36210a = cs2GameLogBombTimerView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36210a;
    }
}
