package org.xplatform.ui_core.viewcomponents.imageview;

import a.aqd0;
import a.bkb;
import a.q14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class MeasuredImageView extends AppCompatImageView {
    public final float d;

    /* JADX WARN: Illegal instructions before constructor call */
    public MeasuredImageView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.d = 0.5322f;
        if (attributeSet != null) {
            q14 q14Var = new q14(context, attributeSet, aqd0.o);
            try {
                try {
                    this.d = q14Var.b.getFloat(0, this.d);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                q14Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(q14Var, th);
                    throw th2;
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.d), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeasuredImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeasuredImageView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
