package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xdl extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public byte k;
    public /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ wdr o;
    public final /* synthetic */ wdr p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdl(xal xalVar, gn gnVar, Function2 function2, Function0 function0, y yVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = (byte) 0;
        this.m = xalVar;
        this.n = gnVar;
        this.o = function2;
        this.p = function0;
        this.q = yVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.j;
        Object obj2 = this.q;
        wdr wdrVar = this.p;
        wdr wdrVar2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                xdl xdlVar = new xdl((xal) this.m, (gn) obj3, (Function2) wdrVar2, (Function0) wdrVar, (y) obj2, yjeVar);
                xdlVar.l = obj;
                return xdlVar;
            case 1:
                xdl xdlVar2 = new xdl(obj3, wdrVar2, wdrVar, obj2, yjeVar, (byte) 1);
                xdlVar2.l = obj;
                return xdlVar2;
            default:
                xdl xdlVar3 = new xdl(obj3, wdrVar2, wdrVar, obj2, yjeVar, (byte) 2);
                xdlVar3.l = obj;
                return xdlVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((xdl) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0153, code lost:
    
        if (r0 == r14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bb, code lost:
    
        if (a.bel.j(r0, (a.dpa0) r2, (a.xal) r21.m, (a.gn) r9, (kotlin.jvm.functions.Function2) r1, (kotlin.jvm.functions.Function0) r7, (a.y) r8, r21) == r13) goto L67;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xdl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xdl(Object obj, wdr wdrVar, wdr wdrVar2, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.n = obj;
        this.o = wdrVar;
        this.p = wdrVar2;
        this.q = obj2;
    }
}
