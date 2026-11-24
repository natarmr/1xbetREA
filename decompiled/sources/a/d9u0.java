package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5719a;

    public d9u0(String str) {
        this.f5719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9u0) && this.f5719a.equals(((d9u0) obj).f5719a);
    }

    public final int hashCode() {
        return this.f5719a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f5719a, Separators.RPAREN);
    }
}
