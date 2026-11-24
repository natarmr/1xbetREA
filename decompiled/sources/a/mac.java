package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/mac;", "La/um40;", "La/lac;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mac extends um40 {
    public final e6c b;

    public mac(e6c e6cVar) {
        this.b = e6cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mac) {
            return this.b == ((mac) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        lac lacVar = new lac();
        lacVar.o = this.b;
        return lacVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        lac lacVar = (lac) lm40Var;
        lacVar.o = this.b;
        s0x.S(lacVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
