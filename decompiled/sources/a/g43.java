package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10643a;
    public final float b;
    public final float c;

    public g43(float f, float f2, float f3) {
        this.f10643a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g43)) {
            return false;
        }
        g43 g43Var = (g43) obj;
        return Float.compare(this.f10643a, g43Var.f10643a) == 0 && Float.compare(this.b, g43Var.b) == 0 && Float.compare(this.c, g43Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f10643a) * 31, this.b, 31);
    }

    public final String toString() {
        return kng0.o(dw9.s(this.f10643a, this.b, "AnimatedCardState(alpha=", ", x=", ", y="), this.c, Separators.RPAREN);
    }
}
