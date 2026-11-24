package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zzo extends b0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45264a;

    public zzo(String str) {
        this.f45264a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzo) && this.f45264a.equals(((zzo) obj).f45264a);
    }

    public final int hashCode() {
        return this.f45264a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f45264a, Separators.RPAREN);
    }
}
