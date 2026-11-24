package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gj9 implements hj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11385a;

    public gj9(List list) {
        list.getClass();
        this.f11385a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj9) && Intrinsics.d(this.f11385a, ((gj9) obj).f11385a);
    }

    @Override // a.hj9
    public final List getData() {
        return this.f11385a;
    }

    public final int hashCode() {
        return this.f11385a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f11385a, "Updated(data=", Separators.RPAREN);
    }
}
