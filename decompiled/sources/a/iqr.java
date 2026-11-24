package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iqr implements mqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15222a;
    public final String b;
    public final a4x c;
    public final a4x d;

    public iqr(String str, String str2, i4 i4Var, i4 i4Var2) {
        str2.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f15222a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqr)) {
            return false;
        }
        iqr iqrVar = (iqr) obj;
        return this.f15222a.equals(iqrVar.f15222a) && Intrinsics.d(this.b, iqrVar.b) && Intrinsics.d(this.c, iqrVar.c) && Intrinsics.d(this.d, iqrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, ua80.b(this.f15222a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Penalty(score=", this.f15222a, ", penaltyName=", this.b, ", penaltyTeamOne=");
        sbN.append(this.c);
        sbN.append(", penaltyTeamTwo=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
