package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class je2 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public boolean k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je2(f47 f47Var, z470 z470Var, boolean z, String str, yje yjeVar) {
        super(1, yjeVar);
        this.l = f47Var;
        this.m = z470Var;
        this.k = z;
        this.n = str;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new je2((le2) obj, yjeVar);
            default:
                return new je2((f47) this.l, (z470) this.m, this.k, (String) obj, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((je2) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r0 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        if (r2.a(r3, r20) == r1) goto L43;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.je2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je2(le2 le2Var, yje yjeVar) {
        super(1, yjeVar);
        this.n = le2Var;
    }
}
