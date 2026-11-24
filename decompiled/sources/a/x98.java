package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x98 implements ha8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40498a;

    public x98(gj0 gj0Var) {
        this.f40498a = gj0Var;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f40498a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x98) && Intrinsics.d(this.f40498a, ((x98) obj).f40498a);
    }

    public final int hashCode() {
        Object obj = this.f40498a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f40498a, "Configuration(config=", Separators.RPAREN);
    }
}
