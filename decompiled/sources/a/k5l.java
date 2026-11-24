package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17725a;

    public k5l(ArrayList arrayList) {
        this.f17725a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5l) && this.f17725a.equals(((k5l) obj).f17725a);
    }

    public final int hashCode() {
        return this.f17725a.hashCode();
    }

    public final String toString() {
        return hne.o("DotaItemsUiModel(itemEquipments=", Separators.RPAREN, this.f17725a);
    }
}
