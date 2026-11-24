package org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views;

import a.cha;
import a.hny;
import a.iha;
import a.lfr;
import a.mfr;
import a.q3d;
import a.tl60;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CardFootballFieldView extends ConstraintLayout {
    public final vd7 q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final int w;
    public final TransitionDrawable x;
    public final TransitionDrawable y;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardFootballFieldView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        Float fValueOf = Float.valueOf(-0.5f);
        Float fValueOf2 = Float.valueOf(-0.25f);
        context.getClass();
        super(context, attributeSet2, 0);
        LayoutInflater.from(context).inflate(R.layout.synthetic_card_football_field_view, this);
        int i2 = R.id.ivBall;
        ImageView imageView = (ImageView) yum0.f(this, R.id.ivBall);
        if (imageView != null) {
            i2 = R.id.ivField;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.ivField);
            if (imageView2 != null) {
                i2 = R.id.ivFirstAttCard;
                ImageView imageView3 = (ImageView) yum0.f(this, R.id.ivFirstAttCard);
                if (imageView3 != null) {
                    i2 = R.id.ivFirstDefCard;
                    ImageView imageView4 = (ImageView) yum0.f(this, R.id.ivFirstDefCard);
                    if (imageView4 != null) {
                        i2 = R.id.ivGate;
                        if (((ImageView) yum0.f(this, R.id.ivGate)) != null) {
                            i2 = R.id.ivSecondAttCard;
                            ImageView imageView5 = (ImageView) yum0.f(this, R.id.ivSecondAttCard);
                            if (imageView5 != null) {
                                i2 = R.id.ivSecondDefCard;
                                ImageView imageView6 = (ImageView) yum0.f(this, R.id.ivSecondDefCard);
                                if (imageView6 != null) {
                                    i2 = R.id.ivThirdAttCard;
                                    ImageView imageView7 = (ImageView) yum0.f(this, R.id.ivThirdAttCard);
                                    if (imageView7 != null) {
                                        i2 = R.id.ivThirdDefCard;
                                        ImageView imageView8 = (ImageView) yum0.f(this, R.id.ivThirdDefCard);
                                        if (imageView8 != null) {
                                            this.q = new vd7(this, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8);
                                            this.r = q3d.j(imageView4, imageView6, imageView8);
                                            this.s = q3d.j(imageView3, imageView5, imageView7);
                                            this.t = q3d.j(Float.valueOf(0.35f), Float.valueOf(0.3f), Float.valueOf(0.24f));
                                            this.u = context.getResources().getBoolean(R.bool.isTablet) ? q3d.j(fValueOf2, fValueOf, Float.valueOf(-0.665f)) : q3d.j(fValueOf2, fValueOf, Float.valueOf(-0.63f));
                                            this.v = q3d.j(Float.valueOf(0.85f), Float.valueOf(0.75f), Float.valueOf(0.65f));
                                            this.w = context.getResources().getBoolean(R.bool.isTablet) ? context.getResources().getDimensionPixelSize(R.dimen.space_12) : context.getResources().getDimensionPixelSize(R.dimen.size_8);
                                            this.x = new TransitionDrawable(new Drawable[]{context.getDrawable(R.drawable.cybergame_card_football_field_bg), context.getDrawable(R.drawable.cybergame_card_football_field_light_bg)});
                                            this.y = new TransitionDrawable(new Drawable[]{context.getDrawable(R.drawable.cybergame_card_football_field_light_bg), context.getDrawable(R.drawable.cybergame_card_football_field_bg)});
                                            return;
                                        }
                                    }
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

    public final void setAttackCardsOnField$impl(List<cha> list) {
        list.getClass();
        CardFootballFieldView cardFootballFieldView = (CardFootballFieldView) this.q.b;
        tl60.a(cardFootballFieldView, new lfr(cardFootballFieldView, list, this));
    }

    public final void u() {
        for (ImageView imageView : this.s) {
            Context context = getContext();
            context.getClass();
            imageView.setImageDrawable(context.getDrawable(R.drawable.transparent));
        }
        ImageView imageView2 = (ImageView) this.q.c;
        tl60.a(imageView2, new mfr((Object) imageView2, (Object) this, (byte) 4));
    }

    public final void v(List list, boolean z) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            List list2 = this.r;
            if (z) {
                Context context = getContext();
                context.getClass();
                Object obj2 = list2.get(i);
                obj2.getClass();
                new iha(context, (ImageView) obj2, iIntValue);
            } else {
                ImageView imageView = (ImageView) list2.get(i);
                Context context2 = getContext();
                context2.getClass();
                imageView.setImageDrawable(context2.getDrawable(iIntValue));
            }
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballFieldView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
