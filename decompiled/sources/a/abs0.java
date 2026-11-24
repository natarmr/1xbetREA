package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class abs0 implements dbs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f595a;

    public abs0(i4 i4Var) {
        i4Var.getClass();
        this.f595a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abs0) && Intrinsics.d(this.f595a, ((abs0) obj).f595a);
    }

    public final int hashCode() {
        return this.f595a.hashCode();
    }

    public final String toString() {
        return "Content(items=" + this.f595a + Separators.RPAREN;
    }
}
