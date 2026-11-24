package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class e4w implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7203a;
    public final int b;
    public final d4w c;

    public e4w(int i, int i2, d4w d4wVar) {
        this.f7203a = i;
        this.b = i2;
        this.c = d4wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4w)) {
            return false;
        }
        e4w e4wVar = (e4w) obj;
        return this.f7203a == e4wVar.f7203a && this.b == e4wVar.b && this.c == e4wVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f7203a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("HistoryMenuItemUiModel(title=", this.f7203a, ", icon=", ", type=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
