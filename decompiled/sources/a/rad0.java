package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30130a;

    public rad0(String str) {
        this.f30130a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rad0) && this.f30130a.equals(((rad0) obj).f30130a);
    }

    public final int hashCode() {
        return this.f30130a.hashCode();
    }

    public final String toString() {
        return kng0.l("DeepLink(url=", this.f30130a, Separators.RPAREN);
    }
}
