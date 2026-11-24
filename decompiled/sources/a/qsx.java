package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.FootballEventsView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class qsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29273a;
    public final RoundCornerImageView b;
    public final RoundCornerImageView c;
    public final RecyclerView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final FootballEventsView j;
    public final View k;
    public final FootballEventsView l;
    public final View m;
    public final View n;
    public final View o;

    public qsx(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, FootballEventsView footballEventsView, View view2, FootballEventsView footballEventsView2, View view3, View view4, View view5) {
        this.f29273a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = roundCornerImageView2;
        this.d = recyclerView;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = view;
        this.j = footballEventsView;
        this.k = view2;
        this.l = footballEventsView2;
        this.m = view3;
        this.n = view4;
        this.o = view5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29273a;
    }
}
