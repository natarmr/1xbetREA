package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f431a;

    public final boolean equals(Object obj) {
        if (obj instanceof a8l) {
            return this.f431a.equals(((a8l) obj).f431a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f431a.hashCode();
    }

    public final String toString() {
        return hne.o("RadiantSelectedHeroes(value=", Separators.RPAREN, this.f431a);
    }
}
