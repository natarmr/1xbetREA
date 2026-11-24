package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class lew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19925a;
    public final tew b;
    public final sff0 c;
    public final Map d;

    public lew(long j, tew tewVar, sff0 sff0Var, Map map) {
        this.f19925a = j;
        this.b = tewVar;
        this.c = sff0Var;
        this.d = map;
    }

    public static lew a(lew lewVar, long j, tew tewVar, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            j = lewVar.f19925a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            tewVar = lewVar.b;
        }
        tew tewVar2 = tewVar;
        sff0 sff0Var = lewVar.c;
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = lewVar.d;
        }
        tewVar2.getClass();
        return new lew(j2, tewVar2, sff0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lew)) {
            return false;
        }
        lew lewVar = (lew) obj;
        return this.f19925a == lewVar.f19925a && this.b.equals(lewVar.b) && this.c.equals(lewVar.c) && this.d.equals(lewVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.c(this.c, (this.b.hashCode() + (Long.hashCode(this.f19925a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "HltvAwardsStateModel(selectedChipsId=" + this.f19925a + ", statisticScenarioModel=" + this.b + ", remoteConfig=" + this.c + ", gameDetailsScenarioModel=" + this.d + Separators.RPAREN;
    }
}
