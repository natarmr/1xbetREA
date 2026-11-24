package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class j370 extends bnn0 implements Function1 {
    public boolean i;
    public boolean j;
    public byte k;
    public final /* synthetic */ k370 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j370(k370 k370Var, yje yjeVar) {
        super(1, yjeVar);
        this.l = k370Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new j370(this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j370) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[PHI: r3 r4
  0x00cb: PHI (r3v5 boolean) = (r3v4 boolean), (r3v4 boolean), (r3v10 boolean) binds: [B:35:0x00a1, B:40:0x00c8, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r4v5 boolean) = (r4v4 boolean), (r4v4 boolean), (r4v7 boolean) binds: [B:35:0x00a1, B:40:0x00c8, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:0: B:59:0x0108->B:70:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        if (r13 == r2) goto L50;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j370.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
