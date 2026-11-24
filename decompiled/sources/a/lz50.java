package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lz50 implements nz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20891a;
    public final Throwable b;

    public lz50(Object obj, Throwable th) {
        th.getClass();
        this.f20891a = obj;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz50)) {
            return false;
        }
        lz50 lz50Var = (lz50) obj;
        return Intrinsics.d(this.f20891a, lz50Var.f20891a) && Intrinsics.d(this.b, lz50Var.b);
    }

    public final int hashCode() {
        Object obj = this.f20891a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(defaultData=" + this.f20891a + ", error=" + this.b + Separators.RPAREN;
    }
}
