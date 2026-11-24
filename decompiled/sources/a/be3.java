package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class be3 extends xr {
    public final ae3 e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public be3(ae3 ae3Var) {
        super(ae3Var);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = ae3Var;
    }

    @Override // a.xr
    public final void p(AttributeSet attributeSet, int i) {
        super.p(attributeSet, R.attr.seekBarStyle);
        ae3 ae3Var = this.e;
        Context context = ae3Var.getContext();
        int[] iArr = mqd0.g;
        ywu ywuVarY = ywu.y(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        rgu0.n(ae3Var, ae3Var.getContext(), iArr, attributeSet, (TypedArray) ywuVarY.c, R.attr.seekBarStyle, 0);
        Drawable drawableO = ywuVarY.o(0);
        if (drawableO != null) {
            ae3Var.setThumb(drawableO);
        }
        Drawable drawableN = ywuVarY.n(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = drawableN;
        if (drawableN != null) {
            drawableN.setCallback(ae3Var);
            drawableN.setLayoutDirection(ae3Var.getLayoutDirection());
            if (drawableN.isStateful()) {
                drawableN.setState(ae3Var.getDrawableState());
            }
            w();
        }
        ae3Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = qhl.c(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = ywuVarY.m(2);
            this.i = true;
        }
        ywuVarY.A();
        w();
    }

    public final void w() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f.setTintMode(this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void x(Canvas canvas) {
        if (this.f != null) {
            ae3 ae3Var = this.e;
            int max = ae3Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i, -i2, i, i2);
                float width = ((ae3Var.getWidth() - ae3Var.getPaddingLeft()) - ae3Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(ae3Var.getPaddingLeft(), ae3Var.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
