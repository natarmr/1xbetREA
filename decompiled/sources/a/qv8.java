package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qv8 implements rv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29376a;

    public qv8(i4 i4Var) {
        i4Var.getClass();
        this.f29376a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv8) && Intrinsics.d(this.f29376a, ((qv8) obj).f29376a);
    }

    public final int hashCode() {
        return this.f29376a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f29376a, "Loading(filterItems=", Separators.RPAREN);
    }
}
