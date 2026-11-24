package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class s63 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f31682a;
    public final /* synthetic */ oms0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s63(Function1 function1, oms0 oms0Var) {
        super(3);
        this.f31682a = function1;
        this.b = oms0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long j;
        vj30 vj30Var = (vj30) obj;
        pu90 pu90VarS = ((pj30) obj2).S(((p4e) obj3).f26347a);
        if (vj30Var.M()) {
            if (((Boolean) this.f31682a.invoke(((hgk0) this.b.d).getValue())).booleanValue()) {
                j = (((long) pu90VarS.f27604a) << 32) | (((long) pu90VarS.b) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) pu90VarS.f27604a) << 32) | (((long) pu90VarS.b) & 4294967295L);
        }
        return vj30.x(vj30Var, (int) (j >> 32), (int) (4294967295L & j), new r63(pu90VarS, (byte) 0));
    }
}
