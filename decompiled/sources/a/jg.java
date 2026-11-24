package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleRoulette;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class jg implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16454a = 0;
    public final TextView b;
    public final TextView c;
    public final ConstraintLayout d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;

    public jg(DsAccountSelection dsAccountSelection, TextView textView, Flow flow, Flow flow2, Flow flow3, TextView textView2, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, ImageView imageView3, View view, DsButton dsButton) {
        this.d = dsAccountSelection;
        this.b = textView;
        this.e = flow;
        this.f = flow2;
        this.g = flow3;
        this.c = textView2;
        this.h = imageView;
        this.k = frameLayout;
        this.i = imageView2;
        this.j = imageView3;
        this.l = view;
        this.m = dsButton;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f16454a;
        ConstraintLayout constraintLayout = this.d;
        switch (b) {
            case 0:
                return (DsAccountSelection) constraintLayout;
            default:
                return (EventCardMiddleRoulette) constraintLayout;
        }
    }

    public jg(EventCardMiddleRoulette eventCardMiddleRoulette, DsTeamLogo dsTeamLogo, TextView textView, SportScore sportScore, DsTeamLogo dsTeamLogo2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.d = eventCardMiddleRoulette;
        this.e = dsTeamLogo;
        this.b = textView;
        this.f = sportScore;
        this.g = dsTeamLogo2;
        this.c = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
        this.l = textView7;
        this.m = textView8;
    }
}
