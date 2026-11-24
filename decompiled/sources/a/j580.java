package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15922a;
    public final String b;
    public final boolean c;

    public j580(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f15922a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j580)) {
            return false;
        }
        j580 j580Var = (j580) obj;
        return Intrinsics.d(this.f15922a, j580Var.f15922a) && Intrinsics.d(this.b, j580Var.b) && this.c == j580Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f15922a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("OpponentsStateModel(firstTeamName=", this.f15922a, ", secondTeamName=", this.b, ", isSupportRtl="), this.c, Separators.RPAREN);
    }
}
