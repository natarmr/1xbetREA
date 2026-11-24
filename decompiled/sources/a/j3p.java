package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j3p implements k3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15847a;

    public j3p(ArrayList arrayList) {
        this.f15847a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3p) && this.f15847a.equals(((j3p) obj).f15847a);
    }

    public final int hashCode() {
        return this.f15847a.hashCode();
    }

    public final String toString() {
        return hne.o("Success(events=", Separators.RPAREN, this.f15847a);
    }
}
