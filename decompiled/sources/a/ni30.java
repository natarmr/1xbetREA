package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.focus.FocusRingDrawable;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class ni30 extends SwitchCompat {
    public static final int[] J1 = {R.attr.state_with_icon};
    public Drawable A1;
    public ColorStateList B1;
    public ColorStateList C1;
    public PorterDuff.Mode D1;
    public ColorStateList E1;
    public ColorStateList F1;
    public PorterDuff.Mode G1;
    public int[] H1;
    public int[] I1;
    public Drawable w1;
    public Drawable x1;
    public int y1;
    public Drawable z1;

    public ni30(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, R.attr.cellRightSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, R.attr.cellRightSwitchStyle);
        this.y1 = -1;
        Context context2 = getContext();
        this.w1 = super.getThumbDrawable();
        this.B1 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.z1 = super.getTrackDrawable();
        this.E1 = super.getTrackTintList();
        super.setTrackTintList(null);
        mrv.c0(context2, attributeSet, R.attr.cellRightSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch);
        int[] iArr = rpd0.I;
        mrv.d0(context2, attributeSet, iArr, R.attr.cellRightSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.cellRightSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch);
        ywu ywuVar = new ywu(context2, typedArrayObtainStyledAttributes);
        this.x1 = ywuVar.n(0);
        this.y1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.C1 = ywuVar.m(2);
        int i = typedArrayObtainStyledAttributes.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.D1 = afn0.y(i, mode);
        this.A1 = ywuVar.n(4);
        this.F1 = ywuVar.m(5);
        this.G1 = afn0.y(typedArrayObtainStyledAttributes.getInt(6, -1), mode);
        ywuVar.A();
        setEnforceSwitchWidth(false);
        g();
        h();
    }

    public static void i(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(k5d.b(colorStateList.getColorForState(iArr, 0), f, colorStateList.getColorForState(iArr2, 0)));
    }

    public final void g() {
        this.w1 = plc.C(this.w1, this.B1, getThumbTintMode());
        this.x1 = plc.C(this.x1, this.C1, this.D1);
        l();
        Drawable drawable = this.w1;
        Drawable drawable2 = this.x1;
        int i = this.y1;
        super.setThumbDrawable(plc.A(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.w1;
    }

    public Drawable getThumbIconDrawable() {
        return this.x1;
    }

    public int getThumbIconSize() {
        return this.y1;
    }

    public ColorStateList getThumbIconTintList() {
        return this.C1;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.D1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.B1;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.A1;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.F1;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.G1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.z1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.E1;
    }

    public final void h() {
        this.z1 = plc.C(this.z1, this.E1, getTrackTintMode());
        this.A1 = plc.C(this.A1, this.F1, this.G1);
        l();
        Drawable layerDrawable = this.z1;
        if (layerDrawable != null && this.A1 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.z1, this.A1});
        } else if (layerDrawable == null) {
            layerDrawable = this.A1;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // android.view.View
    public final void invalidate() {
        l();
        super.invalidate();
    }

    public final void l() {
        if (this.B1 == null && this.C1 == null && this.E1 == null && this.F1 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.B1;
        if (colorStateList != null) {
            i(this.w1, colorStateList, this.H1, this.I1, thumbPosition);
        }
        ColorStateList colorStateList2 = this.C1;
        if (colorStateList2 != null) {
            i(this.x1, colorStateList2, this.H1, this.I1, thumbPosition);
        }
        ColorStateList colorStateList3 = this.E1;
        if (colorStateList3 != null) {
            i(this.z1, colorStateList3, this.H1, this.I1, thumbPosition);
        }
        ColorStateList colorStateList4 = this.F1;
        if (colorStateList4 != null) {
            i(this.A1, colorStateList4, this.H1, this.I1, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.x1 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J1);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.H1 = iArr;
        this.I1 = plc.E(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FocusRingDrawable focusRingDrawableC;
        super.onLayout(z, i, i2, i3, i4);
        if (this.z1 == null || (focusRingDrawableC = FocusRingDrawable.c(getBackground())) == null) {
            return;
        }
        focusRingDrawableC.mutate();
        focusRingDrawableC.o.w = this.z1.getBounds();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.w1 = drawable;
        g();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.x1 = drawable;
        g();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(epv0.U(i, getContext()));
    }

    public void setThumbIconSize(int i) {
        if (this.y1 != i) {
            this.y1 = i;
            g();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.C1 = colorStateList;
        g();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.D1 = mode;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.B1 = colorStateList;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        g();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.A1 = drawable;
        h();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(epv0.U(i, getContext()));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.F1 = colorStateList;
        h();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.G1 = mode;
        h();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.z1 = drawable;
        h();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.E1 = colorStateList;
        h();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        h();
    }
}
