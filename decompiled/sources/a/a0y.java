package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az6 f43a;
    public final mn5 b;
    public final qx6 c;
    public final wul d;
    public final String e;

    public a0y(az6 az6Var, mn5 mn5Var, qx6 qx6Var, wul wulVar, String str) {
        str.getClass();
        this.f43a = az6Var;
        this.b = mn5Var;
        this.c = qx6Var;
        this.d = wulVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0y)) {
            return false;
        }
        a0y a0yVar = (a0y) obj;
        return this.f43a.equals(a0yVar.f43a) && this.b.equals(a0yVar.b) && this.c.equals(a0yVar.c) && this.d.equals(a0yVar.d) && Intrinsics.d(this.e, a0yVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + i8i.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f43a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotBetUiState(betGameInfoUiState=");
        sb.append(this.f43a);
        sb.append(", balanceUiState=");
        sb.append(this.b);
        sb.append(", betFieldUiState=");
        sb.append(this.c);
        sb.append(", makeBetBtnUiModel=");
        sb.append(this.d);
        sb.append(", taxInfoLabel=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
