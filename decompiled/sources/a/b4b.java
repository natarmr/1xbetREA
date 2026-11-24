package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b4b extends rsr0 {
    public final ArrayList j;

    public b4b(ArrayList arrayList) {
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4b) && this.j.equals(((b4b) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return hne.o("SimpleCategoryContainer(simpleCategoryList=", Separators.RPAREN, this.j);
    }
}
