package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class q4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28102a;

    public final boolean equals(Object obj) {
        if (obj instanceof q4l) {
            return this.f28102a.equals(((q4l) obj).f28102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28102a.hashCode();
    }

    public final String toString() {
        return hne.o("Heroes(value=", Separators.RPAREN, this.f28102a);
    }
}
