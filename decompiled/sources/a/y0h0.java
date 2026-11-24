package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y0h0 implements u0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f41805a;
    public final /* synthetic */ Function1 b;

    public y0h0(Function1 function1, Function2 function2) {
        this.f41805a = function2;
        this.b = function1;
    }

    @Override // a.u0h0
    public final Object a(azg0 azg0Var, Object obj) {
        return this.f41805a.invoke(azg0Var, obj);
    }

    @Override // a.u0h0
    public final Object b(Object obj) {
        return this.b.invoke(obj);
    }
}
