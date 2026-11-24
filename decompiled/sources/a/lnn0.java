package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lnn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20355a;
    public final float b;
    public final float c;
    public final float d;

    public lnn0(float f, float f2, float f3, float f4) {
        this.f20355a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnn0)) {
            return false;
        }
        lnn0 lnn0Var = (lnn0) obj;
        return Float.compare(this.f20355a, lnn0Var.f20355a) == 0 && Float.compare(this.b, lnn0Var.b) == 0 && Float.compare(this.c, lnn0Var.c) == 0 && Float.compare(this.d, lnn0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f20355a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f20355a, this.b, "ViewBox(left=", ", top=", ", right=");
        sbS.append(this.c);
        sbS.append(", bottom=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
