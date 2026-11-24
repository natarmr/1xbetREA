package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class l21 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(n21 n21Var, nw80 nw80Var, int i, String str, yje yjeVar) {
        super(2, yjeVar);
        this.k = n21Var;
        this.l = nw80Var;
        this.j = i;
        this.m = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.j;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                return new l21((n21) this.k, (nw80) obj3, this.j, (String) obj2, yjeVar);
            case 1:
                l21 l21Var = new l21((r8q) obj3, (List) obj2, i, yjeVar);
                l21Var.k = obj;
                return l21Var;
            case 2:
                l21 l21Var2 = new l21((ebq) obj3, i, (List) obj2, yjeVar);
                l21Var2.k = obj;
                return l21Var2;
            default:
                return new l21((l7m0) this.k, (Function1) obj3, (kwj) obj2, this.j, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l21) create((obq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((l21) create((obq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0101  */
    /* JADX WARN: Code duplicated, block: B:28:0x0106  */
    /* JADX WARN: Code duplicated, block: B:31:0x0129  */
    /* JADX WARN: Code duplicated, block: B:34:0x013a  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:43:0x015f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x0188  */
    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v10 java.lang.Object, still in use, count: 2, list:
          (r8v10 java.lang.Object) from 0x00fd: PHI (r8 I:??) = (r8v5 java.lang.Object), (r8v10 java.lang.Object) binds: [B:24:0x00fc, B:68:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          (r8v10 java.lang.Object) from 0x00f5: CHECK_CAST (org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel) (r8v10 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l21.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(r8q r8qVar, List list, int i, yje yjeVar) {
        super(2, yjeVar);
        this.l = r8qVar;
        this.m = list;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(ebq ebqVar, int i, List list, yje yjeVar) {
        super(2, yjeVar);
        this.l = ebqVar;
        this.j = i;
        this.m = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(l7m0 l7m0Var, Function1 function1, kwj kwjVar, int i, yje yjeVar) {
        super(2, yjeVar);
        this.k = l7m0Var;
        this.l = function1;
        this.m = kwjVar;
        this.j = i;
    }
}
