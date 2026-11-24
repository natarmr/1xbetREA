package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ox80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26000a;
    public final n0x b;
    public final m0x c;
    public final boolean d;
    public final String e;

    public ox80(String str, n0x n0xVar, m0x m0xVar, boolean z, String str2) {
        this.f26000a = str;
        this.b = n0xVar;
        this.c = m0xVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox80)) {
            return false;
        }
        ox80 ox80Var = (ox80) obj;
        return this.f26000a.equals(ox80Var.f26000a) && this.b.equals(ox80Var.b) && this.c.equals(ox80Var.c) && this.d == ox80Var.d && this.e.equals(ox80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(cs0.a(this.c, f140.f(this.b, this.f26000a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerTeamAnnounceTeamUiModel(teamName=");
        sb.append(this.f26000a);
        sb.append(", teamImage=");
        sb.append(this.b);
        sb.append(", teamPlaceholder=");
        sb.append(this.c);
        sb.append(", partner=");
        sb.append(this.d);
        sb.append(", teamCoef=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
