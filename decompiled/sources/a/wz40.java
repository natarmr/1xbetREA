package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wz40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40005a;

    public wz40(Object obj) {
        this.f40005a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz40) && Intrinsics.d(this.f40005a, ((wz40) obj).f40005a);
    }

    public final int hashCode() {
        Object obj = this.f40005a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f40005a, "MutableValueHolder(value=", Separators.RPAREN);
    }
}
