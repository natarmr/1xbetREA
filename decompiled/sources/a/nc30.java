package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nc30 implements oc30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad30 f23272a;
    public final int b;
    public final a4x c;
    public final a4x d;
    public final long e;
    public final mdm f;
    public final boolean g;

    public nc30(ad30 ad30Var, int i, a4x a4xVar, a4x a4xVar2, long j, mdm mdmVar, boolean z) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f23272a = ad30Var;
        this.b = i;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = j;
        this.f = mdmVar;
        this.g = z;
    }

    @Override // a.oc30
    public final boolean a() {
        return this.g;
    }

    @Override // a.oc30
    public final ad30 b() {
        return this.f23272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc30)) {
            return false;
        }
        nc30 nc30Var = (nc30) obj;
        return this.f23272a.equals(nc30Var.f23272a) && this.b == nc30Var.b && Intrinsics.d(this.c, nc30Var.c) && Intrinsics.d(this.d, nc30Var.d) && this.e == nc30Var.e && this.f.equals(nc30Var.f) && this.g == nc30Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + f140.d(this.f, rw2.b(cs0.b(this.d, cs0.b(this.c, twn.a(this.b, this.f23272a.hashCode() * 31, 31), 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f23272a);
        sb.append(", pageCount=");
        sb.append(this.b);
        sb.append(", chipsList=");
        hne.y(sb, this.c, ", ballsList=", this.d, ", checkedChipsPosition=");
        sb.append(this.e);
        sb.append(", emptyPageConfig=");
        sb.append(this.f);
        return f140.n(sb, ", rtlSupport=", this.g, Separators.RPAREN);
    }
}
