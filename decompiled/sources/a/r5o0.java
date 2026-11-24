package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r5o0 implements s5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4i f29898a;

    public final boolean equals(Object obj) {
        if (obj instanceof r5o0) {
            return this.f29898a.equals(((r5o0) obj).f29898a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29898a.hashCode();
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(model=" + this.f29898a + Separators.RPAREN;
    }
}
