package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class exs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fxs0 f8594a;
    public final fxs0 b;
    public final n5l0 c;
    public final n5l0 d;
    public final n5l0 e;
    public final gad f;
    public final String g;

    public exs0(fxs0 fxs0Var, fxs0 fxs0Var2, n5l0 n5l0Var, n5l0 n5l0Var2, n5l0 n5l0Var3, gad gadVar, String str) {
        this.f8594a = fxs0Var;
        this.b = fxs0Var2;
        this.c = n5l0Var;
        this.d = n5l0Var2;
        this.e = n5l0Var3;
        this.f = gadVar;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exs0)) {
            return false;
        }
        exs0 exs0Var = (exs0) obj;
        return this.f8594a.equals(exs0Var.f8594a) && this.b.equals(exs0Var.b) && Intrinsics.d(this.c, exs0Var.c) && Intrinsics.d(this.d, exs0Var.d) && Intrinsics.d(this.e, exs0Var.e) && this.f == exs0Var.f && this.g.equals(exs0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8594a.hashCode() * 31)) * 31;
        n5l0 n5l0Var = this.c;
        int iHashCode2 = (iHashCode + (n5l0Var == null ? 0 : n5l0Var.hashCode())) * 31;
        n5l0 n5l0Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (n5l0Var2 == null ? 0 : n5l0Var2.hashCode())) * 31;
        n5l0 n5l0Var3 = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (n5l0Var3 != null ? n5l0Var3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairsCompactLiveEventCardModel(teamOne=");
        sb.append(this.f8594a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", teamSetScore=");
        sb.append(this.c);
        sb.append(", teamGameScore=");
        sb.append(this.d);
        sb.append(", teamResultScore=");
        sb.append(this.e);
        sb.append(", gameIndicator=");
        sb.append(this.f);
        sb.append(", infoLabel=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
