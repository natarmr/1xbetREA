package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26952a;
    public final float b;
    public final float c;
    public final float d;

    public pge0(float f, float f2, float f3, float f4) {
        this.f26952a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pge0)) {
            return false;
        }
        pge0 pge0Var = (pge0) obj;
        return Float.compare(this.f26952a, pge0Var.f26952a) == 0 && Float.compare(this.b, pge0Var.b) == 0 && Float.compare(this.c, pge0Var.c) == 0 && Float.compare(this.d, pge0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f26952a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f26952a, this.b, "RectModel(left=", ", top=", ", right=");
        sbS.append(this.c);
        sbS.append(", bottom=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
