package a;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ke3 extends xvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18133a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ pe3 d;

    public ke3(pe3 pe3Var, int i, int i2, WeakReference weakReference) {
        this.d = pe3Var;
        this.f18133a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // a.xvw
    public final void U(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f18133a) != -1) {
            typeface = ia3.a(typeface, i, (this.b & 2) != 0);
        }
        pe3 pe3Var = this.d;
        if (pe3Var.n) {
            pe3Var.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = pe3Var.j;
                if (zIsAttachedToWindow) {
                    textView.post(new le3(textView, typeface, i2, (byte) 0));
                } else {
                    pe3.d(textView, typeface, i2);
                }
            }
        }
    }
}
