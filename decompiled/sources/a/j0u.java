package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j0u implements k0u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15698a;

    public j0u(ArrayList arrayList) {
        this.f15698a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0u) && this.f15698a.equals(((j0u) obj).f15698a);
    }

    public final int hashCode() {
        return this.f15698a.hashCode();
    }

    public final String toString() {
        return hne.o("InsertRequired(items=", Separators.RPAREN, this.f15698a);
    }
}
