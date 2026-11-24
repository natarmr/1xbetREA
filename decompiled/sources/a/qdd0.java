package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28530a;
    public final String b;

    public qdd0(String str, String str2) {
        this.f28530a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdd0)) {
            return false;
        }
        qdd0 qdd0Var = (qdd0) obj;
        return this.f28530a.equals(qdd0Var.f28530a) && this.b.equals(qdd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28530a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PushCaptcha(id=", this.f28530a, ", key=", this.b, Separators.RPAREN);
    }
}
