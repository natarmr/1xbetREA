package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ci40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4394a;
    public final Long b;
    public final boolean c;

    public ci40(int i, Long l, boolean z) {
        this.f4394a = i;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci40)) {
            return false;
        }
        ci40 ci40Var = (ci40) obj;
        return this.f4394a == ci40Var.f4394a && Intrinsics.d(this.b, ci40Var.b) && this.c == ci40Var.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f4394a) * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MlbbGameMapCellUiModel(icon=");
        sb.append(this.f4394a);
        sb.append(", respawnSeconds=");
        sb.append(this.b);
        sb.append(", active=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
