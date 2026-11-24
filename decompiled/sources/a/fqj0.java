package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class fqj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9977a;
    public final float b;
    public final ghn c;
    public final a4x d;
    public final long e;
    public final zqm f;

    public fqj0(float f, float f2, ghn ghnVar, a4x a4xVar, long j, zqm zqmVar) {
        kkf0 kkf0Var = kkf0.f18436a;
        this.f9977a = f;
        this.b = f2;
        this.c = ghnVar;
        this.d = a4xVar;
        this.e = j;
        this.f = zqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqj0)) {
            return false;
        }
        fqj0 fqj0Var = (fqj0) obj;
        if (Float.compare(this.f9977a, fqj0Var.f9977a) != 0 || Float.compare(this.b, fqj0Var.b) != 0 || !this.c.equals(fqj0Var.c)) {
            return false;
        }
        kkf0 kkf0Var = kkf0.f18436a;
        if (!this.d.equals(fqj0Var.d)) {
            return false;
        }
        long j = fqj0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && this.f.equals(fqj0Var.f);
    }

    public final int hashCode() {
        int iB = cs0.b(this.d, twn.a(Response.OK, twn.a(2500, (kkf0.f18436a.hashCode() + ((this.c.hashCode() + defpackage.c.a(Float.hashCode(this.f9977a) * 31, this.b, 31)) * 31)) * 31, 31), 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + rw2.b(iB, 31, this.e);
    }

    public final String toString() {
        kkf0 kkf0Var = kkf0.f18436a;
        String strI = y3d.i(this.e);
        StringBuilder sbS = dw9.s(this.f9977a, this.b, "ShimmerConfig(animationInitialValue=", ", animationTargetValue=", ", animationEasing=");
        sbS.append(this.c);
        sbS.append(", animationRepeatMode=");
        sbS.append(kkf0Var);
        sbS.append(", animationDuration=2500, animationDelay=200, effectColors=");
        sbS.append(this.d);
        sbS.append(", contentBackgroundColor=");
        sbS.append(strI);
        sbS.append(", effectDirection=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
