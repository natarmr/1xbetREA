package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f718a;
    public final String b;
    public final String c;
    public final String d;
    public final fks0 e;
    public final boolean f;

    public aea0(long j, String str, String str2, String str3, fks0 fks0Var, boolean z) {
        this.f718a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = fks0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aea0)) {
            return false;
        }
        aea0 aea0Var = (aea0) obj;
        return this.f718a == aea0Var.f718a && this.b.equals(aea0Var.b) && this.c.equals(aea0Var.c) && this.d.equals(aea0Var.d) && this.e == aea0Var.e && this.f == aea0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f718a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f718a, "PlayerTransfersTeamModel(feedId=", ", name=", this.b);
        f140.v(sbO, ", teamImageS3=", this.c, ", role=", this.d);
        sbO.append(", roleGroup=");
        sbO.append(this.e);
        sbO.append(", hasStat=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
