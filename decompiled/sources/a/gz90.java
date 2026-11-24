package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gz90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12171a;
    public final ArrayList b;

    public gz90(ArrayList arrayList, ArrayList arrayList2) {
        this.f12171a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz90)) {
            return false;
        }
        gz90 gz90Var = (gz90) obj;
        return this.f12171a.equals(gz90Var.f12171a) && this.b.equals(gz90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12171a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerBiographyInfoModel(biographyModelsList=" + this.f12171a + ", photoModelList=" + this.b + Separators.RPAREN;
    }
}
