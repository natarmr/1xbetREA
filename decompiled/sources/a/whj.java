package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class whj extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a1g k;
    public final /* synthetic */ uii l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whj(a1g a1gVar, yje yjeVar, uii uiiVar, int i, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2, yjeVar);
        this.k = a1gVar;
        this.l = uiiVar;
        this.m = i;
        this.n = z;
        this.o = j;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        whj whjVar = new whj(this.k, yjeVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        whjVar.j = obj;
        return whjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((whj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = (kmq) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            vhj vhjVar = new vhj(kmqVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
            this.j = null;
            this.i = true;
            if (this.k.c(vhjVar, this) == wneVar) {
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
