package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class irs0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public int j;
    public int k;
    public int l;
    public byte m;
    public Enum[] n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irs0(zd60[] zd60VarArr, jrs0 jrs0Var, fhs0 fhs0Var, yje yjeVar) {
        super(2, yjeVar);
        this.o = zd60VarArr;
        this.q = jrs0Var;
        this.s = fhs0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                return new irs0((zd60[]) this.o, (jrs0) obj3, (fhs0) obj2, yjeVar);
            default:
                return new irs0((ae60[]) obj3, (krs0) this.r, (ghs0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((irs0) create((jz80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((irs0) create((lva0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008d -> B:26:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0111 -> B:51:0x0112). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.irs0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irs0(ae60[] ae60VarArr, krs0 krs0Var, ghs0 ghs0Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = ae60VarArr;
        this.r = krs0Var;
        this.s = ghs0Var;
    }
}
