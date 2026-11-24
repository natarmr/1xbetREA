package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5660a;
    public final Map b;

    public d8o(long j, Map map) {
        this.f5660a = j;
        this.b = map;
    }

    public static d8o a(d8o d8oVar, long j, Map map, int i) {
        if ((i & 1) != 0) {
            j = d8oVar.f5660a;
        }
        if ((i & 2) != 0) {
            map = d8oVar.b;
        }
        map.getClass();
        return new d8o(j, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8o)) {
            return false;
        }
        d8o d8oVar = (d8o) obj;
        return this.f5660a == d8oVar.f5660a && this.b.equals(d8oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f5660a) * 31);
    }

    public final String toString() {
        return "EsportsWorldCupDisciplinesModel(disciplineSelectedTabId=" + this.f5660a + ", sports=" + this.b + Separators.RPAREN;
    }
}
