package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ibm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14494a;
    public final n0x b;
    public final hbm c;
    public final String d;
    public final boolean e;

    public ibm(String str, n0x n0xVar, hbm hbmVar, String str2, boolean z) {
        this.f14494a = str;
        this.b = n0xVar;
        this.c = hbmVar;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibm)) {
            return false;
        }
        ibm ibmVar = (ibm) obj;
        return this.f14494a.equals(ibmVar.f14494a) && this.b.equals(ibmVar.b) && this.c.equals(ibmVar.c) && this.d.equals(ibmVar.d) && this.e == ibmVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b((this.c.hashCode() + f140.f(this.b, this.f14494a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberTeamLineupPlayerUiModel(id=");
        sb.append(this.f14494a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", iconModel=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", active=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
