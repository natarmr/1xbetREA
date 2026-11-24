package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l7o0 extends bnn0 implements Function1 {
    public Date i;
    public fxu j;
    public Date k;
    public long l;
    public byte m;
    public byte n;
    public final /* synthetic */ m7o0 o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7o0(m7o0 m7o0Var, int i, yje yjeVar) {
        super(1, yjeVar);
        this.o = m7o0Var;
        this.p = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new l7o0(this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l7o0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r0 == r9) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l7o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
