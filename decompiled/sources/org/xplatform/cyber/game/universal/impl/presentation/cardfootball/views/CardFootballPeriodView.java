package org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views;

import a.hny;
import a.nq8;
import a.q3d;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CardFootballPeriodView extends ConstraintLayout {
    public final nq8 q;
    public final List r;
    public final List s;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardFootballPeriodView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.synthetic_card_football_period_view, this);
        int i2 = R.id.ivTeamOneFirstCard;
        CardFootballAttackCardView cardFootballAttackCardView = (CardFootballAttackCardView) yum0.f(this, R.id.ivTeamOneFirstCard);
        if (cardFootballAttackCardView != null) {
            i2 = R.id.ivTeamOneSecondCard;
            CardFootballAttackCardView cardFootballAttackCardView2 = (CardFootballAttackCardView) yum0.f(this, R.id.ivTeamOneSecondCard);
            if (cardFootballAttackCardView2 != null) {
                i2 = R.id.ivTeamOneThirdCard;
                CardFootballAttackCardView cardFootballAttackCardView3 = (CardFootballAttackCardView) yum0.f(this, R.id.ivTeamOneThirdCard);
                if (cardFootballAttackCardView3 != null) {
                    i2 = R.id.ivTeamTwoFirstCard;
                    CardFootballAttackCardView cardFootballAttackCardView4 = (CardFootballAttackCardView) yum0.f(this, R.id.ivTeamTwoFirstCard);
                    if (cardFootballAttackCardView4 != null) {
                        i2 = R.id.ivTeamTwoSecondCard;
                        CardFootballAttackCardView cardFootballAttackCardView5 = (CardFootballAttackCardView) yum0.f(this, R.id.ivTeamTwoSecondCard);
                        if (cardFootballAttackCardView5 != null) {
                            i2 = R.id.ivTeamTwoThirdCard;
                            CardFootballAttackCardView cardFootballAttackCardView6 = (CardFootballAttackCardView) yum0.f(this, R.id.ivTeamTwoThirdCard);
                            if (cardFootballAttackCardView6 != null) {
                                i2 = R.id.tvAttack;
                                TextView textView = (TextView) yum0.f(this, R.id.tvAttack);
                                if (textView != null) {
                                    this.q = new nq8(this, cardFootballAttackCardView, cardFootballAttackCardView2, cardFootballAttackCardView3, cardFootballAttackCardView4, cardFootballAttackCardView5, cardFootballAttackCardView6, textView);
                                    this.r = q3d.j(cardFootballAttackCardView, cardFootballAttackCardView2, cardFootballAttackCardView3);
                                    this.s = q3d.j(cardFootballAttackCardView4, cardFootballAttackCardView5, cardFootballAttackCardView6);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setAttackNumberText$impl(int i) {
        nq8 nq8Var = this.q;
        ((TextView) nq8Var.c).setText(((CardFootballPeriodView) nq8Var.b).getContext().getString(R.string.card_football_attack_number_v2, Integer.valueOf(i)));
    }

    public final void u() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((CardFootballAttackCardView) it.next()).u();
        }
        Iterator it2 = this.s.iterator();
        while (it2.hasNext()) {
            ((CardFootballAttackCardView) it2.next()).u();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballPeriodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballPeriodView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
