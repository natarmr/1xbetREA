package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0s f33192a;
    public final kn5 b;
    public final ox6 c;
    public final i8k0 d;
    public final qjx e;
    public final String f;
    public final bz6 g;
    public final wul h;
    public final wul i;
    public final String j;
    public final boolean k;

    public t1y(e0s e0sVar, kn5 kn5Var, ox6 ox6Var, i8k0 i8k0Var, qjx qjxVar, String str, bz6 bz6Var, wul wulVar, wul wulVar2, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f33192a = e0sVar;
        this.b = kn5Var;
        this.c = ox6Var;
        this.d = i8k0Var;
        this.e = qjxVar;
        this.f = str;
        this.g = bz6Var;
        this.h = wulVar;
        this.i = wulVar2;
        this.j = str2;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1y)) {
            return false;
        }
        t1y t1yVar = (t1y) obj;
        return this.f33192a.equals(t1yVar.f33192a) && this.b.equals(t1yVar.b) && this.c.equals(t1yVar.c) && this.d.equals(t1yVar.d) && this.e.equals(t1yVar.e) && Intrinsics.d(this.f, t1yVar.f) && this.g.equals(t1yVar.g) && this.h.equals(t1yVar.h) && this.i.equals(t1yVar.i) && Intrinsics.d(this.j, t1yVar.j) && this.k == t1yVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b(i8i.a(this.i, i8i.a(this.h, (this.g.hashCode() + ua80.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f33192a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31, 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotFullscreenSliderUiState(gameCardUiState=");
        sb.append(this.f33192a);
        sb.append(", balanceUiState=");
        sb.append(this.b);
        sb.append(", betFieldUiState=");
        sb.append(this.c);
        sb.append(", sliderUiState=");
        sb.append(this.d);
        sb.append(", insufficientFundsUiState=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", betGameInfoUiState=");
        sb.append(this.g);
        sb.append(", plusButtonUiModel=");
        sb.append(this.h);
        sb.append(", makeBetButtonUiModel=");
        sb.append(this.i);
        sb.append(", taxInfoLabel=");
        sb.append(this.j);
        sb.append(", isInsufficientFunds=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
