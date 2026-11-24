package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zn80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v03 f44663a;
    public final int b;
    public final int c;

    public zn80(v03 v03Var, int i, int i2) {
        this.f44663a = v03Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zn80) {
            zn80 zn80Var = (zn80) obj;
            if (this.f44663a == zn80Var.f44663a && this.b == zn80Var.b && this.c == zn80Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f44663a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f44663a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
