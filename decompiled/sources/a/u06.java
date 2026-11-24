package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34840a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;

    public u06(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        mrv.c0(context, attributeSet, i, i2);
        int[] iArr = rpd0.d;
        mrv.d0(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f34840a = g7x.C(context, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.f34840a / 2);
                this.d = false;
            } else if (i3 == 6) {
                this.c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0));
        this.j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, iAbs));
        this.k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(17, iAbs));
        this.l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        this.o = typedArrayObtainStyledAttributes.getFloat(13, 0.1f);
        this.p = typedArrayObtainStyledAttributes.getFloat(12, 0.9f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            Integer numY = d7x.y(R.attr.colorPrimary, context);
            this.e = new int[]{numY != null ? numY.intValue() : -1};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            this.e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                jf4.o("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            this.f = this.e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f = d7x.t(this.f, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.d ? (int) (this.f34840a * this.c) : this.b;
    }

    public final boolean b(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.d && this.c == 0.5f;
    }

    public void d() {
        if (this.i >= 0) {
            return;
        }
        jf4.o("indicatorTrackGapSize must be >= 0.");
    }
}
