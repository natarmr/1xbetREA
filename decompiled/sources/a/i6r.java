package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.bonus_games.impl.treasure.presentation.views.NineTreasuresView;

/* JADX INFO: loaded from: classes3.dex */
public final class i6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f14255a;
    public final ImageView b;
    public final NineTreasuresView c;

    public i6r(ConstraintLayout constraintLayout, ImageView imageView, NineTreasuresView nineTreasuresView) {
        this.f14255a = constraintLayout;
        this.b = imageView;
        this.c = nineTreasuresView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14255a;
    }
}
