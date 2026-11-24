package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class and extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1145a;

    public and(ArrayList arrayList) {
        this.f1145a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof and) && this.f1145a.equals(((and) obj).f1145a);
    }

    public final int hashCode() {
        return this.f1145a.hashCode();
    }

    public final String toString() {
        return hne.o("PeriodScoreChanged(periodScoreUiModelList=", Separators.RPAREN, this.f1145a);
    }
}
