package org.xplatform.cyber.game.universal.impl.presentation.durak.view;

import a.a8z;
import a.eng;
import a.g2x;
import a.ing;
import a.j2x;
import a.jk3;
import a.jng;
import a.len;
import a.lfr;
import a.lhf;
import a.m1o0;
import a.maz;
import a.nng;
import a.q3d;
import a.qng;
import a.rng;
import a.u0d;
import a.wez;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CyberDurakGameView extends ConstraintLayout {
    public final a8z q;
    public qng r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyberDurakGameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 6));
        setLayoutDirection(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m1o0 getBinding() {
        return (m1o0) this.q.getValue();
    }

    /* JADX INFO: renamed from: setBackground-yKGKXMA, reason: not valid java name */
    public final void m31setBackgroundyKGKXMA(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.j(getBinding().g, str, R.drawable.cybergame_durak_background_placeholder, 0, q3d.j(g2x.f10583a, new j2x(getContext().getResources().getDimensionPixelSize(R.dimen.corner_radius_12))), null, null, 492);
    }

    public final void setCardDeck(ing ingVar) {
        ingVar.getClass();
        CyberDurakCardDeckView cyberDurakCardDeckView = getBinding().e;
        int i = ingVar.f15073a;
        int i2 = ingVar.b;
        int i3 = ingVar.c;
        jk3 jk3Var = cyberDurakCardDeckView.f46529a;
        byte b = 0;
        if (i == 0) {
            ImageView imageView = (ImageView) jk3Var.f;
            ImageView imageView2 = (ImageView) jk3Var.e;
            imageView.setVisibility(8);
            ((ImageView) jk3Var.c).setVisibility(8);
            ((TextView) jk3Var.d).setVisibility(8);
            imageView2.setVisibility(0);
            imageView2.setImageResource(i3);
        } else if (i == 1) {
            ((ImageView) jk3Var.f).setVisibility(0);
            ((ImageView) jk3Var.f).setImageResource(i2);
            ((ImageView) jk3Var.c).setVisibility(8);
            ((TextView) jk3Var.d).setVisibility(8);
            ((ImageView) jk3Var.e).setVisibility(8);
        } else if (i > 1) {
            ImageView imageView3 = (ImageView) jk3Var.f;
            TextView textView = (TextView) jk3Var.d;
            imageView3.setVisibility(0);
            imageView3.setImageResource(i2);
            Integer num = cyberDurakCardDeckView.b;
            if (num != null && num.intValue() == -1) {
                ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
                valueAnimatorOfFloat.setDuration(1000L);
                valueAnimatorOfFloat.addUpdateListener(new eng(imageView3, b));
                valueAnimatorOfFloat.start();
            }
            textView.setVisibility(0);
            textView.setText(String.valueOf(i));
            ((ImageView) jk3Var.c).setVisibility(0);
            ((ImageView) jk3Var.e).setVisibility(8);
        }
        cyberDurakCardDeckView.b = Integer.valueOf(i);
    }

    public final void setCardsOnTable(jng jngVar) {
        jngVar.getClass();
        getBinding().i.b(jngVar.f16810a, jngVar.b, jngVar.c);
    }

    /* JADX INFO: renamed from: setCountRebound-4eaVOWs, reason: not valid java name */
    public final void m32setCountRebound4eaVOWs(String str) {
        str.getClass();
        getBinding().b.setText(str);
    }

    /* JADX INFO: renamed from: setCountStep-4ygb3Fo, reason: not valid java name */
    public final void m33setCountStep4ygb3Fo(String str) {
        str.getClass();
        getBinding().c.setText(str);
    }

    /* JADX INFO: renamed from: setCountTaken-xxXNjZw, reason: not valid java name */
    public final void m34setCountTakenxxXNjZw(String str) {
        str.getClass();
        getBinding().d.setText(str);
    }

    public final void setFirstPlayerCards(nng nngVar) {
        nngVar.getClass();
        getBinding().f.c.c(nngVar.f23818a, nngVar.b, false);
    }

    /* JADX INFO: renamed from: setFirstPlayerName-7hlsDRw, reason: not valid java name */
    public final void m35setFirstPlayerName7hlsDRw(String str) {
        str.getClass();
        getBinding().f.d.setText(str);
    }

    /* JADX INFO: renamed from: setFirstPlayerStatus-xj29_n0, reason: not valid java name */
    public final void m36setFirstPlayerStatusxj29_n0(String str) {
        str.getClass();
        getBinding().f.e.setText(str);
    }

    public final void setMatchDescription(qng qngVar) {
        qngVar.getClass();
        len lenVar = qngVar.b;
        if ((lenVar == len.c || lenVar == len.b) && this.r != null) {
            getBinding().h.postDelayed(new lfr((Object) this, (Object) qngVar, (byte) 6), 3500L);
        } else {
            getBinding().h.setText(qngVar.f29026a);
        }
        this.r = qngVar;
    }

    public final void setSecondPlayerCards(rng rngVar) {
        rngVar.getClass();
        getBinding().j.c.c(rngVar.f30786a, rngVar.b, true);
    }

    /* JADX INFO: renamed from: setSecondPlayerName-x_7YRRc, reason: not valid java name */
    public final void m37setSecondPlayerNamex_7YRRc(String str) {
        str.getClass();
        getBinding().j.d.setText(str);
    }

    /* JADX INFO: renamed from: setSecondPlayerStatus-by2wi9I, reason: not valid java name */
    public final void m38setSecondPlayerStatusby2wi9I(String str) {
        str.getClass();
        getBinding().j.e.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberDurakGameView(Context context) {
        this(context, null);
        context.getClass();
    }
}
