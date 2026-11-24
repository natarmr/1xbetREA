package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ebt extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ boolean k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ebt(ha20 ha20Var, nw40 nw40Var, boolean z, int i, yje yjeVar) {
        super(2, yjeVar);
        this.m = ha20Var;
        this.n = nw40Var;
        this.k = z;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ebt ebtVar = new ebt(this.j, (pbt) obj2, this.k, yjeVar);
                ebtVar.m = obj;
                return ebtVar;
            default:
                return new ebt((ha20) this.m, (nw40) obj2, this.k, this.l, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ebt) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0163, code lost:
    
        if (r1.a(r30) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018d, code lost:
    
        if (r0 == r6) goto L45;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ebt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebt(boolean z, pbt pbtVar, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.n = pbtVar;
        this.k = z2;
    }
}
