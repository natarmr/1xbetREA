package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w6c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38618a;
    public final String b;

    public w6c(String str, String str2) {
        this.f38618a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6c)) {
            return false;
        }
        w6c w6cVar = (w6c) obj;
        return this.f38618a.equals(w6cVar.f38618a) && this.b.equals(w6cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38618a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnTwoFactorAuthEnabled(resetHashResultKey=", this.f38618a, ", resetHashSecretKeyValue=", this.b, Separators.RPAREN);
    }
}
