package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9814a;
    public final String b;
    public final int c;
    public final int d;

    public fn4(int i, String str, int i2, String str2) {
        this.f9814a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn4)) {
            return false;
        }
        fn4 fn4Var = (fn4) obj;
        return this.f9814a.equals(fn4Var.f9814a) && this.b.equals(fn4Var.b) && this.c == fn4Var.c && this.d == fn4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(this.f9814a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", bigPicture=", Separators.RPAREN, b1j.n("NotificationResources(title=", this.f9814a, ", message=", this.b, ", largeIcon="));
    }
}
