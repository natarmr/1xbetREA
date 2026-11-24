package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hoe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public int k;
    public final /* synthetic */ boolean l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Serializable p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoe(p850 p850Var, int i, Integer num, boolean z, mlr mlrVar, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.n = p850Var;
        this.k = i;
        this.o = num;
        this.l = z;
        this.p = mlrVar;
        this.m = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Serializable serializable = this.p;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                hoe hoeVar = new hoe((Function2) obj2, this.l, (String) serializable, yjeVar);
                hoeVar.n = obj;
                return hoeVar;
            default:
                int i = this.m;
                return new hoe((p850) this.n, this.k, (Integer) obj2, this.l, (mlr) serializable, i, yjeVar);
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
        return ((hoe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r0.I(r8, r1, r5, r16) == r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r0.N0(r1, r2, r16, r5) == r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0099 -> B:55:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00e8 -> B:55:0x00ea). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hoe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoe(Function2 function2, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = function2;
        this.l = z;
        this.p = str;
    }
}
