package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mcj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public byte k;
    public /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcj(kie0 kie0Var, ncj ncjVar, Object obj, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.n = kie0Var;
        this.p = ncjVar;
        this.o = obj;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                mcj mcjVar = new mcj((kie0) obj3, (ncj) obj2, this.o, this.j, yjeVar);
                mcjVar.l = obj;
                return mcjVar;
            default:
                mcj mcjVar2 = new mcj((dgu) obj3, (j700) this.o, (Set) obj2, yjeVar);
                mcjVar2.l = obj;
                return mcjVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mcj) create((g0q) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mcj) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (a.slb.Q(r1, r2, r22) == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        if (r4 == r1) goto L47;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mcj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcj(dgu dguVar, j700 j700Var, Set set, yje yjeVar) {
        super(2, yjeVar);
        this.n = dguVar;
        this.o = j700Var;
        this.p = set;
    }
}
