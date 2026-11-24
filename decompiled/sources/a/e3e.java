package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e3e implements p6z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2e f7129a;
    public final Function1 b;
    public final Object c;

    public e3e(u2e u2eVar, Function1 function1) {
        this.f7129a = u2eVar;
        this.b = function1;
        this.c = u2eVar.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e3e)) {
            return false;
        }
        e3e e3eVar = (e3e) obj;
        return Intrinsics.d(this.f7129a.b, e3eVar.f7129a.b) && this.b == e3eVar.b;
    }

    @Override // a.p6z
    public final Object g0() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7129a.b.hashCode() * 31);
    }
}
