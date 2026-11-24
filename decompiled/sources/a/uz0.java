package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class uz0 extends bnn0 implements Function2 {
    public List i;
    public byte j;
    public final /* synthetic */ a01 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(a01 a01Var, boolean z, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.k = a01Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new uz0(this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r1 == r10) goto L15;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
