package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zir0 implements bjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44452a;

    public zir0(String str) {
        this.f44452a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zir0) && this.f44452a.equals(((zir0) obj).f44452a);
    }

    public final int hashCode() {
        return this.f44452a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f44452a, Separators.RPAREN);
    }
}
