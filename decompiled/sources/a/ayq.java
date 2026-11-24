package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;

/* JADX INFO: loaded from: classes3.dex */
public final class ayq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1681a;
    public final AppleFortuneCellGameView b;
    public final FrameLayout c;

    public ayq(ConstraintLayout constraintLayout, AppleFortuneCellGameView appleFortuneCellGameView, FrameLayout frameLayout) {
        this.f1681a = constraintLayout;
        this.b = appleFortuneCellGameView;
        this.c = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1681a;
    }
}
