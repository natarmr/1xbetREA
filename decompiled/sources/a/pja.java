package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pja {
    public static final oja Companion = new oja();
    public static final a8z[] d = {maz.a(wez.f39042a, new mn9(23)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27079a;
    public final Boolean b;
    public final Long c;

    public /* synthetic */ pja(int i, Boolean bool, Long l, List list) {
        if ((i & 1) == 0) {
            this.f27079a = null;
        } else {
            this.f27079a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pja)) {
            return false;
        }
        pja pjaVar = (pja) obj;
        return Intrinsics.d(this.f27079a, pjaVar.f27079a) && Intrinsics.d(this.b, pjaVar.b) && Intrinsics.d(this.c, pjaVar.c);
    }

    public final int hashCode() {
        List list = this.f27079a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardListResponse(cards=");
        sb.append(this.f27079a);
        sb.append(", switchFilter=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return ohs0.r(sb, this.c, Separators.RPAREN);
    }
}
