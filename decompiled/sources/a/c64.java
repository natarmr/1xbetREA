package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c64 implements e64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3801a;

    public c64(int i) {
        this.f3801a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c64) && this.f3801a == ((c64) obj).f3801a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3801a);
    }

    public final String toString() {
        return ua80.e(this.f3801a, "ChooseEntryPoint(typeByInt=", Separators.RPAREN);
    }
}
