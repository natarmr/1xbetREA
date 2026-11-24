package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class f91 extends bnn0 implements Function1 {
    public n91 i;
    public boolean j;
    public byte k;
    public final /* synthetic */ n91 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(n91 n91Var, yje yjeVar) {
        super(1, yjeVar);
        this.l = n91Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new f91(this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f91) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r1 == r2) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
