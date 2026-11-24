package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryPickerView;

/* JADX INFO: loaded from: classes3.dex */
public final class b2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1867a;
    public final FrameLayout b;
    public final TextView c;
    public final MemoryGameView d;
    public final MemoryPickerView e;

    public b2r(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, MemoryGameView memoryGameView, MemoryPickerView memoryPickerView) {
        this.f1867a = constraintLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = memoryGameView;
        this.e = memoryPickerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1867a;
    }
}
