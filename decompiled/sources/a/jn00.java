package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jn00 implements rn00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16791a;

    public jn00(Object obj) {
        this.f16791a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn00) && Intrinsics.d(this.f16791a, ((jn00) obj).f16791a);
    }

    public final int hashCode() {
        Object obj = this.f16791a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f16791a, "Loaded(data=", Separators.RPAREN);
    }
}
