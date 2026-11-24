package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ca8 implements ha8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3995a;

    public ca8(Object obj) {
        this.f3995a = obj;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f3995a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca8) && Intrinsics.d(this.f3995a, ((ca8) obj).f3995a);
    }

    public final int hashCode() {
        Object obj = this.f3995a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f3995a, "Initialize(config=", Separators.RPAREN);
    }
}
