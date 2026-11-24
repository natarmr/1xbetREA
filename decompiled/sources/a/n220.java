package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n220 extends bnn0 implements Function2 {
    public boolean i;
    public int j;
    public int k;
    public String l;
    public o470 m;
    public long n;
    public byte o;
    public final /* synthetic */ w220 p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n220(w220 w220Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.p = w220Var;
        this.q = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new n220(this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n220) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        if (r5.e(r11, r18.q, r8, r18) == r4) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n220.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
