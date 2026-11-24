package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y5y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0s f42070a;
    public final nn5 b;
    public final rx6 c;
    public final wul d;
    public final wul e;
    public final String f;

    public y5y(d0s d0sVar, nn5 nn5Var, rx6 rx6Var, wul wulVar, wul wulVar2, String str) {
        str.getClass();
        this.f42070a = d0sVar;
        this.b = nn5Var;
        this.c = rx6Var;
        this.d = wulVar;
        this.e = wulVar2;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5y)) {
            return false;
        }
        y5y y5yVar = (y5y) obj;
        return this.f42070a.equals(y5yVar.f42070a) && this.b.equals(y5yVar.b) && this.c.equals(y5yVar.c) && this.d.equals(y5yVar.d) && this.e.equals(y5yVar.e) && Intrinsics.d(this.f, y5yVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i8i.a(this.e, i8i.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f42070a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "JackpotMediumNoGameInfoUiState(gameCardUiState=" + this.f42070a + ", balanceUiState=" + this.b + ", betFieldUiState=" + this.c + ", plusButtonUiModel=" + this.d + ", makeBetButtonUiModel=" + this.e + ", taxInfoLabel=" + this.f + Separators.RPAREN;
    }
}
