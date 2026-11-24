package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f490 implements q490 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8903a;
    public final String b;
    public final String c;

    public f490(int i, String str, String str2) {
        this.f8903a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f490)) {
            return false;
        }
        f490 f490Var = (f490) obj;
        return this.f8903a == f490Var.f8903a && this.b.equals(f490Var.b) && this.c.equals(f490Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f8903a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f8903a, "OnLaunchSocial(resId=", ", appPackageName=", this.b, ", uri="), this.c, Separators.RPAREN);
    }
}
