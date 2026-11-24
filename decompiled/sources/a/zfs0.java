package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zfs0 implements w9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44314a;
    public final long b;
    public final int c;
    public final double d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public zfs0(long j, long j2, int i, double d, String str, String str2, String str3, int i2) {
        str3.getClass();
        this.f44314a = j;
        this.b = j2;
        this.c = i;
        this.d = d;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i2;
    }

    public static zfs0 a(zfs0 zfs0Var, String str) {
        long j = zfs0Var.f44314a;
        long j2 = zfs0Var.b;
        int i = zfs0Var.c;
        double d = zfs0Var.d;
        String str2 = zfs0Var.e;
        String str3 = zfs0Var.f;
        int i2 = zfs0Var.h;
        zfs0Var.getClass();
        str.getClass();
        return new zfs0(j, j2, i, d, str2, str3, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfs0)) {
            return false;
        }
        zfs0 zfs0Var = (zfs0) obj;
        return this.f44314a == zfs0Var.f44314a && this.b == zfs0Var.b && this.c == zfs0Var.c && Double.compare(this.d, zfs0Var.d) == 0 && this.e.equals(zfs0Var.e) && this.f.equals(zfs0Var.f) && Intrinsics.d(this.g, zfs0Var.g) && this.h == zfs0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + ua80.b(ua80.b(ua80.b(brm0.d(this.d, twn.a(this.c, rw2.b(Long.hashCode(this.f44314a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f44314a, "TransactionModel(id=", ", dateTime=");
        ua80.v(sbQ, this.b, ", idMove=", this.c);
        ohs0.A(sbQ, this.d, ", sum=", ", message=");
        f140.v(sbQ, this.e, ", bonusCurrency=", this.f, ", currencySymbol=");
        return brm0.j(this.h, this.g, ", position=", Separators.RPAREN, sbQ);
    }
}
