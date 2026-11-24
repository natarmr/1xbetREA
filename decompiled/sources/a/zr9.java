package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zr9 implements as9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44842a;

    public zr9(String str) {
        this.f44842a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr9) && this.f44842a.equals(((zr9) obj).f44842a);
    }

    public final int hashCode() {
        return this.f44842a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowRequestCanceledSnackBar(message=", this.f44842a, Separators.RPAREN);
    }
}
