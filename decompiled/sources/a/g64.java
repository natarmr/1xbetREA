package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10745a;

    public g64(ArrayList arrayList) {
        this.f10745a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g64) && this.f10745a.equals(((g64) obj).f10745a);
    }

    public final int hashCode() {
        return this.f10745a.hashCode();
    }

    public final String toString() {
        return hne.o("AuthEntryPointsStateModel(authEntryPointModelList=", Separators.RPAREN, this.f10745a);
    }
}
