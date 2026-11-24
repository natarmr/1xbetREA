package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class m0s0 {
    public static final l0s0 Companion = new l0s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20971a;
    public final String b;
    public final String c;
    public final q0s0 d;

    public /* synthetic */ m0s0(int i, String str, String str2, String str3, q0s0 q0s0Var) {
        if ((i & 1) == 0) {
            this.f20971a = null;
        } else {
            this.f20971a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = q0s0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0s0)) {
            return false;
        }
        m0s0 m0s0Var = (m0s0) obj;
        return Intrinsics.d(this.f20971a, m0s0Var.f20971a) && Intrinsics.d(this.b, m0s0Var.b) && Intrinsics.d(this.c, m0s0Var.c) && Intrinsics.d(this.d, m0s0Var.d);
    }

    public final int hashCode() {
        String str = this.f20971a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        q0s0 q0s0Var = this.d;
        return iHashCode3 + (q0s0Var != null ? q0s0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentCsFeedStatisticTopPlayerResponse(name=", this.f20971a, ", image=", this.b, ", imageS3=");
        sbN.append(this.c);
        sbN.append(", score=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
