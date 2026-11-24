package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xij0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40948a;
    public final boolean b;

    public xij0(String str, boolean z) {
        str.getClass();
        this.f40948a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xij0)) {
            return false;
        }
        xij0 xij0Var = (xij0) obj;
        return Intrinsics.d(this.f40948a, xij0Var.f40948a) && this.b == xij0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f40948a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("MatchDescription(text=", this.f40948a, ", visibility=", this.b, Separators.RPAREN);
    }
}
