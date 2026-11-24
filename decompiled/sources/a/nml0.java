package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23779a;
    public final String b;
    public final wxm c;

    public nml0(String str, String str2, wxm wxmVar) {
        str.getClass();
        this.f23779a = str;
        this.b = str2;
        this.c = wxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nml0)) {
            return false;
        }
        nml0 nml0Var = (nml0) obj;
        return Intrinsics.d(this.f23779a, nml0Var.f23779a) && this.b.equals(nml0Var.b) && this.c.equals(nml0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f23779a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f23779a, ", infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
