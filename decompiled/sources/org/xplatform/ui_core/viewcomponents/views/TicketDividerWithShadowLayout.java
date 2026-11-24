package org.xplatform.ui_core.viewcomponents.views;

import a.xz5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class TicketDividerWithShadowLayout extends xz5 {
    /* JADX WARN: Illegal instructions before constructor call */
    public TicketDividerWithShadowLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View.inflate(getContext(), getLayoutView(), this);
    }

    @Override // a.xz5
    public int getLayoutView() {
        return R.layout.ticket_divider_with_shadow_layout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TicketDividerWithShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TicketDividerWithShadowLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
