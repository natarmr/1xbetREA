package a;

import android.view.View;
import android.widget.ImageView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;

/* JADX INFO: loaded from: classes2.dex */
public final class zsh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cs2MapMovementView f44904a;
    public final ImageView b;

    public zsh(Cs2MapMovementView cs2MapMovementView, ImageView imageView) {
        this.f44904a = cs2MapMovementView;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44904a;
    }
}
