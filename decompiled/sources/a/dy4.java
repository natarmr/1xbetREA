package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class dy4 extends bnn0 implements Function2 {
    public double i;
    public double j;
    public long k;
    public m97 l;
    public pa20 m;
    public byte n;
    public final /* synthetic */ fy4 o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy4(fy4 fy4Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.o = fy4Var;
        this.p = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new dy4(this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dy4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0135  */
    /* JADX WARN: Code duplicated, block: B:33:0x013f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0143  */
    /* JADX WARN: Code duplicated, block: B:38:0x016c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0171  */
    /* JADX WARN: Code duplicated, block: B:44:0x0181  */
    /* JADX WARN: Code duplicated, block: B:46:0x0186  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019c, code lost:
    
        if (r0.A(r8, r10, r1, r33) == r7) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dy4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
