package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class quh0 implements tuh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29345a;
    public final List b;
    public final Boolean c;

    public quh0(boolean z, List list, Boolean bool) {
        list.getClass();
        this.f29345a = z;
        this.b = list;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quh0)) {
            return false;
        }
        quh0 quh0Var = (quh0) obj;
        return this.f29345a == quh0Var.f29345a && Intrinsics.d(this.b, quh0Var.b) && Intrinsics.d(this.c, quh0Var.c);
    }

    public final int hashCode() {
        int iA = dw9.a(Boolean.hashCode(this.f29345a) * 31, 31, this.b);
        Boolean bool = this.c;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(isPromoAvailable=");
        sb.append(this.f29345a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", hasSecurityQuestion=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
