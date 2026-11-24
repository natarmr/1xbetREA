package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f86 implements j86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9090a;
    public final String b;
    public final wxm c;
    public final String d;

    public f86(String str, String str2, wxm wxmVar, String str3) {
        str.getClass();
        str3.getClass();
        this.f9090a = str;
        this.b = str2;
        this.c = wxmVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f86)) {
            return false;
        }
        f86 f86Var = (f86) obj;
        return Intrinsics.d(this.f9090a, f86Var.f9090a) && this.b.equals(f86Var.b) && this.c.equals(f86Var.c) && Intrinsics.d(this.d, f86Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f9090a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f9090a, ", infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(", liveTag=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
