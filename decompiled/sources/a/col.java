package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class col implements dol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0i f4706a;
    public final Integer b;

    public col(b0i b0iVar) {
        this.f4706a = b0iVar;
        this.b = null;
    }

    @Override // a.dol
    public final b0i a() {
        return this.f4706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof col)) {
            return false;
        }
        col colVar = (col) obj;
        return Intrinsics.d(this.f4706a, colVar.f4706a) && Intrinsics.d(this.b, colVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4706a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Loading(appearance=" + this.f4706a + ", manualShimmerRowsCount=" + this.b + Separators.RPAREN;
    }

    public col(b0i b0iVar, Integer num) {
        this.f4706a = b0iVar;
        this.b = num;
    }
}
