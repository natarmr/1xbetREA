package a;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xik extends x1 implements vjk, zf60 {
    public final Window j;
    public final pz40 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public xik(Context context, Window window) {
        super(context, null);
        this.j = window;
        this.k = androidx.compose.runtime.e.e(i4w0.f14164a);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(this, this);
        div0.a(this, new h33(this, (byte) 1));
    }

    @Override // a.x1
    public final void a(int i, fet fetVar) {
        fetVar.g0(1735448596);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) ((hgk0) this.k).getValue()).invoke(fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(this, i, (byte) 26);
        }
    }

    @Override // a.x1
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // a.x1
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o;
    }

    @Override // a.vjk
    public final Window getWindow() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // a.x1
    public final void h(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.j;
        if (mode != Integer.MIN_VALUE || this.l || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.m) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = fa3.f9186a.a(window);
            } else if (i3 < 32) {
                iA = ja3.f16169a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.m || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.l) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // a.zf60
    public final xiv0 l(View view, xiv0 xiv0Var) {
        if (!this.m) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return xiv0Var.f40966a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return xiv0Var;
    }
}
