package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kn8 implements mn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18571a;
    public final boolean b;

    public kn8(String str, boolean z) {
        str.getClass();
        this.f18571a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn8)) {
            return false;
        }
        kn8 kn8Var = (kn8) obj;
        return Intrinsics.d(this.f18571a, kn8Var.f18571a) && this.b == kn8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18571a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ApplyButton(title=", this.f18571a, ", isEnable=", this.b, Separators.RPAREN);
    }
}
