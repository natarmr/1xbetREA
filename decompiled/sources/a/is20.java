package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class is20 implements js20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15285a;
    public final String b;

    public is20(long j, String str) {
        str.getClass();
        this.f15285a = j;
        this.b = str;
    }

    @Override // a.js20
    public final long a() {
        return this.f15285a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is20)) {
            return false;
        }
        is20 is20Var = (is20) obj;
        return this.f15285a == is20Var.f15285a && Intrinsics.d(this.b, is20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f15285a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f15285a, "Category(marketTypeId=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
