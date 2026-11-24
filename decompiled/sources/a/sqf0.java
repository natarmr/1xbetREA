package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sqf0 {
    public static final rqf0 Companion = new rqf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32628a;
    public final String b;
    public final int c;
    public final Integer d;
    public final String e;

    public /* synthetic */ sqf0(int i, int i2, String str, int i3, Integer num, String str2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, qqf0.f29164a.getDescriptor());
            throw null;
        }
        this.f32628a = i2;
        this.b = str;
        this.c = i3;
        this.d = num;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqf0)) {
            return false;
        }
        sqf0 sqf0Var = (sqf0) obj;
        return this.f32628a == sqf0Var.f32628a && Intrinsics.d(this.b, sqf0Var.b) && this.c == sqf0Var.c && Intrinsics.d(this.d, sqf0Var.d) && Intrinsics.d(this.e, sqf0Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, ua80.b(Integer.hashCode(this.f32628a) * 31, 31, this.b), 31);
        Integer num = this.d;
        return this.e.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f32628a, "ResidentMakeActionRequest(whence=", ", lng=", this.b, ", actionStep=");
        sbR.append(this.c);
        sbR.append(", choicePosition=");
        sbR.append(this.d);
        sbR.append(", gameId=");
        return axq.n(sbR, this.e, Separators.RPAREN);
    }

    public sqf0(int i, Integer num, String str, String str2) {
        str2.getClass();
        this.f32628a = 22;
        this.b = str;
        this.c = i;
        this.d = num;
        this.e = str2;
    }
}
