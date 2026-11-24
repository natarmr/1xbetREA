package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class up0 implements bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36037a;
    public final long b;

    public up0(String str, long j) {
        str.getClass();
        this.f36037a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up0)) {
            return false;
        }
        up0 up0Var = (up0) obj;
        return Intrinsics.d(this.f36037a, up0Var.f36037a) && this.b == up0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f36037a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnChipClick(categoryId=", this.f36037a, ", chipId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
