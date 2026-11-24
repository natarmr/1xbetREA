package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/yij;", "La/um40;", "La/xij;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class yij extends um40 {
    public final ltc b;

    public yij(ltc ltcVar) {
        this.b = ltcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yij) && this.b.equals(((yij) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new xij(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        xij xijVar = (xij) lm40Var;
        xijVar.getClass();
        xijVar.q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DebounceNodeElement(options=" + this.b + Separators.RPAREN;
    }
}
