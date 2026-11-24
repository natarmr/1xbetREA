package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i9t {
    public static final i9t c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14404a;
    public final List b;

    static {
        iun iunVar = iun.f15405a;
        c = new i9t(iunVar, iunVar);
    }

    public i9t(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f14404a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9t)) {
            return false;
        }
        i9t i9tVar = (i9t) obj;
        return Intrinsics.d(this.f14404a, i9tVar.f14404a) && Intrinsics.d(this.b, i9tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14404a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("GamesManiaMapModel(fieldCoords=", ", prizeCellsCoords=", this.f14404a, Separators.RPAREN, this.b);
    }
}
