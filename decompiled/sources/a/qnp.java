package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qnp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ysv f29041a;
    public final dhq0 b;
    public final f9h0 c;
    public final boolean d;
    public final j700 e;
    public final long f;
    public final a4x g;

    public qnp(ysv ysvVar, dhq0 dhq0Var, f9h0 f9h0Var, boolean z, j700 j700Var, long j, a4x a4xVar) {
        j700Var.getClass();
        a4xVar.getClass();
        this.f29041a = ysvVar;
        this.b = dhq0Var;
        this.c = f9h0Var;
        this.d = z;
        this.e = j700Var;
        this.f = j;
        this.g = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnp)) {
            return false;
        }
        qnp qnpVar = (qnp) obj;
        if (!this.f29041a.equals(qnpVar.f29041a) || !this.b.equals(qnpVar.b) || !this.c.equals(qnpVar.c) || this.d != qnpVar.d || this.e != qnpVar.e) {
            return false;
        }
        long j = qnpVar.f;
        int i = y3d.h;
        return h2t0.a(this.f, j) && Intrinsics.d(this.g, qnpVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f29041a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.g.hashCode() + rw2.b(iHashCode, 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sb = new StringBuilder("FeedsComposeScreenUiState(headerUiState=");
        sb.append(this.f29041a);
        sb.append(", timeFilterChipsUiState=");
        sb.append(this.b);
        sb.append(", screenState=");
        sb.append(this.c);
        sb.append(", alwaysLightStatusBar=");
        sb.append(this.d);
        sb.append(", currentScreenType=");
        sb.append(this.e);
        sb.append(", backgroundColor=");
        sb.append(strI);
        sb.append(", initIds=");
        return cs0.n(sb, this.g, Separators.RPAREN);
    }
}
