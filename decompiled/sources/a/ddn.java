package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ddn implements gdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f5903a;
    public final boolean b;
    public final a4x c;
    public final boolean d;

    public ddn(udl0 udl0Var, boolean z, a4x a4xVar, boolean z2) {
        a4xVar.getClass();
        this.f5903a = udl0Var;
        this.b = z;
        this.c = a4xVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddn)) {
            return false;
        }
        ddn ddnVar = (ddn) obj;
        return this.f5903a == ddnVar.f5903a && this.b == ddnVar.b && Intrinsics.d(this.c, ddnVar.c) && this.d == ddnVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, brm0.e(this.f5903a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsLoaded(sportGameType=");
        sb.append(this.f5903a);
        sb.append(", isClassicRefactorEnabled=");
        sb.append(this.b);
        sb.append(", items=");
        return rz4.m(sb, this.c, ", rtlSupport=", this.d, Separators.RPAREN);
    }
}
