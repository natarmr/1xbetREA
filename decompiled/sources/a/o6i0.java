package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class o6i0 {
    public static final m6i0 Companion = new m6i0();
    public static final byte j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i0 f24738a;
    public final w5i0 b;
    public final w5i0 c;
    public final w5i0 d;
    public final w5i0 e;
    public final w5i0 f;
    public final w5i0 g;
    public final w5i0 h;
    public final w5i0 i;

    static {
        t5i0 t5i0Var = w5i0.Companion;
        j = (byte) 8;
    }

    public /* synthetic */ o6i0(int i, w5i0 w5i0Var, w5i0 w5i0Var2, w5i0 w5i0Var3, w5i0 w5i0Var4, w5i0 w5i0Var5, w5i0 w5i0Var6, w5i0 w5i0Var7, w5i0 w5i0Var8, w5i0 w5i0Var9) {
        if ((i & 1) == 0) {
            this.f24738a = null;
        } else {
            this.f24738a = w5i0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w5i0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = w5i0Var3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = w5i0Var4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = w5i0Var5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = w5i0Var6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = w5i0Var7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = w5i0Var8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = w5i0Var9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6i0)) {
            return false;
        }
        o6i0 o6i0Var = (o6i0) obj;
        return Intrinsics.d(this.f24738a, o6i0Var.f24738a) && Intrinsics.d(this.b, o6i0Var.b) && Intrinsics.d(this.c, o6i0Var.c) && Intrinsics.d(this.d, o6i0Var.d) && Intrinsics.d(this.e, o6i0Var.e) && Intrinsics.d(this.f, o6i0Var.f) && Intrinsics.d(this.g, o6i0Var.g) && Intrinsics.d(this.h, o6i0Var.h) && Intrinsics.d(this.i, o6i0Var.i);
    }

    public final int hashCode() {
        w5i0 w5i0Var = this.f24738a;
        int iHashCode = (w5i0Var == null ? 0 : w5i0Var.hashCode()) * 31;
        w5i0 w5i0Var2 = this.b;
        int iHashCode2 = (iHashCode + (w5i0Var2 == null ? 0 : w5i0Var2.hashCode())) * 31;
        w5i0 w5i0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (w5i0Var3 == null ? 0 : w5i0Var3.hashCode())) * 31;
        w5i0 w5i0Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (w5i0Var4 == null ? 0 : w5i0Var4.hashCode())) * 31;
        w5i0 w5i0Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (w5i0Var5 == null ? 0 : w5i0Var5.hashCode())) * 31;
        w5i0 w5i0Var6 = this.f;
        int iHashCode6 = (iHashCode5 + (w5i0Var6 == null ? 0 : w5i0Var6.hashCode())) * 31;
        w5i0 w5i0Var7 = this.g;
        int iHashCode7 = (iHashCode6 + (w5i0Var7 == null ? 0 : w5i0Var7.hashCode())) * 31;
        w5i0 w5i0Var8 = this.h;
        int iHashCode8 = (iHashCode7 + (w5i0Var8 == null ? 0 : w5i0Var8.hashCode())) * 31;
        w5i0 w5i0Var9 = this.i;
        return iHashCode8 + (w5i0Var9 != null ? w5i0Var9.hashCode() : 0);
    }

    public final String toString() {
        return "SelectorsResponse(group=" + this.f24738a + ", season=" + this.b + ", date=" + this.c + ", discipline=" + this.d + ", age=" + this.e + ", tournamentType=" + this.f + ", competitorType=" + this.g + ", tournament=" + this.h + ", limit=" + this.i + Separators.RPAREN;
    }
}
