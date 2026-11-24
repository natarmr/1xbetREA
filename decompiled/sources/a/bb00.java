package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bb00 implements cb00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2284a;
    public final String b;
    public final int c;
    public final a4x d;
    public final a4x e;
    public final a4x f;
    public final boolean g;

    public bb00(boolean z, String str, int i, a4x a4xVar, a4x a4xVar2, a4x a4xVar3, boolean z2) {
        str.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f2284a = z;
        this.b = str;
        this.c = i;
        this.d = a4xVar;
        this.e = a4xVar2;
        this.f = a4xVar3;
        this.g = z2;
    }

    @Override // a.cb00
    public final boolean a() {
        return this.f2284a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb00)) {
            return false;
        }
        bb00 bb00Var = (bb00) obj;
        return this.f2284a == bb00Var.f2284a && Intrinsics.d(this.b, bb00Var.b) && this.c == bb00Var.c && Intrinsics.d(this.d, bb00Var.d) && Intrinsics.d(this.e, bb00Var.e) && Intrinsics.d(this.f, bb00Var.f) && this.g == bb00Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cs0.b(this.f, cs0.b(this.e, cs0.b(this.d, twn.a(this.c, ua80.b(Boolean.hashCode(this.f2284a) * 31, 31, this.b), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("Success(hasHeader=", ", title=", this.b, this.f2284a, ", selectedTab=");
        sbQ.append(this.c);
        sbQ.append(", tabsTitleList=");
        sbQ.append(this.d);
        sbQ.append(", teamUiModelList=");
        hne.y(sbQ, this.e, ", lineupUiModelList=", this.f, ", rtlSupport=");
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
