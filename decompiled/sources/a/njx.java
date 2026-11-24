package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class njx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23657a;
    public final String b;
    public final boolean c;
    public final fcq d;

    public njx(int i, String str, boolean z, fcq fcqVar) {
        this.f23657a = i;
        this.b = str;
        this.c = z;
        this.d = fcqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njx)) {
            return false;
        }
        njx njxVar = (njx) obj;
        return this.f23657a == njxVar.f23657a && this.b.equals(njxVar.b) && this.c == njxVar.c && this.d == njxVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Integer.hashCode(this.f23657a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f23657a, "InstrumentUiModel(id=", ", name=", this.b, ", isSelected=");
        sbR.append(this.c);
        sbR.append(", type=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
