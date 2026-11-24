package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class deb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5942a;

    public deb0(ArrayList arrayList) {
        this.f5942a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof deb0) && this.f5942a.equals(((deb0) obj).f5942a);
    }

    public final int hashCode() {
        return this.f5942a.hashCode();
    }

    public final String toString() {
        return hne.o("PopularOneXGamesBannersStateModel(value=", Separators.RPAREN, this.f5942a);
    }
}
