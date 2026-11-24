package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xs50 implements at50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fqm f41400a;
    public final ArrayList b;
    public final ArrayList c;

    public xs50(fqm fqmVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f41400a = fqmVar;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs50)) {
            return false;
        }
        xs50 xs50Var = (xs50) obj;
        return this.f41400a.equals(xs50Var.f41400a) && this.b.equals(xs50Var.b) && this.c.equals(xs50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f41400a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(segmentUiModel=");
        sb.append(this.f41400a);
        sb.append(", topBanners=");
        sb.append(this.b);
        sb.append(", categories=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
