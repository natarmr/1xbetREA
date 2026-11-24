package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e7v implements g7v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7345a;

    public e7v(i4 i4Var) {
        i4Var.getClass();
        this.f7345a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7v) && Intrinsics.d(this.f7345a, ((e7v) obj).f7345a);
    }

    public final int hashCode() {
        return this.f7345a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f7345a, "Chips(chips=", Separators.RPAREN);
    }
}
