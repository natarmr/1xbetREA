package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xql implements zql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sql f41326a;
    public final o0x b;
    public final sql c;
    public final tql d;
    public final String e;

    public xql(sql sqlVar, n0x n0xVar, sql sqlVar2, tql tqlVar, String str) {
        str.getClass();
        this.f41326a = sqlVar;
        this.b = n0xVar;
        this.c = sqlVar2;
        this.d = tqlVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xql)) {
            return false;
        }
        xql xqlVar = (xql) obj;
        return this.f41326a.equals(xqlVar.f41326a) && Intrinsics.d(this.b, xqlVar.b) && this.c.equals(xqlVar.c) && this.d.equals(xqlVar.d) && Intrinsics.d(this.e, xqlVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f41326a.hashCode() * 31;
        o0x o0xVar = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveStage(firstModel=");
        sb.append(this.f41326a);
        sb.append(", decorationPicture=");
        sb.append(this.b);
        sb.append(", additionalModel=");
        sb.append(this.c);
        sb.append(", ratingModel=");
        sb.append(this.d);
        sb.append(", header=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
