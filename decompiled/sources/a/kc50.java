package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18043a;
    public final boolean b;

    public kc50(int i, boolean z) {
        this.f18043a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc50)) {
            return false;
        }
        kc50 kc50Var = (kc50) obj;
        return this.f18043a == kc50Var.f18043a && this.b == kc50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f18043a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f18043a, "NavigationBarItemUiModel(iconRes=", ", isSelected=", Separators.RPAREN, this.b);
    }
}
