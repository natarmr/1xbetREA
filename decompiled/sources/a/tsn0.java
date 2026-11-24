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
public final class tsn0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34468a;
    public final ShapeableImageView b;
    public final View c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final DsTeamLogo g;
    public final TextView h;
    public final DsTeamLogo i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final DsTeamLogo o;
    public final TextView p;
    public final DsTeamLogo q;
    public final ImageView r;
    public final View s;
    public final TextView t;
    public final DsTimer u;
    public final SportScore v;

    public tsn0(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, View view, View view2, TextView textView, TextView textView2, DsTeamLogo dsTeamLogo, TextView textView3, DsTeamLogo dsTeamLogo2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, DsTeamLogo dsTeamLogo3, TextView textView9, DsTeamLogo dsTeamLogo4, ImageView imageView, View view3, TextView textView10, DsTimer dsTimer, SportScore sportScore) {
        this.f34468a = constraintLayout;
        this.b = shapeableImageView;
        this.c = view;
        this.d = view2;
        this.e = textView;
        this.f = textView2;
        this.g = dsTeamLogo;
        this.h = textView3;
        this.i = dsTeamLogo2;
        this.j = textView4;
        this.k = textView5;
        this.l = textView6;
        this.m = textView7;
        this.n = textView8;
        this.o = dsTeamLogo3;
        this.p = textView9;
        this.q = dsTeamLogo4;
        this.r = imageView;
        this.s = view3;
        this.t = textView10;
        this.u = dsTimer;
        this.v = sportScore;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34468a;
    }
}
