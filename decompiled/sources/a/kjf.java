package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kjf {
    public static final jjf Companion = new jjf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18383a;
    public final String b;
    public final gjf c;

    public /* synthetic */ kjf(int i, String str, String str2, gjf gjfVar) {
        if ((i & 1) == 0) {
            this.f18383a = null;
        } else {
            this.f18383a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gjfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjf)) {
            return false;
        }
        kjf kjfVar = (kjf) obj;
        return Intrinsics.d(this.f18383a, kjfVar.f18383a) && Intrinsics.d(this.b, kjfVar.b) && Intrinsics.d(this.c, kjfVar.c);
    }

    public final int hashCode() {
        String str = this.f18383a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gjf gjfVar = this.c;
        return iHashCode2 + (gjfVar != null ? gjfVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2CompositionStatisticPlayerResponse(playerId=", this.f18383a, ", image=", this.b, ", statistics=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
