package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ia70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14424a;
    public final boolean b;
    public final csr c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ia70(boolean z, boolean z2, csr csrVar, boolean z3, boolean z4, boolean z5, boolean z6) {
        csrVar.getClass();
        this.f14424a = z;
        this.b = z2;
        this.c = csrVar;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia70)) {
            return false;
        }
        ia70 ia70Var = (ia70) obj;
        return this.f14424a == ia70Var.f14424a && this.b == ia70Var.b && Intrinsics.d(this.c, ia70Var.c) && this.d == ia70Var.d && this.e == ia70Var.e && this.f == ia70Var.f && this.g == ia70Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.e((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f14424a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OneXGamesWebGameNavBarState(bonusButtonAvailable=", ", demoButtonAvailable=", ", activeBonus=", this.f14424a, this.b);
        sbQ.append(this.c);
        sbQ.append(", connected=");
        sbQ.append(this.d);
        sbQ.append(", gameStarted=");
        ua80.u(", gameLoaded=", ", demoEnabled=", sbQ, this.e, this.f);
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
