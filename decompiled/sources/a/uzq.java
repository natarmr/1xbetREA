package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;

/* JADX INFO: loaded from: classes4.dex */
public final class uzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36548a;
    public final EasternNightsCellGameView b;
    public final FrameLayout c;

    public uzq(ConstraintLayout constraintLayout, EasternNightsCellGameView easternNightsCellGameView, FrameLayout frameLayout) {
        this.f36548a = constraintLayout;
        this.b = easternNightsCellGameView;
        this.c = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36548a;
    }
}
