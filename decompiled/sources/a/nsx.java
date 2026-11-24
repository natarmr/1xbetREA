package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.MatchTimerView;

/* JADX INFO: loaded from: classes.dex */
public final class nsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24071a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final MatchTimerView e;

    public nsx(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, MatchTimerView matchTimerView) {
        this.f24071a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = matchTimerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24071a;
    }
}
