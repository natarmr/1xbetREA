package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y6b implements d7b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f42089a;
    public final a4x b;
    public final boolean c;

    public y6b(a4x a4xVar, udl0 udl0Var, boolean z) {
        a4xVar.getClass();
        this.f42089a = udl0Var;
        this.b = a4xVar;
        this.c = z;
    }

    @Override // a.d7b
    public final udl0 b() {
        return this.f42089a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6b)) {
            return false;
        }
        y6b y6bVar = (y6b) obj;
        return this.f42089a == y6bVar.f42089a && Intrinsics.d(this.b, y6bVar.b) && this.c == y6bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f42089a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightsLoaded(sportGameType=");
        sb.append(this.f42089a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
