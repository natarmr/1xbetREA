package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class h3j {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h3j);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.daily_task_update_error);
    }

    public final String toString() {
        return ua80.e(R.string.daily_task_update_error, "Error(error=", Separators.RPAREN);
    }
}
