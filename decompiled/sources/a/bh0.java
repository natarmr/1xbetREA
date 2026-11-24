package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(diu0 diu0Var, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = diu0Var;
        this.j = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new bh0((eh0) obj2, this.j, yjeVar, (byte) 0);
            case 1:
                return new bh0((n21) obj2, this.j, yjeVar, (byte) 1);
            case 2:
                return new bh0((mh1) obj2, this.j, yjeVar, (byte) 2);
            case 3:
                bh0 bh0Var = new bh0((gl3) obj2, yjeVar, (byte) 3);
                bh0Var.j = ((Number) obj).intValue();
                return bh0Var;
            case 4:
                return new bh0((d48) obj2, this.j, yjeVar, (byte) 4);
            case 5:
                return new bh0((s29) obj2, this.j, yjeVar, (byte) 5);
            case 6:
                bh0 bh0Var2 = new bh0((boc) obj2, yjeVar, (byte) 6);
                bh0Var2.j = ((Number) obj).intValue();
                return bh0Var2;
            case 7:
                bh0 bh0Var3 = new bh0((a4x) obj2, yjeVar, (byte) 7);
                bh0Var3.j = ((Number) obj).intValue();
                return bh0Var3;
            case 8:
                return new bh0((wze) obj2, this.j, yjeVar, (byte) 8);
            case 9:
                return new bh0((r7f) obj2, this.j, yjeVar, (byte) 9);
            case 10:
                return new bh0((rnf) obj2, this.j, yjeVar, (byte) 10);
            case 11:
                return new bh0((ebl) obj2, this.j, yjeVar, (byte) 11);
            case 12:
                return new bh0((u610) obj2, this.j, yjeVar, (byte) 12);
            case 13:
                bh0 bh0Var4 = new bh0((dw10) obj2, yjeVar, (byte) 13);
                bh0Var4.j = ((Number) obj).intValue();
                return bh0Var4;
            case 14:
                bh0 bh0Var5 = new bh0((cx10) obj2, yjeVar, (byte) 14);
                bh0Var5.j = ((Number) obj).intValue();
                return bh0Var5;
            case 15:
                return new bh0((on20) obj2, this.j, yjeVar, (byte) 15);
            case 16:
                bh0 bh0Var6 = new bh0((j340) obj2, yjeVar, (byte) 16);
                bh0Var6.j = ((Number) obj).intValue();
                return bh0Var6;
            case 17:
                return new bh0((d650) obj2, this.j, yjeVar, (byte) 17);
            case 18:
                return new bh0((wu50) obj2, this.j, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new bh0((n880) obj2, this.j, yjeVar, (byte) 19);
            case 20:
                return new bh0((jt80) obj2, this.j, yjeVar, (byte) 20);
            case 21:
                return new bh0((r4b0) obj2, this.j, yjeVar, (byte) 21);
            case 22:
                return new bh0((d1e0) obj2, this.j, yjeVar, (byte) 22);
            case 23:
                return new bh0((nyf0) obj2, this.j, yjeVar, (byte) 23);
            case 24:
                bh0 bh0Var7 = new bh0((mkn0) obj2, yjeVar, (byte) 24);
                bh0Var7.j = ((Number) obj).intValue();
                return bh0Var7;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new bh0((fho0) obj2, this.j, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new bh0((rio0) obj2, this.j, yjeVar, (byte) 26);
            default:
                return new bh0((f2u0) obj2, this.j, yjeVar, (byte) 27);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((bh0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x036e  */
    /* JADX WARN: Code duplicated, block: B:124:0x037f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0390  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:209:0x0675  */
    /* JADX WARN: Code duplicated, block: B:211:0x0681  */
    /* JADX WARN: Code duplicated, block: B:231:0x0730  */
    /* JADX WARN: Code duplicated, block: B:245:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:247:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:248:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:265:0x038b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 java.lang.Object, still in use, count: 2, list:
          (r2v7 java.lang.Object) from 0x07d9: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v7 java.lang.Object) binds: [B:242:0x07d8, B:280:0x07d9] A[DONT_GENERATE, DONT_INLINE]
          (r2v7 java.lang.Object) from 0x07d1: CHECK_CAST (a.lr5) (r2v7 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 2166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
