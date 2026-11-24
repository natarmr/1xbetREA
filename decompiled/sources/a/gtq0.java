package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gtq0 implements htq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11893a;
    public final String b;

    public gtq0(String str, String str2) {
        this.f11893a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtq0)) {
            return false;
        }
        gtq0 gtq0Var = (gtq0) obj;
        return this.f11893a.equals(gtq0Var.f11893a) && this.b.equals(gtq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11893a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StopCalling(serviceName=", this.f11893a, ", action=", this.b, Separators.RPAREN);
    }
}
