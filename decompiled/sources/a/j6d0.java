package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j6d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15979a;
    public final u6d0 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    public j6d0(boolean z, u6d0 u6d0Var, String str, int i, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f15979a = z;
        this.b = u6d0Var;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6d0)) {
            return false;
        }
        j6d0 j6d0Var = (j6d0) obj;
        return this.f15979a == j6d0Var.f15979a && this.b == j6d0Var.b && Intrinsics.d(this.c, j6d0Var.c) && this.d == j6d0Var.d && Intrinsics.d(this.e, j6d0Var.e) && Intrinsics.d(this.f, j6d0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, ua80.b((this.b.hashCode() + (Boolean.hashCode(this.f15979a) * 31)) * 31, 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxySettingsModel(enabled=");
        sb.append(this.f15979a);
        sb.append(", proxyType=");
        sb.append(this.b);
        sb.append(", server=");
        twn.w(this.d, this.c, ", port=", ", username=", sb);
        return ua80.m(sb, this.e, ", password=", this.f, Separators.RPAREN);
    }
}
