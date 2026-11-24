package a;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class g4u0 extends j4u0 {
    public zz2 d;
    public float e;
    public zz2 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // a.i4u0
    public final boolean a() {
        return this.f.y() || this.d.y();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // a.i4u0
    public final boolean b(int[] iArr) {
        boolean z;
        zz2 zz2Var = this.f;
        boolean z2 = true;
        if (zz2Var.y()) {
            ColorStateList colorStateList = (ColorStateList) zz2Var.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != zz2Var.f45232a) {
                zz2Var.f45232a = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        zz2 zz2Var2 = this.d;
        if (zz2Var2.y()) {
            ColorStateList colorStateList2 = (ColorStateList) zz2Var2.c;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != zz2Var2.f45232a) {
                zz2Var2.f45232a = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.f45232a;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.f45232a;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.f45232a = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.f45232a = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
