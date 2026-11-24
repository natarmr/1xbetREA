package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mgf0 implements ogf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21740a;

    public mgf0(String str) {
        this.f21740a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgf0) && this.f21740a.equals(((mgf0) obj).f21740a);
    }

    public final int hashCode() {
        return this.f21740a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowChangeValueDialog(key=", this.f21740a, Separators.RPAREN);
    }
}
