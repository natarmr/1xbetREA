package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class osv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25801a;
    public final float b;
    public final float c;
    public final float d;

    public osv0(float f, float f2, float f3, float f4) {
        this.f25801a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osv0)) {
            return false;
        }
        osv0 osv0Var = (osv0) obj;
        return Float.compare(this.f25801a, osv0Var.f25801a) == 0 && Float.compare(this.b, osv0Var.b) == 0 && Float.compare(this.c, osv0Var.c) == 0 && Float.compare(this.d, osv0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f25801a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f25801a, this.b, "XBottomSheetBlockTransform(bottomPx=", ", middlePx=", ", topPx=");
        sbS.append(this.c);
        sbS.append(", handlePx=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
