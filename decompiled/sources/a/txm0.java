package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class txm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34708a;
    public final Long b;
    public final String c;

    public txm0(List list, Long l, String str) {
        this.f34708a = list;
        this.b = l;
        this.c = str;
    }

    public static txm0 a(txm0 txm0Var, List list, Long l, String str, int i) {
        if ((i & 1) != 0) {
            list = txm0Var.f34708a;
        }
        if ((i & 2) != 0) {
            l = txm0Var.b;
        }
        if ((i & 4) != 0) {
            str = txm0Var.c;
        }
        return new txm0(list, l, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txm0)) {
            return false;
        }
        txm0 txm0Var = (txm0) obj;
        return Intrinsics.d(this.f34708a, txm0Var.f34708a) && Intrinsics.d(this.b, txm0Var.b) && this.c.equals(txm0Var.c);
    }

    public final int hashCode() {
        List list = this.f34708a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        return this.c.hashCode() + ((iHashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubGamesFilterStateModel(subGames=");
        sb.append(this.f34708a);
        sb.append(", selectedId=");
        sb.append(this.b);
        sb.append(", searchQuery=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
