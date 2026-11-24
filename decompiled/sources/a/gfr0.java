package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class gfr0 extends bnn0 implements Function1 {
    public byte i;
    public final /* synthetic */ ofr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfr0(ofr0 ofr0Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = ofr0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new gfr0(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((gfr0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
    
        if (r8.j(r1, r7) == r0) goto L33;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gfr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
