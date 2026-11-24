package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l930 implements m930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19633a;

    public final boolean equals(Object obj) {
        if (obj instanceof l930) {
            return this.f19633a.equals(((l930) obj).f19633a);
        }
        return false;
    }

    @Override // a.m930
    public final String getDescription() {
        return this.f19633a;
    }

    public final int hashCode() {
        return this.f19633a.hashCode();
    }

    public final String toString() {
        return kng0.l("Info(description=", this.f19633a, Separators.RPAREN);
    }
}
