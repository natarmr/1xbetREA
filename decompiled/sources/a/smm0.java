package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class smm0 implements umm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1n f32454a;
    public final i1n b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final pgm g;
    public final pgm h;

    public smm0(i1n i1nVar, i1n i1nVar2, String str, String str2, String str3, String str4, pgm pgmVar, pgm pgmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        str2.getClass();
        this.f32454a = i1nVar;
        this.b = i1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = pgmVar;
        this.h = pgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smm0)) {
            return false;
        }
        smm0 smm0Var = (smm0) obj;
        if (!this.f32454a.equals(smm0Var.f32454a) || !this.b.equals(smm0Var.b) || !Intrinsics.d(this.c, smm0Var.c) || !Intrinsics.d(this.d, smm0Var.d) || !this.e.equals(smm0Var.e) || !this.f.equals(smm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.g.equals(smm0Var.g) && this.h.equals(smm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f32454a.hashCode() * 31)) * 29791, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f32454a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", seedingLeft=");
        f140.v(sb, this.e, ", seedingRight=", this.f, ", lowerBracket=");
        sb.append(x0mVar);
        sb.append(", startResultIndicator=");
        sb.append(this.g);
        sb.append(", endResultIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
