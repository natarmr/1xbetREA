package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class am4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am4(im4 im4Var, uu4 uu4Var, Object obj, wdr wdrVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = im4Var;
        this.l = uu4Var;
        this.m = obj;
        this.n = wdrVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new am4((im4) this.k, (uu4) this.l, (String) this.m, (Function2) obj, yjeVar, (byte) 0);
            case 1:
                return new am4((im4) this.k, (uu4) this.l, (ynb0) this.m, (f8) obj, yjeVar, (byte) 1);
            case 2:
                return new am4((mie0) this.l, (ncj) this.m, (kie0) obj, yjeVar, (byte) 2);
            case 3:
                return new am4((ncj) this.l, (CoroutineContext) this.m, (Function2) obj, yjeVar, (byte) 3);
            case 4:
                return new am4((ltr0) this.l, (ql5) obj, yjeVar);
            default:
                return new am4((u0v0) obj, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((am4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0360  */
    /* JADX WARN: Code duplicated, block: B:139:0x036b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x022a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0232  */
    /* JADX WARN: Code duplicated, block: B:78:0x023a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0248  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d4, code lost:
    
        if (r0 == r9) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0373, code lost:
    
        if (r0.g0(false, r27) == r9) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03f3, code lost:
    
        if (r0.i((a.uu4) r27.l, (java.lang.String) r27.m, (kotlin.jvm.functions.Function2) r4, "", r27) == r9) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if (r4 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
    
        if (r2 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0242, code lost:
    
        if (r0.i(r4, true, r27) == r9) goto L80;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.am4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am4(ltr0 ltr0Var, ql5 ql5Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 4;
        this.l = ltr0Var;
        this.n = ql5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am4(u0v0 u0v0Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 5;
        this.n = u0v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am4(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }
}
