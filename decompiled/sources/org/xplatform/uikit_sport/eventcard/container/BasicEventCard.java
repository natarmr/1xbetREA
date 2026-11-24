package org.xplatform.uikit_sport.eventcard.container;

import a.xx5;
import android.content.Context;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class BasicEventCard extends xx5 {
    /* JADX WARN: Illegal instructions before constructor call */
    public BasicEventCard(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardBasicStyle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasicEventCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasicEventCard(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
