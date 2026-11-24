package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class w7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38678a;

    public final boolean equals(Object obj) {
        if (obj instanceof w7l) {
            return this.f38678a.equals(((w7l) obj).f38678a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38678a.hashCode();
    }

    public final String toString() {
        return hne.o("MapHeroes(value=", Separators.RPAREN, this.f38678a);
    }
}
