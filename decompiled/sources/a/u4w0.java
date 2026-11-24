package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u4w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35071a;
    public final int b;
    public final String c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public u4w0(int i, int i2, String str, long j, String str2, int i3, int i4, String str3, String str4, String str5, String str6) {
        brm0.B(str, str2, str3);
        this.f35071a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = i3;
        this.g = i4;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4w0)) {
            return false;
        }
        u4w0 u4w0Var = (u4w0) obj;
        return this.f35071a == u4w0Var.f35071a && this.b == u4w0Var.b && Intrinsics.d(this.c, u4w0Var.c) && this.d == u4w0Var.d && Intrinsics.d(this.e, u4w0Var.e) && this.f == u4w0Var.f && this.g == u4w0Var.g && Intrinsics.d(this.h, u4w0Var.h) && Intrinsics.d(this.i, u4w0Var.i) && Intrinsics.d(this.j, u4w0Var.j) && Intrinsics.d(this.k, u4w0Var.k);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.a(this.g, twn.a(this.f, ua80.b(rw2.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f35071a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h);
        String str = this.i;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CryptData(group=");
        sb.append(this.f35071a);
        sb.append(", whence=");
        sb.append(this.b);
        sb.append(", bundleId=");
        sb.append(this.c);
        sb.append(", timeDiff=");
        sb.append(this.d);
        sb.append(", appGuid=");
        sb.append(this.e);
        sb.append(", ref=");
        sb.append(this.f);
        sb.append(", fCountry=");
        sb.append(this.g);
        sb.append(", applicationVersion=");
        sb.append(this.h);
        sb.append(", rnd2=");
        sb.append(this.i);
        sb.append(", rnd3=");
        sb.append(this.j);
        sb.append(", rnd4=");
        return axq.m(sb, this.k, ')');
    }
}
