package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jcd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16271a;

    public jcd0(String str) {
        this.f16271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcd0) && this.f16271a.equals(((jcd0) obj).f16271a);
    }

    public final int hashCode() {
        return this.f16271a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromoWeb(url=", this.f16271a, Separators.RPAREN);
    }
}
