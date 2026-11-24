package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qch0 extends bnn0 implements Function2 {
    public sch0 i;
    public lie0 j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ sch0 n;
    public final /* synthetic */ lie0 o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qch0(sch0 sch0Var, lie0 lie0Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.n = sch0Var;
        this.o = lie0Var;
        this.p = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        qch0 qch0Var = new qch0(this.n, this.o, this.p, yjeVar);
        qch0Var.m = obj;
        return qch0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qch0) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        sch0 sch0Var;
        lie0 lie0Var;
        sch0 sch0Var2;
        long j;
        wne wneVar = wne.f39444a;
        boolean z = this.l;
        byte b = 2;
        if (!z) {
            z1x.P(obj);
            rch0 rch0Var = (rch0) this.m;
            sch0Var = this.n;
            fv2 fv2Var = new fv2(sch0Var, rch0Var, b);
            qkq qkqVar = sch0Var.c;
            lie0Var = this.o;
            long j2 = lie0Var.f20100a;
            ma80 ma80Var = sch0Var.d;
            ma80 ma80Var2 = ma80.b;
            long j3 = this.p;
            float fE = sch0Var.e(ma80Var == ma80Var2 ? g6u0.b(j3) : g6u0.c(j3));
            this.m = sch0Var;
            this.i = sch0Var;
            this.j = lie0Var;
            this.k = j2;
            this.l = true;
            obj = qkqVar.a(fv2Var, fE, this);
            if (obj == wneVar) {
                return wneVar;
            }
            sch0Var2 = sch0Var;
            j = j2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.k;
            lie0Var = this.j;
            sch0Var = this.i;
            sch0Var2 = (sch0) this.m;
            z1x.P(obj);
        }
        float fE2 = sch0Var2.e(((Number) obj).floatValue());
        lie0Var.f20100a = sch0Var.d == ma80.b ? g6u0.a(j, fE2, 0.0f, 2) : g6u0.a(j, 0.0f, fE2, 1);
        return Unit.f46060a;
    }
}
