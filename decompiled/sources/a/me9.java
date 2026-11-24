package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class me9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21633a;
    public final /* synthetic */ hh80 b;
    public final /* synthetic */ ugd c;

    public me9(long j, hh80 hh80Var, ugd ugdVar) {
        this.f21633a = j;
        this.b = hh80Var;
        this.c = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            q8x.o(this.f21633a, ((h1t0) fetVar.k(k1t0.f17545a)).m, u1c.M(417635459, new a8(this.b, this.c, (byte) 7), fetVar), fetVar, 384);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
