package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class vv0 {
    public static final uv0 Companion = new uv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38074a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final Integer h;
    public final ou0 i;

    public /* synthetic */ vv0(int i, boolean z, String str, long j, int i2, int i3, String str2, String str3, Integer num, ou0 ou0Var) {
        if (511 != (i & 511)) {
            m2x.I(i, 511, tv0.f34575a.getDescriptor());
            throw null;
        }
        this.f38074a = z;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = str2;
        this.g = str3;
        this.h = num;
        this.i = ou0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0)) {
            return false;
        }
        vv0 vv0Var = (vv0) obj;
        return this.f38074a == vv0Var.f38074a && Intrinsics.d(this.b, vv0Var.b) && this.c == vv0Var.c && this.d == vv0Var.d && this.e == vv0Var.e && Intrinsics.d(this.f, vv0Var.f) && Intrinsics.d(this.g, vv0Var.g) && Intrinsics.d(this.h, vv0Var.h) && Intrinsics.d(this.i, vv0Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(twn.a(this.e, twn.a(this.d, rw2.b(ua80.b(Boolean.hashCode(this.f38074a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
        Integer num = this.h;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        ou0 ou0Var = this.i;
        return iHashCode + (ou0Var != null ? ou0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("AggregatorGameRequestUnAuthRequest(demo=", ", domen=", this.b, this.f38074a, ", gameId=");
        ua80.v(sbQ, this.c, ", whence=", this.d);
        w6x.w(this.e, ", ref=", ", lang=", this.f, sbQ);
        sbQ.append(", lobbyUrl=");
        sbQ.append(this.g);
        sbQ.append(", subCategoryId=");
        sbQ.append(this.h);
        sbQ.append(", metrics=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public vv0(boolean z, String str, long j, String str2, String str3, Integer num, ou0 ou0Var) {
        str3.getClass();
        this.f38074a = z;
        this.b = str;
        this.c = j;
        this.d = 22;
        this.e = 1;
        this.f = str2;
        this.g = str3;
        this.h = num;
        this.i = ou0Var;
    }
}
