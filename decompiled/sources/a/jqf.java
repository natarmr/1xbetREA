package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jqf {
    public static final iqf Companion = new iqf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16949a;
    public final Long b;
    public final String c;

    public /* synthetic */ jqf(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f16949a = null;
        } else {
            this.f16949a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
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
        if (!(obj instanceof jqf)) {
            return false;
        }
        jqf jqfVar = (jqf) obj;
        return Intrinsics.d(this.f16949a, jqfVar.f16949a) && Intrinsics.d(this.b, jqfVar.b) && Intrinsics.d(this.c, jqfVar.c);
    }

    public final int hashCode() {
        String str = this.f16949a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(kng0.s(this.b, "Cs2PlayerDuelTeamResponse(name=", this.f16949a, ", feedId=", ", imageS3="), this.c, Separators.RPAREN);
    }
}
