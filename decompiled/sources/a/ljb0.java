package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ljb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tjb0 f20141a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f9h0 c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;

    public /* synthetic */ ljb0(tjb0 tjb0Var, boolean z, f9h0 f9h0Var, Set set, long j, String str) {
        this.f20141a = tjb0Var;
        this.b = z;
        this.c = f9h0Var;
        this.d = set;
        this.e = j;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        k0w0Var.h(this.f20141a.l.b(this.b ? j700.b : j700.f16016a, this.c, this.d, this.e, this.f));
        return Unit.f46060a;
    }
}
