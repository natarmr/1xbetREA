package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hg1 implements kg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12996a;
    public final ad b;
    public final a4x c;

    public hg1(String str, ad adVar, a4x a4xVar) {
        str.getClass();
        adVar.getClass();
        a4xVar.getClass();
        this.f12996a = str;
        this.b = adVar;
        this.c = a4xVar;
    }

    @Override // a.kg1
    public final String a() {
        return this.f12996a;
    }

    @Override // a.kg1
    public final ad b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg1)) {
            return false;
        }
        hg1 hg1Var = (hg1) obj;
        return Intrinsics.d(this.f12996a, hg1Var.f12996a) && Intrinsics.d(this.b, hg1Var.b) && Intrinsics.d(this.c, hg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f12996a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(screenTitle=");
        sb.append(this.f12996a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", items=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
