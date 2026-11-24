package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yi00 implements aj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42663a;

    public yi00(int i) {
        this.f42663a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi00) && this.f42663a == ((yi00) obj).f42663a;
    }

    @Override // a.aj00
    public final int getId() {
        return this.f42663a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42663a);
    }

    public final String toString() {
        return ua80.e(this.f42663a, "Other(id=", Separators.RPAREN);
    }
}
