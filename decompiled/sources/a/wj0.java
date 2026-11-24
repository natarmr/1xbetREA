package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wj0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39242a;
    public final String b;

    public wj0(long j, String str) {
        str.getClass();
        this.f39242a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj0)) {
            return false;
        }
        wj0 wj0Var = (wj0) obj;
        return this.f39242a == wj0Var.f39242a && Intrinsics.d(this.b, wj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f39242a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39242a, "AllVirtualGamesByCategoryClick(categoryId=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
