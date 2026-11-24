package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class eh1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public long j;
    public boolean k;
    public final /* synthetic */ long l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(h3v0 h3v0Var, long j, long j2, boolean z, String str, csr csrVar, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.n = h3v0Var;
        this.j = j;
        this.l = j2;
        this.k = z;
        this.m = str;
        this.o = csrVar;
        this.p = str2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                return new eh1((mh1) obj3, this.l, (String) obj2, yjeVar);
            case 1:
                return new eh1(this.l, (String) this.m, (pz40) this.n, (pz40) obj3, (pz40) obj2, yjeVar);
            case 2:
                return new eh1((pz40) this.n, (a4x) obj3, (pz40) this.m, (Function0) obj2, this.j, this.l, yjeVar);
            default:
                return new eh1((h3v0) this.n, this.j, this.l, this.k, (String) this.m, (csr) obj3, (String) obj2, yjeVar);
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
            case 2:
                break;
        }
        return ((eh1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Code duplicated, block: B:46:0x0155  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0155 -> B:47:0x0156). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(mh1 mh1Var, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = mh1Var;
        this.l = j;
        this.p = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(pz40 pz40Var, a4x a4xVar, pz40 pz40Var2, Function0 function0, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.n = pz40Var;
        this.o = a4xVar;
        this.m = pz40Var2;
        this.p = function0;
        this.j = j;
        this.l = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(long j, String str, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
        this.m = str;
        this.n = pz40Var;
        this.o = pz40Var2;
        this.p = pz40Var3;
    }
}
