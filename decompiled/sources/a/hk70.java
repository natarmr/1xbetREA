package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hk70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public double j;
    public p7m0 k;
    public Object l;
    public byte m;
    public final /* synthetic */ long n;
    public w46 o;
    public Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk70(jk70 jk70Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.p = jk70Var;
        this.n = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new hk70((jk70) this.p, this.n, yjeVar);
            default:
                return new hk70((yk70) this.q, this.n, yjeVar);
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
        return ((hk70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:41:0x013b  */
    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:19:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011f -> B:39:0x0122). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hk70.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk70(yk70 yk70Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.q = yk70Var;
        this.n = j;
    }
}
