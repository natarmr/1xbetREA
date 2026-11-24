package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gqu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11751a;

    public gqu0(String str) {
        this.f11751a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqu0) && this.f11751a.equals(((gqu0) obj).f11751a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f11751a;
    }

    public final int hashCode() {
        return this.f11751a.hashCode();
    }

    public final String toString() {
        return kng0.l("VirtualGameDisciplineShimmerUiModel(key=", this.f11751a, Separators.RPAREN);
    }
}
