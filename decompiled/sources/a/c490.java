package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c490 implements q490 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3715a;
    public final String b;

    public c490(String str, String str2) {
        this.f3715a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c490)) {
            return false;
        }
        c490 c490Var = (c490) obj;
        return this.f3715a.equals(c490Var.f3715a) && this.b.equals(c490Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3715a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnDownload(url=", this.f3715a, ", mimeType=", this.b, Separators.RPAREN);
    }
}
