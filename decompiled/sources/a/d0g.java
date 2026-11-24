package a;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class d0g extends ki30 {
    public static final /* synthetic */ int j1 = 0;
    public b0g i1;

    public final void A(float f, float f2, float f3, float f4) {
        RectF rectF = this.i1.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // a.ki30
    public final void g(Canvas canvas) {
        if (this.i1.q.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        b0g b0gVar = this.i1;
        if (i >= 26) {
            canvas.clipOutRect(b0gVar.q);
        } else {
            canvas.clipRect(b0gVar.q, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.i1 = new b0g(this.i1);
        return this;
    }
}
