package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rp1 {
    public static final qp1 Companion = new qp1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30864a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ rp1(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f30864a = null;
        } else {
            this.f30864a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp1)) {
            return false;
        }
        rp1 rp1Var = (rp1) obj;
        return Intrinsics.d(this.f30864a, rp1Var.f30864a) && Intrinsics.d(this.b, rp1Var.b) && Intrinsics.d(this.c, rp1Var.c) && Intrinsics.d(this.d, rp1Var.d);
    }

    public final int hashCode() {
        String str = this.f30864a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("AggregatorSortingOptionResponse(name=", this.f30864a, ", code=", this.b, ", attribute="), this.c, ", direction=", this.d, Separators.RPAREN);
    }
}
