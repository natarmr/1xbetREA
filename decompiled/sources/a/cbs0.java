package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cbs0 implements dbs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f4076a;

    public cbs0(i4 i4Var) {
        i4Var.getClass();
        this.f4076a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbs0) && Intrinsics.d(this.f4076a, ((cbs0) obj).f4076a);
    }

    public final int hashCode() {
        return this.f4076a.hashCode();
    }

    public final String toString() {
        return "Shimmers(items=" + this.f4076a + Separators.RPAREN;
    }
}
