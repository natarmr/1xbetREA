package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t990 implements ea90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33551a;
    public final String b;
    public final String c;

    public t990(int i, String str, String str2) {
        this.f33551a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t990)) {
            return false;
        }
        t990 t990Var = (t990) obj;
        return this.f33551a == t990Var.f33551a && this.b.equals(t990Var.b) && this.c.equals(t990Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f33551a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f33551a, "LaunchSocial(resId=", ", appPackageName=", this.b, ", uri="), this.c, Separators.RPAREN);
    }
}
