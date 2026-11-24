package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2768a;
    public final String b;
    public final String c;
    public final long d;

    public bkv0(float f, String str, String str2, long j) {
        this.f2768a = f;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkv0)) {
            return false;
        }
        bkv0 bkv0Var = (bkv0) obj;
        return Float.compare(this.f2768a, bkv0Var.f2768a) == 0 && this.b.equals(bkv0Var.b) && this.c.equals(bkv0Var.c) && this.d == bkv0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ua80.b(ua80.b(Float.hashCode(this.f2768a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinnerModel(points=");
        sb.append(this.f2768a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", prize=");
        defpackage.c.i(sb, this.d, this.c, ", place=");
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
