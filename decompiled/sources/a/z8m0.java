package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z8m0 implements f3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43975a;

    public z8m0(Object obj) {
        this.f43975a = obj;
    }

    @Override // a.f3u0
    public final Object a(bh90 bh90Var) {
        return this.f43975a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8m0) && Intrinsics.d(this.f43975a, ((z8m0) obj).f43975a);
    }

    public final int hashCode() {
        Object obj = this.f43975a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f43975a, "StaticValueHolder(value=", Separators.RPAREN);
    }
}
