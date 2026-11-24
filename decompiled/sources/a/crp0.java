package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class crp0 implements erp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f4856a;

    public crp0(Set set) {
        set.getClass();
        this.f4856a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crp0) && Intrinsics.d(this.f4856a, ((crp0) obj).f4856a);
    }

    public final int hashCode() {
        return this.f4856a.hashCode();
    }

    public final String toString() {
        return "Initiated(ids=" + this.f4856a + Separators.RPAREN;
    }
}
