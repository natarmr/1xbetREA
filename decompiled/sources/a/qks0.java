package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28901a;
    public final String b;
    public final String c;
    public final String d;
    public final fks0 e;
    public final boolean f;

    public qks0(long j, String str, String str2, String str3, fks0 fks0Var, boolean z) {
        this.f28901a = j;
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
        if (!(obj instanceof qks0)) {
            return false;
        }
        qks0 qks0Var = (qks0) obj;
        return this.f28901a == qks0Var.f28901a && this.b.equals(qks0Var.b) && this.c.equals(qks0Var.c) && this.d.equals(qks0Var.d) && this.e == qks0Var.e && this.f == qks0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f28901a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28901a, "TransfersTeamModel(feedId=", ", name=", this.b);
        f140.v(sbO, ", image=", this.c, ", role=", this.d);
        sbO.append(", roleGroup=");
        sbO.append(this.e);
        sbO.append(", hasStat=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
