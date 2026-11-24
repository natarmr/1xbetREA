package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class in00 implements pn00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15051a;

    public in00(Object obj) {
        this.f15051a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in00) && Intrinsics.d(this.f15051a, ((in00) obj).f15051a);
    }

    public final int hashCode() {
        Object obj = this.f15051a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f15051a, "Loaded(data=", Separators.RPAREN);
    }
}
