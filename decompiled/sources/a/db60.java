package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class db60 extends bnn0 implements Function2 {
    public rtu i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qv2 q;
    public final /* synthetic */ List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db60(qv2 qv2Var, List list, yje yjeVar) {
        super(2, yjeVar);
        this.q = qv2Var;
        this.r = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        db60 db60Var = new db60(this.q, this.r, yjeVar);
        db60Var.p = obj;
        return db60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((db60) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if (a.slb.Q(r1, r3, r20) == r2) goto L28;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.db60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
