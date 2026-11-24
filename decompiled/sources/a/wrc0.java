package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wrc0 implements yrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39635a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public wrc0(String str, long j, String str2, String str3, int i, boolean z) {
        this.f39635a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
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
        if (!(obj instanceof wrc0)) {
            return false;
        }
        wrc0 wrc0Var = (wrc0) obj;
        return this.f39635a.equals(wrc0Var.f39635a) && this.b == wrc0Var.b && this.c.equals(wrc0Var.c) && this.d.equals(wrc0Var.d) && this.e == wrc0Var.e && this.f == wrc0Var.f;
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
        return Boolean.hashCode(this.f) + twn.a(this.e, ua80.b(ua80.b(rw2.b(this.f39635a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Default(imageUrl=", this.f39635a, ", id=");
        f140.v(sbO, ", name=", this.c, ", desc=", this.d);
        dw9.v(this.e, ", countFS=", ", showFSLabel=", sbO, this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
