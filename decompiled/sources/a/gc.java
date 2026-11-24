package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc f11035a;
    public final int b;
    public final String c;

    public gc(hc hcVar, int i, String str) {
        str.getClass();
        this.f11035a = hcVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return this.f11035a == gcVar.f11035a && this.b == gcVar.b && Intrinsics.d(this.c, gcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f11035a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountActionCellUiModel(type=");
        sb.append(this.f11035a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
