package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class nu20 implements qu20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24128a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final long g;

    public nu20(ArrayList arrayList, long j, String str, String str2, boolean z, String str3, long j2) {
        this.f24128a = arrayList;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = j2;
    }

    @Override // a.qu20
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu20)) {
            return false;
        }
        nu20 nu20Var = (nu20) obj;
        return this.f24128a.equals(nu20Var.f24128a) && this.b == nu20Var.b && this.c.equals(nu20Var.c) && this.d.equals(nu20Var.d) && this.e == nu20Var.e && this.f.equals(nu20Var.f) && this.g == nu20Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(rw2.b(this.f24128a.hashCode() * 31, 31, this.b), 31, this.c), 31, false), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insight(eventBets=");
        sb.append(this.f24128a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        f140.v(sb, ", marketGroupName=", this.c, ", hasSpecialSign=false, marketGroupDescription=", this.d);
        hne.u(", expanded=", ", subGameName=", this.f, sb, this.e);
        return rw2.n(sb, this.g, ", subGameId=", Separators.RPAREN);
    }
}
