package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z2p implements b3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f43681a;
    public final imm b;

    public z2p(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f43681a = a4xVar;
        this.b = immVar;
    }

    @Override // a.b3p
    public final imm a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2p)) {
            return false;
        }
        z2p z2pVar = (z2p) obj;
        return Intrinsics.d(this.f43681a, z2pVar.f43681a) && this.b.equals(z2pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43681a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f43681a + ", dsNavigationBarUiModel=" + this.b + Separators.RPAREN;
    }
}
