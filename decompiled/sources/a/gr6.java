package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gr6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public long j;
    public boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr6(mii0 mii0Var, boolean z, int i, long j, Integer num, yje yjeVar) {
        super(2, yjeVar);
        this.n = mii0Var;
        this.l = z;
        this.m = i;
        this.j = j;
        this.o = num;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new gr6((mii0) obj3, this.l, this.m, this.j, (Integer) obj2, yjeVar);
            case 1:
                return new gr6(this.l, this.m, (egk0) obj3, (pz40) obj2, yjeVar);
            default:
                return new gr6((j9s0) obj3, this.j, this.m, this.l, (Integer) obj2, yjeVar);
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
        return ((gr6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:371:0x0538  */
    /* JADX WARN: Code duplicated, block: B:373:0x0543  */
    /* JADX WARN: Code duplicated, block: B:376:0x054e  */
    /* JADX WARN: Code duplicated, block: B:424:0x068e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0691  */
    /* JADX WARN: Code duplicated, block: B:427:0x0695  */
    /* JADX WARN: Code duplicated, block: B:454:0x0696 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v36, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x0541 -> B:374:0x0545). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gr6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr6(j9s0 j9s0Var, long j, int i, boolean z, Integer num, yje yjeVar) {
        super(2, yjeVar);
        this.n = j9s0Var;
        this.j = j;
        this.m = i;
        this.l = z;
        this.o = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr6(boolean z, int i, egk0 egk0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = z;
        this.m = i;
        this.n = egk0Var;
        this.o = pz40Var;
    }
}
