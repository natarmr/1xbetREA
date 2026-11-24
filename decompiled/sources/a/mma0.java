package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mma0 implements oma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22028a;

    public mma0(String str) {
        this.f22028a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mma0) && this.f22028a.equals(((mma0) obj).f22028a);
    }

    public final int hashCode() {
        return this.f22028a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFilterDialog(teamId=", this.f22028a, Separators.RPAREN);
    }
}
