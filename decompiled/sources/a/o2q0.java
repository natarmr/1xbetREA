package a;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class o2q0 extends zsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24544a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ zsm0 c;
    public final /* synthetic */ p2q0 d;

    public o2q0(p2q0 p2q0Var, Context context, TextPaint textPaint, zsm0 zsm0Var) {
        this.d = p2q0Var;
        this.f24544a = context;
        this.b = textPaint;
        this.c = zsm0Var;
    }

    @Override // a.zsm0
    public final void t(int i) {
        this.c.t(i);
    }

    @Override // a.zsm0
    public final void u(Typeface typeface, boolean z) {
        this.d.f(this.f24544a, this.b, typeface);
        this.c.u(typeface, z);
    }
}
