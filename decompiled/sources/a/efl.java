package a;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;

/* JADX INFO: loaded from: classes4.dex */
public final class efl implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DragonsGoldCellGameView f7723a;
    public final TextView b;
    public final DragonsGoldGameView c;
    public final Button d;
    public final View e;

    public efl(DragonsGoldCellGameView dragonsGoldCellGameView, TextView textView, DragonsGoldGameView dragonsGoldGameView, Button button, View view) {
        this.f7723a = dragonsGoldCellGameView;
        this.b = textView;
        this.c = dragonsGoldGameView;
        this.d = button;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7723a;
    }
}
