package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f3e extends x0x implements ep80 {
    public final u2e b;
    public final Function1 c;

    public f3e(u2e u2eVar, Function1 function1) {
        this.b = u2eVar;
        this.c = function1;
    }

    @Override // a.ep80
    public final Object d(w6k w6kVar) {
        return new e3e(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        f3e f3eVar = obj instanceof f3e ? (f3e) obj : null;
        return this.c == (f3eVar != null ? f3eVar.c : null);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
