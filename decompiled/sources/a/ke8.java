package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ke8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9n f18141a;
    public final a570 b;
    public final hcs c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ke8(l9n l9nVar, a570 a570Var, hcs hcsVar, String str, boolean z, boolean z2, boolean z3) {
        a570Var.getClass();
        hcsVar.getClass();
        str.getClass();
        this.f18141a = l9nVar;
        this.b = a570Var;
        this.c = hcsVar;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke8)) {
            return false;
        }
        ke8 ke8Var = (ke8) obj;
        return this.f18141a.equals(ke8Var.f18141a) && Intrinsics.d(this.b, ke8Var.b) && this.c == ke8Var.c && Intrinsics.d(this.d, ke8Var.d) && this.e == ke8Var.e && this.f == ke8Var.f && this.g == ke8Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f18141a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusGameCardStateModel(uiModel=");
        sb.append(this.f18141a);
        sb.append(", gameType=");
        sb.append(this.b);
        sb.append(", gameFlag=");
        sb.append(this.c);
        sb.append(", gameName=");
        sb.append(this.d);
        sb.append(", forceIFrame=");
        ua80.u(", fullScreenEnable=", ", underMaintenance=", sb, this.e, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
