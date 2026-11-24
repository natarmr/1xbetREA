package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.hab;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightButtonCallEnd extends AppCompatImageView implements hab {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellRightButtonCallEnd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.o, 0, 0);
        setImageResource(typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.ic_call_button));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightButtonCallEnd(Context context) {
        this(context, null);
        context.getClass();
    }
}
