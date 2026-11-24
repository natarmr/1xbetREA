package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28683a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public qgg(String str, String str2, String str3, String str4, long j) {
        this.f28683a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgg)) {
            return false;
        }
        qgg qggVar = (qgg) obj;
        return this.f28683a == qggVar.f28683a && Intrinsics.d(this.b, qggVar.b) && Intrinsics.d(this.c, qggVar.c) && Intrinsics.d(this.d, qggVar.d) && Intrinsics.d(this.e, qggVar.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f28683a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28683a, "CyberChampsImagesModel(feedId=", ", background=", this.b);
        f140.v(sbO, ", backgroundTablet=", this.c, ", master=", this.d);
        return rw2.o(sbO, ", masterTablet=", this.e, Separators.RPAREN);
    }
}
