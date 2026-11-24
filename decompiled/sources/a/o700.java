package a;

import android.content.Context;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes5.dex */
public final class o700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24761a;
    public final float b;
    public final String c;
    public final float d;
    public final n700 e;
    public boolean f;
    public final n0o0 g;
    public final n0o0 h;

    public o700(Context context, float f, float f2, String str, float f3) {
        n700 n700Var = n700.f23018a;
        this.f24761a = f;
        this.b = f2;
        this.c = str;
        this.d = f3;
        this.e = n700Var;
        this.f = false;
        this.g = maz.b(new i7q(context, (byte) 18));
        this.h = maz.b(new jtz((byte) 24));
    }

    public final Paint a() {
        return (Paint) this.h.getValue();
    }

    public final Paint b() {
        return (Paint) this.g.getValue();
    }

    public final String toString() {
        return "x= " + this.f24761a + ", y= " + this.b;
    }
}
