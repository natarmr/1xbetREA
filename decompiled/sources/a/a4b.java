package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a4b extends rsr0 {
    public final int j;
    public final ArrayList k;

    public a4b(int i, ArrayList arrayList) {
        this.j = i;
        this.k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4b)) {
            return false;
        }
        a4b a4bVar = (a4b) obj;
        return this.j == a4bVar.j && this.k.equals(a4bVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (Integer.hashCode(this.j) * 961);
    }

    public final String toString() {
        return "CategoryWithGamesModel(id=" + this.j + ", name=, games=" + this.k + Separators.RPAREN;
    }
}
