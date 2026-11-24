package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
public final class g0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10472a;
    public final GameZoneView b;
    public final TextView c;

    public g0r(ConstraintLayout constraintLayout, GameZoneView gameZoneView, TextView textView) {
        this.f10472a = constraintLayout;
        this.b = gameZoneView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10472a;
    }
}
