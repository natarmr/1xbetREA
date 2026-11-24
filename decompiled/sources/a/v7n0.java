package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v7n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36936a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final long g;

    public v7n0(int i, int i2, int i3, long j, String str, String str2, boolean z) {
        str2.getClass();
        this.f36936a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7n0)) {
            return false;
        }
        v7n0 v7n0Var = (v7n0) obj;
        return this.f36936a == v7n0Var.f36936a && this.b == v7n0Var.b && this.c == v7n0Var.c && this.d.equals(v7n0Var.d) && Intrinsics.d(this.e, v7n0Var.e) && this.f == v7n0Var.f && this.g == v7n0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(22) + rw2.b(brm0.e(ua80.b(twn.a(1, ua80.b(twn.a(1357, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f36936a) * 31, 31), 31), 31), 31, this.d), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SubscriptionGamesRequest(cfView=", this.f36936a, ", userGeoCountryId=", ", userRegistrationCountryId=", this.b);
        kng0.w(this.c, ", gr=1357, lng=", this.d, ", ref=1, subId=", sbT);
        brm0.C(this.e, ", cutCoef=", ", userId=", sbT, this.f);
        return brm0.k(this.g, ", whence=22)", sbT);
    }
}
