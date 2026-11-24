package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class odg {
    public static final ndg Companion = new ndg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25073a;
    public final String b;
    public final String c;

    public /* synthetic */ odg(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f25073a = null;
        } else {
            this.f25073a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odg)) {
            return false;
        }
        odg odgVar = (odg) obj;
        return Intrinsics.d(this.f25073a, odgVar.f25073a) && Intrinsics.d(this.b, odgVar.b) && Intrinsics.d(this.c, odgVar.c);
    }

    public final int hashCode() {
        Long l = this.f25073a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f25073a, "CyberChampPrizeDistributionTeamResponse(feedId=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
