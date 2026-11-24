package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dup0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6708a;
    public final String b;

    public dup0(String str, String str2) {
        this.f6708a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dup0)) {
            return false;
        }
        dup0 dup0Var = (dup0) obj;
        return this.f6708a.equals(dup0Var.f6708a) && this.b.equals(dup0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6708a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TelegramAuthorizationModel(code=", this.f6708a, ", link=", this.b, Separators.RPAREN);
    }
}
