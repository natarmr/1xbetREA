package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fl1 extends bnn0 implements Function2 {
    public int i;
    public int j;
    public u8u k;
    public long l;
    public byte m;
    public final /* synthetic */ gl1 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(gl1 gl1Var, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.n = gl1Var;
        this.o = j;
        this.p = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new fl1(this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fl1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r0 == r6) goto L21;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fl1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
