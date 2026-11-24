package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x4t0 implements d5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40283a;

    public x4t0(String str) {
        this.f40283a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4t0) && this.f40283a.equals(((x4t0) obj).f40283a);
    }

    public final int hashCode() {
        return this.f40283a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHeadToHeadCardClick(statId=", this.f40283a, Separators.RPAREN);
    }
}
