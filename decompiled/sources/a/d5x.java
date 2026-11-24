package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d5x extends shl {
    public final whl n;
    public c2 o;
    public n4u0 p;

    public d5x(Context context, u06 u06Var, whl whlVar, c2 c2Var) {
        super(context, u06Var);
        this.n = whlVar;
        this.o = c2Var;
        c2Var.f3600a = this;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        n4u0 n4u0Var;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            w73 w73Var = this.c;
            u06 u06Var = this.b;
            if (w73Var != null && Settings.Global.getFloat(this.f32217a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (n4u0Var = this.p) != null) {
                n4u0Var.setBounds(getBounds());
                this.p.setTint(u06Var.e[0]);
                this.p.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            whl whlVar = this.n;
            whlVar.f39171a.d();
            whlVar.a(canvas, bounds, fB, z, z2);
            int i2 = u06Var.i;
            int i3 = this.k;
            boolean z3 = (u06Var instanceof k900) || ((u06Var instanceof dkc) && ((dkc) u06Var).u);
            boolean z4 = z3 && i2 == 0 && !u06Var.b(false);
            Paint paint = this.j;
            if (!z4) {
                if (z3) {
                    uhl uhlVar = (uhl) ((ArrayList) this.o.b).get(0);
                    uhl uhlVar2 = (uhl) dw9.l(1, (ArrayList) this.o.b);
                    whl whlVar2 = this.n;
                    if (whlVar2 instanceof c900) {
                        i = i2;
                        whlVar2.d(canvas, paint, 0.0f, uhlVar.f35684a, u06Var.f, i3, i);
                        this.n.d(canvas, paint, uhlVar2.b, 1.0f, u06Var.f, i3, i);
                    } else {
                        i = i2;
                        canvas.save();
                        canvas.rotate(uhlVar2.g);
                        this.n.d(canvas, paint, uhlVar2.b, uhlVar.f35684a + 1.0f, u06Var.f, i3, i);
                        canvas.restore();
                    }
                }
                for (int i4 = 0; i4 < ((ArrayList) this.o.b).size(); i4++) {
                    uhl uhlVar3 = (uhl) ((ArrayList) this.o.b).get(i4);
                    uhlVar3.f = c();
                    this.n.c(canvas, paint, uhlVar3, this.k);
                    if (i4 <= 0 && !z4 && z3) {
                        this.n.d(canvas, paint, ((uhl) ((ArrayList) this.o.b).get(i4 - 1)).b, uhlVar3.f35684a, u06Var.f, i3, i);
                    }
                }
                canvas.restore();
            }
            this.n.d(canvas, paint, 0.0f, 1.0f, u06Var.f, i3, 0);
            i = i2;
            while (i4 < ((ArrayList) this.o.b).size()) {
                uhl uhlVar4 = (uhl) ((ArrayList) this.o.b).get(i4);
                uhlVar4.f = c();
                this.n.c(canvas, paint, uhlVar4, this.k);
                if (i4 <= 0) {
                }
            }
            canvas.restore();
        }
    }

    @Override // a.shl
    public final boolean e(boolean z, boolean z2, boolean z3) {
        n4u0 n4u0Var;
        boolean zE = super.e(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.f32217a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (n4u0Var = this.p) != null) {
            return n4u0Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.o.d();
        }
        if (z && z3) {
            this.o.J();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }
}
