package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x76 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40399a;
    public final String b;
    public final wxm c;

    public x76(String str, String str2, wxm wxmVar) {
        str.getClass();
        this.f40399a = str;
        this.b = str2;
        this.c = wxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x76)) {
            return false;
        }
        x76 x76Var = (x76) obj;
        return Intrinsics.d(this.f40399a, x76Var.f40399a) && this.b.equals(x76Var.b) && this.c.equals(x76Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f40399a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f40399a, ", infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
