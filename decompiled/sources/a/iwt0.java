package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iwt0 extends r7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15509a;
    public final t7u0 b;
    public final m2a c;

    public iwt0(Object obj, t7u0 t7u0Var, m2a m2aVar) {
        this.f15509a = obj;
        this.b = t7u0Var;
        this.c = m2aVar;
    }

    @Override // a.r7x
    public final r7x D(String str, Function1 function1) {
        Object obj = this.f15509a;
        return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new kwo(obj, str, this.c, this.b);
    }

    @Override // a.r7x
    public final Object v() {
        return this.f15509a;
    }
}
