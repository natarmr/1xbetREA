package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zgh0 implements ahh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44345a;
    public final int b;

    public zgh0(String str, int i) {
        str.getClass();
        this.f44345a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgh0)) {
            return false;
        }
        zgh0 zgh0Var = (zgh0) obj;
        return Intrinsics.d(this.f44345a, zgh0Var.f44345a) && this.b == zgh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f44345a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "WithFilter(query=", this.f44345a, ", selectedFilterIndex=", Separators.RPAREN);
    }
}
