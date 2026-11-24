package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class syj0 extends bnn0 implements xdr {
    public nv20 i;
    public String j;
    public int k;
    public byte l;
    public /* synthetic */ ql5 m;
    public /* synthetic */ boolean n;
    public final /* synthetic */ wyj0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syj0(wyj0 wyj0Var, yje yjeVar) {
        super(3, yjeVar);
        this.o = wyj0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        syj0 syj0Var = new syj0(this.o, (yje) obj3);
        syj0Var.m = (ql5) obj;
        syj0Var.n = zBooleanValue;
        return syj0Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        if (r3 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        if (r0 == r6) goto L35;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.syj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
