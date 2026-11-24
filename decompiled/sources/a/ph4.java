package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ph4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26978a;

    public ph4(int i) {
        this.f26978a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph4) && this.f26978a == ((ph4) obj).f26978a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26978a);
    }

    public final String toString() {
        return ua80.e(this.f26978a, "OnAuthEntryPointClick(typeByInt=", Separators.RPAREN);
    }
}
