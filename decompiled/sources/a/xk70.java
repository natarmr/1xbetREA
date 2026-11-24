package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xk70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public p7m0 j;
    public ly5 k;
    public Object l;
    public double m;
    public int n;
    public boolean o;
    public final /* synthetic */ ly5 p;
    public w46 q;
    public Object r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk70(yk70 yk70Var, ly5 ly5Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = yk70Var;
        this.p = ly5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ly5 ly5Var = this.p;
        switch (b) {
            case 0:
                return new xk70((yk70) this.r, ly5Var, yjeVar);
            default:
                return new xk70((wm70) this.s, ly5Var, yjeVar);
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
        return ((xk70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x014f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0082 -> B:8:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x014f -> B:44:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xk70.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk70(wm70 wm70Var, ly5 ly5Var, yje yjeVar) {
        super(2, yjeVar);
        this.s = wm70Var;
        this.p = ly5Var;
    }
}
