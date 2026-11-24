package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy6 f41974a;
    public final ln5 b;
    public final px6 c;
    public final wul d;
    public final String e;

    public y3y(zy6 zy6Var, ln5 ln5Var, px6 px6Var, wul wulVar, String str) {
        str.getClass();
        this.f41974a = zy6Var;
        this.b = ln5Var;
        this.c = px6Var;
        this.d = wulVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3y)) {
            return false;
        }
        y3y y3yVar = (y3y) obj;
        return this.f41974a.equals(y3yVar.f41974a) && this.b.equals(y3yVar.b) && this.c.equals(y3yVar.c) && this.d.equals(y3yVar.d) && Intrinsics.d(this.e, y3yVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + i8i.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f41974a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotLiteNoTabBetUiState(betGameInfoUiState=");
        sb.append(this.f41974a);
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
