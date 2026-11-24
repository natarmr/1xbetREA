package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kgb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18230a;
    public final long b;
    public final deb c;

    public kgb(List list, long j, deb debVar) {
        list.getClass();
        this.f18230a = list;
        this.b = j;
        this.c = debVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgb)) {
            return false;
        }
        kgb kgbVar = (kgb) obj;
        return Intrinsics.d(this.f18230a, kgbVar.f18230a) && this.b == kgbVar.b && Intrinsics.d(this.c, kgbVar.c);
    }

    public final int hashCode() {
        int iB = rw2.b(this.f18230a.hashCode() * 31, 31, this.b);
        deb debVar = this.c;
        return iB + (debVar == null ? 0 : debVar.hashCode());
    }

    public final String toString() {
        return "ChampTopRatingModel(teams=" + this.f18230a + ", sportId=" + this.b + ", champ=" + this.c + Separators.RPAREN;
    }
}
