package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class scj {
    public static final scj d = new scj(null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31989a;
    public final String b;
    public final String c;

    public scj(String str, String str2, String str3) {
        this.f31989a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scj)) {
            return false;
        }
        scj scjVar = (scj) obj;
        return Intrinsics.d(this.f31989a, scjVar.f31989a) && Intrinsics.d(this.b, scjVar.b) && Intrinsics.d(this.c, scjVar.c);
    }

    public final int hashCode() {
        String str = this.f31989a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("DateAffixes(yearSuffix=", this.f31989a, ", monthSuffix=", this.b, ", daySuffix="), this.c, Separators.RPAREN);
    }
}
