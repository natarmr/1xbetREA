package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteGameField;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteWheel;

/* JADX INFO: loaded from: classes2.dex */
public final class oxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26024a;
    public final AppCompatButton b;
    public final AfricanRouletteGameField c;
    public final RecyclerView d;
    public final TextView e;
    public final AfricanRouletteWheel f;

    public oxq(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AfricanRouletteGameField africanRouletteGameField, RecyclerView recyclerView, TextView textView, AfricanRouletteWheel africanRouletteWheel) {
        this.f26024a = constraintLayout;
        this.b = appCompatButton;
        this.c = africanRouletteGameField;
        this.d = recyclerView;
        this.e = textView;
        this.f = africanRouletteWheel;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26024a;
    }
}
