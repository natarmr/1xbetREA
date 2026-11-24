package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t890 implements c990 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33504a;

    public t890(String str) {
        this.f33504a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t890) && this.f33504a.equals(((t890) obj).f33504a);
    }

    public final int hashCode() {
        return this.f33504a.hashCode();
    }

    public final String toString() {
        return kng0.l("InsertPushCode(code=", this.f33504a, Separators.RPAREN);
    }
}
