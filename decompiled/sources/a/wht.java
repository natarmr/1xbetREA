package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wht implements yht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39182a;

    public wht(ArrayList arrayList) {
        this.f39182a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wht) && this.f39182a.equals(((wht) obj).f39182a);
    }

    public final int hashCode() {
        return this.f39182a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowTimeToStartBottomSheet(timeRangeUiModelList=", Separators.RPAREN, this.f39182a);
    }
}
