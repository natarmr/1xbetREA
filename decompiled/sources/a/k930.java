package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k930 implements m930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17899a;

    public final boolean equals(Object obj) {
        if (obj instanceof k930) {
            return this.f17899a.equals(((k930) obj).f17899a);
        }
        return false;
    }

    @Override // a.m930
    public final String getDescription() {
        return this.f17899a;
    }

    public final int hashCode() {
        return this.f17899a.hashCode();
    }

    public final String toString() {
        return kng0.l("Broadcasting(description=", this.f17899a, Separators.RPAREN);
    }
}
