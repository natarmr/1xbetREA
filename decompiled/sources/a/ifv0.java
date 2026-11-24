package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ifv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao60 f14706a;
    public final String b;
    public final wul c;
    public final ov60 d;

    public ifv0(ao60 ao60Var, String str, wul wulVar, ov60 ov60Var) {
        this.f14706a = ao60Var;
        this.b = str;
        this.c = wulVar;
        this.d = ov60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifv0)) {
            return false;
        }
        ifv0 ifv0Var = (ifv0) obj;
        return this.f14706a.equals(ifv0Var.f14706a) && this.b.equals(ifv0Var.b) && this.c.equals(ifv0Var.c) && this.d.equals(ifv0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, ua80.b(this.f14706a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "WildFreeBetBottomSheetUiState(recommendedGameUiModel=" + this.f14706a + ", gamesListTitle=" + this.b + ", buttonUiModel=" + this.c + ", gamesCollectionModel=" + this.d + Separators.RPAREN;
    }
}
