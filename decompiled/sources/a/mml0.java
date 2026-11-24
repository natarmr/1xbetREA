package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22044a;
    public final String b;
    public final kpm c;
    public final String d;
    public final r0n e;

    public mml0(String str, String str2, kpm kpmVar, String str3, r0n r0nVar) {
        str.getClass();
        str2.getClass();
        this.f22044a = str;
        this.b = str2;
        this.c = kpmVar;
        this.d = str3;
        this.e = r0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mml0)) {
            return false;
        }
        mml0 mml0Var = (mml0) obj;
        return Intrinsics.d(this.f22044a, mml0Var.f22044a) && Intrinsics.d(this.b, mml0Var.b) && this.c.equals(mml0Var.c) && Intrinsics.d(this.d, mml0Var.d) && this.e.equals(mml0Var.e);
    }

    public final int hashCode() {
        int iC = dw9.c(this.c, ua80.b(this.f22044a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MultiTeams(teamOneName=", this.f22044a, ", teamTwoName=", this.b, ", scoreModel=");
        sbN.append(this.c);
        sbN.append(", infoLabel=");
        sbN.append(this.d);
        sbN.append(", options=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
