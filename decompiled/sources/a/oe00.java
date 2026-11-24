package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oe00 implements pe00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25099a;
    public final String b;

    public oe00(String str, String str2) {
        this.f25099a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe00)) {
            return false;
        }
        oe00 oe00Var = (oe00) obj;
        return this.f25099a.equals(oe00Var.f25099a) && this.b.equals(oe00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25099a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StopCalling(serviceName=", this.f25099a, ", action=", this.b, Separators.RPAREN);
    }
}
