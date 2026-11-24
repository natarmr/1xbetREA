package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eqh0 implements iqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8237a;
    public final String b;
    public final boolean c;
    public final float d;
    public final int e;
    public final int f;
    public final d4d g;

    public eqh0(String str, String str2, boolean z, float f, int i, int i2, d4d d4dVar) {
        this.f8237a = str;
        this.b = str2;
        this.c = z;
        this.d = f;
        this.e = i;
        this.f = i2;
        this.g = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqh0)) {
            return false;
        }
        eqh0 eqh0Var = (eqh0) obj;
        return this.f8237a.equals(eqh0Var.f8237a) && this.b.equals(eqh0Var.b) && this.c == eqh0Var.c && Float.compare(this.d, eqh0Var.d) == 0 && this.e == eqh0Var.e && this.f == eqh0Var.f && this.g == eqh0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, twn.a(this.e, defpackage.c.a(brm0.e(ua80.b(this.f8237a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Progress(title=", this.f8237a, ", description=", this.b, ", descriptionVisible=");
        sbN.append(this.c);
        sbN.append(", progressBarValue=");
        sbN.append(this.d);
        sbN.append(", currentProgress=");
        axq.r(this.e, this.f, ", completeProgress=", ", progressColor=", sbN);
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
