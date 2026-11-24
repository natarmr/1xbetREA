package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0i implements h0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0i f8718a;
    public final i0i b;

    public f0i(i0i i0iVar, i0i i0iVar2) {
        this.f8718a = i0iVar;
        this.b = i0iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0i)) {
            return false;
        }
        f0i f0iVar = (f0i) obj;
        return this.f8718a.equals(f0iVar.f8718a) && Intrinsics.d(this.b, f0iVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f8718a.hashCode() * 31;
        i0i i0iVar = this.b;
        return iHashCode + (i0iVar == null ? 0 : i0iVar.hashCode());
    }

    public final String toString() {
        return "Content(firstItem=" + this.f8718a + ", secondItem=" + this.b + Separators.RPAREN;
    }
}
