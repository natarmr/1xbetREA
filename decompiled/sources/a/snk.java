package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class snk implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnk f32498a;

    public final boolean equals(Object obj) {
        if (obj instanceof snk) {
            return this.f32498a == ((snk) obj).f32498a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32498a.hashCode();
    }

    public final String toString() {
        return "BannerType(value=" + this.f32498a + Separators.RPAREN;
    }
}
