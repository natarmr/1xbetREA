package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ldp0 implements sdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f19863a;
    public final String b;
    public final ty c;

    public ldp0(g5a0 g5a0Var, String str, ty tyVar) {
        str.getClass();
        this.f19863a = g5a0Var;
        this.b = str;
        this.c = tyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldp0)) {
            return false;
        }
        ldp0 ldp0Var = (ldp0) obj;
        return this.f19863a.equals(ldp0Var.f19863a) && Intrinsics.d(this.b, ldp0Var.b) && this.c.equals(ldp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f19863a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Football(playerLogo=" + this.f19863a + ", name=" + this.b + ", additionalInfo=" + this.c + Separators.RPAREN;
    }
}
