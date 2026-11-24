package a;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class eue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8416a;
    public final int b;
    public final int c;
    public String d;
    public int e;
    public StaticLayout f;
    public final n0o0 g;

    public eue(int i, int i2, int i3, View view) {
        view.getClass();
        this.f8416a = view;
        this.b = i;
        this.c = i2;
        this.d = "";
        this.g = maz.b(new x9c(this, i3, (byte) 3));
    }

    public final void a(Canvas canvas, float f, float f2) {
        canvas.getClass();
        if (this.d.length() > 0) {
            View view = this.f8416a;
            if (view.getLayoutDirection() == 1) {
                int measuredWidth = view.getMeasuredWidth();
                StaticLayout staticLayout = this.f;
                f = (measuredWidth - (staticLayout != null ? staticLayout.getWidth() : 0)) - f;
            }
            canvas.save();
            canvas.translate(f, f2 + this.c);
            StaticLayout staticLayout2 = this.f;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final boolean b() {
        return this.d.length() == 0;
    }

    public final void c(int i) {
        if (this.d.length() <= 0) {
            this.e = 0;
            return;
        }
        StaticLayout staticLayoutI = xdx.I(f1t0.L(this.d), (TextPaint) this.g.getValue(), i, this.b, TextUtils.TruncateAt.END, 0, null, 3568);
        this.f = staticLayoutI;
        this.e = (this.c * 2) + staticLayoutI.getHeight();
    }

    public final void d(int i) {
        e(this.f8416a.getContext().getString(i));
    }

    public final void e(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.d = string;
    }
}
