package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lzn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ozn f20915a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ u9d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzn(ozn oznVar, uls0 uls0Var, long j, long j2, long j3, pu90 pu90Var, long j4, u9d u9dVar) {
        super(1);
        this.f20915a = oznVar;
        this.b = uls0Var;
        this.c = j2;
        this.d = j3;
        this.e = pu90Var;
        this.f = j4;
        this.g = u9dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ou90 ou90Var = (ou90) obj;
        ozn oznVar = this.f20915a;
        toj0 toj0Var = oznVar.v;
        long jA = 0;
        l7m0 l7m0Var = this.b;
        long j = l7m0Var != null ? ((ikx) l7m0Var.getValue()).f14950a : 0L;
        toj0Var.b();
        toj0Var.b();
        long jD = ikx.d(j, 0L);
        if (toj0Var.b()) {
            toj0Var.i = jD;
        }
        u12 u12Var = oznVar.z;
        if (u12Var != null) {
            jA = u12Var.a(this.c, this.d, k6z.f17794a);
        }
        long jD2 = ikx.d(jA, jD);
        long j2 = this.f;
        ou90Var.D(this.e, ((int) (jD2 >> 32)) + ((int) (j2 >> 32)), ((int) (jD2 & 4294967295L)) + ((int) (j2 & 4294967295L)), 0.0f, this.g);
        return Unit.f46060a;
    }
}
