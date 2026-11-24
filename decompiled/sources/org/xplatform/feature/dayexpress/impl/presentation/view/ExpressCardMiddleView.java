package org.xplatform.feature.dayexpress.impl.presentation.view;

import a.bzu;
import a.hny;
import a.rz4;
import a.u0d;
import a.uk5;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpressCardMiddleView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final uk5 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressCardMiddleView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.express_card_middle_view, this);
        int i2 = R.id.endGuideline;
        if (((Guideline) yum0.f(this, R.id.endGuideline)) != null) {
            i2 = R.id.headerGroup;
            if (((Flow) yum0.f(this, R.id.headerGroup)) != null) {
                i2 = R.id.iv_type;
                ImageView imageView = (ImageView) yum0.f(this, R.id.iv_type);
                if (imageView != null) {
                    i2 = R.id.marketComposeView;
                    ComposeView composeView = (ComposeView) yum0.f(this, R.id.marketComposeView);
                    if (composeView != null) {
                        i2 = R.id.separator;
                        if (((DsSeparator) yum0.f(this, R.id.separator)) != null) {
                            i2 = R.id.startGuideline;
                            if (((Guideline) yum0.f(this, R.id.startGuideline)) != null) {
                                i2 = R.id.tv_description;
                                TextView textView = (TextView) yum0.f(this, R.id.tv_description);
                                if (textView != null) {
                                    i2 = R.id.tv_subtitle;
                                    TextView textView2 = (TextView) yum0.f(this, R.id.tv_subtitle);
                                    if (textView2 != null) {
                                        i2 = R.id.tv_title;
                                        TextView textView3 = (TextView) yum0.f(this, R.id.tv_title);
                                        if (textView3 != null) {
                                            this.q = new uk5(this, imageView, composeView, textView, textView2, textView3);
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

    public final void setChampName(String str) {
        str.getClass();
        ((TextView) this.q.e).setText(str);
    }

    public final void setMatchName(String str) {
        str.getClass();
        ((TextView) this.q.d).setText(str);
    }

    public final void setOnViewClicked(View.OnClickListener onClickListener) {
        ((ExpressCardMiddleView) this.q.b).setOnClickListener(onClickListener);
    }

    public final void setScoreInfo(String str) {
        str.getClass();
        ((TextView) this.q.c).setText(str);
    }

    public final void setSportIcon(long j) {
        String string;
        List list = u0d.f34849a;
        ImageView imageView = (ImageView) this.q.g;
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        u0d.k(imageView, string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressCardMiddleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressCardMiddleView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
