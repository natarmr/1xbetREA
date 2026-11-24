package a;

import android.view.View;
import android.widget.TextView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.FootballEventsView;

/* JADX INFO: loaded from: classes5.dex */
public final class chu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FootballEventsView f4378a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public chu0(FootballEventsView footballEventsView, TextView textView, TextView textView2, TextView textView3) {
        this.f4378a = footballEventsView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4378a;
    }
}
