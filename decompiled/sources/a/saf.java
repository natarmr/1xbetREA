package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class saf implements bbf {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof saf);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.password_not_match_error);
    }

    public final String toString() {
        return ua80.e(R.string.password_not_match_error, "ErrorInputRepeatPassword(message=", Separators.RPAREN);
    }
}
