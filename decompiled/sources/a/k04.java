package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17445a;

    public final boolean equals(Object obj) {
        if (obj instanceof k04) {
            return Intrinsics.d(this.f17445a, ((k04) obj).f17445a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f17445a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f17445a, "AsyncTypefaceResult(result=", Separators.RPAREN);
    }
}
