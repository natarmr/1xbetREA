package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dnz implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vhv0 f6393a;
    public final int b;

    public dnz(vhv0 vhv0Var, int i) {
        this.f6393a = vhv0Var;
        this.b = i;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        if (((k6zVar == k6z.f17794a ? 8 : 2) & this.b) != 0) {
            return this.f6393a.a(w6kVar, k6zVar);
        }
        return 0;
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        if ((this.b & 32) != 0) {
            return this.f6393a.b(w6kVar);
        }
        return 0;
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        if (((k6zVar == k6z.f17794a ? 4 : 1) & this.b) != 0) {
            return this.f6393a.c(w6kVar, k6zVar);
        }
        return 0;
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        if ((this.b & 16) != 0) {
            return this.f6393a.d(w6kVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnz)) {
            return false;
        }
        dnz dnzVar = (dnz) obj;
        return Intrinsics.d(this.f6393a, dnzVar.f6393a) && this.b == dnzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f6393a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = idm0.f14593a;
        if ((i & i2) == i2) {
            idm0.z("Start", sb);
        }
        int i3 = idm0.c;
        if ((i & i3) == i3) {
            idm0.z("Left", sb);
        }
        if ((i & 16) == 16) {
            idm0.z("Top", sb);
        }
        int i4 = idm0.b;
        if ((i & i4) == i4) {
            idm0.z("End", sb);
        }
        int i5 = idm0.d;
        if ((i & i5) == i5) {
            idm0.z("Right", sb);
        }
        if ((i & 32) == 32) {
            idm0.z("Bottom", sb);
        }
        return Separators.LPAREN + this.f6393a + " only " + kng0.l("WindowInsetsSides(", sb.toString(), Separators.RPAREN) + Separators.RPAREN;
    }
}
