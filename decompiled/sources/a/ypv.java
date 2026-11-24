package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ypv implements owl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43050a;

    public ypv(String str) {
        this.f43050a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypv) && this.f43050a.equals(((ypv) obj).f43050a);
    }

    public final int hashCode() {
        return this.f43050a.hashCode();
    }

    public final String toString() {
        return kng0.l("Header(text=", this.f43050a, Separators.RPAREN);
    }
}
