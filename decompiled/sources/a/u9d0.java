package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35279a;

    public u9d0(String str) {
        this.f35279a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9d0) && this.f35279a.equals(((u9d0) obj).f35279a);
    }

    public final int hashCode() {
        return this.f35279a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetsOnYour(screenType=", this.f35279a, Separators.RPAREN);
    }
}
