package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class yn80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s03 f42927a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public yn80(s03 s03Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.f42927a = s03Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final jge0 a(jge0 jge0Var) {
        return jge0Var.m((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(boolean z, long j) {
        if (z) {
            long j2 = o9q0.b;
            if (o9q0.b(j, j2)) {
                return j2;
            }
        }
        int i = o9q0.c;
        int i2 = this.b;
        return s7n0.e(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final jge0 c(jge0 jge0Var) {
        float f = -this.f;
        return jge0Var.m((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return l1e0.d(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yn80) {
            yn80 yn80Var = (yn80) obj;
            if (this.f42927a == yn80Var.f42927a && this.b == yn80Var.b && this.c == yn80Var.c && this.d == yn80Var.d && this.e == yn80Var.e && Float.compare(this.f, yn80Var.f) == 0 && Float.compare(this.g, yn80Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + defpackage.c.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f42927a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f42927a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        axq.r(this.c, this.d, ", startLineIndex=", ", endLineIndex=", sb);
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return kng0.o(sb, this.g, Separators.RPAREN);
    }
}
