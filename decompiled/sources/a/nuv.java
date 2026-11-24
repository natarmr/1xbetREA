package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nuv implements ouv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytv f24163a;
    public final a4x b;
    public final mdm c;
    public final boolean d;
    public final i4 e;

    public nuv(ytv ytvVar, a4x a4xVar, mdm mdmVar, boolean z) {
        i4 i4VarG0;
        a4xVar.getClass();
        this.f24163a = ytvVar;
        this.b = a4xVar;
        this.c = mdmVar;
        this.d = z;
        zdm0 zdm0Var = ytvVar.f43239a;
        ydm0 ydm0Var = zdm0Var instanceof ydm0 ? (ydm0) zdm0Var : null;
        vdm0 vdm0Var = ydm0Var != null ? ydm0Var.b : null;
        if (vdm0Var instanceof tdm0) {
            tdm0 tdm0Var = (tdm0) vdm0Var;
            i4VarG0 = dyb.g0(tdm0Var.c.b, tdm0Var.d.b);
        } else {
            i4VarG0 = lak0.c;
        }
        this.e = i4VarG0;
    }

    @Override // a.ouv
    public final boolean a() {
        return this.d;
    }

    @Override // a.ouv
    public final ytv b() {
        return this.f24163a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuv)) {
            return false;
        }
        nuv nuvVar = (nuv) obj;
        return this.f24163a.equals(nuvVar.f24163a) && Intrinsics.d(this.b, nuvVar.b) && this.c.equals(nuvVar.c) && this.d == nuvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f140.d(this.c, cs0.b(this.b, this.f24163a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.f24163a + ", items=" + this.b + ", emptyConfig=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
