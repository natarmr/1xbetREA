package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dbp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5817a;
    public final List b;
    public final List c;
    public final j7p d;
    public final String e;

    public dbp(List list, List list2, List list3, j7p j7pVar, String str) {
        b1j.B(list, list2, list3);
        this.f5817a = list;
        this.b = list2;
        this.c = list3;
        this.d = j7pVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbp)) {
            return false;
        }
        dbp dbpVar = (dbp) obj;
        return Intrinsics.d(this.f5817a, dbpVar.f5817a) && Intrinsics.d(this.b, dbpVar.b) && Intrinsics.d(this.c, dbpVar.c) && this.d.equals(dbpVar.d) && this.e.equals(dbpVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + dw9.a(dw9.a(this.f5817a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("FavoriteModel(teams=", ", games=", this.f5817a, ", champs=", this.b);
        sbT.append(this.c);
        sbT.append(", configuration=");
        sbT.append(this.d);
        sbT.append(", favoriteId=");
        return axq.n(sbT, this.e, Separators.RPAREN);
    }
}
