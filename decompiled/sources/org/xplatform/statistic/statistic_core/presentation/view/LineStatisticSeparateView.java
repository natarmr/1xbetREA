package org.xplatform.statistic.statistic_core.presentation.view;

import a.hny;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class LineStatisticSeparateView extends FrameLayout {
    /* JADX WARN: Illegal instructions before constructor call */
    public LineStatisticSeparateView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_line_statistic_separate, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.guideline;
        if (((Guideline) yum0.f(viewInflate, R.id.guideline)) != null) {
            i2 = R.id.viewFake1;
            if (yum0.f(viewInflate, R.id.viewFake1) != null) {
                i2 = R.id.viewFake2;
                if (yum0.f(viewInflate, R.id.viewFake2) != null) {
                    i2 = R.id.viewValue1;
                    if (yum0.f(viewInflate, R.id.viewValue1) != null) {
                        i2 = R.id.viewValue2;
                        if (yum0.f(viewInflate, R.id.viewValue2) != null) {
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineStatisticSeparateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineStatisticSeparateView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
