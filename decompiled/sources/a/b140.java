package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b140 implements c140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1790a;
    public final String b;

    public b140(String str, String str2) {
        this.f1790a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b140)) {
            return false;
        }
        b140 b140Var = (b140) obj;
        return this.f1790a.equals(b140Var.f1790a) && this.b.equals(b140Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1790a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StopCalling(serviceName=", this.f1790a, ", action=", this.b, Separators.RPAREN);
    }
}
