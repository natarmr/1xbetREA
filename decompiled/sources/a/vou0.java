package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vou0 implements cpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37783a;

    public vou0(int i) {
        this.f37783a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vou0) && this.f37783a == ((vou0) obj).f37783a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37783a);
    }

    public final String toString() {
        return ua80.e(this.f37783a, "OnDisciplineClick(id=", Separators.RPAREN);
    }
}
