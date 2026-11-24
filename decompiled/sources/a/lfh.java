package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lfh implements nfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19955a;

    public final boolean equals(Object obj) {
        if (obj instanceof lfh) {
            return this.f19955a.equals(((lfh) obj).f19955a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19955a.hashCode();
    }

    public final String toString() {
        return hne.o("Headers(value=", Separators.RPAREN, this.f19955a);
    }
}
