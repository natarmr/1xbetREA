package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class a9b implements e9b {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a9b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.dimen.size_36) + (Integer.hashCode(R.dimen.size_32) * 31);
    }

    public final String toString() {
        return ohs0.m("Rectangle(height=", R.dimen.size_32, ", width=", Separators.RPAREN, R.dimen.size_36);
    }
}
