package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yql implements zql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sql f43081a;
    public final o0x b;
    public final String c;

    public yql(sql sqlVar, n0x n0xVar, String str) {
        str.getClass();
        this.f43081a = sqlVar;
        this.b = n0xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yql)) {
            return false;
        }
        yql yqlVar = (yql) obj;
        return this.f43081a.equals(yqlVar.f43081a) && Intrinsics.d(this.b, yqlVar.b) && Intrinsics.d(this.c, yqlVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f43081a.hashCode() * 31;
        o0x o0xVar = this.b;
        return this.c.hashCode() + ((iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Inactive(firstModel=");
        sb.append(this.f43081a);
        sb.append(", decorationPicture=");
        sb.append(this.b);
        sb.append(", header=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
