package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wa60 extends bnn0 implements Function2 {
    public rtu i;
    public int j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nc0 r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa60(nc0 nc0Var, List list, yje yjeVar) {
        super(2, yjeVar);
        this.r = nc0Var;
        this.s = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        wa60 wa60Var = new wa60(this.r, this.s, yjeVar);
        wa60Var.q = obj;
        return wa60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wa60) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        if (a.slb.Q(r1, r11, r22) == r2) goto L28;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wa60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
