package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6358a;
    public final byte b;
    public final float c;
    public final float d;

    /* JADX WARN: Multi-variable type inference failed */
    public dna(float f, float f2, float f3, int i) {
        this.f6358a = f;
        this.b = i;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dna)) {
            return false;
        }
        dna dnaVar = (dna) obj;
        return ycl.b(this.f6358a, dnaVar.f6358a) && this.b == dnaVar.b && Float.compare(this.c, dnaVar.c) == 0 && Float.compare(this.d, dnaVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(twn.a(this.b, Float.hashCode(this.f6358a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CardRowConfig(spaceBetween=", ycl.c(this.f6358a), ", cardIndex=", ", startX=");
        sbP.append(this.c);
        sbP.append(", startY=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
