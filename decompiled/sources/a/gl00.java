package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class gl00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ int o;
    public final /* synthetic */ j700 p;
    public final /* synthetic */ List q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ long s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ Set v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl00(boolean z, Object obj, List list, int i, j700 j700Var, List list2, boolean z2, long j, boolean z3, Integer num, Set set, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = z;
        this.w = obj;
        this.n = list;
        this.o = i;
        this.p = j700Var;
        this.q = list2;
        this.r = z2;
        this.s = j;
        this.t = z3;
        this.u = num;
        this.v = set;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                gl00 gl00Var = new gl00(this.m, (nvu) obj2, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar, (byte) 0);
                gl00Var.l = obj;
                return gl00Var;
            default:
                gl00 gl00Var2 = new gl00(this.m, (y3v) obj2, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar, (byte) 1);
                gl00Var2.l = obj;
                return gl00Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gl00) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r14.a(r0, r10) == r15) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r14.a(r0, r10) == r15) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
    
        if (r14.a(r0, r10) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        if (r14.a(r0, r10) == r15) goto L55;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gl00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
