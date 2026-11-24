package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class pgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26953a;
    public final String b;
    public final nmy c;
    public final cny d;

    public pgf0(Map map, String str, nmy nmyVar, cny cnyVar) {
        this.f26953a = map;
        this.b = str;
        this.c = nmyVar;
        this.d = cnyVar;
    }

    public static pgf0 a(pgf0 pgf0Var, Map map, String str, nmy nmyVar, cny cnyVar, int i) {
        if ((i & 1) != 0) {
            map = pgf0Var.f26953a;
        }
        if ((i & 2) != 0) {
            str = pgf0Var.b;
        }
        if ((i & 4) != 0) {
            nmyVar = pgf0Var.c;
        }
        if ((i & 8) != 0) {
            cnyVar = pgf0Var.d;
        }
        return new pgf0(map, str, nmyVar, cnyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgf0)) {
            return false;
        }
        pgf0 pgf0Var = (pgf0) obj;
        return this.f26953a.equals(pgf0Var.f26953a) && this.b.equals(pgf0Var.b) && this.c == pgf0Var.c && this.d == pgf0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f26953a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "RemoteConfigTestState(configMap=" + this.f26953a + ", searchQuery=" + this.b + ", chosenFilterType=" + this.c + ", chosenSortType=" + this.d + Separators.RPAREN;
    }
}
