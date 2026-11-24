package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class pn extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn(Object obj, yje yjeVar, byte b) {
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
                return new pn((qn) obj, yjeVar, (byte) 0);
            case 1:
                return new pn((nr) obj, yjeVar, (byte) 1);
            case 2:
                return new pn((xr) obj, yjeVar, (byte) 2);
            case 3:
                return new pn((es) obj, yjeVar, (byte) 3);
            case 4:
                return new pn((tw0) obj, yjeVar, (byte) 4);
            case 5:
                return new pn((zb2) obj, yjeVar, (byte) 5);
            case 6:
                return new pn((hd2) obj, yjeVar, (byte) 6);
            case 7:
                return new pn((qi2) obj, yjeVar, (byte) 7);
            case 8:
                return new pn((kc4) obj, yjeVar, (byte) 8);
            case 9:
                return new pn((cg5) obj, yjeVar, (byte) 9);
            case 10:
                return new pn((dk6) obj, yjeVar, (byte) 10);
            case 11:
                return new pn((gj8) obj, yjeVar, (byte) 11);
            case 12:
                return new pn((ab9) obj, yjeVar, (byte) 12);
            case 13:
                return new pn((tw9) obj, yjeVar, (byte) 13);
            case 14:
                return new pn((g9a) obj, yjeVar, (byte) 14);
            case 15:
                return new pn((nua) obj, yjeVar, (byte) 15);
            case 16:
                return new pn((plb) obj, yjeVar, (byte) 16);
            case 17:
                return new pn((wdc) obj, yjeVar, (byte) 17);
            case 18:
                return new pn((yhc) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new pn((dch) obj, yjeVar, (byte) 19);
            case 20:
                return new pn((wjh) obj, yjeVar, (byte) 20);
            case 21:
                return new pn((lwh) obj, yjeVar, (byte) 21);
            case 22:
                return new pn((xoj0) obj, yjeVar, (byte) 22);
            case 23:
                return new pn((am4) obj, yjeVar, (byte) 23);
            case 24:
                return new pn((atk) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new pn((ccn) obj, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new pn((b7o) obj, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new pn((tqo) obj, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new pn((h7p) obj, yjeVar, (byte) 28);
            default:
                return new pn((nnp) obj, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                return ((pn) create(yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x033d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0387  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:250:0x0447  */
    /* JADX WARN: Code duplicated, block: B:251:0x044a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0454  */
    /* JADX WARN: Code duplicated, block: B:256:0x045e  */
    /* JADX WARN: Code duplicated, block: B:262:0x0473  */
    /* JADX WARN: Code duplicated, block: B:285:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:287:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:290:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:296:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:570:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x046e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Double] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v89 java.lang.Object, still in use, count: 2, list:
          (r2v89 java.lang.Object) from 0x0332: PHI (r2 I:??) = (r2v86 java.lang.Object), (r2v89 java.lang.Object) binds: [B:166:0x0331, B:563:0x0332] A[DONT_GENERATE, DONT_INLINE]
          (r2v89 java.lang.Object) from 0x0326: CHECK_CAST (a.riq0) (r2v89 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
