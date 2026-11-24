package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nhe implements fie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23527a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nhe(a4x a4xVar, boolean z, boolean z2, boolean z3) {
        a4xVar.getClass();
        this.f23527a = a4xVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhe)) {
            return false;
        }
        nhe nheVar = (nhe) obj;
        return Intrinsics.d(this.f23527a, nheVar.f23527a) && this.b == nheVar.b && this.c == nheVar.c && this.d == nheVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f23527a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadedViewed(content=");
        sb.append(this.f23527a);
        sb.append(", isTablet=");
        sb.append(this.b);
        sb.append(", refreshing=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.c, this.d);
    }
}
