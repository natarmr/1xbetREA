package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ulp0 implements xlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35885a;

    public final boolean equals(Object obj) {
        if (obj instanceof ulp0) {
            return this.f35885a.equals(((ulp0) obj).f35885a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35885a.hashCode();
    }

    public final String toString() {
        return hne.o("PlayerStatistics(value=", Separators.RPAREN, this.f35885a);
    }
}
