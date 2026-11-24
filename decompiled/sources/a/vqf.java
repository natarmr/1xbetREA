package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vqf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37853a;

    public final boolean equals(Object obj) {
        if (obj instanceof vqf) {
            return this.f37853a == ((vqf) obj).f37853a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37853a);
    }

    public final String toString() {
        return ua80.e(this.f37853a, "CounterTerroristsWinMethodIcon(value=", Separators.RPAREN);
    }
}
