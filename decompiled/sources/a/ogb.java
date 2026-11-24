package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ogb {
    public static final ngb Companion = new ngb();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25210a;
    public final Long b;
    public final veb c;

    static {
        qeb qebVar = veb.Companion;
        d = new a8z[]{maz.a(wez.f39042a, new e0b((byte) 17)), null, null};
    }

    public /* synthetic */ ogb(int i, List list, Long l, veb vebVar) {
        if ((i & 1) == 0) {
            this.f25210a = null;
        } else {
            this.f25210a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vebVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogb)) {
            return false;
        }
        ogb ogbVar = (ogb) obj;
        return Intrinsics.d(this.f25210a, ogbVar.f25210a) && Intrinsics.d(this.b, ogbVar.b) && Intrinsics.d(this.c, ogbVar.c);
    }

    public final int hashCode() {
        List list = this.f25210a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        veb vebVar = this.c;
        return iHashCode2 + (vebVar != null ? vebVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChampTopRatingResponse(teams=" + this.f25210a + ", sportId=" + this.b + ", champ=" + this.c + Separators.RPAREN;
    }
}
