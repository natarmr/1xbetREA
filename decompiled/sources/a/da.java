package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class da implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5723a;
    public final String b;

    public da(String str, String str2) {
        this.f5723a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return this.f5723a.equals(daVar.f5723a) && this.b.equals(daVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5723a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StopCalling(serviceName=", this.f5723a, ", action=", this.b, Separators.RPAREN);
    }
}
