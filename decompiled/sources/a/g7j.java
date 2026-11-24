package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g7j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10816a;
    public final ArrayList b;

    public g7j(String str, ArrayList arrayList) {
        this.f10816a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7j)) {
            return false;
        }
        g7j g7jVar = (g7j) obj;
        return this.f10816a.equals(g7jVar.f10816a) && this.b.equals(g7jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10816a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTournamentWinnerModel(date=" + this.f10816a + ", winners=" + this.b + Separators.RPAREN;
    }
}
