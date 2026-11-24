package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class k90 extends l90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17894a;
    public final float b;
    public final float c;

    public k90(float f, float f2, boolean z) {
        this.f17894a = z;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj;
        return this.f17894a == k90Var.f17894a && Float.compare(this.b, k90Var.b) == 0 && Float.compare(this.c, k90Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Boolean.hashCode(this.f17894a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinRoulette(spin=");
        sb.append(this.f17894a);
        sb.append(", degreeResult=");
        sb.append(this.b);
        sb.append(", sectorOffset=");
        return kng0.o(sb, this.c, Separators.RPAREN);
    }
}
