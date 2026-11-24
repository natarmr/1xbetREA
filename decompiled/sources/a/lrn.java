package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lrn implements mrn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20541a;

    public lrn(String str) {
        this.f20541a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrn) && this.f20541a.equals(((lrn) obj).f20541a);
    }

    public final int hashCode() {
        return this.f20541a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnack(message=", this.f20541a, Separators.RPAREN);
    }
}
