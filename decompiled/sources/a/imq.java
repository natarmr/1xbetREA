package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class imq extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Throwable k;
    public /* synthetic */ long l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ String o;
    public final /* synthetic */ int p;
    public final /* synthetic */ List q;
    public final /* synthetic */ List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imq(Function1 function1, long j, String str, int i, List list, List list2, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.m = function1;
        this.n = j;
        this.o = str;
        this.p = i;
        this.q = list;
        this.r = list2;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:89:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v6 java.lang.Object, still in use, count: 2, list:
          (r12v6 java.lang.Object) from 0x018b: PHI (r12 I:??) = (r12v2 java.lang.Object), (r12v6 java.lang.Object) binds: [B:82:0x018a, B:105:0x018b] A[DONT_GENERATE, DONT_INLINE]
          (r12v6 java.lang.Object) from 0x017f: CHECK_CAST (java.lang.Class) (r12v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.imq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        Throwable th = (Throwable) obj2;
        switch (this.i) {
            case 0:
                long jLongValue = ((Number) obj3).longValue();
                List list = this.r;
                imq imqVar = new imq(this.m, this.n, this.o, this.p, this.q, list, (yje) obj4, (byte) 0);
                imqVar.k = th;
                imqVar.l = jLongValue;
                return imqVar.invokeSuspend(Unit.f46060a);
            default:
                long jLongValue2 = ((Number) obj3).longValue();
                List list2 = this.r;
                imq imqVar2 = new imq(this.m, this.n, this.o, this.p, this.q, list2, (yje) obj4, (byte) 1);
                imqVar2.k = th;
                imqVar2.l = jLongValue2;
                return imqVar2.invokeSuspend(Unit.f46060a);
        }
    }
}
