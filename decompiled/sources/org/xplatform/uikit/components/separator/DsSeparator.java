package org.xplatform.uikit.components.separator;

import android.content.Context;
import android.util.AttributeSet;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.AppCompatView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSeparator extends AppCompatView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsSeparator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setTag("DSSeparator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSeparator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSeparator(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DsSeparator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.separatorStyle);
    }
}
