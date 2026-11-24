package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class vib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37471a;

    public vib0(ArrayList arrayList) {
        this.f37471a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vib0) && this.f37471a.equals(((vib0) obj).f37471a);
    }

    public final int hashCode() {
        return this.f37471a.hashCode();
    }

    public final String toString() {
        return hne.o("PopularSettingsUiState(value=", Separators.RPAREN, this.f37471a);
    }
}
