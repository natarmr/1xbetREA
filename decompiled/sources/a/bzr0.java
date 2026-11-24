package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bzr0 {
    public static final uyr0 Companion = new uyr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3486a;
    public final Integer b;
    public final Integer c;
    public final Boolean d;
    public final Integer e;
    public final tyr0 f;
    public final qyr0 g;

    public /* synthetic */ bzr0(int i, Long l, Integer num, Integer num2, Boolean bool, Integer num3, tyr0 tyr0Var, qyr0 qyr0Var) {
        if ((i & 1) == 0) {
            this.f3486a = null;
        } else {
            this.f3486a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = tyr0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = qyr0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzr0)) {
            return false;
        }
        bzr0 bzr0Var = (bzr0) obj;
        return Intrinsics.d(this.f3486a, bzr0Var.f3486a) && Intrinsics.d(this.b, bzr0Var.b) && Intrinsics.d(this.c, bzr0Var.c) && Intrinsics.d(this.d, bzr0Var.d) && Intrinsics.d(this.e, bzr0Var.e) && Intrinsics.d(this.f, bzr0Var.f) && Intrinsics.d(this.g, bzr0Var.g);
    }

    public final int hashCode() {
        Long l = this.f3486a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        tyr0 tyr0Var = this.f;
        int iHashCode6 = (iHashCode5 + (tyr0Var == null ? 0 : tyr0Var.hashCode())) * 31;
        qyr0 qyr0Var = this.g;
        return iHashCode6 + (qyr0Var != null ? qyr0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f3486a, "TournamentCardResponse(id=", ", kind=", ", type=");
        brm0.z(this.d, this.c, ", providerTournamentWithStages=", ", status=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", blockImage=");
        sbQ.append(this.f);
        sbQ.append(", blockHeader=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
