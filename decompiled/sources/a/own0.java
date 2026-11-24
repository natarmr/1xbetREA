package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes5.dex */
public final class own0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25972a;
    public final ShapeableImageView b;
    public final View c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final DsTeamLogo g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final DsTeamLogo n;
    public final TextView o;
    public final ImageView p;
    public final View q;
    public final TextView r;
    public final DsTimer s;
    public final SportScore t;

    public own0(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, View view, View view2, TextView textView, TextView textView2, DsTeamLogo dsTeamLogo, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, DsTeamLogo dsTeamLogo2, TextView textView9, ImageView imageView, View view3, TextView textView10, DsTimer dsTimer, SportScore sportScore) {
        this.f25972a = constraintLayout;
        this.b = shapeableImageView;
        this.c = view;
        this.d = view2;
        this.e = textView;
        this.f = textView2;
        this.g = dsTeamLogo;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
        this.l = textView7;
        this.m = textView8;
        this.n = dsTeamLogo2;
        this.o = textView9;
        this.p = imageView;
        this.q = view3;
        this.r = textView10;
        this.s = dsTimer;
        this.t = sportScore;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25972a;
    }
}
