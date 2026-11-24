package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class isl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15309a;
    public final float b;
    public final float c;
    public final float d;

    public isl(float f, float f2, float f3, float f4) {
        this.f15309a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isl)) {
            return false;
        }
        isl islVar = (isl) obj;
        return Float.compare(this.f15309a, islVar.f15309a) == 0 && Float.compare(this.b, islVar.b) == 0 && Float.compare(this.c, islVar.c) == 0 && Float.compare(this.d, islVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f15309a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f15309a, this.b, "DsArrowValues(rotation=", ", startAngle=", ", endAngle=");
        sbS.append(this.c);
        sbS.append(", scale=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
