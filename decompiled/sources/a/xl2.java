package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xl2 implements yl2 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl2)) {
            return false;
        }
        vcp vcpVar = vcp.Classic;
        return true;
    }

    public final int hashCode() {
        return vcp.CategoryImageHeader.hashCode();
    }

    public final String toString() {
        return "OnSelectedSportTab(favoriteStyle=" + vcp.CategoryImageHeader + Separators.RPAREN;
    }
}
