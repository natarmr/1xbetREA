package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z6b implements d7b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f43858a;
    public final a4x b;
    public final boolean c;

    public z6b(a4x a4xVar, udl0 udl0Var, boolean z) {
        a4xVar.getClass();
        this.f43858a = udl0Var;
        this.b = a4xVar;
        this.c = z;
    }

    @Override // a.d7b
    public final udl0 b() {
        return this.f43858a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6b)) {
            return false;
        }
        z6b z6bVar = (z6b) obj;
        return this.f43858a == z6bVar.f43858a && Intrinsics.d(this.b, z6bVar.b) && this.c == z6bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f43858a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsLoaded(sportGameType=");
        sb.append(this.f43858a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
