package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class q0v extends bnn0 implements Function2 {
    public Object[] i;
    public kmq j;
    public Object[] k;
    public boolean l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tzi o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0v(tzi tziVar, boolean z, boolean z2, boolean z3, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.o = tziVar;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        q0v q0vVar = new q0v(this.o, this.p, this.q, this.r, this.s, yjeVar);
        q0vVar.n = obj;
        return q0vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0v) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (a.slb.Q(r0, r13, r9) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r0.a(r12, r12) == r1) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q0v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
