package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class o4u extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nr k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4u(nr nrVar, boolean z, int i, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.k = nrVar;
        this.l = z;
        this.m = i;
        this.n = z2;
        this.o = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        o4u o4uVar = new o4u(this.k, this.l, this.m, this.n, this.o, yjeVar);
        o4uVar.j = obj;
        return o4uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o4u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = (kmq) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            nr nrVar = this.k;
            krt0 krt0VarA = ((gst0) nrVar.d).a() ? ((gst0) nrVar.d).f11847a.a() : new krt0(0L, false, false, 0.0d);
            boolean z2 = this.l;
            boolean z3 = z2 ? krt0VarA.c : krt0VarA.b;
            long j = krt0VarA.f18785a;
            uii uiiVar = (uii) nrVar.b;
            boolean zJ = ((j1q0) nrVar.c).f15748a.j();
            phj phjVar = (phj) uiiVar.f35730a;
            vsg0 vsg0Var = new vsg0(new whj(new a1g(z2 ? phjVar.e.c() : phjVar.f.c(), new xhj(4, null), (byte) 20), null, uiiVar, this.m, z3, j, z2, zJ, this.n, this.o));
            this.j = null;
            this.i = true;
            if (slb.Q(kmqVar, vsg0Var, this) == wneVar) {
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
