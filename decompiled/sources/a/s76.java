package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s76 implements t76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4i f31734a;

    public final boolean equals(Object obj) {
        if (obj instanceof s76) {
            return this.f31734a.equals(((s76) obj).f31734a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31734a.hashCode();
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(model=" + this.f31734a + Separators.RPAREN;
    }
}
