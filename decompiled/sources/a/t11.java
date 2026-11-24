package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t11 implements w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f33146a;
    public final bd b;
    public final mdm c;

    public t11(imm immVar, bd bdVar, mdm mdmVar) {
        immVar.getClass();
        bdVar.getClass();
        mdmVar.getClass();
        this.f33146a = immVar;
        this.b = bdVar;
        this.c = mdmVar;
    }

    @Override // a.w11
    public final imm a() {
        return this.f33146a;
    }

    @Override // a.w11
    public final bd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t11)) {
            return false;
        }
        t11 t11Var = (t11) obj;
        return Intrinsics.d(this.f33146a, t11Var.f33146a) && Intrinsics.d(this.b, t11Var.b) && Intrinsics.d(this.c, t11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f33146a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(navigationBarUiModel=");
        sb.append(this.f33146a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", emptyConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
