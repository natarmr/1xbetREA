package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vz10 implements zz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38277a;

    public vz10(String str) {
        this.f38277a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz10) && this.f38277a.equals(((vz10) obj).f38277a);
    }

    public final int hashCode() {
        return this.f38277a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowAppInfoDialog(appInfo=", this.f38277a, Separators.RPAREN);
    }
}
