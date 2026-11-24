package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xn3 implements yn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41152a;

    public xn3(String str) {
        this.f41152a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn3) && this.f41152a.equals(((xn3) obj).f41152a);
    }

    public final int hashCode() {
        return this.f41152a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenLink(link=", this.f41152a, Separators.RPAREN);
    }
}
