package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y98 implements ha8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42233a;

    public y98(Object obj) {
        this.f42233a = obj;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f42233a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y98) && Intrinsics.d(this.f42233a, ((y98) obj).f42233a);
    }

    public final int hashCode() {
        Object obj = this.f42233a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f42233a, "Empty(config=", Separators.RPAREN);
    }
}
