package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lws0 f19018a;
    public final lws0 b;
    public final n5l0 c;
    public final n5l0 d;
    public final n5l0 e;
    public final gad f;
    public final String g;

    public kws0(lws0 lws0Var, lws0 lws0Var2, n5l0 n5l0Var, n5l0 n5l0Var2, n5l0 n5l0Var3, gad gadVar, String str) {
        this.f19018a = lws0Var;
        this.b = lws0Var2;
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
        if (!(obj instanceof kws0)) {
            return false;
        }
        kws0 kws0Var = (kws0) obj;
        return this.f19018a.equals(kws0Var.f19018a) && this.b.equals(kws0Var.b) && Intrinsics.d(this.c, kws0Var.c) && Intrinsics.d(this.d, kws0Var.d) && Intrinsics.d(this.e, kws0Var.e) && this.f == kws0Var.f && this.g.equals(kws0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f19018a.hashCode() * 31)) * 31;
        n5l0 n5l0Var = this.c;
        int iHashCode2 = (iHashCode + (n5l0Var == null ? 0 : n5l0Var.hashCode())) * 31;
        n5l0 n5l0Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (n5l0Var2 == null ? 0 : n5l0Var2.hashCode())) * 31;
        n5l0 n5l0Var3 = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (n5l0Var3 != null ? n5l0Var3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponentsColumnsCompactLiveEventCardModel(teamOne=");
        sb.append(this.f19018a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", setScore=");
        sb.append(this.c);
        sb.append(", gameScore=");
        sb.append(this.d);
        sb.append(", resultScore=");
        sb.append(this.e);
        sb.append(", gameIndicator=");
        sb.append(this.f);
        sb.append(", infoLabel=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
