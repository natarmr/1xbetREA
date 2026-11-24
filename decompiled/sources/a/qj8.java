package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qj8 implements sj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f28824a;
    public final boolean b;
    public final String c;
    public final jjm d;
    public final a4x e;

    public qj8(imm immVar, boolean z, String str, jjm jjmVar, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f28824a = immVar;
        this.b = z;
        this.c = str;
        this.d = jjmVar;
        this.e = a4xVar;
    }

    @Override // a.sj8
    public final imm a() {
        return this.f28824a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj8)) {
            return false;
        }
        qj8 qj8Var = (qj8) obj;
        return this.f28824a.equals(qj8Var.f28824a) && this.b == qj8Var.b && Intrinsics.d(this.c, qj8Var.c) && this.d.equals(qj8Var.d) && Intrinsics.d(this.e, qj8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(brm0.e(this.f28824a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(navBarUiModel=");
        sb.append(this.f28824a);
        sb.append(", bioLoading=");
        sb.append(this.b);
        sb.append(", bioText=");
        sb.append(this.c);
        sb.append(", listHeaderModel=");
        sb.append(this.d);
        sb.append(", items=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
