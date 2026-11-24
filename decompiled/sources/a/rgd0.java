package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rgd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30429a;
    public final boolean b;

    public rgd0(String str, boolean z) {
        str.getClass();
        this.f30429a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgd0)) {
            return false;
        }
        rgd0 rgd0Var = (rgd0) obj;
        return Intrinsics.d(this.f30429a, rgd0Var.f30429a) && this.b == rgd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f30429a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ThirdButtonState(title=", this.f30429a, ", enable=", this.b, Separators.RPAREN);
    }
}
