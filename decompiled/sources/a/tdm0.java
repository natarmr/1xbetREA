package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tdm0 implements vdm0, rdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33776a;
    public final p5h0 b;
    public final znp0 c;
    public final znp0 d;
    public final int e;
    public final int f;
    public final mom0 g;

    public tdm0(String str, p5h0 p5h0Var, znp0 znp0Var, znp0 znp0Var2, int i, int i2, mom0 mom0Var) {
        str.getClass();
        this.f33776a = str;
        this.b = p5h0Var;
        this.c = znp0Var;
        this.d = znp0Var2;
        this.e = i;
        this.f = i2;
        this.g = mom0Var;
    }

    @Override // a.rdm0
    public final znp0 a() {
        return this.c;
    }

    @Override // a.rdm0
    public final znp0 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdm0)) {
            return false;
        }
        tdm0 tdm0Var = (tdm0) obj;
        return Intrinsics.d(this.f33776a, tdm0Var.f33776a) && this.b.equals(tdm0Var.b) && this.c.equals(tdm0Var.c) && this.d.equals(tdm0Var.d) && this.e == tdm0Var.e && this.f == tdm0Var.f && this.g.equals(tdm0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f33776a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Score(eventTitle=");
        sb.append(this.f33776a);
        sb.append(", scoreUiModel=");
        sb.append(this.b);
        sb.append(", teamOne=");
        sb.append(this.c);
        sb.append(", teamTwo=");
        sb.append(this.d);
        sb.append(", redCardTeamOne=");
        axq.r(this.e, this.f, ", redCardTeamTwo=", ", gameStatusUiModel=", sb);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
