package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(Object obj, long j, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.j = j;
        this.l = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new zg0(this.k, this.j, obj2, yjeVar, (byte) 0);
            case 1:
                zg0 zg0Var = new zg0((diu0) obj2, this.j, yjeVar, (byte) 1);
                zg0Var.k = obj;
                return zg0Var;
            case 2:
                zg0 zg0Var2 = new zg0(this.k, obj2, yjeVar, (byte) 2);
                zg0Var2.j = ((Number) obj).longValue();
                return zg0Var2;
            case 3:
                return new zg0(this.k, this.j, obj2, yjeVar, (byte) 3);
            case 4:
                return new zg0(this.k, obj2, this.j, yjeVar, (byte) 4);
            case 5:
                zg0 zg0Var3 = new zg0((diu0) obj2, this.j, yjeVar, (byte) 5);
                zg0Var3.k = obj;
                return zg0Var3;
            case 6:
                zg0 zg0Var4 = new zg0((diu0) obj2, this.j, yjeVar, (byte) 6);
                zg0Var4.k = obj;
                return zg0Var4;
            case 7:
                zg0 zg0Var5 = new zg0((diu0) obj2, this.j, yjeVar, (byte) 7);
                zg0Var5.k = obj;
                return zg0Var5;
            case 8:
                zg0 zg0Var6 = new zg0((diu0) obj2, this.j, yjeVar, (byte) 8);
                zg0Var6.k = obj;
                return zg0Var6;
            case 9:
                return new zg0(this.k, obj2, this.j, yjeVar, (byte) 9);
            case 10:
                return new zg0(this.k, obj2, this.j, yjeVar, (byte) 10);
            case 11:
                zg0 zg0Var7 = new zg0((diu0) obj2, this.j, yjeVar, (byte) 11);
                zg0Var7.k = obj;
                return zg0Var7;
            case 12:
                return new zg0(this.k, obj2, this.j, yjeVar, (byte) 12);
            default:
                zg0 zg0Var8 = new zg0(this.k, obj2, yjeVar, (byte) 13);
                zg0Var8.j = ((Number) obj).longValue();
                return zg0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zg0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((zg0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((zg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((zg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((zg0) create((q5z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((zg0) create((q5z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((zg0) create((q5z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((zg0) create((q5z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((zg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((zg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((zg0) create((q5z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((zg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zg0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03db  */
    /* JADX WARN: Code duplicated, block: B:121:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x016a  */
    /* JADX WARN: Code duplicated, block: B:40:0x017a  */
    /* JADX WARN: Code duplicated, block: B:46:0x018d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e8  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x03d7: PHI (r3 I:??) = (r3v5 java.lang.Object), (r3v8 java.lang.Object) binds: [B:109:0x03d6, B:134:0x03d7] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x03cd: CHECK_CAST (a.vh0) (r3v8 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(diu0 diu0Var, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
        this.j = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(Object obj, Object obj2, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.j = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
