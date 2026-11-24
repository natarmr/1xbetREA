package org.xplatform.uikit.components.footer;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DsFooter extends AppCompatTextView {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsFooter(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.footerStyle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsFooter(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
