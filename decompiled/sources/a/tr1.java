package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tr1 implements vr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34402a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final rr1 f;

    public tr1(long j, String str, String str2, boolean z, boolean z2, rr1 rr1Var) {
        str.getClass();
        this.f34402a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = rr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr1)) {
            return false;
        }
        tr1 tr1Var = (tr1) obj;
        return this.f34402a == tr1Var.f34402a && Intrinsics.d(this.b, tr1Var.b) && this.c.equals(tr1Var.c) && this.d == tr1Var.d && this.e == tr1Var.e && this.f.equals(tr1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(Long.hashCode(this.f34402a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34402a, "Content(id=", ", title=", this.b);
        w6x.z(", subTitle=", this.c, ", active=", sbO, this.d);
        sbO.append(", clickable=");
        sbO.append(this.e);
        sbO.append(", stageModel=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
