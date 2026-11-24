package org.xplatform.tile_matching.presentation.views;

import a.hny;
import a.iab;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class TileMatchingCoeffView extends ConstraintLayout {
    public final iab q;

    /* JADX WARN: Illegal instructions before constructor call */
    public TileMatchingCoeffView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_coeff_tile_matching, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.ivCoeff;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivCoeff);
        if (imageView != null) {
            i2 = R.id.ivCoeffValue;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivCoeffValue);
            if (imageView2 != null) {
                i2 = R.id.ivProgress;
                ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.ivProgress);
                if (imageView3 != null) {
                    i2 = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progressBar);
                    if (progressBar != null) {
                        i2 = R.id.tvCoeffCount;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvCoeffCount);
                        if (textView != null) {
                            i2 = R.id.tvCoeffValue;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvCoeffValue);
                            if (textView2 != null) {
                                this.q = new iab((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, progressBar, textView, textView2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setCoeffImage$tile_matching(int i) {
        ((ImageView) this.q.c).setImageResource(i);
    }

    public final void setMaxProgress$tile_matching(int i) {
        ((ProgressBar) this.q.f).setMax(i);
    }

    public final void setProgressDrawableTint$tile_matching(int i) {
        Drawable progressDrawable = ((ProgressBar) this.q.f).getProgressDrawable();
        Context context = getContext();
        context.getClass();
        progressDrawable.setTint(context.getColor(i));
    }

    public final void u(int i) {
        iab iabVar = this.q;
        ((TextView) iabVar.g).setVisibility(i <= 0 ? 4 : 0);
        ((TextView) iabVar.g).setText(String.valueOf(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileMatchingCoeffView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileMatchingCoeffView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
