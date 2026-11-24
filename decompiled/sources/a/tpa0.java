package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tpa0 implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34322a;
    public final rqm b;
    public final rqm c;
    public final boolean d;

    public tpa0(String str, rqm rqmVar, rqm rqmVar2, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f34322a = str;
        this.b = rqmVar;
        this.c = rqmVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpa0)) {
            return false;
        }
        tpa0 tpa0Var = (tpa0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f34322a.equals(tpa0Var.f34322a) && this.b.equals(tpa0Var.b) && this.c.equals(tpa0Var.c) && this.d == tpa0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + ua80.b(u0f0.Z.hashCode() * 31, 31, this.f34322a)) * 31)) * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.Z;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.Z;
        StringBuilder sb = new StringBuilder("PoliticalExposedPersonFieldUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", description=");
        sb.append(this.f34322a);
        sb.append(", positiveCellStyle=");
        sb.append(this.b);
        sb.append(", negativeCellStyle=");
        sb.append(this.c);
        sb.append(", isError=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
