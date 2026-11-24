package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n3u extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d4u l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3u(d4u d4uVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = d4uVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                n3u n3uVar = new n3u(this.l, yjeVar, (byte) 0);
                n3uVar.k = obj;
                return n3uVar;
            default:
                n3u n3uVar2 = new n3u(this.l, yjeVar, (byte) 1);
                n3uVar2.k = obj;
                return n3uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((n3u) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r0.a(r1, r8) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r0.a(r9, r8) == r6) goto L42;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n3u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
