package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class fjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9655a;

    public fjp0(ArrayList arrayList) {
        this.f9655a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjp0) && this.f9655a.equals(((fjp0) obj).f9655a);
    }

    public final int hashCode() {
        return this.f9655a.hashCode();
    }

    public final String toString() {
        return hne.o("TeamSelectorBottomSheetState(teamValues=", Separators.RPAREN, this.f9655a);
    }
}
