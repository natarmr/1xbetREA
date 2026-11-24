package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ewp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f8538a;
    public final String b;
    public final String c;

    public ewp(n0x n0xVar, String str, String str2) {
        this.f8538a = n0xVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewp)) {
            return false;
        }
        ewp ewpVar = (ewp) obj;
        return this.f8538a.equals(ewpVar.f8538a) && this.b.equals(ewpVar.b) && this.c.equals(ewpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f8538a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FighterInfoUiModel(fighterPicture=");
        sb.append(this.f8538a);
        sb.append(", fighterName=");
        sb.append(this.b);
        sb.append(", fighterStatistics=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
