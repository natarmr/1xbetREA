package androidx.cardview.widget;

import a.eqd0;
import a.lv00;
import a.xfg0;
import a.xr;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45340a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final xr e;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        xr xrVar = new xr();
        xrVar.b = this;
        this.e = xrVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eqd0.f8233a, i, org.xbet.client1.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(org.xbet.client1.R.color.cardview_light_background) : getResources().getColor(org.xbet.client1.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f45340a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        xfg0 xfg0Var = new xfg0(colorStateListValueOf, dimension);
        xrVar.f41344a = xfg0Var;
        setBackgroundDrawable(xfg0Var);
        setClipToOutline(true);
        setElevation(dimension2);
        lv00.U(xrVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((xfg0) this.e.f41344a).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((xfg0) this.e.f41344a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((xfg0) this.e.f41344a).f40790a;
    }

    public boolean getUseCompatPadding() {
        return this.f45340a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        xfg0 xfg0Var = (xfg0) this.e.f41344a;
        if (colorStateListValueOf == null) {
            xfg0Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        xfg0Var.h = colorStateListValueOf;
        xfg0Var.b.setColor(colorStateListValueOf.getColorForState(xfg0Var.getState(), xfg0Var.h.getDefaultColor()));
        xfg0Var.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.b).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        lv00.U(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            xr xrVar = this.e;
            lv00.U(xrVar, ((xfg0) xrVar.f41344a).e);
        }
    }

    public void setRadius(float f2) {
        xfg0 xfg0Var = (xfg0) this.e.f41344a;
        if (f2 == xfg0Var.f40790a) {
            return;
        }
        xfg0Var.f40790a = f2;
        xfg0Var.b(null);
        xfg0Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f45340a != z) {
            this.f45340a = z;
            xr xrVar = this.e;
            lv00.U(xrVar, ((xfg0) xrVar.f41344a).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        xfg0 xfg0Var = (xfg0) this.e.f41344a;
        if (colorStateList == null) {
            xfg0Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        xfg0Var.h = colorStateList;
        xfg0Var.b.setColor(colorStateList.getColorForState(xfg0Var.getState(), xfg0Var.h.getDefaultColor()));
        xfg0Var.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.xbet.client1.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
