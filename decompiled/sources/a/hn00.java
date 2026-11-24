package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hn00 implements on00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13329a;

    public hn00(Object obj) {
        this.f13329a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn00) && Intrinsics.d(this.f13329a, ((hn00) obj).f13329a);
    }

    public final int hashCode() {
        Object obj = this.f13329a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f13329a, "Loaded(data=", Separators.RPAREN);
    }
}
