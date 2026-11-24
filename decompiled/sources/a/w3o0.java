package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w3o0 implements x3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4i f38511a;

    public final boolean equals(Object obj) {
        if (obj instanceof w3o0) {
            return this.f38511a.equals(((w3o0) obj).f38511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38511a.hashCode();
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(model=" + this.f38511a + Separators.RPAREN;
    }
}
