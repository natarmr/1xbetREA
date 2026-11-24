package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bup0 {
    public static final aup0 Companion = new aup0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3243a;
    public final Long b;
    public final String c;

    public /* synthetic */ bup0(int i, Integer num, Long l, String str) {
        if ((i & 1) == 0) {
            this.f3243a = null;
        } else {
            this.f3243a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bup0)) {
            return false;
        }
        bup0 bup0Var = (bup0) obj;
        return Intrinsics.d(this.f3243a, bup0Var.f3243a) && Intrinsics.d(this.b, bup0Var.b) && Intrinsics.d(this.c, bup0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f3243a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.m(this.f3243a, this.b, "TekkenRoundResponse(round=", ", time=", ", winnerName="), this.c, Separators.RPAREN);
    }
}
