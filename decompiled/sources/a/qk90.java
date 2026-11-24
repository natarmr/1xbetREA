package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qk90 implements rk90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28876a;
    public final String b;
    public final d4d c;
    public final boolean d;
    public final boolean e;

    public qk90(long j, String str, d4d d4dVar, boolean z, boolean z2) {
        str.getClass();
        this.f28876a = j;
        this.b = str;
        this.c = d4dVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk90)) {
            return false;
        }
        qk90 qk90Var = (qk90) obj;
        return this.f28876a == qk90Var.f28876a && Intrinsics.d(this.b, qk90Var.b) && this.c == qk90Var.c && this.d == qk90Var.d && this.e == qk90Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(dw9.b(this.c, ua80.b(Long.hashCode(this.f28876a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28876a, "Item(id=", ", nameText=", this.b);
        sbO.append(", nameTextColor=");
        sbO.append(this.c);
        sbO.append(", selected=");
        sbO.append(this.d);
        return f140.n(sbO, ", noDivider=", this.e, Separators.RPAREN);
    }
}
