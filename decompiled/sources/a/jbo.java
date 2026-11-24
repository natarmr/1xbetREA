package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleWinningFormula;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes4.dex */
public final class jbo implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16245a = 1;
    public final ConstraintLayout b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final TextView h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;

    public jbo(EventCardMiddleWinningFormula eventCardMiddleWinningFormula, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, SportScore sportScore, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20) {
        this.b = eventCardMiddleWinningFormula;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView5;
        this.g = textView6;
        this.h = textView8;
        this.i = textView10;
        this.q = sportScore;
        this.j = textView11;
        this.k = textView12;
        this.l = textView13;
        this.m = textView15;
        this.n = textView16;
        this.o = textView18;
        this.p = textView20;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f16245a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                return (EventCardMiddleWinningFormula) constraintLayout;
            default:
                return constraintLayout;
        }
    }

    public jbo(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, Button button, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ImageView imageView14) {
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = imageView4;
        this.g = imageView5;
        this.h = button;
        this.i = imageView6;
        this.j = imageView7;
        this.k = imageView8;
        this.l = imageView9;
        this.m = imageView10;
        this.n = imageView11;
        this.o = imageView12;
        this.p = imageView13;
        this.q = imageView14;
    }
}
