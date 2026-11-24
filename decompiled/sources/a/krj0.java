package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class krj0 {
    public static final jrj0 Companion = new jrj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18768a;
    public final String b;
    public final Long c;

    public /* synthetic */ krj0(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f18768a = null;
        } else {
            this.f18768a = str;
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
        if (!(obj instanceof krj0)) {
            return false;
        }
        krj0 krj0Var = (krj0) obj;
        return Intrinsics.d(this.f18768a, krj0Var.f18768a) && Intrinsics.d(this.b, krj0Var.b) && Intrinsics.d(this.c, krj0Var.c);
    }

    public final int hashCode() {
        String str = this.f18768a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.r(b1j.n("ShortGameTeamResponse(id=", this.f18768a, ", title=", this.b, ", clId="), this.c, Separators.RPAREN);
    }
}
