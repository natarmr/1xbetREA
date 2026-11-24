package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class eaa0 {
    public static final t9a0 Companion = new t9a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7457a;
    public final String b;
    public final Integer c;
    public final String d;
    public final kre e;
    public final String f;

    public /* synthetic */ eaa0(int i, String str, String str2, Integer num, String str3, kre kreVar, String str4) {
        if ((i & 1) == 0) {
            this.f7457a = null;
        } else {
            this.f7457a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = kreVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa0)) {
            return false;
        }
        eaa0 eaa0Var = (eaa0) obj;
        return Intrinsics.d(this.f7457a, eaa0Var.f7457a) && Intrinsics.d(this.b, eaa0Var.b) && Intrinsics.d(this.c, eaa0Var.c) && Intrinsics.d(this.d, eaa0Var.d) && Intrinsics.d(this.e, eaa0Var.e) && Intrinsics.d(this.f, eaa0Var.f);
    }

    public final int hashCode() {
        String str = this.f7457a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        kre kreVar = this.e;
        int iHashCode5 = (iHashCode4 + (kreVar == null ? 0 : kreVar.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerResponse(id=", this.f7457a, ", name=", this.b, ", translationId=");
        b1j.u(this.c, ", shortName=", this.d, ", country=", sbN);
        sbN.append(this.e);
        sbN.append(", image=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
