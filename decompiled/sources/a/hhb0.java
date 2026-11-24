package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class hhb0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhb0(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.k;
        switch (b) {
            case 0:
                return new hhb0((ihb0) obj, yjeVar, (byte) 0);
            case 1:
                return new hhb0((u9e0) obj, yjeVar, (byte) 1);
            case 2:
                return new hhb0((d7f0) obj, yjeVar, (byte) 2);
            case 3:
                return new hhb0((b8f0) obj, yjeVar, (byte) 3);
            case 4:
                return new hhb0((khf0) obj, yjeVar, (byte) 4);
            case 5:
                return new hhb0((lhf0) obj, yjeVar, (byte) 5);
            case 6:
                return new hhb0((phf0) obj, yjeVar, (byte) 6);
            case 7:
                return new hhb0((k4g0) obj, yjeVar, (byte) 7);
            case 8:
                return new hhb0((e8i0) obj, yjeVar, (byte) 8);
            case 9:
                return new hhb0((c9i0) obj, yjeVar, (byte) 9);
            case 10:
                return new hhb0((wli0) obj, yjeVar, (byte) 10);
            case 11:
                return new hhb0((xxi0) obj, yjeVar, (byte) 11);
            case 12:
                return new hhb0((odj0) obj, yjeVar, (byte) 12);
            case 13:
                return new hhb0((ngj0) obj, yjeVar, (byte) 13);
            case 14:
                return new hhb0((iwk0) obj, yjeVar, (byte) 14);
            case 15:
                return new hhb0((m1l0) obj, yjeVar, (byte) 15);
            case 16:
                return new hhb0((ybm0) obj, yjeVar, (byte) 16);
            case 17:
                return new hhb0((wxm0) obj, yjeVar, (byte) 17);
            case 18:
                return new hhb0((sgn0) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new hhb0((o6p0) obj, yjeVar, (byte) 19);
            case 20:
                return new hhb0((t7p0) obj, yjeVar, (byte) 20);
            case 21:
                return new hhb0((zap0) obj, yjeVar, (byte) 21);
            case 22:
                return new hhb0((wbp0) obj, yjeVar, (byte) 22);
            case 23:
                return new hhb0((rhp0) obj, yjeVar, (byte) 23);
            case 24:
                return new hhb0((lkq0) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new hhb0((bxq0) obj, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new hhb0((m5r0) obj, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new hhb0((lar0) obj, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new hhb0((edr0) obj, yjeVar, (byte) 28);
            default:
                return new hhb0((ofr0) obj, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((hhb0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0249  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d  */
    /* JADX WARN: Code duplicated, block: B:111:0x026a A[LOOP:4: B:106:0x0257->B:111:0x026a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0279  */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0291  */
    /* JADX WARN: Code duplicated, block: B:123:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0298  */
    /* JADX WARN: Code duplicated, block: B:125:0x029c A[PHI: r3
  0x029c: PHI (r3v44 int) = (r3v43 int), (r3v46 int) binds: [B:122:0x0294, B:124:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x029f  */
    /* JADX WARN: Code duplicated, block: B:345:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:350:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:352:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:359:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:362:0x07f0 A[LOOP:18: B:357:0x07dd->B:362:0x07f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:370:0x0811  */
    /* JADX WARN: Code duplicated, block: B:371:0x0817  */
    /* JADX WARN: Code duplicated, block: B:374:0x081c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:375:0x081e  */
    /* JADX WARN: Code duplicated, block: B:376:0x0822 A[PHI: r3
  0x0822: PHI (r3v15 int) = (r3v14 int), (r3v17 int) binds: [B:373:0x081a, B:375:0x081e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:377:0x0825  */
    /* JADX WARN: Code duplicated, block: B:518:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x07f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0246  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v31 java.lang.Object, still in use, count: 2, list:
          (r4v31 java.lang.Object) from 0x07ad: PHI (r4 I:??) = (r4v23 java.lang.Object), (r4v31 java.lang.Object) binds: [B:338:0x07ac, B:543:0x07ad] A[DONT_GENERATE, DONT_INLINE]
          (r4v31 java.lang.Object) from 0x0799: CHECK_CAST (a.niq0) (r4v31 java.lang.Object)
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
            Method dump skipped, instruction units count: 2820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hhb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
