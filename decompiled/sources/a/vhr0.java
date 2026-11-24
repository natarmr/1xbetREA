package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vhr0 implements xhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37445a;

    public vhr0(String str) {
        this.f37445a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhr0) && this.f37445a.equals(((vhr0) obj).f37445a);
    }

    public final int hashCode() {
        return this.f37445a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f37445a, Separators.RPAREN);
    }
}
