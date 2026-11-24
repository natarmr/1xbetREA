package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u11 implements w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f34881a;
    public final bd b;
    public final j7v c;
    public final a4x d;
    public final mdm e;

    public u11(imm immVar, bd bdVar, j7v j7vVar, i4 i4Var, mdm mdmVar) {
        immVar.getClass();
        bdVar.getClass();
        j7vVar.getClass();
        i4Var.getClass();
        mdmVar.getClass();
        this.f34881a = immVar;
        this.b = bdVar;
        this.c = j7vVar;
        this.d = i4Var;
        this.e = mdmVar;
    }

    @Override // a.w11
    public final imm a() {
        return this.f34881a;
    }

    @Override // a.w11
    public final bd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u11)) {
            return false;
        }
        u11 u11Var = (u11) obj;
        return Intrinsics.d(this.f34881a, u11Var.f34881a) && Intrinsics.d(this.b, u11Var.b) && Intrinsics.d(this.c, u11Var.c) && Intrinsics.d(this.d, u11Var.d) && Intrinsics.d(this.e, u11Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f34881a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyWithTopGames(navigationBarUiModel=");
        sb.append(this.f34881a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", chipsModel=");
        sb.append(this.c);
        sb.append(", topGames=");
        sb.append(this.d);
        sb.append(", emptyConfig=");
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
