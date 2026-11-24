package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class prh {
    public static final orh Companion = new orh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27464a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ prh(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f27464a = null;
        } else {
            this.f27464a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prh)) {
            return false;
        }
        prh prhVar = (prh) obj;
        return Intrinsics.d(this.f27464a, prhVar.f27464a) && Intrinsics.d(this.b, prhVar.b) && Intrinsics.d(this.c, prhVar.c) && Intrinsics.d(this.d, prhVar.d);
    }

    public final int hashCode() {
        String str = this.f27464a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(b1j.n("CyberValorantMapPoolResponse(name=", this.f27464a, ", imageS3=", this.b, ", wins="), this.c, ", losses=", this.d, Separators.RPAREN);
    }
}
