package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class i73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxs0 f14271a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final pz40 e;
    public t73 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final pz40 i = androidx.compose.runtime.e.e(Boolean.TRUE);

    public i73(Object obj, lxs0 lxs0Var, t73 t73Var, long j, Object obj2, long j2, Function0 function0) {
        this.f14271a = lxs0Var;
        this.b = obj2;
        this.c = j2;
        this.d = function0;
        this.e = androidx.compose.runtime.e.e(obj);
        this.f = fre0.L(t73Var);
        this.g = j;
    }

    public final void a() {
        ((hgk0) this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.f14271a.b.invoke(this.f);
    }
}
