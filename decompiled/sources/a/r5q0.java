package a;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class r5q0 {
    public float c;
    public float d;
    public final WeakReference f;
    public p2q0 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f29901a = new TextPaint(1);
    public final pac b = new pac(this, 1);
    public boolean e = true;

    public r5q0(q5q0 q5q0Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(q5q0Var);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f29901a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(p2q0 p2q0Var, Context context) {
        if (this.g != p2q0Var) {
            this.g = p2q0Var;
            WeakReference weakReference = this.f;
            if (p2q0Var != null) {
                TextPaint textPaint = this.f29901a;
                pac pacVar = this.b;
                p2q0Var.e(context, textPaint, pacVar);
                q5q0 q5q0Var = (q5q0) weakReference.get();
                if (q5q0Var != null) {
                    textPaint.drawableState = q5q0Var.getState();
                }
                p2q0Var.d(context, textPaint, pacVar);
                this.e = true;
            }
            q5q0 q5q0Var2 = (q5q0) weakReference.get();
            if (q5q0Var2 != null) {
                q5q0Var2.a();
                q5q0Var2.onStateChange(q5q0Var2.getState());
            }
        }
    }
}
