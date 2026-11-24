package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class e8p {
    public static final a8p Companion = new a8p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7385a;
    public final Double b;
    public final String c;
    public final Long d;
    public final Double e;
    public final daa0 f;
    public final d8p g;

    public /* synthetic */ e8p(int i, Long l, Double d, String str, Long l2, Double d2, daa0 daa0Var, d8p d8pVar) {
        if ((i & 1) == 0) {
            this.f7385a = null;
        } else {
            this.f7385a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = daa0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d8pVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8p)) {
            return false;
        }
        e8p e8pVar = (e8p) obj;
        return Intrinsics.d(this.f7385a, e8pVar.f7385a) && Intrinsics.d(this.b, e8pVar.b) && Intrinsics.d(this.c, e8pVar.c) && Intrinsics.d(this.d, e8pVar.d) && Intrinsics.d(this.e, e8pVar.e) && Intrinsics.d(this.f, e8pVar.f) && Intrinsics.d(this.g, e8pVar.g);
    }

    public final int hashCode() {
        Long l = this.f7385a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        daa0 daa0Var = this.f;
        int iHashCode6 = (iHashCode5 + (daa0Var == null ? 0 : daa0Var.hashCode())) * 31;
        d8p d8pVar = this.g;
        return iHashCode6 + (d8pVar != null ? d8pVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteEventResponse(type=");
        sb.append(this.f7385a);
        sb.append(", cf=");
        sb.append(this.b);
        sb.append(", cfView=");
        h97.w(this.d, this.c, ", groupId=", ", parameter=", sb);
        sb.append(this.e);
        sb.append(", player=");
        sb.append(this.f);
        sb.append(", eventParamsResponse=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
