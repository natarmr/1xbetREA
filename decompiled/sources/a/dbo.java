package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.timer.DsTimerWithDescription;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;

/* JADX INFO: loaded from: classes6.dex */
public final class dbo implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventCardMiddleCricket f5815a;
    public final DsTeamLogo b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final DsTeamLogo g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final DsTimerWithDescription k;
    public final TextView l;
    public final TextView m;
    public final DsTeamLogo n;
    public final ImageView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final DsTeamLogo s;
    public final TextView t;
    public final TextView u;

    public dbo(EventCardMiddleCricket eventCardMiddleCricket, DsTeamLogo dsTeamLogo, ImageView imageView, TextView textView, TextView textView2, TextView textView3, DsTeamLogo dsTeamLogo2, TextView textView4, TextView textView5, TextView textView6, DsTimerWithDescription dsTimerWithDescription, TextView textView7, TextView textView8, DsTeamLogo dsTeamLogo3, ImageView imageView2, TextView textView9, TextView textView10, TextView textView11, DsTeamLogo dsTeamLogo4, TextView textView12, TextView textView13) {
        this.f5815a = eventCardMiddleCricket;
        this.b = dsTeamLogo;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = dsTeamLogo2;
        this.h = textView4;
        this.i = textView5;
        this.j = textView6;
        this.k = dsTimerWithDescription;
        this.l = textView7;
        this.m = textView8;
        this.n = dsTeamLogo3;
        this.o = imageView2;
        this.p = textView9;
        this.q = textView10;
        this.r = textView11;
        this.s = dsTeamLogo4;
        this.t = textView12;
        this.u = textView13;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5815a;
    }
}
