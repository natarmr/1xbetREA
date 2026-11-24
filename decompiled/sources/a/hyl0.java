package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hyl0 implements iyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13864a;

    public hyl0(String str) {
        this.f13864a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyl0) && this.f13864a.equals(((hyl0) obj).f13864a);
    }

    public final int hashCode() {
        return this.f13864a.hashCode();
    }

    public final String toString() {
        return kng0.l("Text(text=", this.f13864a, Separators.RPAREN);
    }
}
