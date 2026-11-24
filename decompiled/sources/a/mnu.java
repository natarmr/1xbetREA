package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mnu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public byte k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mnu(es esVar, String str, int i, sff0 sff0Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = esVar;
        this.r = str;
        this.k = i;
        this.s = sff0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                mnu mnuVar = new mnu((es) this.q, (String) this.r, this.k, (sff0) obj2, yjeVar);
                mnuVar.p = obj;
                return mnuVar;
            default:
                return new mnu((nn20) obj2, yjeVar);
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
        return ((mnu) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x03f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x03f6 -> B:92:0x03f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mnu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnu(nn20 nn20Var, yje yjeVar) {
        super(2, yjeVar);
        this.s = nn20Var;
    }
}
