package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ea8 implements ga8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7455a;

    public ea8(Object obj) {
        this.f7455a = obj;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f7455a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea8) && Intrinsics.d(this.f7455a, ((ea8) obj).f7455a);
    }

    public final int hashCode() {
        Object obj = this.f7455a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f7455a, "ExplicitLoading(config=", Separators.RPAREN);
    }
}
