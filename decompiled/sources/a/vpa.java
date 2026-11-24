package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class vpa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37795a;

    public vpa(ArrayList arrayList) {
        this.f37795a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpa) && this.f37795a.equals(((vpa) obj).f37795a);
    }

    public final int hashCode() {
        return this.f37795a.hashCode();
    }

    public final String toString() {
        return hne.o("PeriodScoreChange(periodScoreUiModelList=", Separators.RPAREN, this.f37795a);
    }
}
