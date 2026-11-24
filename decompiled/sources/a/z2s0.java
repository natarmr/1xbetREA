package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class z2s0 {
    public static final y2s0 Companion = new y2s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43687a;
    public final Boolean b;
    public final Long c;
    public final Boolean d;

    public /* synthetic */ z2s0(int i, Long l, Boolean bool, Long l2, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f43687a = null;
        } else {
            this.f43687a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2s0)) {
            return false;
        }
        z2s0 z2s0Var = (z2s0) obj;
        return Intrinsics.d(this.f43687a, z2s0Var.f43687a) && Intrinsics.d(this.b, z2s0Var.b) && Intrinsics.d(this.c, z2s0Var.c) && Intrinsics.d(this.d, z2s0Var.d);
    }

    public final int hashCode() {
        Long l = this.f43687a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "TournamentPersonalInfoResponse(id=" + this.f43687a + ", meParticipating=" + this.b + ", crmParticipantCurrentStage=" + this.c + ", isBlocked=" + this.d + Separators.RPAREN;
    }
}
