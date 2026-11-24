package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lf6 {
    public static final kf6 Companion = new kf6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19939a;
    public final Long b;
    public final String c;
    public final Integer d;

    public /* synthetic */ lf6(int i, Long l, Long l2, String str, Integer num) {
        if ((i & 1) == 0) {
            this.f19939a = null;
        } else {
            this.f19939a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf6)) {
            return false;
        }
        lf6 lf6Var = (lf6) obj;
        return Intrinsics.d(this.f19939a, lf6Var.f19939a) && Intrinsics.d(this.b, lf6Var.b) && Intrinsics.d(this.c, lf6Var.c) && Intrinsics.d(this.d, lf6Var.d);
    }

    public final int hashCode() {
        Long l = this.f19939a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", zonePlay=", Separators.RPAREN, rz4.o(this.f19939a, this.b, "BetBuilderAlterVideoResponse(gameId=", ", constId=", ", videoId="));
    }
}
