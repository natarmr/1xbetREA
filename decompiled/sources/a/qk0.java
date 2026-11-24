package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qk0 implements tk0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qk0);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.connection_error);
    }

    public final String toString() {
        return ua80.e(R.string.connection_error, "ConnectionError(message=", Separators.RPAREN);
    }
}
