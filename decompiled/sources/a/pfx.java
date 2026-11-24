package a;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class pfx {
    public static final pfx e = new pfx(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26926a;
    public final int b;
    public final int c;
    public final int d;

    public pfx(int i, int i2, int i3, int i4) {
        this.f26926a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static pfx a(pfx pfxVar, pfx pfxVar2) {
        return c(Math.max(pfxVar.f26926a, pfxVar2.f26926a), Math.max(pfxVar.b, pfxVar2.b), Math.max(pfxVar.c, pfxVar2.c), Math.max(pfxVar.d, pfxVar2.d));
    }

    public static pfx b(pfx pfxVar, pfx pfxVar2) {
        return c(Math.min(pfxVar.f26926a, pfxVar2.f26926a), Math.min(pfxVar.b, pfxVar2.b), Math.min(pfxVar.c, pfxVar2.c), Math.min(pfxVar.d, pfxVar2.d));
    }

    public static pfx c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new pfx(i, i2, i3, i4);
    }

    public static pfx d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return sf3.s(this.f26926a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pfx.class != obj.getClass()) {
            return false;
        }
        pfx pfxVar = (pfx) obj;
        return this.d == pfxVar.d && this.f26926a == pfxVar.f26926a && this.c == pfxVar.c && this.b == pfxVar.b;
    }

    public final int hashCode() {
        return (((((this.f26926a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f26926a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return brm0.n(sb, this.d, '}');
    }
}
