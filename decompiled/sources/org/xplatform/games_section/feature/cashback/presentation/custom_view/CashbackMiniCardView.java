package org.xplatform.games_section.feature.cashback.presentation.custom_view;

import a.a570;
import a.aqd0;
import a.bkb;
import a.epv0;
import a.hny;
import a.j5d;
import a.q14;
import a.uk5;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CashbackMiniCardView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a570 f46728a;
    public final uk5 b;
    public String c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashbackMiniCardView(Context context, AttributeSet attributeSet, int i) {
        String string;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_cashback_mini_card, (ViewGroup) this, false);
        addView(viewInflate);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
        int i2 = R.id.clCashbackMiniCard;
        if (((ConstraintLayout) yum0.f(viewInflate, R.id.clCashbackMiniCard)) != null) {
            i2 = R.id.flTechnicalWorks;
            FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.flTechnicalWorks);
            if (frameLayout != null) {
                i2 = R.id.game_descr;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.game_descr);
                if (textView != null) {
                    i2 = R.id.game_image;
                    ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.game_image);
                    if (imageView != null) {
                        i2 = R.id.iv_ribbon;
                        ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.iv_ribbon);
                        if (imageView2 != null) {
                            i2 = R.id.iv_ribbon_background;
                            if (((ImageView) yum0.f(viewInflate, R.id.iv_ribbon_background)) != null) {
                                i2 = R.id.tv_ribbon_percent;
                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tv_ribbon_percent);
                                if (textView2 != null) {
                                    this.b = new uk5(materialCardView, frameLayout, textView, imageView, imageView2, textView2);
                                    if (attributeSet == null) {
                                        return;
                                    }
                                    q14 q14Var = new q14(context, attributeSet, aqd0.c);
                                    TypedArray typedArray = q14Var.b;
                                    try {
                                        try {
                                            Drawable drawable = typedArray.getDrawable(1);
                                            if (drawable == null) {
                                                throw new IllegalArgumentException("AttributeLoader drawable == null");
                                            }
                                            ((ImageView) this.b.g).setBackground(drawable);
                                            try {
                                                typedArray.getClass();
                                                if (typedArray.getResourceId(3, 0) == 0) {
                                                    string = "";
                                                } else {
                                                    string = q14Var.f27932a.getString(typedArray.getResourceId(3, 0));
                                                    string.getClass();
                                                }
                                                ((TextView) this.b.c).setText(string);
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            q14Var.close();
                                            return;
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            bkb.E(q14Var, th);
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        uk5 uk5Var = this.b;
        ((ImageView) uk5Var.g).setImageResource(android.R.color.transparent);
        ((ImageView) uk5Var.g).setBackground(epv0.U(R.drawable.cashback_empty_view_redesign, getContext()));
        ((TextView) uk5Var.c).setText(R.string.choose_cashback);
    }

    public final void b(String str, boolean z, boolean z2, boolean z3) {
        String string;
        str.getClass();
        uk5 uk5Var = this.b;
        TextView textView = (TextView) uk5Var.c;
        TextView textView2 = (TextView) uk5Var.d;
        ImageView imageView = (ImageView) uk5Var.f;
        if (this.f46728a == null) {
            string = getContext().getString(R.string.choose_cashback);
        } else if (z3) {
            string = getContext().getString(R.string.increased_cashback, z ? "5%" : "3%", getContext().getString(R.string.app_name), str);
        } else {
            string = getContext().getString(R.string.game_not_available);
        }
        textView.setText(string);
        if (!z) {
            TypedValue typedValue = j5d.f15927a;
            Context context = getContext();
            context.getClass();
            imageView.setColorFilter(context.getColor(R.color.static_purple));
            textView2.setText(getContext().getResources().getString(R.string.cashback_start_value));
            return;
        }
        if (z2) {
            TypedValue typedValue2 = j5d.f15927a;
            Context context2 = getContext();
            context2.getClass();
            imageView.setColorFilter(context2.getColor(R.color.static_red));
        } else {
            TypedValue typedValue3 = j5d.f15927a;
            Context context3 = getContext();
            context3.getClass();
            imageView.setColorFilter(context3.getColor(R.color.static_red));
        }
        textView2.setText(getContext().getResources().getString(R.string.cashback_end_value));
    }

    public final String getLoadedPictureUrl() {
        return this.c;
    }

    public final void setGameWorkStatus(boolean z) {
        ((FrameLayout) this.b.e).setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackMiniCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackMiniCardView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
