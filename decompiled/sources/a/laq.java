package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class laq implements naq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19717a;
    public final long b;
    public final String c;

    public laq(long j, String str, String str2) {
        str.getClass();
        this.f19717a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laq)) {
            return false;
        }
        laq laqVar = (laq) obj;
        return Intrinsics.d(this.f19717a, laqVar.f19717a) && this.b == laqVar.b && this.c.equals(laqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f19717a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(f140.o(this.b, "ShowPromoBetSuccessMessage(betNumber=", this.f19717a, ", balanceId="), ", coefficient=", this.c, Separators.RPAREN);
    }
}
