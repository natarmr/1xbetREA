package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tfd0 implements xfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33859a;

    public tfd0(String str) {
        this.f33859a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfd0) && this.f33859a.equals(((tfd0) obj).f33859a);
    }

    public final int hashCode() {
        return this.f33859a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f33859a, Separators.RPAREN);
    }
}
