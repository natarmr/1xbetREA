package a;

import android.content.res.ColorStateList;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class utj extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f36257a = maz.b(new rtj(0));
    public final n0o0 b = maz.b(new rtj(1));
    public final n0o0 c = maz.b(new rtj(2));
    public final n0o0 d = maz.b(stj.f32775a);
    public final n0o0 e = maz.b(ttj.f34511a);
    public ColorStateList f;
    public ColorStateList g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public int[] l;

    public utj() {
        int[] state = getState();
        state.getClass();
        b(state);
    }

    public final RectF a() {
        return (RectF) this.e.getValue();
    }

    public final boolean b(int[] iArr) {
        ColorStateList colorStateList = this.f;
        boolean z = false;
        if (colorStateList != null) {
            n0o0 n0o0Var = this.f36257a;
            int color = ((Paint) n0o0Var.getValue()).getColor();
            int colorForState = colorStateList.getColorForState(iArr, color);
            if (color != colorForState) {
                ((Paint) n0o0Var.getValue()).setColor(colorForState);
                z = true;
            }
        }
        ColorStateList colorStateList2 = this.g;
        if (colorStateList2 != null) {
            n0o0 n0o0Var2 = this.b;
            int color2 = ((Paint) n0o0Var2.getValue()).getColor();
            int colorForState2 = colorStateList2.getColorForState(iArr, color2);
            if (color2 != colorForState2) {
                ((Paint) n0o0Var2.getValue()).setColor(colorForState2);
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMin;
        canvas.getClass();
        n0o0 n0o0Var = this.d;
        copyBounds((Rect) n0o0Var.getValue());
        a().set((Rect) n0o0Var.getValue());
        float f = this.h;
        if (f == 0.0f) {
            fMin = a().width() / 2.0f;
            this.h = fMin;
        } else {
            fMin = Math.min(f, a().width() / 2.0f);
        }
        float f2 = fMin;
        if (this.j != 0 && a().width() > sj3.X(3) && a().height() > sj3.X(3)) {
            n0o0 n0o0Var2 = this.c;
            ((Paint) n0o0Var2.getValue()).setColor(this.j);
            ((Paint) n0o0Var2.getValue()).setShadowLayer(Math.min(1.0f, f2), 0.0f, 0.0f, this.j);
            a().inset(1.0f, 1.0f);
            canvas.drawRoundRect(a(), f2, f2, (Paint) n0o0Var2.getValue());
            a().inset(-1.0f, -1.0f);
        }
        int[] iArr = this.l;
        n0o0 n0o0Var3 = this.f36257a;
        if (iArr != null) {
            ((Paint) n0o0Var3.getValue()).setShader(new RadialGradient(this.k ? a().left : a().right, a().centerY(), f2, iArr, (float[]) null, Shader.TileMode.CLAMP));
            ((Paint) n0o0Var3.getValue()).setMaskFilter(new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL));
        }
        canvas.drawCircle(a().centerX(), a().centerX(), f2, (Paint) n0o0Var3.getValue());
        if (this.i <= 0.0f || a().width() <= this.i * 2.0f || a().height() <= this.i * 2.0f) {
            return;
        }
        canvas.drawRoundRect(a(), f2, f2, (Paint) this.b.getValue());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        return super.isStateful() || ((colorStateList = this.f) != null && colorStateList.isStateful()) || ((colorStateList2 = this.g) != null && colorStateList2.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        iArr.getClass();
        return b(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
