package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fy20 implements lt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr20 f10341a;
    public final TextPaint b;
    public final TextPaint c;
    public final int d;
    public final int e;
    public final int f;
    public String g;
    public String h;
    public String i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public j0d r;
    public int s;
    public final ColorStateList t;
    public final ColorStateList u;
    public StaticLayout v;

    public fy20(nr20 nr20Var, AttributeSet attributeSet, int i) {
        this.f10341a = nr20Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        this.d = nr20Var.getContext().getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = nr20Var.getContext().getResources().getDimensionPixelSize(R.dimen.space_16);
        this.f = nr20Var.getContext().getResources().getDimensionPixelSize(R.dimen.text_1);
        this.g = "";
        this.h = "";
        this.i = "";
        this.p = 0.6f;
        j0d j0dVar = j0d.f15678a;
        this.r = j0dVar;
        this.s = Integer.MAX_VALUE;
        Context context = nr20Var.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.R, i, 0);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(10, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, 0);
        this.p = typedArrayObtainStyledAttributes.getFloat(8, this.p);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.s = typedArrayObtainStyledAttributes.getInt(16, this.s);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, this.n);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, this.o);
        int[] iArr = bqd0.s0;
        if (resourceId2 != 0) {
            Context context2 = nr20Var.getContext();
            context2.getClass();
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId2, iArr);
            Context context3 = nr20Var.getContext();
            context3.getClass();
            this.t = ktt0.m(2, context3, typedArrayObtainStyledAttributes2);
            Context context4 = nr20Var.getContext();
            context4.getClass();
            r7x.r(textPaint, context4, resourceId2);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (resourceId != 0) {
            Context context5 = nr20Var.getContext();
            context5.getClass();
            TypedArray typedArrayObtainStyledAttributes3 = context5.obtainStyledAttributes(resourceId, iArr);
            Context context6 = nr20Var.getContext();
            context6.getClass();
            this.u = ktt0.m(2, context6, typedArrayObtainStyledAttributes3);
            Context context7 = nr20Var.getContext();
            context7.getClass();
            r7x.r(textPaint2, context7, resourceId);
            typedArrayObtainStyledAttributes3.recycle();
        }
        Context context8 = nr20Var.getContext();
        context8.getClass();
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context8, 11);
        i(strP == null ? this.g : strP);
        Context context9 = nr20Var.getContext();
        context9.getClass();
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context9, 7);
        h(strP2 == null ? this.h : strP2);
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 == 1) {
            j0dVar = j0d.b;
        } else if (i2 == 2) {
            j0dVar = j0d.c;
        }
        this.r = j0dVar;
        c();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // a.lt20
    public final int[] b() {
        j0d j0dVar = this.r;
        j0d j0dVar2 = j0d.b;
        int i = R.attr.state_higher;
        if (j0dVar != j0dVar2) {
            i = -R.attr.state_higher;
        }
        j0d j0dVar3 = j0d.c;
        int i2 = R.attr.state_lower;
        if (j0dVar != j0dVar3) {
            i2 = -R.attr.state_lower;
        }
        return new int[]{i, i2};
    }

    @Override // a.lt20
    public final void c() {
        nr20 nr20Var = this.f10341a;
        ColorStateList colorStateList = this.t;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(nr20Var.getDrawableState(), 0) : 0;
        ColorStateList colorStateList2 = this.u;
        int colorForState2 = colorStateList2 != null ? colorStateList2.getColorForState(nr20Var.getDrawableState(), 0) : 0;
        this.b.setColor(colorForState);
        this.c.setColor(colorForState2);
    }

    @Override // a.lt20
    public final int d(int i) {
        StaticLayout staticLayoutI;
        String str = this.h;
        float f = i;
        TextPaint textPaint = this.c;
        g(textPaint, str, f);
        float f2 = this.p * f;
        int i2 = this.d;
        int i3 = this.q;
        int i4 = i2 + i3;
        g(textPaint, this.h, f2);
        float fMeasureText = textPaint.measureText(this.i);
        if (fMeasureText < f2) {
            f2 = fMeasureText;
        }
        int i5 = (int) ((f - f2) - i4);
        if (i5 < 0) {
            staticLayoutI = null;
        } else {
            staticLayoutI = xdx.I(f1t0.L(this.g), this.b, i5, this.s, TextUtils.TruncateAt.END, 0, null, 3312);
        }
        this.v = staticLayoutI;
        return (int) (textPaint.measureText(this.i) + i2 + (staticLayoutI != null ? staticLayoutI.getWidth() : 0) + i3);
    }

    @Override // a.lt20
    public final void e(int i, int i2) {
        float paddingLeft;
        StaticLayout staticLayout = this.v;
        float width = staticLayout != null ? staticLayout.getWidth() : 0.0f;
        String str = this.i;
        TextPaint textPaint = this.c;
        float fMeasureText = textPaint.measureText(str);
        StaticLayout staticLayout2 = this.v;
        this.k = (i2 - (staticLayout2 != null ? staticLayout2.getHeight() : 0)) / 2;
        this.m = (i2 / 2) - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
        nr20 nr20Var = this.f10341a;
        int layoutDirection = nr20Var.getLayoutDirection();
        int i3 = this.q;
        if (layoutDirection == 1) {
            paddingLeft = ((i - width) - nr20Var.getPaddingLeft()) - i3;
        } else {
            paddingLeft = i3 + nr20Var.getPaddingLeft();
        }
        this.j = paddingLeft;
        this.l = nr20Var.getLayoutDirection() == 1 ? nr20Var.getPaddingRight() : (i - fMeasureText) - nr20Var.getPaddingLeft();
    }

    @Override // a.lt20
    public final int f() {
        StaticLayout staticLayout = this.v;
        return (staticLayout != null ? staticLayout.getHeight() : 0) + this.e;
    }

    public final void g(TextPaint textPaint, String str, float f) {
        int i = this.o;
        textPaint.setTextSize(i);
        while (true) {
            int i2 = this.n;
            if (i <= i2 || textPaint.measureText(str) <= f) {
                break;
            }
            i -= this.f;
            if (i <= i2) {
                i = i2;
                break;
            }
            textPaint.setTextSize(i);
        }
        textPaint.setTextSize(i);
        this.i = TextUtils.ellipsize(this.h, textPaint, f, TextUtils.TruncateAt.END).toString();
    }

    public final boolean h(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        String string = charSequence.toString();
        if (Intrinsics.d(this.h, string)) {
            return false;
        }
        this.h = string;
        return true;
    }

    public final boolean i(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        String string = charSequence.toString();
        if (Intrinsics.d(this.g, string)) {
            return false;
        }
        this.g = string;
        return true;
    }

    @Override // a.lt20
    public final void k(Canvas canvas) {
        canvas.getClass();
        canvas.save();
        canvas.translate(this.j, this.k);
        StaticLayout staticLayout = this.v;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.drawText(this.i, this.l, this.m, this.c);
    }
}
