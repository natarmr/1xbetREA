package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.games_mania.presentation.views.GamesManiaDice;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes4.dex */
public final class c8t implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3931a;
    public final TextView b;
    public final LinearLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final GamesManiaDice f;
    public final GamesManiaMapView g;
    public final ImageView h;
    public final ImageView i;
    public final FrameLayout j;
    public final jbo k;
    public final TextView l;
    public final TextView m;

    public c8t(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, GamesManiaDice gamesManiaDice, GamesManiaMapView gamesManiaMapView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout3, jbo jboVar, TextView textView2, TextView textView3) {
        this.f3931a = constraintLayout;
        this.b = textView;
        this.c = linearLayout;
        this.d = frameLayout;
        this.e = frameLayout2;
        this.f = gamesManiaDice;
        this.g = gamesManiaMapView;
        this.h = imageView;
        this.i = imageView2;
        this.j = frameLayout3;
        this.k = jboVar;
        this.l = textView2;
        this.m = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3931a;
    }
}
