package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zh1 implements gi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44369a;
    public final boolean b;

    public zh1(String str, boolean z) {
        str.getClass();
        this.f44369a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh1)) {
            return false;
        }
        zh1 zh1Var = (zh1) obj;
        return Intrinsics.d(this.f44369a, zh1Var.f44369a) && this.b == zh1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44369a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("OnProviderClick(providerId=", this.f44369a, ", isChecked=", this.b, Separators.RPAREN);
    }
}
