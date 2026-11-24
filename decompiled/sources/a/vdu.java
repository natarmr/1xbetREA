package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vdu extends bnn0 implements Function2 {
    public byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wdu k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vdu(wdu wduVar, boolean z, int i, yje yjeVar) {
        super(2, yjeVar);
        this.k = wduVar;
        this.l = z;
        this.m = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        vdu vduVar = new vdu(this.k, this.l, this.m, yjeVar);
        vduVar.j = obj;
        return vduVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vdu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [a.g0g0] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vdu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
