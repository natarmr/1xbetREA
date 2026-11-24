package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zbg extends bcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44113a;
    public final long b;
    public final zrm c;
    public final g3l0 d;

    public zbg(String str, long j, zrm zrmVar, g3l0 g3l0Var) {
        this.f44113a = str;
        this.b = j;
        this.c = zrmVar;
        this.d = g3l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbg)) {
            return false;
        }
        zbg zbgVar = (zbg) obj;
        return this.f44113a.equals(zbgVar.f44113a) && this.b == zbgVar.b && this.c.equals(zbgVar.c) && this.d.equals(zbgVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44113a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f44113a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Content(key=", this.f44113a, ", id=");
        sbO.append(", sportCellStyle=");
        sbO.append(this.c);
        sbO.append(", sportCellRightStyle=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
