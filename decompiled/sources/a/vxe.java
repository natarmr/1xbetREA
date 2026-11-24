package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vxe implements bye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38194a;

    public vxe(String str) {
        this.f38194a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxe) && this.f38194a.equals(((vxe) obj).f38194a);
    }

    public final int hashCode() {
        return this.f38194a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(systemTypeText=", this.f38194a, Separators.RPAREN);
    }
}
