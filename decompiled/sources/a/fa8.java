package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fa8 implements ga8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9195a;

    public fa8(gj0 gj0Var) {
        this.f9195a = gj0Var;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f9195a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa8) && Intrinsics.d(this.f9195a, ((fa8) obj).f9195a);
    }

    public final int hashCode() {
        Object obj = this.f9195a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f9195a, "SilentLoading(config=", Separators.RPAREN);
    }
}
