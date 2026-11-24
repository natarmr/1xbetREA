package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zdh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44215a;

    public final boolean equals(Object obj) {
        if (obj instanceof zdh0) {
            return this.f44215a.equals(((zdh0) obj).f44215a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44215a.hashCode();
    }

    public final String toString() {
        return hne.o("PlayerOneShips(value=", Separators.RPAREN, this.f44215a);
    }
}
