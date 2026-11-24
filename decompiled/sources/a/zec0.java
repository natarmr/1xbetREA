package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44243a;
    public final String b;
    public final List c;
    public final double d;
    public final String e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;
    public final long j;

    public zec0(String str, String str2, List list, double d, String str3, long j, long j2, int i, int i2, long j3) {
        str.getClass();
        list.getClass();
        this.f44243a = str;
        this.b = str2;
        this.c = list;
        this.d = d;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = i;
        this.i = i2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zec0)) {
            return false;
        }
        zec0 zec0Var = (zec0) obj;
        return Intrinsics.d(this.f44243a, zec0Var.f44243a) && this.b.equals(zec0Var.b) && Intrinsics.d(this.c, zec0Var.c) && Double.compare(this.d, zec0Var.d) == 0 && this.e.equals(zec0Var.e) && this.f == zec0Var.f && this.g == zec0Var.g && this.h == zec0Var.h && this.i == zec0Var.i && this.j == zec0Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + twn.a(this.i, twn.a(this.h, rw2.b(rw2.b(ua80.b(brm0.d(this.d, dw9.a(ua80.b(this.f44243a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoCodeModel(promoCodeName=", this.f44243a, ", promoDescription=", this.b, ", promoCodeConditions=");
        sbN.append(this.c);
        sbN.append(", promoCodeAmount=");
        sbN.append(this.d);
        hne.B(sbN, ", currency=", this.e, ", promoCodeDateOfUse=");
        sbN.append(this.f);
        kng0.A(sbN, ", promoCodeDateOfUseBefore=", this.g, ", promoCodeSection=");
        axq.r(this.h, this.i, ", promoCodeStatus=", ", promoCodeId=", sbN);
        return brm0.k(this.j, Separators.RPAREN, sbN);
    }
}
