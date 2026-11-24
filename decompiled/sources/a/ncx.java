package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ncx {
    public static final mcx Companion = new mcx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23314a;
    public final String b;
    public final String c;

    public /* synthetic */ ncx(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f23314a = null;
        } else {
            this.f23314a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncx)) {
            return false;
        }
        ncx ncxVar = (ncx) obj;
        return Intrinsics.d(this.f23314a, ncxVar.f23314a) && Intrinsics.d(this.b, ncxVar.b) && Intrinsics.d(this.c, ncxVar.c);
    }

    public final int hashCode() {
        String str = this.f23314a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("InjuryResponse(dateFrom=", this.f23314a, ", dateUntil=", this.b, ", injury="), this.c, Separators.RPAREN);
    }
}
