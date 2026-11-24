package org.xplatform.feature.dayexpress.impl.presentation.view;

import a.chl0;
import a.f5o;
import a.hny;
import a.iab;
import a.pkd;
import a.ugd;
import a.xp3;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final class ExpressCardBottomView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final iab q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressCardBottomView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.express_card_bottom_view, this);
        int i2 = R.id.bottomGuideline;
        if (((Guideline) yum0.f(this, R.id.bottomGuideline)) != null) {
            i2 = R.id.buttonAdd;
            DsButton dsButton = (DsButton) yum0.f(this, R.id.buttonAdd);
            if (dsButton != null) {
                i2 = R.id.buttonBet;
                DsButton dsButton2 = (DsButton) yum0.f(this, R.id.buttonBet);
                if (dsButton2 != null) {
                    i2 = R.id.buttonsGroup;
                    Flow flow = (Flow) yum0.f(this, R.id.buttonsGroup);
                    if (flow != null) {
                        i2 = R.id.endGuideline;
                        if (((Guideline) yum0.f(this, R.id.endGuideline)) != null) {
                            i2 = R.id.headerGroup;
                            if (((Flow) yum0.f(this, R.id.headerGroup)) != null) {
                                i2 = R.id.iv_type;
                                ImageView imageView = (ImageView) yum0.f(this, R.id.iv_type);
                                if (imageView != null) {
                                    i2 = R.id.marketComposeView;
                                    ComposeView composeView = (ComposeView) yum0.f(this, R.id.marketComposeView);
                                    if (composeView != null) {
                                        i2 = R.id.startGuideline;
                                        if (((Guideline) yum0.f(this, R.id.startGuideline)) != null) {
                                            i2 = R.id.tv_title;
                                            TextView textView = (TextView) yum0.f(this, R.id.tv_title);
                                            if (textView != null) {
                                                this.q = new iab(this, dsButton, dsButton2, flow, imageView, composeView, textView);
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setBonusIcon(Drawable drawable) {
        drawable.getClass();
        ((ImageView) this.q.c).setImageDrawable(drawable);
    }

    public final void setButtonsVisibile(boolean z) {
        ((Flow) this.q.f).setVisibility(z ? 0 : 8);
    }

    public final void setMarket(chl0 chl0Var) {
        chl0Var.getClass();
        pkd.i((ComposeView) this.q.g, null, new ugd(240624844, true, new f5o(chl0Var, (byte) 4)));
    }

    public final void setOnAddToCouponClickListener(Function1<? super View, Unit> function1) {
        function1.getClass();
        ((DsButton) this.q.b).setOnClickListener(new xp3(function1, (byte) 3));
    }

    public final void setOnMakeBetClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        ((DsButton) this.q.e).setOnClickListener(onClickListener);
    }

    public final void setTitle(String str) {
        str.getClass();
        ((TextView) this.q.h).setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressCardBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressCardBottomView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
