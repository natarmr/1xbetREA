package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zx30 implements fy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45140a;
    public final o0x b;

    public zx30(o0x o0xVar, int i) {
        boolean z = (i & 1) != 0;
        zcl zclVar = qmk.f28987a;
        o0xVar.getClass();
        this.f45140a = z;
        this.b = o0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx30)) {
            return false;
        }
        zx30 zx30Var = (zx30) obj;
        return this.f45140a == zx30Var.f45140a && ycl.b(0.0f, 0.0f) && Intrinsics.d(this.b, zx30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + defpackage.c.a(Boolean.hashCode(this.f45140a) * 31, 0.0f, 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("Banner(responsive=", ", endPadding=", ycl.c(0.0f), this.f45140a, ", bannerUrl=");
        sbQ.append(this.b);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
