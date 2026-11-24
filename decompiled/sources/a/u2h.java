package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u2h extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public final /* synthetic */ byte k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u2h(int i, f8y f8yVar, yje yjeVar) {
        super(2, yjeVar);
        this.k = i;
        this.m = f8yVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        byte b2 = this.k;
        switch (b) {
            case 0:
                u2h u2hVar = new u2h((o3c) obj2, b2, yjeVar);
                u2hVar.l = obj;
                return u2hVar;
            default:
                return new u2h(b2, (f8y) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u2h) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u2h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r0 == r8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        if (r1.a(r3, r17) == r8) goto L66;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u2h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u2h(o3c o3cVar, int i, yje yjeVar) {
        super(2, yjeVar);
        this.m = o3cVar;
        this.k = i;
    }
}
