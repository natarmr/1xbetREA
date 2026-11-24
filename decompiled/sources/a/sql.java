package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f32635a;
    public final String b;
    public final String c;

    public sql(n0x n0xVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f32635a = n0xVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sql)) {
            return false;
        }
        sql sqlVar = (sql) obj;
        return Intrinsics.d(this.f32635a, sqlVar.f32635a) && Intrinsics.d(this.b, sqlVar.b) && Intrinsics.d(this.c, sqlVar.c);
    }

    public final int hashCode() {
        o0x o0xVar = this.f32635a;
        return this.c.hashCode() + ua80.b((o0xVar == null ? 0 : o0xVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsAggregatorTournamentProgressLeaderBoardItemModel(picture=");
        sb.append(this.f32635a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", value=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
