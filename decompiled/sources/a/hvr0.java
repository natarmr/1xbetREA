package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hvr0 implements ivr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13739a;

    public hvr0(int i) {
        this.f13739a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvr0) && this.f13739a == ((hvr0) obj).f13739a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13739a);
    }

    public final String toString() {
        return ua80.e(this.f13739a, "SetTotoBetType(typeId=", Separators.RPAREN);
    }
}
