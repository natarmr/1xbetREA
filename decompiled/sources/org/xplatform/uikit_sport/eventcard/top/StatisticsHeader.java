package org.xplatform.uikit_sport.eventcard.top;

import a.lbo;
import a.sj3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class StatisticsHeader extends FrameLayout implements lbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsTag f47293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatisticsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int i = DsTag.l;
        DsTag dsTagW = sj3.W(R.style.Widget_DSTag_RectangularS_Red, context);
        this.f47293a = dsTagW;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        dsTagW.setText("• LIVE");
        addView(dsTagW, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void setTagOnClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.f47293a.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatisticsHeader(Context context) {
        this(context, null);
        context.getClass();
    }
}
