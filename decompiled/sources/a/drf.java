package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class drf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6556a;

    public drf(ArrayList arrayList) {
        this.f6556a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drf) && this.f6556a.equals(((drf) obj).f6556a);
    }

    public final int hashCode() {
        return this.f6556a.hashCode();
    }

    public final String toString() {
        return hne.o("Cs2RoundStatisticsUiModel(roundStatistics=", Separators.RPAREN, this.f6556a);
    }
}
