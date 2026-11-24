package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nw implements ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f24211a;

    public nw(imm immVar) {
        immVar.getClass();
        this.f24211a = immVar;
    }

    @Override // a.ow
    public final imm a() {
        return this.f24211a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw) && Intrinsics.d(this.f24211a, ((nw) obj).f24211a);
    }

    public final int hashCode() {
        return this.f24211a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f24211a, "Loading(navigationBarUiModel=", Separators.RPAREN);
    }
}
