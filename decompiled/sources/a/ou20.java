package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ou20 implements qu20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25856a;
    public final long b;
    public final String c;
    public final boolean d;
    public final f07 e;
    public final boolean f;
    public final boolean g;

    public ou20(List list, long j, String str, boolean z, f07 f07Var, boolean z2, boolean z3) {
        this.f25856a = list;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = f07Var;
        this.f = z2;
        this.g = z3;
    }

    @Override // a.qu20
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou20)) {
            return false;
        }
        ou20 ou20Var = (ou20) obj;
        return this.f25856a.equals(ou20Var.f25856a) && this.b == ou20Var.b && this.c.equals(ou20Var.c) && this.d == ou20Var.d && this.e == ou20Var.e && this.f == ou20Var.f && this.g == ou20Var.g;
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(rw2.b(this.f25856a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        f07 f07Var = this.e;
        return Boolean.hashCode(this.g) + brm0.e((iE + (f07Var == null ? 0 : f07Var.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubGame(eventBets=");
        sb.append(this.f25856a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        w6x.z(", marketGroupName=", this.c, ", hasSpecialSign=", sb, this.d);
        sb.append(", infoType=");
        sb.append(this.e);
        sb.append(", expanded=");
        sb.append(this.f);
        return f140.n(sb, ", pinned=", this.g, Separators.RPAREN);
    }
}
