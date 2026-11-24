package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xht implements yht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40912a;

    public xht(ArrayList arrayList) {
        this.f40912a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xht) && this.f40912a.equals(((xht) obj).f40912a);
    }

    public final int hashCode() {
        return this.f40912a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowTypeOfCouponBottomSheet(generateCouponTypeUiModelList=", Separators.RPAREN, this.f40912a);
    }
}
