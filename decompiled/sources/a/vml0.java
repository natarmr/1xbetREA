package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37678a;
    public final String b;
    public final wxm c;
    public final String d;

    public vml0(String str, String str2, wxm wxmVar, String str3) {
        str.getClass();
        str3.getClass();
        this.f37678a = str;
        this.b = str2;
        this.c = wxmVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vml0)) {
            return false;
        }
        vml0 vml0Var = (vml0) obj;
        return Intrinsics.d(this.f37678a, vml0Var.f37678a) && this.b.equals(vml0Var.b) && this.c.equals(vml0Var.c) && Intrinsics.d(this.d, vml0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f37678a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f37678a, ", infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(", liveTag=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
