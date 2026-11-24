package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/x7z;", "La/um40;", "La/y7z;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x7z extends um40 {
    public final float b;
    public final boolean c;

    public x7z(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        x7z x7zVar = obj instanceof x7z ? (x7z) obj : null;
        return x7zVar != null && this.b == x7zVar.b && this.c == x7zVar.c;
    }

    @Override // a.um40
    public final lm40 f() {
        y7z y7zVar = new y7z();
        y7zVar.o = this.b;
        y7zVar.p = this.c;
        return y7zVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        y7z y7zVar = (y7z) lm40Var;
        y7zVar.o = this.b;
        y7zVar.p = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
