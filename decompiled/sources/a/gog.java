package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gog {
    public static final fog Companion = new fog();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11630a;
    public final String b;

    public /* synthetic */ gog(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f11630a = null;
        } else {
            this.f11630a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gog)) {
            return false;
        }
        gog gogVar = (gog) obj;
        return Intrinsics.d(this.f11630a, gogVar.f11630a) && Intrinsics.d(this.b, gogVar.b);
    }

    public final int hashCode() {
        String str = this.f11630a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CyberFullMatchInfoResponse(matchFormat=", this.f11630a, ", tournamentStage=", this.b, Separators.RPAREN);
    }
}
