package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k7k0 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l7k0 f17826a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vj30 e;
    public final /* synthetic */ pu90 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7k0(l7k0 l7k0Var, long j, int i, int i2, vj30 vj30Var, pu90 pu90Var) {
        super(1);
        this.f17826a = l7k0Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = vj30Var;
        this.f = pu90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ou90.j((ou90) obj, this.f, this.f17826a.q.a(this.b, (((long) this.d) & 4294967295L) | (((long) this.c) << 32), this.e.getLayoutDirection()));
        return Unit.f46060a;
    }
}
