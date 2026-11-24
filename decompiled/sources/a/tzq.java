package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;

/* JADX INFO: loaded from: classes4.dex */
public final class tzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34817a;
    public final DragonsGoldCellGameView b;
    public final FrameLayout c;

    public tzq(ConstraintLayout constraintLayout, DragonsGoldCellGameView dragonsGoldCellGameView, FrameLayout frameLayout) {
        this.f34817a = constraintLayout;
        this.b = dragonsGoldCellGameView;
        this.c = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34817a;
    }
}
