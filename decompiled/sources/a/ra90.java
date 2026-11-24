package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ra90 implements ta90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lun f30124a;
    public final boolean b;
    public final boolean c;
    public final float d;

    public ra90(lun lunVar, boolean z, boolean z2, float f) {
        this.f30124a = lunVar;
        this.b = z;
        this.c = z2;
        this.d = f;
    }

    @Override // a.ta90
    public final boolean a() {
        return this.b;
    }

    @Override // a.ta90
    public final float b() {
        return this.d;
    }

    @Override // a.ta90
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra90)) {
            return false;
        }
        ra90 ra90Var = (ra90) obj;
        return this.f30124a.equals(ra90Var.f30124a) && this.b == ra90Var.b && this.c == ra90Var.c && Float.compare(this.d, ra90Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + brm0.e(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "ErrorData(url=, extraHeaders=" + this.f30124a + ", reloadEnable=" + this.b + ", deposit=" + this.c + ", reloadButtonAlpha=" + this.d + Separators.RPAREN;
    }
}
