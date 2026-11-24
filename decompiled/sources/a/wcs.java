package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wcs implements ycs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38938a;

    public wcs(ArrayList arrayList) {
        this.f38938a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcs) && this.f38938a.equals(((wcs) obj).f38938a);
    }

    public final int hashCode() {
        return this.f38938a.hashCode();
    }

    public final String toString() {
        return hne.o("Specific(subGames=", Separators.RPAREN, this.f38938a);
    }
}
