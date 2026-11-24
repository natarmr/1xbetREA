package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class g4a0 {
    public static final e4a0 Companion = new e4a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10656a;
    public final String b;
    public final lre c;

    public /* synthetic */ g4a0(int i, String str, String str2, lre lreVar) {
        if ((i & 1) == 0) {
            this.f10656a = null;
        } else {
            this.f10656a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = lreVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4a0)) {
            return false;
        }
        g4a0 g4a0Var = (g4a0) obj;
        return Intrinsics.d(this.f10656a, g4a0Var.f10656a) && Intrinsics.d(this.b, g4a0Var.b) && Intrinsics.d(this.c, g4a0Var.c);
    }

    public final int hashCode() {
        String str = this.f10656a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        lre lreVar = this.c;
        return iHashCode2 + (lreVar != null ? lreVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerInfoResponse(id=", this.f10656a, ", name=", this.b, ", country=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
