package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q3q0 implements r3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28064a;

    public q3q0(List list) {
        list.getClass();
        this.f28064a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3q0) && Intrinsics.d(this.f28064a, ((q3q0) obj).f28064a);
    }

    public final int hashCode() {
        return this.f28064a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f28064a, "Success(items=", Separators.RPAREN);
    }
}
