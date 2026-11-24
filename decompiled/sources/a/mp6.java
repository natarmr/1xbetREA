package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mp6 implements np6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f22164a;
    public final fop0 b;
    public final a4x c;
    public final boolean d;

    public mp6(imm immVar, fop0 fop0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f22164a = immVar;
        this.b = fop0Var;
        this.c = a4xVar;
        this.d = z;
    }

    @Override // a.np6
    public final imm c() {
        return this.f22164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp6)) {
            return false;
        }
        mp6 mp6Var = (mp6) obj;
        return this.f22164a.equals(mp6Var.f22164a) && this.b.equals(mp6Var.b) && Intrinsics.d(this.c, mp6Var.c) && this.d == mp6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f22164a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(appBarUiModel=");
        sb.append(this.f22164a);
        sb.append(", teamsCardUiModel=");
        sb.append(this.b);
        sb.append(", marketsCardUiModel=");
        return rz4.m(sb, this.c, ", showRelatedGames=", this.d, Separators.RPAREN);
    }
}
