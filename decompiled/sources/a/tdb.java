package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampMenuType;

/* JADX INFO: loaded from: classes6.dex */
public final class tdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChampMenuType f33760a;
    public final String b;
    public final ArrayList c;

    public tdb(ChampMenuType champMenuType, String str, ArrayList arrayList) {
        this.f33760a = champMenuType;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdb)) {
            return false;
        }
        tdb tdbVar = (tdb) obj;
        return this.f33760a.equals(tdbVar.f33760a) && this.b.equals(tdbVar.b) && this.c.equals(tdbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33760a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampMenuItem(menuType=");
        sb.append(this.f33760a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subMenus=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
