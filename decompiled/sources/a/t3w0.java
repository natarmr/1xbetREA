package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class t3w0 {
    public static final s3w0 Companion = new s3w0();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new y9v0((byte) 17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33288a;
    public final Integer b;
    public final List c;
    public final Integer d;

    public /* synthetic */ t3w0(int i, Integer num, Integer num2, Integer num3, List list) {
        if ((i & 1) == 0) {
            this.f33288a = null;
        } else {
            this.f33288a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3w0)) {
            return false;
        }
        t3w0 t3w0Var = (t3w0) obj;
        return Intrinsics.d(this.f33288a, t3w0Var.f33288a) && Intrinsics.d(this.b, t3w0Var.b) && Intrinsics.d(this.c, t3w0Var.c) && Intrinsics.d(this.d, t3w0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f33288a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Sport(sportId=", this.f33288a, ", version=", this.b, ", devices=");
        sbQ.append(this.c);
        sbQ.append(", test=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
