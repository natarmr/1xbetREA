package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d21 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(int i, String str, pzu pzuVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        this.k = i;
        this.l = str;
        this.m = pzuVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 1);
            case 2:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 2);
            case 3:
                d21 d21Var = new d21((Function0) obj2, yjeVar, (byte) 3);
                d21Var.l = obj;
                return d21Var;
            case 4:
                d21 d21Var2 = new d21((h6i) obj2, yjeVar, (byte) 4);
                d21Var2.l = obj;
                return d21Var2;
            case 5:
                return new d21(this.l, obj2, this.k, yjeVar, (byte) 5);
            case 6:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new d21((sxk0) this.l, (diu0) obj2, yjeVar, (byte) 7);
            case 8:
                return new d21((sxk0) this.l, (diu0) obj2, yjeVar, (byte) 8);
            case 9:
                d21 d21Var3 = new d21((uz20) obj2, yjeVar, (byte) 9);
                d21Var3.l = obj;
                return d21Var3;
            case 10:
                return new d21(this.l, obj2, this.k, yjeVar, (byte) 10);
            case 11:
                return new d21(this.l, obj2, this.k, yjeVar, (byte) 11);
            case 12:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 12);
            case 13:
                return new d21((j6b0) obj2, yjeVar, (byte) 13);
            case 14:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 14);
            case 15:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new d21(this.k, (String) this.l, (pzu) obj2, yjeVar);
            case 17:
                return new d21((xpl0) obj2, yjeVar, (byte) 17);
            case 18:
                return new d21(this.l, this.k, obj2, yjeVar, (byte) 18);
            default:
                return new d21(this.l, obj2, this.k, yjeVar, (byte) 19);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((d21) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((d21) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((d21) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((d21) create((ol6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((d21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:307:0x070a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0716  */
    /* JADX WARN: Code duplicated, block: B:331:0x0759  */
    /* JADX WARN: Code duplicated, block: B:333:0x0765  */
    /* JADX WARN: Code duplicated, block: B:383:0x0854  */
    /* JADX WARN: Code duplicated, block: B:386:0x085c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v12 java.lang.Object, still in use, count: 2, list:
          (r1v12 java.lang.Object) from 0x0850: PHI (r1 I:??) = (r1v5 java.lang.Object), (r1v12 java.lang.Object) binds: [B:380:0x084f, B:412:0x0850] A[DONT_GENERATE, DONT_INLINE]
          (r1v12 java.lang.Object) from 0x0848: CHECK_CAST (a.e65) (r1v12 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 2326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d21.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d21(sxk0 sxk0Var, diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = sxk0Var;
        this.m = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d21(Object obj, int i, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = i;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d21(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d21(Object obj, Object obj2, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = i;
    }
}
