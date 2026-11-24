package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class e6d0 {
    public static final d6d0 Companion = new d6d0();
    public static final a8z[] g = {null, maz.a(wez.f39042a, new cbc0(18)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7278a;
    public final t6d0 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    public /* synthetic */ e6d0(int i, boolean z, t6d0 t6d0Var, String str, int i2, String str2, String str3) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, c6d0.f3813a.getDescriptor());
            throw null;
        }
        this.f7278a = z;
        this.b = t6d0Var;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6d0)) {
            return false;
        }
        e6d0 e6d0Var = (e6d0) obj;
        return this.f7278a == e6d0Var.f7278a && this.b == e6d0Var.b && Intrinsics.d(this.c, e6d0Var.c) && this.d == e6d0Var.d && Intrinsics.d(this.e, e6d0Var.e) && Intrinsics.d(this.f, e6d0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, ua80.b((this.b.hashCode() + (Boolean.hashCode(this.f7278a) * 31)) * 31, 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxySettings(enabled=");
        sb.append(this.f7278a);
        sb.append(", proxyType=");
        sb.append(this.b);
        sb.append(", server=");
        twn.w(this.d, this.c, ", port=", ", username=", sb);
        return ua80.m(sb, this.e, ", password=", this.f, Separators.RPAREN);
    }

    public e6d0(boolean z, t6d0 t6d0Var, String str, int i, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f7278a = z;
        this.b = t6d0Var;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
    }
}
