package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l0j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n85 f19205a;
    public final z6w b;
    public final n85 c;

    public l0j(n85 n85Var, z6w z6wVar, n85 n85Var2) {
        this.f19205a = n85Var;
        this.b = z6wVar;
        this.c = n85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0j)) {
            return false;
        }
        l0j l0jVar = (l0j) obj;
        return Intrinsics.d(this.f19205a, l0jVar.f19205a) && Intrinsics.d(this.b, l0jVar.b) && Intrinsics.d(this.c, l0jVar.c);
    }

    public final int hashCode() {
        n85 n85Var = this.f19205a;
        int iHashCode = (n85Var == null ? 0 : n85Var.hashCode()) * 31;
        z6w z6wVar = this.b;
        int iHashCode2 = (iHashCode + (z6wVar == null ? 0 : z6wVar.hashCode())) * 31;
        n85 n85Var2 = this.c;
        return iHashCode2 + (n85Var2 != null ? n85Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DailyTaskCurrentWrapper(availableTask=" + this.f19205a + ", historyTask=" + this.b + ", activeTask=" + this.c + Separators.RPAREN;
    }
}
