package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class mu20 implements qu20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22394a;
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public mu20(ArrayList arrayList, long j, String str, boolean z, boolean z2) {
        this.f22394a = arrayList;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    @Override // a.qu20
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu20)) {
            return false;
        }
        mu20 mu20Var = (mu20) obj;
        return this.f22394a.equals(mu20Var.f22394a) && this.b == mu20Var.b && this.c.equals(mu20Var.c) && this.d == mu20Var.d && this.e == mu20Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(rw2.b(this.f22394a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Duel(eventBets=");
        sb.append(this.f22394a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        w6x.z(", marketGroupName=", this.c, ", hasSpecialSign=", sb, this.d);
        return f140.n(sb, ", expanded=", this.e, Separators.RPAREN);
    }
}
