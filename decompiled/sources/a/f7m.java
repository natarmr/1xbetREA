package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9064a;

    public f7m(i4 i4Var) {
        i4Var.getClass();
        this.f9064a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7m) && Intrinsics.d(this.f9064a, ((f7m) obj).f9064a);
    }

    public final int hashCode() {
        return this.f9064a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f9064a, "DsCyberGameTableDataColumn(cells=", Separators.RPAREN);
    }
}
