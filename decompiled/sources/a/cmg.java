package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4602a;
    public final String b;

    public cmg(long j, String str) {
        this.f4602a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmg)) {
            return false;
        }
        cmg cmgVar = (cmg) obj;
        return this.f4602a == cmgVar.f4602a && this.b.equals(cmgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f4602a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4602a, "CyberDisciplineModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
