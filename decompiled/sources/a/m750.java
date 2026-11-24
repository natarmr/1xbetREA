package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m750 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public p850 j;
    public String k;
    public da8 l;
    public boolean m;
    public final /* synthetic */ p850 n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m750(p850 p850Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = p850Var;
        this.o = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.o;
        p850 p850Var = this.n;
        switch (b) {
            case 0:
                return new m750(p850Var, str, yjeVar, (byte) 0);
            default:
                return new m750(p850Var, str, yjeVar, (byte) 1);
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
        return ((m750) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 java.lang.Object, still in use, count: 2, list:
          (r9v6 java.lang.Object) from 0x0139: PHI (r9 I:??) = (r9v2 java.lang.Object), (r9v6 java.lang.Object) binds: [B:42:0x0138, B:62:0x0139] A[DONT_GENERATE, DONT_INLINE]
          (r9v6 java.lang.Object) from 0x012b: CHECK_CAST (a.jge) (r9v6 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m750.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
