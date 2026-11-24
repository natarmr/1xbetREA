package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a5k {
    public static final z4k Companion = new z4k();
    public static final a8z[] c = {maz.a(wez.f39042a, new rtj(4)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273a;
    public final Boolean b;

    public /* synthetic */ a5k(int i, Boolean bool, List list) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, y4k.f42006a.getDescriptor());
            throw null;
        }
        this.f273a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5k)) {
            return false;
        }
        a5k a5kVar = (a5k) obj;
        return Intrinsics.d(this.f273a, a5kVar.f273a) && Intrinsics.d(this.b, a5kVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f273a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "DeleteFavoriteGamesRequest(gameIds=" + this.f273a + ", subscribe=" + this.b + Separators.RPAREN;
    }

    public a5k(List list, Boolean bool) {
        list.getClass();
        this.f273a = list;
        this.b = bool;
    }
}
