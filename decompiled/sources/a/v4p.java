package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class v4p extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ org.xplatform.favorites.impl.presentation.category.a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4p(org.xplatform.favorites.impl.presentation.category.a aVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = aVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        org.xplatform.favorites.impl.presentation.category.a aVar = this.k;
        switch (b) {
            case 0:
                return new v4p(aVar, yjeVar, (byte) 0);
            default:
                return new v4p(aVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((v4p) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        if (r2.a(r3, r24) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0157, code lost:
    
        if (r2.c(r1, r24) == r7) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v4p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
