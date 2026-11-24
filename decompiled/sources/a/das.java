package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class das {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5766a;
    public final Map b;
    public final pas c;

    /* JADX WARN: Illegal instructions before constructor call */
    public das() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        lunVar.getClass();
        this(lunVar, lunVar, new pas(null, null));
    }

    public static das a(das dasVar, Map map, Map map2, pas pasVar, int i) {
        if ((i & 1) != 0) {
            map = dasVar.f5766a;
        }
        if ((i & 2) != 0) {
            map2 = dasVar.b;
        }
        if ((i & 4) != 0) {
            pasVar = dasVar.c;
        }
        map.getClass();
        map2.getClass();
        pasVar.getClass();
        return new das(map, map2, pasVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof das)) {
            return false;
        }
        das dasVar = (das) obj;
        return Intrinsics.d(this.f5766a, dasVar.f5766a) && Intrinsics.d(this.b, dasVar.b) && Intrinsics.d(this.c, dasVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ohs0.f(this.b, this.f5766a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GameEventGroupState(cacheMap=" + this.f5766a + ", previousCutCoefsState=" + this.b + ", gameEventParamsModel=" + this.c + Separators.RPAREN;
    }

    public das(Map map, Map map2, pas pasVar) {
        map.getClass();
        map2.getClass();
        this.f5766a = map;
        this.b = map2;
        this.c = pasVar;
    }
}
