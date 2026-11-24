package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14151a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4l) {
            return this.f14151a.equals(((i4l) obj).f14151a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14151a.hashCode();
    }

    public final String toString() {
        return hne.o("Items(value=", Separators.RPAREN, this.f14151a);
    }
}
