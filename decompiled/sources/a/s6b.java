package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s6b implements w6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f31694a;
    public final boolean b;
    public final a4x c;

    public s6b(a4x a4xVar, udl0 udl0Var, boolean z) {
        a4xVar.getClass();
        this.f31694a = udl0Var;
        this.b = z;
        this.c = a4xVar;
    }

    @Override // a.w6b
    public final boolean a() {
        return this.b;
    }

    @Override // a.w6b
    public final udl0 b() {
        return this.f31694a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6b)) {
            return false;
        }
        s6b s6bVar = (s6b) obj;
        return this.f31694a == s6bVar.f31694a && this.b == s6bVar.b && Intrinsics.d(this.c, s6bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f31694a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Markets(sportGameType=");
        sb.append(this.f31694a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", items=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
