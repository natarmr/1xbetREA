package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xrc0 implements yrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hds f41363a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public xrc0(hds hdsVar, long j, String str, String str2, int i, boolean z) {
        this.f41363a = hdsVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z;
    }

    @Override // a.yrc0
    public final String A() {
        return this.d;
    }

    @Override // a.yrc0
    public final int a() {
        return this.e;
    }

    @Override // a.yrc0
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrc0)) {
            return false;
        }
        xrc0 xrc0Var = (xrc0) obj;
        return this.f41363a.equals(xrc0Var.f41363a) && this.b == xrc0Var.b && this.c.equals(xrc0Var.c) && this.d.equals(xrc0Var.d) && this.e == xrc0Var.e && this.f == xrc0Var.f;
    }

    @Override // a.yrc0
    public final long getId() {
        return this.b;
    }

    @Override // a.yrc0
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, ua80.b(ua80.b(rw2.b(this.f41363a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGame(imageInfo=");
        sb.append(this.f41363a);
        sb.append(", id=");
        sb.append(this.b);
        f140.v(sb, ", name=", this.c, ", desc=", this.d);
        dw9.v(this.e, ", countFS=", ", showFSLabel=", sb, this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
