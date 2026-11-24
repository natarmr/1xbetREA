package a;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ctf {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f4933a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new ctf("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = vtt0.f38024a;
        s = Integer.toString(0, 36);
        t = Integer.toString(17, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(18, 36);
        y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public ctf(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            x0x.A(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f4933a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f4933a = charSequence.toString();
        } else {
            this.f4933a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    public final btf a() {
        btf btfVar = new btf();
        btfVar.f3180a = this.f4933a;
        btfVar.b = this.d;
        btfVar.c = this.b;
        btfVar.d = this.c;
        btfVar.e = this.e;
        btfVar.f = this.f;
        btfVar.g = this.g;
        btfVar.h = this.h;
        btfVar.i = this.i;
        btfVar.j = this.n;
        btfVar.k = this.o;
        btfVar.l = this.j;
        btfVar.m = this.k;
        btfVar.n = this.l;
        btfVar.o = this.m;
        btfVar.p = this.p;
        btfVar.q = this.q;
        btfVar.r = this.r;
        return btfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ctf.class == obj.getClass()) {
            ctf ctfVar = (ctf) obj;
            if (TextUtils.equals(this.f4933a, ctfVar.f4933a) && this.b == ctfVar.b && this.c == ctfVar.c) {
                Bitmap bitmap = ctfVar.d;
                Bitmap bitmap2 = this.d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.e == ctfVar.e && this.f == ctfVar.f && this.g == ctfVar.g && this.h == ctfVar.h && this.i == ctfVar.i && this.j == ctfVar.j && this.k == ctfVar.k && this.l == ctfVar.l && this.m == ctfVar.m && this.n == ctfVar.n && this.o == ctfVar.o && this.p == ctfVar.p && this.q == ctfVar.q && this.r == ctfVar.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4933a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
