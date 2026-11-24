package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class g91 extends bnn0 implements Function1 {
    public Object i;
    public String j;
    public long k;
    public long l;
    public byte m;
    public final /* synthetic */ n91 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(n91 n91Var, yje yjeVar) {
        super(1, yjeVar);
        this.n = n91Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new g91(this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g91) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
    
        if (r0 == r13) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0155, code lost:
    
        if (r0 == r13) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws a.lx50, a.cii0 {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
