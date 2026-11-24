package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class e7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7326a;

    public e7g0(ArrayList arrayList) {
        this.f7326a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7g0) && this.f7326a.equals(((e7g0) obj).f7326a);
    }

    public final int hashCode() {
        return this.f7326a.hashCode();
    }

    public final String toString() {
        return hne.o("ResultsGridInfoStateModel(colorDescriptions=", Separators.RPAREN, this.f7326a);
    }
}
