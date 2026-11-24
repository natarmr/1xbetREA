package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class eks0 {
    public static final dks0 Companion = new dks0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7967a;
    public final sjs0 b;
    public final tks0 c;
    public final tks0 d;

    public /* synthetic */ eks0(int i, Long l, sjs0 sjs0Var, tks0 tks0Var, tks0 tks0Var2) {
        if ((i & 1) == 0) {
            this.f7967a = null;
        } else {
            this.f7967a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sjs0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = tks0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = tks0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eks0)) {
            return false;
        }
        eks0 eks0Var = (eks0) obj;
        return Intrinsics.d(this.f7967a, eks0Var.f7967a) && Intrinsics.d(this.b, eks0Var.b) && Intrinsics.d(this.c, eks0Var.c) && Intrinsics.d(this.d, eks0Var.d);
    }

    public final int hashCode() {
        Long l = this.f7967a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        sjs0 sjs0Var = this.b;
        int iHashCode2 = (iHashCode + (sjs0Var == null ? 0 : sjs0Var.hashCode())) * 31;
        tks0 tks0Var = this.c;
        int iHashCode3 = (iHashCode2 + (tks0Var == null ? 0 : tks0Var.hashCode())) * 31;
        tks0 tks0Var2 = this.d;
        return iHashCode3 + (tks0Var2 != null ? tks0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "TransfersResponse(dateTimestamp=" + this.f7967a + ", player=" + this.b + ", oldTeam=" + this.c + ", newTeam=" + this.d + Separators.RPAREN;
    }
}
