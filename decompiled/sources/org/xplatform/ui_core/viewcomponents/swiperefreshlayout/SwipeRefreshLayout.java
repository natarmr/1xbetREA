package org.xplatform.ui_core.viewcomponents.swiperefreshlayout;

import a.j5d;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class SwipeRefreshLayout extends androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedValue typedValue = j5d.f15927a;
        setColorSchemeColors(j5d.a(context, R.attr.uikitSecondary, false));
        setProgressBackgroundColorSchemeColor(j5d.a(context, R.attr.uikitBackgroundContent, false));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshLayout(Context context) {
        this(context, null);
        context.getClass();
    }
}
