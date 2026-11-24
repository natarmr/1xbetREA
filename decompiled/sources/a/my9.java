package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class my9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public byte j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my9(rwc rwcVar, int i, int i2, String str, String str2, String str3, yje yjeVar) {
        super(2, yjeVar);
        this.n = rwcVar;
        this.k = i;
        this.l = i2;
        this.o = str;
        this.p = str2;
        this.q = str3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                return new my9((tu9) this.n, yjeVar, (mot0) this.o, this.k, (oy9) obj2);
            case 1:
                my9 my9Var = new my9((rwc) this.n, this.k, this.l, (String) this.o, (String) this.p, (String) obj2, yjeVar);
                my9Var.m = obj;
                return my9Var;
            default:
                my9 my9Var2 = new my9((p850) this.p, (ha8) obj2, yjeVar);
                my9Var2.o = obj;
                return my9Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((my9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r0 == r9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        if (r0 == r9) goto L75;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f1 -> B:96:0x0064). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.my9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my9(tu9 tu9Var, yje yjeVar, mot0 mot0Var, int i, oy9 oy9Var) {
        super(2, yjeVar);
        this.n = tu9Var;
        this.o = mot0Var;
        this.k = i;
        this.q = oy9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my9(p850 p850Var, ha8 ha8Var, yje yjeVar) {
        super(2, yjeVar);
        this.p = p850Var;
        this.q = ha8Var;
    }
}
