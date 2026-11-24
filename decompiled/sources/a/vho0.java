package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vho0 implements who0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37441a;
    public final String b;

    public vho0(String str, String str2) {
        this.f37441a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vho0)) {
            return false;
        }
        vho0 vho0Var = (vho0) obj;
        return this.f37441a.equals(vho0Var.f37441a) && this.b.equals(vho0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37441a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StopCalling(serviceName=", this.f37441a, ", action=", this.b, Separators.RPAREN);
    }
}
