package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mzo0 extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n660 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ jvn m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzo0(n660 n660Var, boolean z, jvn jvnVar, long j, boolean z2, long j2, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.k = n660Var;
        this.l = z;
        this.m = jvnVar;
        this.n = j;
        this.o = z2;
        this.p = j2;
        this.q = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        mzo0 mzo0Var = new mzo0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
        mzo0Var.j = obj;
        return mzo0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mzo0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        n660 n660Var = this.k;
        knf0 knf0Var = (knf0) n660Var.c;
        kmq kmqVar = (kmq) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            m2c0 m2c0VarA = ((x2c0) n660Var.d).a();
            Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
            sip.f32274a.getClass();
            sip sipVarF = bek.f(this.l);
            boolean z2 = this.l;
            vsg0 vsg0VarH0 = bkb.h0(z2 ? 8L : 30L, TimeUnit.SECONDS, new lzo0(this.m, intOrNull, iB, strC, this.n, this.o, this.p, n660Var, sipVarF, z2, this.q, null));
            this.j = null;
            this.i = true;
            if (slb.Q(kmqVar, vsg0VarH0, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
