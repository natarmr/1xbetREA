package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.hny;
import a.ibo;
import a.laa;
import a.p5h0;
import a.q3d;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes3.dex */
public final class EventCardMiddleSette extends ConstraintLayout implements cbo {
    public final ibo q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleSette(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleSetteStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_sette_view, this);
        int i2 = R.id.dealer1Row1Card;
        ImageView imageView = (ImageView) yum0.f(this, R.id.dealer1Row1Card);
        if (imageView != null) {
            i2 = R.id.dealer1Row2Card;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.dealer1Row2Card);
            if (imageView2 != null) {
                i2 = R.id.dealer1Row3Card;
                ImageView imageView3 = (ImageView) yum0.f(this, R.id.dealer1Row3Card);
                if (imageView3 != null) {
                    i2 = R.id.dealer1Row4Card;
                    ImageView imageView4 = (ImageView) yum0.f(this, R.id.dealer1Row4Card);
                    if (imageView4 != null) {
                        i2 = R.id.dealer1Row5Card;
                        ImageView imageView5 = (ImageView) yum0.f(this, R.id.dealer1Row5Card);
                        if (imageView5 != null) {
                            i2 = R.id.dealer2Row1Card;
                            ImageView imageView6 = (ImageView) yum0.f(this, R.id.dealer2Row1Card);
                            if (imageView6 != null) {
                                i2 = R.id.dealer2Row2Card;
                                ImageView imageView7 = (ImageView) yum0.f(this, R.id.dealer2Row2Card);
                                if (imageView7 != null) {
                                    i2 = R.id.dealer2Row3Card;
                                    ImageView imageView8 = (ImageView) yum0.f(this, R.id.dealer2Row3Card);
                                    if (imageView8 != null) {
                                        i2 = R.id.dealer2Row4Card;
                                        ImageView imageView9 = (ImageView) yum0.f(this, R.id.dealer2Row4Card);
                                        if (imageView9 != null) {
                                            i2 = R.id.dealer2Row5Card;
                                            ImageView imageView10 = (ImageView) yum0.f(this, R.id.dealer2Row5Card);
                                            if (imageView10 != null) {
                                                i2 = R.id.dealerName;
                                                TextView textView = (TextView) yum0.f(this, R.id.dealerName);
                                                if (textView != null) {
                                                    i2 = R.id.information;
                                                    TextView textView2 = (TextView) yum0.f(this, R.id.information);
                                                    if (textView2 != null) {
                                                        i2 = R.id.player1Row1Card;
                                                        ImageView imageView11 = (ImageView) yum0.f(this, R.id.player1Row1Card);
                                                        if (imageView11 != null) {
                                                            i2 = R.id.player1Row2Card;
                                                            ImageView imageView12 = (ImageView) yum0.f(this, R.id.player1Row2Card);
                                                            if (imageView12 != null) {
                                                                i2 = R.id.player1Row3Card;
                                                                ImageView imageView13 = (ImageView) yum0.f(this, R.id.player1Row3Card);
                                                                if (imageView13 != null) {
                                                                    i2 = R.id.player1Row4Card;
                                                                    ImageView imageView14 = (ImageView) yum0.f(this, R.id.player1Row4Card);
                                                                    if (imageView14 != null) {
                                                                        i2 = R.id.player1Row5Card;
                                                                        ImageView imageView15 = (ImageView) yum0.f(this, R.id.player1Row5Card);
                                                                        if (imageView15 != null) {
                                                                            i2 = R.id.player2Row1Card;
                                                                            ImageView imageView16 = (ImageView) yum0.f(this, R.id.player2Row1Card);
                                                                            if (imageView16 != null) {
                                                                                i2 = R.id.player2Row2Card;
                                                                                ImageView imageView17 = (ImageView) yum0.f(this, R.id.player2Row2Card);
                                                                                if (imageView17 != null) {
                                                                                    i2 = R.id.player2Row3Card;
                                                                                    ImageView imageView18 = (ImageView) yum0.f(this, R.id.player2Row3Card);
                                                                                    if (imageView18 != null) {
                                                                                        i2 = R.id.player2Row4Card;
                                                                                        ImageView imageView19 = (ImageView) yum0.f(this, R.id.player2Row4Card);
                                                                                        if (imageView19 != null) {
                                                                                            i2 = R.id.player2Row5Card;
                                                                                            ImageView imageView20 = (ImageView) yum0.f(this, R.id.player2Row5Card);
                                                                                            if (imageView20 != null) {
                                                                                                i2 = R.id.playerName;
                                                                                                TextView textView3 = (TextView) yum0.f(this, R.id.playerName);
                                                                                                if (textView3 != null) {
                                                                                                    i2 = R.id.score;
                                                                                                    SportScore sportScore = (SportScore) yum0.f(this, R.id.score);
                                                                                                    if (sportScore != null) {
                                                                                                        i2 = R.id.winInformation;
                                                                                                        TextView textView4 = (TextView) yum0.f(this, R.id.winInformation);
                                                                                                        if (textView4 != null) {
                                                                                                            this.q = new ibo(this, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, textView, textView2, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, textView3, sportScore, textView4);
                                                                                                            setLayoutDirection(0);
                                                                                                            this.r = q3d.j(imageView11, imageView12, imageView13, imageView14, imageView15);
                                                                                                            this.s = q3d.j(imageView16, imageView17, imageView18, imageView19, imageView20);
                                                                                                            this.t = q3d.j(imageView, imageView2, imageView3, imageView4, imageView5);
                                                                                                            this.u = q3d.j(imageView6, imageView7, imageView8, imageView9, imageView10);
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
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static void u(List list, List list2) {
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i <= q3d.i(list)) {
                imageView.setImageResource(((laa) list.get(i)).f19696a);
            }
            imageView.setVisibility(i <= list.size() + (-1) ? 0 : 8);
            i = i2;
        }
    }

    public final ibo getBinding() {
        return this.q;
    }

    public final void setDealer1RowCards(List<? extends laa> list) {
        list.getClass();
        u(list, this.t);
    }

    public final void setDealer2RowCards(List<? extends laa> list) {
        list.getClass();
        u(list, this.u);
    }

    public final void setDealerName(CharSequence charSequence) {
        this.q.b.setText(charSequence);
    }

    public final void setInformation(CharSequence charSequence) {
        ibo iboVar = this.q;
        iboVar.c.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        iboVar.c.setText(charSequence);
    }

    public final void setPlayer1RowCards(List<? extends laa> list) {
        list.getClass();
        u(list, this.r);
    }

    public final void setPlayer2RowCards(List<? extends laa> list) {
        list.getClass();
        u(list, this.s);
    }

    public final void setPlayerName(CharSequence charSequence) {
        this.q.d.setText(charSequence);
    }

    public final void setScoreModel(p5h0 p5h0Var) {
        p5h0Var.getClass();
        this.q.e.setScore(p5h0Var);
    }

    public final void setWinInformation(CharSequence charSequence) {
        ibo iboVar = this.q;
        iboVar.f.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        iboVar.f.setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleSette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleSette(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
