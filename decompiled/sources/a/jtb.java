package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.notify.CouponNotificationWorker;

/* JADX INFO: loaded from: classes.dex */
public final class jtb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtb(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                jtb jtbVar = new jtb((ktb) obj2, yjeVar, (byte) 0);
                jtbVar.k = obj;
                return jtbVar;
            case 1:
                jtb jtbVar2 = new jtb((qtb) obj2, yjeVar, (byte) 1);
                jtbVar2.k = obj;
                return jtbVar2;
            case 2:
                return new jtb((gmq) this.k, (mfi0) obj2, yjeVar, (byte) 2);
            case 3:
                return new jtb((s1c) this.k, (w0c) obj2, yjeVar, (byte) 3);
            case 4:
                return new jtb((v7c) this.k, (a6c) obj2, yjeVar, (byte) 4);
            case 5:
                return new jtb((ywq0) obj2, yjeVar, (byte) 5);
            case 6:
                jtb jtbVar3 = new jtb((ywq0) obj2, yjeVar, (byte) 6);
                jtbVar3.k = obj;
                return jtbVar3;
            case 7:
                return new jtb((i9c) this.k, (vne) obj2, yjeVar, (byte) 7);
            case 8:
                return new jtb((ygc) this.k, (muy) obj2, yjeVar, (byte) 8);
            case 9:
                return new jtb((ckd) obj2, yjeVar, (byte) 9);
            case 10:
                return new jtb((gkd) this.k, (Runnable) obj2, yjeVar, (byte) 10);
            case 11:
                return new jtb((agd) this.k, (pz40) obj2, yjeVar, (byte) 11);
            case 12:
                return new jtb((svd) this.k, (String) obj2, yjeVar, (byte) 12);
            case 13:
                jtb jtbVar4 = new jtb((svd) obj2, yjeVar, (byte) 13);
                jtbVar4.k = obj;
                return jtbVar4;
            case 14:
                return new jtb((kyd) this.k, (ckk0) obj2, yjeVar, (byte) 14);
            case 15:
                jtb jtbVar5 = new jtb((g1e) obj2, yjeVar, (byte) 15);
                jtbVar5.k = obj;
                return jtbVar5;
            case 16:
                return new jtb((Function2) this.k, (xva0) obj2, yjeVar, (byte) 16);
            case 17:
                return new jtb((Function2) this.k, (yva0) obj2, yjeVar, (byte) 17);
            case 18:
                return new jtb((fae) this.k, (rcl) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                jtb jtbVar6 = new jtb((fae) obj2, yjeVar, (byte) 19);
                jtbVar6.k = obj;
                return jtbVar6;
            case 20:
                return new jtb((fae) this.k, (String) obj2, yjeVar, (byte) 20);
            case 21:
                return new jtb((ibe) this.k, (hbe) obj2, yjeVar, (byte) 21);
            case 22:
                return new jtb((k7q0) this.k, (d39) obj2, yjeVar, (byte) 22);
            case 23:
                return new jtb((hpa0) this.k, (k7q0) obj2, yjeVar, (byte) 23);
            case 24:
                return new jtb((kqe) this.k, (oi90) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new jtb((kqe) this.k, (String) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new jtb((uqe) this.k, (ArrayList) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                jtb jtbVar7 = new jtb((wze) obj2, yjeVar, (byte) 27);
                jtbVar7.k = obj;
                return jtbVar7;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jtb jtbVar8 = new jtb((CouponNotificationWorker) obj2, yjeVar, (byte) 28);
                jtbVar8.k = obj;
                return jtbVar8;
            default:
                return new jtb((g45) this.k, (ArrayList) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jtb) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jtb) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((jtb) create((jkk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((jtb) create((jkk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((jtb) create((skp) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((jtb) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jtb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x0444  */
    /* JADX WARN: Code duplicated, block: B:185:0x0447  */
    /* JADX WARN: Code duplicated, block: B:363:0x0895  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.yje, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v83 java.lang.Object, still in use, count: 2, list:
          (r2v83 java.lang.Object) from 0x0440: PHI (r2 I:??) = (r2v80 java.lang.Object), (r2v83 java.lang.Object) binds: [B:181:0x043f, B:563:0x0440] A[DONT_GENERATE, DONT_INLINE]
          (r2v83 java.lang.Object) from 0x0436: CHECK_CAST (a.rkt) (r2v83 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jtb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtb(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
