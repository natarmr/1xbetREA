package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f163a;
    public final ArrayList b;

    public a3b(ArrayList arrayList, ArrayList arrayList2) {
        this.f163a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3b)) {
            return false;
        }
        a3b a3bVar = (a3b) obj;
        return this.f163a.equals(a3bVar.f163a) && this.b.equals(a3bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f163a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoriesModel(categoriesList=" + this.f163a + ", partitionsBannersList=" + this.b + Separators.RPAREN;
    }
}
