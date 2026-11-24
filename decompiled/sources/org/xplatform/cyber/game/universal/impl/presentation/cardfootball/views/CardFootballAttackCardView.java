package org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views;

import a.cha;
import a.hny;
import a.iha;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CardFootballAttackCardView extends ConstraintLayout {
    public final vd7 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardFootballAttackCardView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.synthetic_card_football_attack_card_view, this);
        int i2 = R.id.ivCard;
        ImageView imageView = (ImageView) yum0.f(this, R.id.ivCard);
        if (imageView != null) {
            i2 = R.id.ivStatus;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.ivStatus);
            if (imageView2 != null) {
                this.q = new vd7(this, imageView, imageView2, (byte) 22);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void u() {
        vd7 vd7Var = this.q;
        ImageView imageView = (ImageView) vd7Var.c;
        Context context = getContext();
        context.getClass();
        imageView.setImageDrawable(context.getDrawable(R.drawable.card_back));
        ImageView imageView2 = (ImageView) vd7Var.d;
        Context context2 = getContext();
        context2.getClass();
        imageView2.setImageDrawable(context2.getDrawable(R.drawable.transparent));
    }

    public final void v(cha chaVar, int i, boolean z) {
        chaVar.getClass();
        int i2 = chaVar.b ? R.drawable.ic_status_green_check_circle : R.drawable.ic_status_red_minus_circle;
        vd7 vd7Var = this.q;
        if (!z) {
            Context context = getContext();
            context.getClass();
            new iha(context, (ImageView) vd7Var.c, (ImageView) vd7Var.d, chaVar.f4350a, i2, i);
            return;
        }
        ImageView imageView = (ImageView) vd7Var.c;
        Context context2 = getContext();
        context2.getClass();
        imageView.setImageDrawable(context2.getDrawable(chaVar.f4350a));
        ImageView imageView2 = (ImageView) vd7Var.d;
        Context context3 = getContext();
        context3.getClass();
        imageView2.setImageDrawable(context3.getDrawable(i2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballAttackCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballAttackCardView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
