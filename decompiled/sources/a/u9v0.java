package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u9v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35302a;
    public final String b;
    public final Object c;
    public final boolean d;

    public u9v0(String str, String str2, Object obj, boolean z) {
        str2.getClass();
        this.f35302a = str;
        this.b = str2;
        this.c = obj;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9v0)) {
            return false;
        }
        u9v0 u9v0Var = (u9v0) obj;
        return this.f35302a.equals(u9v0Var.f35302a) && Intrinsics.d(this.b, u9v0Var.b) && Intrinsics.d(this.c, u9v0Var.c) && this.d == u9v0Var.d;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f35302a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return Boolean.hashCode(this.d) + ((iB + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Entry(id=", this.f35302a, ", label=", this.b, ", value=");
        sbN.append(this.c);
        sbN.append(", enabled=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
