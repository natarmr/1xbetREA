package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qao f30146a;
    public final List b;
    public final int c;
    public final int d;
    public final vao e;

    public rao(qao qaoVar, List list, int i, int i2, vao vaoVar) {
        list.getClass();
        this.f30146a = qaoVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = vaoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rao)) {
            return false;
        }
        rao raoVar = (rao) obj;
        return Intrinsics.d(this.f30146a, raoVar.f30146a) && Intrinsics.d(this.b, raoVar.b) && this.c == raoVar.c && this.d == raoVar.d && this.e == raoVar.e;
    }

    public final int hashCode() {
        qao qaoVar = this.f30146a;
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, dw9.a((qaoVar == null ? 0 : qaoVar.hashCode()) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeasureMarketsGroup(header=");
        sb.append(this.f30146a);
        sb.append(", measureViews=");
        sb.append(this.b);
        sb.append(", maxColumn=");
        axq.r(this.c, this.d, ", marketsSizeInGroup=", ", rowViewType=", sb);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
