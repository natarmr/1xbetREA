package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ey extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(byte b, long j, yje yjeVar, i3t0 i3t0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.l = i3t0Var;
        this.k = j;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new ey(obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new ey(obj2, this.k, yjeVar, (byte) 1);
            case 2:
                return new ey(obj2, this.k, yjeVar, (byte) 2);
            case 3:
                return new ey(obj2, this.k, yjeVar, (byte) 3);
            case 4:
                return new ey((byte) 4, this.k, yjeVar, (wz1) obj2, this.j);
            case 5:
                return new ey((byte) 5, this.k, yjeVar, (n92) obj2, this.j);
            case 6:
                return new ey(obj2, this.k, yjeVar, (byte) 6);
            case 7:
                return new ey(obj2, this.k, yjeVar, (byte) 7);
            case 8:
                return new ey(obj2, this.k, yjeVar, (byte) 8);
            case 9:
                return new ey(obj2, this.k, yjeVar, (byte) 9);
            case 10:
                return new ey(this.k, obj2, yjeVar, (byte) 10);
            case 11:
                return new ey(obj2, this.k, yjeVar, (byte) 11);
            case 12:
                ey eyVar = new ey((kyd) obj2, yjeVar, (byte) 12);
                eyVar.k = ((Number) obj).longValue();
                return eyVar;
            case 13:
                return new ey(obj2, this.k, yjeVar, (byte) 13);
            case 14:
                return new ey(obj2, this.k, yjeVar, (byte) 14);
            case 15:
                return new ey(obj2, this.k, yjeVar, (byte) 15);
            case 16:
                return new ey(obj2, this.k, yjeVar, (byte) 16);
            case 17:
                return new ey(obj2, this.k, yjeVar, (byte) 17);
            case 18:
                return new ey(obj2, this.k, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ey(obj2, this.k, yjeVar, (byte) 19);
            case 20:
                return new ey(obj2, this.k, yjeVar, (byte) 20);
            case 21:
                return new ey(this.k, obj2, yjeVar, (byte) 21);
            case 22:
                return new ey(obj2, this.k, yjeVar, (byte) 22);
            case 23:
                return new ey(obj2, this.k, yjeVar, (byte) 23);
            case 24:
                ey eyVar2 = new ey((tzi) obj2, yjeVar, (byte) 24);
                eyVar2.k = ((Number) obj).longValue();
                return eyVar2;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ey(obj2, this.k, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ey(obj2, this.k, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ey(obj2, this.k, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ey(obj2, this.k, yjeVar, (byte) 28);
            default:
                return new ey(obj2, this.k, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ey) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ey) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ey) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ey) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:368:0x0835  */
    /* JADX WARN: Code duplicated, block: B:370:0x083d  */
    /* JADX WARN: Code duplicated, block: B:371:0x0869 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:372:0x086b  */
    /* JADX WARN: Code duplicated, block: B:376:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:409:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:410:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:412:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:414:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:415:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:417:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:420:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:426:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:429:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:430:0x0aab  */
    /* JADX WARN: Code duplicated, block: B:432:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:434:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a54 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:? A[LOOP:10: B:418:0x0a41->B:503:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [a.p7m0] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v39, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v13, types: [a.xl90] */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.p6t0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v18 java.lang.Object, still in use, count: 2, list:
          (r4v18 java.lang.Object) from 0x09c4: PHI (r4 I:??) = (r4v10 java.lang.Object), (r4v18 java.lang.Object) binds: [B:406:0x09c3, B:499:0x09c4] A[DONT_GENERATE, DONT_INLINE]
          (r4v18 java.lang.Object) from 0x09ba: CHECK_CAST (a.yp1) (r4v18 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 3128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ey.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(long j, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
