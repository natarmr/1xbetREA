package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lsh {
    public static final ksh Companion = new ksh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20578a;
    public final String b;
    public final Long c;

    public /* synthetic */ lsh(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f20578a = null;
        } else {
            this.f20578a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsh)) {
            return false;
        }
        lsh lshVar = (lsh) obj;
        return Intrinsics.d(this.f20578a, lshVar.f20578a) && Intrinsics.d(this.b, lshVar.b) && Intrinsics.d(this.c, lshVar.c);
    }

    public final int hashCode() {
        String str = this.f20578a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.r(b1j.n("CyberWorldCupTeamResponse(name=", this.f20578a, ", image=", this.b, ", feedId="), this.c, Separators.RPAREN);
    }
}
