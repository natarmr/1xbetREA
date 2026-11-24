package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pt4 implements tt4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27546a;

    public pt4(String str) {
        this.f27546a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt4) && this.f27546a.equals(((pt4) obj).f27546a);
    }

    public final int hashCode() {
        return this.f27546a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f27546a, Separators.RPAREN);
    }
}
