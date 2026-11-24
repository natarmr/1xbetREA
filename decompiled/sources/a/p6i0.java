package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class p6i0 {
    public static final n6i0 Companion = new n6i0();
    public static final byte f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhv f26456a;
    public final yih0 b;
    public final juk c;
    public final mdd d;
    public final a5s0 e;

    static {
        v4s0 v4s0Var = a5s0.Companion;
        ldd lddVar = mdd.Companion;
        iuk iukVar = juk.Companion;
        xih0 xih0Var = yih0.Companion;
        lhv lhvVar = nhv.Companion;
        f = (byte) 8;
    }

    public /* synthetic */ p6i0(int i, nhv nhvVar, yih0 yih0Var, juk jukVar, mdd mddVar, a5s0 a5s0Var) {
        if ((i & 1) == 0) {
            this.f26456a = null;
        } else {
            this.f26456a = nhvVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = yih0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jukVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = mddVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = a5s0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6i0)) {
            return false;
        }
        p6i0 p6i0Var = (p6i0) obj;
        return Intrinsics.d(this.f26456a, p6i0Var.f26456a) && Intrinsics.d(this.b, p6i0Var.b) && Intrinsics.d(this.c, p6i0Var.c) && Intrinsics.d(this.d, p6i0Var.d) && Intrinsics.d(this.e, p6i0Var.e);
    }

    public final int hashCode() {
        nhv nhvVar = this.f26456a;
        int iHashCode = (nhvVar == null ? 0 : nhvVar.hashCode()) * 31;
        yih0 yih0Var = this.b;
        int iHashCode2 = (iHashCode + (yih0Var == null ? 0 : yih0Var.hashCode())) * 31;
        juk jukVar = this.c;
        int iHashCode3 = (iHashCode2 + (jukVar == null ? 0 : jukVar.hashCode())) * 31;
        mdd mddVar = this.d;
        int iHashCode4 = (iHashCode3 + (mddVar == null ? 0 : mddVar.hashCode())) * 31;
        a5s0 a5s0Var = this.e;
        return iHashCode4 + (a5s0Var != null ? a5s0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SelectorsResponse(group=" + this.f26456a + ", season=" + this.b + ", discipline=" + this.c + ", competitorType=" + this.d + ", tournament=" + this.e + Separators.RPAREN;
    }
}
