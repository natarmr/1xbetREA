package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u990 implements ea90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35273a;
    public final String b;

    public u990(String str, String str2) {
        this.f35273a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u990)) {
            return false;
        }
        u990 u990Var = (u990) obj;
        return this.f35273a.equals(u990Var.f35273a) && this.b.equals(u990Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35273a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnDownload(url=", this.f35273a, ", mimeType=", this.b, Separators.RPAREN);
    }
}
