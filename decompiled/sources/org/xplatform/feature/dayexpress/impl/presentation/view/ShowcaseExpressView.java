package org.xplatform.feature.dayexpress.impl.presentation.view;

import a.usj0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowcaseExpressView extends LinearLayout {
    /* JADX WARN: Illegal instructions before constructor call */
    public ShowcaseExpressView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    public final void setExpress(List<Long> list) {
        list.getClass();
        removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            Context context = getContext();
            context.getClass();
            usj0 usj0Var = new usj0(context);
            usj0Var.setSportIcon(jLongValue);
            addView(usj0Var, new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowcaseExpressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowcaseExpressView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
