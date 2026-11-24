package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class voh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f37766a;
    public final String b;
    public final String c;

    public voh(n0x n0xVar, String str, String str2) {
        this.f37766a = n0xVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voh)) {
            return false;
        }
        voh vohVar = (voh) obj;
        return this.f37766a.equals(vohVar.f37766a) && this.b.equals(vohVar.b) && this.c.equals(vohVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f37766a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberUFCStadiumTopInfoUiModel(flagImageLink=");
        sb.append(this.f37766a);
        sb.append(", stadiumLabel=");
        sb.append(this.b);
        sb.append(", addressLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
