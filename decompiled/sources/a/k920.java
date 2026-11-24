package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k920 implements p920 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17897a;

    public k920(String str) {
        this.f17897a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k920) && this.f17897a.equals(((k920) obj).f17897a);
    }

    public final int hashCode() {
        return this.f17897a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(message=", this.f17897a, Separators.RPAREN);
    }
}
