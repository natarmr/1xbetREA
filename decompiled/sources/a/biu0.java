package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Group;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.MatchTimerView;

/* JADX INFO: loaded from: classes5.dex */
public final class biu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MatchTimerView f2675a;
    public final Flow b;
    public final Group c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public biu0(MatchTimerView matchTimerView, Flow flow, Group group, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f2675a = matchTimerView;
        this.b = flow;
        this.c = group;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2675a;
    }
}
