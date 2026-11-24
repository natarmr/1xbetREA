package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mhh {
    public static final lhh Companion = new lhh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21793a;
    public final String b;
    public final Long c;
    public final String d;

    public /* synthetic */ mhh(int i, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21793a = null;
        } else {
            this.f21793a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhh)) {
            return false;
        }
        mhh mhhVar = (mhh) obj;
        return Intrinsics.d(this.f21793a, mhhVar.f21793a) && Intrinsics.d(this.b, mhhVar.b) && Intrinsics.d(this.c, mhhVar.c) && Intrinsics.d(this.d, mhhVar.d);
    }

    public final int hashCode() {
        String str = this.f21793a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberTeamResponse(id=", this.f21793a, ", title=", this.b, ", translationId=");
        sbN.append(this.c);
        sbN.append(", image=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
