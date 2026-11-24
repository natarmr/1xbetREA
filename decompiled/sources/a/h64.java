package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class h64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12511a;

    public h64(ArrayList arrayList) {
        this.f12511a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h64) && this.f12511a.equals(((h64) obj).f12511a);
    }

    public final int hashCode() {
        return this.f12511a.hashCode();
    }

    public final String toString() {
        return hne.o("AuthEntryPointsUiState(content=", Separators.RPAREN, this.f12511a);
    }
}
