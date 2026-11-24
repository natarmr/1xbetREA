package org.xplatform.ui_core.viewcomponents.imageview;

import a.a7g0;
import a.aqd0;
import a.maz;
import a.n0o0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public final class RoundCornerImageView extends AppCompatImageView {
    public static final /* synthetic */ int g = 0;
    public final float[] d;
    public final Path e;
    public final n0o0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        float[] fArr = new float[8];
        this.d = fArr;
        this.e = new Path();
        this.f = maz.b(new a7g0(this, (byte) 4));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.s);
        typedArrayObtainStyledAttributes.getClass();
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            float dimension4 = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
            float dimension5 = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
            if (dimension5 == 0.0f) {
                fArr[0] = dimension;
                fArr[1] = dimension;
                fArr[2] = dimension2;
                fArr[3] = dimension2;
                fArr[4] = dimension4;
                fArr[5] = dimension4;
                fArr[6] = dimension3;
                fArr[7] = dimension3;
            } else {
                fArr[0] = dimension5;
                fArr[1] = dimension5;
                fArr[2] = dimension5;
                fArr[3] = dimension5;
                fArr[4] = dimension5;
                fArr[5] = dimension5;
                fArr[6] = dimension5;
                fArr[7] = dimension5;
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final RectF getRect() {
        return (RectF) this.f.getValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        getRect().right = getWidth();
        getRect().bottom = getHeight();
        RectF rect = getRect();
        float[] fArr = this.d;
        Path.Direction direction = Path.Direction.CW;
        Path path = this.e;
        path.addRoundRect(rect, fArr, direction);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
