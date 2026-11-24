package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xu7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41496a;
    public final String b;

    public xu7(String str, String str2) {
        this.f41496a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu7)) {
            return false;
        }
        xu7 xu7Var = (xu7) obj;
        return this.f41496a.equals(xu7Var.f41496a) && this.b.equals(xu7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41496a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorDialog(title=", this.f41496a, ", message=", this.b, Separators.RPAREN);
    }
}
