package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dgo0 implements ego0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6052a;
    public final String b;

    public dgo0(String str, String str2) {
        this.f6052a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgo0)) {
            return false;
        }
        dgo0 dgo0Var = (dgo0) obj;
        return this.f6052a.equals(dgo0Var.f6052a) && this.b.equals(dgo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6052a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StopCalling(serviceName=", this.f6052a, ", action=", this.b, Separators.RPAREN);
    }
}
