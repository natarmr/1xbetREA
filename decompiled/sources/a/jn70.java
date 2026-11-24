package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16800a;
    public final String b;

    public jn70(String str, boolean z) {
        str.getClass();
        this.f16800a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn70)) {
            return false;
        }
        jn70 jn70Var = (jn70) obj;
        return this.f16800a == jn70Var.f16800a && Intrinsics.d(this.b, jn70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f16800a) * 31);
    }

    public final String toString() {
        return ua80.k("TaxMessageState(visible=", this.f16800a, ", text=", this.b, Separators.RPAREN);
    }
}
