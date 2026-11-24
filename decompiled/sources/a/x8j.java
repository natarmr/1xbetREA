package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class x8j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40464a;

    public final boolean equals(Object obj) {
        if (obj instanceof x8j) {
            return this.f40464a.equals(((x8j) obj).f40464a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40464a.hashCode();
    }

    public final String toString() {
        return hne.o("FirstPlayerThrows(value=", Separators.RPAREN, this.f40464a);
    }
}
