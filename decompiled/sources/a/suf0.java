package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class suf0 implements uuf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32817a;

    public suf0(String str) {
        this.f32817a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suf0) && this.f32817a.equals(((suf0) obj).f32817a);
    }

    public final int hashCode() {
        return this.f32817a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f32817a, Separators.RPAREN);
    }
}
