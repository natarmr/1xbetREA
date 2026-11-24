package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ymm0 implements cnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3i f42898a;

    public final boolean equals(Object obj) {
        if (obj instanceof ymm0) {
            return this.f42898a.equals(((ymm0) obj).f42898a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42898a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(model=" + this.f42898a + Separators.RPAREN;
    }
}
