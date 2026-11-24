package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qy30 implements wy30 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy30)) {
            return false;
        }
        htz htzVar = iz30.f15618a;
        return true;
    }

    public final int hashCode() {
        return iz30.y.hashCode();
    }

    @Override // a.wy30
    public final iz30 m() {
        return iz30.y;
    }

    public final String toString() {
        return "OnEndCallClick(menuItemModel=" + iz30.y + Separators.RPAREN;
    }
}
