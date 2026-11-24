package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vsp {
    public static final usp Companion = new usp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f37961a;
    public final String b;
    public final e8v0 c;
    public final atp d;
    public final msp e;
    public final msp f;
    public final uup g;

    public /* synthetic */ vsp(int i, Long l, String str, e8v0 e8v0Var, atp atpVar, msp mspVar, msp mspVar2, uup uupVar) {
        if ((i & 1) == 0) {
            this.f37961a = null;
        } else {
            this.f37961a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = e8v0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = atpVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = mspVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = mspVar2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = uupVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsp)) {
            return false;
        }
        vsp vspVar = (vsp) obj;
        return Intrinsics.d(this.f37961a, vspVar.f37961a) && Intrinsics.d(this.b, vspVar.b) && this.c == vspVar.c && Intrinsics.d(this.d, vspVar.d) && Intrinsics.d(this.e, vspVar.e) && Intrinsics.d(this.f, vspVar.f) && Intrinsics.d(this.g, vspVar.g);
    }

    public final int hashCode() {
        Long l = this.f37961a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e8v0 e8v0Var = this.c;
        int iHashCode3 = (iHashCode2 + (e8v0Var == null ? 0 : e8v0Var.hashCode())) * 31;
        atp atpVar = this.d;
        int iHashCode4 = (iHashCode3 + (atpVar == null ? 0 : atpVar.hashCode())) * 31;
        msp mspVar = this.e;
        int iHashCode5 = (iHashCode4 + (mspVar == null ? 0 : mspVar.hashCode())) * 31;
        msp mspVar2 = this.f;
        int iHashCode6 = (iHashCode5 + (mspVar2 == null ? 0 : mspVar2.hashCode())) * 31;
        uup uupVar = this.g;
        return iHashCode6 + (uupVar != null ? uupVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f37961a, "FightResponse(fightId=", ", cardSegment=", this.b, ", weightClass=");
        sbS.append(this.c);
        sbS.append(", result=");
        sbS.append(this.d);
        sbS.append(", red=");
        sbS.append(this.e);
        sbS.append(", blue=");
        sbS.append(this.f);
        sbS.append(", stats=");
        sbS.append(this.g);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
